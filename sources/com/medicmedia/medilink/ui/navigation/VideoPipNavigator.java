package com.medicmedia.medilink.ui.navigation;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.VideoPipDestination;
import kotlin.Metadata;

/* JADX INFO: compiled from: VideoPipNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/VideoPipNavigator;", "", "navigate", "", "activity", "Landroid/app/Activity;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoPipNavigator {
    void navigate(Activity activity, VideoPipDestination destination);
}
