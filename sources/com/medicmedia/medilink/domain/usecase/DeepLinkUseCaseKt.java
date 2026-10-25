package com.medicmedia.medilink.domain.usecase;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.QueryParameterKey;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeepLinkUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0005"}, d2 = {"getContentCode", "", "Landroid/net/Uri;", "getId", "getPlayTime", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DeepLinkUseCaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCode(Uri uri) {
        return uri.getQueryParameter("content_code");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getId(Uri uri) {
        return uri.getQueryParameter("id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPlayTime(Uri uri) {
        return uri.getQueryParameter(QueryParameterKey.PLAY_SEC);
    }
}
