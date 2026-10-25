package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScanContents.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen;", "Lcom/medicmedia/medilink/domain/model/ScanContents;", "Invalid", "NotActivate", "ApiRequestQrContents", "Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen$ApiRequestQrContents;", "Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen$Invalid;", "Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen$NotActivate;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ScanContentsTypeHyphen extends ScanContents {

    /* JADX INFO: compiled from: ScanContents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen$Invalid;", "Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Invalid implements ScanContentsTypeHyphen {
        public static final Invalid INSTANCE = new Invalid();

        private Invalid() {
        }
    }

    /* JADX INFO: compiled from: ScanContents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen$NotActivate;", "Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class NotActivate implements ScanContentsTypeHyphen {
        public static final NotActivate INSTANCE = new NotActivate();

        private NotActivate() {
        }
    }

    /* JADX INFO: compiled from: ScanContents.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen$ApiRequestQrContents;", "Lcom/medicmedia/medilink/domain/model/ScanContentsTypeHyphen;", OptionalModuleUtils.BARCODE, "", "<init>", "(Ljava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ApiRequestQrContents implements ScanContentsTypeHyphen {
        private final String barcode;

        public static /* synthetic */ ApiRequestQrContents copy$default(ApiRequestQrContents apiRequestQrContents, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiRequestQrContents.barcode;
            }
            return apiRequestQrContents.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBarcode() {
            return this.barcode;
        }

        public final ApiRequestQrContents copy(String barcode) {
            Intrinsics.checkNotNullParameter(barcode, "barcode");
            return new ApiRequestQrContents(barcode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiRequestQrContents) && Intrinsics.areEqual(this.barcode, ((ApiRequestQrContents) other).barcode);
        }

        public int hashCode() {
            return this.barcode.hashCode();
        }

        public String toString() {
            return "ApiRequestQrContents(barcode=" + this.barcode + ")";
        }

        public ApiRequestQrContents(String barcode) {
            Intrinsics.checkNotNullParameter(barcode, "barcode");
            this.barcode = barcode;
        }

        public final String getBarcode() {
            return this.barcode;
        }
    }
}
