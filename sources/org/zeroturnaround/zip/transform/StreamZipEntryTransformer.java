package org.zeroturnaround.zip.transform;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class StreamZipEntryTransformer implements ZipEntryTransformer {
    protected abstract void transform(ZipEntry zipEntry, InputStream inputStream, OutputStream outputStream) throws IOException;

    @Override // org.zeroturnaround.zip.transform.ZipEntryTransformer
    public void transform(InputStream inputStream, ZipEntry zipEntry, ZipOutputStream zipOutputStream) throws IOException {
        ZipEntry zipEntry2 = new ZipEntry(zipEntry.getName());
        zipEntry2.setTime(System.currentTimeMillis());
        zipOutputStream.putNextEntry(zipEntry2);
        transform(zipEntry, inputStream, zipOutputStream);
        zipOutputStream.closeEntry();
    }
}
