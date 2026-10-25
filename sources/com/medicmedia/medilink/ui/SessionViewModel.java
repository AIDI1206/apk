package com.medicmedia.medilink.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.medicmedia.medilink.analytics.CrashAnalyticsClient;
import com.medicmedia.medilink.core.network.api.BaristaTokenGrantType;
import com.medicmedia.medilink.core.network.api.response.ApiErrorCode;
import com.medicmedia.medilink.core.network.api.response.ApiErrorCodeException;
import com.medicmedia.medilink.datastore.model.BaristaToken;
import com.medicmedia.medilink.domain.model.ApiCommon;
import com.medicmedia.medilink.domain.model.ApiLog;
import com.medicmedia.medilink.domain.model.BaristaUserInfo;
import com.medicmedia.medilink.domain.model.DeviceItem;
import com.medicmedia.medilink.domain.model.LaunchState;
import com.medicmedia.medilink.domain.model.LogDetail;
import com.medicmedia.medilink.domain.model.LogLevel;
import com.medicmedia.medilink.domain.model.LogOperation;
import com.medicmedia.medilink.domain.model.Logger;
import com.medicmedia.medilink.domain.redux.Store;
import com.medicmedia.medilink.domain.redux.action.ContentsAction;
import com.medicmedia.medilink.domain.redux.state.ContentsState;
import com.medicmedia.medilink.domain.redux.store.ContentsStore;
import com.medicmedia.medilink.domain.usecase.LaunchUseCase;
import com.medicmedia.medilink.domain.usecase.SettingsUseCase;
import com.medicmedia.medilink.domain.usecase.VideoUseCase;
import io.reactivex.Single;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SessionViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020#H\u0002J\u0006\u0010%\u001a\u00020#J\u000e\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0015J\u0006\u0010)\u001a\u00020#J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0+J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u0013H\u0002J\u000e\u00101\u001a\u00020#2\u0006\u0010-\u001a\u00020.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0010\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00160\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010\u0017\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00160\u00120\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001a¨\u00062"}, d2 = {"Lcom/medicmedia/medilink/ui/SessionViewModel;", "Landroidx/lifecycle/ViewModel;", "launchUseCase", "Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;", "videoUseCase", "Lcom/medicmedia/medilink/domain/usecase/VideoUseCase;", "settingsUseCase", "Lcom/medicmedia/medilink/domain/usecase/SettingsUseCase;", "crashAnalyticsClient", "Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;", "contentsStore", "Lcom/medicmedia/medilink/domain/redux/Store;", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;Lcom/medicmedia/medilink/domain/usecase/VideoUseCase;Lcom/medicmedia/medilink/domain/usecase/SettingsUseCase;Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;Lcom/medicmedia/medilink/domain/redux/Store;)V", "Lcom/medicmedia/medilink/domain/redux/store/ContentsStore;", "_completedDevices", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Ljava/util/ArrayList;", "Lcom/medicmedia/medilink/domain/model/DeviceItem;", "Lkotlin/collections/ArrayList;", "completedDevices", "Landroidx/lifecycle/LiveData;", "getCompletedDevices", "()Landroidx/lifecycle/LiveData;", "_deleteDevice", "deleteDevice", "getDeleteDevice", "_errorMessage", "", "errorMessage", "getErrorMessage", "getBaristaToken", "", "getBaristaUserInfo", "startUp", "getDevices", "message", "item", "requestStartUpApi", "deleteLimitOverHistories", "Lio/reactivex/Single;", "startUpOnError", "throwable", "", "userActionLog", "argument", "recordException", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SessionViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Pair<String, ArrayList<DeviceItem>>> _completedDevices;
    private final MutableLiveData<DeviceItem> _deleteDevice;
    private final MutableLiveData<Integer> _errorMessage;
    private final LiveData<Pair<String, ArrayList<DeviceItem>>> completedDevices;
    private final ContentsStore contentsStore;
    private final CrashAnalyticsClient crashAnalyticsClient;
    private final LiveData<DeviceItem> deleteDevice;
    private final LiveData<Integer> errorMessage;
    private final LaunchUseCase launchUseCase;
    private final SettingsUseCase settingsUseCase;
    private final VideoUseCase videoUseCase;

    @Inject
    public SessionViewModel(LaunchUseCase launchUseCase, VideoUseCase videoUseCase, SettingsUseCase settingsUseCase, CrashAnalyticsClient crashAnalyticsClient, Store<ContentsState> contentsStore) {
        Intrinsics.checkNotNullParameter(launchUseCase, "launchUseCase");
        Intrinsics.checkNotNullParameter(videoUseCase, "videoUseCase");
        Intrinsics.checkNotNullParameter(settingsUseCase, "settingsUseCase");
        Intrinsics.checkNotNullParameter(crashAnalyticsClient, "crashAnalyticsClient");
        Intrinsics.checkNotNullParameter(contentsStore, "contentsStore");
        this.launchUseCase = launchUseCase;
        this.videoUseCase = videoUseCase;
        this.settingsUseCase = settingsUseCase;
        this.crashAnalyticsClient = crashAnalyticsClient;
        this.contentsStore = (ContentsStore) contentsStore;
        MutableLiveData<Pair<String, ArrayList<DeviceItem>>> mutableLiveData = new MutableLiveData<>();
        this._completedDevices = mutableLiveData;
        this.completedDevices = mutableLiveData;
        MutableLiveData<DeviceItem> mutableLiveData2 = new MutableLiveData<>();
        this._deleteDevice = mutableLiveData2;
        this.deleteDevice = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this._errorMessage = mutableLiveData3;
        this.errorMessage = mutableLiveData3;
    }

    public final LiveData<Pair<String, ArrayList<DeviceItem>>> getCompletedDevices() {
        return this.completedDevices;
    }

    public final LiveData<DeviceItem> getDeleteDevice() {
        return this.deleteDevice;
    }

    public final LiveData<Integer> getErrorMessage() {
        return this.errorMessage;
    }

    public final void getBaristaToken() {
        if (!LaunchState.INSTANCE.isLoadingBaristaToken() && this.launchUseCase.isEnableNetwork()) {
            if (this.launchUseCase.isEnableAccessToken()) {
                startUp();
            } else if (this.launchUseCase.isEnableRefreshToken()) {
                LaunchState.INSTANCE.setLoadingBaristaToken(true);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08271(null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.SessionViewModel$getBaristaToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SessionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.SessionViewModel$getBaristaToken$1", f = "SessionViewModel.kt", i = {0}, l = {69}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class C08271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C08271(Continuation<? super C08271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08271 c08271 = SessionViewModel.this.new C08271(continuation);
            c08271.L$0 = obj;
            return c08271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Object obj2 = this.label;
            try {
                if (obj2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = LaunchUseCase.DefaultImpls.baristaToken$default(SessionViewModel.this.launchUseCase, BaristaTokenGrantType.REFRESH_TOKEN, null, this, 2, null);
                    obj2 = coroutineScope;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (obj2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = coroutineScope2;
                }
                SessionViewModel.this.launchUseCase.saveBaristaToken((BaristaToken) obj);
                if (SessionViewModel.this.launchUseCase.isNeedTpUpdateUserInfo()) {
                    SessionViewModel.this.getBaristaUserInfo();
                }
                SessionViewModel.this.startUp();
            } catch (Exception e) {
                Logger logger = Logger.INSTANCE;
                String simpleName = obj2.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                logger.error(simpleName, e);
                SessionViewModel.this.settingsUseCase.logoutBarista();
            } finally {
                LaunchState.INSTANCE.setLoadingBaristaToken(false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBaristaUserInfo() {
        if (this.launchUseCase.isEnableAccessToken() && this.launchUseCase.isEnableNetwork() && !LaunchState.INSTANCE.isLoadingBaristaUserInfo()) {
            LaunchState.INSTANCE.setLoadingBaristaUserInfo(true);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08281(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.SessionViewModel$getBaristaUserInfo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SessionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.SessionViewModel$getBaristaUserInfo$1", f = "SessionViewModel.kt", i = {0}, l = {92}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class C08281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C08281(Continuation<? super C08281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08281 c08281 = SessionViewModel.this.new C08281(continuation);
            c08281.L$0 = obj;
            return c08281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Exception e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    try {
                        this.L$0 = coroutineScope2;
                        this.label = 1;
                        Object objBaristaUserInfo = SessionViewModel.this.launchUseCase.baristaUserInfo(this);
                        if (objBaristaUserInfo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope2;
                        obj = objBaristaUserInfo;
                    } catch (Exception e2) {
                        coroutineScope = coroutineScope2;
                        e = e2;
                        Logger logger = Logger.INSTANCE;
                        String simpleName = coroutineScope.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                        logger.error(simpleName, e);
                        SessionViewModel.this.settingsUseCase.logoutBarista();
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        Logger logger2 = Logger.INSTANCE;
                        String simpleName2 = coroutineScope.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                        logger2.error(simpleName2, e);
                        SessionViewModel.this.settingsUseCase.logoutBarista();
                    }
                }
                BaristaUserInfo baristaUserInfo = (BaristaUserInfo) obj;
                String sub = baristaUserInfo.getSub();
                if (sub != null) {
                    SessionViewModel.this.launchUseCase.setUserId(sub);
                }
                SessionViewModel.this.launchUseCase.setUserInfo(baristaUserInfo);
                LaunchState.INSTANCE.setLoadingBaristaUserInfo(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LaunchState.INSTANCE.setLoadingBaristaUserInfo(false);
                throw th;
            }
        }
    }

    public final void startUp() {
        if (this.launchUseCase.isLoggingIn() && this.launchUseCase.isEnableNetwork() && !LaunchState.INSTANCE.isLoadingStartUp()) {
            LaunchState.INSTANCE.setLoadingStartUp(true);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08301(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.SessionViewModel$startUp$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SessionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.SessionViewModel$startUp$1", f = "SessionViewModel.kt", i = {}, l = {realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_PBS}, m = "invokeSuspend", n = {}, s = {})
    static final class C08301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C08301(Continuation<? super C08301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionViewModel.this.new C08301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = SessionViewModel.this.launchUseCase.startUp(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiCommon apiCommon = (ApiCommon) obj;
                boolean zIsUpdateApp = SessionViewModel.this.launchUseCase.isUpdateApp(apiCommon.getAppVersion());
                LaunchUseCase launchUseCase = SessionViewModel.this.launchUseCase;
                if (apiCommon.getUpdateFlag() != 0) {
                    z = false;
                }
                boolean zIsSkipLogRequest = launchUseCase.isSkipLogRequest(z);
                if (zIsUpdateApp && !zIsSkipLogRequest) {
                    SessionViewModel.this.userActionLog("https://app.medilink-study.com/api/startup");
                }
                SessionViewModel.this.launchUseCase.setStartUpExpireTime();
            } catch (Exception e) {
                SessionViewModel.this.startUpOnError(e);
            } finally {
                LaunchState.INSTANCE.setLoadingStartUp(false);
                LaunchState.INSTANCE.markStartUpAttempted();
            }
            return Unit.INSTANCE;
        }
    }

    public final void getDevices(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (LaunchState.INSTANCE.isLoadingDevices()) {
            return;
        }
        LaunchState.INSTANCE.setLoadingDevices(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08291(message, null), 3, null);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.SessionViewModel$getDevices$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SessionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.SessionViewModel$getDevices$1", f = "SessionViewModel.kt", i = {0}, l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class C08291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $message;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08291(String str, Continuation<? super C08291> continuation) {
            super(2, continuation);
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08291 c08291 = SessionViewModel.this.new C08291(this.$message, continuation);
            c08291.L$0 = obj;
            return c08291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Exception e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    try {
                        this.L$0 = coroutineScope2;
                        this.label = 1;
                        Object objDevices = SessionViewModel.this.launchUseCase.devices(this);
                        if (objDevices == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope2;
                        obj = objDevices;
                    } catch (Exception e2) {
                        coroutineScope = coroutineScope2;
                        e = e2;
                        Logger logger = Logger.INSTANCE;
                        String simpleName = coroutineScope.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                        logger.error(simpleName, e);
                        CrashAnalyticsClient.DefaultImpls.recordException$default(SessionViewModel.this.crashAnalyticsClient, e, null, 2, null);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        Logger logger2 = Logger.INSTANCE;
                        String simpleName2 = coroutineScope.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                        logger2.error(simpleName2, e);
                        CrashAnalyticsClient.DefaultImpls.recordException$default(SessionViewModel.this.crashAnalyticsClient, e, null, 2, null);
                    }
                }
                SessionViewModel.this._completedDevices.postValue(new Pair(this.$message, new ArrayList((List) obj)));
                SessionViewModel.this.userActionLog("https://app.medilink-study.com/api/devices");
                LaunchState.INSTANCE.setLoadingDevices(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LaunchState.INSTANCE.setLoadingDevices(false);
                throw th;
            }
        }
    }

    public final void deleteDevice(DeviceItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (LaunchState.INSTANCE.isLoadingDeleteDevices()) {
            return;
        }
        LaunchState.INSTANCE.setLoadingDeleteDevices(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(item, null), 3, null);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.SessionViewModel$deleteDevice$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.SessionViewModel$deleteDevice$1", f = "SessionViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DeviceItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DeviceItem deviceItem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$item = deviceItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionViewModel.this.new AnonymousClass1(this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (SessionViewModel.this.launchUseCase.deleteDevice(this.$item.getKey(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SessionViewModel.this._deleteDevice.postValue(this.$item);
                SessionViewModel.this.userActionLog("https://app.medilink-study.com/api/deldevice");
            } catch (Exception e) {
                SessionViewModel.this._errorMessage.postValue(Boxing.boxInt(R.string.failed_to_delete_device));
                CrashAnalyticsClient.DefaultImpls.recordException$default(SessionViewModel.this.crashAnalyticsClient, e, null, 2, null);
            } finally {
                LaunchState.INSTANCE.setLoadingDeleteDevices(false);
            }
            return Unit.INSTANCE;
        }
    }

    public final void requestStartUpApi() {
        this.contentsStore.dispatch(ContentsAction.RequestStartUpApi.INSTANCE);
    }

    public final Single<Unit> deleteLimitOverHistories() {
        return this.videoUseCase.deleteLimitOverHistories();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void startUpOnError(Throwable throwable) {
        if (throwable instanceof ApiErrorCodeException) {
            ApiErrorCodeException apiErrorCodeException = (ApiErrorCodeException) throwable;
            String code = apiErrorCodeException.getCode();
            switch (code.hashCode()) {
                case -668301556:
                    if (!code.equals(ApiErrorCode.ME000_003)) {
                        return;
                    }
                    break;
                case -667378001:
                    if (code.equals(ApiErrorCode.ME001_016)) {
                        this.launchUseCase.sendLoginResult(false, apiErrorCodeException.getMessage());
                        return;
                    }
                    return;
                case -666454514:
                    if (!code.equals(ApiErrorCode.ME002_003)) {
                        return;
                    }
                    break;
                case -666454510:
                    if (code.equals(ApiErrorCode.ME002_007)) {
                        getDevices(apiErrorCodeException.getMessage());
                        return;
                    }
                    return;
                default:
                    return;
            }
            this.launchUseCase.clearAccountTokenInfo();
            return;
        }
        CrashAnalyticsClient.DefaultImpls.recordException$default(this.crashAnalyticsClient, throwable, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void userActionLog(String argument) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08311(new ApiLog(LogLevel.INFO, LogOperation.API, LogDetail.APP_API, CollectionsKt.listOf(argument)), null), 3, null);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.SessionViewModel$userActionLog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SessionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.SessionViewModel$userActionLog$1", f = "SessionViewModel.kt", i = {0}, l = {193}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class C08311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiLog $log;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08311(ApiLog apiLog, Continuation<? super C08311> continuation) {
            super(2, continuation);
            this.$log = apiLog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08311 c08311 = SessionViewModel.this.new C08311(this.$log, continuation);
            c08311.L$0 = obj;
            return c08311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Exception e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (SessionViewModel.this.launchUseCase.userActionLog(this.$log, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    coroutineScope = coroutineScope2;
                    e = e2;
                    Logger logger = Logger.INSTANCE;
                    String simpleName = coroutineScope.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    logger.error(simpleName, e);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e3) {
                    e = e3;
                    Logger logger2 = Logger.INSTANCE;
                    String simpleName2 = coroutineScope.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                    logger2.error(simpleName2, e);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void recordException(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CrashAnalyticsClient.DefaultImpls.recordException$default(this.crashAnalyticsClient, throwable, null, 2, null);
    }
}
