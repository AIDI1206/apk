package com.appsflyer.internal;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1rSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFh1rSDK;)V", "", "afInfoLog", "()V", "getRevenue", "Lcom/appsflyer/internal/AFh1rSDK;", "AFAdRevenueData"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AFb1sSDK {

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final AFh1rSDK AFAdRevenueData;

    public AFb1sSDK(AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        this.AFAdRevenueData = aFh1rSDK;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Object declaredConstructor = AFa1kSDK.i.get(-496653013);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1kSDK.getCurrencyIso4217Code(87 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (28154 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 36 - Color.argb(0, 0, 0, 0))).getDeclaredConstructor(null);
                AFa1kSDK.i.put(-496653013, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.AFAdRevenueData};
            Object method = AFa1kSDK.i.get(-1581670163);
            if (method == null) {
                method = ((Class) AFa1kSDK.getCurrencyIso4217Code(87 - TextUtils.indexOf("", "", 0, 0), (char) (28155 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 36 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("getRevenue", AFh1rSDK.class);
                AFa1kSDK.i.put(-1581670163, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
