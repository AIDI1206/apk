package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmInterop.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0017B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Lio/realm/kotlin/internal/interop/SyncConnectionParams;", "", "sdkVersion", "", "bundleId", RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, "device", "deviceVersion", "framework", "Lio/realm/kotlin/internal/interop/SyncConnectionParams$Runtime;", "frameworkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/kotlin/internal/interop/SyncConnectionParams$Runtime;Ljava/lang/String;)V", "sdkName", "getSdkName", "()Ljava/lang/String;", "getBundleId", "getSdkVersion", "getPlatformVersion", "getDevice", "getDeviceVersion", "getFramework", "getFrameworkVersion", "Runtime", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SyncConnectionParams {
    private final String bundleId;
    private final String device;
    private final String deviceVersion;
    private final String framework;
    private final String frameworkVersion;
    private final String platformVersion;
    private final String sdkName;
    private final String sdkVersion;

    public SyncConnectionParams(String sdkVersion, String bundleId, String platformVersion, String device, String deviceVersion, Runtime framework, String frameworkVersion) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(platformVersion, "platformVersion");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(deviceVersion, "deviceVersion");
        Intrinsics.checkNotNullParameter(framework, "framework");
        Intrinsics.checkNotNullParameter(frameworkVersion, "frameworkVersion");
        this.sdkName = "Kotlin";
        this.sdkVersion = sdkVersion;
        this.bundleId = bundleId;
        this.platformVersion = platformVersion;
        this.device = device;
        this.deviceVersion = deviceVersion;
        this.framework = framework.getDescription();
        this.frameworkVersion = frameworkVersion;
    }

    public final String getSdkName() {
        return this.sdkName;
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDeviceVersion() {
        return this.deviceVersion;
    }

    public final String getFramework() {
        return this.framework;
    }

    public final String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    /* JADX INFO: compiled from: RealmInterop.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/internal/interop/SyncConnectionParams$Runtime;", "", "description", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "JVM", "ANDROID", "NATIVE", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum Runtime {
        JVM("JVM"),
        ANDROID("Android"),
        NATIVE("Native");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final String description;

        public static EnumEntries<Runtime> getEntries() {
            return $ENTRIES;
        }

        Runtime(String str) {
            this.description = str;
        }

        public final String getDescription() {
            return this.description;
        }
    }
}
