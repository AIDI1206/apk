package org.zeroturnaround.zip.timestamps;

import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public class PreJava8TimestampStrategy implements TimestampStrategy {
    @Override // org.zeroturnaround.zip.timestamps.TimestampStrategy
    public void setTime(ZipEntry zipEntry, ZipEntry zipEntry2) {
        long time = zipEntry2.getTime();
        if (time != -1) {
            zipEntry.setTime(time);
        }
    }
}
