package com.medicmedia.medilink.ui.chatbot;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotHistoryListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003JD\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÇ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0006H×\u0001J\t\u0010\u001c\u001a\u00020\u001dH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotHistoryListUiState;", "", "isLoading", "", "isRefresh", "errorMessage", "", "isInitialized", "showDeleteDialog", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType;", "<init>", "(ZZLjava/lang/Integer;ZLcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowDeleteDialog", "()Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZZLjava/lang/Integer;ZLcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType;)Lcom/medicmedia/medilink/ui/chatbot/ChatbotHistoryListUiState;", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatbotHistoryListUiState {
    private final Integer errorMessage;
    private final boolean isInitialized;
    private final boolean isLoading;
    private final boolean isRefresh;
    private final ChatbotDeleteType showDeleteDialog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ChatbotHistoryListUiState f72default = new ChatbotHistoryListUiState(false, false, null, false, null, 31, null);

    public ChatbotHistoryListUiState() {
        this(false, false, null, false, null, 31, null);
    }

    public static /* synthetic */ ChatbotHistoryListUiState copy$default(ChatbotHistoryListUiState chatbotHistoryListUiState, boolean z, boolean z2, Integer num, boolean z3, ChatbotDeleteType chatbotDeleteType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatbotHistoryListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = chatbotHistoryListUiState.isRefresh;
        }
        if ((i & 4) != 0) {
            num = chatbotHistoryListUiState.errorMessage;
        }
        if ((i & 8) != 0) {
            z3 = chatbotHistoryListUiState.isInitialized;
        }
        if ((i & 16) != 0) {
            chatbotDeleteType = chatbotHistoryListUiState.showDeleteDialog;
        }
        ChatbotDeleteType chatbotDeleteType2 = chatbotDeleteType;
        Integer num2 = num;
        return chatbotHistoryListUiState.copy(z, z2, num2, z3, chatbotDeleteType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRefresh() {
        return this.isRefresh;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChatbotDeleteType getShowDeleteDialog() {
        return this.showDeleteDialog;
    }

    public final ChatbotHistoryListUiState copy(boolean isLoading, boolean isRefresh, Integer errorMessage, boolean isInitialized, ChatbotDeleteType showDeleteDialog) {
        return new ChatbotHistoryListUiState(isLoading, isRefresh, errorMessage, isInitialized, showDeleteDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatbotHistoryListUiState)) {
            return false;
        }
        ChatbotHistoryListUiState chatbotHistoryListUiState = (ChatbotHistoryListUiState) other;
        return this.isLoading == chatbotHistoryListUiState.isLoading && this.isRefresh == chatbotHistoryListUiState.isRefresh && Intrinsics.areEqual(this.errorMessage, chatbotHistoryListUiState.errorMessage) && this.isInitialized == chatbotHistoryListUiState.isInitialized && Intrinsics.areEqual(this.showDeleteDialog, chatbotHistoryListUiState.showDeleteDialog);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isRefresh)) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isInitialized)) * 31;
        ChatbotDeleteType chatbotDeleteType = this.showDeleteDialog;
        return iHashCode2 + (chatbotDeleteType != null ? chatbotDeleteType.hashCode() : 0);
    }

    public String toString() {
        return "ChatbotHistoryListUiState(isLoading=" + this.isLoading + ", isRefresh=" + this.isRefresh + ", errorMessage=" + this.errorMessage + ", isInitialized=" + this.isInitialized + ", showDeleteDialog=" + this.showDeleteDialog + ")";
    }

    public ChatbotHistoryListUiState(boolean z, boolean z2, Integer num, boolean z3, ChatbotDeleteType chatbotDeleteType) {
        this.isLoading = z;
        this.isRefresh = z2;
        this.errorMessage = num;
        this.isInitialized = z3;
        this.showDeleteDialog = chatbotDeleteType;
    }

    public /* synthetic */ ChatbotHistoryListUiState(boolean z, boolean z2, Integer num, boolean z3, ChatbotDeleteType chatbotDeleteType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : chatbotDeleteType);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final ChatbotDeleteType getShowDeleteDialog() {
        return this.showDeleteDialog;
    }

    /* JADX INFO: compiled from: ChatbotHistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotHistoryListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotHistoryListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/chatbot/ChatbotHistoryListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatbotHistoryListUiState getDefault() {
            return ChatbotHistoryListUiState.f72default;
        }
    }
}
