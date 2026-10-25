package com.medicmedia.medilink.ui.extension;

import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BundleExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"getSerialize", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Serializable;", "Landroid/os/Bundle;", "key", "", "clazz", "Ljava/lang/Class;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BundleExtensionKt {
    public static final <T extends Serializable> T getSerialize(Bundle bundle, String str, Class<T> clazz) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getSerializable(str, clazz);
        }
        T t = (T) bundle.getSerializable(str);
        if (t instanceof Serializable) {
            return t;
        }
        return null;
    }
}
