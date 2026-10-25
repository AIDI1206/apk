package com.aheaditec.talsec.security;

import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class t0 extends d {
    public final String h;
    public final X509Certificate i;

    public t0(String str, X509Certificate x509Certificate) {
        this.h = str;
        this.i = x509Certificate;
    }

    @Override // com.aheaditec.talsec.security.d
    public /* bridge */ /* synthetic */ JSONObject a(X509Certificate x509Certificate) throws JSONException {
        return super.a(x509Certificate);
    }

    @Override // com.aheaditec.talsec.security.h2
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.h, a(this.i));
    }
}
