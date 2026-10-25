package org.zeroturnaround.zip;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.zeroturnaround.zip.commons.IOUtils;
import org.zeroturnaround.zip.extra.AsiExtraField;
import org.zeroturnaround.zip.extra.ExtraFieldUtils;
import org.zeroturnaround.zip.extra.ZipExtraField;
import org.zeroturnaround.zip.timestamps.TimestampStrategyFactory;

/* JADX INFO: loaded from: classes7.dex */
class ZipEntryUtil {
    private ZipEntryUtil() {
    }

    static ZipEntry copy(ZipEntry zipEntry) {
        return copy(zipEntry, null);
    }

    static ZipEntry copy(ZipEntry zipEntry, String str) {
        if (str == null) {
            str = zipEntry.getName();
        }
        ZipEntry zipEntry2 = new ZipEntry(str);
        if (zipEntry.getCrc() != -1) {
            zipEntry2.setCrc(zipEntry.getCrc());
        }
        if (zipEntry.getMethod() != -1) {
            zipEntry2.setMethod(zipEntry.getMethod());
        }
        if (zipEntry.getSize() >= 0) {
            zipEntry2.setSize(zipEntry.getSize());
        }
        if (zipEntry.getExtra() != null) {
            zipEntry2.setExtra(zipEntry.getExtra());
        }
        zipEntry2.setComment(zipEntry.getComment());
        zipEntry2.setTime(zipEntry.getTime());
        return zipEntry2;
    }

    static void copyEntry(ZipEntry zipEntry, InputStream inputStream, ZipOutputStream zipOutputStream) throws IOException {
        copyEntry(zipEntry, inputStream, zipOutputStream, true);
    }

    static void copyEntry(ZipEntry zipEntry, InputStream inputStream, ZipOutputStream zipOutputStream, boolean z) throws IOException {
        ZipEntry zipEntryCopy = copy(zipEntry);
        if (z) {
            TimestampStrategyFactory.getInstance().setTime(zipEntryCopy, zipEntry);
        } else {
            zipEntryCopy.setTime(System.currentTimeMillis());
        }
        addEntry(zipEntryCopy, new BufferedInputStream(inputStream), zipOutputStream);
    }

    static void addEntry(ZipEntry zipEntry, InputStream inputStream, ZipOutputStream zipOutputStream) throws IOException {
        zipOutputStream.putNextEntry(zipEntry);
        if (inputStream != null) {
            IOUtils.copy(inputStream, zipOutputStream);
        }
        zipOutputStream.closeEntry();
    }

    static ZipEntry fromFile(String str, File file) {
        ZipEntry zipEntry = new ZipEntry(str);
        if (!file.isDirectory()) {
            zipEntry.setSize(file.length());
        }
        zipEntry.setTime(file.lastModified());
        ZTFilePermissions permissions = ZTFilePermissionsUtil.getDefaultStategy().getPermissions(file);
        if (permissions != null) {
            setZTFilePermissions(zipEntry, permissions);
        }
        return zipEntry;
    }

    static boolean setZTFilePermissions(ZipEntry zipEntry, ZTFilePermissions zTFilePermissions) {
        try {
            List<ZipExtraField> list = ExtraFieldUtils.parse(zipEntry.getExtra());
            AsiExtraField firstAsiExtraField = getFirstAsiExtraField(list);
            if (firstAsiExtraField == null) {
                firstAsiExtraField = new AsiExtraField();
                list.add(firstAsiExtraField);
            }
            firstAsiExtraField.setDirectory(zipEntry.isDirectory());
            firstAsiExtraField.setMode(ZTFilePermissionsUtil.toPosixFileMode(zTFilePermissions));
            zipEntry.setExtra(ExtraFieldUtils.mergeLocalFileDataData(list));
            return true;
        } catch (java.util.zip.ZipException unused) {
            return false;
        }
    }

    static ZTFilePermissions getZTFilePermissions(ZipEntry zipEntry) {
        try {
            AsiExtraField firstAsiExtraField = getFirstAsiExtraField(ExtraFieldUtils.parse(zipEntry.getExtra()));
            if (firstAsiExtraField != null) {
                return ZTFilePermissionsUtil.fromPosixFileMode(firstAsiExtraField.getMode() & 511);
            }
            return null;
        } catch (java.util.zip.ZipException e) {
            throw new ZipException(e);
        }
    }

    private static AsiExtraField getFirstAsiExtraField(List<ZipExtraField> list) {
        AsiExtraField asiExtraField = null;
        for (ZipExtraField zipExtraField : list) {
            if (zipExtraField instanceof AsiExtraField) {
                asiExtraField = (AsiExtraField) zipExtraField;
            }
        }
        return asiExtraField;
    }
}
