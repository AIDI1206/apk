package com.android.apksig.internal.asn1.ber;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferBerDataValueReader implements BerDataValueReader {
    private final ByteBuffer mBuf;

    private int readShortFormLength(int firstLengthByte) {
        return firstLengthByte & 127;
    }

    public ByteBufferBerDataValueReader(ByteBuffer buf) {
        if (buf == null) {
            throw new NullPointerException("buf == null");
        }
        this.mBuf = buf;
    }

    @Override // com.android.apksig.internal.asn1.ber.BerDataValueReader
    public BerDataValue readDataValue() throws BerDataValueFormatException {
        int iPosition;
        int iSkipPrimitiveIndefiniteLengthContents;
        int iPosition2 = this.mBuf.position();
        if (!this.mBuf.hasRemaining()) {
            return null;
        }
        byte b = this.mBuf.get();
        int tagNumber = readTagNumber(b);
        boolean zIsConstructed = BerEncoding.isConstructed(b);
        if (!this.mBuf.hasRemaining()) {
            throw new BerDataValueFormatException("Missing length");
        }
        byte b2 = this.mBuf.get();
        int i = b2 & 255;
        if ((b2 & 128) == 0) {
            iSkipPrimitiveIndefiniteLengthContents = readShortFormLength(i);
            iPosition = this.mBuf.position() - iPosition2;
            skipDefiniteLengthContents(iSkipPrimitiveIndefiniteLengthContents);
        } else if (i != 128) {
            iSkipPrimitiveIndefiniteLengthContents = readLongFormLength(i);
            iPosition = this.mBuf.position() - iPosition2;
            skipDefiniteLengthContents(iSkipPrimitiveIndefiniteLengthContents);
        } else {
            iPosition = this.mBuf.position() - iPosition2;
            if (zIsConstructed) {
                iSkipPrimitiveIndefiniteLengthContents = skipConstructedIndefiniteLengthContents();
            } else {
                iSkipPrimitiveIndefiniteLengthContents = skipPrimitiveIndefiniteLengthContents();
            }
        }
        int iPosition3 = this.mBuf.position();
        this.mBuf.position(iPosition2);
        int iLimit = this.mBuf.limit();
        this.mBuf.limit(iPosition3);
        ByteBuffer byteBufferSlice = this.mBuf.slice();
        ByteBuffer byteBuffer = this.mBuf;
        byteBuffer.position(byteBuffer.limit());
        this.mBuf.limit(iLimit);
        byteBufferSlice.position(iPosition);
        byteBufferSlice.limit(iPosition + iSkipPrimitiveIndefiniteLengthContents);
        ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
        byteBufferSlice.clear();
        return new BerDataValue(byteBufferSlice, byteBufferSlice2, BerEncoding.getTagClass(b), zIsConstructed, tagNumber);
    }

    private int readTagNumber(byte firstIdentifierByte) throws BerDataValueFormatException {
        int tagNumber = BerEncoding.getTagNumber(firstIdentifierByte);
        return tagNumber == 31 ? readHighTagNumber() : tagNumber;
    }

    private int readHighTagNumber() throws BerDataValueFormatException {
        int i = 0;
        while (this.mBuf.hasRemaining()) {
            byte b = this.mBuf.get();
            if (i > 16777215) {
                throw new BerDataValueFormatException("Tag number too large");
            }
            i = (i << 7) | (b & 127);
            if ((b & 128) == 0) {
                return i;
            }
        }
        throw new BerDataValueFormatException("Truncated tag number");
    }

    private int readLongFormLength(int firstLengthByte) throws BerDataValueFormatException {
        int i = firstLengthByte & 127;
        if (i > 4) {
            throw new BerDataValueFormatException("Length too large: " + i + " bytes");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.mBuf.hasRemaining()) {
                throw new BerDataValueFormatException("Truncated length");
            }
            byte b = this.mBuf.get();
            if (i2 > 8388607) {
                throw new BerDataValueFormatException("Length too large");
            }
            i2 = (i2 << 8) | (b & 255);
        }
        return i2;
    }

    private void skipDefiniteLengthContents(int contentsLength) throws BerDataValueFormatException {
        if (this.mBuf.remaining() < contentsLength) {
            throw new BerDataValueFormatException("Truncated contents. Need: " + contentsLength + " bytes, available: " + this.mBuf.remaining());
        }
        ByteBuffer byteBuffer = this.mBuf;
        byteBuffer.position(byteBuffer.position() + contentsLength);
    }

    private int skipPrimitiveIndefiniteLengthContents() throws BerDataValueFormatException {
        int i = 0;
        boolean z = false;
        while (this.mBuf.hasRemaining()) {
            byte b = this.mBuf.get();
            int i2 = i + 1;
            if (i2 < 0) {
                throw new BerDataValueFormatException("Indefinite-length contents too long");
            }
            if (b != 0) {
                z = false;
            } else {
                if (z) {
                    return i - 1;
                }
                z = true;
            }
            i = i2;
        }
        throw new BerDataValueFormatException("Truncated indefinite-length contents: " + i + " bytes read");
    }

    private int skipConstructedIndefiniteLengthContents() throws BerDataValueFormatException {
        int iPosition = this.mBuf.position();
        while (this.mBuf.hasRemaining()) {
            if (this.mBuf.remaining() > 1) {
                ByteBuffer byteBuffer = this.mBuf;
                if (byteBuffer.getShort(byteBuffer.position()) == 0) {
                    int iPosition2 = this.mBuf.position() - iPosition;
                    ByteBuffer byteBuffer2 = this.mBuf;
                    byteBuffer2.position(byteBuffer2.position() + 2);
                    return iPosition2;
                }
            }
            readDataValue();
        }
        throw new BerDataValueFormatException("Truncated indefinite-length contents: " + (this.mBuf.position() - iPosition) + " bytes read");
    }
}
