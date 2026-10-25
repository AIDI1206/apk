package com.medicmedia.medilink.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MainTabView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1", f = "MainTabView.kt", i = {0, 0, 1}, l = {184, 185}, m = "onPostFling-RZ2iAVY", n = {"this", "shouldHide", "this"}, s = {"L$0", "I$0", "L$0"})
final class MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1(MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1 mainTabViewKt$MainTabView$bottomBarNestedScroll$1$1, Continuation<? super MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1> continuation) {
        super(continuation);
        this.this$0 = mainTabViewKt$MainTabView$bottomBarNestedScroll$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo871onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
