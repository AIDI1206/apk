package com.medicmedia.medilink.util.rate;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppInformation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\r\u0012\u0004\b\f\u0010\u0003R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u0013\u0012\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u0013\u0012\u0004\b\u0015\u0010\u0003R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0003¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/util/rate/AppInformation;", "", "<init>", "()V", "packageInfoException", "", "applicationIconException", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon$annotations", "longVersionCode", "", "getLongVersionCode$annotations", "Ljava/lang/Long;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName$annotations", "versionCode", "", "getVersionCode$annotations", "Ljava/lang/Integer;", "versionCodeMajor", "getVersionCodeMajor$annotations", "versionName", "getVersionName$annotations", "getIcon", "context", "Landroid/content/Context;", "getLongVersionCode", "getPackageName", "getVersionCode", "getVersionCodeMajor", "getVersionName", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AppInformation {
    private static final String applicationIconException = "Failed to get app icon.";
    private static Drawable icon = null;
    private static Long longVersionCode = null;
    private static final String packageInfoException = "Failed to get app package info.";
    private static String packageName;
    private static Integer versionCode;
    private static Integer versionCodeMajor;
    private static String versionName;
    public static final AppInformation INSTANCE = new AppInformation();
    public static final int $stable = 8;

    @JvmStatic
    private static /* synthetic */ void getIcon$annotations() {
    }

    @JvmStatic
    private static /* synthetic */ void getLongVersionCode$annotations() {
    }

    @JvmStatic
    private static /* synthetic */ void getPackageName$annotations() {
    }

    @JvmStatic
    private static /* synthetic */ void getVersionCode$annotations() {
    }

    @JvmStatic
    private static /* synthetic */ void getVersionCodeMajor$annotations() {
    }

    @JvmStatic
    private static /* synthetic */ void getVersionName$annotations() {
    }

    private AppInformation() {
    }

    @JvmStatic
    public static final Drawable getIcon(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (icon == null) {
            try {
                icon = context.getPackageManager().getApplicationIcon(getPackageName(context));
            } catch (PackageManager.NameNotFoundException e) {
                Log.i(Constants.Utils.TAG, applicationIconException, e);
            }
        }
        return icon;
    }

    @JvmStatic
    public static final long getLongVersionCode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (longVersionCode == null) {
            try {
                longVersionCode = Long.valueOf(context.getPackageManager().getPackageInfo(getPackageName(context), 0).getLongVersionCode());
                Unit unit = Unit.INSTANCE;
            } catch (PackageManager.NameNotFoundException e) {
                Integer.valueOf(Log.i(Constants.Utils.TAG, packageInfoException, e));
            }
        }
        Long l = longVersionCode;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @JvmStatic
    public static final String getPackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (packageName == null) {
            packageName = context.getPackageName();
        }
        String str = packageName;
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final int getVersionCode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (versionCode == null) {
            versionCode = Integer.valueOf((int) (getLongVersionCode(context) & 4294967295L));
        }
        Integer num = versionCode;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @JvmStatic
    public static final int getVersionCodeMajor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (versionCodeMajor == null) {
            versionCodeMajor = Integer.valueOf((int) (getLongVersionCode(context) >>> 32));
        }
        Integer num = versionCodeMajor;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @JvmStatic
    public static final String getVersionName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (versionName == null) {
            try {
                versionName = context.getPackageManager().getPackageInfo(getPackageName(context), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                Log.i(Constants.Utils.TAG, packageInfoException, e);
            }
        }
        String str = versionName;
        return str == null ? "" : str;
    }
}
