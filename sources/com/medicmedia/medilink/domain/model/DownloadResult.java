package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DownloadResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DownloadResult;", "", "StartWorker", "DownloadEnd", "Lcom/medicmedia/medilink/domain/model/DownloadResult$DownloadEnd;", "Lcom/medicmedia/medilink/domain/model/DownloadResult$StartWorker;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DownloadResult {

    /* JADX INFO: compiled from: DownloadResult.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DownloadResult$StartWorker;", "Lcom/medicmedia/medilink/domain/model/DownloadResult;", "item", "Lcom/medicmedia/medilink/domain/model/WorkerItem;", "contentsId", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/WorkerItem;Ljava/lang/String;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/WorkerItem;", "getContentsId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class StartWorker implements DownloadResult {
        private final String contentsId;
        private final WorkerItem item;

        public static /* synthetic */ StartWorker copy$default(StartWorker startWorker, WorkerItem workerItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                workerItem = startWorker.item;
            }
            if ((i & 2) != 0) {
                str = startWorker.contentsId;
            }
            return startWorker.copy(workerItem, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WorkerItem getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        public final StartWorker copy(WorkerItem item, String contentsId) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new StartWorker(item, contentsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartWorker)) {
                return false;
            }
            StartWorker startWorker = (StartWorker) other;
            return Intrinsics.areEqual(this.item, startWorker.item) && Intrinsics.areEqual(this.contentsId, startWorker.contentsId);
        }

        public int hashCode() {
            return (this.item.hashCode() * 31) + this.contentsId.hashCode();
        }

        public String toString() {
            return "StartWorker(item=" + this.item + ", contentsId=" + this.contentsId + ")";
        }

        public StartWorker(WorkerItem item, String contentsId) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.item = item;
            this.contentsId = contentsId;
        }

        public final WorkerItem getItem() {
            return this.item;
        }

        public final String getContentsId() {
            return this.contentsId;
        }
    }

    /* JADX INFO: compiled from: DownloadResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DownloadResult$DownloadEnd;", "Lcom/medicmedia/medilink/domain/model/DownloadResult;", FirebaseAnalytics.Param.ITEMS, "", "", "", "<init>", "(Ljava/util/Map;)V", "getItems", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DownloadEnd implements DownloadResult {
        private final Map<String, Long> items;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DownloadEnd copy$default(DownloadEnd downloadEnd, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = downloadEnd.items;
            }
            return downloadEnd.copy(map);
        }

        public final Map<String, Long> component1() {
            return this.items;
        }

        public final DownloadEnd copy(Map<String, Long> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new DownloadEnd(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownloadEnd) && Intrinsics.areEqual(this.items, ((DownloadEnd) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "DownloadEnd(items=" + this.items + ")";
        }

        public DownloadEnd(Map<String, Long> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        public final Map<String, Long> getItems() {
            return this.items;
        }
    }
}
