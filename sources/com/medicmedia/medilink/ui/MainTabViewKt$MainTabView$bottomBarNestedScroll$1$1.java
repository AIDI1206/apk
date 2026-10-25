package com.medicmedia.medilink.ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MainTabView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/medicmedia/medilink/ui/MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1 implements NestedScrollConnection {
    final /* synthetic */ float $barHeightPx;
    final /* synthetic */ MutableFloatState $barOffsetPx$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $flingAnim;
    final /* synthetic */ float $flingSpeedThreshold;

    MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1(float f, MutableFloatState mutableFloatState, float f2, Animatable<Float, AnimationVector1D> animatable) {
        this.$barHeightPx = f;
        this.$barOffsetPx$delegate = mutableFloatState;
        this.$flingSpeedThreshold = f2;
        this.$flingAnim = animatable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, null, null, null, r5, 14, null) == r12) goto L36;
     */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo871onPostFlingRZ2iAVY(long r9, long r11, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r13) {
        /*
            r8 = this;
            boolean r11 = r13 instanceof com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1
            if (r11 == 0) goto L14
            r11 = r13
            com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1 r11 = (com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1) r11
            int r12 = r11.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r0
            if (r12 == 0) goto L14
            int r12 = r11.label
            int r12 = r12 - r0
            r11.label = r12
            goto L19
        L14:
            com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1 r11 = new com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1$onPostFling$1
            r11.<init>(r8, r13)
        L19:
            r5 = r11
            java.lang.Object r11 = r5.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r13 = r5.label
            r0 = 2
            r1 = 1
            if (r13 == 0) goto L49
            if (r13 == r1) goto L3b
            if (r13 != r0) goto L33
            java.lang.Object r9 = r5.L$0
            com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1 r9 = (com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto La9
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            int r9 = r5.I$0
            java.lang.Object r10 = r5.L$0
            com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1 r10 = (com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1) r10
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
            r10 = r9
            r9 = r11
        L47:
            r11 = r0
            goto L8c
        L49:
            kotlin.ResultKt.throwOnFailure(r11)
            float r9 = androidx.compose.ui.unit.Velocity.m8942getYimpl(r9)
            float r10 = r8.$flingSpeedThreshold
            float r11 = -r10
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L59
        L57:
            r9 = r1
            goto L70
        L59:
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r10 = 0
            if (r9 <= 0) goto L60
        L5e:
            r9 = r10
            goto L70
        L60:
            androidx.compose.runtime.MutableFloatState r9 = r8.$barOffsetPx$delegate
            float r9 = com.medicmedia.medilink.ui.MainTabViewKt.access$MainTabView$lambda$22(r9)
            float r11 = r8.$barHeightPx
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r13
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L5e
            goto L57
        L70:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r10 = r8.$flingAnim
            androidx.compose.runtime.MutableFloatState r11 = r8.$barOffsetPx$delegate
            float r11 = com.medicmedia.medilink.ui.MainTabViewKt.access$MainTabView$lambda$22(r11)
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)
            r5.L$0 = r8
            r5.I$0 = r9
            r5.label = r1
            java.lang.Object r10 = r10.snapTo(r11, r5)
            if (r10 != r12) goto L89
            goto La8
        L89:
            r10 = r9
            r9 = r8
            goto L47
        L8c:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r0 = r9.$flingAnim
            if (r10 == 0) goto L93
            float r10 = r9.$barHeightPx
            goto L94
        L93:
            r10 = 0
        L94:
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)
            r5.L$0 = r9
            r5.label = r11
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 14
            r7 = 0
            java.lang.Object r10 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r12) goto La9
        La8:
            return r12
        La9:
            androidx.compose.runtime.MutableFloatState r10 = r9.$barOffsetPx$delegate
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r9 = r9.$flingAnim
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            com.medicmedia.medilink.ui.MainTabViewKt.access$MainTabView$lambda$23(r10, r9)
            androidx.compose.ui.unit.Velocity$Companion r9 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r9 = r9.m8952getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.ui.unit.Velocity.m8932boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.MainTabViewKt$MainTabView$bottomBarNestedScroll$1$1.mo871onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo872onPostScrollDzOQY0M(long consumed, long available, int source) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (consumed & 4294967295L));
        MutableFloatState mutableFloatState = this.$barOffsetPx$delegate;
        mutableFloatState.setFloatValue(RangesKt.coerceIn(MainTabViewKt.MainTabView$lambda$22(mutableFloatState) - fIntBitsToFloat, 0.0f, this.$barHeightPx));
        return Offset.INSTANCE.m5731getZeroF1C5BW0();
    }
}
