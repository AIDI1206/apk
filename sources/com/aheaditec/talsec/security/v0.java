package com.aheaditec.talsec.security;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, u0> f298a = new HashMap(15);

    public synchronized JSONObject a() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, u0> entry : this.f298a.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().a());
        }
        return jSONObject;
    }

    public final void a(u0 u0Var, u0.a aVar, Long l) {
        if (l != null) {
            u0Var.a(aVar, l.longValue());
        } else {
            u0Var.a(aVar);
        }
    }

    public synchronized void a(String str, u0.a aVar, Long l) {
        u0 u0Var = this.f298a.get(str);
        if (u0Var == null) {
            this.f298a.put(str, new u0(aVar, l));
        } else if (l != null) {
            u0Var.a(aVar, l.longValue());
        } else {
            u0Var.a(aVar);
        }
    }
}
