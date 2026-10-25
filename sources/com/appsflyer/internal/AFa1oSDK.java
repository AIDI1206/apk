package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFa1oSDK {
    public Intent AFAdRevenueData;
    public final AFc1dSDK areAllFieldsValid;
    public long component3;
    public String[] component4;
    public String getCurrencyIso4217Code;
    public DeepLinkListener getMonetizationNetwork;
    public Map<String, String> getRevenue;
    public List<List<String>> getMediationNetwork = new ArrayList();
    public final List<String> component2 = new ArrayList();

    public AFa1oSDK(AFc1dSDK aFc1dSDK) {
        this.areAllFieldsValid = aFc1dSDK;
    }

    public final void e_(AFa1jSDK aFa1jSDK, Intent intent, Context context) {
        AFc1eSDK aFc1eSDK = (AFc1eSDK) this.areAllFieldsValid;
        if (context != null) {
            AFc1iSDK aFc1iSDK = aFc1eSDK.AFAdRevenueData;
            if (context != null) {
                aFc1iSDK.getMonetizationNetwork = context.getApplicationContext();
            }
        }
        if (!g_(intent, aFa1jSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.component2().getMediationNetwork("ddl_sent", false)) {
            AFa1pSDK aFa1pSDK = new AFa1pSDK();
            AFe1lSDK aFe1lSDKCopydefault = this.areAllFieldsValid.copydefault();
            aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFf1xSDK(aFa1pSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.component2().getCurrencyIso4217Code("ddl_sent", true);
    }

    public final void f_(AFa1jSDK aFa1jSDK, Uri uri) {
        AFe1aSDK aFe1aSDK = new AFe1aSDK(this, aFa1jSDK, uri, this.component2);
        AFe1lSDK aFe1lSDKCopydefault = this.areAllFieldsValid.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFe1aSDK));
        this.AFAdRevenueData = null;
    }

    private Uri h_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork != null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getRevenue(new DeepLinkResult(null, error));
        } else {
            getCurrencyIso4217Code(str);
        }
    }

    public final void getMediationNetwork(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink revenue = DeepLink.getRevenue(map);
                    revenue.getCurrencyIso4217Code.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(revenue, null);
                } catch (JSONException e) {
                    AFLogger.INSTANCE.e(AFg1cSDK.DDL, "Error occurred", e, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getRevenue(deepLinkResult);
                return;
            } catch (Throwable th) {
                getRevenue(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog(new StringBuilder("Calling onAppOpenAttribution with:\n").append(map.toString()).toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void getRevenue(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork != null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, new StringBuilder("Calling onDeepLinking with:\n").append(deepLinkResult.toString()).toString());
            try {
                this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFg1cSDK.DDL, "skipping, no callback registered");
    }

    private static void getCurrencyIso4217Code(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    public final void i_(AFa1jSDK aFa1jSDK, Uri uri, Uri uri2) {
        if (!aFa1jSDK.getCurrencyIso4217Code("af_deeplink")) {
            String string = uri.toString();
            if (string == null) {
                string = null;
            } else if (string.matches("fb\\d*?://authorize.*") && string.contains("access_token")) {
                int iIndexOf = string.indexOf(63);
                String strSubstring = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                if (strSubstring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (strSubstring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
                    } else {
                        arrayList.add(strSubstring);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str);
                        }
                    }
                    string = string.replace(strSubstring, sb.toString());
                }
            }
            String str2 = this.getCurrencyIso4217Code;
            if (str2 != null && this.getRevenue != null && string.contains(str2)) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getRevenue.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                String encodedQuery = builderBuildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1jSDK.getMonetizationNetwork.put("appended_query_params", encodedQuery);
                AFa1gSDK aFa1gSDK = aFa1jSDK.getMediationNetwork;
                if (aFa1gSDK != null) {
                    aFa1gSDK.getMediationNetwork(aFa1jSDK.getMonetizationNetwork);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1jSDK.getMonetizationNetwork.put("af_deeplink", string);
            AFa1gSDK aFa1gSDK2 = aFa1jSDK.getMediationNetwork;
            if (aFa1gSDK2 != null) {
                aFa1gSDK2.getMediationNetwork(aFa1jSDK.getMonetizationNetwork);
            }
        }
        final HashMap map = new HashMap();
        map.put("link", uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFj1iSDK.M_(this.areAllFieldsValid.AFInAppEventType().getMonetizationNetwork, map, uri);
        AFf1ySDK aFf1ySDK = new AFf1ySDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFf1ySDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1jSDK.getMonetizationNetwork.put("isBrandedDomain", bool);
            AFa1gSDK aFa1gSDK3 = aFa1jSDK.getMediationNetwork;
            if (aFa1gSDK3 != null) {
                aFa1gSDK3.getMediationNetwork(aFa1jSDK.getMonetizationNetwork);
            }
        }
        if (!aFf1ySDK.equals()) {
            this.areAllFieldsValid.d().getMediationNetwork(map);
            return;
        }
        aFf1ySDK.component2 = new AFf1ySDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1oSDK.5
            @Override // com.appsflyer.internal.AFf1ySDK.AFa1ySDK
            public final void getRevenue(String str3) {
                AFa1oSDK.this.AFAdRevenueData(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1ySDK.AFa1ySDK
            public final void getRevenue(Map<String, String> map2) {
                for (String str3 : map2.keySet()) {
                    map.put(str3, map2.get(str3));
                }
                AFa1oSDK.this.getMediationNetwork(map);
            }
        };
        AFe1lSDK aFe1lSDKCopydefault = this.areAllFieldsValid.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1ySDK));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    private boolean g_(Intent intent, AFa1jSDK aFa1jSDK) {
        String string;
        Uri uriH_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.AFAdRevenueData;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.getMediationNetwork.isEmpty() && extras != null) {
                for (List<String> list : this.getMediationNetwork) {
                    if (list == null) {
                        uriH_ = null;
                    } else {
                        Iterator<String> it = list.iterator();
                        if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                            uriH_ = h_(string, it);
                        } else {
                            uriH_ = null;
                        }
                    }
                    if (uriH_ != null) {
                        AFLogger.afDebugLog(new StringBuilder("Found deeplink in push payload at ").append(list.toString()).toString());
                        List<List<String>> list2 = this.getMediationNetwork;
                        Intrinsics.checkNotNullParameter("payloadKey", "");
                        Map<String, Object> revenue = AFa1tSDK.getRevenue(aFa1jSDK.getMonetizationNetwork);
                        Intrinsics.checkNotNullExpressionValue(revenue, "");
                        revenue.put("payloadKey", list2);
                        AFa1gSDK aFa1gSDK = aFa1jSDK.getMediationNetwork;
                        if (aFa1gSDK != null) {
                            aFa1gSDK.getMediationNetwork(aFa1jSDK.getMonetizationNetwork);
                        }
                        uri = uriH_;
                        break;
                    }
                }
            }
        }
        if (data != null) {
            AFj1jSDK aFj1jSDK = new AFj1jSDK(intent);
            if (!aFj1jSDK.getMonetizationNetwork("af_consumed")) {
                aFj1jSDK.I_("af_consumed", System.currentTimeMillis());
                f_(aFa1jSDK, data);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link: ").append(data.toString()).append(" w/af_consumed").toString());
            return false;
        }
        if (data2 != null) {
            AFj1jSDK aFj1jSDK2 = new AFj1jSDK(this.AFAdRevenueData);
            if (!aFj1jSDK2.getMonetizationNetwork("af_consumed")) {
                aFj1jSDK2.I_("af_consumed", System.currentTimeMillis());
                f_(aFa1jSDK, data2);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed trampoline deep link: ").append(data2.toString()).append(" w/af_consumed").toString());
            return false;
        }
        if (uri != null) {
            AFj1jSDK aFj1jSDK3 = new AFj1jSDK(intent);
            if (!aFj1jSDK3.getMonetizationNetwork("af_consumed")) {
                aFj1jSDK3.I_("af_consumed", System.currentTimeMillis());
                f_(aFa1jSDK, uri);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link from push: ").append(uri.toString()).append(" w/af_consumed").toString());
            return false;
        }
        AFLogger.afDebugLog("No deep link detected");
        return false;
    }
}
