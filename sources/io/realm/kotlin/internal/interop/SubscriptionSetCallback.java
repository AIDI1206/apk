package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.realm.kotlin.internal.interop.sync.CoreSubscriptionSetState;
import kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/realm/kotlin/internal/interop/SubscriptionSetCallback;", "", "onChange", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/realm/kotlin/internal/interop/sync/CoreSubscriptionSetState;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SubscriptionSetCallback {
    void onChange(CoreSubscriptionSetState state);
}
