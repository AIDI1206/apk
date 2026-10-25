package com.medicmedia.medilink.ui.bookshelf;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/UnDisplayMessageItem;", "", "messageId", "", "buttonId", "actionEvent", "Lkotlin/Function0;", "", "<init>", "(IILkotlin/jvm/functions/Function0;)V", "getMessageId", "()I", "getButtonId", "getActionEvent", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class UnDisplayMessageItem {
    public static final int $stable = 0;
    private final Function0<Unit> actionEvent;
    private final int buttonId;
    private final int messageId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnDisplayMessageItem copy$default(UnDisplayMessageItem unDisplayMessageItem, int i, int i2, Function0 function0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = unDisplayMessageItem.messageId;
        }
        if ((i3 & 2) != 0) {
            i2 = unDisplayMessageItem.buttonId;
        }
        if ((i3 & 4) != 0) {
            function0 = unDisplayMessageItem.actionEvent;
        }
        return unDisplayMessageItem.copy(i, i2, function0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getButtonId() {
        return this.buttonId;
    }

    public final Function0<Unit> component3() {
        return this.actionEvent;
    }

    public final UnDisplayMessageItem copy(int messageId, int buttonId, Function0<Unit> actionEvent) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        return new UnDisplayMessageItem(messageId, buttonId, actionEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnDisplayMessageItem)) {
            return false;
        }
        UnDisplayMessageItem unDisplayMessageItem = (UnDisplayMessageItem) other;
        return this.messageId == unDisplayMessageItem.messageId && this.buttonId == unDisplayMessageItem.buttonId && Intrinsics.areEqual(this.actionEvent, unDisplayMessageItem.actionEvent);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.messageId) * 31) + Integer.hashCode(this.buttonId)) * 31) + this.actionEvent.hashCode();
    }

    public String toString() {
        return "UnDisplayMessageItem(messageId=" + this.messageId + ", buttonId=" + this.buttonId + ", actionEvent=" + this.actionEvent + ")";
    }

    public UnDisplayMessageItem(int i, int i2, Function0<Unit> actionEvent) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        this.messageId = i;
        this.buttonId = i2;
        this.actionEvent = actionEvent;
    }

    public final int getMessageId() {
        return this.messageId;
    }

    public final int getButtonId() {
        return this.buttonId;
    }

    public final Function0<Unit> getActionEvent() {
        return this.actionEvent;
    }
}
