package com.medicmedia.medilink.domain.model.chatbot;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotMessageItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatUsageItem;", "", "requestCount", "", "lastRequestAt", "Ljava/util/Date;", "<init>", "(ILjava/util/Date;)V", "getRequestCount", "()I", "getLastRequestAt", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatUsageItem {
    private final Date lastRequestAt;
    private final int requestCount;

    public ChatUsageItem() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChatUsageItem copy$default(ChatUsageItem chatUsageItem, int i, Date date, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatUsageItem.requestCount;
        }
        if ((i2 & 2) != 0) {
            date = chatUsageItem.lastRequestAt;
        }
        return chatUsageItem.copy(i, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRequestCount() {
        return this.requestCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getLastRequestAt() {
        return this.lastRequestAt;
    }

    public final ChatUsageItem copy(int requestCount, Date lastRequestAt) {
        Intrinsics.checkNotNullParameter(lastRequestAt, "lastRequestAt");
        return new ChatUsageItem(requestCount, lastRequestAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUsageItem)) {
            return false;
        }
        ChatUsageItem chatUsageItem = (ChatUsageItem) other;
        return this.requestCount == chatUsageItem.requestCount && Intrinsics.areEqual(this.lastRequestAt, chatUsageItem.lastRequestAt);
    }

    public int hashCode() {
        return (Integer.hashCode(this.requestCount) * 31) + this.lastRequestAt.hashCode();
    }

    public String toString() {
        return "ChatUsageItem(requestCount=" + this.requestCount + ", lastRequestAt=" + this.lastRequestAt + ")";
    }

    public ChatUsageItem(int i, Date lastRequestAt) {
        Intrinsics.checkNotNullParameter(lastRequestAt, "lastRequestAt");
        this.requestCount = i;
        this.lastRequestAt = lastRequestAt;
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    public /* synthetic */ ChatUsageItem(int i, Date date, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new Date() : date);
    }

    public final Date getLastRequestAt() {
        return this.lastRequestAt;
    }
}
