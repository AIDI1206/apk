package com.medicmedia.medilink.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.preferences.di.PreferencesName;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: InfoPreferences.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/datastore/preferences/InfoPreferences;", "Lcom/medicmedia/medilink/datastore/preferences/InfoDataStore;", "context", "Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "telephonyManager", "Landroid/telephony/TelephonyManager;", "networkOperatorName", "", "simCountryIso", "networkCountryIso", "versionName", "infoDate", "", "setInfoDate", "", "value", "getOwnershipNoticeHiddenUntil", "setOwnershipNoticeHiddenUntil", "hiddenUntilMillis", "clearHiddenUntil", "getOwnershipNoticeHiddenUntilByCard", "snoozeId", "setOwnershipNoticeHiddenUntilByCard", "cardHiddenUntilKey", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class InfoPreferences implements InfoDataStore {
    private final Context context;
    private final SharedPreferences preferences;
    private final TelephonyManager telephonyManager;

    @Inject
    public InfoPreferences(@ApplicationContext Context context, @Named(PreferencesName.LOGIN) SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.context = context;
        this.preferences = preferences;
        Object systemService = context.getSystemService("phone");
        this.telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public String networkOperatorName() {
        TelephonyManager telephonyManager = this.telephonyManager;
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public String simCountryIso() {
        TelephonyManager telephonyManager = this.telephonyManager;
        if (telephonyManager != null) {
            return telephonyManager.getSimCountryIso();
        }
        return null;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public String networkCountryIso() {
        TelephonyManager telephonyManager = this.telephonyManager;
        if (telephonyManager != null) {
            return telephonyManager.getNetworkCountryIso();
        }
        return null;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public String versionName() {
        try {
            String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public long infoDate() {
        return this.preferences.getLong(InfoPreferencesKey.INFO_DATE, 0L);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public void setInfoDate(long value) {
        this.preferences.edit().putLong(InfoPreferencesKey.INFO_DATE, value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public long getOwnershipNoticeHiddenUntil() {
        return this.preferences.getLong(InfoPreferencesKey.OWNERSHIP_NOTICE_DISMISSED_AT, 0L);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public void setOwnershipNoticeHiddenUntil(long hiddenUntilMillis) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putLong(InfoPreferencesKey.OWNERSHIP_NOTICE_DISMISSED_AT, hiddenUntilMillis);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public void clearHiddenUntil() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.remove(InfoPreferencesKey.OWNERSHIP_NOTICE_DISMISSED_AT);
        Set<String> setKeySet = this.preferences.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            Intrinsics.checkNotNull(str);
            if (StringsKt.startsWith$default(str, "ownership_notice_dismissed_at_", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public long getOwnershipNoticeHiddenUntilByCard(String snoozeId) {
        Intrinsics.checkNotNullParameter(snoozeId, "snoozeId");
        return this.preferences.getLong(cardHiddenUntilKey(snoozeId), 0L);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.InfoDataStore
    public void setOwnershipNoticeHiddenUntilByCard(String snoozeId, long hiddenUntilMillis) {
        Intrinsics.checkNotNullParameter(snoozeId, "snoozeId");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putLong(cardHiddenUntilKey(snoozeId), hiddenUntilMillis);
        editorEdit.apply();
    }

    private final String cardHiddenUntilKey(String snoozeId) {
        return "ownership_notice_dismissed_at_" + snoozeId;
    }
}
