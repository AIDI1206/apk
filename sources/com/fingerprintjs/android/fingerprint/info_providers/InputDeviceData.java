package com.fingerprintjs.android.fingerprint.info_providers;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InputDevicesInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceData;", "", "name", "", "vendor", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVendor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class InputDeviceData {
    private final String name;
    private final String vendor;

    public static /* synthetic */ InputDeviceData copy$default(InputDeviceData inputDeviceData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputDeviceData.name;
        }
        if ((i & 2) != 0) {
            str2 = inputDeviceData.vendor;
        }
        return inputDeviceData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    public final InputDeviceData copy(String name, String vendor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        return new InputDeviceData(name, vendor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDeviceData)) {
            return false;
        }
        InputDeviceData inputDeviceData = (InputDeviceData) other;
        return Intrinsics.areEqual(this.name, inputDeviceData.name) && Intrinsics.areEqual(this.vendor, inputDeviceData.vendor);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.vendor.hashCode();
    }

    public String toString() {
        return "InputDeviceData(name=" + this.name + ", vendor=" + this.vendor + ')';
    }

    public InputDeviceData(String name, String vendor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        this.name = name;
        this.vendor = vendor;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVendor() {
        return this.vendor;
    }
}
