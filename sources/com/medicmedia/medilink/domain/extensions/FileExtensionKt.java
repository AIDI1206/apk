package com.medicmedia.medilink.domain.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"deleteDir", "", "Ljava/io/File;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FileExtensionKt {
    public static final boolean deleteDir(File file) {
        String[] list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (file.isDirectory() && (list = file.list()) != null) {
            Iterator it = ArrayIteratorKt.iterator(list);
            while (it.hasNext()) {
                if (!deleteDir(new File(file, (String) it.next()))) {
                    return false;
                }
            }
        }
        return file.delete();
    }
}
