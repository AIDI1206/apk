package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.ConstKt;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoteViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/NoteOptionVideoMemoItem;", "", "id", "", "playTime", "", "updatedDate", HistoryRepositoryImpl.Path.MEMO, "<init>", "(Ljava/lang/String;JJLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPlayTime", "()J", "getUpdatedDate", "getMemo", "regisDate", "getRegisDate", "videoPlayTime", "getVideoPlayTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NoteOptionVideoMemoItem {
    private final String id;
    private final String memo;
    private final long playTime;
    private final long updatedDate;

    public static /* synthetic */ NoteOptionVideoMemoItem copy$default(NoteOptionVideoMemoItem noteOptionVideoMemoItem, String str, long j, long j2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteOptionVideoMemoItem.id;
        }
        if ((i & 2) != 0) {
            j = noteOptionVideoMemoItem.playTime;
        }
        if ((i & 4) != 0) {
            j2 = noteOptionVideoMemoItem.updatedDate;
        }
        if ((i & 8) != 0) {
            str2 = noteOptionVideoMemoItem.memo;
        }
        String str3 = str2;
        return noteOptionVideoMemoItem.copy(str, j, j2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPlayTime() {
        return this.playTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    public final NoteOptionVideoMemoItem copy(String id, long playTime, long updatedDate, String memo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(memo, "memo");
        return new NoteOptionVideoMemoItem(id, playTime, updatedDate, memo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteOptionVideoMemoItem)) {
            return false;
        }
        NoteOptionVideoMemoItem noteOptionVideoMemoItem = (NoteOptionVideoMemoItem) other;
        return Intrinsics.areEqual(this.id, noteOptionVideoMemoItem.id) && this.playTime == noteOptionVideoMemoItem.playTime && this.updatedDate == noteOptionVideoMemoItem.updatedDate && Intrinsics.areEqual(this.memo, noteOptionVideoMemoItem.memo);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + Long.hashCode(this.playTime)) * 31) + Long.hashCode(this.updatedDate)) * 31) + this.memo.hashCode();
    }

    public String toString() {
        return "NoteOptionVideoMemoItem(id=" + this.id + ", playTime=" + this.playTime + ", updatedDate=" + this.updatedDate + ", memo=" + this.memo + ")";
    }

    public NoteOptionVideoMemoItem(String id, long j, long j2, String memo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.id = id;
        this.playTime = j;
        this.updatedDate = j2;
        this.memo = memo;
    }

    public /* synthetic */ NoteOptionVideoMemoItem(String str, long j, long j2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, j, j2, str2);
    }

    public final String getId() {
        return this.id;
    }

    public final long getPlayTime() {
        return this.playTime;
    }

    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final String getRegisDate() {
        String str = ConstKt.getDateFormatCard().format(new Date(new Timestamp(this.updatedDate).getTime() * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "let(...)");
        return str;
    }

    public final String getVideoPlayTime() {
        String str = ConstKt.getDataFormatMMSS().format(Long.valueOf(this.playTime));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
