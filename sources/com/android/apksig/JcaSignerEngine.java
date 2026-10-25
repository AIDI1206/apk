package com.android.apksig;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class JcaSignerEngine implements SignerEngine {
    private final AlgorithmParameterSpec mAlgorithmParameterSpec;
    private final PrivateKey mPrivateKey;
    private final String mSignatureAlgorithm;

    public JcaSignerEngine(PrivateKey privateKey, String signatureAlgorithm, AlgorithmParameterSpec algorithmParameterSpec) {
        if (privateKey == null) {
            throw new IllegalArgumentException("privateKey cannot be null");
        }
        if (signatureAlgorithm == null) {
            throw new IllegalArgumentException("signatureAlgorithm cannot be null");
        }
        this.mPrivateKey = privateKey;
        this.mSignatureAlgorithm = signatureAlgorithm;
        this.mAlgorithmParameterSpec = algorithmParameterSpec;
    }

    @Override // com.android.apksig.SignerEngine
    public byte[] sign(byte[] data) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        Signature signature = Signature.getInstance(this.mSignatureAlgorithm);
        signature.initSign(this.mPrivateKey);
        AlgorithmParameterSpec algorithmParameterSpec = this.mAlgorithmParameterSpec;
        if (algorithmParameterSpec != null) {
            signature.setParameter(algorithmParameterSpec);
        }
        signature.update(data);
        return signature.sign();
    }
}
