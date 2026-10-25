package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LicenseSerialItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ActivatedItem;", "", "licenseClass", "", "licenseName", "licenseCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLicenseClass", "()Ljava/lang/String;", "getLicenseName", "getLicenseCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ActivatedItem {
    private final String licenseClass;
    private final String licenseCode;
    private final String licenseName;

    public static /* synthetic */ ActivatedItem copy$default(ActivatedItem activatedItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activatedItem.licenseClass;
        }
        if ((i & 2) != 0) {
            str2 = activatedItem.licenseName;
        }
        if ((i & 4) != 0) {
            str3 = activatedItem.licenseCode;
        }
        return activatedItem.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLicenseClass() {
        return this.licenseClass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLicenseName() {
        return this.licenseName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLicenseCode() {
        return this.licenseCode;
    }

    public final ActivatedItem copy(String licenseClass, String licenseName, String licenseCode) {
        Intrinsics.checkNotNullParameter(licenseClass, "licenseClass");
        Intrinsics.checkNotNullParameter(licenseName, "licenseName");
        Intrinsics.checkNotNullParameter(licenseCode, "licenseCode");
        return new ActivatedItem(licenseClass, licenseName, licenseCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivatedItem)) {
            return false;
        }
        ActivatedItem activatedItem = (ActivatedItem) other;
        return Intrinsics.areEqual(this.licenseClass, activatedItem.licenseClass) && Intrinsics.areEqual(this.licenseName, activatedItem.licenseName) && Intrinsics.areEqual(this.licenseCode, activatedItem.licenseCode);
    }

    public int hashCode() {
        return (((this.licenseClass.hashCode() * 31) + this.licenseName.hashCode()) * 31) + this.licenseCode.hashCode();
    }

    public String toString() {
        return "ActivatedItem(licenseClass=" + this.licenseClass + ", licenseName=" + this.licenseName + ", licenseCode=" + this.licenseCode + ")";
    }

    public ActivatedItem(String licenseClass, String licenseName, String licenseCode) {
        Intrinsics.checkNotNullParameter(licenseClass, "licenseClass");
        Intrinsics.checkNotNullParameter(licenseName, "licenseName");
        Intrinsics.checkNotNullParameter(licenseCode, "licenseCode");
        this.licenseClass = licenseClass;
        this.licenseName = licenseName;
        this.licenseCode = licenseCode;
    }

    public final String getLicenseClass() {
        return this.licenseClass;
    }

    public final String getLicenseName() {
        return this.licenseName;
    }

    public final String getLicenseCode() {
        return this.licenseCode;
    }
}
