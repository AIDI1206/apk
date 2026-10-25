package org.zeroturnaround.zip.timestamps;

import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public interface TimestampStrategy {
    void setTime(ZipEntry zipEntry, ZipEntry zipEntry2);
}
