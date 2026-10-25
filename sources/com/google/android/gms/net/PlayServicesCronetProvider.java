package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: loaded from: classes4.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            CronetProviderInstaller.installIfNeeded(this.mContext);
            Throwable th = null;
            try {
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) CronetProviderInstaller.zza().getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                builder = null;
                th = e;
            }
            if (th != null) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
            }
            Preconditions.checkNotNull(builder, "The value of the constructed builder should never be null");
            return builder;
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (GooglePlayServicesRepairableException e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return CronetProviderInstaller.PROVIDER_NAME;
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        zzc();
        return CronetProviderInstaller.zzb();
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        zzc();
        return CronetProviderInstaller.isInstalled();
    }

    private final void zzc() {
        try {
            CronetProviderInstaller.installIfNeeded(this.mContext);
        } catch (GooglePlayServicesNotAvailableException unused) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (GooglePlayServicesRepairableException unused2) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }
}
