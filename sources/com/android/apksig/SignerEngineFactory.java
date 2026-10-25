package com.android.apksig;

import com.android.apksig.kms.KmsException;
import com.android.apksig.kms.KmsSignerEngineProvider;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class SignerEngineFactory {
    private SignerEngineFactory() {
    }

    public static SignerEngine getImplementation(KeyConfig keyConfig, final String jcaSignatureAlgorithm, final AlgorithmParameterSpec algorithmParameterSpec) {
        return (SignerEngine) keyConfig.match(new Function() { // from class: com.android.apksig.SignerEngineFactory$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SignerEngineFactory.lambda$getImplementation$0(jcaSignatureAlgorithm, algorithmParameterSpec, (KeyConfig.Jca) obj);
            }
        }, new Function() { // from class: com.android.apksig.SignerEngineFactory$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SignerEngineFactory.getKmsImplementation((KeyConfig.Kms) obj, jcaSignatureAlgorithm, algorithmParameterSpec);
            }
        });
    }

    static /* synthetic */ SignerEngine lambda$getImplementation$0(String str, AlgorithmParameterSpec algorithmParameterSpec, KeyConfig.Jca jca) {
        return new JcaSignerEngine(jca.privateKey, str, algorithmParameterSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SignerEngine getKmsImplementation(KeyConfig.Kms keyConfig, String jcaSignatureAlgorithm, AlgorithmParameterSpec algorithmParameterSpec) {
        for (KmsSignerEngineProvider kmsSignerEngineProvider : ServiceLoader.load(KmsSignerEngineProvider.class)) {
            if (Objects.equals(kmsSignerEngineProvider.getKmsType(), keyConfig.kmsType)) {
                return kmsSignerEngineProvider.getInstance(keyConfig, jcaSignatureAlgorithm, algorithmParameterSpec);
            }
        }
        throw new KmsException(keyConfig.kmsType, "No SignerEngine implementation found on the classpath");
    }
}
