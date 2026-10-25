package coil3.network.okhttp;

import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.PlatformContext;
import coil3.network.ConnectivityChecker;
import coil3.network.ConnectivityCheckerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: OkHttpNetworkFetcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 extends FunctionReferenceImpl implements Function1<PlatformContext, ConnectivityChecker> {
    public static final OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 INSTANCE = new OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9();

    OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9() {
        super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Lcoil3/PlatformContext;)Lcoil3/network/ConnectivityChecker;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConnectivityChecker invoke(PlatformContext platformContext) {
        return ConnectivityCheckerKt.ConnectivityChecker(platformContext);
    }
}
