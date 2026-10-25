package com.fingerprintjs.android.fingerprint.tools;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.fingerprintjs.android.fingerprint.Fingerprinter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IdentificationVersionExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¨\u0006\u0005"}, d2 = {"inRange", "", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "added", "removed", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class IdentificationVersionExtensionsKt {
    public static final boolean inRange(Fingerprinter.Version version, Fingerprinter.Version added, Fingerprinter.Version version2) {
        Intrinsics.checkNotNullParameter(version, "<this>");
        Intrinsics.checkNotNullParameter(added, "added");
        if (version.getIntValue() >= added.getIntValue()) {
            return version2 == null || version.getIntValue() < version2.getIntValue();
        }
        return false;
    }
}
