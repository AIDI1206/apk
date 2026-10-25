package com.aheaditec.talsec.security;

/* JADX INFO: loaded from: classes3.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f223a;
    public final boolean b;
    public final boolean c;
    public Long d = null;

    public b1(boolean z, boolean z2, boolean z3) {
        this.f223a = z;
        this.b = z2;
        this.c = z3;
    }

    public boolean a() {
        return this.c;
    }

    public Long b() {
        return this.d;
    }

    public boolean c() {
        return !this.f223a;
    }

    public boolean d() {
        return (this.f223a && this.b && this.c) ? false : true;
    }

    public void a(long j) {
        this.d = Long.valueOf(j);
    }
}
