package com.android.apksig.internal.asn1;

import com.android.apksig.internal.asn1.ber.BerEncoding;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Asn1DerEncoder {
    public static final Asn1OpaqueObject ASN1_DER_NULL = new Asn1OpaqueObject(new byte[]{5, 0});

    private Asn1DerEncoder() {
    }

    public static byte[] encode(Object container) throws Asn1EncodingException {
        Class<?> cls = container.getClass();
        Asn1Class asn1Class = (Asn1Class) cls.getDeclaredAnnotation(Asn1Class.class);
        if (asn1Class == null) {
            throw new Asn1EncodingException(cls.getName() + " not annotated with " + Asn1Class.class.getName());
        }
        Asn1Type asn1TypeType = asn1Class.type();
        int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type[asn1TypeType.ordinal()];
        if (i == 1) {
            return toChoice(container);
        }
        if (i == 2) {
            return toSequence(container);
        }
        if (i == 3) {
            return toSequence(container, true);
        }
        throw new Asn1EncodingException("Unsupported container type: " + asn1TypeType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toChoice(Object container) throws Asn1EncodingException {
        Class<?> cls = container.getClass();
        List<AnnotatedField> annotatedFields = getAnnotatedFields(container);
        if (annotatedFields.isEmpty()) {
            throw new Asn1EncodingException("No fields annotated with " + Asn1Field.class.getName() + " in CHOICE class " + cls.getName());
        }
        AnnotatedField annotatedField = null;
        for (AnnotatedField annotatedField2 : annotatedFields) {
            if (getMemberFieldValue(container, annotatedField2.getField()) != null) {
                if (annotatedField != null) {
                    throw new Asn1EncodingException("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + annotatedField.getField().getName() + ", " + annotatedField2.getField().getName());
                }
                annotatedField = annotatedField2;
            }
        }
        if (annotatedField == null) {
            throw new Asn1EncodingException("No non-null fields in CHOICE class " + cls.getName());
        }
        return annotatedField.toDer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toSequence(Object container) throws Asn1EncodingException {
        return toSequence(container, false);
    }

    private static byte[] toSequence(Object container, boolean omitTag) throws Asn1EncodingException {
        Class<?> cls = container.getClass();
        List<AnnotatedField> annotatedFields = getAnnotatedFields(container);
        Collections.sort(annotatedFields, new Comparator() { // from class: com.android.apksig.internal.asn1.Asn1DerEncoder$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Asn1DerEncoder.lambda$toSequence$0((Asn1DerEncoder.AnnotatedField) obj, (Asn1DerEncoder.AnnotatedField) obj2);
            }
        });
        if (annotatedFields.size() > 1) {
            AnnotatedField annotatedField = null;
            for (AnnotatedField annotatedField2 : annotatedFields) {
                if (annotatedField != null && annotatedField.getAnnotation().index() == annotatedField2.getAnnotation().index()) {
                    throw new Asn1EncodingException("Fields have the same index: " + cls.getName() + "." + annotatedField.getField().getName() + " and ." + annotatedField2.getField().getName());
                }
                annotatedField = annotatedField2;
            }
        }
        ArrayList<byte[]> arrayList = new ArrayList(annotatedFields.size());
        int length = 0;
        for (AnnotatedField annotatedField3 : annotatedFields) {
            try {
                byte[] der = annotatedField3.toDer();
                if (der != null) {
                    arrayList.add(der);
                    length += der.length;
                }
            } catch (Asn1EncodingException e) {
                throw new Asn1EncodingException("Failed to encode " + cls.getName() + "." + annotatedField3.getField().getName(), e);
            }
        }
        if (omitTag) {
            byte[] bArr = new byte[length];
            int length2 = 0;
            for (byte[] bArr2 : arrayList) {
                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
            }
            return bArr;
        }
        return createTag(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    static /* synthetic */ int lambda$toSequence$0(AnnotatedField annotatedField, AnnotatedField annotatedField2) {
        return annotatedField.getAnnotation().index() - annotatedField2.getAnnotation().index();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toSetOf(Collection<?> values, Asn1Type elementType) throws Asn1EncodingException {
        return toSequenceOrSetOf(values, elementType, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toSequenceOf(Collection<?> values, Asn1Type elementType) throws Asn1EncodingException {
        return toSequenceOrSetOf(values, elementType, false);
    }

    private static byte[] toSequenceOrSetOf(Collection<?> values, Asn1Type elementType, boolean toSet) throws Asn1EncodingException {
        int i;
        ArrayList arrayList = new ArrayList(values.size());
        Iterator<?> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(JavaToDerConverter.toDer(it.next(), elementType, null));
        }
        if (toSet) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, ByteArrayLexicographicComparator.INSTANCE);
            }
            i = 17;
        } else {
            i = 16;
        }
        return createTag(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static class ByteArrayLexicographicComparator implements Comparator<byte[]> {
        private static final ByteArrayLexicographicComparator INSTANCE = new ByteArrayLexicographicComparator();

        private ByteArrayLexicographicComparator() {
        }

        @Override // java.util.Comparator
        public int compare(byte[] arr1, byte[] arr2) {
            int iMin = Math.min(arr1.length, arr2.length);
            for (int i = 0; i < iMin; i++) {
                int i2 = (arr1[i] & 255) - (arr2[i] & 255);
                if (i2 != 0) {
                    return i2;
                }
            }
            return arr1.length - arr2.length;
        }
    }

    private static List<AnnotatedField> getAnnotatedFields(Object container) throws Asn1EncodingException {
        Class<?> cls = container.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            Asn1Field asn1Field = (Asn1Field) field.getDeclaredAnnotation(Asn1Field.class);
            if (asn1Field != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new Asn1EncodingException(Asn1Field.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new AnnotatedField(container, field, asn1Field));
                } catch (Asn1EncodingException e) {
                    throw new Asn1EncodingException("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toInteger(int value) {
        return toInteger(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toInteger(long value) {
        return toInteger(BigInteger.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toInteger(BigInteger value) {
        return createTag(0, false, 2, value.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toBoolean(boolean value) {
        byte[] bArr = new byte[1];
        if (!value) {
            bArr[0] = 0;
        } else {
            bArr[0] = 1;
        }
        return createTag(0, false, 1, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toOid(String oid) throws Asn1EncodingException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] strArrSplit = oid.split("\\.");
        if (strArrSplit.length < 2) {
            throw new Asn1EncodingException("OBJECT IDENTIFIER must contain at least two nodes: " + oid);
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            if (i > 6 || i < 0) {
                throw new Asn1EncodingException("Invalid value for node #1: " + i);
            }
            try {
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i2 >= 40 || i2 < 0) {
                    throw new Asn1EncodingException("Invalid value for node #2: " + i2);
                }
                int i3 = (i * 40) + i2;
                if (i3 > 255) {
                    throw new Asn1EncodingException("First two nodes out of range: " + i + "." + i2);
                }
                byteArrayOutputStream.write(i3);
                for (int i4 = 2; i4 < strArrSplit.length; i4++) {
                    String str = strArrSplit[i4];
                    try {
                        int i5 = Integer.parseInt(str);
                        if (i5 < 0) {
                            throw new Asn1EncodingException("Invalid value for node #" + (i4 + 1) + ": " + i5);
                        }
                        if (i5 <= 127) {
                            byteArrayOutputStream.write(i5);
                        } else if (i5 < 16384) {
                            byteArrayOutputStream.write((i5 >> 7) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        } else if (i5 < 2097152) {
                            byteArrayOutputStream.write((i5 >> 14) | 128);
                            byteArrayOutputStream.write((127 & (i5 >> 7)) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        } else {
                            throw new Asn1EncodingException("Node #" + (i4 + 1) + " too large: " + i5);
                        }
                    } catch (NumberFormatException unused) {
                        throw new Asn1EncodingException("Node #" + (i4 + 1) + " not numeric: " + str);
                    }
                }
                return createTag(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new Asn1EncodingException("Node #2 not numeric: " + strArrSplit[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new Asn1EncodingException("Node #1 not numeric: " + strArrSplit[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getMemberFieldValue(Object obj, Field field) throws Asn1EncodingException {
        try {
            return field.get(obj);
        } catch (ReflectiveOperationException e) {
            throw new Asn1EncodingException("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AnnotatedField {
        private final Asn1Field mAnnotation;
        private final Asn1Type mDataType;
        private final int mDerTagClass;
        private final int mDerTagNumber;
        private final Asn1Type mElementDataType;
        private final Field mField;
        private final Object mObject;
        private final boolean mOptional;
        private final Asn1TagClass mTagClass;
        private final Asn1Tagging mTagging;

        public AnnotatedField(Object obj, Field field, Asn1Field annotation) throws Asn1EncodingException {
            int tagNumber;
            this.mObject = obj;
            this.mField = field;
            this.mAnnotation = annotation;
            Asn1Type asn1TypeType = annotation.type();
            this.mDataType = asn1TypeType;
            this.mElementDataType = annotation.elementType();
            Asn1TagClass asn1TagClassCls = annotation.cls();
            if (asn1TagClassCls == Asn1TagClass.AUTOMATIC) {
                if (annotation.tagNumber() != -1) {
                    asn1TagClassCls = Asn1TagClass.CONTEXT_SPECIFIC;
                } else {
                    asn1TagClassCls = Asn1TagClass.UNIVERSAL;
                }
            }
            this.mTagClass = asn1TagClassCls;
            this.mDerTagClass = BerEncoding.getTagClass(asn1TagClassCls);
            if (annotation.tagNumber() != -1) {
                tagNumber = annotation.tagNumber();
            } else {
                tagNumber = (asn1TypeType == Asn1Type.CHOICE || asn1TypeType == Asn1Type.ANY) ? -1 : BerEncoding.getTagNumber(asn1TypeType);
            }
            this.mDerTagNumber = tagNumber;
            Asn1Tagging asn1TaggingTagging = annotation.tagging();
            this.mTagging = asn1TaggingTagging;
            if ((asn1TaggingTagging == Asn1Tagging.EXPLICIT || asn1TaggingTagging == Asn1Tagging.IMPLICIT) && annotation.tagNumber() == -1) {
                throw new Asn1EncodingException("Tag number must be specified when tagging mode is " + asn1TaggingTagging);
            }
            this.mOptional = annotation.optional();
        }

        public Field getField() {
            return this.mField;
        }

        public Asn1Field getAnnotation() {
            return this.mAnnotation;
        }

        public byte[] toDer() throws Asn1EncodingException {
            Object memberFieldValue = Asn1DerEncoder.getMemberFieldValue(this.mObject, this.mField);
            if (memberFieldValue == null) {
                if (this.mOptional) {
                    return null;
                }
                throw new Asn1EncodingException("Required field not set");
            }
            byte[] der = JavaToDerConverter.toDer(memberFieldValue, this.mDataType, this.mElementDataType);
            int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging[this.mTagging.ordinal()];
            if (i == 1) {
                return der;
            }
            if (i == 2) {
                return Asn1DerEncoder.createTag(this.mDerTagClass, true, this.mDerTagNumber, der);
            }
            if (i == 3) {
                if (BerEncoding.getTagNumber(der[0]) == 31) {
                    throw new Asn1EncodingException("High-tag-number form not supported");
                }
                int i2 = this.mDerTagNumber;
                if (i2 >= 31) {
                    throw new Asn1EncodingException("Unsupported high tag number: " + this.mDerTagNumber);
                }
                byte tagNumber = BerEncoding.setTagNumber(der[0], i2);
                der[0] = tagNumber;
                der[0] = BerEncoding.setTagClass(tagNumber, this.mDerTagClass);
                return der;
            }
            throw new RuntimeException("Unknown tagging mode: " + this.mTagging);
        }
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.asn1.Asn1DerEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging;
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;

        static {
            int[] iArr = new int[Asn1Tagging.values().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging = iArr;
            try {
                iArr[Asn1Tagging.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging[Asn1Tagging.EXPLICIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging[Asn1Tagging.IMPLICIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Asn1Type.values().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Type = iArr2;
            try {
                iArr2[Asn1Type.CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.UNENCODED_CONTAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.OCTET_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.BIT_STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.BOOLEAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.OBJECT_IDENTIFIER.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SET_OF.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SEQUENCE_OF.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] createTag(int tagClass, boolean constructed, int tagNumber, byte[]... contents) {
        byte[] bArr;
        if (tagNumber >= 31) {
            throw new IllegalArgumentException("High tag numbers not supported: " + tagNumber);
        }
        int i = 6;
        byte b = (byte) ((tagClass << 6) | (constructed ? 32 : 0) | tagNumber);
        int length = 0;
        for (byte[] bArr2 : contents) {
            length += bArr2.length;
        }
        int length2 = 2;
        if (length < 128) {
            bArr = new byte[length + 2];
            bArr[0] = b;
            bArr[1] = (byte) length;
        } else {
            if (length <= 255) {
                byte[] bArr3 = new byte[length + 3];
                bArr3[1] = -127;
                bArr3[2] = (byte) length;
                i = 3;
                bArr = bArr3;
            } else if (length <= 65535) {
                byte[] bArr4 = new byte[length + 4];
                bArr4[1] = -126;
                bArr4[2] = (byte) (length >> 8);
                bArr4[3] = (byte) (length & 255);
                bArr = bArr4;
                i = 4;
            } else if (length <= 16777215) {
                byte[] bArr5 = new byte[length + 5];
                bArr5[1] = -125;
                bArr5[2] = (byte) (length >> 16);
                bArr5[3] = (byte) ((length >> 8) & 255);
                bArr5[4] = (byte) (length & 255);
                bArr = bArr5;
                i = 5;
            } else {
                byte[] bArr6 = new byte[length + 6];
                bArr6[1] = -124;
                bArr6[2] = (byte) (length >> 24);
                bArr6[3] = (byte) ((length >> 16) & 255);
                bArr6[4] = (byte) ((length >> 8) & 255);
                bArr6[5] = (byte) (length & 255);
                bArr = bArr6;
            }
            bArr[0] = b;
            length2 = i;
        }
        for (byte[] bArr7 : contents) {
            System.arraycopy(bArr7, 0, bArr, length2, bArr7.length);
            length2 += bArr7.length;
        }
        return bArr;
    }

    private static final class JavaToDerConverter {
        private JavaToDerConverter() {
        }

        public static byte[] toDer(Object source, Asn1Type targetType, Asn1Type targetElementType) throws Asn1EncodingException {
            byte[] bArr;
            Class<?> cls = source.getClass();
            if (Asn1OpaqueObject.class.equals(cls)) {
                ByteBuffer encoded = ((Asn1OpaqueObject) source).getEncoded();
                byte[] bArr2 = new byte[encoded.remaining()];
                encoded.get(bArr2);
                return bArr2;
            }
            if (targetType == null || targetType == Asn1Type.ANY) {
                return Asn1DerEncoder.encode(source);
            }
            switch (AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type[targetType.ordinal()]) {
                case 1:
                    Asn1Class asn1Class = (Asn1Class) cls.getDeclaredAnnotation(Asn1Class.class);
                    if (asn1Class != null && asn1Class.type() == Asn1Type.CHOICE) {
                        return Asn1DerEncoder.toChoice(source);
                    }
                    break;
                case 2:
                    Asn1Class asn1Class2 = (Asn1Class) cls.getDeclaredAnnotation(Asn1Class.class);
                    if (asn1Class2 != null && asn1Class2.type() == Asn1Type.SEQUENCE) {
                        return Asn1DerEncoder.toSequence(source);
                    }
                    break;
                case 4:
                case 5:
                    if (source instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) source;
                        bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.slice().get(bArr);
                    } else {
                        bArr = source instanceof byte[] ? (byte[]) source : null;
                    }
                    if (bArr != null) {
                        return Asn1DerEncoder.createTag(0, false, BerEncoding.getTagNumber(targetType), bArr);
                    }
                    break;
                case 6:
                    if (source instanceof Integer) {
                        return Asn1DerEncoder.toInteger(((Integer) source).intValue());
                    }
                    if (source instanceof Long) {
                        return Asn1DerEncoder.toInteger(((Long) source).longValue());
                    }
                    if (source instanceof BigInteger) {
                        return Asn1DerEncoder.toInteger((BigInteger) source);
                    }
                    break;
                case 7:
                    if (source instanceof Boolean) {
                        return Asn1DerEncoder.toBoolean(((Boolean) source).booleanValue());
                    }
                    break;
                case 8:
                case 9:
                    if (source instanceof String) {
                        return Asn1DerEncoder.createTag(0, false, BerEncoding.getTagNumber(targetType), ((String) source).getBytes());
                    }
                    break;
                case 10:
                    if (source instanceof String) {
                        return Asn1DerEncoder.toOid((String) source);
                    }
                    break;
                case 11:
                    return Asn1DerEncoder.toSetOf((Collection) source, targetElementType);
                case 12:
                    return Asn1DerEncoder.toSequenceOf((Collection) source, targetElementType);
            }
            throw new Asn1EncodingException("Unsupported conversion: " + cls.getName() + " to ASN.1 " + targetType);
        }
    }
}
