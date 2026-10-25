package com.medicmedia.medilink.ui.chatbot;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.model.ChatLogPagingToken;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotMessageListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/PagingState;", "", "nextToken", "Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;", "isPaging", "", "documentId", "", "<init>", "(Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;ZLjava/lang/String;)V", "getNextToken", "()Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;", "()Z", "getDocumentId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* data */ class PagingState {
    private final String documentId;
    private final boolean isPaging;
    private final ChatLogPagingToken nextToken;

    public PagingState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ PagingState copy$default(PagingState pagingState, ChatLogPagingToken chatLogPagingToken, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            chatLogPagingToken = pagingState.nextToken;
        }
        if ((i & 2) != 0) {
            z = pagingState.isPaging;
        }
        if ((i & 4) != 0) {
            str = pagingState.documentId;
        }
        return pagingState.copy(chatLogPagingToken, z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatLogPagingToken getNextToken() {
        return this.nextToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPaging() {
        return this.isPaging;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    public final PagingState copy(ChatLogPagingToken nextToken, boolean isPaging, String documentId) {
        return new PagingState(nextToken, isPaging, documentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) other;
        return Intrinsics.areEqual(this.nextToken, pagingState.nextToken) && this.isPaging == pagingState.isPaging && Intrinsics.areEqual(this.documentId, pagingState.documentId);
    }

    public int hashCode() {
        ChatLogPagingToken chatLogPagingToken = this.nextToken;
        int iHashCode = (((chatLogPagingToken == null ? 0 : chatLogPagingToken.hashCode()) * 31) + Boolean.hashCode(this.isPaging)) * 31;
        String str = this.documentId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PagingState(nextToken=" + this.nextToken + ", isPaging=" + this.isPaging + ", documentId=" + this.documentId + ")";
    }

    public PagingState(ChatLogPagingToken chatLogPagingToken, boolean z, String str) {
        this.nextToken = chatLogPagingToken;
        this.isPaging = z;
        this.documentId = str;
    }

    public /* synthetic */ PagingState(ChatLogPagingToken chatLogPagingToken, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : chatLogPagingToken, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }

    public final ChatLogPagingToken getNextToken() {
        return this.nextToken;
    }

    public final boolean isPaging() {
        return this.isPaging;
    }

    public final String getDocumentId() {
        return this.documentId;
    }
}
