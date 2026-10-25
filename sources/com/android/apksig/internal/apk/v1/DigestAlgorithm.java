package com.android.apksig.internal.apk.v1;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public enum DigestAlgorithm {
    SHA1("SHA-1"),
    SHA256("SHA-256");

    public static Comparator<DigestAlgorithm> BY_STRENGTH_COMPARATOR = new StrengthComparator();
    private final String mJcaMessageDigestAlgorithm;

    DigestAlgorithm(String jcaMessageDigestAlgoritm) {
        this.mJcaMessageDigestAlgorithm = jcaMessageDigestAlgoritm;
    }

    String getJcaMessageDigestAlgorithm() {
        return this.mJcaMessageDigestAlgorithm;
    }

    private static class StrengthComparator implements Comparator<DigestAlgorithm> {
        private StrengthComparator() {
        }

        @Override // java.util.Comparator
        public int compare(DigestAlgorithm a1, DigestAlgorithm a2) {
            int iOrdinal = a1.ordinal();
            if (iOrdinal == 0) {
                int iOrdinal2 = a2.ordinal();
                if (iOrdinal2 == 0) {
                    return 0;
                }
                if (iOrdinal2 == 1) {
                    return -1;
                }
                throw new RuntimeException("Unsupported algorithm: " + a2);
            }
            if (iOrdinal == 1) {
                int iOrdinal3 = a2.ordinal();
                if (iOrdinal3 == 0) {
                    return 1;
                }
                if (iOrdinal3 == 1) {
                    return 0;
                }
                throw new RuntimeException("Unsupported algorithm: " + a2);
            }
            throw new RuntimeException("Unsupported algorithm: " + a1);
        }
    }
}
