package com.medicmedia.medilink.ui.theme;

import androidx.compose.material3.TopAppBarColors;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MedilinkAppBarColors.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/theme/MedilinkAppBarColors;", "", "primary", "Landroidx/compose/material3/TopAppBarColors;", "surface", "<init>", "(Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarColors;)V", "getPrimary", "()Landroidx/compose/material3/TopAppBarColors;", "getSurface", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MedilinkAppBarColors {
    public static final int $stable = 0;
    private final TopAppBarColors primary;
    private final TopAppBarColors surface;

    public static /* synthetic */ MedilinkAppBarColors copy$default(MedilinkAppBarColors medilinkAppBarColors, TopAppBarColors topAppBarColors, TopAppBarColors topAppBarColors2, int i, Object obj) {
        if ((i & 1) != 0) {
            topAppBarColors = medilinkAppBarColors.primary;
        }
        if ((i & 2) != 0) {
            topAppBarColors2 = medilinkAppBarColors.surface;
        }
        return medilinkAppBarColors.copy(topAppBarColors, topAppBarColors2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TopAppBarColors getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TopAppBarColors getSurface() {
        return this.surface;
    }

    public final MedilinkAppBarColors copy(TopAppBarColors primary, TopAppBarColors surface) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(surface, "surface");
        return new MedilinkAppBarColors(primary, surface);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedilinkAppBarColors)) {
            return false;
        }
        MedilinkAppBarColors medilinkAppBarColors = (MedilinkAppBarColors) other;
        return Intrinsics.areEqual(this.primary, medilinkAppBarColors.primary) && Intrinsics.areEqual(this.surface, medilinkAppBarColors.surface);
    }

    public int hashCode() {
        return (this.primary.hashCode() * 31) + this.surface.hashCode();
    }

    public String toString() {
        return "MedilinkAppBarColors(primary=" + this.primary + ", surface=" + this.surface + ")";
    }

    public MedilinkAppBarColors(TopAppBarColors primary, TopAppBarColors surface) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.primary = primary;
        this.surface = surface;
    }

    public final TopAppBarColors getPrimary() {
        return this.primary;
    }

    public final TopAppBarColors getSurface() {
        return this.surface;
    }
}
