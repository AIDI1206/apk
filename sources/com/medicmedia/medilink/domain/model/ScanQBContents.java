package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScanContents.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanQBContents;", "Lcom/medicmedia/medilink/domain/model/ScanContents;", "NotConvert", "NotActivate", "Result", "Lcom/medicmedia/medilink/domain/model/ScanQBContents$NotActivate;", "Lcom/medicmedia/medilink/domain/model/ScanQBContents$NotConvert;", "Lcom/medicmedia/medilink/domain/model/ScanQBContents$Result;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ScanQBContents extends ScanContents {

    /* JADX INFO: compiled from: ScanContents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanQBContents$NotConvert;", "Lcom/medicmedia/medilink/domain/model/ScanQBContents;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class NotConvert implements ScanQBContents {
        public static final NotConvert INSTANCE = new NotConvert();

        private NotConvert() {
        }
    }

    /* JADX INFO: compiled from: ScanContents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanQBContents$NotActivate;", "Lcom/medicmedia/medilink/domain/model/ScanQBContents;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class NotActivate implements ScanQBContents {
        public static final NotActivate INSTANCE = new NotActivate();

        private NotActivate() {
        }
    }

    /* JADX INFO: compiled from: ScanContents.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanQBContents$Result;", "Lcom/medicmedia/medilink/domain/model/ScanQBContents;", OptionalModuleUtils.BARCODE, "", "<init>", "(Ljava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Result implements ScanQBContents {
        private final String barcode;

        public Result(String barcode) {
            Intrinsics.checkNotNullParameter(barcode, "barcode");
            this.barcode = barcode;
        }

        public final String getBarcode() {
            return this.barcode;
        }
    }
}
