package org.zeroturnaround.zip;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class MaliciousZipException extends ZipException {
    public MaliciousZipException(File file, String str) {
        super("The file " + str + " is trying to leave the target output directory of " + file);
    }
}
