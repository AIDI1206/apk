package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: ApiInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0000\u0010\u0002\"\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"isProductionServer", "", "()Z", "isStagingServer", "network_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ApiInfoKt {
    private static final boolean isProductionServer = true;
    private static final boolean isStagingServer = false;

    public static final boolean isProductionServer() {
        return isProductionServer;
    }

    public static final boolean isStagingServer() {
        return isStagingServer;
    }
}
