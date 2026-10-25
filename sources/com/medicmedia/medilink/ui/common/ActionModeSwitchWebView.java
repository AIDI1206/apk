package com.medicmedia.medilink.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.medicmedia.medilink.domain.BundleKey;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 52\u00020\u0001:\u000256B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001aJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u001aJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\"\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u001aJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u001aJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u001aJ\u0018\u0010(\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u001dJ*\u0010*\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00142\b\b\u0002\u0010,\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010-J\"\u0010.\u001a\u0004\u0018\u00010\u00142\u0006\u0010+\u001a\u00020\u00142\b\b\u0002\u0010,\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020\u0010J\u0018\u00101\u001a\u0004\u0018\u00010\u00142\u0006\u00102\u001a\u000203H\u0082@¢\u0006\u0002\u00104R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ActionModeSwitchWebView;", "Lcom/medicmedia/medilink/ui/common/SelectionActionWebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectionActionModeEnabled", "", "resolveCallback", "Landroid/view/ActionMode$Callback;", "callback", "setupMarkerActionMode", "", "isOn", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onMarkMode", "", "changeMarkerColor", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType;", "(Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMarkerColor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTimeBox", "value", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInteractiveTap", "setupElementTapDetector", "consumeTextTagTapped", "applySjContentsLayoutFix", "highlightAll", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAllHighlight", "consumeTabTapped", "quickReferenceCurrentTabNo", "setupQuickReferenceTabChangeNotifier", "selectQuickReferenceTab", BundleKey.TAB_NO, "quickReferenceNavigateTo", "anchor", "topOffset", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchorScroll", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareSjInitialScale", "evaluateJavascriptSuspend", "action", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "(Lcom/medicmedia/medilink/ui/common/JavascriptAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "DisabledSelectionActionModeCallback", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public class ActionModeSwitchWebView extends SelectionActionWebView {
    public static final String KEY_INDEX = "index";
    public static final String QUICK_REF_TAB_CHANGED_SCHEME = "medilink://quickref-tab-changed";
    private boolean selectionActionModeEnabled;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.common.ActionModeSwitchWebView$highlightAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.common.ActionModeSwitchWebView", f = "ActionModeSwitchWebView.kt", i = {0}, l = {realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_PBS}, m = "highlightAll", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActionModeSwitchWebView.this.highlightAll(null, this);
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.common.ActionModeSwitchWebView$quickReferenceCurrentTabNo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.common.ActionModeSwitchWebView", f = "ActionModeSwitchWebView.kt", i = {}, l = {124}, m = "quickReferenceCurrentTabNo", n = {}, s = {})
    static final class C08621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C08621(Continuation<? super C08621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActionModeSwitchWebView.this.quickReferenceCurrentTabNo(this);
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.common.ActionModeSwitchWebView$setupMarkerActionMode$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.common.ActionModeSwitchWebView", f = "ActionModeSwitchWebView.kt", i = {0, 0}, l = {56, 58}, m = "setupMarkerActionMode", n = {"this", "isOn"}, s = {"L$0", "Z$0"})
    static final class C08631 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C08631(Continuation<? super C08631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActionModeSwitchWebView.this.setupMarkerActionMode(false, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionModeSwitchWebView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionModeSwitchWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ActionModeSwitchWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionModeSwitchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectionActionModeEnabled = true;
    }

    @Override // com.medicmedia.medilink.ui.common.SelectionActionWebView
    protected ActionMode.Callback resolveCallback(ActionMode.Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.selectionActionModeEnabled ? wrapSelectionActionModeCallback(callback) : DisabledSelectionActionModeCallback.INSTANCE;
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ActionModeSwitchWebView$DisabledSelectionActionModeCallback;", "Landroid/view/ActionMode$Callback;", "<init>", "()V", "onCreateActionMode", "", "mode", "Landroid/view/ActionMode;", "menu", "Landroid/view/Menu;", "onPrepareActionMode", "onActionItemClicked", "item", "Landroid/view/MenuItem;", "onDestroyActionMode", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class DisabledSelectionActionModeCallback implements ActionMode.Callback {
        public static final DisabledSelectionActionModeCallback INSTANCE = new DisabledSelectionActionModeCallback();

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(item, "item");
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
        }

        private DisabledSelectionActionModeCallback() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(menu, "menu");
            menu.clear();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(menu, "menu");
            menu.clear();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (createTimeBox$default(r2, 0, r0, 1, null) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setupMarkerActionMode(boolean r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.medicmedia.medilink.ui.common.ActionModeSwitchWebView.C08631
            if (r0 == 0) goto L14
            r0 = r7
            com.medicmedia.medilink.ui.common.ActionModeSwitchWebView$setupMarkerActionMode$1 r0 = (com.medicmedia.medilink.ui.common.ActionModeSwitchWebView.C08631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.medicmedia.medilink.ui.common.ActionModeSwitchWebView$setupMarkerActionMode$1 r0 = new com.medicmedia.medilink.ui.common.ActionModeSwitchWebView$setupMarkerActionMode$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r7)
            goto L60
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            boolean r6 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            com.medicmedia.medilink.ui.common.ActionModeSwitchWebView r2 = (com.medicmedia.medilink.ui.common.ActionModeSwitchWebView) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L50
        L3f:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.L$0 = r5
            r0.Z$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.onMarkMode(r6, r0)
            if (r7 != r1) goto L4f
            goto L5f
        L4f:
            r2 = r5
        L50:
            r6 = r6 ^ r4
            r2.selectionActionModeEnabled = r6
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            r7 = 0
            java.lang.Object r6 = createTimeBox$default(r2, r7, r0, r4, r6)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.common.ActionModeSwitchWebView.setupMarkerActionMode(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object onMarkMode(boolean z, Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.OnMarkerMode(z, null, 2, null), continuation);
    }

    public final Object changeMarkerColor(MarkerColorSelectorType markerColorSelectorType, Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.ChangeMarkerColor(markerColorSelectorType, null, 2, null), continuation);
    }

    public final Object deleteMarkerColor(Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.DeleteMarkerColor(null, 1, null), continuation);
    }

    public static /* synthetic */ Object createTimeBox$default(ActionModeSwitchWebView actionModeSwitchWebView, int i, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTimeBox");
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return actionModeSwitchWebView.createTimeBox(i, continuation);
    }

    public final Object createTimeBox(int i, Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.CreateTimeBox(i, null, 2, null), continuation);
    }

    public final boolean isInteractiveTap() {
        int type = getHitTestResult().getType();
        return type == 2 || type == 3 || type == 4 || type == 5 || type == 7 || type == 8;
    }

    public final Object setupElementTapDetector(Continuation<? super Unit> continuation) {
        Object objEvaluateJavascriptSuspend = evaluateJavascriptSuspend((JavascriptAction) new JavascriptAction.SetupElementTapDetector(null, 1, null), (Continuation<? super String>) continuation);
        return objEvaluateJavascriptSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEvaluateJavascriptSuspend : Unit.INSTANCE;
    }

    public final Object consumeTextTagTapped(Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.ConsumeTextTagTapped(null, 1, null), continuation);
    }

    public final Object applySjContentsLayoutFix(Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.SjLayoutFix(null, 1, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object highlightAll(String str, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Iterator it;
        ActionModeSwitchWebView actionModeSwitchWebView;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<String> listSplit = new Regex("[ \u3000]+").split(str, 0);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listSplit) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            it = arrayList.iterator();
            actionModeSwitchWebView = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) anonymousClass1.L$1;
            actionModeSwitchWebView = (ActionModeSwitchWebView) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            JavascriptAction.HighlightAll highlightAll = new JavascriptAction.HighlightAll((String) it.next(), null, 2, null);
            anonymousClass1.L$0 = actionModeSwitchWebView;
            anonymousClass1.L$1 = it;
            anonymousClass1.label = 1;
            if (actionModeSwitchWebView.evaluateJavascriptSuspend(highlightAll, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object removeAllHighlight(Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.RemoveAllHighlights(null, 1, null), continuation);
    }

    public final Object consumeTabTapped(Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.ConsumeTabTapped(null, 1, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object quickReferenceCurrentTabNo(Continuation<? super Integer> continuation) {
        C08621 c08621;
        if (continuation instanceof C08621) {
            c08621 = (C08621) continuation;
            if ((c08621.label & Integer.MIN_VALUE) != 0) {
                c08621.label -= Integer.MIN_VALUE;
            } else {
                c08621 = new C08621(continuation);
            }
        } else {
            c08621 = new C08621(continuation);
        }
        Object objEvaluateJavascriptSuspend = c08621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08621.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objEvaluateJavascriptSuspend);
            JavascriptAction quickReferenceCurrentTabNo = new JavascriptAction.QuickReferenceCurrentTabNo(null, 1, null);
            c08621.label = 1;
            objEvaluateJavascriptSuspend = evaluateJavascriptSuspend(quickReferenceCurrentTabNo, c08621);
            if (objEvaluateJavascriptSuspend == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objEvaluateJavascriptSuspend);
        }
        String str = (String) objEvaluateJavascriptSuspend;
        if (str == null || Intrinsics.areEqual(str, "null")) {
            return null;
        }
        return StringsKt.toIntOrNull(str);
    }

    public final Object setupQuickReferenceTabChangeNotifier(Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.SetupQuickReferenceTabChangeNotifier(null, 1, null), continuation);
    }

    public final Object selectQuickReferenceTab(int i, Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.QuickReferenceSelectTab(i, null, 2, null), continuation);
    }

    public static /* synthetic */ Object quickReferenceNavigateTo$default(ActionModeSwitchWebView actionModeSwitchWebView, int i, String str, int i2, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: quickReferenceNavigateTo");
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return actionModeSwitchWebView.quickReferenceNavigateTo(i, str, i2, continuation);
    }

    public final Object quickReferenceNavigateTo(int i, String str, int i2, Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.QuickReferenceNavigateTo(i, str, i2), continuation);
    }

    public static /* synthetic */ Object anchorScroll$default(ActionModeSwitchWebView actionModeSwitchWebView, String str, int i, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: anchorScroll");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return actionModeSwitchWebView.anchorScroll(str, i, continuation);
    }

    public final Object anchorScroll(String str, int i, Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(new JavascriptAction.AnchorScroll(str, i), continuation);
    }

    public final void prepareSjInitialScale() {
        float f = getResources().getDisplayMetrics().density;
        float width = getWidth() / f;
        float height = getHeight() / f;
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        setInitialScale(RangesKt.coerceAtLeast((int) (Math.min(width / 512.0f, height / 384.0f) * 100), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object evaluateJavascriptSuspend(JavascriptAction javascriptAction, Continuation<? super String> continuation) {
        return evaluateJavascriptSuspend(javascriptAction.getCommand(), continuation);
    }
}
