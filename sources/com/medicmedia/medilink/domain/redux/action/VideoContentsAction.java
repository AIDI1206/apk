package com.medicmedia.medilink.domain.redux.action;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.VideoCourseItem;
import com.medicmedia.medilink.domain.redux.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoContentsAction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/action/VideoContentsAction;", "Lcom/medicmedia/medilink/domain/redux/Action;", "<init>", "()V", "SetVideoCourseItem", "SetChapterResume", "Lcom/medicmedia/medilink/domain/redux/action/VideoContentsAction$SetChapterResume;", "Lcom/medicmedia/medilink/domain/redux/action/VideoContentsAction$SetVideoCourseItem;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class VideoContentsAction implements Action {
    public /* synthetic */ VideoContentsAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VideoContentsAction() {
    }

    /* JADX INFO: compiled from: VideoContentsAction.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/action/VideoContentsAction$SetVideoCourseItem;", "Lcom/medicmedia/medilink/domain/redux/action/VideoContentsAction;", "item", "Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "isList", "", "playSec", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/VideoCourseItem;ZLjava/lang/String;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "()Z", "getPlaySec", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetVideoCourseItem extends VideoContentsAction {
        private final boolean isList;
        private final VideoCourseItem item;
        private final String playSec;

        public static /* synthetic */ SetVideoCourseItem copy$default(SetVideoCourseItem setVideoCourseItem, VideoCourseItem videoCourseItem, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                videoCourseItem = setVideoCourseItem.item;
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
        public final VideoCourseItem getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsList() {
            return this.isList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPlaySec() {
            return this.playSec;
        }

        public final SetVideoCourseItem copy(VideoCourseItem item, boolean isList, String playSec) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new SetVideoCourseItem(item, isList, playSec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetVideoCourseItem)) {
                return false;
            }
            SetVideoCourseItem setVideoCourseItem = (SetVideoCourseItem) other;
            return Intrinsics.areEqual(this.item, setVideoCourseItem.item) && this.isList == setVideoCourseItem.isList && Intrinsics.areEqual(this.playSec, setVideoCourseItem.playSec);
        }

        public int hashCode() {
            int iHashCode = ((this.item.hashCode() * 31) + Boolean.hashCode(this.isList)) * 31;
            String str = this.playSec;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SetVideoCourseItem(item=" + this.item + ", isList=" + this.isList + ", playSec=" + this.playSec + ")";
        }

        public /* synthetic */ SetVideoCourseItem(VideoCourseItem videoCourseItem, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(videoCourseItem, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
        }

        public final VideoCourseItem getItem() {
            return this.item;
        }

        public final boolean isList() {
            return this.isList;
        }

        public final String getPlaySec() {
            return this.playSec;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetVideoCourseItem(VideoCourseItem item, boolean z, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.isList = z;
            this.playSec = str;
        }
    }

    /* JADX INFO: compiled from: VideoContentsAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/action/VideoContentsAction$SetChapterResume;", "Lcom/medicmedia/medilink/domain/redux/action/VideoContentsAction;", "courseId", "", "chapterId", "<init>", "(II)V", "getCourseId", "()I", "getChapterId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetChapterResume extends VideoContentsAction {
        private final int chapterId;
        private final int courseId;

        public static /* synthetic */ SetChapterResume copy$default(SetChapterResume setChapterResume, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = setChapterResume.courseId;
            }
            if ((i3 & 2) != 0) {
                i2 = setChapterResume.chapterId;
            }
            return setChapterResume.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCourseId() {
            return this.courseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getChapterId() {
            return this.chapterId;
        }

        public final SetChapterResume copy(int courseId, int chapterId) {
            return new SetChapterResume(courseId, chapterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetChapterResume)) {
                return false;
            }
            SetChapterResume setChapterResume = (SetChapterResume) other;
            return this.courseId == setChapterResume.courseId && this.chapterId == setChapterResume.chapterId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.chapterId);
        }

        public String toString() {
            return "SetChapterResume(courseId=" + this.courseId + ", chapterId=" + this.chapterId + ")";
        }

        public final int getCourseId() {
            return this.courseId;
        }

        public final int getChapterId() {
            return this.chapterId;
        }

        public SetChapterResume(int i, int i2) {
            super(null);
            this.courseId = i;
            this.chapterId = i2;
        }
    }
}
