package io.realm.kotlin.internal.platform;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.RealmInitializer;
import io.realm.kotlin.internal.RealmInstantImpl;
import io.realm.kotlin.internal.interop.SyncConnectionParams;
import io.realm.kotlin.internal.util.Exceptions;
import io.realm.kotlin.log.RealmLogger;
import io.realm.kotlin.types.RealmInstant;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.Clock;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SystemUtilsAndroid.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0014\u001a\u00020\u0007\u001a\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007\u001a\u0006\u0010\u001b\u001a\u00020\u001c\"\u0017\u0010\u0000\u001a\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0014\u0010\f\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0014\u0010\u0010\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0014\u0010\u0012\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t¨\u0006\u001d"}, d2 = {"RUNTIME", "Lio/realm/kotlin/internal/interop/SyncConnectionParams$Runtime;", "getRUNTIME$annotations", "()V", "getRUNTIME", "()Lio/realm/kotlin/internal/interop/SyncConnectionParams$Runtime;", "RUNTIME_VERSION", "", "getRUNTIME_VERSION", "()Ljava/lang/String;", "CPU_ARCH", "getCPU_ARCH", "OS_NAME", "getOS_NAME", "OS_VERSION", "getOS_VERSION", "DEVICE_MANUFACTURER", "getDEVICE_MANUFACTURER", "DEVICE_MODEL", "getDEVICE_MODEL", "appFilesDirectory", "assetFileAsStream", "Ljava/io/InputStream;", "assetFilename", "createDefaultSystemLogger", "Lio/realm/kotlin/log/RealmLogger;", "tag", "currentTime", "Lio/realm/kotlin/types/RealmInstant;", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SystemUtilsAndroidKt {
    private static final String CPU_ARCH;
    private static final String DEVICE_MANUFACTURER;
    private static final String DEVICE_MODEL;
    private static final String OS_NAME;
    private static final String OS_VERSION;
    private static final SyncConnectionParams.Runtime RUNTIME = SyncConnectionParams.Runtime.ANDROID;
    private static final String RUNTIME_VERSION = String.valueOf(Build.VERSION.SDK_INT);

    public static /* synthetic */ void getRUNTIME$annotations() {
    }

    public static final SyncConnectionParams.Runtime getRUNTIME() {
        return RUNTIME;
    }

    static {
        String str = Build.SUPPORTED_ABIS[0];
        Intrinsics.checkNotNull(str);
        CPU_ARCH = str;
        OS_NAME = "Android";
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        OS_VERSION = RELEASE;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        DEVICE_MANUFACTURER = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        DEVICE_MODEL = MODEL;
    }

    public static final String getRUNTIME_VERSION() {
        return RUNTIME_VERSION;
    }

    public static final String getCPU_ARCH() {
        return CPU_ARCH;
    }

    public static final String getOS_NAME() {
        return OS_NAME;
    }

    public static final String getOS_VERSION() {
        return OS_VERSION;
    }

    public static final String getDEVICE_MANUFACTURER() {
        return DEVICE_MANUFACTURER;
    }

    public static final String getDEVICE_MODEL() {
        return DEVICE_MODEL;
    }

    public static final String appFilesDirectory() {
        String absolutePath = RealmInitializer.INSTANCE.getFilesDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final InputStream assetFileAsStream(String assetFilename) {
        Intrinsics.checkNotNullParameter(assetFilename, "assetFilename");
        try {
            return RealmInitializer.INSTANCE.asset(assetFilename);
        } catch (FileNotFoundException e) {
            throw Exceptions.INSTANCE.assetFileNotFound(assetFilename, e);
        }
    }

    public static final RealmLogger createDefaultSystemLogger(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new LogCatLogger(tag);
    }

    public static final RealmInstant currentTime() {
        Instant instant = Clock.systemUTC().instant();
        return new RealmInstantImpl(instant.getEpochSecond(), instant.getNano());
    }
}
