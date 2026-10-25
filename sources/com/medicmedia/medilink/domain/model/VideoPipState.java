package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPipMode.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPipState;", "", "None", "Active", "Lcom/medicmedia/medilink/domain/model/VideoPipState$Active;", "Lcom/medicmedia/medilink/domain/model/VideoPipState$None;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoPipState {

    /* JADX INFO: compiled from: VideoPipMode.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPipState$None;", "Lcom/medicmedia/medilink/domain/model/VideoPipState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class None implements VideoPipState {
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof None)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -664931412;
        }

        public String toString() {
            return "None";
        }

        private None() {
        }
    }

    /* JADX INFO: compiled from: VideoPipMode.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPipState$Active;", "Lcom/medicmedia/medilink/domain/model/VideoPipState;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "<init>", "(Lcom/medicmedia/medilink/domain/model/VideoPipDestination;)V", "getDestination", "()Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Active implements VideoPipState {
        private final VideoPipDestination destination;

        public Active() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Active copy$default(Active active, VideoPipDestination videoPipDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                videoPipDestination = active.destination;
            }
            return active.copy(videoPipDestination);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoPipDestination getDestination() {
            return this.destination;
        }

        public final Active copy(VideoPipDestination destination) {
            return new Active(destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Active) && Intrinsics.areEqual(this.destination, ((Active) other).destination);
        }

        public int hashCode() {
            VideoPipDestination videoPipDestination = this.destination;
            if (videoPipDestination == null) {
                return 0;
            }
            return videoPipDestination.hashCode();
        }

        public String toString() {
            return "Active(destination=" + this.destination + ")";
        }

        public Active(VideoPipDestination videoPipDestination) {
            this.destination = videoPipDestination;
        }

        public /* synthetic */ Active(VideoPipDestination videoPipDestination, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : videoPipDestination);
        }

        public final VideoPipDestination getDestination() {
            return this.destination;
        }
    }
}
