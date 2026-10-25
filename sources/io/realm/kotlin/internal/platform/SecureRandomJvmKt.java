package io.realm.kotlin.internal.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SecureRandomJvm.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"jrandom", "Ljava/security/SecureRandom;", "fillRandomBytes", "", "array", "", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SecureRandomJvmKt {
    private static final java.security.SecureRandom jrandom = new java.security.SecureRandom();

    public static final void fillRandomBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        jrandom.nextBytes(array);
    }
}
