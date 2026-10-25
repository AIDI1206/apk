package io.realm.kotlin.internal.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lio/realm/kotlin/internal/util/Exceptions;", "", "<init>", "()V", "assetFileNotFound", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "filename", "", "cause", "", "assetFileChecksumMismatch", "expectedSha256", "actualSha256", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Exceptions {
    public static final Exceptions INSTANCE = new Exceptions();

    private Exceptions() {
    }

    public static /* synthetic */ IllegalArgumentException assetFileNotFound$default(Exceptions exceptions, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return exceptions.assetFileNotFound(str, th);
    }

    public final IllegalArgumentException assetFileNotFound(String filename, Throwable cause) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return new IllegalArgumentException("Asset file not found: '" + filename + '\'', cause);
    }

    public final IllegalArgumentException assetFileChecksumMismatch(String filename, String expectedSha256, String actualSha256) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(expectedSha256, "expectedSha256");
        Intrinsics.checkNotNullParameter(actualSha256, "actualSha256");
        return new IllegalArgumentException("Asset file checksum for '" + filename + "' does not match. Expected '" + expectedSha256 + "' but was '" + actualSha256 + '\'');
    }
}
