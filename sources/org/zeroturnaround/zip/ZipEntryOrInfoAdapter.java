package org.zeroturnaround.zip;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
class ZipEntryOrInfoAdapter implements ZipEntryCallback, ZipInfoCallback {
    private final ZipEntryCallback entryCallback;
    private final ZipInfoCallback infoCallback;

    public ZipEntryOrInfoAdapter(ZipEntryCallback zipEntryCallback, ZipInfoCallback zipInfoCallback) {
        if ((zipEntryCallback != null && zipInfoCallback != null) || (zipEntryCallback == null && zipInfoCallback == null)) {
            throw new IllegalArgumentException("Only one of ZipEntryCallback and ZipInfoCallback must be specified together");
        }
        this.entryCallback = zipEntryCallback;
        this.infoCallback = zipInfoCallback;
    }

    @Override // org.zeroturnaround.zip.ZipInfoCallback
    public void process(ZipEntry zipEntry) throws IOException {
        this.infoCallback.process(zipEntry);
    }

    @Override // org.zeroturnaround.zip.ZipEntryCallback
    public void process(InputStream inputStream, ZipEntry zipEntry) throws IOException {
        ZipEntryCallback zipEntryCallback = this.entryCallback;
        if (zipEntryCallback != null) {
            zipEntryCallback.process(inputStream, zipEntry);
        } else {
            process(zipEntry);
        }
    }
}
