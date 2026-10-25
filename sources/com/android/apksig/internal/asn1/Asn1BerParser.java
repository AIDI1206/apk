package com.android.apksig.internal.asn1;

import androidx.collection.SieveCacheKt;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.asn1.ber.BerDataValueFormatException;
import com.android.apksig.internal.asn1.ber.BerDataValueReader;
import com.android.apksig.internal.asn1.ber.BerEncoding;
import com.android.apksig.internal.asn1.ber.ByteBufferBerDataValueReader;
import com.android.apksig.internal.util.ByteBufferUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.zeroturnaround.zip.commons.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Asn1BerParser {
    private Asn1BerParser() {
    }

    public static <T> T parse(ByteBuffer byteBuffer, Class<T> cls) throws Asn1DecodingException {
        try {
            BerDataValue dataValue = new ByteBufferBerDataValueReader(byteBuffer).readDataValue();
            if (dataValue == null) {
                throw new Asn1DecodingException("Empty input");
            }
            return (T) parse(dataValue, cls);
        } catch (BerDataValueFormatException e) {
            throw new Asn1DecodingException("Failed to decode top-level data value", e);
        }
    }

    public static <T> List<T> parseImplicitSetOf(ByteBuffer encoded, Class<T> elementClass) throws Asn1DecodingException {
        try {
            BerDataValue dataValue = new ByteBufferBerDataValueReader(encoded).readDataValue();
            if (dataValue == null) {
                throw new Asn1DecodingException("Empty input");
            }
            return parseSetOf(dataValue, elementClass);
        } catch (BerDataValueFormatException e) {
            throw new Asn1DecodingException("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.asn1.Asn1BerParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;

        static {
            int[] iArr = new int[Asn1Type.values().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Type = iArr;
            try {
                iArr[Asn1Type.CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.UNENCODED_CONTAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SET_OF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SEQUENCE_OF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.OBJECT_IDENTIFIER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static <T> T parse(BerDataValue berDataValue, Class<T> cls) throws Asn1DecodingException {
        if (berDataValue == null) {
            throw new NullPointerException("container == null");
        }
        if (cls == null) {
            throw new NullPointerException("containerClass == null");
        }
        Asn1Type containerAsn1Type = getContainerAsn1Type(cls);
        int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type[containerAsn1Type.ordinal()];
        if (i == 1) {
            return (T) parseChoice(berDataValue, cls);
        }
        if (i != 2) {
            if (i == 3) {
                return (T) parseSequence(berDataValue, cls, true);
            }
            throw new Asn1DecodingException("Parsing container " + containerAsn1Type + " not supported");
        }
        int tagNumber = BerEncoding.getTagNumber(containerAsn1Type);
        if (berDataValue.getTagClass() != 0 || berDataValue.getTagNumber() != tagNumber) {
            throw new Asn1UnexpectedTagException("Unexpected data value read as " + cls.getName() + ". Expected " + BerEncoding.tagClassAndNumberToString(0, tagNumber) + ", but read: " + BerEncoding.tagClassAndNumberToString(berDataValue.getTagClass(), berDataValue.getTagNumber()));
        }
        return (T) parseSequence(berDataValue, cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T parseChoice(BerDataValue dataValue, Class<T> containerClass) throws Asn1DecodingException {
        List<AnnotatedField> annotatedFields = getAnnotatedFields(containerClass);
        if (annotatedFields.isEmpty()) {
            throw new Asn1DecodingException("No fields annotated with " + Asn1Field.class.getName() + " in CHOICE class " + containerClass.getName());
        }
        int i = 0;
        while (i < annotatedFields.size() - 1) {
            AnnotatedField annotatedField = annotatedFields.get(i);
            int berTagNumber = annotatedField.getBerTagNumber();
            int berTagClass = annotatedField.getBerTagClass();
            i++;
            for (int i2 = i; i2 < annotatedFields.size(); i2++) {
                AnnotatedField annotatedField2 = annotatedFields.get(i2);
                int berTagNumber2 = annotatedField2.getBerTagNumber();
                int berTagClass2 = annotatedField2.getBerTagClass();
                if (berTagNumber == berTagNumber2 && berTagClass == berTagClass2) {
                    throw new Asn1DecodingException("CHOICE fields are indistinguishable because they have the same tag class and number: " + containerClass.getName() + "." + annotatedField.getField().getName() + " and ." + annotatedField2.getField().getName());
                }
            }
        }
        try {
            T tNewInstance = containerClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            Iterator<AnnotatedField> it = annotatedFields.iterator();
            while (it.hasNext()) {
                try {
                    it.next().setValueFrom(dataValue, tNewInstance);
                    return tNewInstance;
                } catch (Asn1UnexpectedTagException unused) {
                }
            }
            throw new Asn1DecodingException("No options of CHOICE " + containerClass.getName() + " matched");
        } catch (IllegalArgumentException | ReflectiveOperationException e) {
            throw new Asn1DecodingException("Failed to instantiate " + containerClass.getName(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T parseSequence(BerDataValue berDataValue, Class<T> cls) throws Asn1DecodingException {
        return (T) parseSequence(berDataValue, cls, false);
    }

    private static <T> T parseSequence(BerDataValue container, Class<T> containerClass, boolean isUnencodedContainer) throws Asn1DecodingException {
        BerDataValue dataValue;
        List<AnnotatedField> annotatedFields = getAnnotatedFields(containerClass);
        Collections.sort(annotatedFields, new Comparator() { // from class: com.android.apksig.internal.asn1.Asn1BerParser$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Asn1BerParser.lambda$parseSequence$0((Asn1BerParser.AnnotatedField) obj, (Asn1BerParser.AnnotatedField) obj2);
            }
        });
        if (annotatedFields.size() > 1) {
            AnnotatedField annotatedField = null;
            for (AnnotatedField annotatedField2 : annotatedFields) {
                if (annotatedField != null && annotatedField.getAnnotation().index() == annotatedField2.getAnnotation().index()) {
                    throw new Asn1DecodingException("Fields have the same index: " + containerClass.getName() + "." + annotatedField.getField().getName() + " and ." + annotatedField2.getField().getName());
                }
                annotatedField = annotatedField2;
            }
        }
        int i = 0;
        try {
            T tNewInstance = containerClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            BerDataValueReader berDataValueReaderContentsReader = container.contentsReader();
            while (i < annotatedFields.size()) {
                if (isUnencodedContainer && i == 0) {
                    dataValue = container;
                } else {
                    try {
                        dataValue = berDataValueReaderContentsReader.readDataValue();
                    } catch (BerDataValueFormatException e) {
                        throw new Asn1DecodingException("Malformed data value", e);
                    }
                }
                if (dataValue == null) {
                    break;
                }
                for (int i2 = i; i2 < annotatedFields.size(); i2++) {
                    AnnotatedField annotatedField3 = annotatedFields.get(i2);
                    try {
                        if (annotatedField3.isOptional()) {
                            try {
                                annotatedField3.setValueFrom(dataValue, tNewInstance);
                            } catch (Asn1UnexpectedTagException unused) {
                            }
                        } else {
                            annotatedField3.setValueFrom(dataValue, tNewInstance);
                        }
                        i = i2 + 1;
                        break;
                    } catch (Asn1DecodingException e2) {
                        throw new Asn1DecodingException("Failed to parse " + containerClass.getName() + "." + annotatedField3.getField().getName(), e2);
                    }
                }
            }
            return tNewInstance;
        } catch (IllegalArgumentException | ReflectiveOperationException e3) {
            throw new Asn1DecodingException("Failed to instantiate " + containerClass.getName(), e3);
        }
    }

    static /* synthetic */ int lambda$parseSequence$0(AnnotatedField annotatedField, AnnotatedField annotatedField2) {
        return annotatedField.getAnnotation().index() - annotatedField2.getAnnotation().index();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> List<T> parseSetOf(BerDataValue container, Class<T> elementClass) throws Asn1DecodingException {
        Object asn1OpaqueObject;
        ArrayList arrayList = new ArrayList();
        BerDataValueReader berDataValueReaderContentsReader = container.contentsReader();
        while (true) {
            try {
                BerDataValue dataValue = berDataValueReaderContentsReader.readDataValue();
                if (dataValue == null) {
                    return arrayList;
                }
                if (ByteBuffer.class.equals(elementClass)) {
                    asn1OpaqueObject = dataValue.getEncodedContents();
                } else if (Asn1OpaqueObject.class.equals(elementClass)) {
                    asn1OpaqueObject = new Asn1OpaqueObject(dataValue.getEncoded());
                } else {
                    asn1OpaqueObject = parse(dataValue, elementClass);
                }
                arrayList.add(asn1OpaqueObject);
            } catch (BerDataValueFormatException e) {
                throw new Asn1DecodingException("Malformed data value", e);
            }
        }
    }

    private static Asn1Type getContainerAsn1Type(Class<?> containerClass) throws Asn1DecodingException {
        Asn1Class asn1Class = (Asn1Class) containerClass.getDeclaredAnnotation(Asn1Class.class);
        if (asn1Class == null) {
            throw new Asn1DecodingException(containerClass.getName() + " is not annotated with " + Asn1Class.class.getName());
        }
        int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type[asn1Class.type().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return asn1Class.type();
        }
        throw new Asn1DecodingException("Unsupported ASN.1 container annotation type: " + asn1Class.type());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class<?> getElementType(Field field) throws ClassNotFoundException, Asn1DecodingException {
        String typeName = field.getGenericType().getTypeName();
        int iIndexOf = typeName.indexOf(60);
        if (iIndexOf == -1) {
            throw new Asn1DecodingException("Not a container type: " + field.getGenericType());
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = typeName.indexOf(62, i);
        if (iIndexOf2 == -1) {
            throw new Asn1DecodingException("Not a container type: " + field.getGenericType());
        }
        return Class.forName(typeName.substring(i, iIndexOf2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AnnotatedField {
        private final Asn1Field mAnnotation;
        private final int mBerTagClass;
        private final int mBerTagNumber;
        private final Asn1Type mDataType;
        private final Field mField;
        private final boolean mOptional;
        private final Asn1TagClass mTagClass;
        private final Asn1Tagging mTagging;

        public AnnotatedField(Field field, Asn1Field annotation) throws Asn1DecodingException {
            int tagNumber;
            this.mField = field;
            this.mAnnotation = annotation;
            Asn1Type asn1TypeType = annotation.type();
            this.mDataType = asn1TypeType;
            Asn1TagClass asn1TagClassCls = annotation.cls();
            if (asn1TagClassCls == Asn1TagClass.AUTOMATIC) {
                if (annotation.tagNumber() != -1) {
                    asn1TagClassCls = Asn1TagClass.CONTEXT_SPECIFIC;
                } else {
                    asn1TagClassCls = Asn1TagClass.UNIVERSAL;
                }
            }
            this.mTagClass = asn1TagClassCls;
            this.mBerTagClass = BerEncoding.getTagClass(asn1TagClassCls);
            if (annotation.tagNumber() != -1) {
                tagNumber = annotation.tagNumber();
            } else {
                tagNumber = (asn1TypeType == Asn1Type.CHOICE || asn1TypeType == Asn1Type.ANY) ? -1 : BerEncoding.getTagNumber(asn1TypeType);
            }
            this.mBerTagNumber = tagNumber;
            Asn1Tagging asn1TaggingTagging = annotation.tagging();
            this.mTagging = asn1TaggingTagging;
            if ((asn1TaggingTagging == Asn1Tagging.EXPLICIT || asn1TaggingTagging == Asn1Tagging.IMPLICIT) && annotation.tagNumber() == -1) {
                throw new Asn1DecodingException("Tag number must be specified when tagging mode is " + asn1TaggingTagging);
            }
            this.mOptional = annotation.optional();
        }

        public Field getField() {
            return this.mField;
        }

        public Asn1Field getAnnotation() {
            return this.mAnnotation;
        }

        public boolean isOptional() {
            return this.mOptional;
        }

        public int getBerTagClass() {
            return this.mBerTagClass;
        }

        public int getBerTagNumber() {
            return this.mBerTagNumber;
        }

        public void setValueFrom(BerDataValue dataValue, Object obj) throws Asn1DecodingException {
            int tagClass = dataValue.getTagClass();
            if (this.mBerTagNumber != -1) {
                int tagNumber = dataValue.getTagNumber();
                if (tagClass != this.mBerTagClass || tagNumber != this.mBerTagNumber) {
                    throw new Asn1UnexpectedTagException("Tag mismatch. Expected: " + BerEncoding.tagClassAndNumberToString(this.mBerTagClass, this.mBerTagNumber) + ", but found " + BerEncoding.tagClassAndNumberToString(tagClass, tagNumber));
                }
            } else if (tagClass != this.mBerTagClass) {
                throw new Asn1UnexpectedTagException("Tag mismatch. Expected class: " + BerEncoding.tagClassToString(this.mBerTagClass) + ", but found " + BerEncoding.tagClassToString(tagClass));
            }
            if (this.mTagging == Asn1Tagging.EXPLICIT) {
                try {
                    dataValue = dataValue.contentsReader().readDataValue();
                } catch (BerDataValueFormatException e) {
                    throw new Asn1DecodingException("Failed to read contents of EXPLICIT data value", e);
                }
            }
            BerToJavaConverter.setFieldValue(obj, this.mField, this.mDataType, dataValue);
        }
    }

    private static class Asn1UnexpectedTagException extends Asn1DecodingException {
        private static final long serialVersionUID = 1;

        public Asn1UnexpectedTagException(String message) {
            super(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String oidToString(ByteBuffer encodedOid) throws Asn1DecodingException {
        if (!encodedOid.hasRemaining()) {
            throw new Asn1DecodingException("Empty OBJECT IDENTIFIER");
        }
        long jDecodeBase128UnsignedLong = decodeBase128UnsignedLong(encodedOid);
        int iMin = (int) Math.min(jDecodeBase128UnsignedLong / 40, 2L);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(iMin)).append(FilenameUtils.EXTENSION_SEPARATOR).append(Long.toString(jDecodeBase128UnsignedLong - ((long) (iMin * 40))));
        while (encodedOid.hasRemaining()) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR).append(Long.toString(decodeBase128UnsignedLong(encodedOid)));
        }
        return sb.toString();
    }

    private static long decodeBase128UnsignedLong(ByteBuffer encoded) throws Asn1DecodingException {
        long j = 0;
        if (!encoded.hasRemaining()) {
            return 0L;
        }
        while (encoded.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new Asn1DecodingException("Base-128 number too large");
            }
            byte b = encoded.get();
            j = (j << 7) | ((long) (b & 127));
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new Asn1DecodingException("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger integerToBigInteger(ByteBuffer encoded) {
        if (!encoded.hasRemaining()) {
            return BigInteger.ZERO;
        }
        return new BigInteger(ByteBufferUtils.toByteArray(encoded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int integerToInt(ByteBuffer encoded) throws Asn1DecodingException {
        BigInteger bigIntegerIntegerToBigInteger = integerToBigInteger(encoded);
        if (bigIntegerIntegerToBigInteger.compareTo(BigInteger.valueOf(SieveCacheKt.NodeMetaAndPreviousMask)) < 0 || bigIntegerIntegerToBigInteger.compareTo(BigInteger.valueOf(SieveCacheKt.NodeLinkMask)) > 0) {
            throw new Asn1DecodingException(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerIntegerToBigInteger));
        }
        return bigIntegerIntegerToBigInteger.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long integerToLong(ByteBuffer encoded) throws Asn1DecodingException {
        BigInteger bigIntegerIntegerToBigInteger = integerToBigInteger(encoded);
        if (bigIntegerIntegerToBigInteger.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || bigIntegerIntegerToBigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            throw new Asn1DecodingException(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerIntegerToBigInteger));
        }
        return bigIntegerIntegerToBigInteger.longValue();
    }

    private static List<AnnotatedField> getAnnotatedFields(Class<?> containerClass) throws Asn1DecodingException {
        Field[] declaredFields = containerClass.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            Asn1Field asn1Field = (Asn1Field) field.getDeclaredAnnotation(Asn1Field.class);
            if (asn1Field != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new Asn1DecodingException(Asn1Field.class.getName() + " used on a static field: " + containerClass.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new AnnotatedField(field, asn1Field));
                } catch (Asn1DecodingException e) {
                    throw new Asn1DecodingException("Invalid ASN.1 annotation on " + containerClass.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    private static final class BerToJavaConverter {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

        private BerToJavaConverter() {
        }

        public static void setFieldValue(Object obj, Field field, Asn1Type type, BerDataValue dataValue) throws Asn1DecodingException {
            try {
                int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type[type.ordinal()];
                if (i == 4 || i == 5) {
                    if (!Asn1OpaqueObject.class.equals(field.getType())) {
                        field.set(obj, Asn1BerParser.parseSetOf(dataValue, Asn1BerParser.getElementType(field)));
                        return;
                    } else {
                        field.set(obj, convert(type, dataValue, field.getType()));
                        return;
                    }
                }
                field.set(obj, convert(type, dataValue, field.getType()));
            } catch (ReflectiveOperationException e) {
                throw new Asn1DecodingException("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v25, types: [T, byte[]] */
        public static <T> T convert(Asn1Type asn1Type, BerDataValue berDataValue, Class<T> cls) throws Asn1DecodingException {
            if (ByteBuffer.class.equals(cls)) {
                return (T) berDataValue.getEncodedContents();
            }
            if (byte[].class.equals(cls)) {
                ByteBuffer encodedContents = berDataValue.getEncodedContents();
                if (!encodedContents.hasRemaining()) {
                    return (T) EMPTY_BYTE_ARRAY;
                }
                ?? r5 = (T) new byte[encodedContents.remaining()];
                encodedContents.get((byte[]) r5);
                return r5;
            }
            if (Asn1OpaqueObject.class.equals(cls)) {
                return (T) new Asn1OpaqueObject(berDataValue.getEncoded());
            }
            ByteBuffer encodedContents2 = berDataValue.getEncodedContents();
            int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type[asn1Type.ordinal()];
            if (i == 1) {
                Asn1Class asn1Class = (Asn1Class) cls.getDeclaredAnnotation(Asn1Class.class);
                if (asn1Class != null && asn1Class.type() == Asn1Type.CHOICE) {
                    return (T) Asn1BerParser.parseChoice(berDataValue, cls);
                }
            } else if (i != 2) {
                switch (i) {
                    case 6:
                        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                            return (T) Integer.valueOf(Asn1BerParser.integerToInt(encodedContents2));
                        }
                        if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                            return (T) Long.valueOf(Asn1BerParser.integerToLong(encodedContents2));
                        }
                        if (BigInteger.class.equals(cls)) {
                            return (T) Asn1BerParser.integerToBigInteger(encodedContents2);
                        }
                        break;
                    case 7:
                        if (String.class.equals(cls)) {
                            return (T) Asn1BerParser.oidToString(encodedContents2);
                        }
                        break;
                    case 8:
                    case 9:
                        if (String.class.equals(cls)) {
                            return (T) new String(ByteBufferUtils.toByteArray(encodedContents2));
                        }
                        break;
                    case 10:
                        if (Boolean.TYPE.equals(cls)) {
                            if (encodedContents2.remaining() != 1) {
                                throw new Asn1DecodingException("Incorrect encoded size of boolean value: " + encodedContents2.remaining());
                            }
                            return (T) new Boolean(encodedContents2.get() != 0);
                        }
                        break;
                }
            } else {
                Asn1Class asn1Class2 = (Asn1Class) cls.getDeclaredAnnotation(Asn1Class.class);
                if (asn1Class2 != null && asn1Class2.type() == Asn1Type.SEQUENCE) {
                    return (T) Asn1BerParser.parseSequence(berDataValue, cls);
                }
            }
            throw new Asn1DecodingException("Unsupported conversion: ASN.1 " + asn1Type + " to " + cls.getName());
        }
    }
}
