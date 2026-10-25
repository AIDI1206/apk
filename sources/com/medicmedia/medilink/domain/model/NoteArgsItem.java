package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoteViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0082\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Lcom/medicmedia/medilink/domain/model/NoteArgsItem;", "", "contentsId", "", "mode", "", "text", "isDelete", "", "subTitle", BundleKey.TAG_ID, HistoryRepositoryImpl.QueryKey.RANGE, "fileName", "colorCode", "markerPath", BundleKey.TAB_NO, "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getContentsId", "()Ljava/lang/String;", "getMode", "()I", "getText", "()Z", "getSubTitle", "getTagId", "getRange", "getFileName", "getColorCode", "getMarkerPath", "getTabNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/domain/model/NoteArgsItem;", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NoteArgsItem {
    private final String colorCode;
    private final String contentsId;
    private final String fileName;
    private final boolean isDelete;
    private final String markerPath;
    private final int mode;
    private final String range;
    private final String subTitle;
    private final Integer tabNo;
    private final String tagId;
    private final String text;

    public static /* synthetic */ NoteArgsItem copy$default(NoteArgsItem noteArgsItem, String str, int i, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noteArgsItem.contentsId;
        }
        if ((i2 & 2) != 0) {
            i = noteArgsItem.mode;
        }
        if ((i2 & 4) != 0) {
            str2 = noteArgsItem.text;
        }
        if ((i2 & 8) != 0) {
            z = noteArgsItem.isDelete;
        }
        if ((i2 & 16) != 0) {
            str3 = noteArgsItem.subTitle;
        }
        if ((i2 & 32) != 0) {
            str4 = noteArgsItem.tagId;
        }
        if ((i2 & 64) != 0) {
            str5 = noteArgsItem.range;
        }
        if ((i2 & 128) != 0) {
            str6 = noteArgsItem.fileName;
        }
        if ((i2 & 256) != 0) {
            str7 = noteArgsItem.colorCode;
        }
        if ((i2 & 512) != 0) {
            str8 = noteArgsItem.markerPath;
        }
        if ((i2 & 1024) != 0) {
            num = noteArgsItem.tabNo;
        }
        String str9 = str8;
        Integer num2 = num;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        String str15 = str2;
        return noteArgsItem.copy(str, i, str15, z, str14, str12, str13, str10, str11, str9, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMarkerPath() {
        return this.markerPath;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getTabNo() {
        return this.tabNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDelete() {
        return this.isDelete;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getColorCode() {
        return this.colorCode;
    }

    public final NoteArgsItem copy(String contentsId, int mode, String text, boolean isDelete, String subTitle, String tagId, String range, String fileName, String colorCode, String markerPath, Integer tabNo) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(colorCode, "colorCode");
        return new NoteArgsItem(contentsId, mode, text, isDelete, subTitle, tagId, range, fileName, colorCode, markerPath, tabNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteArgsItem)) {
            return false;
        }
        NoteArgsItem noteArgsItem = (NoteArgsItem) other;
        return Intrinsics.areEqual(this.contentsId, noteArgsItem.contentsId) && this.mode == noteArgsItem.mode && Intrinsics.areEqual(this.text, noteArgsItem.text) && this.isDelete == noteArgsItem.isDelete && Intrinsics.areEqual(this.subTitle, noteArgsItem.subTitle) && Intrinsics.areEqual(this.tagId, noteArgsItem.tagId) && Intrinsics.areEqual(this.range, noteArgsItem.range) && Intrinsics.areEqual(this.fileName, noteArgsItem.fileName) && Intrinsics.areEqual(this.colorCode, noteArgsItem.colorCode) && Intrinsics.areEqual(this.markerPath, noteArgsItem.markerPath) && Intrinsics.areEqual(this.tabNo, noteArgsItem.tabNo);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.contentsId.hashCode() * 31) + Integer.hashCode(this.mode)) * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.isDelete)) * 31) + this.subTitle.hashCode()) * 31) + this.tagId.hashCode()) * 31;
        String str = this.range;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fileName.hashCode()) * 31) + this.colorCode.hashCode()) * 31;
        String str2 = this.markerPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.tabNo;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NoteArgsItem(contentsId=" + this.contentsId + ", mode=" + this.mode + ", text=" + this.text + ", isDelete=" + this.isDelete + ", subTitle=" + this.subTitle + ", tagId=" + this.tagId + ", range=" + this.range + ", fileName=" + this.fileName + ", colorCode=" + this.colorCode + ", markerPath=" + this.markerPath + ", tabNo=" + this.tabNo + ")";
    }

    public NoteArgsItem(String contentsId, int i, String text, boolean z, String subTitle, String tagId, String str, String fileName, String colorCode, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(colorCode, "colorCode");
        this.contentsId = contentsId;
        this.mode = i;
        this.text = text;
        this.isDelete = z;
        this.subTitle = subTitle;
        this.tagId = tagId;
        this.range = str;
        this.fileName = fileName;
        this.colorCode = colorCode;
        this.markerPath = str2;
        this.tabNo = num;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final int getMode() {
        return this.mode;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isDelete() {
        return this.isDelete;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final String getRange() {
        return this.range;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public /* synthetic */ NoteArgsItem(String str, int i, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, z, str3, str4, (i2 & 64) != 0 ? null : str5, str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? null : str8, (i2 & 1024) != 0 ? null : num);
    }

    public final String getColorCode() {
        return this.colorCode;
    }

    public final String getMarkerPath() {
        return this.markerPath;
    }

    public final Integer getTabNo() {
        return this.tabNo;
    }
}
