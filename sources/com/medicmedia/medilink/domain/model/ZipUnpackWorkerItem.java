package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.Data;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: compiled from: WorkerItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/domain/model/ZipUnpackWorkerItem;", "Lcom/medicmedia/medilink/domain/model/WorkerItem;", "contentId", "", WorkerKey.KEY_VERSION, "dirPath", WorkerKey.KEY_DOWNLOAD_ID, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getContentId", "()Ljava/lang/String;", "getVersion", "getDirPath", "getDownloadId", "()J", "uniqueName", "getUniqueName", "convertToWorkerData", "Landroidx/work/Data;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ZipUnpackWorkerItem implements WorkerItem {
    private final String contentId;
    private final String dirPath;
    private final long downloadId;
    private final String uniqueName;
    private final String version;

    public static /* synthetic */ ZipUnpackWorkerItem copy$default(ZipUnpackWorkerItem zipUnpackWorkerItem, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zipUnpackWorkerItem.contentId;
        }
        if ((i & 2) != 0) {
            str2 = zipUnpackWorkerItem.version;
        }
        if ((i & 4) != 0) {
            str3 = zipUnpackWorkerItem.dirPath;
        }
        if ((i & 8) != 0) {
            j = zipUnpackWorkerItem.downloadId;
        }
        String str4 = str3;
        return zipUnpackWorkerItem.copy(str, str2, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDirPath() {
        return this.dirPath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDownloadId() {
        return this.downloadId;
    }

    public final ZipUnpackWorkerItem copy(String contentId, String version, String dirPath, long downloadId) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        return new ZipUnpackWorkerItem(contentId, version, dirPath, downloadId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZipUnpackWorkerItem)) {
            return false;
        }
        ZipUnpackWorkerItem zipUnpackWorkerItem = (ZipUnpackWorkerItem) other;
        return Intrinsics.areEqual(this.contentId, zipUnpackWorkerItem.contentId) && Intrinsics.areEqual(this.version, zipUnpackWorkerItem.version) && Intrinsics.areEqual(this.dirPath, zipUnpackWorkerItem.dirPath) && this.downloadId == zipUnpackWorkerItem.downloadId;
    }

    public int hashCode() {
        return (((((this.contentId.hashCode() * 31) + this.version.hashCode()) * 31) + this.dirPath.hashCode()) * 31) + Long.hashCode(this.downloadId);
    }

    public String toString() {
        return "ZipUnpackWorkerItem(contentId=" + this.contentId + ", version=" + this.version + ", dirPath=" + this.dirPath + ", downloadId=" + this.downloadId + ")";
    }

    public ZipUnpackWorkerItem(String contentId, String version, String dirPath, long j) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        this.contentId = contentId;
        this.version = version;
        this.dirPath = dirPath;
        this.downloadId = j;
        this.uniqueName = "zip-unpack-" + j + HelpFormatter.DEFAULT_OPT_PREFIX + version + HelpFormatter.DEFAULT_OPT_PREFIX + contentId;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getDirPath() {
        return this.dirPath;
    }

    public final long getDownloadId() {
        return this.downloadId;
    }

    @Override // com.medicmedia.medilink.domain.model.WorkerItem
    public String getUniqueName() {
        return this.uniqueName;
    }

    @Override // com.medicmedia.medilink.domain.model.WorkerItem
    public Data convertToWorkerData() {
        Pair[] pairArr = {TuplesKt.to("contents_id", this.contentId), TuplesKt.to(WorkerKey.KEY_VERSION, this.version), TuplesKt.to(WorkerKey.KEY_DIR_PATH, this.dirPath), TuplesKt.to(WorkerKey.KEY_DOWNLOAD_ID, Long.valueOf(this.downloadId))};
        Data.Builder builder = new Data.Builder();
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            builder.put((String) pair.getFirst(), pair.getSecond());
        }
        return builder.build();
    }
}
