package com.appsflyer.internal;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFb1bSDK;", "", "", "getCurrencyIso4217Code", "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;", "p1", "", "AFAdRevenueData", "(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V", "()V", "AFa1vSDK", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AFb1bSDK {

    /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AFAdRevenueData;

    public interface AFa1zSDK {
        void getCurrencyIso4217Code();

        void getRevenue(AFh1qSDK aFh1qSDK);
    }

    void AFAdRevenueData();

    void AFAdRevenueData(Context p0, AFa1zSDK p1);

    boolean getCurrencyIso4217Code();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1bSDK$AFa1vSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AFAdRevenueData = new Companion();
        private static long getRevenue = 500;

        private Companion() {
        }

        public static long getRevenue() {
            return getRevenue;
        }
    }
}
