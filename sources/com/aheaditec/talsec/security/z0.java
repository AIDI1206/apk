package com.aheaditec.talsec.security;

import java.security.cert.X509Certificate;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class z0 extends d {
    public final String h;
    public final List<X509Certificate> i;

    public z0(String str, List<X509Certificate> list) {
        this.h = str;
        this.i = list;
    }

    @Override // com.aheaditec.talsec.security.d
    public /* bridge */ /* synthetic */ JSONObject a(X509Certificate x509Certificate) throws JSONException {
        return super.a(x509Certificate);
    }

    @Override // com.aheaditec.talsec.security.h2
    public void a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (X509Certificate x509Certificate : this.i) {
            if (x509Certificate != null) {
                jSONArray.put(a(x509Certificate));
            }
        }
        jSONObject.put(this.h, jSONArray);
    }
}
