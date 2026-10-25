package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoteViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/domain/model/NoteOptionVideoMemoItemJson;", "", "playTime", "", "updatedDate", HistoryRepositoryImpl.Path.MEMO, "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getPlayTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUpdatedDate", "getMemo", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/medicmedia/medilink/domain/model/NoteOptionVideoMemoItemJson;", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NoteOptionVideoMemoItemJson {
    private final String memo;

    @SerializedName("play_time")
    private final Long playTime;

    @SerializedName("updated_sec")
    private final Long updatedDate;

    public static /* synthetic */ NoteOptionVideoMemoItemJson copy$default(NoteOptionVideoMemoItemJson noteOptionVideoMemoItemJson, Long l, Long l2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = noteOptionVideoMemoItemJson.playTime;
        }
        if ((i & 2) != 0) {
            l2 = noteOptionVideoMemoItemJson.updatedDate;
        }
        if ((i & 4) != 0) {
            str = noteOptionVideoMemoItemJson.memo;
        }
        return noteOptionVideoMemoItemJson.copy(l, l2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getPlayTime() {
        return this.playTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    public final NoteOptionVideoMemoItemJson copy(Long playTime, Long updatedDate, String memo) {
        return new NoteOptionVideoMemoItemJson(playTime, updatedDate, memo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteOptionVideoMemoItemJson)) {
            return false;
        }
        NoteOptionVideoMemoItemJson noteOptionVideoMemoItemJson = (NoteOptionVideoMemoItemJson) other;
        return Intrinsics.areEqual(this.playTime, noteOptionVideoMemoItemJson.playTime) && Intrinsics.areEqual(this.updatedDate, noteOptionVideoMemoItemJson.updatedDate) && Intrinsics.areEqual(this.memo, noteOptionVideoMemoItemJson.memo);
    }

    public int hashCode() {
        Long l = this.playTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.updatedDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.memo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NoteOptionVideoMemoItemJson(playTime=" + this.playTime + ", updatedDate=" + this.updatedDate + ", memo=" + this.memo + ")";
    }

    public NoteOptionVideoMemoItemJson(Long l, Long l2, String str) {
        this.playTime = l;
        this.updatedDate = l2;
        this.memo = str;
    }

    public final Long getPlayTime() {
        return this.playTime;
    }

    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    public final String getMemo() {
        return this.memo;
    }
}
