package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o3 extends e4 {
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public final String A;
    public final List<h2> B;
    public final List<h2> C;

    static {
        byte[] bArr = {66, -32, 12, -67, 94, -107, -85, 67, 55, -44, 82, Ascii.DLE, -41, 65, Framer.STDOUT_FRAME_PREFIX, -79, -46, 58, 2, 114, 54};
        c(bArr, new byte[]{36, -123, 109, -55, 43, -25, -50, Ascii.ETB, 82, -89, 38, 121, -71, 38, Framer.EXIT_FRAME_PREFIX, -42, -68, 85, 112, Ascii.ETB, 82});
        Charset charset = StandardCharsets.UTF_8;
        G = new String(bArr, charset).intern();
        byte[] bArr2 = {Framer.STDOUT_FRAME_PREFIX, -48, 106, 118};
        c(bArr2, new byte[]{88, -66, 12, Ascii.EM, -54, 123, 41, Ascii.CAN});
        F = new String(bArr2, charset).intern();
        byte[] bArr3 = {59, -104, -13, 116};
        c(bArr3, new byte[]{79, -31, -125, 17, -81, -74, Utf8.REPLACEMENT_BYTE, 84});
        E = new String(bArr3, charset).intern();
        byte[] bArr4 = {Ascii.CR, Framer.STDERR_FRAME_PREFIX, 10, 82, -16, -68, -42, -124, 9, -31, Ascii.SUB, -94, Ascii.EM, 62};
        c(bArr4, new byte[]{100, 92, 105, 59, -108, -39, -72, -16, 91, -124, 106, -51, 107, 74});
        D = new String(bArr4, charset).intern();
    }

    public o3(f2 f2Var, t1 t1Var, String str, List<h2> list, List<h2> list2, v0 v0Var, String str2, boolean z) {
        super(f2Var, t1Var, v0Var, str2, z);
        this.A = str;
        this.B = list;
        this.C = list2;
    }

    @Override // com.aheaditec.talsec.security.e4, com.aheaditec.talsec.security.k0
    public JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        if (this.B.isEmpty() && this.C.isEmpty()) {
            byte[] bArr = {94, -12, 110, -121, -64, 54, Framer.ENTER_FRAME_PREFIX, -110, Framer.STDIN_FRAME_PREFIX, 0, -8, -126, 58, Ascii.CAN, -59, -104, 2, -105, -110, -44};
            c(bArr, new byte[]{Ascii.FS, -107, 10, -89, -95, 68, 70, -25, SignedBytes.MAX_POWER_OF_TWO, 101, -106, -10, Ascii.SUB, 113, -85, -72, 72, -28, -3, -70});
            throw new JSONException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
        JSONObject jSONObjectC = c();
        byte[] bArr2 = {-55, 40, -81, 82, 121, -97, -124, Ascii.DC4, 98, 105, -38, -19, -1, -8};
        c(bArr2, new byte[]{-96, 70, -52, 59, Ascii.GS, -6, -22, 96, 48, 12, -86, -126, -115, -116});
        jSONObjectA.put(new String(bArr2, StandardCharsets.UTF_8).intern(), jSONObjectC);
        return jSONObjectA;
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!this.B.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (h2 h2Var : this.B) {
                if (h2Var != null) {
                    h2Var.a(jSONObject2);
                }
            }
            byte[] bArr = {-54, 80, 84, -46};
            c(bArr, new byte[]{-93, 62, Framer.STDERR_FRAME_PREFIX, -67, 103, -70, -65, Ascii.RS});
            jSONObject.put(new String(bArr, StandardCharsets.UTF_8).intern(), jSONObject2);
        }
        if (!this.C.isEmpty()) {
            JSONObject jSONObject3 = new JSONObject();
            for (h2 h2Var2 : this.C) {
                if (h2Var2 != null) {
                    h2Var2.a(jSONObject3);
                }
            }
            byte[] bArr2 = {127, -96, Base64.padSymbol, 54, Framer.STDOUT_FRAME_PREFIX, -19, -22, -121, -74, 90, Ascii.DLE, -126, -13, 44, 12, 112, 37, -86, 108, -83, 46};
            c(bArr2, new byte[]{Ascii.EM, -59, 92, 66, 68, -97, -113, -45, -45, 41, 100, -21, -99, 75, 69, Ascii.ETB, 75, -59, Ascii.RS, -56, 74});
            jSONObject.put(new String(bArr2, StandardCharsets.UTF_8).intern(), jSONObject3);
        }
        byte[] bArr3 = {-71, 82, -106, 83};
        c(bArr3, new byte[]{-51, 43, -26, 54, Ascii.SUB, -127, -120, -71});
        jSONObject.put(new String(bArr3, StandardCharsets.UTF_8).intern(), this.A);
        return jSONObject;
    }

    public static void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1850458006;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((16777216 & i3) * (i3 | 16777216)) + (((-16777217) & i3) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int i6 = (i5 - 1) - ((~i4) | i5);
            int i7 = (-1700147435) - ((i6 & 2) | (2028104049 - i6));
            switch ((-1363443157) ^ ((~i7) + ((i7 | 1) * 2))) {
                case -1940167324:
                    byte b = bArr3[i];
                    int i8 = ((byte) 0) - b;
                    bArr3[i] = (byte) (((byte) (b & (~i8))) - ((byte) ((~b) & i8)));
                    i3 = 614229416;
                    continue;
                case -360299937:
                    boolean z = (((double) ((byte) bArr3[i2])) > Double.NaN ? 1 : (((double) ((byte) bArr3[i2])) == Double.NaN ? 0 : -1)) > -1;
                    i3 = z ? 614229416 : z ? -1396193641 : 427928065;
                    i = i2;
                    continue;
                case 399486784:
                    return;
                case 585276366:
                    i3 = bArr.length > 0 ? 1985663266 : -1396193641;
                    bArr4 = bArr;
                    bArr3 = bArr2;
                    i2 = 0;
                    continue;
                case 1733787683:
                    byte b2 = bArr4[i];
                    byte b3 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b3 + b2)) - ((byte) (((byte) 2) * ((byte) (b3 & b2)))));
                    i2 = (i ^ 1) + ((i & 1) * 2);
                    if ((((i2 > bArr4.length ? 1 : (i2 == bArr4.length ? 0 : -1)) >>> 31) & 1) != 0) {
                        i3 = 1985663266;
                    }
                    break;
            }
            i3 = -1396193641;
        }
    }
}
