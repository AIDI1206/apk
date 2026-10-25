package org.zeroturnaround.zip;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public class ByteSource implements ZipEntrySource {
    private final byte[] bytes;
    private final int compressionMethod;
    private final long crc;
    private final String path;
    private final long time;

    public ByteSource(String str, byte[] bArr) {
        this(str, bArr, System.currentTimeMillis());
    }

    public ByteSource(String str, byte[] bArr, long j) {
        this(str, bArr, j, -1);
    }

    public ByteSource(String str, byte[] bArr, int i) {
        this(str, bArr, System.currentTimeMillis(), i);
    }

    public ByteSource(String str, byte[] bArr, long j, int i) {
        this.path = str;
        this.bytes = (byte[]) bArr.clone();
        this.time = j;
        this.compressionMethod = i;
        if (i != -1) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            this.crc = crc32.getValue();
            return;
        }
        this.crc = -1L;
    }

    @Override // org.zeroturnaround.zip.ZipEntrySource
    public String getPath() {
        return this.path;
    }

    @Override // org.zeroturnaround.zip.ZipEntrySource
    public ZipEntry getEntry() {
        ZipEntry zipEntry = new ZipEntry(this.path);
        byte[] bArr = this.bytes;
        if (bArr != null) {
            zipEntry.setSize(bArr.length);
        }
        int i = this.compressionMethod;
        if (i != -1) {
            zipEntry.setMethod(i);
        }
        long j = this.crc;
        if (j != -1) {
            zipEntry.setCrc(j);
        }
        zipEntry.setTime(this.time);
        return zipEntry;
    }

    @Override // org.zeroturnaround.zip.ZipEntrySource
    public InputStream getInputStream() throws IOException {
        if (this.bytes == null) {
            return null;
        }
        return new ByteArrayInputStream(this.bytes);
    }

    public String toString() {
        return "ByteSource[" + this.path + "]";
    }
}
