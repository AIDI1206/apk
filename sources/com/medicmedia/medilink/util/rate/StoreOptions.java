package com.medicmedia.medilink.util.rate;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class StoreOptions {
    private int storeType = 5;
    private String applicationId = null;
    private Intent[] intents = null;

    StoreOptions() {
    }

    String getApplicationId() {
        return this.applicationId;
    }

    private void setApplicationId(String str) {
        this.applicationId = str;
    }

    Intent[] getIntents() {
        return this.intents;
    }

    private void setIntents(Intent[] intentArr) {
        this.intents = intentArr;
    }

    int getStoreType() {
        return this.storeType;
    }

    void setStoreType(int i, String[] strArr, Intent[] intentArr) {
        Intent[] intentArr2;
        this.storeType = i;
        if (i == 1 || i == 3) {
            setApplicationId(strArr[0]);
            return;
        }
        if (i == 11) {
            setIntents(intentArr);
            return;
        }
        if (i != 12) {
            return;
        }
        if (strArr == null) {
            intentArr2 = null;
        } else {
            int length = strArr.length;
            Intent[] intentArr3 = new Intent[length];
            for (int i2 = 0; i2 < length; i2++) {
                intentArr3[i2] = new Intent("android.intent.action.VIEW", Uri.parse(strArr[i2]));
            }
            intentArr2 = intentArr3;
        }
        setIntents(intentArr2);
    }
}
