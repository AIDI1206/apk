package org.zeroturnaround.zip;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes7.dex */
class ZipFileUtil {
    private static final String CONSTRUCTOR_MESSAGE_FOR_INPUT = "Using constructor ZipInputStream(InputStream, Charset) has failed: ";
    private static final String CONSTRUCTOR_MESSAGE_FOR_OUTPUT = "Using constructor ZipOutputStream(OutputStream, Charset) has failed: ";
    private static final String CONSTRUCTOR_MESSAGE_FOR_ZIPFILE = "Using constructor ZipFile(File, Charset) has failed: ";
    private static final String MISSING_METHOD_PLEASE_UPGRADE = "Your JRE doesn't support the ZipFile Charset constructor. Please upgrade JRE to 1.7 use this feature. Tried constructor ZipFile(File, Charset).";

    private ZipFileUtil() {
    }

    static ZipInputStream createZipInputStream(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return new ZipInputStream(inputStream);
        }
        try {
            return (ZipInputStream) ZipInputStream.class.getConstructor(InputStream.class, Charset.class).newInstance(inputStream, charset);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_INPUT + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_INPUT + e2.getMessage(), e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_INPUT + e3.getMessage(), e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException(MISSING_METHOD_PLEASE_UPGRADE, e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_INPUT + e5.getMessage(), e5);
        }
    }

    static ZipOutputStream createZipOutputStream(BufferedOutputStream bufferedOutputStream, Charset charset) {
        if (charset == null) {
            return new ZipOutputStream(bufferedOutputStream);
        }
        try {
            return (ZipOutputStream) ZipOutputStream.class.getConstructor(OutputStream.class, Charset.class).newInstance(bufferedOutputStream, charset);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_OUTPUT + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_OUTPUT + e2.getMessage(), e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_OUTPUT + e3.getMessage(), e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException(MISSING_METHOD_PLEASE_UPGRADE, e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_OUTPUT + e5.getMessage(), e5);
        }
    }

    static ZipFile getZipFile(File file, Charset charset) throws IOException {
        if (charset == null) {
            return new ZipFile(file);
        }
        try {
            return (ZipFile) ZipFile.class.getConstructor(File.class, Charset.class).newInstance(file, charset);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_ZIPFILE + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_ZIPFILE + e2.getMessage(), e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_ZIPFILE + e3.getMessage(), e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException(MISSING_METHOD_PLEASE_UPGRADE, e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException(CONSTRUCTOR_MESSAGE_FOR_ZIPFILE + e5.getMessage(), e5);
        }
    }

    static boolean isCharsetSupported() throws IOException {
        try {
            ZipFile.class.getConstructor(File.class, Charset.class);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }
}
