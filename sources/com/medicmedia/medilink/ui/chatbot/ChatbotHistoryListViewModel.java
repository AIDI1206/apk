package com.medicmedia.medilink.ui.chatbot;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.medicmedia.medilink.analytics.AnalyticsClient;
import com.medicmedia.medilink.domain.model.Logger;
import com.medicmedia.medilink.domain.model.chatbot.ChatSessionItem;
import com.medicmedia.medilink.domain.usecase.ChatbotUseCase;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.OptionDropdownMenuType;
import io.realm.kotlin.internal.interop.realm_column_attr_e;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ChatbotHistoryListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001fH\u0002J\u0006\u0010!\u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u001fJ\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R<\u0010\u0013\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015`\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R?\u0010\u0018\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015`\u00170\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotHistoryListViewModel;", "Landroidx/lifecycle/ViewModel;", "chatbotUseCase", "Lcom/medicmedia/medilink/domain/usecase/ChatbotUseCase;", "analyticsClient", "Lcom/medicmedia/medilink/analytics/AnalyticsClient;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/ChatbotUseCase;Lcom/medicmedia/medilink/analytics/AnalyticsClient;)V", "logTag", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotHistoryListUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_sessions", "Ljava/util/LinkedHashMap;", "", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatSessionItem;", "Lkotlin/collections/LinkedHashMap;", "sessions", "getSessions", "menuType", "Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;", "getMenuType", "()Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;", "onResume", "", "fetchSessions", "resetTrigger", "onDelete", "chatSession", "onDeleteAll", "onClickDelete", "session", "onClickMenu", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "onClickNew", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ChatbotHistoryListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<LinkedHashMap<String, List<ChatSessionItem>>> _sessions;
    private final MutableStateFlow<ChatbotHistoryListUiState> _uiState;
    private final AnalyticsClient analyticsClient;
    private final ChatbotUseCase chatbotUseCase;
    private final String logTag;
    private final OptionDropdownMenuType menuType;
    private final StateFlow<LinkedHashMap<String, List<ChatSessionItem>>> sessions;
    private final StateFlow<ChatbotHistoryListUiState> uiState;

    @Inject
    public ChatbotHistoryListViewModel(ChatbotUseCase chatbotUseCase, AnalyticsClient analyticsClient) {
        Intrinsics.checkNotNullParameter(chatbotUseCase, "chatbotUseCase");
        Intrinsics.checkNotNullParameter(analyticsClient, "analyticsClient");
        this.chatbotUseCase = chatbotUseCase;
        this.analyticsClient = analyticsClient;
        this.logTag = "ChatbotHistoryListViewModel";
        MutableStateFlow<ChatbotHistoryListUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(ChatbotHistoryListUiState.INSTANCE.getDefault());
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<LinkedHashMap<String, List<ChatSessionItem>>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new LinkedHashMap());
        this._sessions = MutableStateFlow2;
        this.sessions = FlowKt.asStateFlow(MutableStateFlow2);
        this.menuType = new ChatbotHistoryMenuType(null, 1, 0 == true ? 1 : 0);
    }

    public final StateFlow<ChatbotHistoryListUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<LinkedHashMap<String, List<ChatSessionItem>>> getSessions() {
        return this.sessions;
    }

    public final OptionDropdownMenuType getMenuType() {
        return this.menuType;
    }

    public final void onResume() {
        ChatbotHistoryListUiState value;
        MutableStateFlow<ChatbotHistoryListUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ChatbotHistoryListUiState.copy$default(value, true, false, null, false, null, 30, null)));
        fetchSessions();
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.chatbot.ChatbotHistoryListViewModel$fetchSessions$1, reason: invalid class name */
    /* JADX INFO: compiled from: ChatbotHistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.chatbot.ChatbotHistoryListViewModel$fetchSessions$1", f = "ChatbotHistoryListViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatbotHistoryListViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            MutableStateFlow mutableStateFlow;
            Object value4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableStateFlow mutableStateFlow2 = ChatbotHistoryListViewModel.this._sessions;
                        this.L$0 = mutableStateFlow2;
                        this.label = 1;
                        Object allSessions = ChatbotHistoryListViewModel.this.chatbotUseCase.getAllSessions(this);
                        if (allSessions == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableStateFlow = mutableStateFlow2;
                        obj = allSessions;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableStateFlow = (MutableStateFlow) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    mutableStateFlow.setValue(obj);
                    MutableStateFlow mutableStateFlow3 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value4 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value4, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value4, false, false, null, true, null, 20, null)));
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String str = ChatbotHistoryListViewModel.this.logTag;
                    Intrinsics.checkNotNullExpressionValue(str, "access$getLogTag$p(...)");
                    logger.error(str, e);
                    MutableStateFlow mutableStateFlow4 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value2 = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value2, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value2, false, false, Boxing.boxInt(R.string.chatbot_history_list_error_message), false, null, 27, null)));
                    MutableStateFlow mutableStateFlow5 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value3 = mutableStateFlow5.getValue();
                    } while (!mutableStateFlow5.compareAndSet(value3, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value3, false, false, null, true, null, 20, null)));
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                MutableStateFlow mutableStateFlow6 = ChatbotHistoryListViewModel.this._uiState;
                do {
                    value = mutableStateFlow6.getValue();
                } while (!mutableStateFlow6.compareAndSet(value, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value, false, false, null, true, null, 20, null)));
                throw th;
            }
        }
    }

    private final void fetchSessions() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    public final void resetTrigger() {
        ChatbotHistoryListUiState value;
        MutableStateFlow<ChatbotHistoryListUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ChatbotHistoryListUiState.copy$default(value, false, false, null, false, null, 11, null)));
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.chatbot.ChatbotHistoryListViewModel$onDelete$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ChatbotHistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.chatbot.ChatbotHistoryListViewModel$onDelete$1", f = "ChatbotHistoryListViewModel.kt", i = {}, l = {95, realm_column_attr_e.RLM_COLUMN_ATTR_COLLECTION}, m = "invokeSuspend", n = {}, s = {})
    static final class C08511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatSessionItem $chatSession;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08511(ChatSessionItem chatSessionItem, Continuation<? super C08511> continuation) {
            super(2, continuation);
            this.$chatSession = chatSessionItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatbotHistoryListViewModel.this.new C08511(this.$chatSession, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            Object value5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableStateFlow mutableStateFlow3 = ChatbotHistoryListViewModel.this._uiState;
                        do {
                            value4 = mutableStateFlow3.getValue();
                        } while (!mutableStateFlow3.compareAndSet(value4, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value4, true, false, null, false, null, 30, null)));
                        this.label = 1;
                        if (ChatbotHistoryListViewModel.this.chatbotUseCase.deleteSession(this.$chatSession, this) == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableStateFlow = (MutableStateFlow) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    mutableStateFlow.setValue(obj);
                    mutableStateFlow2 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value5 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value5, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value5, false, false, null, false, null, 30, null)));
                    return Unit.INSTANCE;
                    MutableStateFlow mutableStateFlow4 = ChatbotHistoryListViewModel.this._sessions;
                    this.L$0 = mutableStateFlow4;
                    this.label = 2;
                    Object allSessions = ChatbotHistoryListViewModel.this.chatbotUseCase.getAllSessions(this);
                    if (allSessions != coroutine_suspended) {
                        mutableStateFlow = mutableStateFlow4;
                        obj = allSessions;
                        mutableStateFlow.setValue(obj);
                        mutableStateFlow2 = ChatbotHistoryListViewModel.this._uiState;
                        do {
                            value5 = mutableStateFlow2.getValue();
                        } while (!mutableStateFlow2.compareAndSet(value5, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value5, false, false, null, false, null, 30, null)));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String str = ChatbotHistoryListViewModel.this.logTag;
                    Intrinsics.checkNotNullExpressionValue(str, "access$getLogTag$p(...)");
                    logger.error(str, e);
                    MutableStateFlow mutableStateFlow5 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value = mutableStateFlow5.getValue();
                    } while (!mutableStateFlow5.compareAndSet(value, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value, false, false, Boxing.boxInt(R.string.chatbot_history_list_delete_error_message), false, null, 27, null)));
                    MutableStateFlow mutableStateFlow6 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value2 = mutableStateFlow6.getValue();
                    } while (!mutableStateFlow6.compareAndSet(value2, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value2, false, false, null, false, null, 30, null)));
                }
            } catch (Throwable th) {
                MutableStateFlow mutableStateFlow7 = ChatbotHistoryListViewModel.this._uiState;
                do {
                    value3 = mutableStateFlow7.getValue();
                } while (!mutableStateFlow7.compareAndSet(value3, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value3, false, false, null, false, null, 30, null)));
                throw th;
            }
        }
    }

    public final void onDelete(ChatSessionItem chatSession) {
        Intrinsics.checkNotNullParameter(chatSession, "chatSession");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C08511(chatSession, null), 2, null);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.chatbot.ChatbotHistoryListViewModel$onDeleteAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ChatbotHistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.chatbot.ChatbotHistoryListViewModel$onDeleteAll$1", f = "ChatbotHistoryListViewModel.kt", i = {}, l = {realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_FLX_SYNC, realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_PBS}, m = "invokeSuspend", n = {}, s = {})
    static final class C08521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C08521(Continuation<? super C08521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatbotHistoryListViewModel.this.new C08521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            Object value5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableStateFlow mutableStateFlow3 = ChatbotHistoryListViewModel.this._uiState;
                        do {
                            value4 = mutableStateFlow3.getValue();
                        } while (!mutableStateFlow3.compareAndSet(value4, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value4, true, false, null, false, null, 30, null)));
                        this.label = 1;
                        if (ChatbotHistoryListViewModel.this.chatbotUseCase.deleteAllSessions(this) == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableStateFlow = (MutableStateFlow) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    mutableStateFlow.setValue(obj);
                    mutableStateFlow2 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value5 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value5, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value5, false, false, null, false, null, 30, null)));
                    return Unit.INSTANCE;
                    MutableStateFlow mutableStateFlow4 = ChatbotHistoryListViewModel.this._sessions;
                    this.L$0 = mutableStateFlow4;
                    this.label = 2;
                    Object allSessions = ChatbotHistoryListViewModel.this.chatbotUseCase.getAllSessions(this);
                    if (allSessions != coroutine_suspended) {
                        mutableStateFlow = mutableStateFlow4;
                        obj = allSessions;
                        mutableStateFlow.setValue(obj);
                        mutableStateFlow2 = ChatbotHistoryListViewModel.this._uiState;
                        do {
                            value5 = mutableStateFlow2.getValue();
                        } while (!mutableStateFlow2.compareAndSet(value5, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value5, false, false, null, false, null, 30, null)));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String str = ChatbotHistoryListViewModel.this.logTag;
                    Intrinsics.checkNotNullExpressionValue(str, "access$getLogTag$p(...)");
                    logger.error(str, e);
                    MutableStateFlow mutableStateFlow5 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value = mutableStateFlow5.getValue();
                    } while (!mutableStateFlow5.compareAndSet(value, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value, false, false, Boxing.boxInt(R.string.chatbot_history_list_delete_error_message), false, null, 27, null)));
                    MutableStateFlow mutableStateFlow6 = ChatbotHistoryListViewModel.this._uiState;
                    do {
                        value2 = mutableStateFlow6.getValue();
                    } while (!mutableStateFlow6.compareAndSet(value2, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value2, false, false, null, false, null, 30, null)));
                }
            } catch (Throwable th) {
                MutableStateFlow mutableStateFlow7 = ChatbotHistoryListViewModel.this._uiState;
                do {
                    value3 = mutableStateFlow7.getValue();
                } while (!mutableStateFlow7.compareAndSet(value3, ChatbotHistoryListUiState.copy$default((ChatbotHistoryListUiState) value3, false, false, null, false, null, 30, null)));
                throw th;
            }
        }
    }

    public final void onDeleteAll() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C08521(null), 2, null);
    }

    public final void onClickDelete(ChatSessionItem session) {
        ChatbotHistoryListUiState value;
        Intrinsics.checkNotNullParameter(session, "session");
        MutableStateFlow<ChatbotHistoryListUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ChatbotHistoryListUiState.copy$default(value, false, false, null, false, new ChatbotDeleteType.One(0, session, 1, null), 15, null)));
    }

    public final void onClickMenu(int type) {
        ChatbotHistoryListUiState value;
        if (type == R.string.chatbot_history_list_delete_all) {
            MutableStateFlow<ChatbotHistoryListUiState> mutableStateFlow = this._uiState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ChatbotHistoryListUiState.copy$default(value, false, false, null, false, new ChatbotDeleteType.All(0, 1, null), 15, null)));
        }
    }

    public final void onClickNew() {
        this.analyticsClient.logEvent("chat_session_create", MapsKt.emptyMap());
    }
}
