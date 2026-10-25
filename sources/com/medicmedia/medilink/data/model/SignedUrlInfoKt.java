package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.functions.response.GetSignedUrlContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignedUrlInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertToContent", "Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlContent;", "Lcom/medicmedia/medilink/data/model/SignedUrlInfo;", "repository_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SignedUrlInfoKt {
    public static final GetSignedUrlContent convertToContent(SignedUrlInfo signedUrlInfo) {
        Intrinsics.checkNotNullParameter(signedUrlInfo, "<this>");
        return new GetSignedUrlContent(signedUrlInfo.getContentId(), signedUrlInfo.getContentVersion(), signedUrlInfo.getFileName());
    }
}
