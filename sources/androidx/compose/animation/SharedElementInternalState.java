package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SharedElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010a\u001a\u00020DH\u0016J\b\u0010b\u001a\u00020DH\u0016J\b\u0010c\u001a\u00020DH\u0016R+\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\r\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010 \u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR+\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010 \u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010 \u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010G\u001a\u0004\u0018\u00010\u0000X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bM\u0010\u001cR\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR/\u0010U\u001a\u0004\u0018\u00010T2\b\u0010\u0014\u001a\u0004\u0018\u00010T8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010 \u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u001cR\u0014\u0010]\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u001cR\u0011\u0010_\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b`\u0010\u001c¨\u0006d"}, d2 = {"Landroidx/compose/animation/SharedElementInternalState;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "sharedElement", "Landroidx/compose/animation/SharedElement;", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderOnlyWhenVisible", "", "overlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "renderInOverlayDuringTransition", "userState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "zIndex", "", "<init>", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "<set-?>", "getZIndex", "()F", "setZIndex", "(F)V", "zIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getRenderInOverlayDuringTransition", "()Z", "setRenderInOverlayDuringTransition", "(Z)V", "renderInOverlayDuringTransition$delegate", "Landroidx/compose/runtime/MutableState;", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "setSharedElement", "(Landroidx/compose/animation/SharedElement;)V", "sharedElement$delegate", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "setBoundsAnimation", "(Landroidx/compose/animation/BoundsAnimation;)V", "boundsAnimation$delegate", "getPlaceHolderSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "setPlaceHolderSize", "(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V", "placeHolderSize$delegate", "getRenderOnlyWhenVisible", "setRenderOnlyWhenVisible", "renderOnlyWhenVisible$delegate", "getOverlayClip", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "setOverlayClip", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "overlayClip$delegate", "getUserState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "setUserState", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "userState$delegate", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay$animation", "()Landroidx/compose/ui/graphics/Path;", "setClipPathInOverlay$animation", "(Landroidx/compose/ui/graphics/Path;)V", "drawInOverlay", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "parentState", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "setParentState", "(Landroidx/compose/animation/SharedElementInternalState;)V", TypedValues.AttributesType.S_TARGET, "getTarget", "boundsProvider", "Landroidx/compose/animation/BoundsProvider;", "getBoundsProvider", "()Landroidx/compose/animation/BoundsProvider;", "setBoundsProvider", "(Landroidx/compose/animation/BoundsProvider;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer$delegate", "shouldRenderBasedOnTarget", "getShouldRenderBasedOnTarget", "shouldRenderInOverlay", "getShouldRenderInOverlay$animation", "shouldRenderInPlace", "getShouldRenderInPlace", "onRemembered", "onForgotten", "onAbandoned", "animation"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: boundsAnimation$delegate, reason: from kotlin metadata */
    private final MutableState boundsAnimation;
    private BoundsProvider boundsProvider;
    private Path clipPathInOverlay;

    /* JADX INFO: renamed from: layer$delegate, reason: from kotlin metadata */
    private final MutableState layer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: overlayClip$delegate, reason: from kotlin metadata */
    private final MutableState overlayClip;
    private SharedElementInternalState parentState;

    /* JADX INFO: renamed from: placeHolderSize$delegate, reason: from kotlin metadata */
    private final MutableState placeHolderSize;

    /* JADX INFO: renamed from: renderInOverlayDuringTransition$delegate, reason: from kotlin metadata */
    private final MutableState renderInOverlayDuringTransition;

    /* JADX INFO: renamed from: renderOnlyWhenVisible$delegate, reason: from kotlin metadata */
    private final MutableState renderOnlyWhenVisible;

    /* JADX INFO: renamed from: sharedElement$delegate, reason: from kotlin metadata */
    private final MutableState sharedElement;

    /* JADX INFO: renamed from: userState$delegate, reason: from kotlin metadata */
    private final MutableState userState;

    /* JADX INFO: renamed from: zIndex$delegate, reason: from kotlin metadata */
    private final MutableFloatState zIndex;

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    public SharedElementInternalState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, boolean z2, SharedTransitionScope.SharedContentState sharedContentState, float f) {
        this.zIndex = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.renderInOverlayDuringTransition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
        this.sharedElement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeHolderSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.overlayClip = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return this.zIndex.getFloatValue();
    }

    public void setZIndex(float f) {
        this.zIndex.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition.getValue()).booleanValue();
    }

    public final void setRenderInOverlayDuringTransition(boolean z) {
        this.renderInOverlayDuringTransition.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement.getValue();
    }

    public final void setSharedElement(SharedElement sharedElement) {
        this.sharedElement.setValue(sharedElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation.getValue();
    }

    public final void setBoundsAnimation(BoundsAnimation boundsAnimation) {
        this.boundsAnimation.setValue(boundsAnimation);
    }

    public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() {
        return (SharedTransitionScope.PlaceHolderSize) this.placeHolderSize.getValue();
    }

    public final void setPlaceHolderSize(SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.placeHolderSize.setValue(placeHolderSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible.getValue()).booleanValue();
    }

    public final void setRenderOnlyWhenVisible(boolean z) {
        this.renderOnlyWhenVisible.setValue(Boolean.valueOf(z));
    }

    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip.getValue();
    }

    public final void setOverlayClip(SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip.setValue(overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState.getValue();
    }

    public final void setUserState(SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState.setValue(sharedContentState);
    }

    /* JADX INFO: renamed from: getClipPathInOverlay$animation, reason: from getter */
    public final Path getClipPathInOverlay() {
        return this.clipPathInOverlay;
    }

    public final void setClipPathInOverlay$animation(Path path) {
        this.clipPathInOverlay = path;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(DrawScope drawScope) {
        GraphicsLayer layer = getLayer();
        if (layer == null || !getShouldRenderInOverlay$animation() || getSharedElement().getCurrentBoundsWhenMatched() == null) {
            return;
        }
        Rect currentBoundsWhenMatched = getSharedElement().getCurrentBoundsWhenMatched();
        Offset offsetM5704boximpl = currentBoundsWhenMatched != null ? Offset.m5704boximpl(currentBoundsWhenMatched.m5750getTopLeftF1C5BW0()) : null;
        Intrinsics.checkNotNull(offsetM5704boximpl);
        long jM5725unboximpl = offsetM5704boximpl.m5725unboximpl();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM5725unboximpl >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM5725unboximpl & 4294967295L));
        Path path = this.clipPathInOverlay;
        if (path != null) {
            int iM5948getIntersectrtfAjoo = ClipOp.INSTANCE.m5948getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo6459getSizeNHjbRc = drawContext.mo6459getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6461clipPathmtrdDE(path, iM5948getIntersectrtfAjoo);
                drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    GraphicsLayerKt.drawLayer(drawScope, layer);
                    drawScope.getDrawContext().getTransform().translate(-fIntBitsToFloat, -fIntBitsToFloat2);
                    drawContext.getCanvas().restore();
                    drawContext.mo6460setSizeuvyYCjk(jMo6459getSizeNHjbRc);
                    return;
                } catch (Throwable th) {
                    drawScope.getDrawContext().getTransform().translate(-fIntBitsToFloat, -fIntBitsToFloat2);
                    throw th;
                }
            } catch (Throwable th2) {
                drawContext.getCanvas().restore();
                drawContext.mo6460setSizeuvyYCjk(jMo6459getSizeNHjbRc);
                throw th2;
            }
        }
        drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
        try {
            GraphicsLayerKt.drawLayer(drawScope, layer);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-fIntBitsToFloat, -fIntBitsToFloat2);
        }
    }

    @Override // androidx.compose.animation.LayerRenderer
    public SharedElementInternalState getParentState() {
        return this.parentState;
    }

    public void setParentState(SharedElementInternalState sharedElementInternalState) {
        this.parentState = sharedElementInternalState;
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    public final BoundsProvider getBoundsProvider() {
        return this.boundsProvider;
    }

    public final void setBoundsProvider(BoundsProvider boundsProvider) {
        this.boundsProvider = boundsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer.getValue();
    }

    public final void setLayer(GraphicsLayer graphicsLayer) {
        this.layer.setValue(graphicsLayer);
    }

    private final boolean getShouldRenderBasedOnTarget() {
        return Intrinsics.areEqual(getSharedElement().getTargetBoundsProvider(), this.boundsProvider) || !getRenderOnlyWhenVisible();
    }

    public final boolean getShouldRenderInOverlay$animation() {
        return getShouldRenderBasedOnTarget() && getSharedElement().getFoundMatch() && getRenderInOverlayDuringTransition() && getSharedElement().getScope().isTransitionActive();
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getFoundMatch()) {
            return !getShouldRenderInOverlay$animation() && getShouldRenderBasedOnTarget();
        }
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        getSharedElement().getScope().onStateAdded$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        getSharedElement().getScope().onStateRemoved$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }
}
