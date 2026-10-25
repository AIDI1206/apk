package com.medicmedia.medilink.datastore.preferences.di;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.LogKey;
import kotlin.Metadata;

/* JADX INFO: compiled from: PreferencesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/datastore/preferences/di/PreferencesName;", "", "<init>", "()V", "FIREBASE", "", LogKey.LOGIN, "VIDEO", HistoryRepositoryImpl.TITLE_QB, "INFO", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PreferencesName {
    public static final String FIREBASE = "pref_firebase";
    public static final String INFO = "info";
    public static final PreferencesName INSTANCE = new PreferencesName();
    public static final String LOGIN = "pref_login";
    public static final String QB = "pref_qb";
    public static final String VIDEO = "movie_data";

    private PreferencesName() {
    }
}
