package com.facebook.stetho.common.android;

import android.content.res.Resources;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.facebook.stetho.common.LogUtil;
import com.medicmedia.medilink.MLConst;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ResourcesUtil {
    private static int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }

    private ResourcesUtil() {
    }

    @Nonnull
    public static String getIdStringQuietly(Object obj, @Nullable Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i);
            LogUtil.w("Unknown identifier encountered on " + obj + ": " + fallbackIdString);
            return fallbackIdString;
        }
    }

    public static String getIdString(@Nullable Resources resources, int i) throws Resources.NotFoundException {
        String resourcePackageName;
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        if (getResourcePackageId(i) == 127) {
            resourcePackageName = "";
            str = "";
        } else {
            resourcePackageName = resources.getResourcePackageName(i);
            str = ":";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(resourcePackageName.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(resourcePackageName);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append(DomExceptionUtils.SEPARATOR);
        sb.append(resourceEntryName);
        return sb.toString();
    }

    private static String getFallbackIdString(int i) {
        return MLConst.MLCommon.SHARP + Integer.toHexString(i);
    }
}
