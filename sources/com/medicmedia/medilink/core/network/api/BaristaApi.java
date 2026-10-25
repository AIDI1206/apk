package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.BaristaTokenResponse;
import com.medicmedia.medilink.core.network.api.response.BaristaUserInfoResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: compiled from: BaristaApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ$\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/BaristaApi;", "", "baristaToken", "Lcom/medicmedia/medilink/core/network/api/response/BaristaTokenResponse;", "params", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baristaUserInfo", "Lcom/medicmedia/medilink/core/network/api/response/BaristaUserInfoResponse;", "Lcom/medicmedia/medilink/core/network/api/BaristaUserInfoParams;", "(Lcom/medicmedia/medilink/core/network/api/BaristaUserInfoParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Path", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface BaristaApi {
    @FormUrlEncoded
    @POST(Path.TOKEN)
    Object baristaToken(@FieldMap Map<String, String> map, Continuation<? super BaristaTokenResponse> continuation);

    @POST(Path.USER_INFO)
    Object baristaUserInfo(@Body BaristaUserInfoParams baristaUserInfoParams, Continuation<? super BaristaUserInfoResponse> continuation);

    /* JADX INFO: compiled from: BaristaApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/BaristaApi$Path;", "", "<init>", "()V", "TOKEN", "", "USER_INFO", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Path {
        public static final Path INSTANCE = new Path();
        public static final String TOKEN = "oauth/token";
        public static final String USER_INFO = "userinfo";

        private Path() {
        }
    }
}
