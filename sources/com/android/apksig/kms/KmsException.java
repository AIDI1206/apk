package com.android.apksig.kms;

/* JADX INFO: loaded from: classes3.dex */
public class KmsException extends RuntimeException {
    private final String mKmsType;

    public KmsException(String kmsType, String message) {
        super(message);
        this.mKmsType = kmsType;
    }

    public KmsException(String kmsType, String message, Throwable cause) {
        super(message, cause);
        this.mKmsType = kmsType;
    }

    public KmsException(String kmsType, Throwable cause) {
        super(cause);
        this.mKmsType = kmsType;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "KMS " + this.mKmsType + " threw exception: " + super.getMessage();
    }
}
