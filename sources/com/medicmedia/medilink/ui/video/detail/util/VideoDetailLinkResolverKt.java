package com.medicmedia.medilink.ui.video.detail.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toMessageRes", "", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceError;", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoDetailLinkResolverKt {

    /* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoOfflineReferenceError.values().length];
            try {
                iArr[VideoOfflineReferenceError.NotPurchasedOrNotDownloaded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOfflineReferenceError.NotDownloaded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toMessageRes(VideoOfflineReferenceError videoOfflineReferenceError) {
        Intrinsics.checkNotNullParameter(videoOfflineReferenceError, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[videoOfflineReferenceError.ordinal()];
        if (i == 1) {
            return R.string.not_purchase_or_not_download_message;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return R.string.not_download_message;
    }
}
