package coil3.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import okio.FileSystem;

/* JADX INFO: compiled from: fileSystems.nonJsCommon.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"defaultFileSystem", "Lokio/FileSystem;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FileSystems_nonJsCommonKt {
    public static final FileSystem defaultFileSystem() {
        return FileSystem.SYSTEM;
    }
}
