package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1uSDK {
    public final String[] getMediationNetwork;

    public AFb1uSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.getMediationNetwork = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null && patternCompile.matcher(str).matches()) {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            } else {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            }
        }
        if (arrayList.contains(TtmlNode.COMBINE_ALL)) {
            this.getMediationNetwork = new String[]{TtmlNode.COMBINE_ALL};
        } else if (!arrayList.isEmpty()) {
            this.getMediationNetwork = (String[]) arrayList.toArray(new String[0]);
        } else {
            this.getMediationNetwork = null;
        }
    }
}
