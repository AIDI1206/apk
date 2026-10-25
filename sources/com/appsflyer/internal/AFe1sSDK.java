package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFe1sSDK<Result> implements Comparable<AFe1sSDK<?>>, Callable<AFe1rSDK> {
    private static final AtomicInteger component4 = new AtomicInteger();
    public final Set<AFe1mSDK> AFAdRevenueData;
    private Throwable areAllFieldsValid;
    private final String component1;
    private final int component2;
    private long component3;
    public final Set<AFe1mSDK> getCurrencyIso4217Code;
    public AFe1rSDK getMediationNetwork;
    public final AFe1mSDK getMonetizationNetwork;
    public volatile int getRevenue;
    private boolean hashCode;

    protected abstract AFe1rSDK getCurrencyIso4217Code() throws Exception;

    protected void getCurrencyIso4217Code(Throwable th) {
    }

    protected abstract boolean getMediationNetwork();

    protected abstract long getMonetizationNetwork();

    public void getRevenue() {
    }

    public AFe1sSDK(AFe1mSDK aFe1mSDK, AFe1mSDK[] aFe1mSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getCurrencyIso4217Code = hashSet;
        this.AFAdRevenueData = new HashSet();
        int iIncrementAndGet = component4.incrementAndGet();
        this.component2 = iIncrementAndGet;
        this.hashCode = false;
        this.getRevenue = 0;
        this.getMonetizationNetwork = aFe1mSDK;
        Collections.addAll(hashSet, aFe1mSDKArr);
        if (str != null) {
            this.component1 = str;
        } else {
            this.component1 = String.valueOf(iIncrementAndGet);
        }
    }

    public void AFAdRevenueData() {
        this.hashCode = true;
    }

    protected final boolean areAllFieldsValid() {
        return this.hashCode;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: component2, reason: merged with bridge method [inline-methods] */
    public final AFe1rSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.getMediationNetwork = null;
        this.areAllFieldsValid = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.getRevenue++;
        try {
            AFe1rSDK currencyIso4217Code = getCurrencyIso4217Code();
            this.getMediationNetwork = currencyIso4217Code;
            this.component3 = System.currentTimeMillis() - jCurrentTimeMillis;
            getRevenue();
            return currencyIso4217Code;
        } catch (Throwable th) {
            try {
                this.areAllFieldsValid = th;
                this.getMediationNetwork = AFe1rSDK.FAILURE;
                getCurrencyIso4217Code(th);
                throw th;
            } catch (Throwable th2) {
                this.component3 = System.currentTimeMillis() - jCurrentTimeMillis;
                getRevenue();
                throw th2;
            }
        }
    }

    public final Throwable component4() {
        return this.areAllFieldsValid;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1sSDK<?> aFe1sSDK) {
        int i = this.getMonetizationNetwork.w - aFe1sSDK.getMonetizationNetwork.w;
        if (i != 0) {
            return i;
        }
        if (this.component1.equals(aFe1sSDK.component1)) {
            return 0;
        }
        return this.component2 - aFe1sSDK.component2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1sSDK aFe1sSDK = (AFe1sSDK) obj;
        if (this.getMonetizationNetwork != aFe1sSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component1.equals(aFe1sSDK.component1);
    }

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component1.hashCode();
    }

    public String toString() {
        String string = new StringBuilder().append(this.getMonetizationNetwork).append(HelpFormatter.DEFAULT_OPT_PREFIX).append(this.component1).toString();
        return !String.valueOf(this.component2).equals(this.component1) ? new StringBuilder().append(string).append(HelpFormatter.DEFAULT_OPT_PREFIX).append(this.component2).toString() : string;
    }
}
