package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchResultVideoInfo;", "Lcom/medicmedia/medilink/domain/model/LinkVideoInfo;", "contentId", "", "courseId", "", "chapterId", "courseVideoId", "playTime", "<init>", "(Ljava/lang/String;IIII)V", "getContentId", "()Ljava/lang/String;", "getCourseId", "()I", "getChapterId", "()Ljava/lang/Integer;", "getCourseVideoId", "getPlayTime", "refId", "getRefId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchResultVideoInfo implements LinkVideoInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int chapterId;
    private final String contentId;
    private final int courseId;
    private final int courseVideoId;
    private final int playTime;

    public static /* synthetic */ SearchResultVideoInfo copy$default(SearchResultVideoInfo searchResultVideoInfo, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = searchResultVideoInfo.contentId;
        }
        if ((i5 & 2) != 0) {
            i = searchResultVideoInfo.courseId;
        }
        if ((i5 & 4) != 0) {
            i2 = searchResultVideoInfo.chapterId;
        }
        if ((i5 & 8) != 0) {
            i3 = searchResultVideoInfo.courseVideoId;
        }
        if ((i5 & 16) != 0) {
            i4 = searchResultVideoInfo.playTime;
        }
        int i6 = i4;
        int i7 = i2;
        return searchResultVideoInfo.copy(str, i, i7, i3, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCourseVideoId() {
        return this.courseVideoId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlayTime() {
        return this.playTime;
    }

    public final SearchResultVideoInfo copy(String contentId, int courseId, int chapterId, int courseVideoId, int playTime) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        return new SearchResultVideoInfo(contentId, courseId, chapterId, courseVideoId, playTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultVideoInfo)) {
            return false;
        }
        SearchResultVideoInfo searchResultVideoInfo = (SearchResultVideoInfo) other;
        return Intrinsics.areEqual(this.contentId, searchResultVideoInfo.contentId) && this.courseId == searchResultVideoInfo.courseId && this.chapterId == searchResultVideoInfo.chapterId && this.courseVideoId == searchResultVideoInfo.courseVideoId && this.playTime == searchResultVideoInfo.playTime;
    }

    public int hashCode() {
        return (((((((this.contentId.hashCode() * 31) + Integer.hashCode(this.courseId)) * 31) + Integer.hashCode(this.chapterId)) * 31) + Integer.hashCode(this.courseVideoId)) * 31) + Integer.hashCode(this.playTime);
    }

    public String toString() {
        return "SearchResultVideoInfo(contentId=" + this.contentId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", courseVideoId=" + this.courseVideoId + ", playTime=" + this.playTime + ")";
    }

    public SearchResultVideoInfo(String contentId, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        this.contentId = contentId;
        this.courseId = i;
        this.chapterId = i2;
        this.courseVideoId = i3;
        this.playTime = i4;
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public String getContentId() {
        return this.contentId;
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public int getCourseId() {
        return this.courseId;
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public Integer getChapterId() {
        return Integer.valueOf(this.chapterId);
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public Integer getCourseVideoId() {
        return Integer.valueOf(this.courseVideoId);
    }

    public final int getPlayTime() {
        return this.playTime;
    }

    public final String getRefId() {
        return getCourseId() + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + getChapterId() + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + getCourseVideoId() + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + this.playTime;
    }

    /* JADX INFO: compiled from: VideoCourseItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchResultVideoInfo$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/domain/model/SearchResultVideoInfo;", "contentId", "", "refId", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SearchResultVideoInfo convertTo(String contentId, String refId) {
            Intrinsics.checkNotNullParameter(contentId, "contentId");
            Intrinsics.checkNotNullParameter(refId, "refId");
            List listSplit$default = StringsKt.split$default((CharSequence) refId, new String[]{MLConst.MLCommon.SEPALETER_SINGLE_TEXT}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.size() != 4) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                return null;
            }
            return new SearchResultVideoInfo(contentId, ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue(), ((Number) arrayList2.get(2)).intValue(), ((Number) arrayList2.get(3)).intValue());
        }
    }
}
