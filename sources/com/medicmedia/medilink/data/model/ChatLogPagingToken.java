package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.ChatbotRepositoryImpl;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;", "", ChatbotRepositoryImpl.Query.CREATE_AT, "Ljava/util/Date;", "docId", "", "<init>", "(Ljava/util/Date;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "getDocId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatLogPagingToken {
    private final Date createdAt;
    private final String docId;

    public static /* synthetic */ ChatLogPagingToken copy$default(ChatLogPagingToken chatLogPagingToken, Date date, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date = chatLogPagingToken.createdAt;
        }
        if ((i & 2) != 0) {
            str = chatLogPagingToken.docId;
        }
        return chatLogPagingToken.copy(date, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    public final ChatLogPagingToken copy(Date createdAt, String docId) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new ChatLogPagingToken(createdAt, docId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatLogPagingToken)) {
            return false;
        }
        ChatLogPagingToken chatLogPagingToken = (ChatLogPagingToken) other;
        return Intrinsics.areEqual(this.createdAt, chatLogPagingToken.createdAt) && Intrinsics.areEqual(this.docId, chatLogPagingToken.docId);
    }

    public int hashCode() {
        return (this.createdAt.hashCode() * 31) + this.docId.hashCode();
    }

    public String toString() {
        return "ChatLogPagingToken(createdAt=" + this.createdAt + ", docId=" + this.docId + ")";
    }

    public ChatLogPagingToken(Date createdAt, String docId) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.createdAt = createdAt;
        this.docId = docId;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getDocId() {
        return this.docId;
    }
}
