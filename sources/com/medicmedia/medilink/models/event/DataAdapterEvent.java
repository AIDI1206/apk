package com.medicmedia.medilink.models.event;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.model.ContentsUrlItem;
import com.medicmedia.medilink.domain.model.DeviceItem;
import com.medicmedia.medilink.domain.model.SearchResultVideoInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataAdapterEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/models/event/DataAdapterEvent;", "", "GetCourseContentsEvent", "StartContentsFromSearch", "StartVideoContentsFromSearch", "SelectedDeviceItem", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent$GetCourseContentsEvent;", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent$SelectedDeviceItem;", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent$StartContentsFromSearch;", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent$StartVideoContentsFromSearch;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DataAdapterEvent {

    /* JADX INFO: compiled from: DataAdapterEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/models/event/DataAdapterEvent$GetCourseContentsEvent;", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent;", "courseId", "", "isList", "", "playSec", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getCourseId", "()Ljava/lang/String;", "()Z", "getPlaySec", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class GetCourseContentsEvent implements DataAdapterEvent {
        public static final int $stable = 0;
        private final String courseId;
        private final boolean isList;
        private final String playSec;

        public static /* synthetic */ GetCourseContentsEvent copy$default(GetCourseContentsEvent getCourseContentsEvent, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getCourseContentsEvent.courseId;
            }
            if ((i & 2) != 0) {
                z = getCourseContentsEvent.isList;
            }
            if ((i & 4) != 0) {
                str2 = getCourseContentsEvent.playSec;
            }
            return getCourseContentsEvent.copy(str, z, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCourseId() {
            return this.courseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsList() {
            return this.isList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPlaySec() {
            return this.playSec;
        }

        public final GetCourseContentsEvent copy(String courseId, boolean isList, String playSec) {
            Intrinsics.checkNotNullParameter(courseId, "courseId");
            return new GetCourseContentsEvent(courseId, isList, playSec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetCourseContentsEvent)) {
                return false;
            }
            GetCourseContentsEvent getCourseContentsEvent = (GetCourseContentsEvent) other;
            return Intrinsics.areEqual(this.courseId, getCourseContentsEvent.courseId) && this.isList == getCourseContentsEvent.isList && Intrinsics.areEqual(this.playSec, getCourseContentsEvent.playSec);
        }

        public int hashCode() {
            int iHashCode = ((this.courseId.hashCode() * 31) + Boolean.hashCode(this.isList)) * 31;
            String str = this.playSec;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GetCourseContentsEvent(courseId=" + this.courseId + ", isList=" + this.isList + ", playSec=" + this.playSec + ")";
        }

        public GetCourseContentsEvent(String courseId, boolean z, String str) {
            Intrinsics.checkNotNullParameter(courseId, "courseId");
            this.courseId = courseId;
            this.isList = z;
            this.playSec = str;
        }

        public final String getCourseId() {
            return this.courseId;
        }

        public final boolean isList() {
            return this.isList;
        }

        public final String getPlaySec() {
            return this.playSec;
        }
    }

    /* JADX INFO: compiled from: DataAdapterEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/models/event/DataAdapterEvent$StartContentsFromSearch;", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent;", "contentsId", "", BundleKey.TAG_ID, "searchQuery", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getTagId", "getSearchQuery", "toItem", "Lcom/medicmedia/medilink/domain/model/ContentsUrlItem;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class StartContentsFromSearch implements DataAdapterEvent {
        public static final int $stable = 0;
        private final String contentsId;
        private final String searchQuery;
        private final String tagId;

        public static /* synthetic */ StartContentsFromSearch copy$default(StartContentsFromSearch startContentsFromSearch, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startContentsFromSearch.contentsId;
            }
            if ((i & 2) != 0) {
                str2 = startContentsFromSearch.tagId;
            }
            if ((i & 4) != 0) {
                str3 = startContentsFromSearch.searchQuery;
            }
            return startContentsFromSearch.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTagId() {
            return this.tagId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public final StartContentsFromSearch copy(String contentsId, String tagId, String searchQuery) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(tagId, "tagId");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            return new StartContentsFromSearch(contentsId, tagId, searchQuery);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartContentsFromSearch)) {
                return false;
            }
            StartContentsFromSearch startContentsFromSearch = (StartContentsFromSearch) other;
            return Intrinsics.areEqual(this.contentsId, startContentsFromSearch.contentsId) && Intrinsics.areEqual(this.tagId, startContentsFromSearch.tagId) && Intrinsics.areEqual(this.searchQuery, startContentsFromSearch.searchQuery);
        }

        public int hashCode() {
            return (((this.contentsId.hashCode() * 31) + this.tagId.hashCode()) * 31) + this.searchQuery.hashCode();
        }

        public String toString() {
            return "StartContentsFromSearch(contentsId=" + this.contentsId + ", tagId=" + this.tagId + ", searchQuery=" + this.searchQuery + ")";
        }

        public StartContentsFromSearch(String contentsId, String tagId, String searchQuery) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(tagId, "tagId");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            this.contentsId = contentsId;
            this.tagId = tagId;
            this.searchQuery = searchQuery;
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final String getTagId() {
            return this.tagId;
        }

        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public final ContentsUrlItem toItem() {
            return new ContentsUrlItem(this.contentsId, this.tagId, null, null, this.searchQuery, 12, null);
        }
    }

    /* JADX INFO: compiled from: DataAdapterEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/models/event/DataAdapterEvent$StartVideoContentsFromSearch;", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent;", "contentsId", "", "refId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getRefId", "toVideoInfo", "Lcom/medicmedia/medilink/domain/model/SearchResultVideoInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class StartVideoContentsFromSearch implements DataAdapterEvent {
        public static final int $stable = 0;
        private final String contentsId;
        private final String refId;

        public static /* synthetic */ StartVideoContentsFromSearch copy$default(StartVideoContentsFromSearch startVideoContentsFromSearch, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startVideoContentsFromSearch.contentsId;
            }
            if ((i & 2) != 0) {
                str2 = startVideoContentsFromSearch.refId;
            }
            return startVideoContentsFromSearch.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRefId() {
            return this.refId;
        }

        public final StartVideoContentsFromSearch copy(String contentsId, String refId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(refId, "refId");
            return new StartVideoContentsFromSearch(contentsId, refId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartVideoContentsFromSearch)) {
                return false;
            }
            StartVideoContentsFromSearch startVideoContentsFromSearch = (StartVideoContentsFromSearch) other;
            return Intrinsics.areEqual(this.contentsId, startVideoContentsFromSearch.contentsId) && Intrinsics.areEqual(this.refId, startVideoContentsFromSearch.refId);
        }

        public int hashCode() {
            return (this.contentsId.hashCode() * 31) + this.refId.hashCode();
        }

        public String toString() {
            return "StartVideoContentsFromSearch(contentsId=" + this.contentsId + ", refId=" + this.refId + ")";
        }

        public StartVideoContentsFromSearch(String contentsId, String refId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(refId, "refId");
            this.contentsId = contentsId;
            this.refId = refId;
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final String getRefId() {
            return this.refId;
        }

        public final SearchResultVideoInfo toVideoInfo() {
            return SearchResultVideoInfo.INSTANCE.convertTo(this.contentsId, this.refId);
        }
    }

    /* JADX INFO: compiled from: DataAdapterEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/models/event/DataAdapterEvent$SelectedDeviceItem;", "Lcom/medicmedia/medilink/models/event/DataAdapterEvent;", "item", "Lcom/medicmedia/medilink/domain/model/DeviceItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/DeviceItem;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/DeviceItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SelectedDeviceItem implements DataAdapterEvent {
        public static final int $stable = 8;
        private final DeviceItem item;

        public static /* synthetic */ SelectedDeviceItem copy$default(SelectedDeviceItem selectedDeviceItem, DeviceItem deviceItem, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceItem = selectedDeviceItem.item;
            }
            return selectedDeviceItem.copy(deviceItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeviceItem getItem() {
            return this.item;
        }

        public final SelectedDeviceItem copy(DeviceItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new SelectedDeviceItem(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectedDeviceItem) && Intrinsics.areEqual(this.item, ((SelectedDeviceItem) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "SelectedDeviceItem(item=" + this.item + ")";
        }

        public SelectedDeviceItem(DeviceItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public final DeviceItem getItem() {
            return this.item;
        }
    }
}
