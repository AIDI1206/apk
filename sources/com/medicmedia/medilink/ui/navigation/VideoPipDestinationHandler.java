package com.medicmedia.medilink.ui.navigation;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.VideoPipDestination;
import com.medicmedia.medilink.domain.redux.store.VideoPipStateStore;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPipDestinationHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/VideoPipDestinationHandler;", "", "videoPipStateStore", "Lcom/medicmedia/medilink/domain/redux/store/VideoPipStateStore;", "navigator", "Lcom/medicmedia/medilink/ui/navigation/VideoPipNavigator;", "<init>", "(Lcom/medicmedia/medilink/domain/redux/store/VideoPipStateStore;Lcom/medicmedia/medilink/ui/navigation/VideoPipNavigator;)V", "consumeAndNavigate", "", "activity", "Landroid/app/Activity;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoPipDestinationHandler {
    public static final int $stable = 8;
    private final VideoPipNavigator navigator;
    private final VideoPipStateStore videoPipStateStore;

    @Inject
    public VideoPipDestinationHandler(VideoPipStateStore videoPipStateStore, VideoPipNavigator navigator) {
        Intrinsics.checkNotNullParameter(videoPipStateStore, "videoPipStateStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.videoPipStateStore = videoPipStateStore;
        this.navigator = navigator;
    }

    public final boolean consumeAndNavigate(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        VideoPipDestination videoPipDestinationConsumeDestination = this.videoPipStateStore.consumeDestination();
        if (videoPipDestinationConsumeDestination == null) {
            return false;
        }
        this.navigator.navigate(activity, videoPipDestinationConsumeDestination);
        return true;
    }
}
