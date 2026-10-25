package com.medicmedia.medilink.domain.model.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.firestore.DocumentReference;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.ConstKt;
import com.medicmedia.medilink.domain.OtherCode;
import com.medicmedia.medilink.domain.model.NoteOption;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: HistoryItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010@\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010AJ\u001a\u0010@\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\nH\u0016J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0007HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00107Jî\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020\u0003HÖ\u0001J\t\u0010]\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0014\u0010\u0011\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0014\u0010\u0017\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0014\u0010\u0019\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0014\u0010\u001b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010'R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b\u001c\u00107R\u0011\u00109\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b:\u0010\"R\u0013\u0010;\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0013\u0010=\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006^"}, d2 = {"Lcom/medicmedia/medilink/domain/model/history/WritingHistoryItem;", "Lcom/medicmedia/medilink/domain/model/history/CommonHistoryItem;", "mode", "", "text", "", "updatedDate", "Ljava/util/Date;", "option", "deleteFlg", "", HistoryRepositoryImpl.FieldName.TITLE, "subTitle", "tabId", "noteDataId", HistoryRepositoryImpl.QueryKey.RANGE, "url", "contentsId", "viewDate", HistoryRepositoryImpl.Path.TAGS, "", "Lcom/google/firebase/firestore/DocumentReference;", "color", "documentReferenceId", "contentsTitle", "thumbnailUrl", "videoThumbnailUrl", "isMasking", "isQbv4", "<init>", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "getMode", "()I", "getText", "()Ljava/lang/String;", "getUpdatedDate", "()Ljava/util/Date;", "getOption", "getDeleteFlg", "()Z", "getTitle", "getSubTitle", "getTabId", "getNoteDataId", "getRange", "getUrl", "getContentsId", "getViewDate", "getTags", "()Ljava/util/List;", "getColor", "getDocumentReferenceId", "getContentsTitle", "getThumbnailUrl", "getVideoThumbnailUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "updateDateText", "getUpdateDateText", "courseId", "getCourseId", BundleKey.TAB_NO, "getTabNo", "()Ljava/lang/Integer;", "copyItem", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/domain/model/history/WritingHistoryItem;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/domain/model/history/WritingHistoryItem;", "equals", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class WritingHistoryItem implements CommonHistoryItem<WritingHistoryItem> {
    private final String color;
    private final String contentsId;
    private final String contentsTitle;
    private final boolean deleteFlg;
    private final String documentReferenceId;
    private final boolean isMasking;
    private final Boolean isQbv4;
    private final int mode;
    private final String noteDataId;
    private final String option;
    private final String range;
    private final String subTitle;
    private final String tabId;
    private final List<DocumentReference> tags;
    private final String text;
    private final String thumbnailUrl;
    private final String title;
    private final Date updatedDate;
    private final String url;
    private final String videoThumbnailUrl;
    private final Date viewDate;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WritingHistoryItem copy$default(WritingHistoryItem writingHistoryItem, int i, String str, Date date, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Date date2, List list, String str10, String str11, String str12, String str13, String str14, boolean z2, Boolean bool, int i2, Object obj) {
        Boolean bool2;
        boolean z3;
        int i3 = (i2 & 1) != 0 ? writingHistoryItem.mode : i;
        String str15 = (i2 & 2) != 0 ? writingHistoryItem.text : str;
        Date date3 = (i2 & 4) != 0 ? writingHistoryItem.updatedDate : date;
        String str16 = (i2 & 8) != 0 ? writingHistoryItem.option : str2;
        boolean z4 = (i2 & 16) != 0 ? writingHistoryItem.deleteFlg : z;
        String str17 = (i2 & 32) != 0 ? writingHistoryItem.title : str3;
        String str18 = (i2 & 64) != 0 ? writingHistoryItem.subTitle : str4;
        String str19 = (i2 & 128) != 0 ? writingHistoryItem.tabId : str5;
        String str20 = (i2 & 256) != 0 ? writingHistoryItem.noteDataId : str6;
        String str21 = (i2 & 512) != 0 ? writingHistoryItem.range : str7;
        String str22 = (i2 & 1024) != 0 ? writingHistoryItem.url : str8;
        String str23 = (i2 & 2048) != 0 ? writingHistoryItem.contentsId : str9;
        Date date4 = (i2 & 4096) != 0 ? writingHistoryItem.viewDate : date2;
        List list2 = (i2 & 8192) != 0 ? writingHistoryItem.tags : list;
        int i4 = i3;
        String str24 = (i2 & 16384) != 0 ? writingHistoryItem.color : str10;
        String str25 = (i2 & 32768) != 0 ? writingHistoryItem.documentReferenceId : str11;
        String str26 = (i2 & 65536) != 0 ? writingHistoryItem.contentsTitle : str12;
        String str27 = (i2 & 131072) != 0 ? writingHistoryItem.thumbnailUrl : str13;
        String str28 = (i2 & 262144) != 0 ? writingHistoryItem.videoThumbnailUrl : str14;
        boolean z5 = (i2 & 524288) != 0 ? writingHistoryItem.isMasking : z2;
        if ((i2 & 1048576) != 0) {
            z3 = z5;
            bool2 = writingHistoryItem.isQbv4;
        } else {
            bool2 = bool;
            z3 = z5;
        }
        return writingHistoryItem.copy(i4, str15, date3, str16, z4, str17, str18, str19, str20, str21, str22, str23, date4, list2, str24, str25, str26, str27, str28, z3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getViewDate() {
        return this.viewDate;
    }

    public final List<DocumentReference> component14() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDocumentReferenceId() {
        return this.documentReferenceId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getContentsTitle() {
        return this.contentsTitle;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getVideoThumbnailUrl() {
        return this.videoThumbnailUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsMasking() {
        return this.isMasking;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsQbv4() {
        return this.isQbv4;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNoteDataId() {
        return this.noteDataId;
    }

    public final WritingHistoryItem copy(int mode, String text, Date updatedDate, String option, boolean deleteFlg, String title, String subTitle, String tabId, String noteDataId, String range, String url, String contentsId, Date viewDate, List<? extends DocumentReference> tags, String color, String documentReferenceId, String contentsTitle, String thumbnailUrl, String videoThumbnailUrl, boolean isMasking, Boolean isQbv4) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(viewDate, "viewDate");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(documentReferenceId, "documentReferenceId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        return new WritingHistoryItem(mode, text, updatedDate, option, deleteFlg, title, subTitle, tabId, noteDataId, range, url, contentsId, viewDate, tags, color, documentReferenceId, contentsTitle, thumbnailUrl, videoThumbnailUrl, isMasking, isQbv4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WritingHistoryItem)) {
            return false;
        }
        WritingHistoryItem writingHistoryItem = (WritingHistoryItem) other;
        return this.mode == writingHistoryItem.mode && Intrinsics.areEqual(this.text, writingHistoryItem.text) && Intrinsics.areEqual(this.updatedDate, writingHistoryItem.updatedDate) && Intrinsics.areEqual(this.option, writingHistoryItem.option) && this.deleteFlg == writingHistoryItem.deleteFlg && Intrinsics.areEqual(this.title, writingHistoryItem.title) && Intrinsics.areEqual(this.subTitle, writingHistoryItem.subTitle) && Intrinsics.areEqual(this.tabId, writingHistoryItem.tabId) && Intrinsics.areEqual(this.noteDataId, writingHistoryItem.noteDataId) && Intrinsics.areEqual(this.range, writingHistoryItem.range) && Intrinsics.areEqual(this.url, writingHistoryItem.url) && Intrinsics.areEqual(this.contentsId, writingHistoryItem.contentsId) && Intrinsics.areEqual(this.viewDate, writingHistoryItem.viewDate) && Intrinsics.areEqual(this.tags, writingHistoryItem.tags) && Intrinsics.areEqual(this.color, writingHistoryItem.color) && Intrinsics.areEqual(this.documentReferenceId, writingHistoryItem.documentReferenceId) && Intrinsics.areEqual(this.contentsTitle, writingHistoryItem.contentsTitle) && Intrinsics.areEqual(this.thumbnailUrl, writingHistoryItem.thumbnailUrl) && Intrinsics.areEqual(this.videoThumbnailUrl, writingHistoryItem.videoThumbnailUrl) && this.isMasking == writingHistoryItem.isMasking && Intrinsics.areEqual(this.isQbv4, writingHistoryItem.isQbv4);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((Integer.hashCode(this.mode) * 31) + this.text.hashCode()) * 31) + this.updatedDate.hashCode()) * 31) + this.option.hashCode()) * 31) + Boolean.hashCode(this.deleteFlg)) * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.tabId.hashCode()) * 31) + this.noteDataId.hashCode()) * 31;
        String str = this.range;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.url.hashCode()) * 31) + this.contentsId.hashCode()) * 31) + this.viewDate.hashCode()) * 31) + this.tags.hashCode()) * 31;
        String str2 = this.color;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.documentReferenceId.hashCode()) * 31) + this.contentsTitle.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31;
        String str3 = this.videoThumbnailUrl;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isMasking)) * 31;
        Boolean bool = this.isQbv4;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "WritingHistoryItem(mode=" + this.mode + ", text=" + this.text + ", updatedDate=" + this.updatedDate + ", option=" + this.option + ", deleteFlg=" + this.deleteFlg + ", title=" + this.title + ", subTitle=" + this.subTitle + ", tabId=" + this.tabId + ", noteDataId=" + this.noteDataId + ", range=" + this.range + ", url=" + this.url + ", contentsId=" + this.contentsId + ", viewDate=" + this.viewDate + ", tags=" + this.tags + ", color=" + this.color + ", documentReferenceId=" + this.documentReferenceId + ", contentsTitle=" + this.contentsTitle + ", thumbnailUrl=" + this.thumbnailUrl + ", videoThumbnailUrl=" + this.videoThumbnailUrl + ", isMasking=" + this.isMasking + ", isQbv4=" + this.isQbv4 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WritingHistoryItem(int i, String text, Date updatedDate, String option, boolean z, String title, String subTitle, String tabId, String noteDataId, String str, String url, String contentsId, Date viewDate, List<? extends DocumentReference> tags, String str2, String documentReferenceId, String contentsTitle, String thumbnailUrl, String str3, boolean z2, Boolean bool) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(viewDate, "viewDate");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(documentReferenceId, "documentReferenceId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        this.mode = i;
        this.text = text;
        this.updatedDate = updatedDate;
        this.option = option;
        this.deleteFlg = z;
        this.title = title;
        this.subTitle = subTitle;
        this.tabId = tabId;
        this.noteDataId = noteDataId;
        this.range = str;
        this.url = url;
        this.contentsId = contentsId;
        this.viewDate = viewDate;
        this.tags = tags;
        this.color = str2;
        this.documentReferenceId = documentReferenceId;
        this.contentsTitle = contentsTitle;
        this.thumbnailUrl = thumbnailUrl;
        this.videoThumbnailUrl = str3;
        this.isMasking = z2;
        this.isQbv4 = bool;
    }

    public /* synthetic */ WritingHistoryItem(int i, String str, Date date, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Date date2, List list, String str10, String str11, String str12, String str13, String str14, boolean z2, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, date, str2, z, str3, str4, str5, str6, str7, str8, str9, date2, list, str10, str11, (i2 & 65536) != 0 ? "" : str12, (i2 & 131072) != 0 ? "" : str13, (i2 & 262144) != 0 ? null : str14, (i2 & 524288) != 0 ? true : z2, (i2 & 1048576) != 0 ? null : bool);
    }

    public final int getMode() {
        return this.mode;
    }

    public final String getText() {
        return this.text;
    }

    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    public final String getOption() {
        return this.option;
    }

    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final String getNoteDataId() {
        return this.noteDataId;
    }

    public final String getRange() {
        return this.range;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getUrl() {
        return this.url;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getContentsId() {
        return this.contentsId;
    }

    public final Date getViewDate() {
        return this.viewDate;
    }

    public final List<DocumentReference> getTags() {
        return this.tags;
    }

    public final String getColor() {
        return this.color;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getDocumentReferenceId() {
        return this.documentReferenceId;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getContentsTitle() {
        return this.contentsTitle;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getVideoThumbnailUrl() {
        return this.videoThumbnailUrl;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public boolean isMasking() {
        return this.isMasking;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public Boolean isQbv4() {
        return this.isQbv4;
    }

    public final String getUpdateDateText() {
        String str = ConstKt.getDateFormatSlashYYYYMMDD().format(this.updatedDate);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String getCourseId() {
        return (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) this.noteDataId, new String[]{MLConst.MLCommon.SEPALETER_SINGLE_TEXT}, false, 0, 6, (Object) null), 1);
    }

    public final Integer getTabNo() {
        NoteOption noteOptionFromJson = NoteOption.INSTANCE.fromJson(this.option);
        Integer tabNo = noteOptionFromJson != null ? noteOptionFromJson.getTabNo() : null;
        if (Intrinsics.areEqual(getContentsId(), OtherCode.QUICK_REFERENCE.getValue()) && tabNo == null) {
            return 0;
        }
        return tabNo;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public WritingHistoryItem copyItem(String contentsTitle, String thumbnailUrl, boolean isMasking, Boolean isQbv4) {
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        return copy$default(this, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, contentsTitle, thumbnailUrl, null, isMasking, null, 1376255, null);
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public WritingHistoryItem copyItem(String videoThumbnailUrl, boolean isMasking) {
        return copy$default(this, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, videoThumbnailUrl, isMasking, null, 1310719, null);
    }
}
