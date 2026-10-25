package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LEFT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: SettingsItemLabel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SettingLabelReviewModeUI;", "Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "", "labelId", "", "messageId", "value", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;I)V", "getLabelId", "()I", "getMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "LEFT", "RIGHT", "CENTER", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SettingLabelReviewModeUI implements SettingsItemLabel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SettingLabelReviewModeUI[] $VALUES;
    public static final SettingLabelReviewModeUI CENTER = new SettingLabelReviewModeUI("CENTER", 2, R.string.setting_review_ui_center, null, 1, 2, null);
    public static final SettingLabelReviewModeUI LEFT;
    public static final SettingLabelReviewModeUI RIGHT;
    private final int labelId;
    private final Integer messageId;
    private final int value;

    private static final /* synthetic */ SettingLabelReviewModeUI[] $values() {
        return new SettingLabelReviewModeUI[]{LEFT, RIGHT, CENTER};
    }

    public static EnumEntries<SettingLabelReviewModeUI> getEntries() {
        return $ENTRIES;
    }

    private SettingLabelReviewModeUI(String str, int i, int i2, Integer num, int i3) {
        super(str, i);
        this.labelId = i2;
        this.messageId = num;
        this.value = i3;
    }

    /* synthetic */ SettingLabelReviewModeUI(String str, int i, int i2, Integer num, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? null : num, i3);
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public int getLabelId() {
        return this.labelId;
    }

    @Override // com.medicmedia.medilink.domain.model.SettingsItemLabel
    public Integer getMessageId() {
        return this.messageId;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        int i = 2;
        LEFT = new SettingLabelReviewModeUI("LEFT", 0, R.string.setting_review_ui_left, null, 0, i, null);
        RIGHT = new SettingLabelReviewModeUI("RIGHT", 1, R.string.setting_review_ui_right, null, i, 2, null);
        SettingLabelReviewModeUI[] settingLabelReviewModeUIArr$values = $values();
        $VALUES = settingLabelReviewModeUIArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(settingLabelReviewModeUIArr$values);
    }

    public static SettingLabelReviewModeUI valueOf(String str) {
        return (SettingLabelReviewModeUI) Enum.valueOf(SettingLabelReviewModeUI.class, str);
    }

    public static SettingLabelReviewModeUI[] values() {
        return (SettingLabelReviewModeUI[]) $VALUES.clone();
    }
}
