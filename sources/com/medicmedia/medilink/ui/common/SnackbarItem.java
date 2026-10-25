package com.medicmedia.medilink.ui.common;

import androidx.compose.material3.SnackbarDuration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnackbarItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jb\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÇ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010)\u001a\u00020\u0005H×\u0001J\t\u0010*\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/medicmedia/medilink/ui/common/SnackbarItem;", "", "message", "", "messageId", "", "actionLabel", "actionLabelId", "withDismissAction", "", TypedValues.TransitionType.S_DURATION, "Landroidx/compose/material3/SnackbarDuration;", "action", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/jvm/functions/Function0;)V", "getMessage", "()Ljava/lang/String;", "getMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActionLabel", "getActionLabelId", "getWithDismissAction", "()Z", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "getAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/jvm/functions/Function0;)Lcom/medicmedia/medilink/ui/common/SnackbarItem;", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SnackbarItem {
    public static final int $stable = 0;
    private final Function0<Unit> action;
    private final String actionLabel;
    private final Integer actionLabelId;
    private final SnackbarDuration duration;
    private final String message;
    private final Integer messageId;
    private final boolean withDismissAction;

    public SnackbarItem() {
        this(null, null, null, null, false, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SnackbarItem copy$default(SnackbarItem snackbarItem, String str, Integer num, String str2, Integer num2, boolean z, SnackbarDuration snackbarDuration, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = snackbarItem.message;
        }
        if ((i & 2) != 0) {
            num = snackbarItem.messageId;
        }
        if ((i & 4) != 0) {
            str2 = snackbarItem.actionLabel;
        }
        if ((i & 8) != 0) {
            num2 = snackbarItem.actionLabelId;
        }
        if ((i & 16) != 0) {
            z = snackbarItem.withDismissAction;
        }
        if ((i & 32) != 0) {
            snackbarDuration = snackbarItem.duration;
        }
        if ((i & 64) != 0) {
            function0 = snackbarItem.action;
        }
        SnackbarDuration snackbarDuration2 = snackbarDuration;
        Function0 function1 = function0;
        boolean z2 = z;
        String str3 = str2;
        return snackbarItem.copy(str, num, str3, num2, z2, snackbarDuration2, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActionLabel() {
        return this.actionLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getActionLabelId() {
        return this.actionLabelId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getWithDismissAction() {
        return this.withDismissAction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SnackbarDuration getDuration() {
        return this.duration;
    }

    public final Function0<Unit> component7() {
        return this.action;
    }

    public final SnackbarItem copy(String message, Integer messageId, String actionLabel, Integer actionLabelId, boolean withDismissAction, SnackbarDuration duration, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(action, "action");
        return new SnackbarItem(message, messageId, actionLabel, actionLabelId, withDismissAction, duration, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnackbarItem)) {
            return false;
        }
        SnackbarItem snackbarItem = (SnackbarItem) other;
        return Intrinsics.areEqual(this.message, snackbarItem.message) && Intrinsics.areEqual(this.messageId, snackbarItem.messageId) && Intrinsics.areEqual(this.actionLabel, snackbarItem.actionLabel) && Intrinsics.areEqual(this.actionLabelId, snackbarItem.actionLabelId) && this.withDismissAction == snackbarItem.withDismissAction && this.duration == snackbarItem.duration && Intrinsics.areEqual(this.action, snackbarItem.action);
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.messageId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.actionLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.actionLabelId;
        return ((((((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.withDismissAction)) * 31) + this.duration.hashCode()) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "SnackbarItem(message=" + this.message + ", messageId=" + this.messageId + ", actionLabel=" + this.actionLabel + ", actionLabelId=" + this.actionLabelId + ", withDismissAction=" + this.withDismissAction + ", duration=" + this.duration + ", action=" + this.action + ")";
    }

    public SnackbarItem(String str, Integer num, String str2, Integer num2, boolean z, SnackbarDuration duration, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(action, "action");
        this.message = str;
        this.messageId = num;
        this.actionLabel = str2;
        this.actionLabelId = num2;
        this.withDismissAction = z;
        this.duration = duration;
        this.action = action;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getMessageId() {
        return this.messageId;
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final Integer getActionLabelId() {
        return this.actionLabelId;
    }

    public final boolean getWithDismissAction() {
        return this.withDismissAction;
    }

    public /* synthetic */ SnackbarItem(String str, Integer num, String str2, Integer num2, boolean z, SnackbarDuration snackbarDuration, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? SnackbarDuration.Long : snackbarDuration, (i & 64) != 0 ? new Function0() { // from class: com.medicmedia.medilink.ui.common.SnackbarItem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0);
    }

    public final SnackbarDuration getDuration() {
        return this.duration;
    }

    public final Function0<Unit> getAction() {
        return this.action;
    }
}
