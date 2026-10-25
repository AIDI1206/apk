package com.aheaditec.talsec.security;

/* JADX INFO: loaded from: classes3.dex */
public class g4 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f239a;

    public g4(int i, String str) {
        super(str);
        this.f239a = i;
    }

    public int a() {
        return this.f239a;
    }

    public g4(int i, String str, Throwable th) {
        super(str, th);
        this.f239a = i;
    }
}
