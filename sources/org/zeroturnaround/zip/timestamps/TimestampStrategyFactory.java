package org.zeroturnaround.zip.timestamps;

import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public class TimestampStrategyFactory {
    public static boolean HAS_ZIP_ENTRY_FILE_TIME_METHODS = hasZipEntryFileTimeMethods();
    private static TimestampStrategy INSTANCE = getStrategy();

    private TimestampStrategyFactory() {
    }

    private static boolean hasZipEntryFileTimeMethods() {
        try {
            ZipEntry.class.getDeclaredMethod("getCreationTime", new Class[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static TimestampStrategy getStrategy() {
        if (HAS_ZIP_ENTRY_FILE_TIME_METHODS) {
            return new Java8TimestampStrategy();
        }
        return new PreJava8TimestampStrategy();
    }

    public static TimestampStrategy getInstance() {
        return INSTANCE;
    }
}
