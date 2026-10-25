package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.zeroturnaround.zip.commons.FilenameUtils;

/* JADX INFO: compiled from: MultiParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"times", "Landroidx/compose/ui/unit/TextUnit;", "other", "times-NB67dxo", "(JJ)J", "DefaultFontSize", "J", "foundation_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m2009timesNB67dxo(long j, long j2) {
        if (TextUnit.m8899isEmimpl(j2)) {
            if (TextUnit.m8899isEmimpl(j)) {
                throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m8904toStringimpl(j2)) + "). Please declare the style.fontSize with Sp units instead.");
            }
            if (TextUnit.m8895getRawTypeimpl(j) == 0) {
                long j3 = DefaultFontSize;
                float fM8897getValueimpl = TextUnit.m8897getValueimpl(j2);
                TextUnitKt.m8910checkArithmeticR2X_6o(j3);
                return TextUnitKt.pack(TextUnit.m8895getRawTypeimpl(j3), TextUnit.m8897getValueimpl(j3) * fM8897getValueimpl);
            }
            float fM8897getValueimpl2 = TextUnit.m8897getValueimpl(j2);
            TextUnitKt.m8910checkArithmeticR2X_6o(j);
            return TextUnitKt.pack(TextUnit.m8895getRawTypeimpl(j), TextUnit.m8897getValueimpl(j) * fM8897getValueimpl2);
        }
        throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m8904toStringimpl(j2)) + FilenameUtils.EXTENSION_SEPARATOR);
    }
}
