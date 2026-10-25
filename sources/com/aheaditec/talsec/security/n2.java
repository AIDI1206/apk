package com.aheaditec.talsec.security;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class n2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268a;
    public final JSONObject b;

    public n2(String str, JSONObject jSONObject) {
        this.f268a = str;
        if (jSONObject == null) {
            this.b = new JSONObject();
        } else {
            this.b = jSONObject;
        }
    }

    @Override // com.aheaditec.talsec.security.h2
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.f268a, this.b);
    }
}
