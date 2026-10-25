package com.medicmedia.medilink.domain.redux.store;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.redux.Action;
import com.medicmedia.medilink.domain.redux.Reducer;
import com.medicmedia.medilink.domain.redux.Store;
import com.medicmedia.medilink.domain.redux.action.VideoContentsAction;
import com.medicmedia.medilink.domain.redux.state.VideoContentsState;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoContentsStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\f0\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/store/VideoContentsStore;", "Lcom/medicmedia/medilink/domain/redux/Store;", "Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState;", "reducer", "Lcom/medicmedia/medilink/domain/redux/Reducer;", "<init>", "(Lcom/medicmedia/medilink/domain/redux/Reducer;)V", "_videoCourseItem", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState$SetVideoCourseItem;", "kotlin.jvm.PlatformType", "_chapterResumeItem", "Lcom/medicmedia/medilink/domain/redux/state/VideoContentsState$SetChapterResumeItem;", "videoCourseItem", "Lio/reactivex/Observable;", "getVideoCourseItem", "()Lio/reactivex/Observable;", "chapterResumeItem", "getChapterResumeItem", "dispatch", "", "action", "Lcom/medicmedia/medilink/domain/redux/Action;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoContentsStore implements Store<VideoContentsState> {
    private final BehaviorSubject<VideoContentsState.SetChapterResumeItem> _chapterResumeItem;
    private final BehaviorSubject<VideoContentsState.SetVideoCourseItem> _videoCourseItem;
    private final Observable<VideoContentsState.SetChapterResumeItem> chapterResumeItem;
    private final Reducer<VideoContentsState> reducer;
    private final Observable<VideoContentsState.SetVideoCourseItem> videoCourseItem;

    @Inject
    public VideoContentsStore(Reducer<VideoContentsState> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        this.reducer = reducer;
        BehaviorSubject<VideoContentsState.SetVideoCourseItem> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(new VideoContentsState.SetVideoCourseItem(null, false, null, 7, null));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this._videoCourseItem = behaviorSubjectCreateDefault;
        BehaviorSubject<VideoContentsState.SetChapterResumeItem> behaviorSubjectCreateDefault2 = BehaviorSubject.createDefault(new VideoContentsState.SetChapterResumeItem(0, 0, 3, null));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault2, "createDefault(...)");
        this._chapterResumeItem = behaviorSubjectCreateDefault2;
        this.videoCourseItem = behaviorSubjectCreateDefault;
        this.chapterResumeItem = behaviorSubjectCreateDefault2;
    }

    public final Observable<VideoContentsState.SetVideoCourseItem> getVideoCourseItem() {
        return this.videoCourseItem;
    }

    public final Observable<VideoContentsState.SetChapterResumeItem> getChapterResumeItem() {
        return this.chapterResumeItem;
    }

    @Override // com.medicmedia.medilink.domain.redux.Store
    public void dispatch(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof VideoContentsAction.SetVideoCourseItem) {
            Reducer<VideoContentsState> reducer = this.reducer;
            VideoContentsState.SetVideoCourseItem value = this._videoCourseItem.getValue();
            if (value == null) {
                value = new VideoContentsState.SetVideoCourseItem(null, false, null, 7, null);
            }
            VideoContentsState videoContentsState = (VideoContentsState) reducer.reduce(value, action);
            if (videoContentsState instanceof VideoContentsState.SetVideoCourseItem) {
                this._videoCourseItem.onNext((VideoContentsState.SetVideoCourseItem) videoContentsState);
            }
            if (videoContentsState instanceof VideoContentsState.SetChapterResumeItem) {
                this._chapterResumeItem.onNext((VideoContentsState.SetChapterResumeItem) videoContentsState);
            }
        }
    }
}
