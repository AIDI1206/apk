package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.medicmedia.medilink.MLConst;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1bSDK {
    public static Map<String, String> getRevenue(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                map2.put(URLEncoder.encode(entry.getKey(), MLConst.MedilinkUrls.UTF_8), URLEncoder.encode(entry.getValue(), MLConst.MedilinkUrls.UTF_8));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return map2;
    }
}
