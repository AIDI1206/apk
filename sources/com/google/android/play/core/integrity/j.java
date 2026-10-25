package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.messaging.Constants;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {
    j() {
    }

    @Override // com.google.android.play.core.integrity.k
    public final ApiException a(Bundle bundle) {
        int i = bundle.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (i == 0) {
            return null;
        }
        return new StandardIntegrityException(i, null);
    }
}
