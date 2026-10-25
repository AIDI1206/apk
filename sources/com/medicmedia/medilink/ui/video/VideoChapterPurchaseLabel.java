package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.ui.theme.VideoChapterPurchaseColors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoChapterPurchaseLabel;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "getLabel", "()Ljava/lang/String;", "colors", "Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;", "getColors", "()Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;", "NotPurchase", "LimitDate", "Lcom/medicmedia/medilink/ui/video/VideoChapterPurchaseLabel$LimitDate;", "Lcom/medicmedia/medilink/ui/video/VideoChapterPurchaseLabel$NotPurchase;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoChapterPurchaseLabel {
    VideoChapterPurchaseColors getColors();

    String getLabel();

    /* JADX INFO: compiled from: VideoListItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoChapterPurchaseLabel$NotPurchase;", "Lcom/medicmedia/medilink/ui/video/VideoChapterPurchaseLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "colors", "Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;)V", "getLabel", "()Ljava/lang/String;", "getColors", "()Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class NotPurchase implements VideoChapterPurchaseLabel {
        public static final int $stable = 0;
        private final VideoChapterPurchaseColors colors;
        private final String label;

        public static /* synthetic */ NotPurchase copy$default(NotPurchase notPurchase, String str, VideoChapterPurchaseColors videoChapterPurchaseColors, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notPurchase.label;
            }
            if ((i & 2) != 0) {
                videoChapterPurchaseColors = notPurchase.colors;
            }
            return notPurchase.copy(str, videoChapterPurchaseColors);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VideoChapterPurchaseColors getColors() {
            return this.colors;
        }

        public final NotPurchase copy(String label, VideoChapterPurchaseColors colors) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new NotPurchase(label, colors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotPurchase)) {
                return false;
            }
            NotPurchase notPurchase = (NotPurchase) other;
            return Intrinsics.areEqual(this.label, notPurchase.label) && this.colors == notPurchase.colors;
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.colors.hashCode();
        }

        public String toString() {
            return "NotPurchase(label=" + this.label + ", colors=" + this.colors + ")";
        }

        public NotPurchase(String label, VideoChapterPurchaseColors colors) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(colors, "colors");
            this.label = label;
            this.colors = colors;
        }

        @Override // com.medicmedia.medilink.ui.video.VideoChapterPurchaseLabel
        public String getLabel() {
            return this.label;
        }

        public /* synthetic */ NotPurchase(String str, VideoChapterPurchaseColors videoChapterPurchaseColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? VideoChapterPurchaseColors.NOT_PURCHASE : videoChapterPurchaseColors);
        }

        @Override // com.medicmedia.medilink.ui.video.VideoChapterPurchaseLabel
        public VideoChapterPurchaseColors getColors() {
            return this.colors;
        }
    }

    /* JADX INFO: compiled from: VideoListItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoChapterPurchaseLabel$LimitDate;", "Lcom/medicmedia/medilink/ui/video/VideoChapterPurchaseLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "colors", "Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;)V", "getLabel", "()Ljava/lang/String;", "getColors", "()Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class LimitDate implements VideoChapterPurchaseLabel {
        public static final int $stable = 0;
        private final VideoChapterPurchaseColors colors;
        private final String label;

        public static /* synthetic */ LimitDate copy$default(LimitDate limitDate, String str, VideoChapterPurchaseColors videoChapterPurchaseColors, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitDate.label;
            }
            if ((i & 2) != 0) {
                videoChapterPurchaseColors = limitDate.colors;
            }
            return limitDate.copy(str, videoChapterPurchaseColors);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VideoChapterPurchaseColors getColors() {
            return this.colors;
        }

        public final LimitDate copy(String label, VideoChapterPurchaseColors colors) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new LimitDate(label, colors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitDate)) {
                return false;
            }
            LimitDate limitDate = (LimitDate) other;
            return Intrinsics.areEqual(this.label, limitDate.label) && this.colors == limitDate.colors;
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.colors.hashCode();
        }

        public String toString() {
            return "LimitDate(label=" + this.label + ", colors=" + this.colors + ")";
        }

        public LimitDate(String label, VideoChapterPurchaseColors colors) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(colors, "colors");
            this.label = label;
            this.colors = colors;
        }

        @Override // com.medicmedia.medilink.ui.video.VideoChapterPurchaseLabel
        public String getLabel() {
            return this.label;
        }

        public /* synthetic */ LimitDate(String str, VideoChapterPurchaseColors videoChapterPurchaseColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? VideoChapterPurchaseColors.LIMIT_DATE : videoChapterPurchaseColors);
        }

        @Override // com.medicmedia.medilink.ui.video.VideoChapterPurchaseLabel
        public VideoChapterPurchaseColors getColors() {
            return this.colors;
        }
    }
}
