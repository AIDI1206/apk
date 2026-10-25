package com.google.android.exoplayer2.ext.cronet;

import android.content.Context;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class CronetEngineWrapper {
    public static final int SOURCE_GMS = 1;
    public static final int SOURCE_NATIVE = 0;
    public static final int SOURCE_UNAVAILABLE = 4;
    public static final int SOURCE_UNKNOWN = 2;
    public static final int SOURCE_USER_PROVIDED = 3;
    private static final String TAG = "CronetEngineWrapper";
    private final CronetEngine cronetEngine;
    private final int cronetEngineSource;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CronetEngineSource {
    }

    public CronetEngineWrapper(Context context) {
        this(context, null, false);
    }

    public CronetEngineWrapper(Context context, String str, boolean z) {
        ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((CronetProvider) arrayList.get(size)).isEnabled() || CronetProvider.PROVIDER_NAME_FALLBACK.equals(((CronetProvider) arrayList.get(size)).getName())) {
                arrayList.remove(size);
            }
        }
        CronetProviderComparator cronetProviderComparator = new CronetProviderComparator(z);
        Collections.sort(arrayList, cronetProviderComparator);
        CronetEngine cronetEngineBuild = null;
        int i = 4;
        for (int i2 = 0; i2 < arrayList.size() && cronetEngineBuild == null; i2++) {
            String name = ((CronetProvider) arrayList.get(i2)).getName();
            try {
                CronetEngine.Builder builderCreateBuilder = ((CronetProvider) arrayList.get(i2)).createBuilder();
                if (str != null) {
                    builderCreateBuilder.setUserAgent(str);
                }
                cronetEngineBuild = builderCreateBuilder.build();
                if (cronetProviderComparator.isNativeProvider(name)) {
                    i = 0;
                } else {
                    i = cronetProviderComparator.isGMSCoreProvider(name) ? 1 : 2;
                }
                Log.d(TAG, "CronetEngine built using " + name);
            } catch (SecurityException unused) {
                Log.w(TAG, "Failed to build CronetEngine. Please check if current process has android.permission.ACCESS_NETWORK_STATE.");
            } catch (UnsatisfiedLinkError unused2) {
                Log.w(TAG, "Failed to link Cronet binaries. Please check if native Cronet binaries are bundled into your app.");
            }
        }
        if (cronetEngineBuild == null) {
            Log.w(TAG, "Cronet not available. Using fallback provider.");
        }
        this.cronetEngine = cronetEngineBuild;
        this.cronetEngineSource = i;
    }

    public CronetEngineWrapper(CronetEngine cronetEngine) {
        this.cronetEngine = cronetEngine;
        this.cronetEngineSource = 3;
    }

    public int getCronetEngineSource() {
        return this.cronetEngineSource;
    }

    CronetEngine getCronetEngine() {
        return this.cronetEngine;
    }

    private static class CronetProviderComparator implements Comparator<CronetProvider> {
        private final String gmsCoreCronetName;
        private final boolean preferGMSCoreCronet;

        public CronetProviderComparator(boolean z) {
            String str = null;
            try {
                str = (String) Class.forName("com.google.android.gms.net.CronetProviderInstaller").getDeclaredField("PROVIDER_NAME").get(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            }
            this.gmsCoreCronetName = str;
            this.preferGMSCoreCronet = z;
        }

        @Override // java.util.Comparator
        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
            int iEvaluateCronetProviderType = evaluateCronetProviderType(cronetProvider.getName());
            int iEvaluateCronetProviderType2 = evaluateCronetProviderType(cronetProvider2.getName());
            return iEvaluateCronetProviderType != iEvaluateCronetProviderType2 ? iEvaluateCronetProviderType - iEvaluateCronetProviderType2 : -compareVersionStrings(cronetProvider.getVersion(), cronetProvider2.getVersion());
        }

        public boolean isNativeProvider(String str) {
            return CronetProvider.PROVIDER_NAME_APP_PACKAGED.equals(str);
        }

        public boolean isGMSCoreProvider(String str) {
            String str2 = this.gmsCoreCronetName;
            return str2 != null && str2.equals(str);
        }

        private int evaluateCronetProviderType(String str) {
            if (isNativeProvider(str)) {
                return 1;
            }
            if (isGMSCoreProvider(str)) {
                return this.preferGMSCoreCronet ? 0 : 2;
            }
            return -1;
        }

        private static int compareVersionStrings(String str, String str2) {
            if (str != null && str2 != null) {
                String[] strArrSplit = Util.split(str, "\\.");
                String[] strArrSplit2 = Util.split(str2, "\\.");
                int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
                for (int i = 0; i < iMin; i++) {
                    if (!strArrSplit[i].equals(strArrSplit2[i])) {
                        try {
                            return Integer.parseInt(strArrSplit[i]) - Integer.parseInt(strArrSplit2[i]);
                        } catch (NumberFormatException unused) {
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }
    }
}
