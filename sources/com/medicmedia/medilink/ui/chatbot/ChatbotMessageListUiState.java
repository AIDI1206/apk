package com.medicmedia.medilink.ui.chatbot;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotMessageListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\\\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÇ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\"\u001a\u00020\u0006H×\u0001J\t\u0010#\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotMessageListUiState;", "", "isLoading", "", "isSending", "errorMessage", "", HistoryRepositoryImpl.FieldName.TITLE, "", "requestCount", "showImagePreview", "showGuidance", "<init>", "(ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getRequestCount", "getShowImagePreview", "getShowGuidance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/medicmedia/medilink/ui/chatbot/ChatbotMessageListUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatbotMessageListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ChatbotMessageListUiState f73default = new ChatbotMessageListUiState(false, false, null, null, null, null, false, 127, null);
    private final Integer errorMessage;
    private final boolean isLoading;
    private final boolean isSending;
    private final Integer requestCount;
    private final boolean showGuidance;
    private final String showImagePreview;
    private final String title;

    public ChatbotMessageListUiState() {
        this(false, false, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ ChatbotMessageListUiState copy$default(ChatbotMessageListUiState chatbotMessageListUiState, boolean z, boolean z2, Integer num, String str, Integer num2, String str2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatbotMessageListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = chatbotMessageListUiState.isSending;
        }
        if ((i & 4) != 0) {
            num = chatbotMessageListUiState.errorMessage;
        }
        if ((i & 8) != 0) {
            str = chatbotMessageListUiState.title;
        }
        if ((i & 16) != 0) {
            num2 = chatbotMessageListUiState.requestCount;
        }
        if ((i & 32) != 0) {
            str2 = chatbotMessageListUiState.showImagePreview;
        }
        if ((i & 64) != 0) {
            z3 = chatbotMessageListUiState.showGuidance;
        }
        String str3 = str2;
        boolean z4 = z3;
        Integer num3 = num2;
        Integer num4 = num;
        return chatbotMessageListUiState.copy(z, z2, num4, str, num3, str3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRequestCount() {
        return this.requestCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShowImagePreview() {
        return this.showImagePreview;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowGuidance() {
        return this.showGuidance;
    }

    public final ChatbotMessageListUiState copy(boolean isLoading, boolean isSending, Integer errorMessage, String title, Integer requestCount, String showImagePreview, boolean showGuidance) {
        return new ChatbotMessageListUiState(isLoading, isSending, errorMessage, title, requestCount, showImagePreview, showGuidance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatbotMessageListUiState)) {
            return false;
        }
        ChatbotMessageListUiState chatbotMessageListUiState = (ChatbotMessageListUiState) other;
        return this.isLoading == chatbotMessageListUiState.isLoading && this.isSending == chatbotMessageListUiState.isSending && Intrinsics.areEqual(this.errorMessage, chatbotMessageListUiState.errorMessage) && Intrinsics.areEqual(this.title, chatbotMessageListUiState.title) && Intrinsics.areEqual(this.requestCount, chatbotMessageListUiState.requestCount) && Intrinsics.areEqual(this.showImagePreview, chatbotMessageListUiState.showImagePreview) && this.showGuidance == chatbotMessageListUiState.showGuidance;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isSending)) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.requestCount;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.showImagePreview;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showGuidance);
    }

    public String toString() {
        return "ChatbotMessageListUiState(isLoading=" + this.isLoading + ", isSending=" + this.isSending + ", errorMessage=" + this.errorMessage + ", title=" + this.title + ", requestCount=" + this.requestCount + ", showImagePreview=" + this.showImagePreview + ", showGuidance=" + this.showGuidance + ")";
    }

    public ChatbotMessageListUiState(boolean z, boolean z2, Integer num, String str, Integer num2, String str2, boolean z3) {
        this.isLoading = z;
        this.isSending = z2;
        this.errorMessage = num;
        this.title = str;
        this.requestCount = num2;
        this.showImagePreview = str2;
        this.showGuidance = z3;
    }

    public /* synthetic */ ChatbotMessageListUiState(boolean z, boolean z2, Integer num, String str, Integer num2, String str2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSending() {
        return this.isSending;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getRequestCount() {
        return this.requestCount;
    }

    public final String getShowImagePreview() {
        return this.showImagePreview;
    }

    public final boolean getShowGuidance() {
        return this.showGuidance;
    }

    /* JADX INFO: compiled from: ChatbotMessageListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotMessageListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotMessageListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/chatbot/ChatbotMessageListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatbotMessageListUiState getDefault() {
            return ChatbotMessageListUiState.f73default;
        }
    }
}
