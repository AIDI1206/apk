package com.medicmedia.medilink.ui.video;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: VideoTocItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000ej\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoTocLabelType;", "", FirebaseAnalytics.Param.LEVEL, "", "<init>", "(Ljava/lang/String;II)V", "getLevel", "()I", "FIRST", "SECOND", "THIRD", "titlePaddingStart", "Landroidx/compose/ui/unit/Dp;", "getTitlePaddingStart-D9Ej5fM", "()F", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum VideoTocLabelType {
    FIRST(VideoTocLevel.FIRST.getValue()),
    SECOND(VideoTocLevel.SECOND.getValue()),
    THIRD(VideoTocLevel.THIRD.getValue());

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int level;

    /* JADX INFO: compiled from: VideoTocItem.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoTocLabelType.values().length];
            try {
                iArr[VideoTocLabelType.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoTocLabelType.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoTocLabelType.THIRD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<VideoTocLabelType> getEntries() {
        return $ENTRIES;
    }

    VideoTocLabelType(int i) {
        this.level = i;
    }

    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: getTitlePaddingStart-D9Ej5fM, reason: not valid java name */
    public final float m11076getTitlePaddingStartD9Ej5fM() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return Dp.m8703constructorimpl(6);
        }
        if (i == 2) {
            return Dp.m8703constructorimpl(40);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Dp.m8703constructorimpl(60);
    }
}
