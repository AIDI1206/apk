package org.zeroturnaround.zip.timestamps;

import java.nio.file.attribute.FileTime;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public class Java8TimestampStrategy implements TimestampStrategy {
    @Override // org.zeroturnaround.zip.timestamps.TimestampStrategy
    public void setTime(ZipEntry zipEntry, ZipEntry zipEntry2) {
        FileTime creationTime = zipEntry2.getCreationTime();
        if (creationTime != null) {
            zipEntry.setCreationTime(creationTime);
        }
        FileTime lastModifiedTime = zipEntry2.getLastModifiedTime();
        if (lastModifiedTime != null) {
            zipEntry.setLastModifiedTime(lastModifiedTime);
        }
        FileTime lastAccessTime = zipEntry2.getLastAccessTime();
        if (lastAccessTime != null) {
            zipEntry.setLastAccessTime(lastAccessTime);
        }
    }
}
