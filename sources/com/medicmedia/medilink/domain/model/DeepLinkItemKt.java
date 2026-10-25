package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.deeplink.DeepLink;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeepLinkItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toItem", "Lcom/medicmedia/medilink/domain/model/DeepLinkResultItem;", "Lcom/appsflyer/deeplink/DeepLink;", "isNotEmptyBookItems", "", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DeepLinkItemKt {
    public static final DeepLinkResultItem toItem(DeepLink deepLink, boolean z) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(deepLink, "<this>");
        String deepLinkValue = deepLink.getDeepLinkValue();
        String strDecode = null;
        if (deepLinkValue != null && deepLinkValue.length() > 0) {
            strDecode = URLDecoder.decode(deepLinkValue, "UTF-8");
        }
        DeepLinkType deepLinkType = DeepLinkType.ONE_LINK;
        String str = strDecode == null ? "" : strDecode;
        boolean z2 = false;
        if (strDecode != null && strDecode.length() > 0) {
            z2 = true;
        }
        return new DeepLinkResultItem(deepLinkType, str, z2, deepLink.getCurrencyIso4217Code, z);
    }
}
