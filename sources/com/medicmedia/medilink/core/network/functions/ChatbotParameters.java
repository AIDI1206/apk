package com.medicmedia.medilink.core.network.functions;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotSseNetwork.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/ChatbotParameters;", "", SearchIntents.EXTRA_QUERY, "", "userId", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "getUserId", "getSessionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatbotParameters {
    private final String query;
    private final String sessionId;
    private final String userId;

    public static /* synthetic */ ChatbotParameters copy$default(ChatbotParameters chatbotParameters, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatbotParameters.query;
        }
        if ((i & 2) != 0) {
            str2 = chatbotParameters.userId;
        }
        if ((i & 4) != 0) {
            str3 = chatbotParameters.sessionId;
        }
        return chatbotParameters.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final ChatbotParameters copy(String query, String userId, String sessionId) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new ChatbotParameters(query, userId, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatbotParameters)) {
            return false;
        }
        ChatbotParameters chatbotParameters = (ChatbotParameters) other;
        return Intrinsics.areEqual(this.query, chatbotParameters.query) && Intrinsics.areEqual(this.userId, chatbotParameters.userId) && Intrinsics.areEqual(this.sessionId, chatbotParameters.sessionId);
    }

    public int hashCode() {
        int iHashCode = ((this.query.hashCode() * 31) + this.userId.hashCode()) * 31;
        String str = this.sessionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChatbotParameters(query=" + this.query + ", userId=" + this.userId + ", sessionId=" + this.sessionId + ")";
    }

    public ChatbotParameters(String query, String userId, String str) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.query = query;
        this.userId = userId;
        this.sessionId = str;
    }

    public /* synthetic */ ChatbotParameters(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }
}
