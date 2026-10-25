package com.medicmedia.medilink.domain.extensions;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: UriExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"isHttpScheme", "", "Landroid/net/Uri;", "isMailToScheme", "isPdfExtension", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UriExtensionKt {
    public static final boolean isHttpScheme(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https");
    }

    public static final boolean isMailToScheme(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual(uri.getScheme(), "mailto");
    }

    public static final boolean isPdfExtension(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String lastPathSegment = uri.getLastPathSegment();
        return lastPathSegment != null && StringsKt.contains$default((CharSequence) lastPathSegment, (CharSequence) MLConst.MLCommon.PDF, false, 2, (Object) null);
    }
}
