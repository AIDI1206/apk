package com.medicmedia.medilink.ui.chatbot;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.chatbot.ChatSessionItem;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType;", "", "messageId", "", "getMessageId", "()I", "One", "All", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType$All;", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType$One;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ChatbotDeleteType {
    int getMessageId();

    /* JADX INFO: compiled from: ChatbotItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType$One;", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType;", "messageId", "", "session", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatSessionItem;", "<init>", "(ILcom/medicmedia/medilink/domain/model/chatbot/ChatSessionItem;)V", "getMessageId", "()I", "getSession", "()Lcom/medicmedia/medilink/domain/model/chatbot/ChatSessionItem;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class One implements ChatbotDeleteType {
        public static final int $stable = 8;
        private final int messageId;
        private final ChatSessionItem session;

        public static /* synthetic */ One copy$default(One one, int i, ChatSessionItem chatSessionItem, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = one.messageId;
            }
            if ((i2 & 2) != 0) {
                chatSessionItem = one.session;
            }
            return one.copy(i, chatSessionItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ChatSessionItem getSession() {
            return this.session;
        }

        public final One copy(int messageId, ChatSessionItem session) {
            Intrinsics.checkNotNullParameter(session, "session");
            return new One(messageId, session);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof One)) {
                return false;
            }
            One one = (One) other;
            return this.messageId == one.messageId && Intrinsics.areEqual(this.session, one.session);
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageId) * 31) + this.session.hashCode();
        }

        public String toString() {
            return "One(messageId=" + this.messageId + ", session=" + this.session + ")";
        }

        public One(int i, ChatSessionItem session) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.messageId = i;
            this.session = session;
        }

        public /* synthetic */ One(int i, ChatSessionItem chatSessionItem, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.chatbot_history_list_delete_message : i, chatSessionItem);
        }

        @Override // com.medicmedia.medilink.ui.chatbot.ChatbotDeleteType
        public int getMessageId() {
            return this.messageId;
        }

        public final ChatSessionItem getSession() {
            return this.session;
        }
    }

    /* JADX INFO: compiled from: ChatbotItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType$All;", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotDeleteType;", "messageId", "", "<init>", "(I)V", "getMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class All implements ChatbotDeleteType {
        public static final int $stable = 0;
        private final int messageId;

        public All() {
            this(0, 1, null);
        }

        public static /* synthetic */ All copy$default(All all, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = all.messageId;
            }
            return all.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        public final All copy(int messageId) {
            return new All(messageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof All) && this.messageId == ((All) other).messageId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageId);
        }

        public String toString() {
            return "All(messageId=" + this.messageId + ")";
        }

        public All(int i) {
            this.messageId = i;
        }

        public /* synthetic */ All(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.chatbot_history_list_delete_all_message : i);
        }

        @Override // com.medicmedia.medilink.ui.chatbot.ChatbotDeleteType
        public int getMessageId() {
            return this.messageId;
        }
    }
}
