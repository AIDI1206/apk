package com.appsflyer.internal;

import com.google.android.exoplayer2.C;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AFi1jSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventParameterName;
    private static long afDebugLog;
    private static long afErrorLog;
    private static long afInfoLog;
    private static int afWarnLog;
    private static Object d;
    public static final Map e;
    private static int force;
    private static byte[] i;
    private static byte[] unregisterClient;
    private static int v;
    private static Object w;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(byte r8, byte r9, short r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r8 = r8 + 33
            int r1 = 49 - r9
            byte[] r2 = com.appsflyer.internal.AFi1jSDK.$$a
            int r10 = 1161 - r10
            byte[] r1 = new byte[r1]
            int r9 = 48 - r9
            r3 = 0
            if (r2 != 0) goto L16
            r5 = r9
            r8 = r10
            r4 = r3
            goto L2f
        L16:
            r4 = r3
        L17:
            byte r5 = (byte) r8
            r1[r4] = r5
            if (r4 != r9) goto L22
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r3)
            return r8
        L22:
            int r4 = r4 + 1
            r5 = r2[r10]
            int r6 = com.appsflyer.internal.AFi1jSDK.$12
            int r6 = r6 + 75
            int r7 = r6 % 128
            com.appsflyer.internal.AFi1jSDK.$13 = r7
            int r6 = r6 % r0
        L2f:
            int r10 = r10 + 1
            int r8 = r8 + r5
            int r5 = com.appsflyer.internal.AFi1jSDK.$12
            int r5 = r5 + 121
            int r6 = r5 % 128
            com.appsflyer.internal.AFi1jSDK.$13 = r6
            int r5 = r5 % r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.$$c(byte, byte, short):java.lang.String");
    }

    static void init$0() {
        int i2;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = (i4 ^ realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_FLX_SYNC) + ((i4 & realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_FLX_SYNC) << 1);
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            byte[] bArr = new byte[1170];
            System.arraycopy("\u000e\u0016«f\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»6\u000eï\u0016ê\u0001\nùÉ\u0016.ï\u0016ê\u0001\nùó\u000eüý\nïê!ñ\u0002\u0006\u000b\u0005\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È6ìñ\u0007\b\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿþ\u000fÒ#\u0003ù\u000eÑ%\tþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\tþ\u000fÏ\u001e\u0002\u0005ýß%\t5ý\u0013íÎ5ý\u0013íÎ÷\u0015ëÍ;\u0006¿\u0018#\u0003ù÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\t÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\bþ\u000fÜ\"ý\u0001õ\r\u0002\u0005\fõ\u0001ú\u0004þ\u0002\u0005ý\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿñ\u0007\u0014ê\u0005\u0006þ\ré\u001b÷\u000bñë\u0006ê\b÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\f\t\u0003\u0004òë\u0003í\b2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5Î\u0001\u0006)Ñ2Ôø\u0002\u0003ý\u0006ù0\u0001Êþ\u000fÞ\u0013\u000eü\u0006ýñ\u0002÷\u0015ëÍ@÷\u000fº'ýúþ\u000fÜ\u0011\u0013ô÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\fóü\u0003â/÷\u0000\r÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\f\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005%ÆEÝñ\u0007\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005#È6ìñ\u0007\b\u0000þ\u000fÏ2ý\u0000ó\tõ\u0016Ð*üÅþÿ\u0006\f,õ\u0001øþ\u0007óü\u0003ò\u000fÞ\u0013ü\u0003ë\u001fþ\rë\u0004ì\bû÷\u000bñþ\u000fÒþ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003\u0006õõý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\u0003ò\u0003à!\u0013þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\u0001\u0007ù\u000fñþ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Ù%\u0002\u0005ÿß!þóü\fþ\u000fÚ\u0017\u0013üÑ)\u0006þ\u0007÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Õ)\u0006þ\u0007þ\u000fß\u0016\u0011ë÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\fûÓ7ûñÜ1\u0000ï\u0018÷\u0015ëÍ;\u0006¿\u0015)\u0003\u0004òü\u0001\nùý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\rûï\u000fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rñ\u0013ôä\u001d\n\u0001ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000eó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿþ\u000fÏ,þ\u0003ÿÿ÷\t\u0006à%÷õë\bè\b\u0003ò\u0003ß)õ\u0012\u0000\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È9éñ\u0007ÙS2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0007,\u0004ÿ\u0001Òú4Í2Ë\u0003\u0002ü5Í1Éë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµþ\u000fÞ\u0013\u0011ï\t\u0007ð".getBytes(C.ISO88591_NAME), 0, bArr, 0, 1170);
            $$a = bArr;
            i2 = 74;
        } else {
            byte[] bArr2 = new byte[1170];
            System.arraycopy("\u000e\u0016«f\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»6\u000eï\u0016ê\u0001\nùÉ\u0016.ï\u0016ê\u0001\nùó\u000eüý\nïê!ñ\u0002\u0006\u000b\u0005\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È6ìñ\u0007\b\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿþ\u000fÒ#\u0003ù\u000eÑ%\tþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\tþ\u000fÏ\u001e\u0002\u0005ýß%\t5ý\u0013íÎ5ý\u0013íÎ÷\u0015ëÍ;\u0006¿\u0018#\u0003ù÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\t÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\bþ\u000fÜ\"ý\u0001õ\r\u0002\u0005\fõ\u0001ú\u0004þ\u0002\u0005ý\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿñ\u0007\u0014ê\u0005\u0006þ\ré\u001b÷\u000bñë\u0006ê\b÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\f\t\u0003\u0004òë\u0003í\b2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5Î\u0001\u0006)Ñ2Ôø\u0002\u0003ý\u0006ù0\u0001Êþ\u000fÞ\u0013\u000eü\u0006ýñ\u0002÷\u0015ëÍ@÷\u000fº'ýúþ\u000fÜ\u0011\u0013ô÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\fóü\u0003â/÷\u0000\r÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\f\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005%ÆEÝñ\u0007\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005#È6ìñ\u0007\b\u0000þ\u000fÏ2ý\u0000ó\tõ\u0016Ð*üÅþÿ\u0006\f,õ\u0001øþ\u0007óü\u0003ò\u000fÞ\u0013ü\u0003ë\u001fþ\rë\u0004ì\bû÷\u000bñþ\u000fÒþ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003\u0006õõý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\u0003ò\u0003à!\u0013þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\u0001\u0007ù\u000fñþ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Ù%\u0002\u0005ÿß!þóü\fþ\u000fÚ\u0017\u0013üÑ)\u0006þ\u0007÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Õ)\u0006þ\u0007þ\u000fß\u0016\u0011ë÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\fûÓ7ûñÜ1\u0000ï\u0018÷\u0015ëÍ;\u0006¿\u0015)\u0003\u0004òü\u0001\nùý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\rûï\u000fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rñ\u0013ôä\u001d\n\u0001ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000eó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿþ\u000fÏ,þ\u0003ÿÿ÷\t\u0006à%÷õë\bè\b\u0003ò\u0003ß)õ\u0012\u0000\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È9éñ\u0007ÙS2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0007,\u0004ÿ\u0001Òú4Í2Ë\u0003\u0002ü5Í1Éë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµþ\u000fÞ\u0013\u0011ï\t\u0007ð".getBytes(C.ISO88591_NAME), 0, bArr2, 0, 1170);
            $$a = bArr2;
            i2 = 56;
        }
        $$b = i2;
        int i6 = $11;
        int i7 = ((i6 | 115) << 1) - (i6 ^ 115);
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 80661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 8066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.<clinit>():void");
    }

    public static int getMediationNetwork(int i2) throws Throwable {
        int i3 = 2 % 2;
        Object obj = w;
        int i4 = $10 + 93;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        int i7 = (i5 & 67) + (i5 | 67);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[104]);
            byte b2 = bArr[18];
            return ((Integer) Class.forName($$c(b, b2, (short) ((b2 ^ 556) | (b2 & 556))), true, (ClassLoader) d).getMethod($$c(bArr[239], bArr[449], bArr[55]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMediationNetwork(Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = (i3 & 27) + (i3 | 27);
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object obj2 = w;
        int i7 = ((i5 | 47) << 1) - (i5 ^ 47);
        $11 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i5 + 69;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        try {
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[104]);
            byte b2 = bArr[18];
            int iIntValue = ((Integer) Class.forName($$c(b, b2, (short) ((b2 ^ 556) | (b2 & 556))), true, (ClassLoader) d).getMethod($$c(bArr[239], bArr[311], (short) 540), Object.class).invoke(obj2, obj)).intValue();
            int i11 = $11;
            int i12 = ((i11 | 83) << 1) - (i11 ^ 83);
            $10 = i12 % 128;
            int i13 = i12 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AFAdRevenueData(int i2, char c, int i3) throws Throwable {
        Object obj;
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = i5 + 99;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            obj = w;
            int i7 = 72 / 0;
        } else {
            obj = w;
        }
        int i8 = (i5 & 37) + (i5 | 37);
        $11 = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Character.valueOf(c), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[104]);
            byte b2 = bArr[18];
            Object objInvoke = Class.forName($$c(b, b2, (short) ((b2 ^ 556) | (b2 & 556))), true, (ClassLoader) d).getMethod($$c(bArr[239], bArr[449], bArr[55]), Integer.TYPE, Character.TYPE, Integer.TYPE).invoke(obj, objArr);
            int i10 = $10 + 65;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFi1jSDK() {
    }

    private static void getRevenue(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = (i5 & 97) + (i5 | 97);
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
    }
}
