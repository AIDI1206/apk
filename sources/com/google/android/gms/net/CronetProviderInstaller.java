package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes4.dex */
public class CronetProviderInstaller {
    public static final String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final String TAG = "CronetProviderInstaller";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object lock = new Object();
    private static DynamiteModule zzb = null;
    private static String zzc = "0";

    @Deprecated
    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        synchronized (lock) {
            if (isInstalled()) {
                return;
            }
            Preconditions.checkNotNull(context, "Context must not be null");
            try {
                CronetProviderInstaller.class.getClassLoader().loadClass("org.chromium.net.CronetEngine");
                int apiLevel = ApiVersion.getApiLevel();
                GoogleApiAvailabilityLight googleApiAvailabilityLight = zza;
                googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                try {
                    DynamiteModule dynamiteModuleLoad = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> clsLoadClass = dynamiteModuleLoad.getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (clsLoadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                            Log.e(TAG, "ImplVersion class is missing from Cronet module.");
                            throw new GooglePlayServicesNotAvailableException(8);
                        }
                        Method method = clsLoadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = clsLoadClass.getMethod("getCronetVersion", new Class[0]);
                        int iIntValue = ((Integer) method.invoke(null, new Object[0])).intValue();
                        zzc = (String) method2.invoke(null, new Object[0]);
                        if (apiLevel <= iIntValue) {
                            zzb = dynamiteModuleLoad;
                        } else {
                            Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr");
                            String str = zzc;
                            throw new GooglePlayServicesRepairableException(2, new StringBuilder(String.valueOf(str).length() + 174).append("Google Play Services update is required. The API Level of the client is ").append(apiLevel).append(". The API Level of the implementation is ").append(iIntValue).append(". The Cronet implementation version is ").append(str).toString(), errorResolutionIntent);
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Unable to read Cronet version from the Cronet module ", e);
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e));
                    }
                } catch (DynamiteModule.LoadingException e2) {
                    Log.e(TAG, "Unable to load Cronet module", e2);
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e2));
                }
            } catch (ClassNotFoundException e3) {
                Log.e(TAG, "Cronet API is not available. Have you included all required dependencies?");
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e3));
            }
        }
    }

    public static Task<Void> installProvider(final Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (isInstalled()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new Runnable(context, taskCompletionSource) { // from class: com.google.android.gms.net.zza
            private final Context zzd;
            private final TaskCompletionSource zze;

            {
                this.zzd = context;
                this.zze = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CronetProviderInstaller.zza(this.zzd, this.zze);
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    public static boolean isInstalled() {
        return zza() != null;
    }

    static DynamiteModule zza() {
        DynamiteModule dynamiteModule;
        synchronized (lock) {
            dynamiteModule = zzb;
        }
        return dynamiteModule;
    }

    static String zzb() {
        String str;
        synchronized (lock) {
            str = zzc;
        }
        return str;
    }

    private CronetProviderInstaller() {
    }

    static final /* synthetic */ void zza(Context context, TaskCompletionSource taskCompletionSource) {
        try {
            installIfNeeded(context);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }
}
