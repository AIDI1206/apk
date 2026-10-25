package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.medicmedia.medilink.core.network.api.response.PdfUrlResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: compiled from: PdfApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/PdfApi;", "", "getPdfViewerUrl", "Lcom/medicmedia/medilink/core/network/api/response/PdfUrlResponse;", "params", "Lcom/medicmedia/medilink/core/network/api/PdfParams;", "(Lcom/medicmedia/medilink/core/network/api/PdfParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface PdfApi {
    @POST(DomExceptionUtils.SEPARATOR)
    Object getPdfViewerUrl(@Body PdfParams pdfParams, Continuation<? super PdfUrlResponse> continuation);
}
