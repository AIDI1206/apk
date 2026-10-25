package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeviceItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DeviceItem;", "", "name", "", "date", "Ljava/util/Date;", "key", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getKey", "()Ljava/lang/String;", "deviceName", "getDeviceName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DeviceItem {
    private final Date date;
    private final String key;
    private final String name;

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getName() {
        return this.name;
    }

    public static /* synthetic */ DeviceItem copy$default(DeviceItem deviceItem, String str, Date date, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceItem.name;
        }
        if ((i & 2) != 0) {
            date = deviceItem.date;
        }
        if ((i & 4) != 0) {
            str2 = deviceItem.key;
        }
        return deviceItem.copy(str, date, str2);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final DeviceItem copy(String name, Date date, String key) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(key, "key");
        return new DeviceItem(name, date, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceItem)) {
            return false;
        }
        DeviceItem deviceItem = (DeviceItem) other;
        return Intrinsics.areEqual(this.name, deviceItem.name) && Intrinsics.areEqual(this.date, deviceItem.date) && Intrinsics.areEqual(this.key, deviceItem.key);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.date.hashCode()) * 31) + this.key.hashCode();
    }

    public String toString() {
        return "DeviceItem(name=" + this.name + ", date=" + this.date + ", key=" + this.key + ")";
    }

    public DeviceItem(String name, Date date, String key) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(key, "key");
        this.name = name;
        this.date = date;
        this.key = key;
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getDeviceName() {
        if (this.key.length() > 0) {
            return this.name;
        }
        return null;
    }
}
