package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import retrofit2.Retrofit;

/* JADX INFO: compiled from: ApiDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/ApiDataSource;", "", "build", "Lretrofit2/Retrofit;", "url", "", "httpClientType", "Lcom/medicmedia/medilink/core/network/api/HttpClientType;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ApiDataSource {
    Retrofit build(String url, HttpClientType httpClientType);

    /* JADX INFO: compiled from: ApiDataSource.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Retrofit build$default(ApiDataSource apiDataSource, String str, HttpClientType httpClientType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: build");
            }
            if ((i & 2) != 0) {
                httpClientType = HttpClientType.DEFAULT;
            }
            return apiDataSource.build(str, httpClientType);
        }
    }
}
