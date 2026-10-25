package com.appsflyer.internal;

import com.google.android.exoplayer2.C;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AFa1kSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static int afDebugLog;
    private static int afErrorLog;
    private static long afInfoLog;
    private static int afLogForce;
    private static Object d;
    private static byte[] e;
    private static long force;
    public static final Map i;
    private static byte[] unregisterClient;
    private static long v;
    private static Object w;

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r9, int r10, int r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r9 = 1158 - r9
            int r10 = r10 + 33
            byte[] r1 = com.appsflyer.internal.AFa1kSDK.$$a
            int r11 = r11 + 1
            byte[] r2 = new byte[r11]
            r3 = 0
            if (r1 != 0) goto L1d
            int r4 = com.appsflyer.internal.AFa1kSDK.$12
            int r4 = r4 + 15
            int r5 = r4 % 128
            com.appsflyer.internal.AFa1kSDK.$13 = r5
            int r4 = r4 % r0
            r5 = r10
            r4 = r3
            r10 = r9
            goto L3c
        L1d:
            r4 = r10
            r10 = r9
            r9 = r4
            r4 = r3
        L21:
            byte r5 = (byte) r9
            r2[r4] = r5
            int r4 = r4 + 1
            if (r4 != r11) goto L2e
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2, r3)
            return r9
        L2e:
            r5 = r1[r10]
            int r6 = com.appsflyer.internal.AFa1kSDK.$12
            int r6 = r6 + 33
            int r7 = r6 % 128
            com.appsflyer.internal.AFa1kSDK.$13 = r7
            int r6 = r6 % r0
            r8 = r10
            r10 = r9
            r9 = r8
        L3c:
            int r9 = r9 + 1
            int r10 = r10 + r5
            int r10 = r10 + (-1)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1kSDK.$$c(short, int, int):java.lang.String");
    }

    static void init$0() {
        int i2 = 2 % 2;
        int i3 = $10 + 71;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = new byte[1172];
        System.arraycopy("e×!'\u000e÷\u000fþûüË:\fð\u0010ù\u0002û\u0011¼\u0016-þ\u0004\u0004\u000b\nñ\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u0013\u0006\u001dÐIÛò\b\t\u0001\rÿÂ4\u0010\u0001\u0004ô\u0007\u000eí\u000e\u000e÷\u000fþûüË4\u0010\u0001¿\u0014#\u0012ö\u000eô\f\u0006Ü\u0015\u000bôý\u0004\u0013þ\u0001ô\n\u0007Î0\u0001ýþûÿ\u0014ö\u0007\u0000\u000e÷\u000fþûüË4\u0010\u0001¿\u00140\u0001Ø&\u0004ô\u0000\f\bÿ\u0010Ö&ü\föù\fÖ0\u0001ýþûÿ\u0014ö\u0007\u0000ÿ\u0010Ó$\u0004ú\u000fÒ&\nÿ\u0010Ð-ö\u0002ß\u001f\u0003\u0006þà&\nÿ\u0010Ð\u001f\u0003\u0006þà&\n6þ\u0014îÏ6þ\u0014îÏø\u0016ìÎ<\u0007À\u0019$\u0004úø\u0016ìÎ<\u0007ÀGú\u0004õ\u0006\nø\u0016ìÎ?ö\u000eúÈ&'û\u0002ò\tÿ\u0010Ý#þ\u0002ö\u000e\u0003\u0006\rö\u0002û\u0005ÿ\u0003\u0006þ\u000e÷\u000fþûüËB\u0005¼\u00154õ\u0004ùÁ3ð\u000e\u0002÷\u0007\u0000ò\b\u0015ë\u0006\u0007ÿ\u000eê\u001cø\fòì\u0007ë\tø\u0016ìÎ<\u0007À\u001c\u0007÷4ì\u0003\f\u0005ö\u0007\u0000\u0013þ\u0001ô\n\u0007á\u0016\u0005ùé\u001d\u0004\u0001þ\u000bø\u0016ìÎ<\u0007À\u0019$\u0004úë'\u0000ý\u0006\u0000à\"ÿôý\r\n\u0004\u0005óì\u0004î\t3\u0013\u0001ó\u0010\u0000½5\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u0006þ5Ï\u0006\u0001-\u0003Ë3Ñ5Ó\u0001\u0002\u0000*Íÿ\u0010ß\u0014\u000fý\u0007þò\u0003ø\u0016ìÎAø\u0010»(þûÿ\u0010Ý\u0012\u0014õø\u0016ìÎ<\u0007À\u00154ò\u0001\u0000\u000eô\u0000æ&\u0003\u0006\u0000à\"ÿôý\rø\u0016ìÎ<\u0007À\u001c&\u0003\u0006\u0000à\"ÿôý\rø\u0016ìÎ<\u0007À\u0017\u001e\u0014îé&\u0003\u0006\u0000à\"ÿôý\rôý\u0004ã0ø\u0001\u000eø\u0016ìÎ<\u0007À\u00158üòÝ2\u0001ð\u0019Ñ&\u0003\u0006\u0000à\"ÿôý\r\rÿÂ4\u0010\u0001\u0004ô\u0007\u000eí\u000e½<\u0006\u0007ò\u000eýô\fÃ\u0014\u0006&ÇFÞò\b\rÿÂ4\u0010\u0001\u0004ô\u0007\u000eí\u000e½<\u0006\u0007ò\u000eýô\fÃ\u0014\u0006\u001dÐIÛò\b\t\u0001ÿ\u0010Ð3þ\u0001ô\nö\u0017Ñ+ýÆÿ\u0000\u0007\r-ö\u0002ùÿ\bôý\u0004ó\u0010ß\u0014ý\u0004ì ÿ\u000eì\u0005í\tüø\fòÿ\u0010Óÿø\u0016ìÎ<\u0007À\u0019$\u0004úà\"\u000fñ\u0010ø\b\u0005ü\u0004\u0007ööþ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u0017\"\u0014Ï$\u0004ú\u0004ó\u0004á\"\u0014ÿ\u0010Î\"\u0012ýþ\n\u0000òì\u0012\u0014õ\u0002\bú\u0010òÿ\u0010Ð*ö\u0013\u0001Ú$ó\u0004\u0002\u000eø\u0016ìÎH\u0000ö\u0004ÃMð\b¿-\u0010\bÚ&\u0003\u0006\u0000à\"ÿôý\rÿ\u0010Û\u0018\u0014ýÒ*\u0007ÿ\bø\u0016ìÎH\u0000ö\u0004ÃMð\b¿-\u0010\bÖ*\u0007ÿ\bÿ\u0010à\u0017\u0012ìø\u0016ìÎ<\u0007À\u00158üòÝ2\u0001ð\u0019×'\u0000ý\u0006\u0000à\"ÿôý\rüÔ8üòÝ2\u0001ð\u0019ø\u0016ìÎ<\u0007À\u0016*\u0004\u0005óý\u0002\u000búþ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u001c&à\u0019\t\u0003\u0004\bÌ\"\u0014Ì*ö\u0013\u0001Ú$ó\u0004\u0002\u000eø\u0016ìÎAü\u0007À\u00158üòÞ4ò\u0001\u0000\u000eø\u0016ìÎ?ö\u000eúÈ\u0016*ö\u0013\u0001Ú$ó\u0004\u0002\u000eüð\u0010þ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u0015 \u0013óà\"\u0014Ì*ö\u0013\u0001Ú$ó\u0004\u0002\u000eò\u0014õå\u001e\u000b\u0002ô\u0014ö\u000eðè\u001eú\u0011ð\u0012\bÌ&\nôÿ\u0012ü\u0004øý\u000fô\u0014ö\u000eðè\u001eú\u0011ð\u0012\bØ\u0012\u0014õÞ(ú\tù\n\u0007\u0000ÿ\u0010Ð-ÿ\u0004\u0000\u0000ø\n\u0007á&øöì\té\t\u0004ó\u0004à*ö\u0013\u0001\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u0013\u0006\u001cÑ;éò\bÚQ3\u0013\u0001ó\u0010\u0000½5\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u00063þÕû\u0002\u0007ý\u0001/Ô0Í\bú\n*Ìì\bê\tG\u0002²Gü\f\u0001÷\u0000\u0003\t\t®Mú\u0002\u000f¶ÿ\u0010Ú\u0019\u0000\u0006ù\u0014ö\u0007\u0000á\u0018\u0010\u0004ù\u0004ú\u0006ü$ï\u0014\u0012ð\n\bñà\u001e\u0014î".getBytes(C.ISO88591_NAME), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 206;
        int i5 = $11 + 29;
        $10 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Failed to set immutable type for var: r10v91 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v91 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r12v117 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v117 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r2v105 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v105 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 77261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1kSDK.<clinit>():void");
    }

    public static int getMonetizationNetwork(int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = ((i4 | 91) << 1) - (i4 ^ 91);
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        Object obj = d;
        int i8 = ((i6 | 91) << 1) - (i6 ^ 91);
        $10 = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i6 + 97;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c((short) 590, bArr[264], bArr[634]), true, (ClassLoader) w).getMethod($$c((short) 558, bArr[564], bArr[92]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i12 = $11;
            int i13 = (i12 & 87) + (i12 | 87);
            $10 = i13 % 128;
            if (i13 % 2 == 0) {
                return iIntValue;
            }
            throw null;
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
        int i3 = $10;
        int i4 = ((i3 | 79) << 1) - (i3 ^ 79);
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = d;
        int i6 = ((i3 | 49) << 1) - (i3 ^ 49);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        try {
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c((short) 590, bArr[264], bArr[634]), true, (ClassLoader) w).getMethod($$c(bArr[113], bArr[634], bArr[4]), Object.class).invoke(obj2, obj)).intValue();
            int i8 = $10 + 51;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getCurrencyIso4217Code(int i2, char c, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = (i5 & 13) + (i5 | 13);
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        Object obj = d;
        int i7 = i5 + 13;
        int i8 = i7 % 128;
        $11 = i8;
        int i9 = i7 % 2;
        int i10 = (i8 & 93) + (i8 | 93);
        $10 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Character.valueOf(c), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((short) 590, bArr[264], bArr[634]), true, (ClassLoader) w);
            byte b = bArr[85];
            Object objInvoke = cls.getMethod($$c(b, bArr[564], b), Integer.TYPE, Character.TYPE, Integer.TYPE).invoke(obj, objArr);
            int i12 = $10;
            int i13 = (i12 & 25) + (i12 | 25);
            $11 = i13 % 128;
            int i14 = i13 % 2;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFa1kSDK() {
    }

    private static void getMediationNetwork(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10 + 61;
        $11 = i5 % 128;
        int i6 = i5 % 2;
    }
}
