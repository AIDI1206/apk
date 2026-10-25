package com.medicmedia.medilink.camera;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CameraScanResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/camera/CameraScanResult;", "", OptionalModuleUtils.BARCODE, "", "rect", "Landroid/graphics/RectF;", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;)V", "getBarcode", "()Ljava/lang/String;", "getRect", "()Landroid/graphics/RectF;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CameraScanResult {
    private final String barcode;
    private final RectF rect;

    public static /* synthetic */ CameraScanResult copy$default(CameraScanResult cameraScanResult, String str, RectF rectF, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraScanResult.barcode;
        }
        if ((i & 2) != 0) {
            rectF = cameraScanResult.rect;
        }
        return cameraScanResult.copy(str, rectF);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBarcode() {
        return this.barcode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RectF getRect() {
        return this.rect;
    }

    public final CameraScanResult copy(String barcode, RectF rect) {
        return new CameraScanResult(barcode, rect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraScanResult)) {
            return false;
        }
        CameraScanResult cameraScanResult = (CameraScanResult) other;
        return Intrinsics.areEqual(this.barcode, cameraScanResult.barcode) && Intrinsics.areEqual(this.rect, cameraScanResult.rect);
    }

    public int hashCode() {
        String str = this.barcode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RectF rectF = this.rect;
        return iHashCode + (rectF != null ? rectF.hashCode() : 0);
    }

    public String toString() {
        return "CameraScanResult(barcode=" + this.barcode + ", rect=" + this.rect + ")";
    }

    public CameraScanResult(String str, RectF rectF) {
        this.barcode = str;
        this.rect = rectF;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final RectF getRect() {
        return this.rect;
    }
}
