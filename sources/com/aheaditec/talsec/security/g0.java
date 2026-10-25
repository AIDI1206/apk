package com.aheaditec.talsec.security;

/* JADX INFO: loaded from: classes3.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String e;
    public final String f;
    public final String g;

    public g0(String str, a2.a aVar, String str2, String str3) {
        this.f237a = str;
        this.b = aVar.a();
        this.e = str2;
        String[] strArrC = aVar.c();
        this.c = strArrC;
        this.d = aVar.b() == null ? new String[0] : aVar.b();
        this.f = str3;
        this.g = strArrC.length > 0 ? strArrC[0] : null;
    }

    public String[] a() {
        return this.b;
    }

    public String[] b() {
        return this.c;
    }

    public String[] c() {
        return this.d;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.f237a;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.e;
    }
}
