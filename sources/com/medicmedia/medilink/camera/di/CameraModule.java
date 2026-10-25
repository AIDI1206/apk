package com.medicmedia.medilink.camera.di;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.camera.CameraClient;
import com.medicmedia.medilink.camera.CameraXClient;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CameraModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/camera/di/CameraModule;", "", "<init>", "()V", "provideCameraClient", "Lcom/medicmedia/medilink/camera/CameraClient;", "context", "Landroid/content/Context;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class CameraModule {
    public static final CameraModule INSTANCE = new CameraModule();

    private CameraModule() {
    }

    @Provides
    @Singleton
    public final CameraClient provideCameraClient(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CameraXClient(context);
    }
}
