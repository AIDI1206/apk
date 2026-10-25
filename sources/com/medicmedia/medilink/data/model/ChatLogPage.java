package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/data/model/ChatLogPage;", ExifInterface.GPS_DIRECTION_TRUE, "", FirebaseAnalytics.Param.ITEMS, "", "nextToken", "Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;", "<init>", "(Ljava/util/List;Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;)V", "getItems", "()Ljava/util/List;", "getNextToken", "()Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatLogPage<T> {
    private final List<T> items;
    private final ChatLogPagingToken nextToken;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatLogPage copy$default(ChatLogPage chatLogPage, List list, ChatLogPagingToken chatLogPagingToken, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatLogPage.items;
        }
        if ((i & 2) != 0) {
            chatLogPagingToken = chatLogPage.nextToken;
        }
        return chatLogPage.copy(list, chatLogPagingToken);
    }

    public final List<T> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatLogPagingToken getNextToken() {
        return this.nextToken;
    }

    public final ChatLogPage<T> copy(List<? extends T> items, ChatLogPagingToken nextToken) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ChatLogPage<>(items, nextToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatLogPage)) {
            return false;
        }
        ChatLogPage chatLogPage = (ChatLogPage) other;
        return Intrinsics.areEqual(this.items, chatLogPage.items) && Intrinsics.areEqual(this.nextToken, chatLogPage.nextToken);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        ChatLogPagingToken chatLogPagingToken = this.nextToken;
        return iHashCode + (chatLogPagingToken == null ? 0 : chatLogPagingToken.hashCode());
    }

    public String toString() {
        return "ChatLogPage(items=" + this.items + ", nextToken=" + this.nextToken + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatLogPage(List<? extends T> items, ChatLogPagingToken chatLogPagingToken) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.nextToken = chatLogPagingToken;
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final ChatLogPagingToken getNextToken() {
        return this.nextToken;
    }
}
