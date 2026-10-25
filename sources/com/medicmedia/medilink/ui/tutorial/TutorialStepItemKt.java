package com.medicmedia.medilink.ui.tutorial;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.canopas.lib.showcase.component.ShowcaseStyle;
import com.medicmedia.medilink.domain.model.TutorialStep;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TutorialStepItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"showcaseStyle", "Lcom/canopas/lib/showcase/component/ShowcaseStyle;", "Lcom/medicmedia/medilink/domain/model/TutorialStep;", "textId", "", "(Lcom/medicmedia/medilink/domain/model/TutorialStep;)Ljava/lang/Integer;", "secondaryId", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TutorialStepItemKt {

    /* JADX INFO: compiled from: TutorialStepItem.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TutorialStep.values().length];
            try {
                iArr[TutorialStep.STEP1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TutorialStep.STEP2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TutorialStep.STEP3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TutorialStep.STEP4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TutorialStep.STEP5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TutorialStep.STEP6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TutorialStep.STEP7.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TutorialStep.COMPLETE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ShowcaseStyle showcaseStyle(TutorialStep tutorialStep) {
        Intrinsics.checkNotNullParameter(tutorialStep, "<this>");
        return ShowcaseStyle.INSTANCE.getDefault().m9386copy1VYSb5o(ColorKt.getTutorialStepBg(), 0.97f, Color.INSTANCE.m5996getWhite0d7_KjU());
    }

    public static final Integer textId(TutorialStep tutorialStep) {
        Intrinsics.checkNotNullParameter(tutorialStep, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[tutorialStep.ordinal()]) {
            case 1:
                return Integer.valueOf(R.string.tutorial_step1_text);
            case 2:
                return Integer.valueOf(R.string.tutorial_step2_text);
            case 3:
                return Integer.valueOf(R.string.tutorial_step3_text);
            case 4:
                return Integer.valueOf(R.string.tutorial_step4_text);
            case 5:
                return Integer.valueOf(R.string.tutorial_step5_text);
            case 6:
                return Integer.valueOf(R.string.tutorial_step6_text);
            case 7:
                return Integer.valueOf(R.string.tutorial_step7_text);
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Integer secondaryId(TutorialStep tutorialStep) {
        Intrinsics.checkNotNullParameter(tutorialStep, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[tutorialStep.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.string.tutorial_step1_secondary_text);
        }
        if (i == 2) {
            return Integer.valueOf(R.string.tutorial_step2_secondary_text);
        }
        if (i == 3) {
            return Integer.valueOf(R.string.tutorial_step3_secondary_text);
        }
        if (i != 4) {
            return null;
        }
        return Integer.valueOf(R.string.tutorial_step4_secondary_text);
    }
}
