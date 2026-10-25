package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1gSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFAdRevenueData = 0;
    private static int areAllFieldsValid = 1;
    private static int[] getCurrencyIso4217Code;
    private static int getMonetizationNetwork;
    private final Map<String, Object> getMediationNetwork;
    private final Context getRevenue;

    public AFc1gSDK(Map<String, Object> map, Context context) {
        this.getMediationNetwork = map;
        this.getRevenue = context;
        put(getMonetizationNetwork(), getCurrencyIso4217Code());
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        int i4 = $10 + 21;
        $11 = i4 % 128;
        Object charArray = str;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        aFk1pSDK.getMediationNetwork = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1pSDK.getRevenue = 0;
        while (aFk1pSDK.getRevenue < cArr.length) {
            jArr[aFk1pSDK.getRevenue] = (((long) cArr[aFk1pSDK.getRevenue]) ^ (((long) aFk1pSDK.getRevenue) * ((long) aFk1pSDK.getMediationNetwork))) ^ (AFAdRevenueData ^ 199061409475100049L);
            aFk1pSDK.getRevenue++;
        }
        char[] cArr2 = new char[length];
        aFk1pSDK.getRevenue = 0;
        while (aFk1pSDK.getRevenue < cArr.length) {
            int i5 = $11 + 97;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr2[aFk1pSDK.getRevenue] = (char) jArr[aFk1pSDK.getRevenue];
                i2 = aFk1pSDK.getRevenue;
            } else {
                cArr2[aFk1pSDK.getRevenue] = (char) jArr[aFk1pSDK.getRevenue];
                i2 = aFk1pSDK.getRevenue + 1;
            }
            aFk1pSDK.getRevenue = i2;
            int i6 = $10 + 95;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static StringBuilder getMediationNetwork(String... strArr) throws Exception {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(Integer.valueOf(strArr[i2].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < iIntValue; i3++) {
            int i4 = areAllFieldsValid;
            int i5 = i4 + 55;
            getMonetizationNetwork = i5 % 128;
            int i6 = i5 % 2;
            int length2 = strArr.length;
            int i7 = i4 + 47;
            getMonetizationNetwork = i7 % 128;
            int i8 = i7 % 2;
            Integer numValueOf = null;
            for (int i9 = 0; i9 < 3; i9++) {
                int iCharAt = strArr[i9].charAt(i3);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb;
    }

    private String getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = areAllFieldsValid + 3;
        getMonetizationNetwork = i2 % 128;
        int i3 = i2 % 2;
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("ٓ䛅蝏쟵П䒊蔱얶ˎ䍊菵쁹", 16530 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            a("ِ彗둽ങ戊", View.getDefaultSize(0, 0) + 22807, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                int i4 = getMonetizationNetwork + 29;
                areAllFieldsValid = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = new Object[1];
                a("ټ\u0cd4ጿᦋⳄ㌾㦊䳩", 2729 - View.MeasureSpec.getSize(0), objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(string2);
            sb.reverse();
            StringBuilder mediationNetwork = getMediationNetwork(string, string3, sb.toString());
            int length = mediationNetwork.length();
            if (length > 4) {
                mediationNetwork.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    mediationNetwork.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            b(new int[]{-269708407, 691550562}, Color.green(0) + 3, objArr4);
            mediationNetwork.insert(0, ((String) objArr4[0]).intern());
            return mediationNetwork.toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            b(new int[]{854565745, 306981016, 2092009709, 1211146027, -1997348285, -2069302082, -1014555636, -1115818356, 1491143540, 297822326, -891867092, 74755836, -538226225, -689317204, -1794805564, -1830683349, -1867036264, 1235626699, 1541426602, 1401202182}, 40 - Color.argb(0, 0, 0, 0), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, 1632684225, -344979390, -1051640727, -1500483547, 1921909678, 1197372451, 1709650531, 1369506269, 1275252993, 1437497808, 761424572, -1240279331}, 42 - (KeyEvent.getMaxKeyCode() >> 16), objArr6);
            AFLogger.afRDLog(sb2.append(((String) objArr6[0]).intern()).append(e).toString());
            Object[] objArr7 = new Object[1];
            b(new int[]{-2132896634, 840027810, -513331929, 1353535124}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getCurrencyIso4217Code;
        if (iArr2 != null) {
            int i3 = $10 + 61;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr3[i5] = (int) (((long) iArr2[i5]) ^ 3670241895213185600L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getCurrencyIso4217Code;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $11 + 57;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    iArr6[i6] = (int) (((long) iArr5[i6]) / 3670241895213185600L);
                    i6 >>= 1;
                } else {
                    iArr6[i6] = (int) (((long) iArr5[i6]) ^ 3670241895213185600L);
                    i6++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        while (aFk1kSDK.getCurrencyIso4217Code < iArr.length) {
            cArr[0] = (char) (iArr[aFk1kSDK.getCurrencyIso4217Code] >> 16);
            cArr[1] = (char) iArr[aFk1kSDK.getCurrencyIso4217Code];
            cArr[2] = (char) (iArr[aFk1kSDK.getCurrencyIso4217Code + 1] >> 16);
            cArr[3] = (char) iArr[aFk1kSDK.getCurrencyIso4217Code + 1];
            aFk1kSDK.AFAdRevenueData = (cArr[0] << 16) + cArr[1];
            aFk1kSDK.getMonetizationNetwork = (cArr[2] << 16) + cArr[3];
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i8 = 0; i8 < 16; i8++) {
                aFk1kSDK.AFAdRevenueData ^= iArr4[i8];
                aFk1kSDK.getMonetizationNetwork = AFk1kSDK.AFAdRevenueData(aFk1kSDK.AFAdRevenueData) ^ aFk1kSDK.getMonetizationNetwork;
                int i9 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = aFk1kSDK.getMonetizationNetwork;
                aFk1kSDK.getMonetizationNetwork = i9;
            }
            int i10 = aFk1kSDK.AFAdRevenueData;
            aFk1kSDK.AFAdRevenueData = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.getMonetizationNetwork = i10;
            aFk1kSDK.getMonetizationNetwork ^= iArr4[16];
            aFk1kSDK.AFAdRevenueData ^= iArr4[17];
            int i11 = aFk1kSDK.AFAdRevenueData;
            int i12 = aFk1kSDK.getMonetizationNetwork;
            cArr[0] = (char) (aFk1kSDK.AFAdRevenueData >>> 16);
            cArr[1] = (char) aFk1kSDK.AFAdRevenueData;
            cArr[2] = (char) (aFk1kSDK.getMonetizationNetwork >>> 16);
            cArr[3] = (char) aFk1kSDK.getMonetizationNetwork;
            AFk1kSDK.getMediationNetwork(iArr4);
            cArr2[aFk1kSDK.getCurrencyIso4217Code * 2] = cArr[0];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 1] = cArr[1];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 2] = cArr[2];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x01b1  */
    private String getCurrencyIso4217Code() {
        String string;
        int intExtra;
        int i;
        int i2 = 2 % 2;
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("ٓ䛅蝏쟵П䒊蔱얶ˎ䍊菵쁹", TextUtils.getCapsMode("", 0, 0) + 16529, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            b(new int[]{-2010068804, 540027562, -1611408693, 1290839385, -1409557867, 1221376410, 1124754813, -1552552339}, 15 - Drawable.resolveOpacity(0, 0), objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a("\u0604䏅趱힎ᅸ嬿", KeyEvent.keyCodeFromString("") + 17881, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new int[]{-500104792, -1719657709, -1010008550, 1926287854}, View.MeasureSpec.getMode(0) + 5, objArr4);
            string = new StringBuilder("").append(AFj1cSDK.getMonetizationNetwork(new StringBuilder().append(string2).append(string3).append(strIntern.replaceAll(((String) objArr4[0]).intern(), "")).toString()).substring(0, 16)).toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            b(new int[]{1412659751, -1225518006, 773104622, 1068029282, -141638432, 1353047013, 1075026864, 1832361899, -1682230360, 559510922, -697688254, 1914000959, 812386368, -220880964, 205571840, 667018555, -2049150556, -1682711385, -806296611, -80359859}, (Process.myTid() >> 22) + 38, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, -984596794, -978390891, 878183437, 2057824704, 1541426602, 1401202182, -1442141497, 1653693558, -345898809, 1573805036, 244475260, 1779591003}, TextUtils.lastIndexOf("", '0') + 45, objArr6);
            AFLogger.afRDLog(sb.append(((String) objArr6[0]).intern()).append(e).toString());
            StringBuilder sb2 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            b(new int[]{1526111022, -471598143, -1921753797, -132556607, -1402220075, -512792088, 445237066, 69508151, 892799620, -65302862}, View.resolveSize(0, 0) + 18, objArr7);
            string = sb2.append(((String) objArr7[0]).intern()).toString();
        }
        String str = string;
        try {
            Context context = this.getRevenue;
            Object[] objArr8 = new Object[1];
            a("ٓ⦩妼覟릉\ue992᧨䦯秳꧁\ud9d4\u09d0㤠椷饺줈更⤃奡襲른\ue905\u197e䥰碞ꢋ\ud895ࢷ㢧梬飇죑\uf8d3⣩壿蠈렂", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12276, objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            if (intentRegisterReceiver != null) {
                Object[] objArr9 = new Object[1];
                b(new int[]{-928491678, 1479704380, -891867092, 74755836, -1761205169, 1640230696}, TextUtils.indexOf((CharSequence) "", '0') + 12, objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            } else {
                intExtra = -2700;
            }
            String str2 = this.getRevenue.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                int i3 = areAllFieldsValid + 49;
                getMonetizationNetwork = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr10 = new Object[1];
                a("ي氡퉒", Gravity.getAbsoluteGravity(0, 0) + 27179, objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    int i5 = getMonetizationNetwork + 93;
                    areAllFieldsValid = i5 % 128;
                    int i6 = i5 % 2;
                    i = 1;
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            Context context2 = this.getRevenue;
            Object[] objArr11 = new Object[1];
            b(new int[]{39584719, 152510957, 1115452019, -1177671545}, KeyEvent.keyCodeFromString("") + 6, objArr11);
            int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            b(new int[]{-262877734, -1049246313}, -TextUtils.lastIndexOf("", '0', 0), objArr12);
            StringBuilder sbAppend = sb3.append(((String) objArr12[0]).intern()).append(intExtra);
            Object[] objArr13 = new Object[1];
            a("ؔ\ue32d", 58726 - ImageFormat.getBitsPerPixel(0), objArr13);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr13[0]).intern()).append(i);
            Object[] objArr14 = new Object[1];
            a("ؔ\uf1be", 63486 - TextUtils.lastIndexOf("", '0', 0), objArr14);
            StringBuilder sbAppend3 = sbAppend2.append(((String) objArr14[0]).intern()).append(size);
            Object[] objArr15 = new Object[1];
            b(new int[]{-400266022, -1154682097}, 1 - ImageFormat.getBitsPerPixel(0), objArr15);
            String string4 = sbAppend3.append(((String) objArr15[0]).intern()).append(this.getMediationNetwork.size()).toString();
            StringBuilder sbAppend4 = new StringBuilder().append(str);
            byte[] mediationNetwork = AFa1vSDK.getMediationNetwork(AFa1vSDK.getMonetizationNetwork(string4));
            StringBuilder sb4 = new StringBuilder();
            for (byte b : mediationNetwork) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() == 1) {
                    int i7 = getMonetizationNetwork + 23;
                    areAllFieldsValid = i7 % 128;
                    if (i7 % 2 == 0) {
                        "0".concat(String.valueOf(hexString));
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hexString = "0".concat(String.valueOf(hexString));
                }
                sb4.append(hexString);
            }
            return sbAppend4.append(sb4.toString()).toString();
        } catch (Exception e2) {
            Object[] objArr16 = new Object[1];
            b(new int[]{1412659751, -1225518006, 773104622, 1068029282, -1961924635, 1375008509, 776083721, -1573871477}, 16 - Color.red(0), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e2);
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, -984596794, -978390891, 878183437, 2057824704, 1541426602, 1401202182, -1442141497, 1653693558, -345898809, 1573805036, 244475260, 1779591003}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, objArr17);
            AFLogger.afRDLog(sb5.append(((String) objArr17[0]).intern()).append(e2).toString());
            StringBuilder sbAppend5 = new StringBuilder().append(str);
            Object[] objArr18 = new Object[1];
            b(new int[]{-683062148, -858043544, -2064842399, 815261139, 1867195511, 963766349, -1317296620, -449999879}, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr18);
            return sbAppend5.append(((String) objArr18[0]).intern()).toString();
        }
    }

    public static class AFa1vSDK {
        static byte[] getMonetizationNetwork(String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] getMediationNetwork(byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    static void getMediationNetwork() {
        AFAdRevenueData = -8351283963653293149L;
        getCurrencyIso4217Code = new int[]{442543737, -1490671600, 624544975, 963078580, -38548639, -1507093695, -433807488, 2027768116, 1333435861, -1679971940, -735591064, 871109200, 1542131051, 1882103064, 1923897460, -2041115963, 1803608463, -148454374};
    }

    static {
        getMediationNetwork();
        TextUtils.indexOf("", "");
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getScrollDefaultDelay();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getTapTimeout();
        ExpandableListView.getPackedPositionForGroup(0);
        int i = getMonetizationNetwork + 5;
        areAllFieldsValid = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
