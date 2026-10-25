package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.LicenseSerialResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: compiled from: AccountsApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/AccountsApi;", "", "licenseSerial", "Lcom/medicmedia/medilink/core/network/api/response/LicenseSerialResponse;", "params", "Lcom/medicmedia/medilink/core/network/api/LicenseSerialParams;", "(Lcom/medicmedia/medilink/core/network/api/LicenseSerialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Path", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AccountsApi {
    @POST(Path.LICENSE_SERIAL)
    Object licenseSerial(@Body LicenseSerialParams licenseSerialParams, Continuation<? super LicenseSerialResponse> continuation);

    /* JADX INFO: compiled from: AccountsApi.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/AccountsApi$Path;", "", "<init>", "()V", "LICENSE_SERIAL", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Path {
        public static final Path INSTANCE = new Path();
        public static final String LICENSE_SERIAL = "license/serial";

        private Path() {
        }
    }
}
