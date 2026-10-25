package com.android.apksig.internal.asn1.ber;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class InputStreamBerDataValueReader implements BerDataValueReader {
    private final InputStream mIn;

    private static int readShortFormLength(int firstLengthByte) {
        return firstLengthByte & 127;
    }

    public InputStreamBerDataValueReader(InputStream in) {
        if (in == null) {
            throw new NullPointerException("in == null");
        }
        this.mIn = in;
    }

    @Override // com.android.apksig.internal.asn1.ber.BerDataValueReader
    public BerDataValue readDataValue() throws BerDataValueFormatException {
        return readDataValue(this.mIn);
    }

    private static BerDataValue readDataValue(InputStream input) throws BerDataValueFormatException {
        int readByteCount;
        int iSkipPrimitiveIndefiniteLengthContents;
        RecordingInputStream recordingInputStream = new RecordingInputStream(input);
        try {
            int i = recordingInputStream.read();
            if (i == -1) {
                return null;
            }
            int tagNumber = readTagNumber(recordingInputStream, i);
            int i2 = recordingInputStream.read();
            if (i2 == -1) {
                throw new BerDataValueFormatException("Missing length");
            }
            byte b = (byte) i;
            boolean zIsConstructed = BerEncoding.isConstructed(b);
            if ((i2 & 128) == 0) {
                iSkipPrimitiveIndefiniteLengthContents = readShortFormLength(i2);
                readByteCount = recordingInputStream.getReadByteCount();
                skipDefiniteLengthContents(recordingInputStream, iSkipPrimitiveIndefiniteLengthContents);
            } else if ((i2 & 255) != 128) {
                iSkipPrimitiveIndefiniteLengthContents = readLongFormLength(recordingInputStream, i2);
                readByteCount = recordingInputStream.getReadByteCount();
                skipDefiniteLengthContents(recordingInputStream, iSkipPrimitiveIndefiniteLengthContents);
            } else {
                readByteCount = recordingInputStream.getReadByteCount();
                if (zIsConstructed) {
                    iSkipPrimitiveIndefiniteLengthContents = skipConstructedIndefiniteLengthContents(recordingInputStream);
                } else {
                    iSkipPrimitiveIndefiniteLengthContents = skipPrimitiveIndefiniteLengthContents(recordingInputStream);
                }
            }
            byte[] readBytes = recordingInputStream.getReadBytes();
            return new BerDataValue(ByteBuffer.wrap(readBytes), ByteBuffer.wrap(readBytes, readByteCount, iSkipPrimitiveIndefiniteLengthContents), BerEncoding.getTagClass(b), zIsConstructed, tagNumber);
        } catch (IOException e) {
            throw new BerDataValueFormatException("Failed to read data value", e);
        }
    }

    private static int readTagNumber(InputStream in, int firstIdentifierByte) throws IOException, BerDataValueFormatException {
        int tagNumber = BerEncoding.getTagNumber((byte) firstIdentifierByte);
        return tagNumber == 31 ? readHighTagNumber(in) : tagNumber;
    }

    private static int readHighTagNumber(InputStream in) throws IOException, BerDataValueFormatException {
        int i;
        int i2 = 0;
        do {
            i = in.read();
            if (i == -1) {
                throw new BerDataValueFormatException("Truncated tag number");
            }
            if (i2 > 16777215) {
                throw new BerDataValueFormatException("Tag number too large");
            }
            i2 = (i2 << 7) | (i & 127);
        } while ((i & 128) != 0);
        return i2;
    }

    private static int readLongFormLength(InputStream in, int firstLengthByte) throws IOException, BerDataValueFormatException {
        int i = firstLengthByte & 127;
        if (i > 4) {
            throw new BerDataValueFormatException("Length too large: " + i + " bytes");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = in.read();
            if (i4 == -1) {
                throw new BerDataValueFormatException("Truncated length");
            }
            if (i2 > 8388607) {
                throw new BerDataValueFormatException("Length too large");
            }
            i2 = (i2 << 8) | (i4 & 255);
        }
        return i2;
    }

    private static void skipDefiniteLengthContents(InputStream in, int len) throws IOException, BerDataValueFormatException {
        long j = 0;
        while (len > 0) {
            int iSkip = (int) in.skip(len);
            if (iSkip <= 0) {
                throw new BerDataValueFormatException("Truncated definite-length contents: " + j + " bytes read, " + len + " missing");
            }
            len -= iSkip;
            j += (long) iSkip;
        }
    }

    private static int skipPrimitiveIndefiniteLengthContents(InputStream in) throws IOException, BerDataValueFormatException {
        int i = 0;
        boolean z = false;
        while (true) {
            int i2 = in.read();
            if (i2 == -1) {
                throw new BerDataValueFormatException("Truncated indefinite-length contents: " + i + " bytes read");
            }
            int i3 = i + 1;
            if (i3 < 0) {
                throw new BerDataValueFormatException("Indefinite-length contents too long");
            }
            if (i2 != 0) {
                z = false;
            } else {
                if (z) {
                    return i - 1;
                }
                z = true;
            }
            i = i3;
        }
    }

    private static int skipConstructedIndefiniteLengthContents(RecordingInputStream in) throws BerDataValueFormatException {
        int readByteCount = in.getReadByteCount();
        while (true) {
            BerDataValue dataValue = readDataValue(in);
            if (dataValue == null) {
                throw new BerDataValueFormatException("Truncated indefinite-length contents: " + (in.getReadByteCount() - readByteCount) + " bytes read");
            }
            if (in.getReadByteCount() <= 0) {
                throw new BerDataValueFormatException("Indefinite-length contents too long");
            }
            ByteBuffer encoded = dataValue.getEncoded();
            if (encoded.remaining() == 2 && encoded.get(0) == 0 && encoded.get(1) == 0) {
                return (in.getReadByteCount() - readByteCount) - 2;
            }
        }
    }

    private static class RecordingInputStream extends InputStream {
        private final ByteArrayOutputStream mBuf;
        private final InputStream mIn;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        private RecordingInputStream(InputStream in) {
            this.mIn = in;
            this.mBuf = new ByteArrayOutputStream();
        }

        public byte[] getReadBytes() {
            return this.mBuf.toByteArray();
        }

        public int getReadByteCount() {
            return this.mBuf.size();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i = this.mIn.read();
            if (i != -1) {
                this.mBuf.write(i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public int read(byte[] b) throws IOException {
            int i = this.mIn.read(b);
            if (i > 0) {
                this.mBuf.write(b, 0, i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public int read(byte[] b, int off, int len) throws IOException {
            int i = this.mIn.read(b, off, len);
            if (i > 0) {
                this.mBuf.write(b, off, i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public long skip(long n) throws IOException {
            if (n <= 0) {
                return this.mIn.skip(n);
            }
            byte[] bArr = new byte[4096];
            int i = this.mIn.read(bArr, 0, (int) Math.min(4096, n));
            if (i > 0) {
                this.mBuf.write(bArr, 0, i);
            }
            if (i < 0) {
                return 0L;
            }
            return i;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return super.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int readlimit) {
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            throw new IOException("mark/reset not supported");
        }
    }
}
