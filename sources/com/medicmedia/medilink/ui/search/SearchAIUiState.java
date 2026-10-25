package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.domain.model.chatbot.ChatbotMessageItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchAICoordinator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÇ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020\tH×\u0001J\t\u0010&\u001a\u00020\rH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchAIUiState;", "", "hasAIChatLicense", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/medicmedia/medilink/ui/search/SearchAIState;", "answer", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem;", "remainingCount", "", "maxCount", "isExpanded", "imagePreviewUrl", "", "<init>", "(ZLcom/medicmedia/medilink/ui/search/SearchAIState;Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem;IIZLjava/lang/String;)V", "getHasAIChatLicense", "()Z", "getState", "()Lcom/medicmedia/medilink/ui/search/SearchAIState;", "getAnswer", "()Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem;", "getRemainingCount", "()I", "getMaxCount", "getImagePreviewUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchAIUiState {
    public static final int $stable = 8;
    private final ChatbotMessageItem answer;
    private final boolean hasAIChatLicense;
    private final String imagePreviewUrl;
    private final boolean isExpanded;
    private final int maxCount;
    private final int remainingCount;
    private final SearchAIState state;

    public SearchAIUiState() {
        this(false, null, null, 0, 0, false, null, 127, null);
    }

    public static /* synthetic */ SearchAIUiState copy$default(SearchAIUiState searchAIUiState, boolean z, SearchAIState searchAIState, ChatbotMessageItem chatbotMessageItem, int i, int i2, boolean z2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = searchAIUiState.hasAIChatLicense;
        }
        if ((i3 & 2) != 0) {
            searchAIState = searchAIUiState.state;
        }
        if ((i3 & 4) != 0) {
            chatbotMessageItem = searchAIUiState.answer;
        }
        if ((i3 & 8) != 0) {
            i = searchAIUiState.remainingCount;
        }
        if ((i3 & 16) != 0) {
            i2 = searchAIUiState.maxCount;
        }
        if ((i3 & 32) != 0) {
            z2 = searchAIUiState.isExpanded;
        }
        if ((i3 & 64) != 0) {
            str = searchAIUiState.imagePreviewUrl;
        }
        boolean z3 = z2;
        String str2 = str;
        int i4 = i2;
        ChatbotMessageItem chatbotMessageItem2 = chatbotMessageItem;
        return searchAIUiState.copy(z, searchAIState, chatbotMessageItem2, i, i4, z3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasAIChatLicense() {
        return this.hasAIChatLicense;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SearchAIState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChatbotMessageItem getAnswer() {
        return this.answer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRemainingCount() {
        return this.remainingCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImagePreviewUrl() {
        return this.imagePreviewUrl;
    }

    public final SearchAIUiState copy(boolean hasAIChatLicense, SearchAIState state, ChatbotMessageItem answer, int remainingCount, int maxCount, boolean isExpanded, String imagePreviewUrl) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new SearchAIUiState(hasAIChatLicense, state, answer, remainingCount, maxCount, isExpanded, imagePreviewUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAIUiState)) {
            return false;
        }
        SearchAIUiState searchAIUiState = (SearchAIUiState) other;
        return this.hasAIChatLicense == searchAIUiState.hasAIChatLicense && this.state == searchAIUiState.state && Intrinsics.areEqual(this.answer, searchAIUiState.answer) && this.remainingCount == searchAIUiState.remainingCount && this.maxCount == searchAIUiState.maxCount && this.isExpanded == searchAIUiState.isExpanded && Intrinsics.areEqual(this.imagePreviewUrl, searchAIUiState.imagePreviewUrl);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.hasAIChatLicense) * 31) + this.state.hashCode()) * 31;
        ChatbotMessageItem chatbotMessageItem = this.answer;
        int iHashCode2 = (((((((iHashCode + (chatbotMessageItem == null ? 0 : chatbotMessageItem.hashCode())) * 31) + Integer.hashCode(this.remainingCount)) * 31) + Integer.hashCode(this.maxCount)) * 31) + Boolean.hashCode(this.isExpanded)) * 31;
        String str = this.imagePreviewUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SearchAIUiState(hasAIChatLicense=" + this.hasAIChatLicense + ", state=" + this.state + ", answer=" + this.answer + ", remainingCount=" + this.remainingCount + ", maxCount=" + this.maxCount + ", isExpanded=" + this.isExpanded + ", imagePreviewUrl=" + this.imagePreviewUrl + ")";
    }

    public SearchAIUiState(boolean z, SearchAIState state, ChatbotMessageItem chatbotMessageItem, int i, int i2, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.hasAIChatLicense = z;
        this.state = state;
        this.answer = chatbotMessageItem;
        this.remainingCount = i;
        this.maxCount = i2;
        this.isExpanded = z2;
        this.imagePreviewUrl = str;
    }

    public final boolean getHasAIChatLicense() {
        return this.hasAIChatLicense;
    }

    public /* synthetic */ SearchAIUiState(boolean z, SearchAIState searchAIState, ChatbotMessageItem chatbotMessageItem, int i, int i2, boolean z2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? SearchAIState.IDLE : searchAIState, (i3 & 4) != 0 ? null : chatbotMessageItem, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? null : str);
    }

    public final SearchAIState getState() {
        return this.state;
    }

    public final ChatbotMessageItem getAnswer() {
        return this.answer;
    }

    public final int getRemainingCount() {
        return this.remainingCount;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final String getImagePreviewUrl() {
        return this.imagePreviewUrl;
    }
}
