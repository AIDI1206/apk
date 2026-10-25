package com.medicmedia.medilink.datastore.preferences;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: InfoPreferences.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH&J\b\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH&¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/datastore/preferences/InfoDataStore;", "", "networkOperatorName", "", "simCountryIso", "networkCountryIso", "versionName", "infoDate", "", "setInfoDate", "", "value", "getOwnershipNoticeHiddenUntil", "setOwnershipNoticeHiddenUntil", "hiddenUntilMillis", "clearHiddenUntil", "getOwnershipNoticeHiddenUntilByCard", "snoozeId", "setOwnershipNoticeHiddenUntilByCard", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface InfoDataStore {
    void clearHiddenUntil();

    long getOwnershipNoticeHiddenUntil();

    long getOwnershipNoticeHiddenUntilByCard(String snoozeId);

    long infoDate();

    String networkCountryIso();

    String networkOperatorName();

    void setInfoDate(long value);

    void setOwnershipNoticeHiddenUntil(long hiddenUntilMillis);

    void setOwnershipNoticeHiddenUntilByCard(String snoozeId, long hiddenUntilMillis);

    String simCountryIso();

    String versionName();
}
