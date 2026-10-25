package com.android.apksig.internal.util;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GuaranteedEncodedFormX509Certificate extends DelegatingX509Certificate {
    private static final long serialVersionUID = 1;
    private final byte[] mEncodedForm;
    private int mHash;

    public GuaranteedEncodedFormX509Certificate(X509Certificate wrapped, byte[] encodedForm) {
        super(wrapped);
        this.mHash = -1;
        this.mEncodedForm = encodedForm != null ? (byte[]) encodedForm.clone() : null;
    }

    @Override // com.android.apksig.internal.util.DelegatingX509Certificate, java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        byte[] bArr = this.mEncodedForm;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) o).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (this.mHash == -1) {
            try {
                this.mHash = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.mHash = 0;
            }
        }
        return this.mHash;
    }
}
