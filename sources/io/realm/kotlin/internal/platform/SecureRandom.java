package io.realm.kotlin.internal.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* JADX INFO: compiled from: SecureRandom.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/platform/SecureRandom;", "Lkotlin/random/Random;", "<init>", "()V", "getInt", "", "nextBytes", "", "array", "fromIndex", "toIndex", "nextBits", "bitCount", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SecureRandom extends Random {
    public static final SecureRandom INSTANCE = new SecureRandom();

    private SecureRandom() {
    }

    private final int getInt() {
        byte[] bArr = new byte[4];
        SecureRandomJvmKt.fillRandomBytes(bArr);
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    @Override // kotlin.random.Random
    public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i = toIndex - fromIndex;
        byte[] bArr = new byte[i];
        SecureRandomJvmKt.fillRandomBytes(bArr);
        ArraysKt.copyInto(bArr, array, fromIndex, 0, i);
        return array;
    }

    @Override // kotlin.random.Random
    public int nextBits(int bitCount) {
        return ((-bitCount) >> 31) & (getInt() >>> (32 - bitCount));
    }
}
