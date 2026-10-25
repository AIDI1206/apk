package com.medicmedia.medilink.datastore.preferences;

import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.preferences.di.PreferencesName;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QbPreferences.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/datastore/preferences/QBPreferences;", "Lcom/medicmedia/medilink/datastore/preferences/QBDataStore;", "qbPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "setMainQBIndex", "", "index", "", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class QBPreferences implements QBDataStore {
    private final SharedPreferences qbPreferences;

    @Inject
    public QBPreferences(@Named(PreferencesName.QB) SharedPreferences qbPreferences) {
        Intrinsics.checkNotNullParameter(qbPreferences, "qbPreferences");
        this.qbPreferences = qbPreferences;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.QBDataStore
    public void setMainQBIndex(int index) {
        this.qbPreferences.edit().putInt(QBPreferencesKey.MAIN_QB_INDEX, index).apply();
    }
}
