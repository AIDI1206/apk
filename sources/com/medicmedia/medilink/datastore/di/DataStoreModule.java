package com.medicmedia.medilink.datastore.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.medicmedia.medilink.datastore.firebase.FirebaseDataStore;
import com.medicmedia.medilink.datastore.firebase.FirebasePreferences;
import com.medicmedia.medilink.datastore.model.CryptoClient;
import com.medicmedia.medilink.datastore.model.KeystoreAesGcmCryptoClient;
import com.medicmedia.medilink.datastore.preferences.InfoDataStore;
import com.medicmedia.medilink.datastore.preferences.InfoPreferences;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import com.medicmedia.medilink.datastore.preferences.LoginPreferences;
import com.medicmedia.medilink.datastore.preferences.QBDataStore;
import com.medicmedia.medilink.datastore.preferences.QBPreferences;
import com.medicmedia.medilink.datastore.preferences.VideoDataStore;
import com.medicmedia.medilink.datastore.preferences.VideoPreferences;
import com.medicmedia.medilink.datastore.preferences.di.PreferencesName;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataStoreModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/datastore/di/DataStoreModule;", "", "<init>", "()V", "firebasePreference", "Lcom/medicmedia/medilink/datastore/firebase/FirebaseDataStore;", "context", "Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "loginPreference", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "cryptoClient", "Lcom/medicmedia/medilink/datastore/model/CryptoClient;", "moviePreference", "Lcom/medicmedia/medilink/datastore/preferences/VideoDataStore;", "qbPreference", "Lcom/medicmedia/medilink/datastore/preferences/QBDataStore;", "infoPreference", "Lcom/medicmedia/medilink/datastore/preferences/InfoDataStore;", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class DataStoreModule {
    public static final DataStoreModule INSTANCE = new DataStoreModule();

    private DataStoreModule() {
    }

    @Provides
    @Singleton
    public final FirebaseDataStore firebasePreference(@ApplicationContext Context context, @Named(PreferencesName.FIREBASE) SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        if (FirebaseApp.getApps(context).isEmpty()) {
            FirebaseApp.initializeApp(context);
        }
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(...)");
        firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: com.medicmedia.medilink.datastore.di.DataStoreModule$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                DataStoreModule.firebasePreference$lambda$0(task);
            }
        });
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseFirestore, "getInstance(...)");
        return new FirebasePreferences(context, preferences, firebaseRemoteConfig, firebaseFirestore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void firebasePreference$lambda$0(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.d("DataStoreModule", "remoteConfig fetchAndActivate completed.");
    }

    @Provides
    @Singleton
    public final LoginDataStore loginPreference(@ApplicationContext Context context, @Named(PreferencesName.LOGIN) SharedPreferences preferences, CryptoClient cryptoClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(cryptoClient, "cryptoClient");
        return new LoginPreferences(context, preferences, cryptoClient);
    }

    @Provides
    public final VideoDataStore moviePreference(@Named(PreferencesName.VIDEO) SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new VideoPreferences(preferences);
    }

    @Provides
    public final QBDataStore qbPreference(@Named(PreferencesName.QB) SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new QBPreferences(preferences);
    }

    @Provides
    public final InfoDataStore infoPreference(@ApplicationContext Context context, @Named("info") SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new InfoPreferences(context, preferences);
    }

    @Provides
    public final CryptoClient cryptoClient() {
        return new KeystoreAesGcmCryptoClient(null, 1, 0 == true ? 1 : 0);
    }
}
