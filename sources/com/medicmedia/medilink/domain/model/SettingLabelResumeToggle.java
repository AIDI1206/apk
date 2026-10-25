package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SettingsItemLabel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SettingLabelResumeToggle;", "Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "", "labelId", "", "messageId", "<init>", "(Ljava/lang/String;III)V", "getLabelId", "()I", "getMessageId", "()Ljava/lang/Integer;", "SHOW", "HIDE", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SettingLabelResumeToggle implements SettingsItemLabel {
    SHOW(R.string.setting_label_show, R.string.setting_resume_show),
    HIDE(R.string.setting_label_hide, R.string.setting_resume_hide);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int labelId;
    private final int messageId;

    public static EnumEntries<SettingLabelResumeToggle> getEntries() {
        return $ENTRIES;
    }

    SettingLabelResumeToggle(int i, int i2) {
        this.labelId = i;
        this.messageId = i2;
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public int getLabelId() {
        return this.labelId;
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public Integer getMessageId() {
        return Integer.valueOf(this.messageId);
    }
}
