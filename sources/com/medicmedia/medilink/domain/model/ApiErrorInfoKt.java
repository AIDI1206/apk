package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.ApiErrorCodeException;
import io.realm.kotlin.exceptions.RealmException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import retrofit2.HttpException;

/* JADX INFO: compiled from: ApiErrorInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"toQrSerialErrorInfo", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo;", "", "toQrPageErrorInfo", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ApiErrorInfoKt {
    public static final QrSerialErrorInfo toQrSerialErrorInfo(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if ((th instanceof ApiErrorCodeException) || (th instanceof JSONException) || (th instanceof IOException)) {
            return new QrSerialErrorInfo.Ap042002Ap042007(0, 0, null, 7, null);
        }
        return th instanceof RealmException ? new QrSerialErrorInfo.Ap042008(0, 0, null, 7, null) : new QrSerialErrorInfo.Ap042099(0, 0, null, th, 7, null);
    }

    public static final QrPageErrorInfo toQrPageErrorInfo(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if ((th instanceof ApiErrorCodeException) || (th instanceof JSONException) || (th instanceof IOException)) {
            return new QrPageErrorInfo.Ap043003Ap042008(0, 0, null, 7, null);
        }
        return th instanceof HttpException ? new QrPageErrorInfo.Ap043009Ap042010(0, 0, null, 7, null) : new QrPageErrorInfo.Ap043099(0, 0, null, th, 7, null);
    }
}
