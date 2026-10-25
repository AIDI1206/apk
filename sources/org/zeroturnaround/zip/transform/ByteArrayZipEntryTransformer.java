package org.zeroturnaround.zip.transform;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.zeroturnaround.zip.ByteSource;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ByteArrayZipEntryTransformer implements ZipEntryTransformer {
    protected boolean preserveTimestamps() {
        return false;
    }

    protected abstract byte[] transform(ZipEntry zipEntry, byte[] bArr) throws IOException;

    @Override // org.zeroturnaround.zip.transform.ZipEntryTransformer
    public void transform(InputStream inputStream, ZipEntry zipEntry, ZipOutputStream zipOutputStream) throws IOException {
        ByteSource byteSource;
        byte[] bArrTransform = transform(zipEntry, IOUtils.toByteArray(inputStream));
        if (preserveTimestamps()) {
            byteSource = new ByteSource(zipEntry.getName(), bArrTransform, zipEntry.getTime());
        } else {
            byteSource = new ByteSource(zipEntry.getName(), bArrTransform);
        }
        ZipEntrySourceZipEntryTransformer.addEntry(byteSource, zipOutputStream);
    }
}
