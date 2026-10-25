package org.zeroturnaround.zip;

/* JADX INFO: loaded from: classes7.dex */
public class ZipException extends RuntimeException {
    public ZipException(String str) {
        super(str);
    }

    public ZipException(Exception exc) {
        super(exc);
    }

    public ZipException(String str, Throwable th) {
        super(str, th);
    }
}
