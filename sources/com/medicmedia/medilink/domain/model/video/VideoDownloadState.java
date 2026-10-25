package com.medicmedia.medilink.domain.model.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: VideoDownloadState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "", "Downloading", "Complete", "Failure", "None", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$Complete;", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$Downloading;", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$Failure;", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$None;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoDownloadState {

    /* JADX INFO: compiled from: VideoDownloadState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$Downloading;", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "progress", "", "<init>", "(I)V", "getProgress", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Downloading implements VideoDownloadState {
        private final int progress;

        public static /* synthetic */ Downloading copy$default(Downloading downloading, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = downloading.progress;
            }
            return downloading.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        public final Downloading copy(int progress) {
            return new Downloading(progress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Downloading) && this.progress == ((Downloading) other).progress;
        }

        public int hashCode() {
            return Integer.hashCode(this.progress);
        }

        public String toString() {
            return "Downloading(progress=" + this.progress + ")";
        }

        public Downloading(int i) {
            this.progress = i;
        }

        public final int getProgress() {
            return this.progress;
        }
    }

    /* JADX INFO: compiled from: VideoDownloadState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$Complete;", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Complete implements VideoDownloadState {
        public static final Complete INSTANCE = new Complete();

        private Complete() {
        }
    }

    /* JADX INFO: compiled from: VideoDownloadState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$Failure;", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Failure implements VideoDownloadState {
        public static final Failure INSTANCE = new Failure();

        private Failure() {
        }
    }

    /* JADX INFO: compiled from: VideoDownloadState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState$None;", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class None implements VideoDownloadState {
        public static final None INSTANCE = new None();

        private None() {
        }
    }
}
