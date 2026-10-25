package com.appsflyer.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFb1iSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1qSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;", "p1", "", "getCurrencyIso4217Code", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1qSDK;)V", "Ljava/lang/String;", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AFb1iSDK {
    public static final AFb1iSDK INSTANCE = new AFb1iSDK();

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private static String getMediationNetwork;

    private AFb1iSDK() {
    }

    @JvmStatic
    public static final synchronized void getCurrencyIso4217Code(String p0, AFc1qSDK p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getMediationNetwork = p0;
        p1.getCurrencyIso4217Code("CUSTOM_INSTALL_ID_APPLIED", true);
        p1.getMediationNetwork("AF_INSTALLATION", p0);
    }

    @JvmStatic
    public static final synchronized String getRevenue(AFc1qSDK p0) {
        String str;
        Intrinsics.checkNotNullParameter(p0, "");
        if (getMediationNetwork == null) {
            String strAFAdRevenueData = p0.AFAdRevenueData("AF_INSTALLATION", (String) null);
            if (strAFAdRevenueData == null) {
                strAFAdRevenueData = System.currentTimeMillis() + HelpFormatter.DEFAULT_OPT_PREFIX + Math.abs(new SecureRandom().nextLong());
                p0.getMediationNetwork("AF_INSTALLATION", strAFAdRevenueData);
            }
            getMediationNetwork = strAFAdRevenueData;
        }
        str = getMediationNetwork;
        Intrinsics.checkNotNull(str);
        return str;
    }
}
