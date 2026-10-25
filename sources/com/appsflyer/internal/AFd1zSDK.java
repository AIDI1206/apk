package com.appsflyer.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\f\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFd1zSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "getMonetizationNetwork", "()Z", "Ljava/net/HttpURLConnection;", "AFAdRevenueData", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "getCurrencyIso4217Code", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/net/HttpURLConnection;J)Z", "[B", "getRevenue", "Lcom/appsflyer/internal/AFd1gSDK;", "()Lcom/appsflyer/internal/AFd1gSDK;", "Ljava/util/Map;", "getMediationNetwork", "Z", "I", "()Ljava/lang/String;", "component1"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class AFd1zSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public int getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public byte[] getRevenue;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public Map<String, String> getMediationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final boolean AFAdRevenueData;

    public abstract String getCurrencyIso4217Code();

    public abstract String getCurrencyIso4217Code(String str);

    /* JADX INFO: renamed from: getRevenue */
    public abstract AFd1gSDK getGetMonetizationNetwork();

    public AFd1zSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getRevenue = bArr;
        this.getMediationNetwork = map;
        this.getCurrencyIso4217Code = i;
        this.AFAdRevenueData = true;
    }

    /* JADX INFO: renamed from: getMediationNetwork, reason: from getter */
    public boolean getAFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    public final boolean getMonetizationNetwork() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String currencyIso4217Code = getCurrencyIso4217Code();
            Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
            URLConnection uRLConnectionOpenConnection = new URL(currencyIso4217Code).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                boolean monetizationNetwork = getMonetizationNetwork(httpURLConnection2, jCurrentTimeMillis);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return monetizationNetwork;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String currencyIso4217Code2 = getCurrencyIso4217Code("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + ("error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage()));
                    if (getAFAdRevenueData()) {
                        AFLogger.afRDLog(currencyIso4217Code2);
                    } else {
                        AFLogger.afVerboseLog(currencyIso4217Code2);
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean getMonetizationNetwork(HttpURLConnection httpURLConnection, long j) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ").append(new String(this.getRevenue, Charsets.UTF_8).length());
        Map<String, String> map = this.getMediationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
        }
        String currencyIso4217Code = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getAFAdRevenueData()) {
            AFLogger.afRDLog(currencyIso4217Code);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getCurrencyIso4217Code);
        httpURLConnection.setConnectTimeout(this.getCurrencyIso4217Code);
        httpURLConnection.addRequestProperty("Content-Type", getGetMonetizationNetwork().AFAdRevenueData);
        Map<String, String> map2 = this.getMediationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getRevenue.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getRevenue);
        bufferedOutputStream.close();
        String currencyIso4217Code2 = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + ("response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + AFAdRevenueData(httpURLConnection) + "\n\ttook " + (System.currentTimeMillis() - j) + "ms"));
        if (getAFAdRevenueData()) {
            AFLogger.afRDLog(currencyIso4217Code2);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code2);
        }
        return AFd1tSDK.getRevenue(httpURLConnection);
    }

    private static String AFAdRevenueData(HttpURLConnection p0) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p0.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th.getMessage();
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = p0.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strJoinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return strJoinToString$default == null ? "" : strJoinToString$default;
    }
}
