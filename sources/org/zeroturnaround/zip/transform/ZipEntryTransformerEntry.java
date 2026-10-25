package org.zeroturnaround.zip.transform;

/* JADX INFO: loaded from: classes7.dex */
public class ZipEntryTransformerEntry {
    private final String path;
    private final ZipEntryTransformer transformer;

    public ZipEntryTransformerEntry(String str, ZipEntryTransformer zipEntryTransformer) {
        this.path = str;
        this.transformer = zipEntryTransformer;
    }

    public String getPath() {
        return this.path;
    }

    public ZipEntryTransformer getTransformer() {
        return this.transformer;
    }

    public String toString() {
        return this.path + "=" + this.transformer;
    }
}
