package com.medicmedia.medilink.core.network.functions;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.functions.response.GetSignedUrlContent;
import com.medicmedia.medilink.core.network.functions.response.SignedUrlApiResponse;
import com.medicmedia.medilink.core.network.functions.response.SignedUrlsApiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: FirebaseFunctionsDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/FirebaseFunctionsDataSource;", "", "getSignedUrl", "Lcom/medicmedia/medilink/core/network/functions/response/SignedUrlApiResponse;", "contentId", "", "contentVersion", "fileName", "expiresIn", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSignedUrls", "Lcom/medicmedia/medilink/core/network/functions/response/SignedUrlsApiResponse;", "contents", "", "Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlContent;", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface FirebaseFunctionsDataSource {
    Object getSignedUrl(String str, String str2, String str3, int i, Continuation<? super SignedUrlApiResponse> continuation);

    Object getSignedUrls(List<GetSignedUrlContent> list, int i, Continuation<? super SignedUrlsApiResponse> continuation);
}
