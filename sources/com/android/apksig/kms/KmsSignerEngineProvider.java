package com.android.apksig.kms;

import com.android.apksig.KeyConfig;
import com.android.apksig.SignerEngine;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public interface KmsSignerEngineProvider {
    SignerEngine getInstance(KeyConfig.Kms kmsConfig, String jcaSignatureAlgorithm, AlgorithmParameterSpec algorithmParameterSpec);

    String getKmsType();
}
