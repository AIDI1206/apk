package com.medicmedia.medilink.ui.video.detail;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.realm_sync_errno_session_e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VideoDetailItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\tJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u001eH×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailLayoutParam;", "", "horizontalVideoListHeight", "Landroidx/compose/ui/unit/Dp;", "horizontalVideoListPeekHeight", "playerBottomLiftHeight", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHorizontalVideoListHeight-D9Ej5fM", "()F", "F", "getHorizontalVideoListPeekHeight-D9Ej5fM", "getPlayerBottomLiftHeight-D9Ej5fM", "collapsedOffsetDp", "getCollapsedOffsetDp-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "copy", "copy-2z7ARbQ", "(FFF)Lcom/medicmedia/medilink/ui/video/detail/VideoDetailLayoutParam;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoDetailLayoutParam {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final VideoDetailLayoutParam reset;
    private final float horizontalVideoListHeight;
    private final float horizontalVideoListPeekHeight;
    private final float playerBottomLiftHeight;

    public /* synthetic */ VideoDetailLayoutParam(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3);
    }

    /* JADX INFO: renamed from: copy-2z7ARbQ$default, reason: not valid java name */
    public static /* synthetic */ VideoDetailLayoutParam m11095copy2z7ARbQ$default(VideoDetailLayoutParam videoDetailLayoutParam, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = videoDetailLayoutParam.horizontalVideoListHeight;
        }
        if ((i & 2) != 0) {
            f2 = videoDetailLayoutParam.horizontalVideoListPeekHeight;
        }
        if ((i & 4) != 0) {
            f3 = videoDetailLayoutParam.playerBottomLiftHeight;
        }
        return videoDetailLayoutParam.m11099copy2z7ARbQ(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalVideoListHeight() {
        return this.horizontalVideoListHeight;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalVideoListPeekHeight() {
        return this.horizontalVideoListPeekHeight;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getPlayerBottomLiftHeight() {
        return this.playerBottomLiftHeight;
    }

    /* JADX INFO: renamed from: copy-2z7ARbQ, reason: not valid java name */
    public final VideoDetailLayoutParam m11099copy2z7ARbQ(float horizontalVideoListHeight, float horizontalVideoListPeekHeight, float playerBottomLiftHeight) {
        return new VideoDetailLayoutParam(horizontalVideoListHeight, horizontalVideoListPeekHeight, playerBottomLiftHeight, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoDetailLayoutParam)) {
            return false;
        }
        VideoDetailLayoutParam videoDetailLayoutParam = (VideoDetailLayoutParam) other;
        return Dp.m8708equalsimpl0(this.horizontalVideoListHeight, videoDetailLayoutParam.horizontalVideoListHeight) && Dp.m8708equalsimpl0(this.horizontalVideoListPeekHeight, videoDetailLayoutParam.horizontalVideoListPeekHeight) && Dp.m8708equalsimpl0(this.playerBottomLiftHeight, videoDetailLayoutParam.playerBottomLiftHeight);
    }

    public int hashCode() {
        return (((Dp.m8709hashCodeimpl(this.horizontalVideoListHeight) * 31) + Dp.m8709hashCodeimpl(this.horizontalVideoListPeekHeight)) * 31) + Dp.m8709hashCodeimpl(this.playerBottomLiftHeight);
    }

    public String toString() {
        return "VideoDetailLayoutParam(horizontalVideoListHeight=" + Dp.m8714toStringimpl(this.horizontalVideoListHeight) + ", horizontalVideoListPeekHeight=" + Dp.m8714toStringimpl(this.horizontalVideoListPeekHeight) + ", playerBottomLiftHeight=" + Dp.m8714toStringimpl(this.playerBottomLiftHeight) + ")";
    }

    private VideoDetailLayoutParam(float f, float f2, float f3) {
        this.horizontalVideoListHeight = f;
        this.horizontalVideoListPeekHeight = f2;
        this.playerBottomLiftHeight = f3;
    }

    /* JADX INFO: renamed from: getHorizontalVideoListHeight-D9Ej5fM, reason: not valid java name */
    public final float m11101getHorizontalVideoListHeightD9Ej5fM() {
        return this.horizontalVideoListHeight;
    }

    /* JADX INFO: renamed from: getHorizontalVideoListPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m11102getHorizontalVideoListPeekHeightD9Ej5fM() {
        return this.horizontalVideoListPeekHeight;
    }

    /* JADX INFO: renamed from: getPlayerBottomLiftHeight-D9Ej5fM, reason: not valid java name */
    public final float m11103getPlayerBottomLiftHeightD9Ej5fM() {
        return this.playerBottomLiftHeight;
    }

    /* JADX INFO: renamed from: getCollapsedOffsetDp-D9Ej5fM, reason: not valid java name */
    public final float m11100getCollapsedOffsetDpD9Ej5fM() {
        return Dp.m8703constructorimpl(this.horizontalVideoListHeight - this.horizontalVideoListPeekHeight);
    }

    /* JADX INFO: compiled from: VideoDetailItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDetailLayoutParam$Companion;", "", "<init>", "()V", "reset", "Lcom/medicmedia/medilink/ui/video/detail/VideoDetailLayoutParam;", "getReset", "()Lcom/medicmedia/medilink/ui/video/detail/VideoDetailLayoutParam;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoDetailLayoutParam getReset() {
            return VideoDetailLayoutParam.reset;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        float f = 0;
        reset = new VideoDetailLayoutParam(Dp.m8703constructorimpl(f), Dp.m8703constructorimpl(f), Dp.m8703constructorimpl(f), defaultConstructorMarker);
    }

    public /* synthetic */ VideoDetailLayoutParam(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m8703constructorimpl(realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_QUERY) : f, (i & 2) != 0 ? Dp.m8703constructorimpl(66) : f2, (i & 4) != 0 ? Dp.m8703constructorimpl(40) : f3, null);
    }
}
