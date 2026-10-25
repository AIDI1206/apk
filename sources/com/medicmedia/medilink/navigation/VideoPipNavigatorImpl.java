package com.medicmedia.medilink.navigation;

import android.app.Activity;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.OfflineContentsActivity;
import com.medicmedia.medilink.OnlineContentsActivity;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.model.VideoPipDestination;
import com.medicmedia.medilink.ui.extension.ContextExtensionKt;
import com.medicmedia.medilink.ui.navigation.VideoPipNavigator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: VideoPipNavigatorImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/navigation/VideoPipNavigatorImpl;", "Lcom/medicmedia/medilink/ui/navigation/VideoPipNavigator;", "<init>", "()V", "navigate", "", "activity", "Landroid/app/Activity;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoPipNavigatorImpl implements VideoPipNavigator {
    public static final int $stable = 0;

    @Inject
    public VideoPipNavigatorImpl() {
    }

    @Override // com.medicmedia.medilink.ui.navigation.VideoPipNavigator
    public void navigate(Activity activity, VideoPipDestination destination) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof VideoPipDestination.ExternalBrowser) {
            ContextExtensionKt.showExternalBrowser(activity, ((VideoPipDestination.ExternalBrowser) destination).getUrl());
            return;
        }
        if (destination instanceof VideoPipDestination.OnlineContents) {
            Intent intent = new Intent(activity, (Class<?>) OnlineContentsActivity.class);
            VideoPipDestination.OnlineContents onlineContents = (VideoPipDestination.OnlineContents) destination;
            intent.putExtra("contents_id", onlineContents.getContentsId());
            intent.putExtra("url", onlineContents.getUrl());
            activity.startActivity(intent);
            return;
        }
        if (!(destination instanceof VideoPipDestination.OfflineContents)) {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent2 = new Intent(activity, (Class<?>) OfflineContentsActivity.class);
        VideoPipDestination.OfflineContents offlineContents = (VideoPipDestination.OfflineContents) destination;
        intent2.putExtra("contents_id", offlineContents.getContentsId());
        intent2.putExtra("url", offlineContents.getUrl());
        intent2.putExtra(BundleKey.THUMBNAIL, offlineContents.getThumbnail());
        intent2.putExtra("index", offlineContents.getIndex());
        String tagId = offlineContents.getTagId();
        if (tagId != null) {
            if (StringsKt.isBlank(tagId)) {
                tagId = null;
            }
            if (tagId != null) {
                intent2.putExtra(BundleKey.TAG_ID, tagId);
            }
        }
        activity.startActivity(intent2);
    }
}
