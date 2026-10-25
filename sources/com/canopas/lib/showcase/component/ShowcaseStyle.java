package com.canopas.lib.showcase.component;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ShowcaseContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B&\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lcom/canopas/lib/showcase/component/ShowcaseStyle;", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "backgroundAlpha", "", "targetCircleColor", "(JFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundAlpha", "()F", "getBackgroundColor-0d7_KjU", "()J", "J", "getTargetCircleColor-0d7_KjU", "copy", "copy-1VYSb5o", "(JFJ)Lcom/canopas/lib/showcase/component/ShowcaseStyle;", "Companion", "showcase_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ShowcaseStyle {
    public static final int $stable = 0;
    private static final float DEFAULT_BACKGROUND_RADIUS = 0.9f;
    private final float backgroundAlpha;
    private final long backgroundColor;
    private final long targetCircleColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ShowcaseStyle Default = new ShowcaseStyle(0, 0.0f, 0, 7, null);

    public /* synthetic */ ShowcaseStyle(long j, float f, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, j2);
    }

    private ShowcaseStyle(long j, float f, long j2) {
        this.backgroundColor = j;
        this.backgroundAlpha = f;
        this.targetCircleColor = j2;
    }

    public /* synthetic */ ShowcaseStyle(long j, float f, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.INSTANCE.m5985getBlack0d7_KjU() : j, (i & 2) != 0 ? DEFAULT_BACKGROUND_RADIUS : f, (i & 4) != 0 ? Color.INSTANCE.m5996getWhite0d7_KjU() : j2, null);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    public final float getBackgroundAlpha() {
        return this.backgroundAlpha;
    }

    /* JADX INFO: renamed from: getTargetCircleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTargetCircleColor() {
        return this.targetCircleColor;
    }

    /* JADX INFO: renamed from: copy-1VYSb5o$default, reason: not valid java name */
    public static /* synthetic */ ShowcaseStyle m9385copy1VYSb5o$default(ShowcaseStyle showcaseStyle, long j, float f, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = showcaseStyle.backgroundColor;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            f = showcaseStyle.backgroundAlpha;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = showcaseStyle.targetCircleColor;
        }
        return showcaseStyle.m9386copy1VYSb5o(j3, f2, j2);
    }

    /* JADX INFO: renamed from: copy-1VYSb5o, reason: not valid java name */
    public final ShowcaseStyle m9386copy1VYSb5o(long backgroundColor, float backgroundAlpha, long targetCircleColor) {
        return new ShowcaseStyle(backgroundColor, backgroundAlpha, targetCircleColor, null);
    }

    /* JADX INFO: compiled from: ShowcaseContent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/canopas/lib/showcase/component/ShowcaseStyle$Companion;", "", "()V", "DEFAULT_BACKGROUND_RADIUS", "", "Default", "Lcom/canopas/lib/showcase/component/ShowcaseStyle;", "getDefault$annotations", "getDefault", "()Lcom/canopas/lib/showcase/component/ShowcaseStyle;", "showcase_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        private Companion() {
        }

        public final ShowcaseStyle getDefault() {
            return ShowcaseStyle.Default;
        }
    }
}
