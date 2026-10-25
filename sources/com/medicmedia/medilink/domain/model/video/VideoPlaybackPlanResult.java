package com.medicmedia.medilink.domain.model.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayback.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult;", "", "Resolved", "InvalidTargetHash", "EmptyMediaItems", "TargetNotFound", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$EmptyMediaItems;", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$InvalidTargetHash;", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$Resolved;", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$TargetNotFound;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoPlaybackPlanResult {

    /* JADX INFO: compiled from: VideoPlayback.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$Resolved;", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult;", "plan", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlan;", "<init>", "(Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlan;)V", "getPlan", "()Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlan;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Resolved implements VideoPlaybackPlanResult {
        private final VideoPlaybackPlan plan;

        public static /* synthetic */ Resolved copy$default(Resolved resolved, VideoPlaybackPlan videoPlaybackPlan, int i, Object obj) {
            if ((i & 1) != 0) {
                videoPlaybackPlan = resolved.plan;
            }
            return resolved.copy(videoPlaybackPlan);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoPlaybackPlan getPlan() {
            return this.plan;
        }

        public final Resolved copy(VideoPlaybackPlan plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            return new Resolved(plan);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Resolved) && Intrinsics.areEqual(this.plan, ((Resolved) other).plan);
        }

        public int hashCode() {
            return this.plan.hashCode();
        }

        public String toString() {
            return "Resolved(plan=" + this.plan + ")";
        }

        public Resolved(VideoPlaybackPlan plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.plan = plan;
        }

        public final VideoPlaybackPlan getPlan() {
            return this.plan;
        }
    }

    /* JADX INFO: compiled from: VideoPlayback.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$InvalidTargetHash;", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class InvalidTargetHash implements VideoPlaybackPlanResult {
        public static final InvalidTargetHash INSTANCE = new InvalidTargetHash();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidTargetHash)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1367410262;
        }

        public String toString() {
            return "InvalidTargetHash";
        }

        private InvalidTargetHash() {
        }
    }

    /* JADX INFO: compiled from: VideoPlayback.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$EmptyMediaItems;", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class EmptyMediaItems implements VideoPlaybackPlanResult {
        public static final EmptyMediaItems INSTANCE = new EmptyMediaItems();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyMediaItems)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 503182889;
        }

        public String toString() {
            return "EmptyMediaItems";
        }

        private EmptyMediaItems() {
        }
    }

    /* JADX INFO: compiled from: VideoPlayback.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult$TargetNotFound;", "Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlanResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class TargetNotFound implements VideoPlaybackPlanResult {
        public static final TargetNotFound INSTANCE = new TargetNotFound();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetNotFound)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -125441440;
        }

        public String toString() {
            return "TargetNotFound";
        }

        private TargetNotFound() {
        }
    }
}
