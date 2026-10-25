package org.zeroturnaround.zip.commons;

import com.medicmedia.medilink.MLConst;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class FileUtils extends FileUtilsV2_2 {
    public static void copy(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            IOUtils.copy(new BufferedInputStream(fileInputStream), outputStream);
        } finally {
            IOUtils.closeQuietly((InputStream) fileInputStream);
        }
    }

    public static void copy(InputStream inputStream, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            IOUtils.copy(inputStream, bufferedOutputStream);
        } finally {
            IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
        }
    }

    public static File getTempFileFor(File file) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            File file2 = new File(parentFile, name + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + i);
            if (!file2.exists()) {
                return file2;
            }
            i = i2;
        }
    }
}
