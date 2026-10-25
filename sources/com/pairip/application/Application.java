package com.pairip.application;

import android.content.Context;
import com.medicmedia.medilink.MLMainApplication;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes.dex */
public class Application extends MLMainApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
