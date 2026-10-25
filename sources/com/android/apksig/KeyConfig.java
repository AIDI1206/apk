package com.android.apksig;

import java.security.PrivateKey;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KeyConfig {
    public abstract <T> T match(Function<Jca, T> local, Function<Kms, T> kms);

    private KeyConfig() {
    }

    public static class Jca extends KeyConfig {
        public final PrivateKey privateKey;

        @Override // com.android.apksig.KeyConfig
        public <T> T match(Function<Jca, T> jca, Function<Kms, T> kms) {
            return jca.apply(this);
        }

        public Jca(PrivateKey privateKey) {
            super();
            this.privateKey = privateKey;
        }
    }

    public static class Kms extends KeyConfig {
        public final String keyAlias;
        public final String kmsType;

        @Override // com.android.apksig.KeyConfig
        public <T> T match(Function<Jca, T> jca, Function<Kms, T> kms) {
            return kms.apply(this);
        }

        public Kms(String kmsType, String keyAlias) {
            super();
            this.kmsType = kmsType;
            this.keyAlias = keyAlias;
        }
    }
}
