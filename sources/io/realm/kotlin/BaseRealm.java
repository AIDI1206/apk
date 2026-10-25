package io.realm.kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.schema.RealmSchema;
import kotlin.Metadata;

/* JADX INFO: compiled from: BaseRealm.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lio/realm/kotlin/BaseRealm;", "Lio/realm/kotlin/Versioned;", "configuration", "Lio/realm/kotlin/Configuration;", "getConfiguration", "()Lio/realm/kotlin/Configuration;", "schema", "Lio/realm/kotlin/schema/RealmSchema;", "schemaVersion", "", "getNumberOfActiveVersions", "isClosed", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface BaseRealm extends Versioned {
    Configuration getConfiguration();

    long getNumberOfActiveVersions();

    boolean isClosed();

    RealmSchema schema();

    long schemaVersion();
}
