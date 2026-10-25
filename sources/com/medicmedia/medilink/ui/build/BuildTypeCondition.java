package com.medicmedia.medilink.ui.build;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuildTypeCondition.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/build/BuildTypeCondition;", "", "isTreatedAsMobileData", "Lkotlin/Function0;", "", "isQrLicenseCheckSkipped", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BuildTypeCondition {
    public static final int $stable = 0;
    private final Function0<Boolean> isQrLicenseCheckSkipped;
    private final Function0<Boolean> isTreatedAsMobileData;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuildTypeCondition copy$default(BuildTypeCondition buildTypeCondition, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = buildTypeCondition.isTreatedAsMobileData;
        }
        if ((i & 2) != 0) {
            function1 = buildTypeCondition.isQrLicenseCheckSkipped;
        }
        return buildTypeCondition.copy(function0, function1);
    }

    public final Function0<Boolean> component1() {
        return this.isTreatedAsMobileData;
    }

    public final Function0<Boolean> component2() {
        return this.isQrLicenseCheckSkipped;
    }

    public final BuildTypeCondition copy(Function0<Boolean> isTreatedAsMobileData, Function0<Boolean> isQrLicenseCheckSkipped) {
        Intrinsics.checkNotNullParameter(isTreatedAsMobileData, "isTreatedAsMobileData");
        Intrinsics.checkNotNullParameter(isQrLicenseCheckSkipped, "isQrLicenseCheckSkipped");
        return new BuildTypeCondition(isTreatedAsMobileData, isQrLicenseCheckSkipped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildTypeCondition)) {
            return false;
        }
        BuildTypeCondition buildTypeCondition = (BuildTypeCondition) other;
        return Intrinsics.areEqual(this.isTreatedAsMobileData, buildTypeCondition.isTreatedAsMobileData) && Intrinsics.areEqual(this.isQrLicenseCheckSkipped, buildTypeCondition.isQrLicenseCheckSkipped);
    }

    public int hashCode() {
        return (this.isTreatedAsMobileData.hashCode() * 31) + this.isQrLicenseCheckSkipped.hashCode();
    }

    public String toString() {
        return "BuildTypeCondition(isTreatedAsMobileData=" + this.isTreatedAsMobileData + ", isQrLicenseCheckSkipped=" + this.isQrLicenseCheckSkipped + ")";
    }

    public BuildTypeCondition(Function0<Boolean> isTreatedAsMobileData, Function0<Boolean> isQrLicenseCheckSkipped) {
        Intrinsics.checkNotNullParameter(isTreatedAsMobileData, "isTreatedAsMobileData");
        Intrinsics.checkNotNullParameter(isQrLicenseCheckSkipped, "isQrLicenseCheckSkipped");
        this.isTreatedAsMobileData = isTreatedAsMobileData;
        this.isQrLicenseCheckSkipped = isQrLicenseCheckSkipped;
    }

    public final Function0<Boolean> isTreatedAsMobileData() {
        return this.isTreatedAsMobileData;
    }

    public final Function0<Boolean> isQrLicenseCheckSkipped() {
        return this.isQrLicenseCheckSkipped;
    }
}
