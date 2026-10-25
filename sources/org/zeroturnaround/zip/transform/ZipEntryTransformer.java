package org.zeroturnaround.zip.transform;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public interface ZipEntryTransformer {
    void transform(InputStream inputStream, ZipEntry zipEntry, ZipOutputStream zipOutputStream) throws IOException;
}
