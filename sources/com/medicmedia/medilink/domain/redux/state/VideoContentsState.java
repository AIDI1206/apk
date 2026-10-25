package com.medicmedia.medilink.domain.redux.state;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.VideoCourseItem;
import com.medicmedia.medilink.domain.redux.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoContentsState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState;", "Lcom/medicmedia/medilink/domain/redux/State;", "<init>", "()V", "copyVideoCourseItem", "courseItem", "Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "isList", "", "playSec", "", "copyChapterResume", "courseId", "", "chapterId", "SetVideoCourseItem", "SetChapterResumeItem", "Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState$SetChapterResumeItem;", "Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState$SetVideoCourseItem;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class VideoContentsState implements State {
    public /* synthetic */ VideoContentsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VideoContentsState() {
    }

    /* JADX INFO: compiled from: VideoContentsState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState$SetVideoCourseItem;", "Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState;", "courseItem", "Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "isList", "", "playSec", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/VideoCourseItem;ZLjava/lang/String;)V", "getCourseItem", "()Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "()Z", "getPlaySec", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetVideoCourseItem extends VideoContentsState {
        private final VideoCourseItem courseItem;
        private final boolean isList;
        private final String playSec;

        public SetVideoCourseItem() {
            this(null, false, null, 7, null);
        }

        public static /* synthetic */ SetVideoCourseItem copy$default(SetVideoCourseItem setVideoCourseItem, VideoCourseItem videoCourseItem, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                videoCourseItem = setVideoCourseItem.courseItem;
            }
            if ((i & 2) != 0) {
                z = setVideoCourseItem.isList;
            }
            if ((i & 4) != 0) {
                str = setVideoCourseItem.playSec;
            }
            return setVideoCourseItem.copy(videoCourseItem, z, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoCourseItem getCourseItem() {
            return this.courseItem;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsList() {
            return this.isList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPlaySec() {
            return this.playSec;
        }

        public final SetVideoCourseItem copy(VideoCourseItem courseItem, boolean isList, String playSec) {
            return new SetVideoCourseItem(courseItem, isList, playSec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetVideoCourseItem)) {
                return false;
            }
            SetVideoCourseItem setVideoCourseItem = (SetVideoCourseItem) other;
            return Intrinsics.areEqual(this.courseItem, setVideoCourseItem.courseItem) && this.isList == setVideoCourseItem.isList && Intrinsics.areEqual(this.playSec, setVideoCourseItem.playSec);
        }

        public int hashCode() {
            VideoCourseItem videoCourseItem = this.courseItem;
            int iHashCode = (((videoCourseItem == null ? 0 : videoCourseItem.hashCode()) * 31) + Boolean.hashCode(this.isList)) * 31;
            String str = this.playSec;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SetVideoCourseItem(courseItem=" + this.courseItem + ", isList=" + this.isList + ", playSec=" + this.playSec + ")";
        }

        public /* synthetic */ SetVideoCourseItem(VideoCourseItem videoCourseItem, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : videoCourseItem, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
        }

        public final VideoCourseItem getCourseItem() {
            return this.courseItem;
        }

        public final boolean isList() {
            return this.isList;
        }

        public final String getPlaySec() {
            return this.playSec;
        }

        public SetVideoCourseItem(VideoCourseItem videoCourseItem, boolean z, String str) {
            super(null);
            this.courseItem = videoCourseItem;
            this.isList = z;
            this.playSec = str;
        }
    }

    /* JADX INFO: compiled from: VideoContentsState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState$SetChapterResumeItem;", "Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState;", "courseId", "", "chapterId", "<init>", "(II)V", "getCourseId", "()I", "getChapterId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetChapterResumeItem extends VideoContentsState {
        private final int chapterId;
        private final int courseId;

        /* JADX WARN: Illegal instructions before constructor call */
        public SetChapterResumeItem() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ SetChapterResumeItem copy$default(SetChapterResumeItem setChapterResumeItem, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = setChapterResumeItem.courseId;
            }
            if ((i3 & 2) != 0) {
                i2 = setChapterResumeItem.chapterId;
            }
            return setChapterResumeItem.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCourseId() {
            return this.courseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getChapterId() {
            return this.chapterId;
        }

        public final SetChapterResumeItem copy(int courseId, int chapterId) {
            return new SetChapterResumeItem(courseId, chapterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetChapterResumeItem)) {
                return false;
            }
            SetChapterResumeItem setChapterResumeItem = (SetChapterResumeItem) other;
            return this.courseId == setChapterResumeItem.courseId && this.chapterId == setChapterResumeItem.chapterId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.chapterId);
        }

        public String toString() {
            return "SetChapterResumeItem(courseId=" + this.courseId + ", chapterId=" + this.chapterId + ")";
        }

        public /* synthetic */ SetChapterResumeItem(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }

        public final int getCourseId() {
            return this.courseId;
        }

        public final int getChapterId() {
            return this.chapterId;
        }

        public SetChapterResumeItem(int i, int i2) {
            super(null);
            this.courseId = i;
            this.chapterId = i2;
        }
    }

    public final VideoContentsState copyVideoCourseItem(VideoCourseItem courseItem, boolean isList, String playSec) {
        return new SetVideoCourseItem(courseItem, isList, playSec);
    }

    public final VideoContentsState copyChapterResume(int courseId, int chapterId) {
        return new SetChapterResumeItem(courseId, chapterId);
    }
}
