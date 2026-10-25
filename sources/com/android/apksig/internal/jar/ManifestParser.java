package com.android.apksig.internal.jar;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes;

/* JADX INFO: loaded from: classes3.dex */
public class ManifestParser {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private byte[] mBufferedLine;
    private int mEndOffset;
    private final byte[] mManifest;
    private int mOffset;

    public ManifestParser(byte[] data) {
        this(data, 0, data.length);
    }

    public ManifestParser(byte[] data, int offset, int length) {
        this.mManifest = data;
        this.mOffset = offset;
        this.mEndOffset = offset + length;
    }

    public List<Section> readAllSections() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Section section = readSection();
            if (section == null) {
                return arrayList;
            }
            arrayList.add(section);
        }
    }

    public Section readSection() {
        int i;
        String attribute;
        do {
            i = this.mOffset;
            attribute = readAttribute();
            if (attribute == null) {
                return null;
            }
        } while (attribute.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(parseAttr(attribute));
        while (true) {
            String attribute2 = readAttribute();
            if (attribute2 == null || attribute2.length() == 0) {
                break;
            }
            arrayList.add(parseAttr(attribute2));
        }
        return new Section(i, this.mOffset - i, arrayList);
    }

    private static Attribute parseAttr(String attr) {
        int iIndexOf = attr.indexOf(": ");
        if (iIndexOf == -1) {
            return new Attribute(attr, "");
        }
        return new Attribute(attr.substring(0, iIndexOf), attr.substring(iIndexOf + ": ".length()));
    }

    private String readAttribute() {
        byte[] attributeBytes = readAttributeBytes();
        if (attributeBytes == null) {
            return null;
        }
        if (attributeBytes.length == 0) {
            return "";
        }
        return new String(attributeBytes, StandardCharsets.UTF_8);
    }

    private byte[] readAttributeBytes() {
        byte[] bArr = this.mBufferedLine;
        if (bArr != null && bArr.length == 0) {
            this.mBufferedLine = null;
            return EMPTY_BYTE_ARRAY;
        }
        byte[] line = readLine();
        if (line == null) {
            byte[] bArr2 = this.mBufferedLine;
            if (bArr2 == null) {
                return null;
            }
            this.mBufferedLine = null;
            return bArr2;
        }
        if (line.length == 0) {
            byte[] bArr3 = this.mBufferedLine;
            if (bArr3 != null) {
                this.mBufferedLine = EMPTY_BYTE_ARRAY;
                return bArr3;
            }
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr4 = this.mBufferedLine;
        if (bArr4 != null) {
            if (line.length == 0 || line[0] != 32) {
                this.mBufferedLine = line;
                return bArr4;
            }
            this.mBufferedLine = null;
            line = concat(bArr4, line, 1, line.length - 1);
        }
        while (true) {
            byte[] line2 = readLine();
            if (line2 == null) {
                return line;
            }
            if (line2.length == 0) {
                this.mBufferedLine = EMPTY_BYTE_ARRAY;
                return line;
            }
            if (line2[0] == 32) {
                line = concat(line, line2, 1, line2.length - 1);
            } else {
                this.mBufferedLine = line2;
                return line;
            }
        }
    }

    private static byte[] concat(byte[] arr1, byte[] arr2, int offset2, int length2) {
        byte[] bArr = new byte[arr1.length + length2];
        System.arraycopy(arr1, 0, bArr, 0, arr1.length);
        System.arraycopy(arr2, offset2, bArr, arr1.length, length2);
        return bArr;
    }

    private byte[] readLine() {
        int i;
        int i2;
        int i3 = this.mOffset;
        if (i3 >= this.mEndOffset) {
            return null;
        }
        int i4 = i3;
        while (true) {
            i = this.mEndOffset;
            if (i4 >= i) {
                i4 = -1;
                i2 = -1;
                break;
            }
            byte[] bArr = this.mManifest;
            byte b = bArr[i4];
            if (b == 13) {
                i2 = i4 + 1;
                if (i2 >= i || bArr[i2] != 10) {
                    break;
                    break;
                }
                i2 = i4 + 2;
                break;
            }
            if (b == 10) {
                i2 = i4 + 1;
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = i;
        } else {
            i = i2;
        }
        this.mOffset = i;
        if (i4 == i3) {
            return EMPTY_BYTE_ARRAY;
        }
        return Arrays.copyOfRange(this.mManifest, i3, i4);
    }

    public static class Attribute {
        private final String mName;
        private final String mValue;

        public Attribute(String name, String value) {
            this.mName = name;
            this.mValue = value;
        }

        public String getName() {
            return this.mName;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    public static class Section {
        private final List<Attribute> mAttributes;
        private final String mName;
        private final int mSizeBytes;
        private final int mStartOffset;

        /* JADX WARN: Code duplicated, block: B:7:0x0025  */
        public Section(int startOffset, int sizeBytes, List<Attribute> attrs) {
            String value;
            this.mStartOffset = startOffset;
            this.mSizeBytes = sizeBytes;
            if (attrs.isEmpty()) {
                value = null;
            } else {
                Attribute attribute = attrs.get(0);
                if ("Name".equalsIgnoreCase(attribute.getName())) {
                    value = attribute.getValue();
                } else {
                    value = null;
                }
            }
            this.mName = value;
            this.mAttributes = Collections.unmodifiableList(new ArrayList(attrs));
        }

        public String getName() {
            return this.mName;
        }

        public int getStartOffset() {
            return this.mStartOffset;
        }

        public int getSizeBytes() {
            return this.mSizeBytes;
        }

        public List<Attribute> getAttributes() {
            return this.mAttributes;
        }

        public String getAttributeValue(Attributes.Name name) {
            return getAttributeValue(name.toString());
        }

        public String getAttributeValue(String name) {
            for (Attribute attribute : this.mAttributes) {
                if (attribute.getName().equalsIgnoreCase(name)) {
                    return attribute.getValue();
                }
            }
            return null;
        }
    }
}
