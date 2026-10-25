package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.SearchResponse;
import com.medicmedia.medilink.core.network.api.response.SuggestResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: compiled from: SearchApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/SearchApi;", "", "suggest", "Lcom/medicmedia/medilink/core/network/api/response/SuggestResponse;", "params", "Lcom/medicmedia/medilink/core/network/api/SuggestParams;", "(Lcom/medicmedia/medilink/core/network/api/SuggestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/medicmedia/medilink/core/network/api/response/SearchResponse;", "Lcom/medicmedia/medilink/core/network/api/SearchParams;", "(Lcom/medicmedia/medilink/core/network/api/SearchParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Path", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SearchApi {
    @POST(Path.SEARCH)
    Object search(@Body SearchParams searchParams, Continuation<? super SearchResponse> continuation);

    @POST(Path.SUGGEST)
    Object suggest(@Body SuggestParams suggestParams, Continuation<? super SuggestResponse> continuation);

    /* JADX INFO: compiled from: SearchApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/SearchApi$Path;", "", "<init>", "()V", "SUGGEST", "", "SEARCH", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Path {
        public static final Path INSTANCE = new Path();
        public static final String SEARCH = "api/search";
        public static final String SUGGEST = "api/suggest";

        private Path() {
        }
    }
}
