package org.zeroturnaround.zip;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class ZTFileUtil {
    private ZTFileUtil() {
    }

    public static Collection<File> listFiles(File file) {
        return listFiles(file, null);
    }

    public static Collection<File> listFiles(File file, FileFilter fileFilter) {
        ArrayList arrayList = new ArrayList();
        if (file.isFile()) {
            return arrayList;
        }
        if (fileFilter == null) {
            fileFilter = new FileFilter() { // from class: org.zeroturnaround.zip.ZTFileUtil.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return true;
                }
            };
        }
        innerListFiles(file, arrayList, fileFilter);
        return arrayList;
    }

    private static void innerListFiles(File file, Collection<File> collection, FileFilter fileFilter) {
        String[] list = file.list();
        if (list != null) {
            for (String str : list) {
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    innerListFiles(file2, collection, fileFilter);
                } else if (fileFilter != null && fileFilter.accept(file2)) {
                    collection.add(file2);
                }
            }
        }
    }
}
