package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFa1bSDK implements AFa1aSDK {
    Map<String, Object> AFAdRevenueData;
    private boolean getMediationNetwork;
    private final AFc1iSDK getRevenue;

    public AFa1bSDK(AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.getRevenue = aFc1iSDK;
    }

    private boolean AFAdRevenueData() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void getCurrencyIso4217Code(boolean z) {
        this.getMediationNetwork = z;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final Map<String, Object> getMonetizationNetwork() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void getRevenue() {
        Context context;
        if (AFAdRevenueData() && (context = this.getRevenue.getMonetizationNetwork) != null) {
            this.AFAdRevenueData = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFb1zSDK.1
                    private /* synthetic */ Class getMonetizationNetwork;
                    private /* synthetic */ AFa1vSDK getRevenue;

                    AnonymousClass1() {
                        cls = cls;
                        aFa1vSDK = aFa1zSDK;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            Object obj2 = objArr[0];
                            if (obj2 != null) {
                                Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                                if (bundle2 != null) {
                                    string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                    string3 = bundle2.getString("target_url");
                                    Bundle bundle3 = bundle2.getBundle("extras");
                                    string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                                } else {
                                    string = null;
                                    string2 = null;
                                    string3 = null;
                                }
                                AFa1vSDK aFa1vSDK = aFa1vSDK;
                                if (aFa1vSDK != null) {
                                    aFa1vSDK.getRevenue(string2, string3, string);
                                }
                            } else {
                                AFa1vSDK aFa1vSDK2 = aFa1vSDK;
                                if (aFa1vSDK2 != null) {
                                    aFa1vSDK2.getRevenue(null, null, null);
                                }
                            }
                            return null;
                        }
                        AFa1vSDK aFa1vSDK3 = aFa1vSDK;
                        if (aFa1vSDK3 != null) {
                            aFa1vSDK3.AFAdRevenueData("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", TypedValues.Custom.S_STRING, context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK.AFAdRevenueData("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1zSDK.AFAdRevenueData(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1zSDK.AFAdRevenueData(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1zSDK.AFAdRevenueData(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1zSDK.AFAdRevenueData(e4.toString());
            }
        }
    }

    public static final class AFa1zSDK implements AFb1zSDK.AFa1vSDK {
        private /* synthetic */ long AFAdRevenueData;

        AFa1zSDK(long j) {
            this.AFAdRevenueData = j;
        }

        @Override // com.appsflyer.internal.AFb1zSDK.AFa1vSDK
        public final void getRevenue(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFa1bSDK.this.AFAdRevenueData;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFa1bSDK.this.AFAdRevenueData) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFa1bSDK.AFAdRevenueData;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFa1bSDK.this.AFAdRevenueData;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.AFAdRevenueData);
            Map<String, Object> map5 = AFa1bSDK.this.AFAdRevenueData;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }

        @Override // com.appsflyer.internal.AFb1zSDK.AFa1vSDK
        public final void AFAdRevenueData(String str) {
            Map<String, Object> map = AFa1bSDK.this.AFAdRevenueData;
            if (map != null) {
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            }
        }
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final boolean getCurrencyIso4217Code() {
        if (!AFAdRevenueData()) {
            return false;
        }
        Map<String, Object> map = this.AFAdRevenueData;
        return map == null || map.isEmpty();
    }
}
