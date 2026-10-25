package io.realm.kotlin.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmClass.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0003H¦\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/schema/RealmClass;", "", "name", "", "getName", "()Ljava/lang/String;", "properties", "", "Lio/realm/kotlin/schema/RealmProperty;", "getProperties", "()Ljava/util/Collection;", "primaryKey", "getPrimaryKey", "()Lio/realm/kotlin/schema/RealmProperty;", "kind", "Lio/realm/kotlin/schema/RealmClassKind;", "getKind", "()Lio/realm/kotlin/schema/RealmClassKind;", "get", "key", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmClass {
    RealmProperty get(String key);

    RealmClassKind getKind();

    String getName();

    RealmProperty getPrimaryKey();

    Collection<RealmProperty> getProperties();
}
