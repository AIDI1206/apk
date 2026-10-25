package com.medicmedia.medilink.core.network.functions.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignedUrlResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004*\u00020\u0005\u001a&\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004*\u00020\u0006\u001a&\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004*\u00020\u0007¨\u0006\b"}, d2 = {"toHashMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlParameters;", "Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlsParameters;", "Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlContent;", "network_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SignedUrlResponseKt {
    public static final HashMap<String, Object> toHashMap(GetSignedUrlParameters getSignedUrlParameters) {
        Intrinsics.checkNotNullParameter(getSignedUrlParameters, "<this>");
        return MapsKt.hashMapOf(TuplesKt.to("contentId", getSignedUrlParameters.getContentId()), TuplesKt.to("contentVersion", getSignedUrlParameters.getContentVersion()), TuplesKt.to("fileName", getSignedUrlParameters.getFileName()), TuplesKt.to("expiresIn", Integer.valueOf(getSignedUrlParameters.getExpiresIn())));
    }

    public static final HashMap<String, Object> toHashMap(GetSignedUrlsParameters getSignedUrlsParameters) {
        Intrinsics.checkNotNullParameter(getSignedUrlsParameters, "<this>");
        Pair[] pairArr = new Pair[2];
        List<GetSignedUrlContent> contents = getSignedUrlsParameters.getContents();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contents, 10));
        Iterator<T> it = contents.iterator();
        while (it.hasNext()) {
            arrayList.add(toHashMap((GetSignedUrlContent) it.next()));
        }
        pairArr[0] = TuplesKt.to("contents", arrayList);
        pairArr[1] = TuplesKt.to("expiresIn", Integer.valueOf(getSignedUrlsParameters.getExpiresIn()));
        return MapsKt.hashMapOf(pairArr);
    }

    public static final HashMap<String, Object> toHashMap(GetSignedUrlContent getSignedUrlContent) {
        Intrinsics.checkNotNullParameter(getSignedUrlContent, "<this>");
        return MapsKt.hashMapOf(TuplesKt.to("contentId", getSignedUrlContent.getContentId()), TuplesKt.to("contentVersion", getSignedUrlContent.getContentVersion()), TuplesKt.to("fileName", getSignedUrlContent.getFileName()));
    }
}
