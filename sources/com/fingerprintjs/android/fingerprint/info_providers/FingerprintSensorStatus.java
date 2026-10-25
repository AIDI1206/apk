package com.fingerprintjs.android.fingerprint.info_providers;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.EnvironmentCompat;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: FingerprintSensorInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorStatus;", "", "stringDescription", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringDescription", "()Ljava/lang/String;", "NOT_SUPPORTED", "SUPPORTED", "ENABLED", "UNKNOWN", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum FingerprintSensorStatus {
    NOT_SUPPORTED("not_supported"),
    SUPPORTED("supported"),
    ENABLED("enabled"),
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final String stringDescription;

    public static EnumEntries<FingerprintSensorStatus> getEntries() {
        return $ENTRIES;
    }

    FingerprintSensorStatus(String str) {
        this.stringDescription = str;
    }

    public final String getStringDescription() {
        return this.stringDescription;
    }
}
