package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.Timestamp;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/data/model/ChatUsage;", "", "requestCount", "", "lastRequestAt", "Lcom/google/firebase/Timestamp;", "<init>", "(ILcom/google/firebase/Timestamp;)V", "getRequestCount", "()I", "getLastRequestAt", "()Lcom/google/firebase/Timestamp;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatUsage {
    private final Timestamp lastRequestAt;
    private final int requestCount;

    public ChatUsage() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChatUsage copy$default(ChatUsage chatUsage, int i, Timestamp timestamp, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatUsage.requestCount;
        }
        if ((i2 & 2) != 0) {
            timestamp = chatUsage.lastRequestAt;
        }
        return chatUsage.copy(i, timestamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRequestCount() {
        return this.requestCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Timestamp getLastRequestAt() {
        return this.lastRequestAt;
    }

    public final ChatUsage copy(int requestCount, Timestamp lastRequestAt) {
        Intrinsics.checkNotNullParameter(lastRequestAt, "lastRequestAt");
        return new ChatUsage(requestCount, lastRequestAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUsage)) {
            return false;
        }
        ChatUsage chatUsage = (ChatUsage) other;
        return this.requestCount == chatUsage.requestCount && Intrinsics.areEqual(this.lastRequestAt, chatUsage.lastRequestAt);
    }

    public int hashCode() {
        return (Integer.hashCode(this.requestCount) * 31) + this.lastRequestAt.hashCode();
    }

    public String toString() {
        return "ChatUsage(requestCount=" + this.requestCount + ", lastRequestAt=" + this.lastRequestAt + ")";
    }

    public ChatUsage(int i, Timestamp lastRequestAt) {
        Intrinsics.checkNotNullParameter(lastRequestAt, "lastRequestAt");
        this.requestCount = i;
        this.lastRequestAt = lastRequestAt;
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    public /* synthetic */ ChatUsage(int i, Timestamp timestamp, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new Timestamp(new Date()) : timestamp);
    }

    public final Timestamp getLastRequestAt() {
        return this.lastRequestAt;
    }
}
