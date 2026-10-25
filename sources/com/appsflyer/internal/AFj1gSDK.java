package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1gSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    public final String getRevenue() {
        Object objM11499constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AFj1gSDK aFj1gSDK = this;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj, "");
            objM11499constructorimpl = Result.m11499constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m11505isFailureimpl(objM11499constructorimpl) ? "" : objM11499constructorimpl);
    }
}
