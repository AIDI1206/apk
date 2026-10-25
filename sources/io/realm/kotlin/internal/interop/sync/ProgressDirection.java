package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.NativeEnumerated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ProgressDirection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/ProgressDirection;", "Lio/realm/kotlin/internal/interop/NativeEnumerated;", "", "nativeValue", "", "<init>", "(Ljava/lang/String;II)V", "getNativeValue", "()I", "RLM_SYNC_PROGRESS_DIRECTION_UPLOAD", "RLM_SYNC_PROGRESS_DIRECTION_DOWNLOAD", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ProgressDirection implements NativeEnumerated {
    RLM_SYNC_PROGRESS_DIRECTION_UPLOAD(0),
    RLM_SYNC_PROGRESS_DIRECTION_DOWNLOAD(1);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int nativeValue;

    public static EnumEntries<ProgressDirection> getEntries() {
        return $ENTRIES;
    }

    ProgressDirection(int i) {
        this.nativeValue = i;
    }

    @Override // io.realm.kotlin.internal.interop.NativeEnumerated
    public int getNativeValue() {
        return this.nativeValue;
    }
}
