package com.medicmedia.medilink.domain.model;

import androidx.compose.material.TextFieldImplKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SettingsItemLabel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SettingLabelTextSize;", "Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "", "labelId", "", "messageId", "size", "fontScale", "", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;IF)V", "getLabelId", "()I", "getMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSize", "getFontScale", "()F", "LARGE", "DEFAULT", "SMALL", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SettingLabelTextSize implements SettingsItemLabel {
    LARGE(R.string.setting_text_size_max, null, TextFieldImplKt.AnimationDuration, 1.5f, 2, null),
    DEFAULT(R.string.setting_text_size_default, null, 100, 1.0f, 2, null),
    SMALL(R.string.setting_text_size_min, null, 50, 0.5f, 2, null);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final float fontScale;
    private final int labelId;
    private final Integer messageId;
    private final int size;

    public static EnumEntries<SettingLabelTextSize> getEntries() {
        return $ENTRIES;
    }

    SettingLabelTextSize(int i, Integer num, int i2, float f) {
        this.labelId = i;
        this.messageId = num;
        this.size = i2;
        this.fontScale = f;
    }

    /* synthetic */ SettingLabelTextSize(int i, Integer num, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : num, i2, f);
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public int getLabelId() {
        return this.labelId;
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public Integer getMessageId() {
        return this.messageId;
    }

    public final int getSize() {
        return this.size;
    }

    public final float getFontScale() {
        return this.fontScale;
    }
}
