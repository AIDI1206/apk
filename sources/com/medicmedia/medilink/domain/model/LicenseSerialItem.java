package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LicenseSerialItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/LicenseSerialItem;", "", "memberId", "", "serialCode", "", "activated", "", "Lcom/medicmedia/medilink/domain/model/ActivatedItem;", "errorItem", "Lcom/medicmedia/medilink/domain/model/SerialErrorItem;", "<init>", "(ILjava/lang/String;Ljava/util/List;Lcom/medicmedia/medilink/domain/model/SerialErrorItem;)V", "getMemberId", "()I", "getSerialCode", "()Ljava/lang/String;", "getActivated", "()Ljava/util/List;", "getErrorItem", "()Lcom/medicmedia/medilink/domain/model/SerialErrorItem;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LicenseSerialItem {
    private final List<ActivatedItem> activated;
    private final SerialErrorItem errorItem;
    private final int memberId;
    private final String serialCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LicenseSerialItem copy$default(LicenseSerialItem licenseSerialItem, int i, String str, List list, SerialErrorItem serialErrorItem, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = licenseSerialItem.memberId;
        }
        if ((i2 & 2) != 0) {
            str = licenseSerialItem.serialCode;
        }
        if ((i2 & 4) != 0) {
            list = licenseSerialItem.activated;
        }
        if ((i2 & 8) != 0) {
            serialErrorItem = licenseSerialItem.errorItem;
        }
        return licenseSerialItem.copy(i, str, list, serialErrorItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMemberId() {
        return this.memberId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSerialCode() {
        return this.serialCode;
    }

    public final List<ActivatedItem> component3() {
        return this.activated;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SerialErrorItem getErrorItem() {
        return this.errorItem;
    }

    public final LicenseSerialItem copy(int memberId, String serialCode, List<ActivatedItem> activated, SerialErrorItem errorItem) {
        Intrinsics.checkNotNullParameter(serialCode, "serialCode");
        Intrinsics.checkNotNullParameter(activated, "activated");
        return new LicenseSerialItem(memberId, serialCode, activated, errorItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LicenseSerialItem)) {
            return false;
        }
        LicenseSerialItem licenseSerialItem = (LicenseSerialItem) other;
        return this.memberId == licenseSerialItem.memberId && Intrinsics.areEqual(this.serialCode, licenseSerialItem.serialCode) && Intrinsics.areEqual(this.activated, licenseSerialItem.activated) && Intrinsics.areEqual(this.errorItem, licenseSerialItem.errorItem);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.memberId) * 31) + this.serialCode.hashCode()) * 31) + this.activated.hashCode()) * 31;
        SerialErrorItem serialErrorItem = this.errorItem;
        return iHashCode + (serialErrorItem == null ? 0 : serialErrorItem.hashCode());
    }

    public String toString() {
        return "LicenseSerialItem(memberId=" + this.memberId + ", serialCode=" + this.serialCode + ", activated=" + this.activated + ", errorItem=" + this.errorItem + ")";
    }

    public LicenseSerialItem(int i, String serialCode, List<ActivatedItem> activated, SerialErrorItem serialErrorItem) {
        Intrinsics.checkNotNullParameter(serialCode, "serialCode");
        Intrinsics.checkNotNullParameter(activated, "activated");
        this.memberId = i;
        this.serialCode = serialCode;
        this.activated = activated;
        this.errorItem = serialErrorItem;
    }

    public final int getMemberId() {
        return this.memberId;
    }

    public final String getSerialCode() {
        return this.serialCode;
    }

    public final List<ActivatedItem> getActivated() {
        return this.activated;
    }

    public final SerialErrorItem getErrorItem() {
        return this.errorItem;
    }
}
