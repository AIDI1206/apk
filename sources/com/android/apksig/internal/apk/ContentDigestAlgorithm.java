package com.android.apksig.internal.apk;

/* JADX INFO: loaded from: classes3.dex */
public enum ContentDigestAlgorithm {
    CHUNKED_SHA256(1, "SHA-256", 32),
    CHUNKED_SHA512(2, "SHA-512", 64),
    VERITY_CHUNKED_SHA256(3, "SHA-256", 32),
    SHA256(4, "SHA-256", 32);

    private final int mChunkDigestOutputSizeBytes;
    private final int mId;
    private final String mJcaMessageDigestAlgorithm;

    ContentDigestAlgorithm(int id, String jcaMessageDigestAlgorithm, int chunkDigestOutputSizeBytes) {
        this.mId = id;
        this.mJcaMessageDigestAlgorithm = jcaMessageDigestAlgorithm;
        this.mChunkDigestOutputSizeBytes = chunkDigestOutputSizeBytes;
    }

    public int getId() {
        return this.mId;
    }

    String getJcaMessageDigestAlgorithm() {
        return this.mJcaMessageDigestAlgorithm;
    }

    int getChunkDigestOutputSizeBytes() {
        return this.mChunkDigestOutputSizeBytes;
    }
}
