package com.aheaditec.talsec.security;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f265a;
    public final l2 b;

    public m4(l2 l2Var) {
        this.b = l2Var;
        this.f265a = l2Var.d();
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(this.f265a).asReadOnlyBuffer();
    }

    public final void b(int i, int i2) {
        byte[] bArr = this.f265a;
        bArr[i] = (byte) ((1 << i2) | bArr[i]);
    }

    public final void a(int i, int i2) {
        byte[] bArr = this.f265a;
        bArr[i] = (byte) ((~(1 << i2)) & bArr[i]);
    }

    public final void b() {
        this.b.a(this.f265a);
    }

    public void a(l4.a aVar, boolean z) {
        a(aVar.f263a, aVar.b, z);
    }

    public final void a(int i, int i2, boolean z) {
        if (z) {
            b(i, i2);
        } else {
            a(i, i2);
        }
        this.b.a(this.f265a);
    }
}
