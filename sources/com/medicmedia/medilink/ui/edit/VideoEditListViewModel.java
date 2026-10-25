package com.medicmedia.medilink.ui.edit;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.MediaItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.database.models.BookShelfItem;
import com.medicmedia.medilink.domain.model.Logger;
import com.medicmedia.medilink.domain.model.RecyclerViewItem;
import com.medicmedia.medilink.domain.model.VideoChapter;
import com.medicmedia.medilink.domain.model.VideoCourseItem;
import com.medicmedia.medilink.domain.model.VideoCourseItemKt;
import com.medicmedia.medilink.domain.model.VideoSubItem;
import com.medicmedia.medilink.domain.usecase.VideoDownloadUseCase;
import com.medicmedia.medilink.domain.usecase.VideoUseCase;
import com.medicmedia.medilink.ui.R;
import io.realm.kotlin.internal.interop.realm_sync_errno_session_e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

/* JADX INFO: compiled from: VideoEditListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*J*\u0010,\u001a\u00020\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00102\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0010H\u0086@¢\u0006\u0002\u00100J6\u00101\u001a\u00020\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00102\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001003H\u0082@¢\u0006\u0002\u00105J\u0014\u00106\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0010J\u0014\u00109\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f8F¢\u0006\u0006\u001a\u0004\b%\u0010\r¨\u0006:"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/VideoEditListViewModel;", "Landroidx/lifecycle/ViewModel;", "videoUseCase", "Lcom/medicmedia/medilink/domain/usecase/VideoUseCase;", "videoDownloadUseCase", "Lcom/medicmedia/medilink/domain/usecase/VideoDownloadUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/VideoUseCase;Lcom/medicmedia/medilink/domain/usecase/VideoDownloadUseCase;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_deleteViewItems", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/medicmedia/medilink/domain/model/RecyclerViewItem;", "deleteViewItems", "getDeleteViewItems", "_downloadItems", "downloadItems", "getDownloadItems", "_videoProgressDialog", "Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo;", "videoProgressDialog", "getVideoProgressDialog", "_closeVideoProgressDialog", "", "closeVideoProgressDialog", "getCloseVideoProgressDialog", "_completed", "completed", "getCompleted", "_errorMessage", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "getVideoContentsOption", "Lorg/json/JSONObject;", "setupDownloadAllItem", "contentCode", "", "setupDeleteVideoItems", "requestMissingChapters", "courseItems", "Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "missingItems", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDownloadItems", "chaptersByCourseId", "", "Lcom/medicmedia/medilink/domain/model/VideoChapter;", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDownloadAll", FirebaseAnalytics.Param.ITEMS, "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "deleteDownloadVideos", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoEditListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Unit> _closeVideoProgressDialog;
    private final MutableLiveData<Unit> _completed;
    private final MediatorLiveData<List<RecyclerViewItem>> _deleteViewItems;
    private final MutableLiveData<List<RecyclerViewItem>> _downloadItems;
    private final MutableLiveData<Integer> _errorMessage;
    private final MutableLiveData<Boolean> _isLoading;
    private final MutableLiveData<ContentProgressInfo> _videoProgressDialog;
    private final LiveData<Unit> closeVideoProgressDialog;
    private final LiveData<List<RecyclerViewItem>> deleteViewItems;
    private final LiveData<List<RecyclerViewItem>> downloadItems;
    private final LiveData<Boolean> isLoading;
    private final VideoDownloadUseCase videoDownloadUseCase;
    private final LiveData<ContentProgressInfo> videoProgressDialog;
    private final VideoUseCase videoUseCase;

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.edit.VideoEditListViewModel$updateDownloadItems$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VideoEditListViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.edit.VideoEditListViewModel", f = "VideoEditListViewModel.kt", i = {0, 0, 0}, l = {realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_SCHEMA_VERSION}, m = "updateDownloadItems", n = {"this", "courseItems", "chaptersByCourseId"}, s = {"L$0", "L$1", "L$2"})
    static final class C08731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C08731(Continuation<? super C08731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VideoEditListViewModel.this.updateDownloadItems(null, null, this);
        }
    }

    @Inject
    public VideoEditListViewModel(VideoUseCase videoUseCase, VideoDownloadUseCase videoDownloadUseCase) {
        Intrinsics.checkNotNullParameter(videoUseCase, "videoUseCase");
        Intrinsics.checkNotNullParameter(videoDownloadUseCase, "videoDownloadUseCase");
        this.videoUseCase = videoUseCase;
        this.videoDownloadUseCase = videoDownloadUseCase;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(false);
        this._isLoading = mutableLiveData;
        this.isLoading = mutableLiveData;
        MediatorLiveData<List<RecyclerViewItem>> mediatorLiveData = new MediatorLiveData<>();
        this._deleteViewItems = mediatorLiveData;
        this.deleteViewItems = mediatorLiveData;
        MutableLiveData<List<RecyclerViewItem>> mutableLiveData2 = new MutableLiveData<>();
        this._downloadItems = mutableLiveData2;
        this.downloadItems = mutableLiveData2;
        MutableLiveData<ContentProgressInfo> mutableLiveData3 = new MutableLiveData<>();
        this._videoProgressDialog = mutableLiveData3;
        this.videoProgressDialog = mutableLiveData3;
        MutableLiveData<Unit> mutableLiveData4 = new MutableLiveData<>();
        this._closeVideoProgressDialog = mutableLiveData4;
        this.closeVideoProgressDialog = mutableLiveData4;
        this._completed = new MutableLiveData<>();
        this._errorMessage = new MutableLiveData<>();
    }

    public final LiveData<Boolean> isLoading() {
        return this.isLoading;
    }

    public final LiveData<List<RecyclerViewItem>> getDeleteViewItems() {
        return this.deleteViewItems;
    }

    public final LiveData<List<RecyclerViewItem>> getDownloadItems() {
        return this.downloadItems;
    }

    public final LiveData<ContentProgressInfo> getVideoProgressDialog() {
        return this.videoProgressDialog;
    }

    public final LiveData<Unit> getCloseVideoProgressDialog() {
        return this.closeVideoProgressDialog;
    }

    public final LiveData<Unit> getCompleted() {
        return this._completed;
    }

    public final LiveData<Integer> getError() {
        return this._errorMessage;
    }

    public final JSONObject getVideoContentsOption() {
        String option;
        BookShelfItem videoContentsItem = this.videoUseCase.getVideoContentsItem();
        return (videoContentsItem == null || (option = videoContentsItem.getOption()) == null) ? new JSONObject() : new JSONObject(option);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.edit.VideoEditListViewModel$setupDownloadAllItem$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VideoEditListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.edit.VideoEditListViewModel$setupDownloadAllItem$1", f = "VideoEditListViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2, 3}, l = {Base64.mimeLineLength, 82, 88, 94}, m = "invokeSuspend", n = {"$this$launch", "now", "$this$launch", "courseItems", "$this$launch", "courseItems", "courseViewItems", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
    static final class C08711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $contentCode;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08711(String str, Continuation<? super C08711> continuation) {
            super(2, continuation);
            this.$contentCode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08711 c08711 = VideoEditListViewModel.this.new C08711(this.$contentCode, continuation);
            c08711.L$0 = obj;
            return c08711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[Catch: Exception -> 0x0060, all -> 0x01ba, LOOP:1: B:34:0x00b1->B:36:0x00b7, LOOP_END, TryCatch #0 {Exception -> 0x0060, blocks: (B:24:0x005c, B:33:0x0098, B:34:0x00b1, B:36:0x00b7, B:37:0x00c5, B:38:0x00d4, B:40:0x00da, B:42:0x00e7, B:43:0x00eb, B:44:0x0105, B:46:0x010b, B:47:0x011d), top: B:77:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00da A[Catch: Exception -> 0x0060, all -> 0x01ba, TryCatch #0 {Exception -> 0x0060, blocks: (B:24:0x005c, B:33:0x0098, B:34:0x00b1, B:36:0x00b7, B:37:0x00c5, B:38:0x00d4, B:40:0x00da, B:42:0x00e7, B:43:0x00eb, B:44:0x0105, B:46:0x010b, B:47:0x011d), top: B:77:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:46:0x010b A[Catch: Exception -> 0x0060, all -> 0x01ba, LOOP:3: B:44:0x0105->B:46:0x010b, LOOP_END, TryCatch #0 {Exception -> 0x0060, blocks: (B:24:0x005c, B:33:0x0098, B:34:0x00b1, B:36:0x00b7, B:37:0x00c5, B:38:0x00d4, B:40:0x00da, B:42:0x00e7, B:43:0x00eb, B:44:0x0105, B:46:0x010b, B:47:0x011d), top: B:77:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0134  */
        /* JADX WARN: Code duplicated, block: B:53:0x0157  */
        /* JADX WARN: Code duplicated, block: B:54:0x0158  */
        /* JADX WARN: Code duplicated, block: B:57:0x0171 A[Catch: Exception -> 0x0048, all -> 0x01ba, TryCatch #3 {Exception -> 0x0048, blocks: (B:16:0x0036, B:55:0x015a, B:57:0x0171, B:58:0x017f, B:60:0x0185, B:62:0x0192, B:63:0x0196, B:19:0x0043, B:51:0x0138), top: B:83:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:60:0x0185 A[Catch: Exception -> 0x0048, all -> 0x01ba, TryCatch #3 {Exception -> 0x0048, blocks: (B:16:0x0036, B:55:0x015a, B:57:0x0171, B:58:0x017f, B:60:0x0185, B:62:0x0192, B:63:0x0196, B:19:0x0043, B:51:0x0138), top: B:83:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:87:0x0192 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x017f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01a9, code lost:
        
            if (r14.requestMissingChapters(r3, r5, r13) == r0) goto L65;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v15, types: [kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 501
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.edit.VideoEditListViewModel.C08711.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void setupDownloadAllItem(String contentCode) {
        this._isLoading.postValue(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C08711(contentCode, null), 2, null);
    }

    public final void setupDeleteVideoItems(String contentCode) {
        if (contentCode != null) {
            this._isLoading.postValue(true);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new VideoEditListViewModel$setupDeleteVideoItems$1$1(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.edit.VideoEditListViewModel$requestMissingChapters$2, reason: invalid class name */
    /* JADX INFO: compiled from: VideoEditListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.edit.VideoEditListViewModel$requestMissingChapters$2", f = "VideoEditListViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 2}, l = {realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_CLIENT_FILE_IDENT, realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_ORIGIN_FILE_IDENT, realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_SERVER_FILE_DELETED}, m = "invokeSuspend", n = {"$this$withContext", "courseIds", "count", "destination$iv$iv", "courseId", "$this$withContext", "chaptersByCourseId", "$this$withContext"}, s = {"L$0", "L$1", "L$2", "L$4", "I$0", "L$0", "L$1", "L$0"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<VideoCourseItem> $courseItems;
        final /* synthetic */ List<VideoCourseItem> $missingItems;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ VideoEditListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<VideoCourseItem> list, VideoEditListViewModel videoEditListViewModel, List<VideoCourseItem> list2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$missingItems = list;
            this.this$0 = videoEditListViewModel;
            this.$courseItems = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$missingItems, this.this$0, this.$courseItems, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00ec A[Catch: all -> 0x0064, Exception -> 0x0197, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:8:0x0019, B:53:0x0199, B:15:0x0031, B:47:0x0176, B:20:0x0058, B:39:0x0120, B:33:0x00e6, B:35:0x00ec, B:43:0x0159, B:31:0x00c1), top: B:59:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0118  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0118 -> B:64:0x0120). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 460
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.edit.VideoEditListViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object requestMissingChapters(List<VideoCourseItem> list, List<VideoCourseItem> list2, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(list2, this, list, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object updateDownloadItems(List<VideoCourseItem> list, Map<Integer, ? extends List<VideoChapter>> map, Continuation<? super Unit> continuation) {
        C08731 c08731;
        VideoEditListViewModel videoEditListViewModel;
        if (continuation instanceof C08731) {
            c08731 = (C08731) continuation;
            if ((c08731.label & Integer.MIN_VALUE) != 0) {
                c08731.label -= Integer.MIN_VALUE;
            } else {
                c08731 = new C08731(continuation);
            }
        } else {
            c08731 = new C08731(continuation);
        }
        Object objFindDownloadedVideoViewItems = c08731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08731.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFindDownloadedVideoViewItems);
            VideoDownloadUseCase videoDownloadUseCase = this.videoDownloadUseCase;
            c08731.L$0 = this;
            c08731.L$1 = list;
            c08731.L$2 = map;
            c08731.label = 1;
            objFindDownloadedVideoViewItems = videoDownloadUseCase.findDownloadedVideoViewItems(c08731);
            if (objFindDownloadedVideoViewItems == coroutine_suspended) {
                return coroutine_suspended;
            }
            videoEditListViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c08731.L$2;
            list = (List) c08731.L$1;
            videoEditListViewModel = (VideoEditListViewModel) c08731.L$0;
            ResultKt.throwOnFailure(objFindDownloadedVideoViewItems);
        }
        Iterable iterable = (Iterable) objFindDownloadedVideoViewItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Boxing.boxInt(((VideoSubItem) it.next()).getVideoId()));
        }
        Set set = CollectionsKt.toSet(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                VideoChapter videoChapterExcludedVideoSubItems = VideoCourseItemKt.excludedVideoSubItems((VideoChapter) it3.next(), set);
                if (videoChapterExcludedVideoSubItems != null) {
                    arrayList2.add(videoChapterExcludedVideoSubItems);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        videoEditListViewModel._downloadItems.postValue(videoEditListViewModel.videoUseCase.buildCourseViewItems(list, linkedHashMap));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.edit.VideoEditListViewModel$startDownloadAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VideoEditListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.edit.VideoEditListViewModel$startDownloadAll$1", f = "VideoEditListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C08721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<VideoSubItem> $items;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ VideoEditListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08721(List<VideoSubItem> list, VideoEditListViewModel videoEditListViewModel, Continuation<? super C08721> continuation) {
            super(2, continuation);
            this.$items = list;
            this.this$0 = videoEditListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08721 c08721 = new C08721(this.$items, this.this$0, continuation);
            c08721.L$0 = obj;
            return c08721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            try {
                try {
                    List<VideoSubItem> list = this.$items;
                    VideoEditListViewModel videoEditListViewModel = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (VideoSubItem videoSubItem : list) {
                        String videoHash = videoSubItem.getVideoHash();
                        MediaItem mediaItem = videoHash != null ? VideoCourseItemKt.toMediaItem(videoSubItem, videoEditListViewModel.videoUseCase.streamUrl(videoHash, videoHash)) : null;
                        if (mediaItem != null) {
                            arrayList.add(mediaItem);
                        }
                    }
                    this.this$0.videoDownloadUseCase.startDownloadAllAsync(arrayList);
                    this.this$0._completed.postValue(Unit.INSTANCE);
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String simpleName = coroutineScope.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    logger.error(simpleName, e);
                    this.this$0._errorMessage.postValue(Boxing.boxInt(R.string.video_edit_failed_to_download_video));
                }
                return Unit.INSTANCE;
            } finally {
                this.this$0._isLoading.postValue(Boxing.boxBoolean(false));
            }
        }
    }

    public final void startDownloadAll(List<VideoSubItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this._isLoading.postValue(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08721(items, this, null), 3, null);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.edit.VideoEditListViewModel$deleteDownloadVideos$1, reason: invalid class name */
    /* JADX INFO: compiled from: VideoEditListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.edit.VideoEditListViewModel$deleteDownloadVideos$1", f = "VideoEditListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<VideoSubItem> $items;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ VideoEditListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<VideoSubItem> list, VideoEditListViewModel videoEditListViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$items = list;
            this.this$0 = videoEditListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$items, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Uri uri;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            try {
                try {
                    Ref.IntRef intRef = new Ref.IntRef();
                    this.this$0._videoProgressDialog.postValue(ContentProgressInfo.Companion.createDeleteList$default(ContentProgressInfo.INSTANCE, intRef.element, this.$items.size(), 0, 4, null));
                    List<VideoSubItem> list = this.$items;
                    VideoEditListViewModel videoEditListViewModel = this.this$0;
                    ArrayList<MediaItem> arrayList = new ArrayList();
                    for (VideoSubItem videoSubItem : list) {
                        String videoHash = videoSubItem.getVideoHash();
                        MediaItem mediaItem = videoHash != null ? VideoCourseItemKt.toMediaItem(videoSubItem, videoEditListViewModel.videoUseCase.streamUrl(videoHash, videoHash)) : null;
                        if (mediaItem != null) {
                            arrayList.add(mediaItem);
                        }
                    }
                    VideoEditListViewModel videoEditListViewModel2 = this.this$0;
                    List<VideoSubItem> list2 = this.$items;
                    for (MediaItem mediaItem2 : arrayList) {
                        MediaItem.PlaybackProperties playbackProperties = mediaItem2.playbackProperties;
                        if (playbackProperties != null && (uri = playbackProperties.uri) != null && videoEditListViewModel2.videoDownloadUseCase.isDownloaded(uri)) {
                            videoEditListViewModel2.videoDownloadUseCase.removeDownloadData(mediaItem2);
                            intRef.element++;
                            videoEditListViewModel2._videoProgressDialog.postValue(ContentProgressInfo.Companion.createDeleteList$default(ContentProgressInfo.INSTANCE, intRef.element, list2.size(), 0, 4, null));
                        }
                    }
                    this.this$0._completed.postValue(Unit.INSTANCE);
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String simpleName = coroutineScope.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    logger.error(simpleName, e);
                    this.this$0._errorMessage.postValue(Boxing.boxInt(R.string.video_edit_failed_to_delete_video));
                }
                return Unit.INSTANCE;
            } finally {
                this.this$0._closeVideoProgressDialog.postValue(Unit.INSTANCE);
            }
        }
    }

    public final void deleteDownloadVideos(List<VideoSubItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(items, this, null), 2, null);
    }
}
