package com.fingerprintjs.android.fingerprint.tools.hashers;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: MurMur3x64x128Hasher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/tools/hashers/MurMur3x64x128Hasher;", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "()V", "X64_128_C1", "", "X64_128_C2", "fmix64", "kPrev", "hash", "", "data", "hash_x64_128", "", "", "length", "", "seed", "mixK1", "k1Prev", "mixK2", "k2Prev", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MurMur3x64x128Hasher implements Hasher {
    private final long X64_128_C1 = -8663945395140668459L;
    private final long X64_128_C2 = 5545529020109919103L;

    private final long fmix64(long kPrev) {
        long j = (kPrev ^ (kPrev >>> 33)) * (-49064778989728563L);
        long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
        return j2 ^ (j2 >>> 33);
    }

    @Override // com.fingerprintjs.android.fingerprint.tools.hashers.Hasher
    public String hash(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bytes = data.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        long[] jArrHash_x64_128$default = hash_x64_128$default(this, bytes, data.length(), 0L, 4, null);
        StringBuilder sb = new StringBuilder();
        for (long j : jArrHash_x64_128$default) {
            sb.append(Long.toHexString(j));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    static /* synthetic */ long[] hash_x64_128$default(MurMur3x64x128Hasher murMur3x64x128Hasher, byte[] bArr, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return murMur3x64x128Hasher.hash_x64_128(bArr, i, j);
    }

    private final long[] hash_x64_128(byte[] data, int length, long seed) {
        long j;
        long j2;
        byte b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        long jMixK1 = seed;
        long jMixK2 = jMixK1;
        while (byteBufferWrap.remaining() >= 16) {
            long j3 = byteBufferWrap.getLong();
            long j4 = byteBufferWrap.getLong();
            long j5 = 5;
            jMixK1 = ((Long.rotateLeft(jMixK1 ^ mixK1(j3), 27) + jMixK2) * j5) + ((long) 1390208809);
            jMixK2 = ((Long.rotateLeft(jMixK2 ^ mixK2(j4), 31) + jMixK1) * j5) + ((long) 944331445);
        }
        byteBufferWrap.compact();
        byteBufferWrap.flip();
        if (byteBufferWrap.remaining() > 0) {
            long j6 = 0;
            switch (byteBufferWrap.remaining()) {
                case 1:
                    j = ((long) byteBufferWrap.get(0)) & 255;
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 2:
                    j2 = (((long) byteBufferWrap.get(1)) & 255) << 8;
                    b = byteBufferWrap.get(0);
                    j = j2 ^ (((long) b) & 255);
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 3:
                    j = (((((long) byteBufferWrap.get(2)) & 255) << 16) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8)) ^ (((long) byteBufferWrap.get(0)) & 255);
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 4:
                    j2 = (((((long) byteBufferWrap.get(3)) & 255) << 24) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b = byteBufferWrap.get(0);
                    j = j2 ^ (((long) b) & 255);
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 5:
                    j2 = ((((((long) byteBufferWrap.get(4)) & 255) << 32) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b = byteBufferWrap.get(0);
                    j = j2 ^ (((long) b) & 255);
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 6:
                    j2 = (((((((long) byteBufferWrap.get(5)) & 255) << 40) ^ ((((long) byteBufferWrap.get(4)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b = byteBufferWrap.get(0);
                    j = j2 ^ (((long) b) & 255);
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 7:
                    j2 = ((((((((long) byteBufferWrap.get(5)) & 255) << 40) ^ ((((long) byteBufferWrap.get(6)) & 255) << 48)) ^ ((((long) byteBufferWrap.get(4)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b = byteBufferWrap.get(0);
                    j = j2 ^ (((long) b) & 255);
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 8:
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 9:
                    j6 = ((long) byteBufferWrap.get(8)) & 255;
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 10:
                    j6 = ((((long) byteBufferWrap.get(9)) & 255) << 8) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 11:
                    j6 = (((((long) byteBufferWrap.get(10)) & 255) << 16) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 12:
                    j6 = ((((((long) byteBufferWrap.get(11)) & 255) << 24) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 13:
                    j6 = (((((((long) byteBufferWrap.get(12)) & 255) << 32) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 14:
                    j6 = ((((((((long) byteBufferWrap.get(13)) & 255) << 40) ^ ((((long) byteBufferWrap.get(12)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                case 15:
                    j6 = (((((((((long) byteBufferWrap.get(14)) & 255) << 48) ^ ((((long) byteBufferWrap.get(13)) & 255) << 40)) ^ ((((long) byteBufferWrap.get(12)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j);
                    jMixK2 ^= mixK2(j6);
                    break;
                default:
                    throw new AssertionError("Code should not reach here!");
            }
        }
        long j7 = length;
        long j8 = jMixK2 ^ j7;
        long j9 = (jMixK1 ^ j7) + j8;
        long j10 = j8 + j9;
        long jFmix64 = fmix64(j9);
        long jFmix65 = fmix64(j10);
        long j11 = jFmix64 + jFmix65;
        return new long[]{j11, jFmix65 + j11};
    }

    private final long mixK1(long k1Prev) {
        return Long.rotateLeft(k1Prev * this.X64_128_C1, 31) * this.X64_128_C2;
    }

    private final long mixK2(long k2Prev) {
        return Long.rotateLeft(k2Prev * this.X64_128_C2, 33) * this.X64_128_C1;
    }
}
