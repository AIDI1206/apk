package com.medicmedia.medilink.analytics;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.deeplink.DeepLinkResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppsFlyerTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"convertToException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/appsflyer/deeplink/DeepLinkResult$Error;", "context", "Landroid/content/Context;", "analytics_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AppsFlyerTrackerKt {

    /* JADX INFO: compiled from: AppsFlyerTracker.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeepLinkResult.Error.values().length];
            try {
                iArr[DeepLinkResult.Error.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Error.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkResult.Error.HTTP_STATUS_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Exception convertToException(DeepLinkResult.Error error, Context context) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
        if (i2 == 1) {
            i = R.string.appsflyer_error_timeout;
        } else if (i2 == 2 || i2 == 3) {
            i = R.string.appsflyer_error_network;
        } else {
            i = R.string.appsflyer_error_unknown;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new Exception(string);
    }
}
