package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Process;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ProcessUtils {

    @Nullable
    private static String zza;
    private static int zzb;

    @Nullable
    private static Boolean zzc;

    private ProcessUtils() {
    }

    public static boolean zza() {
        Boolean boolValueOf = zzc;
        if (boolValueOf == null) {
            if (PlatformVersion.isAtLeastP()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objZza = zzj.zza(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (objZza == null) {
                        throw new zzy(zzx.zza("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objZza;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = false;
                }
            }
            zzc = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static String getMyProcessName() {
        if (zza == null) {
            zza = Application.getProcessName();
        }
        return zza;
    }
}
