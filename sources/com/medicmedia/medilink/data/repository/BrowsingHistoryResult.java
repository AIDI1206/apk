package com.medicmedia.medilink.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoStatusRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/data/repository/BrowsingHistoryResult;", "", "playTimeMillis", "", "updatedDate", "Ljava/util/Date;", "<init>", "(JLjava/util/Date;)V", "getPlayTimeMillis", "()J", "getUpdatedDate", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* data */ class BrowsingHistoryResult {
    private final long playTimeMillis;
    private final Date updatedDate;

    public static /* synthetic */ BrowsingHistoryResult copy$default(BrowsingHistoryResult browsingHistoryResult, long j, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            j = browsingHistoryResult.playTimeMillis;
        }
        if ((i & 2) != 0) {
            date = browsingHistoryResult.updatedDate;
        }
        return browsingHistoryResult.copy(j, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    public final BrowsingHistoryResult copy(long playTimeMillis, Date updatedDate) {
        return new BrowsingHistoryResult(playTimeMillis, updatedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowsingHistoryResult)) {
            return false;
        }
        BrowsingHistoryResult browsingHistoryResult = (BrowsingHistoryResult) other;
        return this.playTimeMillis == browsingHistoryResult.playTimeMillis && Intrinsics.areEqual(this.updatedDate, browsingHistoryResult.updatedDate);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.playTimeMillis) * 31;
        Date date = this.updatedDate;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "BrowsingHistoryResult(playTimeMillis=" + this.playTimeMillis + ", updatedDate=" + this.updatedDate + ")";
    }

    public BrowsingHistoryResult(long j, Date date) {
        this.playTimeMillis = j;
        this.updatedDate = date;
    }

    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    public final Date getUpdatedDate() {
        return this.updatedDate;
    }
}
