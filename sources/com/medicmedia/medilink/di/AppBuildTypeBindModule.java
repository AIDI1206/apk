package com.medicmedia.medilink.di;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.build.AppBuildTypeBehavior;
import com.medicmedia.medilink.build.AppBuildTypeBehaviorImpl;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppBuildTypeBindModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/di/AppBuildTypeBindModule;", "", "<init>", "()V", "provideAppBuildTypeBehavior", "Lcom/medicmedia/medilink/build/AppBuildTypeBehavior;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class AppBuildTypeBindModule {
    public static final int $stable = 0;
    public static final AppBuildTypeBindModule INSTANCE = new AppBuildTypeBindModule();

    private AppBuildTypeBindModule() {
    }

    @Provides
    public final AppBuildTypeBehavior provideAppBuildTypeBehavior() {
        return new AppBuildTypeBehaviorImpl();
    }
}
