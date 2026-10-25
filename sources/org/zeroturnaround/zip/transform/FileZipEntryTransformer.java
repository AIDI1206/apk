package org.zeroturnaround.zip.transform;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.zeroturnaround.zip.FileSource;
import org.zeroturnaround.zip.commons.FileUtils;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FileZipEntryTransformer implements ZipEntryTransformer {
    protected abstract void transform(ZipEntry zipEntry, File file, File file2) throws IOException;

    @Override // org.zeroturnaround.zip.transform.ZipEntryTransformer
    public void transform(InputStream inputStream, ZipEntry zipEntry, ZipOutputStream zipOutputStream) throws Throwable {
        File file;
        File fileCreateTempFile = null;
        try {
            File fileCreateTempFile2 = File.createTempFile("zip", null);
            try {
                fileCreateTempFile = File.createTempFile("zip", null);
                copy(inputStream, fileCreateTempFile2);
                transform(zipEntry, fileCreateTempFile2, fileCreateTempFile);
                ZipEntrySourceZipEntryTransformer.addEntry(new FileSource(zipEntry.getName(), fileCreateTempFile), zipOutputStream);
                FileUtils.deleteQuietly(fileCreateTempFile2);
                FileUtils.deleteQuietly(fileCreateTempFile);
            } catch (Throwable th) {
                th = th;
                file = fileCreateTempFile;
                fileCreateTempFile = fileCreateTempFile2;
                FileUtils.deleteQuietly(fileCreateTempFile);
                FileUtils.deleteQuietly(file);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            file = null;
        }
    }

    private static void copy(InputStream inputStream, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            IOUtils.copy(inputStream, bufferedOutputStream);
        } finally {
            IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
        }
    }
}
