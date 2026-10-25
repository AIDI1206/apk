package com.fingerprintjs.android.fingerprint.info_providers;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: compiled from: MemInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "", "totalExternalStorageSpace", "", HardwareSignalConstantsKt.TOTAL_INTERNAL_STORAGE_SPACE_KEY, HardwareSignalConstantsKt.TOTAL_RAM_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MemInfoProvider {
    long totalExternalStorageSpace();

    long totalInternalStorageSpace();

    long totalRAM();
}
