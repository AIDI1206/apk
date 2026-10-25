package com.medicmedia.medilink.ui.theme;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/theme/ContentsColorFilter;", "", "<init>", "()V", "yellow", "Landroidx/compose/ui/graphics/Color;", "getYellow-0d7_KjU", "()J", "J", "green", "getGreen-0d7_KjU", "red", "getRed-0d7_KjU", "blue", "getBlue-0d7_KjU", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsColorFilter {
    public static final int $stable = 0;
    public static final ContentsColorFilter INSTANCE = new ContentsColorFilter();
    private static final long yellow = androidx.compose.ui.graphics.ColorKt.Color(4294967040L);
    private static final long green = androidx.compose.ui.graphics.ColorKt.Color(4286578432L);
    private static final long red = androidx.compose.ui.graphics.ColorKt.Color(4294901760L);
    private static final long blue = androidx.compose.ui.graphics.ColorKt.Color(4278239231L);

    private ContentsColorFilter() {
    }

    /* JADX INFO: renamed from: getYellow-0d7_KjU, reason: not valid java name */
    public final long m11012getYellow0d7_KjU() {
        return yellow;
    }

    /* JADX INFO: renamed from: getGreen-0d7_KjU, reason: not valid java name */
    public final long m11010getGreen0d7_KjU() {
        return green;
    }

    /* JADX INFO: renamed from: getRed-0d7_KjU, reason: not valid java name */
    public final long m11011getRed0d7_KjU() {
        return red;
    }

    /* JADX INFO: renamed from: getBlue-0d7_KjU, reason: not valid java name */
    public final long m11009getBlue0d7_KjU() {
        return blue;
    }

    public final Set<Color> entries() {
        return SetsKt.setOf((Object[]) new Color[]{Color.m5949boximpl(yellow), Color.m5949boximpl(green), Color.m5949boximpl(red), Color.m5949boximpl(blue)});
    }
}
