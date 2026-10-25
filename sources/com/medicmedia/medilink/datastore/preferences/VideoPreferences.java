package com.medicmedia.medilink.datastore.preferences;

import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.preferences.di.PreferencesName;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPreferences.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/datastore/preferences/VideoPreferences;", "Lcom/medicmedia/medilink/datastore/preferences/VideoDataStore;", "videoPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "lastMediaItems", "", "setLastMediaItems", "", "value", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoPreferences implements VideoDataStore {
    private final SharedPreferences videoPreferences;

    @Inject
    public VideoPreferences(@Named(PreferencesName.VIDEO) SharedPreferences videoPreferences) {
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        this.videoPreferences = videoPreferences;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.VideoDataStore
    public String lastMediaItems() {
        return this.videoPreferences.getString(VideoPreferenceKey.LAST_MEDIA_ITEMS, null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.VideoDataStore
    public void setLastMediaItems(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.videoPreferences.edit().putString(VideoPreferenceKey.LAST_MEDIA_ITEMS, value).apply();
    }
}
