package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TransitionScanContacts.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ScanContactsInfo;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SCAN_CONTENTS", "QB_REF_ID", "QB_REF_ID_ENCODE", "REGISTER_QUESTION_SET", "REGISTER_QUESTION_SET_ENCODE", "HTTP", "HTTPS", "ALPHANUMERIC_1", "ALPHANUMERIC_2", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ScanContactsInfo {
    SCAN_CONTENTS("https://medilinkclient.page.link/scan_contents?id="),
    QB_REF_ID("qbref?id="),
    QB_REF_ID_ENCODE("%2Fqbref%3Fid%3D"),
    REGISTER_QUESTION_SET("qb.medilink-study.com/RegisterQuestionSet"),
    REGISTER_QUESTION_SET_ENCODE("qb.medilink-study.com%2FRegisterQuestionSet%2F"),
    HTTP(MLConst.MLCommon.HTTP_FORMAT),
    HTTPS(MLConst.MLCommon.HTTPS_FORMAT),
    ALPHANUMERIC_1("[0-9A-Za-z]{5,20}"),
    ALPHANUMERIC_2("[0-9A-Z]*[_][^ ]*");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final String value;

    public static EnumEntries<ScanContactsInfo> getEntries() {
        return $ENTRIES;
    }

    ScanContactsInfo(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
