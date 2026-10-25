package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.VideoPDFFile;
import com.medicmedia.medilink.domain.model.VideoPipDestination;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoDetailEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "", "Back", "EnterPip", "OpenSetting", "OpenPdf", "OpenReference", "OpenMemo", "VideoSettingSheet", "OpenDownloadTrackSelection", "PreloadInputCardAuth", "OpenExternalUrl", "Error", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$Back;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$EnterPip;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$Error;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenDownloadTrackSelection;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenExternalUrl;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenMemo;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenPdf;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenReference;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenSetting;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$PreloadInputCardAuth;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$VideoSettingSheet;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoDetailEffect {

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$Back;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Back implements VideoDetailEffect {
        public static final int $stable = 0;
        public static final Back INSTANCE = new Back();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Back)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1261411492;
        }

        public String toString() {
            return "Back";
        }

        private Back() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$EnterPip;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "<init>", "(Lcom/medicmedia/medilink/domain/model/VideoPipDestination;)V", "getDestination", "()Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class EnterPip implements VideoDetailEffect {
        public static final int $stable = 8;
        private final VideoPipDestination destination;

        public EnterPip() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EnterPip copy$default(EnterPip enterPip, VideoPipDestination videoPipDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                videoPipDestination = enterPip.destination;
            }
            return enterPip.copy(videoPipDestination);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoPipDestination getDestination() {
            return this.destination;
        }

        public final EnterPip copy(VideoPipDestination destination) {
            return new EnterPip(destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterPip) && Intrinsics.areEqual(this.destination, ((EnterPip) other).destination);
        }

        public int hashCode() {
            VideoPipDestination videoPipDestination = this.destination;
            if (videoPipDestination == null) {
                return 0;
            }
            return videoPipDestination.hashCode();
        }

        public String toString() {
            return "EnterPip(destination=" + this.destination + ")";
        }

        public EnterPip(VideoPipDestination videoPipDestination) {
            this.destination = videoPipDestination;
        }

        public /* synthetic */ EnterPip(VideoPipDestination videoPipDestination, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : videoPipDestination);
        }

        public final VideoPipDestination getDestination() {
            return this.destination;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenSetting;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenSetting implements VideoDetailEffect {
        public static final int $stable = 0;
        public static final OpenSetting INSTANCE = new OpenSetting();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenSetting)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1004200815;
        }

        public String toString() {
            return "OpenSetting";
        }

        private OpenSetting() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenPdf;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/medicmedia/medilink/domain/model/VideoPDFFile;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenPdf implements VideoDetailEffect {
        public static final int $stable = 8;
        private final List<VideoPDFFile> items;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenPdf copy$default(OpenPdf openPdf, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = openPdf.items;
            }
            return openPdf.copy(list);
        }

        public final List<VideoPDFFile> component1() {
            return this.items;
        }

        public final OpenPdf copy(List<VideoPDFFile> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new OpenPdf(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenPdf) && Intrinsics.areEqual(this.items, ((OpenPdf) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "OpenPdf(items=" + this.items + ")";
        }

        public OpenPdf(List<VideoPDFFile> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        public final List<VideoPDFFile> getItems() {
            return this.items;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenReference;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenReference implements VideoDetailEffect {
        public static final int $stable = 0;
        public static final OpenReference INSTANCE = new OpenReference();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenReference)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1118387892;
        }

        public String toString() {
            return "OpenReference";
        }

        private OpenReference() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenMemo;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenMemo implements VideoDetailEffect {
        public static final int $stable = 0;
        public static final OpenMemo INSTANCE = new OpenMemo();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenMemo)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1466132839;
        }

        public String toString() {
            return "OpenMemo";
        }

        private OpenMemo() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$VideoSettingSheet;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "isOpen", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class VideoSettingSheet implements VideoDetailEffect {
        public static final int $stable = 0;
        private final boolean isOpen;

        public static /* synthetic */ VideoSettingSheet copy$default(VideoSettingSheet videoSettingSheet, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = videoSettingSheet.isOpen;
            }
            return videoSettingSheet.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsOpen() {
            return this.isOpen;
        }

        public final VideoSettingSheet copy(boolean isOpen) {
            return new VideoSettingSheet(isOpen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VideoSettingSheet) && this.isOpen == ((VideoSettingSheet) other).isOpen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOpen);
        }

        public String toString() {
            return "VideoSettingSheet(isOpen=" + this.isOpen + ")";
        }

        public VideoSettingSheet(boolean z) {
            this.isOpen = z;
        }

        public final boolean isOpen() {
            return this.isOpen;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenDownloadTrackSelection;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenDownloadTrackSelection implements VideoDetailEffect {
        public static final int $stable = 0;
        public static final OpenDownloadTrackSelection INSTANCE = new OpenDownloadTrackSelection();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenDownloadTrackSelection)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1922003656;
        }

        public String toString() {
            return "OpenDownloadTrackSelection";
        }

        private OpenDownloadTrackSelection() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$PreloadInputCardAuth;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "inputCardUrl", "", "<init>", "(Ljava/lang/String;)V", "getInputCardUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class PreloadInputCardAuth implements VideoDetailEffect {
        public static final int $stable = 0;
        private final String inputCardUrl;

        public static /* synthetic */ PreloadInputCardAuth copy$default(PreloadInputCardAuth preloadInputCardAuth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preloadInputCardAuth.inputCardUrl;
            }
            return preloadInputCardAuth.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInputCardUrl() {
            return this.inputCardUrl;
        }

        public final PreloadInputCardAuth copy(String inputCardUrl) {
            Intrinsics.checkNotNullParameter(inputCardUrl, "inputCardUrl");
            return new PreloadInputCardAuth(inputCardUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreloadInputCardAuth) && Intrinsics.areEqual(this.inputCardUrl, ((PreloadInputCardAuth) other).inputCardUrl);
        }

        public int hashCode() {
            return this.inputCardUrl.hashCode();
        }

        public String toString() {
            return "PreloadInputCardAuth(inputCardUrl=" + this.inputCardUrl + ")";
        }

        public PreloadInputCardAuth(String inputCardUrl) {
            Intrinsics.checkNotNullParameter(inputCardUrl, "inputCardUrl");
            this.inputCardUrl = inputCardUrl;
        }

        public final String getInputCardUrl() {
            return this.inputCardUrl;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$OpenExternalUrl;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenExternalUrl implements VideoDetailEffect {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ OpenExternalUrl copy$default(OpenExternalUrl openExternalUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openExternalUrl.url;
            }
            return openExternalUrl.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final OpenExternalUrl copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenExternalUrl(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenExternalUrl) && Intrinsics.areEqual(this.url, ((OpenExternalUrl) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "OpenExternalUrl(url=" + this.url + ")";
        }

        public OpenExternalUrl(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect$Error;", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailEffect;", "messageId", "", "<init>", "(I)V", "getMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Error implements VideoDetailEffect {
        public static final int $stable = 0;
        private final int messageId;

        public static /* synthetic */ Error copy$default(Error error, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = error.messageId;
            }
            return error.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        public final Error copy(int messageId) {
            return new Error(messageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && this.messageId == ((Error) other).messageId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageId);
        }

        public String toString() {
            return "Error(messageId=" + this.messageId + ")";
        }

        public Error(int i) {
            this.messageId = i;
        }

        public final int getMessageId() {
            return this.messageId;
        }
    }
}
