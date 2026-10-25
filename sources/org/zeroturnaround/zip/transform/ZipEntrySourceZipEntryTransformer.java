package org.zeroturnaround.zip.transform;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.zeroturnaround.zip.ZipEntrySource;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ZipEntrySourceZipEntryTransformer implements ZipEntryTransformer {
    private final ZipEntrySource source;

    public ZipEntrySourceZipEntryTransformer(ZipEntrySource zipEntrySource) {
        this.source = zipEntrySource;
    }

    @Override // org.zeroturnaround.zip.transform.ZipEntryTransformer
    public void transform(InputStream inputStream, ZipEntry zipEntry, ZipOutputStream zipOutputStream) throws IOException {
        addEntry(this.source, zipOutputStream);
    }

    static void addEntry(ZipEntrySource zipEntrySource, ZipOutputStream zipOutputStream) throws IOException {
        zipOutputStream.putNextEntry(zipEntrySource.getEntry());
        InputStream inputStream = zipEntrySource.getInputStream();
        if (inputStream != null) {
            try {
                IOUtils.copy(inputStream, zipOutputStream);
                IOUtils.closeQuietly(inputStream);
            } catch (Throwable th) {
                IOUtils.closeQuietly(inputStream);
                throw th;
            }
        }
        zipOutputStream.closeEntry();
    }
}
