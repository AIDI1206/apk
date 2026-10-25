package com.android.apksig.internal.apk.v4;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class V4Signature {
    public static final int CURRENT_VERSION = 2;
    public static final int HASHING_ALGORITHM_SHA256 = 1;
    public static final byte LOG2_BLOCK_SIZE_4096_BYTES = 12;
    public static final int MAX_SIGNING_INFOS_SIZE = 7168;
    public final byte[] hashingInfo;
    public final byte[] signingInfos;
    public final int version;

    public static class HashingInfo {
        public final int hashAlgorithm;
        public final byte log2BlockSize;
        public final byte[] rawRootHash;
        public final byte[] salt;

        HashingInfo(int hashAlgorithm, byte log2BlockSize, byte[] salt, byte[] rawRootHash) {
            this.hashAlgorithm = hashAlgorithm;
            this.log2BlockSize = log2BlockSize;
            this.salt = salt;
            this.rawRootHash = rawRootHash;
        }

        static HashingInfo fromByteArray(byte[] bytes) throws IOException {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
            return new HashingInfo(byteBufferOrder.getInt(), byteBufferOrder.get(), V4Signature.readBytes(byteBufferOrder), V4Signature.readBytes(byteBufferOrder));
        }

        byte[] toByteArray() {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(V4Signature.bytesSize(this.salt) + 5 + V4Signature.bytesSize(this.rawRootHash)).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putInt(this.hashAlgorithm);
            byteBufferOrder.put(this.log2BlockSize);
            V4Signature.writeBytes(byteBufferOrder, this.salt);
            V4Signature.writeBytes(byteBufferOrder, this.rawRootHash);
            return byteBufferOrder.array();
        }
    }

    public static class SigningInfo {
        public final byte[] additionalData;
        public final byte[] apkDigest;
        public final byte[] certificate;
        public final byte[] publicKey;
        public final byte[] signature;
        public final int signatureAlgorithmId;

        SigningInfo(byte[] apkDigest, byte[] certificate, byte[] additionalData, byte[] publicKey, int signatureAlgorithmId, byte[] signature) {
            this.apkDigest = apkDigest;
            this.certificate = certificate;
            this.additionalData = additionalData;
            this.publicKey = publicKey;
            this.signatureAlgorithmId = signatureAlgorithmId;
            this.signature = signature;
        }

        static SigningInfo fromByteArray(byte[] bytes) throws IOException {
            return fromByteBuffer(ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN));
        }

        static SigningInfo fromByteBuffer(ByteBuffer buffer) throws IOException {
            return new SigningInfo(V4Signature.readBytes(buffer), V4Signature.readBytes(buffer), V4Signature.readBytes(buffer), V4Signature.readBytes(buffer), buffer.getInt(), V4Signature.readBytes(buffer));
        }

        byte[] toByteArray() {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(V4Signature.bytesSize(this.apkDigest) + V4Signature.bytesSize(this.certificate) + V4Signature.bytesSize(this.additionalData) + V4Signature.bytesSize(this.publicKey) + 4 + V4Signature.bytesSize(this.signature)).order(ByteOrder.LITTLE_ENDIAN);
            V4Signature.writeBytes(byteBufferOrder, this.apkDigest);
            V4Signature.writeBytes(byteBufferOrder, this.certificate);
            V4Signature.writeBytes(byteBufferOrder, this.additionalData);
            V4Signature.writeBytes(byteBufferOrder, this.publicKey);
            byteBufferOrder.putInt(this.signatureAlgorithmId);
            V4Signature.writeBytes(byteBufferOrder, this.signature);
            return byteBufferOrder.array();
        }
    }

    public static class SigningInfoBlock {
        public final int blockId;
        public final byte[] signingInfo;

        public SigningInfoBlock(int blockId, byte[] signingInfo) {
            this.blockId = blockId;
            this.signingInfo = signingInfo;
        }

        static SigningInfoBlock fromByteBuffer(ByteBuffer buffer) throws IOException {
            return new SigningInfoBlock(buffer.getInt(), V4Signature.readBytes(buffer));
        }

        byte[] toByteArray() {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(V4Signature.bytesSize(this.signingInfo) + 4).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putInt(this.blockId);
            V4Signature.writeBytes(byteBufferOrder, this.signingInfo);
            return byteBufferOrder.array();
        }
    }

    public static class SigningInfos {
        public final SigningInfo signingInfo;
        public final SigningInfoBlock[] signingInfoBlocks;

        public SigningInfos(SigningInfo signingInfo) {
            this.signingInfo = signingInfo;
            this.signingInfoBlocks = new SigningInfoBlock[0];
        }

        public SigningInfos(SigningInfo signingInfo, SigningInfoBlock... signingInfoBlocks) {
            this.signingInfo = signingInfo;
            this.signingInfoBlocks = signingInfoBlocks;
        }

        public static SigningInfos fromByteArray(byte[] bytes) throws IOException {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
            SigningInfo signingInfoFromByteBuffer = SigningInfo.fromByteBuffer(byteBufferOrder);
            if (!byteBufferOrder.hasRemaining()) {
                return new SigningInfos(signingInfoFromByteBuffer);
            }
            ArrayList arrayList = new ArrayList(1);
            while (byteBufferOrder.hasRemaining()) {
                arrayList.add(SigningInfoBlock.fromByteBuffer(byteBufferOrder));
            }
            return new SigningInfos(signingInfoFromByteBuffer, (SigningInfoBlock[]) arrayList.toArray(new SigningInfoBlock[arrayList.size()]));
        }

        byte[] toByteArray() {
            byte[][] bArr = new byte[this.signingInfoBlocks.length + 1][];
            byte[] byteArray = this.signingInfo.toByteArray();
            bArr[0] = byteArray;
            int length = byteArray.length;
            int length2 = this.signingInfoBlocks.length;
            int i = 0;
            while (i < length2) {
                int i2 = i + 1;
                byte[] byteArray2 = this.signingInfoBlocks[i].toByteArray();
                bArr[i2] = byteArray2;
                length += byteArray2.length;
                i = i2;
            }
            if (length > 7168) {
                throw new IllegalArgumentException("Combined SigningInfos length exceeded limit of 7K: " + length);
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
            int length3 = bArr[0].length;
            int length4 = this.signingInfoBlocks.length;
            int i3 = 0;
            while (i3 < length4) {
                i3++;
                byte[] bArr2 = bArr[i3];
                System.arraycopy(bArr2, 0, bArrCopyOf, length3, bArr2.length);
                length3 += bArr[i3].length;
            }
            return bArrCopyOf;
        }
    }

    V4Signature(int version, byte[] hashingInfo, byte[] signingInfos) {
        this.version = version;
        this.hashingInfo = hashingInfo;
        this.signingInfos = signingInfos;
    }

    static V4Signature readFrom(InputStream stream) throws IOException {
        int intLE = readIntLE(stream);
        if (intLE != 2) {
            throw new IOException("Invalid signature version.");
        }
        return new V4Signature(intLE, readBytes(stream), readBytes(stream));
    }

    public void writeTo(OutputStream stream) throws IOException {
        writeIntLE(stream, this.version);
        writeBytes(stream, this.hashingInfo);
        writeBytes(stream, this.signingInfos);
    }

    static byte[] getSignedData(long fileSize, HashingInfo hashingInfo, SigningInfo signingInfo) {
        int iBytesSize = bytesSize(hashingInfo.salt) + 17 + bytesSize(hashingInfo.rawRootHash) + bytesSize(signingInfo.apkDigest) + bytesSize(signingInfo.certificate) + bytesSize(signingInfo.additionalData);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iBytesSize).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(iBytesSize);
        byteBufferOrder.putLong(fileSize);
        byteBufferOrder.putInt(hashingInfo.hashAlgorithm);
        byteBufferOrder.put(hashingInfo.log2BlockSize);
        writeBytes(byteBufferOrder, hashingInfo.salt);
        writeBytes(byteBufferOrder, hashingInfo.rawRootHash);
        writeBytes(byteBufferOrder, signingInfo.apkDigest);
        writeBytes(byteBufferOrder, signingInfo.certificate);
        writeBytes(byteBufferOrder, signingInfo.additionalData);
        return byteBufferOrder.array();
    }

    static int bytesSize(byte[] bytes) {
        return (bytes == null ? 0 : bytes.length) + 4;
    }

    static void readFully(InputStream stream, byte[] buffer) throws IOException {
        int length = buffer.length;
        int i = 0;
        while (i < length) {
            int i2 = stream.read(buffer, i, length - i);
            if (i2 < 0) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    static int readIntLE(InputStream stream) throws IOException {
        byte[] bArr = new byte[4];
        readFully(stream, bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    static void writeIntLE(OutputStream stream, int v) throws IOException {
        stream.write(ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array());
    }

    static byte[] readBytes(InputStream stream) throws IOException {
        try {
            byte[] bArr = new byte[readIntLE(stream)];
            readFully(stream, bArr);
            return bArr;
        } catch (EOFException unused) {
            return null;
        }
    }

    static byte[] readBytes(ByteBuffer buffer) throws IOException {
        if (buffer.remaining() < 4) {
            throw new EOFException();
        }
        int i = buffer.getInt();
        if (buffer.remaining() < i) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i];
        buffer.get(bArr);
        return bArr;
    }

    static void writeBytes(OutputStream stream, byte[] bytes) throws IOException {
        if (bytes == null) {
            writeIntLE(stream, 0);
        } else {
            writeIntLE(stream, bytes.length);
            stream.write(bytes);
        }
    }

    static void writeBytes(ByteBuffer buffer, byte[] bytes) {
        if (bytes == null) {
            buffer.putInt(0);
        } else {
            buffer.putInt(bytes.length);
            buffer.put(bytes);
        }
    }
}
