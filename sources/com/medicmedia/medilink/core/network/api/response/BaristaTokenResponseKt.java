package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.datastore.model.BaristaToken;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaTokenResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toItem", "Lcom/medicmedia/medilink/datastore/model/BaristaToken;", "Lcom/medicmedia/medilink/core/network/api/response/BaristaTokenResponse;", "network_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BaristaTokenResponseKt {
    public static final BaristaToken toItem(BaristaTokenResponse baristaTokenResponse) {
        Intrinsics.checkNotNullParameter(baristaTokenResponse, "<this>");
        long timeInMillis = 0;
        if (baristaTokenResponse.getExpiresIn() > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, ((int) baristaTokenResponse.getExpiresIn()) - BaristaToken.INSTANCE.getTokenInterval());
            timeInMillis = calendar.getTimeInMillis();
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, MLConst.BaristaAuth.BARISTA_REFRESH_TOKEN_EXPIER);
        long timeInMillis2 = calendar2.getTimeInMillis();
        return new BaristaToken(baristaTokenResponse.getAccessToken(), baristaTokenResponse.getRefreshToken(), timeInMillis, timeInMillis2, baristaTokenResponse.getTokenId());
    }
}
