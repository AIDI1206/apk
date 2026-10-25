package org.zeroturnaround.zip;

import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public interface ZipInfoCallback {
    void process(ZipEntry zipEntry) throws IOException;
}
