package com.android.apksig;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes3.dex */
public interface SignerEngine {
    byte[] sign(byte[] data) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException;
}
