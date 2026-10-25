package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SettingsItemLabel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SettingLabelOnlineSearch;", "Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "", "labelId", "", "messageId", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;)V", "getLabelId", "()I", "getMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "ON", "OFF", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SettingLabelOnlineSearch implements SettingsItemLabel {
    ON(R.string.setting_online_search_on, null, 2, null),
    OFF(R.string.setting_online_search_off, null, 2, null);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int labelId;
    private final Integer messageId;

    public static EnumEntries<SettingLabelOnlineSearch> getEntries() {
        return $ENTRIES;
    }

    SettingLabelOnlineSearch(int i, Integer num) {
        this.labelId = i;
        this.messageId = num;
    }

    /* synthetic */ SettingLabelOnlineSearch(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num);
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public int getLabelId() {
        return this.labelId;
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public Integer getMessageId() {
        return this.messageId;
    }
}
