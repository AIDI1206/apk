package com.aheaditec.talsec.security;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216a;
    public final List<String> b;

    public a1(String str, List<String> list) {
        this.f216a = str;
        if (list == null) {
            this.b = new ArrayList();
        } else {
            this.b = list;
        }
    }

    @Override // com.aheaditec.talsec.security.h2
    public void a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put(this.f216a, jSONArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (Objects.equals(this.f216a, a1Var.f216a) && Objects.equals(this.b, a1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f216a, this.b);
    }
}
