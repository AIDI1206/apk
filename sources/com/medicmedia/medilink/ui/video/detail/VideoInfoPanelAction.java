package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelAction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "", "DoneClick", "BookmarkClick", "DownloadClick", "PdfClick", "KijunClick", "MemoClick", "OtherSettingClick", "QbClick", "InputClick", "DescriptionLinkClick", "ReferenceClick", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$BookmarkClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$DescriptionLinkClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$DoneClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$DownloadClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$InputClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$KijunClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$MemoClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$OtherSettingClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$PdfClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$QbClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$ReferenceClick;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoInfoPanelAction {

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$DoneClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DoneClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final DoneClick INSTANCE = new DoneClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DoneClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1200701555;
        }

        public String toString() {
            return "DoneClick";
        }

        private DoneClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$BookmarkClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class BookmarkClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final BookmarkClick INSTANCE = new BookmarkClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BookmarkClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1835228455;
        }

        public String toString() {
            return "BookmarkClick";
        }

        private BookmarkClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$DownloadClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DownloadClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final DownloadClick INSTANCE = new DownloadClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2121581255;
        }

        public String toString() {
            return "DownloadClick";
        }

        private DownloadClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$PdfClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class PdfClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final PdfClick INSTANCE = new PdfClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdfClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -230549905;
        }

        public String toString() {
            return "PdfClick";
        }

        private PdfClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$KijunClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class KijunClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final KijunClick INSTANCE = new KijunClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KijunClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2144322204;
        }

        public String toString() {
            return "KijunClick";
        }

        private KijunClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$MemoClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class MemoClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final MemoClick INSTANCE = new MemoClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MemoClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1137368875;
        }

        public String toString() {
            return "MemoClick";
        }

        private MemoClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$OtherSettingClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OtherSettingClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final OtherSettingClick INSTANCE = new OtherSettingClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtherSettingClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 374065583;
        }

        public String toString() {
            return "OtherSettingClick";
        }

        private OtherSettingClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$QbClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class QbClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final QbClick INSTANCE = new QbClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QbClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2038629406;
        }

        public String toString() {
            return "QbClick";
        }

        private QbClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$InputClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class InputClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        public static final InputClick INSTANCE = new InputClick();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputClick)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -166253481;
        }

        public String toString() {
            return "InputClick";
        }

        private InputClick() {
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$DescriptionLinkClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DescriptionLinkClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ DescriptionLinkClick copy$default(DescriptionLinkClick descriptionLinkClick, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = descriptionLinkClick.url;
            }
            return descriptionLinkClick.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final DescriptionLinkClick copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new DescriptionLinkClick(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DescriptionLinkClick) && Intrinsics.areEqual(this.url, ((DescriptionLinkClick) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "DescriptionLinkClick(url=" + this.url + ")";
        }

        public DescriptionLinkClick(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: VideoInfoPanelAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction$ReferenceClick;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoPanelAction;", "tag", "", "<init>", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ReferenceClick implements VideoInfoPanelAction {
        public static final int $stable = 0;
        private final String tag;

        public static /* synthetic */ ReferenceClick copy$default(ReferenceClick referenceClick, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = referenceClick.tag;
            }
            return referenceClick.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final ReferenceClick copy(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new ReferenceClick(tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReferenceClick) && Intrinsics.areEqual(this.tag, ((ReferenceClick) other).tag);
        }

        public int hashCode() {
            return this.tag.hashCode();
        }

        public String toString() {
            return "ReferenceClick(tag=" + this.tag + ")";
        }

        public ReferenceClick(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tag = tag;
        }

        public final String getTag() {
            return this.tag;
        }
    }
}
