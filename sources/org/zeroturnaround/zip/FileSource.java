package org.zeroturnaround.zip;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes7.dex */
public class FileSource implements ZipEntrySource {
    private final File file;
    private final String path;

    public FileSource(String str, File file) {
        this.path = str;
        this.file = file;
    }

    @Override // org.zeroturnaround.zip.ZipEntrySource
    public String getPath() {
        return this.path;
    }

    @Override // org.zeroturnaround.zip.ZipEntrySource
    public ZipEntry getEntry() {
        return ZipEntryUtil.fromFile(this.path, this.file);
    }

    @Override // org.zeroturnaround.zip.ZipEntrySource
    public InputStream getInputStream() throws IOException {
        if (this.file.isDirectory()) {
            return null;
        }
        return new BufferedInputStream(new FileInputStream(this.file));
    }

    public String toString() {
        return "FileSource[" + this.path + ", " + this.file + "]";
    }

    public static FileSource[] pair(File[] fileArr, String[] strArr) {
        if (fileArr.length > strArr.length) {
            throw new IllegalArgumentException("names array must contain at least the same amount of items as files array or more");
        }
        FileSource[] fileSourceArr = new FileSource[fileArr.length];
        for (int i = 0; i < fileArr.length; i++) {
            fileSourceArr[i] = new FileSource(strArr[i], fileArr[i]);
        }
        return fileSourceArr;
    }
}
