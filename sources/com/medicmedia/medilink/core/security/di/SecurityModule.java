package com.medicmedia.medilink.core.security.di;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.security.device.ThreatDetectionHelper;
import com.medicmedia.medilink.core.security.device.ThreatDetectionHelperImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SecurityModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/core/security/di/SecurityModule;", "", "<init>", "()V", "provideThreatDetectionHelper", "Lcom/medicmedia/medilink/core/security/device/ThreatDetectionHelper;", "context", "Landroid/content/Context;", "security_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class SecurityModule {
    public static final SecurityModule INSTANCE = new SecurityModule();

    private SecurityModule() {
    }

    @Provides
    @Singleton
    public final ThreatDetectionHelper provideThreatDetectionHelper(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ThreatDetectionHelperImpl(context);
    }
}
