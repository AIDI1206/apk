package org.zeroturnaround.zip;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public interface ZipEntrySource {
    ZipEntry getEntry();

    InputStream getInputStream() throws IOException;

    String getPath();
}
