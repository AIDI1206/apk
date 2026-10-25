package com.medicmedia.medilink.ui.extension;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComposeExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001¨\u0006\u0006"}, d2 = {"toHexRgb", "", "Landroidx/compose/ui/graphics/Color;", "toHexRgb-8_81llA", "(J)Ljava/lang/String;", "parseColor", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ComposeExtensionKt {
    /* JADX INFO: renamed from: toHexRgb-8_81llA, reason: not valid java name */
    public static final String m10794toHexRgb8_81llA(long j) {
        String str = String.format("%06X", Arrays.copyOf(new Object[]{Integer.valueOf(ColorKt.m6013toArgb8_81llA(j) & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final Color parseColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Color.m5949boximpl(ColorKt.Color(android.graphics.Color.parseColor(str)));
        } catch (Exception unused) {
            return null;
        }
    }
}
