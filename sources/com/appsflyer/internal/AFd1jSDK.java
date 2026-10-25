package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1jSDK {
    private final int getRevenue;

    public AFd1jSDK(int i) {
        this.getRevenue = i;
    }

    public final AFd1aSDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) throws IOException {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1cSDK.getRevenue();
            StringBuilder sb = new StringBuilder(new StringBuilder().append(aFd1cSDK.getRevenue).append(":").append(aFd1cSDK.getMonetizationNetwork).toString());
            byte[] revenue2 = aFd1cSDK.getRevenue();
            if (aFd1cSDK.getCurrencyIso4217Code() && revenue2 != null) {
                try {
                    sb.append("\n payload: ").append(aFd1cSDK.AFAdRevenueData() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset()));
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                    try {
                        AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1cSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(th).append("\n took ").append(aFd1hSDK.getRevenue).append("ms").toString()).toString(), th, false, false, false);
                        throw new HttpException(th, aFd1hSDK);
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.AFAdRevenueData.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1cSDK.hashCode()).append("] ").append((Object) sb).toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1cSDK.getMonetizationNetwork).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1cSDK.getRevenue);
                if (aFd1cSDK.getMonetizationNetwork()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1cSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i = this.getRevenue;
                    int i2 = aFd1cSDK.component4;
                    if (i2 != -1) {
                        i = i2;
                    }
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i);
                    httpURLConnection2.addRequestProperty("Content-Type", aFd1cSDK.AFAdRevenueData() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1cSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (revenue != null) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setRequestProperty("Content-Length", new StringBuilder().append(revenue.length).toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(revenue);
                                bufferedOutputStream2.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                    String mediationNetwork = "";
                    if (aFd1cSDK.getMediationNetwork()) {
                        mediationNetwork = getMediationNetwork(httpURLConnection2);
                    }
                    String str = mediationNetwork;
                    AFd1hSDK aFd1hSDK2 = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1cSDK.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection2.getResponseCode()).append(" ").append(httpURLConnection2.getResponseMessage()).append("\n body:").append(str).append("\n took ").append(aFd1hSDK2.getRevenue).append("ms").toString()).toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFd1aSDK<String> aFd1aSDK = new AFd1aSDK<>(str, httpURLConnection2.getResponseCode(), z, map, aFd1hSDK2);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return aFd1aSDK;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1hSDK aFd1hSDK3 = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1cSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(th).append("\n took ").append(aFd1hSDK3.getRevenue).append("ms").toString()).toString(), th, false, false, false);
                    throw new HttpException(th, aFd1hSDK3);
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : "", e, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            if (!z) {
                                sb.append('\n');
                            }
                            sb.append(line);
                            z = false;
                        } else {
                            String string = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            throw th;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
            throw th;
        }
        throw th;
    }
}
