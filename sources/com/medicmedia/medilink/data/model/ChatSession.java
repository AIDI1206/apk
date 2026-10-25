package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.PropertyName;
import com.medicmedia.medilink.data.repository.ChatbotRepositoryImpl;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/data/model/ChatSession;", "", "userId", "", "firstQuery", ChatbotRepositoryImpl.Query.CREATE_AT, "Lcom/google/firebase/Timestamp;", ChatbotRepositoryImpl.Query.LAST_INTERACTION_AT, "deleteFlg", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;Lcom/google/firebase/Timestamp;Z)V", "getUserId", "()Ljava/lang/String;", "getFirstQuery", "getCreatedAt", "()Lcom/google/firebase/Timestamp;", "getLastInteractionAt", "getDeleteFlg", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatSession {
    private final Timestamp createdAt;

    @PropertyName("delete_flg")
    private final boolean deleteFlg;
    private final String firstQuery;
    private final Timestamp lastInteractionAt;
    private final String userId;

    public ChatSession() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ ChatSession copy$default(ChatSession chatSession, String str, String str2, Timestamp timestamp, Timestamp timestamp2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSession.userId;
        }
        if ((i & 2) != 0) {
            str2 = chatSession.firstQuery;
        }
        if ((i & 4) != 0) {
            timestamp = chatSession.createdAt;
        }
        if ((i & 8) != 0) {
            timestamp2 = chatSession.lastInteractionAt;
        }
        if ((i & 16) != 0) {
            z = chatSession.deleteFlg;
        }
        boolean z2 = z;
        Timestamp timestamp3 = timestamp;
        return chatSession.copy(str, str2, timestamp3, timestamp2, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstQuery() {
        return this.firstQuery;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Timestamp getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Timestamp getLastInteractionAt() {
        return this.lastInteractionAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }

    public final ChatSession copy(String userId, String firstQuery, Timestamp createdAt, Timestamp lastInteractionAt, boolean deleteFlg) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(lastInteractionAt, "lastInteractionAt");
        return new ChatSession(userId, firstQuery, createdAt, lastInteractionAt, deleteFlg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSession)) {
            return false;
        }
        ChatSession chatSession = (ChatSession) other;
        return Intrinsics.areEqual(this.userId, chatSession.userId) && Intrinsics.areEqual(this.firstQuery, chatSession.firstQuery) && Intrinsics.areEqual(this.createdAt, chatSession.createdAt) && Intrinsics.areEqual(this.lastInteractionAt, chatSession.lastInteractionAt) && this.deleteFlg == chatSession.deleteFlg;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        String str = this.firstQuery;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.createdAt.hashCode()) * 31) + this.lastInteractionAt.hashCode()) * 31) + Boolean.hashCode(this.deleteFlg);
    }

    public String toString() {
        return "ChatSession(userId=" + this.userId + ", firstQuery=" + this.firstQuery + ", createdAt=" + this.createdAt + ", lastInteractionAt=" + this.lastInteractionAt + ", deleteFlg=" + this.deleteFlg + ")";
    }

    public ChatSession(String userId, String str, Timestamp createdAt, Timestamp lastInteractionAt, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(lastInteractionAt, "lastInteractionAt");
        this.userId = userId;
        this.firstQuery = str;
        this.createdAt = createdAt;
        this.lastInteractionAt = lastInteractionAt;
        this.deleteFlg = z;
    }

    public /* synthetic */ ChatSession(String str, String str2, Timestamp timestamp, Timestamp timestamp2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Timestamp(new Date()) : timestamp, (i & 8) != 0 ? new Timestamp(new Date()) : timestamp2, (i & 16) != 0 ? false : z);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getFirstQuery() {
        return this.firstQuery;
    }

    public final Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public final Timestamp getLastInteractionAt() {
        return this.lastInteractionAt;
    }

    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }
}
