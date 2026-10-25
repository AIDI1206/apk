package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlayerConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFloat", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "core_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PlayerConstantsKt {

    /* JADX INFO: compiled from: PlayerConstants.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerConstants.PlaybackRate.values().length];
            try {
                iArr[PlayerConstants.PlaybackRate.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerConstants.PlaybackRate.RATE_0_25.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerConstants.PlaybackRate.RATE_0_5.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerConstants.PlaybackRate.RATE_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerConstants.PlaybackRate.RATE_1_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlayerConstants.PlaybackRate.RATE_2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float toFloat(PlayerConstants.PlaybackRate playbackRate) {
        Intrinsics.checkNotNullParameter(playbackRate, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[playbackRate.ordinal()]) {
            case 1:
                return 1.0f;
            case 2:
                return 0.25f;
            case 3:
                return 0.5f;
            case 4:
                return 1.0f;
            case 5:
                return 1.5f;
            case 6:
                return 2.0f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
