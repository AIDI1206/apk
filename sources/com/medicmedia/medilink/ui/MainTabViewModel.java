package com.medicmedia.medilink.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.core.network.connect.NetworkHelper;
import com.medicmedia.medilink.domain.model.TutorialStep;
import com.medicmedia.medilink.domain.redux.CommonUiAction;
import com.medicmedia.medilink.domain.redux.CommonUiEvent;
import com.medicmedia.medilink.domain.redux.CommonUiStore;
import com.medicmedia.medilink.domain.usecase.LaunchUseCase;
import com.medicmedia.medilink.domain.usecase.MainTabUseCase;
import com.medicmedia.medilink.ui.common.NavigationEventDelegate;
import com.medicmedia.medilink.ui.history.HistoryListType;
import com.medicmedia.medilink.ui.navigation.Destination;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: MainTabViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020%J\u0006\u0010*\u001a\u00020%J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020(J\u000e\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020%J\u0006\u00101\u001a\u00020%J\u0006\u00102\u001a\u00020%J\u0006\u00103\u001a\u00020%J\u000e\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020/J\b\u00106\u001a\u00020%H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b!\u0010#¨\u00069"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabViewModel;", "Landroidx/lifecycle/ViewModel;", "mainTabUseCase", "Lcom/medicmedia/medilink/domain/usecase/MainTabUseCase;", "launchUseCase", "Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;", "networkHelper", "Lcom/medicmedia/medilink/core/network/connect/NetworkHelper;", "commonUiStore", "Lcom/medicmedia/medilink/domain/redux/CommonUiStore;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/MainTabUseCase;Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;Lcom/medicmedia/medilink/core/network/connect/NetworkHelper;Lcom/medicmedia/medilink/domain/redux/CommonUiStore;)V", "getCommonUiStore", "()Lcom/medicmedia/medilink/domain/redux/CommonUiStore;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/MainTabUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "navigationDelegate", "Lcom/medicmedia/medilink/ui/common/NavigationEventDelegate;", "navigationEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "getNavigationEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "_childCommands", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/medicmedia/medilink/ui/MainTabChildCommand;", "childCommands", "getChildCommands", "isNetworkConnected", "", "()Z", "onResume", "", "scrollToTop", "mainTabType", "Lcom/medicmedia/medilink/ui/MainTabType;", "resetTrigger", "completeTutorial", "onClickTab", "tabType", "updateContinuousCheckMode", "historyTab", "", "startContinuousCheckMode", "onNextTutorialStep", "startSettings", "startDashboard", "startContentsEditList", "mode", "observeCommonUiEvent", "navigate", FirebaseAnalytics.Param.DESTINATION, "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MainTabViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableSharedFlow<MainTabChildCommand> _childCommands;
    private final MutableStateFlow<MainTabUiState> _uiState;
    private final SharedFlow<MainTabChildCommand> childCommands;
    private final CommonUiStore commonUiStore;
    private final LaunchUseCase launchUseCase;
    private final MainTabUseCase mainTabUseCase;
    private final NavigationEventDelegate navigationDelegate;
    private final SharedFlow<Destination> navigationEvents;
    private final NetworkHelper networkHelper;
    private final StateFlow<MainTabUiState> uiState;

    /* JADX INFO: compiled from: MainTabViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TutorialStep.values().length];
            try {
                iArr[TutorialStep.STEP1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TutorialStep.STEP2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TutorialStep.STEP3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TutorialStep.STEP6.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final CommonUiStore getCommonUiStore() {
        return this.commonUiStore;
    }

    @Inject
    public MainTabViewModel(MainTabUseCase mainTabUseCase, LaunchUseCase launchUseCase, NetworkHelper networkHelper, CommonUiStore commonUiStore) {
        Intrinsics.checkNotNullParameter(mainTabUseCase, "mainTabUseCase");
        Intrinsics.checkNotNullParameter(launchUseCase, "launchUseCase");
        Intrinsics.checkNotNullParameter(networkHelper, "networkHelper");
        Intrinsics.checkNotNullParameter(commonUiStore, "commonUiStore");
        this.mainTabUseCase = mainTabUseCase;
        this.launchUseCase = launchUseCase;
        this.networkHelper = networkHelper;
        this.commonUiStore = commonUiStore;
        MutableStateFlow<MainTabUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(MainTabUiState.INSTANCE.getDefault());
        this._uiState = MutableStateFlow;
        this.uiState = MutableStateFlow;
        NavigationEventDelegate navigationEventDelegate = new NavigationEventDelegate();
        this.navigationDelegate = navigationEventDelegate;
        this.navigationEvents = navigationEventDelegate.getEvents();
        MutableSharedFlow<MainTabChildCommand> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 32, null, 4, null);
        this._childCommands = mutableSharedFlowMutableSharedFlow$default;
        this.childCommands = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        observeCommonUiEvent();
    }

    public final StateFlow<MainTabUiState> getUiState() {
        return this.uiState;
    }

    public final SharedFlow<Destination> getNavigationEvents() {
        return this.navigationEvents;
    }

    public final SharedFlow<MainTabChildCommand> getChildCommands() {
        return this.childCommands;
    }

    public final boolean isNetworkConnected() {
        return this.networkHelper.isNetworkConnected();
    }

    public final void onResume() {
        boolean zEnabledDashboard = this.mainTabUseCase.enabledDashboard();
        boolean zIsEnableContinuousCheckMode = this.mainTabUseCase.isEnableContinuousCheckMode();
        Integer selectedHistoryTab = this.commonUiStore.getState().getValue().getSelectedHistoryTab();
        MainTabType selectedTabType = this._uiState.getValue().getSelectedTabType();
        boolean z = this.launchUseCase.isEnableAccessToken() && this.launchUseCase.shouldShowTutorial();
        MutableStateFlow<MainTabUiState> mutableStateFlow = this._uiState;
        while (true) {
            MainTabUiState value = mutableStateFlow.getValue();
            MutableStateFlow<MainTabUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, MainTabUiState.copy$default(value, false, null, null, zEnabledDashboard, selectedTabType.isHistoryList() && HistoryListType.INSTANCE.isWritingList(selectedHistoryTab) && zIsEnableContinuousCheckMode, z ? TutorialStep.STEP1 : null, null, 71, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void scrollToTop(MainTabType mainTabType) {
        Intrinsics.checkNotNullParameter(mainTabType, "mainTabType");
        this._childCommands.tryEmit(new MainTabChildCommand.ScrollToTop(mainTabType));
    }

    public final void resetTrigger() {
        MainTabUiState value;
        MutableStateFlow<MainTabUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MainTabUiState.copy$default(value, false, null, null, false, false, null, null, 61, null)));
    }

    public final void completeTutorial() {
        MainTabUiState value;
        MutableStateFlow<MainTabUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MainTabUiState.copy$default(value, false, null, null, false, false, null, null, 95, null)));
        this.launchUseCase.completeTutorial();
    }

    public final void onClickTab(MainTabType tabType) {
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        boolean z = tabType.isHistoryList() && HistoryListType.INSTANCE.isWritingList(this.commonUiStore.getState().getValue().getSelectedHistoryTab()) && this.mainTabUseCase.isEnableContinuousCheckMode();
        MutableStateFlow<MainTabUiState> mutableStateFlow = this._uiState;
        while (true) {
            MainTabUiState value = mutableStateFlow.getValue();
            MainTabType mainTabType = tabType;
            if (mutableStateFlow.compareAndSet(value, MainTabUiState.copy$default(value, false, null, mainTabType, false, z, null, null, realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_REUSE_OF_SESSION_IDENT, null))) {
                return;
            } else {
                tabType = mainTabType;
            }
        }
    }

    public final void updateContinuousCheckMode(int historyTab) {
        MainTabUiState value;
        boolean z = this._uiState.getValue().getSelectedTabType().isHistoryList() && HistoryListType.INSTANCE.isWritingList(Integer.valueOf(historyTab)) && this.mainTabUseCase.isEnableContinuousCheckMode();
        MutableStateFlow<MainTabUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MainTabUiState.copy$default(value, false, null, null, false, z, null, null, realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_HEADER_SYNTAX, null)));
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.MainTabViewModel$startContinuousCheckMode$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MainTabViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.MainTabViewModel$startContinuousCheckMode$1", f = "MainTabViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    static final class C08091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C08091(Continuation<? super C08091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabViewModel.this.new C08091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow mutableStateFlow = MainTabViewModel.this._uiState;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, MainTabUiState.copy$default((MainTabUiState) value2, true, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
                    this.label = 1;
                    obj = MainTabViewModel.this.mainTabUseCase.isNotEmptyWritingHistories(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    MainTabViewModel.this.navigate(Destination.ContinuousCheckMode.INSTANCE);
                } else {
                    MutableStateFlow mutableStateFlow2 = MainTabViewModel.this._uiState;
                    do {
                        value3 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value3, MainTabUiState.copy$default((MainTabUiState) value3, false, Boxing.boxInt(R.string.continuous_check_data_is_empty), null, false, false, null, null, 125, null)));
                }
                MutableStateFlow mutableStateFlow3 = MainTabViewModel.this._uiState;
                do {
                    value4 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value4, MainTabUiState.copy$default((MainTabUiState) value4, false, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
                MainTabViewModel.this.mainTabUseCase.sendStartContinuousCheckEvent();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                MutableStateFlow mutableStateFlow4 = MainTabViewModel.this._uiState;
                do {
                    value = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value, MainTabUiState.copy$default((MainTabUiState) value, false, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
                MainTabViewModel.this.mainTabUseCase.sendStartContinuousCheckEvent();
                throw th;
            }
        }
    }

    public final void startContinuousCheckMode() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C08091(null), 2, null);
    }

    public final void onNextTutorialStep() {
        MainTabUiState value;
        MainTabUiState value2;
        TutorialStep tutorialStep = this._uiState.getValue().getTutorialStep();
        int i = tutorialStep == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tutorialStep.ordinal()];
        if (i == 1) {
            MutableStateFlow<MainTabUiState> mutableStateFlow = this._uiState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, MainTabUiState.copy$default(value, false, null, null, false, false, TutorialStep.STEP2, null, 95, null)));
        } else if (i == 2) {
            MutableStateFlow<MainTabUiState> mutableStateFlow2 = this._uiState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, MainTabUiState.copy$default(value2, false, null, null, false, false, TutorialStep.STEP3, null, 95, null)));
        } else if (i == 3) {
            this.commonUiStore.dispatch(new CommonUiAction.NextTutorialStep(TutorialStep.STEP4));
        } else {
            if (i != 4) {
                return;
            }
            this.commonUiStore.dispatch(new CommonUiAction.NextTutorialStep(TutorialStep.STEP7));
        }
    }

    public final void startSettings() {
        navigate(Destination.Settings.INSTANCE);
    }

    public final void startDashboard() {
        navigate(Destination.Dashboard.INSTANCE);
    }

    public final void startContentsEditList(int mode) {
        navigate(new Destination.ContentsEditList(mode));
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.MainTabViewModel$observeCommonUiEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainTabViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.MainTabViewModel$observeCommonUiEvent$1", f = "MainTabViewModel.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<CommonUiEvent> events = MainTabViewModel.this.getCommonUiStore().getEvents();
                final MainTabViewModel mainTabViewModel = MainTabViewModel.this;
                this.label = 1;
                if (events.collect(new FlowCollector() { // from class: com.medicmedia.medilink.ui.MainTabViewModel.observeCommonUiEvent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CommonUiEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(CommonUiEvent commonUiEvent, Continuation<? super Unit> continuation) {
                        Object value;
                        Object value2;
                        if (commonUiEvent instanceof CommonUiEvent.NextTutorialStep) {
                            CommonUiEvent.NextTutorialStep nextTutorialStep = (CommonUiEvent.NextTutorialStep) commonUiEvent;
                            if (nextTutorialStep.getStep().isMainTabTutorialStep()) {
                                MutableStateFlow mutableStateFlow = mainTabViewModel._uiState;
                                do {
                                    value2 = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.compareAndSet(value2, MainTabUiState.copy$default((MainTabUiState) value2, false, null, null, false, false, nextTutorialStep.getStep(), null, 95, null)));
                            }
                        }
                        if (commonUiEvent instanceof CommonUiEvent.SelectLibraryTab) {
                            MutableStateFlow mutableStateFlow2 = mainTabViewModel._uiState;
                            do {
                                value = mutableStateFlow2.getValue();
                            } while (!mutableStateFlow2.compareAndSet(value, MainTabUiState.copy$default((MainTabUiState) value, false, null, null, false, false, null, Unit.INSTANCE, 63, null)));
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    private final void observeCommonUiEvent() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigate(Destination destination) {
        this.navigationDelegate.navigate(destination);
    }
}
