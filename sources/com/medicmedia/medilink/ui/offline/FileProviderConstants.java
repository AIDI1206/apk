package com.medicmedia.medilink.ui.offline;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OfflineContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/FileProviderConstants;", "", "<init>", "()V", "MINE_TYPE_PNG", "", "LABEL", "PROVIDER_EXTENSION", "defaultFileName", "mimeType", "format", "Landroid/graphics/Bitmap$CompressFormat;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FileProviderConstants {
    public static final int $stable = 0;
    public static final FileProviderConstants INSTANCE = new FileProviderConstants();
    public static final String LABEL = "image";
    public static final String MINE_TYPE_PNG = "image/png";
    public static final String PROVIDER_EXTENSION = ".provider";

    private FileProviderConstants() {
    }

    public final String defaultFileName(String mimeType) {
        return Intrinsics.areEqual(mimeType, MINE_TYPE_PNG) ? "preview_clipboard.png" : "preview_clipboard.jpg";
    }

    public final Bitmap.CompressFormat format(String mimeType) {
        return Intrinsics.areEqual(mimeType, MINE_TYPE_PNG) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
