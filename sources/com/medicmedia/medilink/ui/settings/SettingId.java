package com.medicmedia.medilink.ui.settings;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SettingsConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/settings/SettingId;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "TextSize", "ResumeToggle", "OnlineSearch", "OnlyWifiDownload", "ReviewMode", "ReviewModeUi", "TermsOfService", "ClearCache", "GotoAppStore", "PushSetting", "GotoMedilinkSite", "GotoFaq", "GotoGuide", "Withdrawal", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SettingId {
    TextSize("size_text"),
    ResumeToggle("resume_toggle"),
    OnlineSearch("online_search"),
    OnlyWifiDownload("only_wifi_download"),
    ReviewMode("review_mode"),
    ReviewModeUi("review_mode_ui"),
    TermsOfService("terms_of_service"),
    ClearCache("clear_cache"),
    GotoAppStore("goto_appstore"),
    PushSetting("push_setting"),
    GotoMedilinkSite("goto_other_url"),
    GotoFaq("goto_url_faq"),
    GotoGuide("goto_url_guide"),
    Withdrawal("withdrawal");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final String key;

    public static EnumEntries<SettingId> getEntries() {
        return $ENTRIES;
    }

    SettingId(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
