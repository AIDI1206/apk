package com.medicmedia.medilink.core.network.connect;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: NetworkHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/core/network/connect/NetworkHelperImpl;", "Lcom/medicmedia/medilink/core/network/connect/NetworkHelper;", "context", "Landroid/content/Context;", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "isNetworkConnected", "", "_isOnline", "Lkotlinx/coroutines/flow/StateFlow;", "isOnline", "()Lkotlinx/coroutines/flow/StateFlow;", "isCellular", "()Z", "checkConnection", "getConnectionType", "Lcom/medicmedia/medilink/core/network/connect/ConnectionType;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class NetworkHelperImpl implements NetworkHelper {
    private final StateFlow<Boolean> _isOnline;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final StateFlow<Boolean> isOnline;

    @Inject
    public NetworkHelperImpl(@ApplicationContext Context context, CoroutineScope appScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.context = context;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        StateFlow<Boolean> stateFlowStateIn = FlowKt.stateIn(FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.callbackFlow(new NetworkHelperImpl$_isOnline$1(this, null)))), appScope, SharingStarted.INSTANCE.getEagerly(), Boolean.valueOf(checkConnection()));
        this._isOnline = stateFlowStateIn;
        this.isOnline = stateFlowStateIn;
    }

    @Override // com.medicmedia.medilink.core.network.connect.NetworkHelper
    public boolean isNetworkConnected() {
        return checkConnection();
    }

    @Override // com.medicmedia.medilink.core.network.connect.NetworkHelper
    public StateFlow<Boolean> isOnline() {
        return this.isOnline;
    }

    @Override // com.medicmedia.medilink.core.network.connect.NetworkHelper
    public boolean isCellular() {
        return getConnectionType() == ConnectionType.CELLULAR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkConnection() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    private final ConnectionType getConnectionType() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            if (networkCapabilities.hasTransport(1)) {
                return ConnectionType.WIFI;
            }
            if (networkCapabilities.hasTransport(0)) {
                return ConnectionType.CELLULAR;
            }
            return networkCapabilities.hasTransport(3) ? ConnectionType.ETHERNET : ConnectionType.NONE;
        }
        return ConnectionType.NONE;
    }
}
