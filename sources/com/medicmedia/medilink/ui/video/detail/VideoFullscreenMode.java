package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: VideoDetailItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;", "", "Normal", "ManualFullscreen", "AutoFullscreen", "InfoExpanded", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$AutoFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$InfoExpanded;", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$ManualFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$Normal;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoFullscreenMode {

    /* JADX INFO: compiled from: VideoDetailItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$Normal;", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Normal implements VideoFullscreenMode {
        public static final int $stable = 0;
        public static final Normal INSTANCE = new Normal();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Normal)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1845093984;
        }

        public String toString() {
            return "Normal";
        }

        private Normal() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$ManualFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ManualFullscreen implements VideoFullscreenMode {
        public static final int $stable = 0;
        public static final ManualFullscreen INSTANCE = new ManualFullscreen();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualFullscreen)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1163610522;
        }

        public String toString() {
            return "ManualFullscreen";
        }

        private ManualFullscreen() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$AutoFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class AutoFullscreen implements VideoFullscreenMode {
        public static final int $stable = 0;
        public static final AutoFullscreen INSTANCE = new AutoFullscreen();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoFullscreen)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1045215875;
        }

        public String toString() {
            return "AutoFullscreen";
        }

        private AutoFullscreen() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode$InfoExpanded;", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class InfoExpanded implements VideoFullscreenMode {
        public static final int $stable = 0;
        public static final InfoExpanded INSTANCE = new InfoExpanded();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoExpanded)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -574483072;
        }

        public String toString() {
            return "InfoExpanded";
        }

        private InfoExpanded() {
        }
    }
}
