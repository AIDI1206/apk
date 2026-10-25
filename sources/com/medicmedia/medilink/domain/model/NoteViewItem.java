package com.medicmedia.medilink.domain.model;

import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.firestore.DocumentReference;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import java.io.StringReader;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: NoteViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b9\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0001LB½\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u00103\u001a\u0004\u0018\u00010\u0005J\u0006\u00104\u001a\u00020\u0005J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00101JÄ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101¨\u0006M"}, d2 = {"Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "", "mode", "", "text", "", "updatedDate", "Ljava/util/Date;", "option", "deleteFlg", "", "subtitle", "tabId", "noteDataId", HistoryRepositoryImpl.QueryKey.RANGE, HistoryRepositoryImpl.FieldName.TITLE, "url", "viewDate", HistoryRepositoryImpl.Path.TAGS, "", "Lcom/google/firebase/firestore/DocumentReference;", "color", "titleKana", HistoryRepositoryImpl.FieldName.SUB, BundleKey.TAB_NO, "<init>", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getMode", "()I", "getText", "()Ljava/lang/String;", "getUpdatedDate", "()Ljava/util/Date;", "getOption", "getDeleteFlg", "()Z", "getSubtitle", "getTabId", "getNoteDataId", "getRange", "getTitle", "getUrl", "getViewDate", "getTags", "()Ljava/util/List;", "getColor", "getTitleKana", "getSub", "getTabNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "courseId", "contentText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "equals", "other", "hashCode", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NoteViewItem {
    public static final String OPTION_MOVIE_LIST = "movie_list";
    private final String color;
    private final boolean deleteFlg;
    private final int mode;
    private final String noteDataId;
    private final String option;
    private final String range;
    private final String sub;
    private final String subtitle;
    private final String tabId;
    private final Integer tabNo;
    private final List<DocumentReference> tags;
    private final String text;
    private final String title;
    private final String titleKana;
    private final Date updatedDate;
    private final String url;
    private final Date viewDate;

    public NoteViewItem() {
        this(0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteViewItem copy$default(NoteViewItem noteViewItem, int i, String str, Date date, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Date date2, List list, String str9, String str10, String str11, Integer num, int i2, Object obj) {
        Integer num2;
        String str12;
        int i3 = (i2 & 1) != 0 ? noteViewItem.mode : i;
        String str13 = (i2 & 2) != 0 ? noteViewItem.text : str;
        Date date3 = (i2 & 4) != 0 ? noteViewItem.updatedDate : date;
        String str14 = (i2 & 8) != 0 ? noteViewItem.option : str2;
        boolean z2 = (i2 & 16) != 0 ? noteViewItem.deleteFlg : z;
        String str15 = (i2 & 32) != 0 ? noteViewItem.subtitle : str3;
        String str16 = (i2 & 64) != 0 ? noteViewItem.tabId : str4;
        String str17 = (i2 & 128) != 0 ? noteViewItem.noteDataId : str5;
        String str18 = (i2 & 256) != 0 ? noteViewItem.range : str6;
        String str19 = (i2 & 512) != 0 ? noteViewItem.title : str7;
        String str20 = (i2 & 1024) != 0 ? noteViewItem.url : str8;
        Date date4 = (i2 & 2048) != 0 ? noteViewItem.viewDate : date2;
        List list2 = (i2 & 4096) != 0 ? noteViewItem.tags : list;
        String str21 = (i2 & 8192) != 0 ? noteViewItem.color : str9;
        int i4 = i3;
        String str22 = (i2 & 16384) != 0 ? noteViewItem.titleKana : str10;
        String str23 = (i2 & 32768) != 0 ? noteViewItem.sub : str11;
        if ((i2 & 65536) != 0) {
            str12 = str23;
            num2 = noteViewItem.tabNo;
        } else {
            num2 = num;
            str12 = str23;
        }
        return noteViewItem.copy(i4, str13, date3, str14, z2, str15, str16, str17, str18, str19, str20, date4, list2, str21, str22, str12, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getViewDate() {
        return this.viewDate;
    }

    public final List<DocumentReference> component13() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTitleKana() {
        return this.titleKana;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSub() {
        return this.sub;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getTabNo() {
        return this.tabNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNoteDataId() {
        return this.noteDataId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRange() {
        return this.range;
    }

    public final NoteViewItem copy(int mode, String text, Date updatedDate, String option, boolean deleteFlg, String subtitle, String tabId, String noteDataId, String range, String title, String url, Date viewDate, List<? extends DocumentReference> tags, String color, String titleKana, String sub, Integer tabNo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(titleKana, "titleKana");
        Intrinsics.checkNotNullParameter(sub, "sub");
        return new NoteViewItem(mode, text, updatedDate, option, deleteFlg, subtitle, tabId, noteDataId, range, title, url, viewDate, tags, color, titleKana, sub, tabNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteViewItem)) {
            return false;
        }
        NoteViewItem noteViewItem = (NoteViewItem) other;
        return this.mode == noteViewItem.mode && Intrinsics.areEqual(this.text, noteViewItem.text) && Intrinsics.areEqual(this.updatedDate, noteViewItem.updatedDate) && Intrinsics.areEqual(this.option, noteViewItem.option) && this.deleteFlg == noteViewItem.deleteFlg && Intrinsics.areEqual(this.subtitle, noteViewItem.subtitle) && Intrinsics.areEqual(this.tabId, noteViewItem.tabId) && Intrinsics.areEqual(this.noteDataId, noteViewItem.noteDataId) && Intrinsics.areEqual(this.range, noteViewItem.range) && Intrinsics.areEqual(this.title, noteViewItem.title) && Intrinsics.areEqual(this.url, noteViewItem.url) && Intrinsics.areEqual(this.viewDate, noteViewItem.viewDate) && Intrinsics.areEqual(this.tags, noteViewItem.tags) && Intrinsics.areEqual(this.color, noteViewItem.color) && Intrinsics.areEqual(this.titleKana, noteViewItem.titleKana) && Intrinsics.areEqual(this.sub, noteViewItem.sub) && Intrinsics.areEqual(this.tabNo, noteViewItem.tabNo);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.mode) * 31) + this.text.hashCode()) * 31;
        Date date = this.updatedDate;
        int iHashCode2 = (((((((((((((((((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.option.hashCode()) * 31) + Boolean.hashCode(this.deleteFlg)) * 31) + this.subtitle.hashCode()) * 31) + this.tabId.hashCode()) * 31) + this.noteDataId.hashCode()) * 31) + this.range.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31;
        Date date2 = this.viewDate;
        int iHashCode3 = (((((((((iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31) + this.tags.hashCode()) * 31) + this.color.hashCode()) * 31) + this.titleKana.hashCode()) * 31) + this.sub.hashCode()) * 31;
        Integer num = this.tabNo;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NoteViewItem(mode=" + this.mode + ", text=" + this.text + ", updatedDate=" + this.updatedDate + ", option=" + this.option + ", deleteFlg=" + this.deleteFlg + ", subtitle=" + this.subtitle + ", tabId=" + this.tabId + ", noteDataId=" + this.noteDataId + ", range=" + this.range + ", title=" + this.title + ", url=" + this.url + ", viewDate=" + this.viewDate + ", tags=" + this.tags + ", color=" + this.color + ", titleKana=" + this.titleKana + ", sub=" + this.sub + ", tabNo=" + this.tabNo + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoteViewItem(int i, String text, Date date, String option, boolean z, String subtitle, String tabId, String noteDataId, String range, String title, String url, Date date2, List<? extends DocumentReference> tags, String color, String titleKana, String sub, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(titleKana, "titleKana");
        Intrinsics.checkNotNullParameter(sub, "sub");
        this.mode = i;
        this.text = text;
        this.updatedDate = date;
        this.option = option;
        this.deleteFlg = z;
        this.subtitle = subtitle;
        this.tabId = tabId;
        this.noteDataId = noteDataId;
        this.range = range;
        this.title = title;
        this.url = url;
        this.viewDate = date2;
        this.tags = tags;
        this.color = color;
        this.titleKana = titleKana;
        this.sub = sub;
        this.tabNo = num;
    }

    public /* synthetic */ NoteViewItem(int i, String str, Date date, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Date date2, List list, String str9, String str10, String str11, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : date, (i2 & 8) != 0 ? NoteViewItemKt.defaultJsonString : str2, (i2 & 16) == 0 ? z : false, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "first_note_tab" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? null : date2, (i2 & 4096) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8192) != 0 ? "" : str9, (i2 & 16384) != 0 ? "" : str10, (i2 & 32768) == 0 ? str11 : "", (i2 & 65536) != 0 ? null : num);
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

    public final String getSubtitle() {
        return this.subtitle;
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

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
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

    public final String getTitleKana() {
        return this.titleKana;
    }

    public final String getSub() {
        return this.sub;
    }

    public final Integer getTabNo() {
        return this.tabNo;
    }

    public final String courseId() {
        List listSplit$default = StringsKt.split$default((CharSequence) this.noteDataId, new String[]{MLConst.MLCommon.SEPALETER_SINGLE_TEXT}, false, 0, 6, (Object) null);
        if (listSplit$default.size() > 1) {
            return (String) listSplit$default.get(1);
        }
        return null;
    }

    public final String contentText() {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new StringReader(this.text));
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2 && Intrinsics.areEqual(xmlPullParserNewPullParser.getName(), "en-note")) {
                    String strNextText = xmlPullParserNewPullParser.nextText();
                    Intrinsics.checkNotNullExpressionValue(strNextText, "nextText(...)");
                    return strNextText;
                }
            }
        } catch (Exception e) {
            Logger logger = Logger.INSTANCE;
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            logger.error(simpleName, e);
        }
        return this.text;
    }
}
