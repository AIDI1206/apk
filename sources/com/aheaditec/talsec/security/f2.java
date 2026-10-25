package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public interface f2 {
    static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Build.VERSION.SDK_INT < 30 ? context.getPackageManager().getInstallerPackageName(packageName) : context.getPackageManager().getInstallSourceInfo(packageName).getInitiatingPackageName();
        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
            return null;
        }
    }

    static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
            return null;
        }
    }

    g0 a();

    String b();

    String c();

    v0 d();

    String e();

    String f();

    o1 g();
}
