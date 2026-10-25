package com.appsflyer.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1gSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1gSDK;)V", "", "getCurrencyIso4217Code", "(Ljava/lang/String;)Z", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "getMediationNetwork", "Ljava/util/Map;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFa1gSDK;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AFa1jSDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    final Map<String, Object> getMonetizationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    final AFa1gSDK getMediationNetwork;

    private AFa1jSDK(Map<String, Object> map, AFa1gSDK aFa1gSDK) {
        this.getMonetizationNetwork = map;
        this.getMediationNetwork = aFa1gSDK;
    }

    /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFa1gSDK);
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1jSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK$AFa1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1rSDK;", "p0", "Lcom/appsflyer/internal/AFa1jSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1rSDK;)Lcom/appsflyer/internal/AFa1jSDK;", "Lcom/appsflyer/internal/AFa1gSDK;", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFa1gSDK;)Lcom/appsflyer/internal/AFa1jSDK;"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static AFa1jSDK AFAdRevenueData(AFh1rSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Map<String, Object> map = p0.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1jSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        @JvmStatic
        public static AFa1jSDK getMonetizationNetwork(AFa1gSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new AFa1jSDK(new LinkedHashMap(), p0, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void getCurrencyIso4217Code(String p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.getMonetizationNetwork.put(p0, p1);
        AFa1gSDK aFa1gSDK = this.getMediationNetwork;
        if (aFa1gSDK != null) {
            aFa1gSDK.getMediationNetwork(this.getMonetizationNetwork);
        }
    }

    public final boolean getCurrencyIso4217Code(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.getMonetizationNetwork.containsKey(p0);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1gSDK);
    }

    @JvmStatic
    public static final AFa1jSDK getCurrencyIso4217Code(AFa1gSDK aFa1gSDK) {
        return Companion.getMonetizationNetwork(aFa1gSDK);
    }

    @JvmStatic
    public static final AFa1jSDK AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        return Companion.AFAdRevenueData(aFh1rSDK);
    }
}
