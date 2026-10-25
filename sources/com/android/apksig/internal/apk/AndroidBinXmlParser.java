package com.android.apksig.internal.apk;

import androidx.collection.SieveCacheKt;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.UShort;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidBinXmlParser {
    public static final int EVENT_END_DOCUMENT = 2;
    public static final int EVENT_END_ELEMENT = 4;
    public static final int EVENT_START_DOCUMENT = 1;
    public static final int EVENT_START_ELEMENT = 3;
    private static final long NO_NAMESPACE = 4294967295L;
    public static final int VALUE_TYPE_BOOLEAN = 4;
    public static final int VALUE_TYPE_INT = 2;
    public static final int VALUE_TYPE_REFERENCE = 3;
    public static final int VALUE_TYPE_STRING = 1;
    public static final int VALUE_TYPE_UNSUPPORTED = 0;
    private int mCurrentElementAttrSizeBytes;
    private int mCurrentElementAttributeCount;
    private List<Attribute> mCurrentElementAttributes;
    private ByteBuffer mCurrentElementAttributesContents;
    private String mCurrentElementName;
    private String mCurrentElementNamespace;
    private int mCurrentEvent = 1;
    private int mDepth;
    private ResourceMap mResourceMap;
    private StringPool mStringPool;
    private final ByteBuffer mXml;

    public AndroidBinXmlParser(ByteBuffer xml) throws XmlParserException {
        Chunk chunk;
        xml.order(ByteOrder.LITTLE_ENDIAN);
        do {
            if (!xml.hasRemaining() || (chunk = Chunk.get(xml)) == null) {
                chunk = null;
                break;
            }
        } while (chunk.getType() != 3);
        if (chunk == null) {
            throw new XmlParserException("No XML chunk in file");
        }
        this.mXml = chunk.getContents();
    }

    public int getDepth() {
        return this.mDepth;
    }

    public int getEventType() {
        return this.mCurrentEvent;
    }

    public String getName() {
        int i = this.mCurrentEvent;
        if (i == 3 || i == 4) {
            return this.mCurrentElementName;
        }
        return null;
    }

    public String getNamespace() {
        int i = this.mCurrentEvent;
        if (i == 3 || i == 4) {
            return this.mCurrentElementNamespace;
        }
        return null;
    }

    public int getAttributeCount() {
        if (this.mCurrentEvent != 3) {
            return -1;
        }
        return this.mCurrentElementAttributeCount;
    }

    public int getAttributeNameResourceId(int index) throws XmlParserException {
        return getAttribute(index).getNameResourceId();
    }

    public String getAttributeName(int index) throws XmlParserException {
        return getAttribute(index).getName();
    }

    public String getAttributeNamespace(int index) throws XmlParserException {
        return getAttribute(index).getNamespace();
    }

    public int getAttributeValueType(int index) throws XmlParserException {
        int valueType = getAttribute(index).getValueType();
        if (valueType == 1) {
            return 3;
        }
        if (valueType == 3) {
            return 1;
        }
        switch (valueType) {
            case 16:
            case 17:
                return 2;
            case 18:
                return 4;
            default:
                return 0;
        }
    }

    public int getAttributeIntValue(int index) throws XmlParserException {
        return getAttribute(index).getIntValue();
    }

    public boolean getAttributeBooleanValue(int index) throws XmlParserException {
        return getAttribute(index).getBooleanValue();
    }

    public String getAttributeStringValue(int index) throws XmlParserException {
        return getAttribute(index).getStringValue();
    }

    private Attribute getAttribute(int index) {
        if (this.mCurrentEvent != 3) {
            throw new IndexOutOfBoundsException("Current event not a START_ELEMENT");
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (index >= this.mCurrentElementAttributeCount) {
            throw new IndexOutOfBoundsException("index must be <= attr count (" + this.mCurrentElementAttributeCount + ")");
        }
        parseCurrentElementAttributesIfNotParsed();
        return this.mCurrentElementAttributes.get(index);
    }

    public int next() throws XmlParserException {
        Chunk chunk;
        int i = 1;
        if (this.mCurrentEvent == 4) {
            this.mDepth--;
        }
        while (this.mXml.hasRemaining() && (chunk = Chunk.get(this.mXml)) != null) {
            int type = chunk.getType();
            if (type != i) {
                if (type != 384) {
                    if (type == 258) {
                        if (this.mStringPool == null) {
                            throw new XmlParserException("Named element encountered before string pool");
                        }
                        ByteBuffer contents = chunk.getContents();
                        if (contents.remaining() < 20) {
                            throw new XmlParserException("Start element chunk too short. Need at least 20 bytes. Available: " + contents.remaining() + " bytes");
                        }
                        long unsignedInt32 = getUnsignedInt32(contents);
                        long unsignedInt33 = getUnsignedInt32(contents);
                        int unsignedInt16 = getUnsignedInt16(contents);
                        int unsignedInt17 = getUnsignedInt16(contents);
                        int unsignedInt18 = getUnsignedInt16(contents);
                        long j = unsignedInt16;
                        long j2 = (((long) unsignedInt18) * ((long) unsignedInt17)) + j;
                        contents.position(0);
                        if (unsignedInt16 > contents.remaining()) {
                            throw new XmlParserException("Attributes start offset out of bounds: " + unsignedInt16 + ", max: " + contents.remaining());
                        }
                        if (j2 > contents.remaining()) {
                            throw new XmlParserException("Attributes end offset out of bounds: " + j2 + ", max: " + contents.remaining());
                        }
                        this.mCurrentElementName = this.mStringPool.getString(unsignedInt33);
                        this.mCurrentElementNamespace = unsignedInt32 != NO_NAMESPACE ? this.mStringPool.getString(unsignedInt32) : "";
                        this.mCurrentElementAttributeCount = unsignedInt18;
                        this.mCurrentElementAttributes = null;
                        this.mCurrentElementAttrSizeBytes = unsignedInt17;
                        this.mCurrentElementAttributesContents = sliceFromTo(contents, j, j2);
                        this.mDepth++;
                        this.mCurrentEvent = 3;
                        return 3;
                    }
                    if (type == 259) {
                        if (this.mStringPool == null) {
                            throw new XmlParserException("Named element encountered before string pool");
                        }
                        ByteBuffer contents2 = chunk.getContents();
                        if (contents2.remaining() < 8) {
                            throw new XmlParserException("End element chunk too short. Need at least 8 bytes. Available: " + contents2.remaining() + " bytes");
                        }
                        long unsignedInt34 = getUnsignedInt32(contents2);
                        this.mCurrentElementName = this.mStringPool.getString(getUnsignedInt32(contents2));
                        this.mCurrentElementNamespace = unsignedInt34 != NO_NAMESPACE ? this.mStringPool.getString(unsignedInt34) : "";
                        this.mCurrentEvent = 4;
                        this.mCurrentElementAttributes = null;
                        this.mCurrentElementAttributesContents = null;
                        return 4;
                    }
                } else {
                    if (this.mResourceMap != null) {
                        throw new XmlParserException("Multiple resource maps not supported");
                    }
                    this.mResourceMap = new ResourceMap(chunk);
                }
            } else {
                if (this.mStringPool != null) {
                    throw new XmlParserException("Multiple string pools not supported");
                }
                this.mStringPool = new StringPool(chunk);
            }
            i = i;
        }
        this.mCurrentEvent = 2;
        return 2;
    }

    private void parseCurrentElementAttributesIfNotParsed() {
        if (this.mCurrentElementAttributes != null) {
            return;
        }
        this.mCurrentElementAttributes = new ArrayList(this.mCurrentElementAttributeCount);
        for (int i = 0; i < this.mCurrentElementAttributeCount; i++) {
            int i2 = this.mCurrentElementAttrSizeBytes;
            int i3 = i * i2;
            ByteBuffer byteBufferSliceFromTo = sliceFromTo(this.mCurrentElementAttributesContents, i3, i2 + i3);
            long unsignedInt32 = getUnsignedInt32(byteBufferSliceFromTo);
            long unsignedInt33 = getUnsignedInt32(byteBufferSliceFromTo);
            byteBufferSliceFromTo.position(byteBufferSliceFromTo.position() + 7);
            this.mCurrentElementAttributes.add(new Attribute(unsignedInt32, unsignedInt33, getUnsignedInt8(byteBufferSliceFromTo), (int) getUnsignedInt32(byteBufferSliceFromTo), this.mStringPool, this.mResourceMap));
        }
    }

    private static class Attribute {
        private static final int TYPE_INT_BOOLEAN = 18;
        private static final int TYPE_INT_DEC = 16;
        private static final int TYPE_INT_HEX = 17;
        private static final int TYPE_REFERENCE = 1;
        private static final int TYPE_STRING = 3;
        private final long mNameId;
        private final long mNsId;
        private final ResourceMap mResourceMap;
        private final StringPool mStringPool;
        private final int mValueData;
        private final int mValueType;

        private Attribute(long nsId, long nameId, int valueType, int valueData, StringPool stringPool, ResourceMap resourceMap) {
            this.mNsId = nsId;
            this.mNameId = nameId;
            this.mValueType = valueType;
            this.mValueData = valueData;
            this.mStringPool = stringPool;
            this.mResourceMap = resourceMap;
        }

        public int getNameResourceId() {
            ResourceMap resourceMap = this.mResourceMap;
            if (resourceMap != null) {
                return resourceMap.getResourceId(this.mNameId);
            }
            return 0;
        }

        public String getName() throws XmlParserException {
            return this.mStringPool.getString(this.mNameId);
        }

        public String getNamespace() throws XmlParserException {
            long j = this.mNsId;
            return j != AndroidBinXmlParser.NO_NAMESPACE ? this.mStringPool.getString(j) : "";
        }

        public int getValueType() {
            return this.mValueType;
        }

        public int getIntValue() throws XmlParserException {
            int i = this.mValueType;
            if (i != 1) {
                switch (i) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        throw new XmlParserException("Cannot coerce to int: value type " + this.mValueType);
                }
            }
            return this.mValueData;
        }

        public boolean getBooleanValue() throws XmlParserException {
            if (this.mValueType == 18) {
                return this.mValueData != 0;
            }
            throw new XmlParserException("Cannot coerce to boolean: value type " + this.mValueType);
        }

        public String getStringValue() throws XmlParserException {
            int i = this.mValueType;
            if (i == 1) {
                return "@" + Integer.toHexString(this.mValueData);
            }
            if (i == 3) {
                return this.mStringPool.getString(((long) this.mValueData) & AndroidBinXmlParser.NO_NAMESPACE);
            }
            switch (i) {
                case 16:
                    return Integer.toString(this.mValueData);
                case 17:
                    return "0x" + Integer.toHexString(this.mValueData);
                case 18:
                    return Boolean.toString(this.mValueData != 0);
                default:
                    throw new XmlParserException("Cannot coerce to string: value type " + this.mValueType);
            }
        }
    }

    private static class Chunk {
        static final int HEADER_MIN_SIZE_BYTES = 8;
        public static final int RES_XML_TYPE_END_ELEMENT = 259;
        public static final int RES_XML_TYPE_RESOURCE_MAP = 384;
        public static final int RES_XML_TYPE_START_ELEMENT = 258;
        public static final int TYPE_RES_XML = 3;
        public static final int TYPE_STRING_POOL = 1;
        private final ByteBuffer mContents;
        private final ByteBuffer mHeader;
        private final int mType;

        public Chunk(int type, ByteBuffer header, ByteBuffer contents) {
            this.mType = type;
            this.mHeader = header;
            this.mContents = contents;
        }

        public ByteBuffer getContents() {
            ByteBuffer byteBufferSlice = this.mContents.slice();
            byteBufferSlice.order(this.mContents.order());
            return byteBufferSlice;
        }

        public ByteBuffer getHeader() {
            ByteBuffer byteBufferSlice = this.mHeader.slice();
            byteBufferSlice.order(this.mHeader.order());
            return byteBufferSlice;
        }

        public int getType() {
            return this.mType;
        }

        public static Chunk get(ByteBuffer input) throws XmlParserException {
            if (input.remaining() < 8) {
                input.position(input.limit());
                return null;
            }
            int iPosition = input.position();
            int unsignedInt16 = AndroidBinXmlParser.getUnsignedInt16(input);
            int unsignedInt17 = AndroidBinXmlParser.getUnsignedInt16(input);
            long unsignedInt32 = AndroidBinXmlParser.getUnsignedInt32(input);
            if (unsignedInt32 - 8 > input.remaining()) {
                input.position(input.limit());
                return null;
            }
            if (unsignedInt17 < 8) {
                throw new XmlParserException("Malformed chunk: header too short: " + unsignedInt17 + " bytes");
            }
            if (unsignedInt17 > unsignedInt32) {
                throw new XmlParserException("Malformed chunk: header too long: " + unsignedInt17 + " bytes. Chunk size: " + unsignedInt32 + " bytes");
            }
            int i = unsignedInt17 + iPosition;
            long j = ((long) iPosition) + unsignedInt32;
            Chunk chunk = new Chunk(unsignedInt16, AndroidBinXmlParser.sliceFromTo(input, iPosition, i), AndroidBinXmlParser.sliceFromTo(input, i, j));
            input.position((int) j);
            return chunk;
        }
    }

    private static class StringPool {
        private static final int FLAG_UTF8 = 256;
        private final Map<Integer, String> mCachedStrings = new HashMap();
        private final ByteBuffer mChunkContents;
        private final int mStringCount;
        private final ByteBuffer mStringsSection;
        private final boolean mUtf8Encoded;

        public StringPool(Chunk chunk) throws XmlParserException {
            long j;
            int iRemaining;
            ByteBuffer header = chunk.getHeader();
            int iRemaining2 = header.remaining();
            header.position(8);
            if (header.remaining() >= 20) {
                long unsignedInt32 = AndroidBinXmlParser.getUnsignedInt32(header);
                if (unsignedInt32 > SieveCacheKt.NodeLinkMask) {
                    throw new XmlParserException("Too many strings: " + unsignedInt32);
                }
                int i = (int) unsignedInt32;
                this.mStringCount = i;
                long unsignedInt33 = AndroidBinXmlParser.getUnsignedInt32(header);
                if (unsignedInt33 <= SieveCacheKt.NodeLinkMask) {
                    long unsignedInt34 = AndroidBinXmlParser.getUnsignedInt32(header);
                    long unsignedInt35 = AndroidBinXmlParser.getUnsignedInt32(header);
                    long unsignedInt36 = AndroidBinXmlParser.getUnsignedInt32(header);
                    ByteBuffer contents = chunk.getContents();
                    if (i > 0) {
                        long j2 = iRemaining2;
                        j = 0;
                        int i2 = (int) (unsignedInt35 - j2);
                        if (unsignedInt33 <= 0) {
                            iRemaining = contents.remaining();
                        } else {
                            if (unsignedInt36 < unsignedInt35) {
                                throw new XmlParserException("Styles offset (" + unsignedInt36 + ") < strings offset (" + unsignedInt35 + ")");
                            }
                            iRemaining = (int) (unsignedInt36 - j2);
                        }
                        this.mStringsSection = AndroidBinXmlParser.sliceFromTo(contents, i2, iRemaining);
                    } else {
                        j = 0;
                        this.mStringsSection = ByteBuffer.allocate(0);
                    }
                    this.mUtf8Encoded = (256 & unsignedInt34) != j;
                    this.mChunkContents = contents;
                    return;
                }
                throw new XmlParserException("Too many styles: " + unsignedInt33);
            }
            throw new XmlParserException("XML chunk's header too short. Required at least 20 bytes. Available: " + header.remaining() + " bytes");
        }

        public String getString(long index) throws XmlParserException {
            String lengthPrefixedUtf16EncodedString;
            if (index < 0) {
                throw new XmlParserException("Unsuported string index: " + index);
            }
            if (index >= this.mStringCount) {
                throw new XmlParserException("Unsuported string index: " + index + ", max: " + (this.mStringCount - 1));
            }
            int i = (int) index;
            String str = this.mCachedStrings.get(Integer.valueOf(i));
            if (str != null) {
                return str;
            }
            long unsignedInt32 = AndroidBinXmlParser.getUnsignedInt32(this.mChunkContents, i * 4);
            if (unsignedInt32 >= this.mStringsSection.capacity()) {
                throw new XmlParserException("Offset of string idx " + i + " out of bounds: " + unsignedInt32 + ", max: " + (this.mStringsSection.capacity() - 1));
            }
            this.mStringsSection.position((int) unsignedInt32);
            if (this.mUtf8Encoded) {
                lengthPrefixedUtf16EncodedString = getLengthPrefixedUtf8EncodedString(this.mStringsSection);
            } else {
                lengthPrefixedUtf16EncodedString = getLengthPrefixedUtf16EncodedString(this.mStringsSection);
            }
            this.mCachedStrings.put(Integer.valueOf(i), lengthPrefixedUtf16EncodedString);
            return lengthPrefixedUtf16EncodedString;
        }

        private static String getLengthPrefixedUtf16EncodedString(ByteBuffer encoded) throws XmlParserException {
            byte[] bArrArray;
            int iArrayOffset;
            int unsignedInt16 = AndroidBinXmlParser.getUnsignedInt16(encoded);
            if ((32768 & unsignedInt16) != 0) {
                unsignedInt16 = ((unsignedInt16 & 32767) << 16) | AndroidBinXmlParser.getUnsignedInt16(encoded);
            }
            if (unsignedInt16 > 1073741823) {
                throw new XmlParserException("String too long: " + unsignedInt16 + " uint16s");
            }
            int i = unsignedInt16 * 2;
            if (encoded.hasArray()) {
                bArrArray = encoded.array();
                iArrayOffset = encoded.arrayOffset() + encoded.position();
                encoded.position(encoded.position() + i);
            } else {
                bArrArray = new byte[i];
                encoded.get(bArrArray);
                iArrayOffset = 0;
            }
            int i2 = iArrayOffset + i;
            if (bArrArray[i2] != 0 || bArrArray[i2 + 1] != 0) {
                throw new XmlParserException("UTF-16 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iArrayOffset, i, C.UTF16LE_NAME);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-16LE character encoding not supported", e);
            }
        }

        private static String getLengthPrefixedUtf8EncodedString(ByteBuffer encoded) throws XmlParserException {
            byte[] bArrArray;
            int iArrayOffset;
            if ((AndroidBinXmlParser.getUnsignedInt8(encoded) & 128) != 0) {
                AndroidBinXmlParser.getUnsignedInt8(encoded);
            }
            int unsignedInt8 = AndroidBinXmlParser.getUnsignedInt8(encoded);
            if ((unsignedInt8 & 128) != 0) {
                unsignedInt8 = ((unsignedInt8 & 127) << 8) | AndroidBinXmlParser.getUnsignedInt8(encoded);
            }
            if (encoded.hasArray()) {
                bArrArray = encoded.array();
                iArrayOffset = encoded.arrayOffset() + encoded.position();
                encoded.position(encoded.position() + unsignedInt8);
            } else {
                bArrArray = new byte[unsignedInt8];
                encoded.get(bArrArray);
                iArrayOffset = 0;
            }
            if (bArrArray[iArrayOffset + unsignedInt8] != 0) {
                throw new XmlParserException("UTF-8 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArrArray, iArrayOffset, unsignedInt8, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 character encoding not supported", e);
            }
        }
    }

    private static class ResourceMap {
        private final ByteBuffer mChunkContents;
        private final int mEntryCount;

        public ResourceMap(Chunk chunk) throws XmlParserException {
            ByteBuffer byteBufferSlice = chunk.getContents().slice();
            this.mChunkContents = byteBufferSlice;
            byteBufferSlice.order(chunk.getContents().order());
            this.mEntryCount = byteBufferSlice.remaining() / 4;
        }

        public int getResourceId(long index) {
            if (index < 0 || index >= this.mEntryCount) {
                return 0;
            }
            return this.mChunkContents.getInt(((int) index) * 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteBuffer sliceFromTo(ByteBuffer source, long start, long end) {
        if (start < 0) {
            throw new IllegalArgumentException("start: " + start);
        }
        if (end < start) {
            throw new IllegalArgumentException("end < start: " + end + " < " + start);
        }
        int iCapacity = source.capacity();
        if (end > source.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + end + " > " + iCapacity);
        }
        return sliceFromTo(source, (int) start, (int) end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteBuffer sliceFromTo(ByteBuffer source, int start, int end) {
        if (start < 0) {
            throw new IllegalArgumentException("start: " + start);
        }
        if (end < start) {
            throw new IllegalArgumentException("end < start: " + end + " < " + start);
        }
        int iCapacity = source.capacity();
        if (end > source.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + end + " > " + iCapacity);
        }
        int iLimit = source.limit();
        int iPosition = source.position();
        try {
            source.position(0);
            source.limit(end);
            source.position(start);
            ByteBuffer byteBufferSlice = source.slice();
            byteBufferSlice.order(source.order());
            return byteBufferSlice;
        } finally {
            source.position(0);
            source.limit(iLimit);
            source.position(iPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUnsignedInt8(ByteBuffer buffer) {
        return buffer.get() & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUnsignedInt16(ByteBuffer buffer) {
        return buffer.getShort() & UShort.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getUnsignedInt32(ByteBuffer buffer) {
        return ((long) buffer.getInt()) & NO_NAMESPACE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getUnsignedInt32(ByteBuffer buffer, int position) {
        return ((long) buffer.getInt(position)) & NO_NAMESPACE;
    }

    public static class XmlParserException extends Exception {
        private static final long serialVersionUID = 1;

        public XmlParserException(String message) {
            super(message);
        }

        public XmlParserException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
