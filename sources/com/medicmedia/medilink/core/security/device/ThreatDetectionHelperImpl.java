package com.medicmedia.medilink.core.security.device;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.aheaditec.talsec_security.security.api.Talsec;
import com.aheaditec.talsec_security.security.api.TalsecConfig;
import com.aheaditec.talsec_security.security.api.ThreatListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.medicmedia.medilink.core.security.BuildConfig;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThreatDetectionHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0002\r\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/core/security/device/ThreatDetectionHelperImpl;", "Lcom/medicmedia/medilink/core/security/device/ThreatDetectionHelper;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "threatDetected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "monitoringStarted", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/Runnable;", "threatListener", "com/medicmedia/medilink/core/security/device/ThreatDetectionHelperImpl$threatListener$1", "Lcom/medicmedia/medilink/core/security/device/ThreatDetectionHelperImpl$threatListener$1;", "deviceState", "com/medicmedia/medilink/core/security/device/ThreatDetectionHelperImpl$deviceState$1", "Lcom/medicmedia/medilink/core/security/device/ThreatDetectionHelperImpl$deviceState$1;", "notifyDetected", "", "startMonitoring", "isThreatDetected", "", "addThreatDetectedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "security_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ThreatDetectionHelperImpl implements ThreatDetectionHelper {
    private final Context context;
    private final ThreatDetectionHelperImpl$deviceState$1 deviceState;
    private final CopyOnWriteArrayList<Runnable> listeners;
    private final AtomicBoolean monitoringStarted;
    private final AtomicBoolean threatDetected;
    private final ThreatDetectionHelperImpl$threatListener$1 threatListener;

    /* JADX WARN: Type inference failed for: r2v4, types: [com.medicmedia.medilink.core.security.device.ThreatDetectionHelperImpl$threatListener$1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.medicmedia.medilink.core.security.device.ThreatDetectionHelperImpl$deviceState$1] */
    @Inject
    public ThreatDetectionHelperImpl(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.threatDetected = new AtomicBoolean(false);
        this.monitoringStarted = new AtomicBoolean(false);
        this.listeners = new CopyOnWriteArrayList<>();
        this.threatListener = new ThreatListener.ThreatDetected() { // from class: com.medicmedia.medilink.core.security.device.ThreatDetectionHelperImpl$threatListener$1
            @Override // com.aheaditec.talsec_security.security.api.ThreatListener.ThreatDetected
            public void onRootDetected() {
                this.this$0.notifyDetected();
            }

            @Override // com.aheaditec.talsec_security.security.api.ThreatListener.ThreatDetected
            public void onEmulatorDetected() {
                this.this$0.notifyDetected();
            }
        };
        this.deviceState = new ThreatListener.DeviceState() { // from class: com.medicmedia.medilink.core.security.device.ThreatDetectionHelperImpl$deviceState$1
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyDetected() {
        this.threatDetected.set(true);
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // com.medicmedia.medilink.core.security.device.ThreatDetectionHelper
    public void startMonitoring() {
        if (this.monitoringStarted.compareAndSet(false, true)) {
            TalsecConfig talsecConfigBuild = new TalsecConfig.Builder(this.context.getPackageName(), new String[]{BuildConfig.RELEASE_SIGNING_CERTIFICATE_HASH_BASE64}).prod(true).killOnBypass(false).build();
            Intrinsics.checkNotNullExpressionValue(talsecConfigBuild, "build(...)");
            new ThreatListener(this.threatListener, this.deviceState).registerListener(this.context);
            Talsec.start(this.context, talsecConfigBuild);
        }
    }

    @Override // com.medicmedia.medilink.core.security.device.ThreatDetectionHelper
    public boolean isThreatDetected() {
        return this.threatDetected.get();
    }

    @Override // com.medicmedia.medilink.core.security.device.ThreatDetectionHelper
    public void addThreatDetectedListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
        if (this.threatDetected.get()) {
            listener.run();
        }
    }
}
