package org.zeroturnaround.zip.transform;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.zeroturnaround.zip.ByteSource;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class StringZipEntryTransformer implements ZipEntryTransformer {
    private final String encoding;

    protected abstract String transform(ZipEntry zipEntry, String str) throws IOException;

    public StringZipEntryTransformer() {
        this(null);
    }

    public StringZipEntryTransformer(String str) {
        this.encoding = str;
    }

    @Override // org.zeroturnaround.zip.transform.ZipEntryTransformer
    public void transform(InputStream inputStream, ZipEntry zipEntry, ZipOutputStream zipOutputStream) throws IOException {
        String strTransform = transform(zipEntry, IOUtils.toString(inputStream, this.encoding));
        String str = this.encoding;
        ZipEntrySourceZipEntryTransformer.addEntry(new ByteSource(zipEntry.getName(), str == null ? strTransform.getBytes() : strTransform.getBytes(str)), zipOutputStream);
    }
}
