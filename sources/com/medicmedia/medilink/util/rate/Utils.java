package com.medicmedia.medilink.util.rate;

import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J-\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/util/rate/Utils;", "", "<init>", "()V", "getDialogBuilder", "Landroid/app/AlertDialog$Builder;", "context", "Landroid/content/Context;", "themeResId", "", "getAppCompatDialogBuilder", "Landroidx/appcompat/app/AlertDialog$Builder;", "isPackagesExists", "", "", "targetPackages", "(Landroid/content/Context;[Ljava/lang/String;)[Ljava/lang/String;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Utils {
    public static final int $stable = 0;
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    @JvmStatic
    public static final AlertDialog.Builder getDialogBuilder(Context context, int themeResId) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (themeResId == 0) {
            return new AlertDialog.Builder(context);
        }
        return new AlertDialog.Builder(context, themeResId);
    }

    @JvmStatic
    public static final androidx.appcompat.app.AlertDialog.Builder getAppCompatDialogBuilder(Context context, int themeResId) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (themeResId == 0) {
            return new androidx.appcompat.app.AlertDialog.Builder(context);
        }
        return new androidx.appcompat.app.AlertDialog.Builder(context, themeResId);
    }

    @JvmStatic
    public static final String[] isPackagesExists(Context context, String[] targetPackages) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetPackages, "targetPackages");
        if (targetPackages.length == 0) {
            return Constants.Utils.EMPTY_STRING_ARRAY;
        }
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "getInstalledApplications(...)");
        if (targetPackages.length == 1) {
            String str = targetPackages[0];
            if (str != null && !Intrinsics.areEqual(str, "")) {
                Iterator<ApplicationInfo> it = installedApplications.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(targetPackages[0], it.next().packageName)) {
                        return new String[]{targetPackages[0]};
                    }
                }
            }
            return Constants.Utils.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : targetPackages) {
            if (str2 != null && !Intrinsics.areEqual(str2, "")) {
                Iterator<ApplicationInfo> it2 = installedApplications.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(str2, it2.next().packageName)) {
                        arrayList.add(str2);
                        break;
                    }
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
