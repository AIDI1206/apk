package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.medicmedia.medilink.MLConst;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class AFKeystoreWrapper {
    public KeyStore getCurrencyIso4217Code;
    private Context getMediationNetwork;
    public final Object getMonetizationNetwork = new Object();
    public String getRevenue = "";
    public int AFAdRevenueData = 0;

    public AFKeystoreWrapper(Context context) {
        this.getMediationNetwork = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.getCurrencyIso4217Code = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    public final boolean getRevenue() {
        boolean z;
        synchronized (this.getMonetizationNetwork) {
            KeyStore keyStore = this.getCurrencyIso4217Code;
            z = false;
            if (keyStore != null) {
                try {
                    Enumeration<String> enumerationAliases = keyStore.aliases();
                    while (enumerationAliases.hasMoreElements()) {
                        String strNextElement = enumerationAliases.nextElement();
                        if (strNextElement != null && AFAdRevenueData(strNextElement)) {
                            String[] strArrSplit = strNextElement.split(MLConst.MLCommon.COMMA);
                            if (strArrSplit.length != 3) {
                                break;
                            }
                            AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(String.valueOf(strNextElement)));
                            z = true;
                            String[] strArrSplit2 = strArrSplit[1].trim().split("=");
                            String[] strArrSplit3 = strArrSplit[2].trim().split("=");
                            if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                break;
                                break;
                            }
                            this.getRevenue = strArrSplit2[1].trim();
                            this.AFAdRevenueData = Integer.parseInt(strArrSplit3[1].trim());
                            break;
                        }
                    }
                } catch (Throwable th) {
                    AFLogger.afErrorLog(new StringBuilder("Couldn't list KeyStore Aliases: ").append(th.getClass().getName()).toString(), th);
                }
            }
        }
        return z;
    }

    public final void getRevenue(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.getMonetizationNetwork) {
                if (!this.getCurrencyIso4217Code.containsAlias(str)) {
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(keyGenParameterSpecBuild);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Exception ").append(th.getMessage()).append(" occurred").toString(), th);
        }
    }

    private static boolean AFAdRevenueData(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String getMediationNetwork() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.getMonetizationNetwork) {
            sb.append(this.getRevenue).append(",KSAppsFlyerRICounter=");
            sb.append(this.AFAdRevenueData);
        }
        return sb.toString();
    }

    public final String getMonetizationNetwork() {
        String str;
        synchronized (this.getMonetizationNetwork) {
            str = this.getRevenue;
        }
        return str;
    }

    public final int AFAdRevenueData() {
        int i;
        synchronized (this.getMonetizationNetwork) {
            i = this.AFAdRevenueData;
        }
        return i;
    }
}
