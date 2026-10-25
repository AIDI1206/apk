package org.zeroturnaround.zip;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
class ZipExceptionUtil {
    ZipExceptionUtil() {
    }

    static ZipException rethrow(IOException iOException) {
        throw new ZipException(iOException);
    }
}
