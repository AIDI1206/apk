package com.aheaditec.talsec.security;

import android.security.keystore.KeyInfo;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends c0 {
    public d0(b0.a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
    }

    @Override // com.aheaditec.talsec.security.a0, com.aheaditec.talsec.security.z
    public /* bridge */ /* synthetic */ Key a() throws c4 {
        return super.a();
    }

    @Override // com.aheaditec.talsec.security.a0, com.aheaditec.talsec.security.z
    public /* bridge */ /* synthetic */ void b() throws c4 {
        super.b();
    }

    @Override // com.aheaditec.talsec.security.a0, com.aheaditec.talsec.security.z
    public boolean c() throws c4 {
        return e();
    }

    @Override // com.aheaditec.talsec.security.b0, com.aheaditec.talsec.security.z
    public boolean d() throws c4 {
        Key keyA = a();
        KeyInfo keyInfoA = a((SecretKey) keyA);
        a(keyA, keyInfoA);
        int securityLevel = keyInfoA.getSecurityLevel();
        return securityLevel == -1 || securityLevel == 1 || securityLevel == 2;
    }

    @Override // com.aheaditec.talsec.security.a0, com.aheaditec.talsec.security.z
    public /* bridge */ /* synthetic */ void remove() throws c4 {
        super.remove();
    }
}
