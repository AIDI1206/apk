package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReadContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010¨\u0006."}, d2 = {"Lcom/medicmedia/medilink/domain/model/ReadContentsItem;", "", "id", "", "listIndex", "", "listInnerIndex", "index", "path", "fileName", "contentsId", BundleKey.TAG_ID, BundleKey.TAB_NO, "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getListIndex", "()I", "getListInnerIndex", "getIndex", "getPath", "getFileName", "getContentsId", "getTagId", "getTabNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "url", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/domain/model/ReadContentsItem;", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ReadContentsItem {
    private final String contentsId;
    private final String fileName;
    private final String id;
    private final int index;
    private final int listIndex;
    private final int listInnerIndex;
    private final String path;
    private final Integer tabNo;
    private final String tagId;

    public ReadContentsItem() {
        this(null, 0, 0, 0, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ ReadContentsItem copy$default(ReadContentsItem readContentsItem, String str, int i, int i2, int i3, String str2, String str3, String str4, String str5, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = readContentsItem.id;
        }
        if ((i4 & 2) != 0) {
            i = readContentsItem.listIndex;
        }
        if ((i4 & 4) != 0) {
            i2 = readContentsItem.listInnerIndex;
        }
        if ((i4 & 8) != 0) {
            i3 = readContentsItem.index;
        }
        if ((i4 & 16) != 0) {
            str2 = readContentsItem.path;
        }
        if ((i4 & 32) != 0) {
            str3 = readContentsItem.fileName;
        }
        if ((i4 & 64) != 0) {
            str4 = readContentsItem.contentsId;
        }
        if ((i4 & 128) != 0) {
            str5 = readContentsItem.tagId;
        }
        if ((i4 & 256) != 0) {
            num = readContentsItem.tabNo;
        }
        String str6 = str5;
        Integer num2 = num;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        int i5 = i2;
        return readContentsItem.copy(str, i, i5, i3, str9, str7, str8, str6, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getListIndex() {
        return this.listIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getListInnerIndex() {
        return this.listInnerIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getTabNo() {
        return this.tabNo;
    }

    public final ReadContentsItem copy(String id, int listIndex, int listInnerIndex, int index, String path, String fileName, String contentsId, String tagId, Integer tabNo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        return new ReadContentsItem(id, listIndex, listInnerIndex, index, path, fileName, contentsId, tagId, tabNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadContentsItem)) {
            return false;
        }
        ReadContentsItem readContentsItem = (ReadContentsItem) other;
        return Intrinsics.areEqual(this.id, readContentsItem.id) && this.listIndex == readContentsItem.listIndex && this.listInnerIndex == readContentsItem.listInnerIndex && this.index == readContentsItem.index && Intrinsics.areEqual(this.path, readContentsItem.path) && Intrinsics.areEqual(this.fileName, readContentsItem.fileName) && Intrinsics.areEqual(this.contentsId, readContentsItem.contentsId) && Intrinsics.areEqual(this.tagId, readContentsItem.tagId) && Intrinsics.areEqual(this.tabNo, readContentsItem.tabNo);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.listIndex)) * 31) + Integer.hashCode(this.listInnerIndex)) * 31) + Integer.hashCode(this.index)) * 31) + this.path.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.contentsId.hashCode()) * 31) + this.tagId.hashCode()) * 31;
        Integer num = this.tabNo;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ReadContentsItem(id=" + this.id + ", listIndex=" + this.listIndex + ", listInnerIndex=" + this.listInnerIndex + ", index=" + this.index + ", path=" + this.path + ", fileName=" + this.fileName + ", contentsId=" + this.contentsId + ", tagId=" + this.tagId + ", tabNo=" + this.tabNo + ")";
    }

    public ReadContentsItem(String id, int i, int i2, int i3, String path, String fileName, String contentsId, String tagId, Integer num) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        this.id = id;
        this.listIndex = i;
        this.listInnerIndex = i2;
        this.index = i3;
        this.path = path;
        this.fileName = fileName;
        this.contentsId = contentsId;
        this.tagId = tagId;
        this.tabNo = num;
    }

    public /* synthetic */ ReadContentsItem(String str, int i, int i2, int i3, String str2, String str3, String str4, String str5, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? null : num);
    }

    public final String getId() {
        return this.id;
    }

    public final int getListIndex() {
        return this.listIndex;
    }

    public final int getListInnerIndex() {
        return this.listInnerIndex;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final Integer getTabNo() {
        return this.tabNo;
    }

    public final String getUrl() {
        return MLConst.MLCommon.FILE_FORMAT + this.path + this.fileName;
    }
}
