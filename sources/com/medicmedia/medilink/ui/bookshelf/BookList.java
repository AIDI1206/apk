package com.medicmedia.medilink.ui.bookshelf;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.OptionDropdownMenuType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookList;", "", "<init>", "()V", "RowState", "ContentStatus", "OptionMenuType", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BookList {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: BookListItem.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J}\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÇ\u0001J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00105\u001a\u000206H×\u0001J\t\u00107\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001aR\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010#\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010%\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u00068"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookList$RowState;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "thumbnailUrl", "menuType", "Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;", "dialogMenuType", "showExternalBrowser", "", "htmlStatus", "Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;", "pdfStatus", "showProgress", "showMasking", "showBadge", "isActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;ZLcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;ZZZZ)V", "getTitle", "()Ljava/lang/String;", "getThumbnailUrl", "getMenuType", "()Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;", "getDialogMenuType", "getShowExternalBrowser", "()Z", "getHtmlStatus", "()Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;", "getPdfStatus", "getShowProgress", "getShowMasking", "getShowBadge", "showHtmlIcon", "getShowHtmlIcon", "showDownloadedHtmlIcon", "getShowDownloadedHtmlIcon", "showPdfIcon", "getShowPdfIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class RowState {
        public static final int $stable = 0;
        private final OptionDropdownMenuType dialogMenuType;
        private final ContentStatus htmlStatus;
        private final boolean isActive;
        private final OptionDropdownMenuType menuType;
        private final ContentStatus pdfStatus;
        private final boolean showBadge;
        private final boolean showDownloadedHtmlIcon;
        private final boolean showExternalBrowser;
        private final boolean showHtmlIcon;
        private final boolean showMasking;
        private final boolean showPdfIcon;
        private final boolean showProgress;
        private final String thumbnailUrl;
        private final String title;

        public RowState() {
            this(null, null, null, null, false, null, null, false, false, false, false, 2047, null);
        }

        public static /* synthetic */ RowState copy$default(RowState rowState, String str, String str2, OptionDropdownMenuType optionDropdownMenuType, OptionDropdownMenuType optionDropdownMenuType2, boolean z, ContentStatus contentStatus, ContentStatus contentStatus2, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rowState.title;
            }
            if ((i & 2) != 0) {
                str2 = rowState.thumbnailUrl;
            }
            if ((i & 4) != 0) {
                optionDropdownMenuType = rowState.menuType;
            }
            if ((i & 8) != 0) {
                optionDropdownMenuType2 = rowState.dialogMenuType;
            }
            if ((i & 16) != 0) {
                z = rowState.showExternalBrowser;
            }
            if ((i & 32) != 0) {
                contentStatus = rowState.htmlStatus;
            }
            if ((i & 64) != 0) {
                contentStatus2 = rowState.pdfStatus;
            }
            if ((i & 128) != 0) {
                z2 = rowState.showProgress;
            }
            if ((i & 256) != 0) {
                z3 = rowState.showMasking;
            }
            if ((i & 512) != 0) {
                z4 = rowState.showBadge;
            }
            if ((i & 1024) != 0) {
                z5 = rowState.isActive;
            }
            boolean z6 = z4;
            boolean z7 = z5;
            boolean z8 = z2;
            boolean z9 = z3;
            ContentStatus contentStatus3 = contentStatus;
            ContentStatus contentStatus4 = contentStatus2;
            boolean z10 = z;
            OptionDropdownMenuType optionDropdownMenuType3 = optionDropdownMenuType;
            return rowState.copy(str, str2, optionDropdownMenuType3, optionDropdownMenuType2, z10, contentStatus3, contentStatus4, z8, z9, z6, z7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getShowBadge() {
            return this.showBadge;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final OptionDropdownMenuType getMenuType() {
            return this.menuType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final OptionDropdownMenuType getDialogMenuType() {
            return this.dialogMenuType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getShowExternalBrowser() {
            return this.showExternalBrowser;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final ContentStatus getHtmlStatus() {
            return this.htmlStatus;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final ContentStatus getPdfStatus() {
            return this.pdfStatus;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getShowProgress() {
            return this.showProgress;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getShowMasking() {
            return this.showMasking;
        }

        public final RowState copy(String title, String thumbnailUrl, OptionDropdownMenuType menuType, OptionDropdownMenuType dialogMenuType, boolean showExternalBrowser, ContentStatus htmlStatus, ContentStatus pdfStatus, boolean showProgress, boolean showMasking, boolean showBadge, boolean isActive) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(htmlStatus, "htmlStatus");
            Intrinsics.checkNotNullParameter(pdfStatus, "pdfStatus");
            return new RowState(title, thumbnailUrl, menuType, dialogMenuType, showExternalBrowser, htmlStatus, pdfStatus, showProgress, showMasking, showBadge, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowState)) {
                return false;
            }
            RowState rowState = (RowState) other;
            return Intrinsics.areEqual(this.title, rowState.title) && Intrinsics.areEqual(this.thumbnailUrl, rowState.thumbnailUrl) && Intrinsics.areEqual(this.menuType, rowState.menuType) && Intrinsics.areEqual(this.dialogMenuType, rowState.dialogMenuType) && this.showExternalBrowser == rowState.showExternalBrowser && Intrinsics.areEqual(this.htmlStatus, rowState.htmlStatus) && Intrinsics.areEqual(this.pdfStatus, rowState.pdfStatus) && this.showProgress == rowState.showProgress && this.showMasking == rowState.showMasking && this.showBadge == rowState.showBadge && this.isActive == rowState.isActive;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.thumbnailUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            OptionDropdownMenuType optionDropdownMenuType = this.menuType;
            int iHashCode3 = (iHashCode2 + (optionDropdownMenuType == null ? 0 : optionDropdownMenuType.hashCode())) * 31;
            OptionDropdownMenuType optionDropdownMenuType2 = this.dialogMenuType;
            return ((((((((((((((iHashCode3 + (optionDropdownMenuType2 != null ? optionDropdownMenuType2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showExternalBrowser)) * 31) + this.htmlStatus.hashCode()) * 31) + this.pdfStatus.hashCode()) * 31) + Boolean.hashCode(this.showProgress)) * 31) + Boolean.hashCode(this.showMasking)) * 31) + Boolean.hashCode(this.showBadge)) * 31) + Boolean.hashCode(this.isActive);
        }

        public String toString() {
            return "RowState(title=" + this.title + ", thumbnailUrl=" + this.thumbnailUrl + ", menuType=" + this.menuType + ", dialogMenuType=" + this.dialogMenuType + ", showExternalBrowser=" + this.showExternalBrowser + ", htmlStatus=" + this.htmlStatus + ", pdfStatus=" + this.pdfStatus + ", showProgress=" + this.showProgress + ", showMasking=" + this.showMasking + ", showBadge=" + this.showBadge + ", isActive=" + this.isActive + ")";
        }

        public RowState(String title, String str, OptionDropdownMenuType optionDropdownMenuType, OptionDropdownMenuType optionDropdownMenuType2, boolean z, ContentStatus htmlStatus, ContentStatus pdfStatus, boolean z2, boolean z3, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(htmlStatus, "htmlStatus");
            Intrinsics.checkNotNullParameter(pdfStatus, "pdfStatus");
            this.title = title;
            this.thumbnailUrl = str;
            this.menuType = optionDropdownMenuType;
            this.dialogMenuType = optionDropdownMenuType2;
            this.showExternalBrowser = z;
            this.htmlStatus = htmlStatus;
            this.pdfStatus = pdfStatus;
            this.showProgress = z2;
            this.showMasking = z3;
            this.showBadge = z4;
            this.isActive = z5;
            this.showHtmlIcon = !Intrinsics.areEqual(htmlStatus, ContentStatus.NotSupported.INSTANCE);
            this.showDownloadedHtmlIcon = Intrinsics.areEqual(htmlStatus, ContentStatus.Downloaded.INSTANCE);
            this.showPdfIcon = !Intrinsics.areEqual(pdfStatus, ContentStatus.NotSupported.INSTANCE);
        }

        public /* synthetic */ RowState(String str, String str2, OptionDropdownMenuType optionDropdownMenuType, OptionDropdownMenuType optionDropdownMenuType2, boolean z, ContentStatus.NotSupported notSupported, ContentStatus.NotSupported notSupported2, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : optionDropdownMenuType, (i & 8) != 0 ? null : optionDropdownMenuType2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ContentStatus.NotSupported.INSTANCE : notSupported, (i & 64) != 0 ? ContentStatus.NotSupported.INSTANCE : notSupported2, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? true : z4, (i & 1024) != 0 ? true : z5);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public final OptionDropdownMenuType getMenuType() {
            return this.menuType;
        }

        public final OptionDropdownMenuType getDialogMenuType() {
            return this.dialogMenuType;
        }

        public final boolean getShowExternalBrowser() {
            return this.showExternalBrowser;
        }

        public final ContentStatus getHtmlStatus() {
            return this.htmlStatus;
        }

        public final ContentStatus getPdfStatus() {
            return this.pdfStatus;
        }

        public final boolean getShowProgress() {
            return this.showProgress;
        }

        public final boolean getShowMasking() {
            return this.showMasking;
        }

        public final boolean getShowBadge() {
            return this.showBadge;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean getShowHtmlIcon() {
            return this.showHtmlIcon;
        }

        public final boolean getShowDownloadedHtmlIcon() {
            return this.showDownloadedHtmlIcon;
        }

        public final boolean getShowPdfIcon() {
            return this.showPdfIcon;
        }
    }

    /* JADX INFO: compiled from: BookListItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;", "", "<init>", "()V", "NotSupported", "NotDownloaded", "Downloaded", "Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus$Downloaded;", "Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus$NotDownloaded;", "Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus$NotSupported;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class ContentStatus {
        public static final int $stable = 0;

        public /* synthetic */ ContentStatus(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: BookListItem.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus$NotSupported;", "Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class NotSupported extends ContentStatus {
            public static final int $stable = 0;
            public static final NotSupported INSTANCE = new NotSupported();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotSupported)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1374717230;
            }

            public String toString() {
                return "NotSupported";
            }

            private NotSupported() {
                super(null);
            }
        }

        private ContentStatus() {
        }

        /* JADX INFO: compiled from: BookListItem.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus$NotDownloaded;", "Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class NotDownloaded extends ContentStatus {
            public static final int $stable = 0;
            public static final NotDownloaded INSTANCE = new NotDownloaded();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotDownloaded)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1308495485;
            }

            public String toString() {
                return "NotDownloaded";
            }

            private NotDownloaded() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: BookListItem.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus$Downloaded;", "Lcom/medicmedia/medilink/ui/bookshelf/BookList$ContentStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Downloaded extends ContentStatus {
            public static final int $stable = 0;
            public static final Downloaded INSTANCE = new Downloaded();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Downloaded)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 218630302;
            }

            public String toString() {
                return "Downloaded";
            }

            private Downloaded() {
                super(null);
            }
        }
    }

    /* JADX INFO: compiled from: BookListItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookList$OptionMenuType;", "Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;", "", "titles", "", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getTitles", "()Ljava/util/List;", "CATEGORY", "USER", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum OptionMenuType implements OptionDropdownMenuType {
        CATEGORY(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.book_list_menu_contents_display), Integer.valueOf(R.string.book_list_menu_contents_download), Integer.valueOf(R.string.book_list_menu_contents_delete), Integer.valueOf(R.string.book_list_menu_setting)})),
        USER(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.book_list_menu_contents_sort), Integer.valueOf(R.string.book_list_menu_contents_display), Integer.valueOf(R.string.book_list_menu_contents_download), Integer.valueOf(R.string.book_list_menu_contents_delete), Integer.valueOf(R.string.book_list_menu_setting)}));

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final List<Integer> titles;

        public static EnumEntries<OptionMenuType> getEntries() {
            return $ENTRIES;
        }

        OptionMenuType(List list) {
            this.titles = list;
        }

        @Override // com.medicmedia.medilink.ui.common.OptionDropdownMenuType
        public List<Integer> getTitles() {
            return this.titles;
        }
    }
}
