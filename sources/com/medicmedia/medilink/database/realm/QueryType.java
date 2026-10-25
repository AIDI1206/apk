package com.medicmedia.medilink.database.realm;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import io.realm.kotlin.Realm;
import io.realm.kotlin.TypedRealm;
import io.realm.kotlin.query.RealmQuery;
import io.realm.kotlin.types.RealmObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: RealmDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType;", "", "Companion", "Equal", "NotEqual", "Sort", "SortList", "In", "WhereIn", "Contains", "Like", "Distinct", "Or", "And", "Not", "Lcom/medicmedia/medilink/database/realm/QueryType$And;", "Lcom/medicmedia/medilink/database/realm/QueryType$Contains;", "Lcom/medicmedia/medilink/database/realm/QueryType$Distinct;", "Lcom/medicmedia/medilink/database/realm/QueryType$Equal;", "Lcom/medicmedia/medilink/database/realm/QueryType$In;", "Lcom/medicmedia/medilink/database/realm/QueryType$Like;", "Lcom/medicmedia/medilink/database/realm/QueryType$Not;", "Lcom/medicmedia/medilink/database/realm/QueryType$NotEqual;", "Lcom/medicmedia/medilink/database/realm/QueryType$Or;", "Lcom/medicmedia/medilink/database/realm/QueryType$Sort;", "Lcom/medicmedia/medilink/database/realm/QueryType$SortList;", "Lcom/medicmedia/medilink/database/realm/QueryType$WhereIn;", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface QueryType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Companion;", "", "<init>", "()V", "FALSE_PREDICATE", "", "createRealmQuery", "Lio/realm/kotlin/query/RealmQuery;", "Item", "Lio/realm/kotlin/types/RealmObject;", "realm", "Lio/realm/kotlin/Realm;", "clazz", "Lkotlin/reflect/KClass;", "queryTypes", "", "Lcom/medicmedia/medilink/database/realm/QueryType;", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String FALSE_PREDICATE = "FALSEPREDICATE";

        private Companion() {
        }

        public final <Item extends RealmObject> RealmQuery<Item> createRealmQuery(Realm realm, KClass<Item> clazz, List<? extends QueryType> queryTypes) {
            RealmQuery realmQueryQuery$default;
            io.realm.kotlin.query.Sort realmKotlinSort;
            Intrinsics.checkNotNullParameter(realm, "realm");
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(queryTypes, "queryTypes");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<? extends QueryType> list = queryTypes;
            int size = 0;
            for (QueryType queryType : list) {
                if (queryType instanceof Equal) {
                    Equal equal = (Equal) queryType;
                    arrayList.add(equal.getFieldName() + " == $" + size);
                    arrayList2.add(equal.getValue());
                } else if (queryType instanceof NotEqual) {
                    NotEqual notEqual = (NotEqual) queryType;
                    arrayList.add(notEqual.getFieldName() + " != $" + size);
                    arrayList2.add(notEqual.getValue());
                } else if (queryType instanceof In) {
                    In in = (In) queryType;
                    arrayList.add(in.getFieldName() + " IN $" + size);
                    arrayList2.add(in.getValues());
                } else if (queryType instanceof WhereIn) {
                    if (queryTypes.size() == 1 && ((WhereIn) queryType).getValues().isEmpty()) {
                        arrayList.add(FALSE_PREDICATE);
                    } else {
                        WhereIn whereIn = (WhereIn) queryType;
                        if (!whereIn.getValues().isEmpty()) {
                            List<Object> values = whereIn.getValues();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
                            Iterator<T> it = values.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                arrayList3.add(whereIn.getFieldName() + " == $" + (i + size));
                                i = i2;
                            }
                            arrayList.add("(" + CollectionsKt.joinToString$default(arrayList3, " OR ", null, null, 0, null, null, 62, null) + ")");
                            arrayList2.addAll(whereIn.getValues());
                            size += whereIn.getValues().size();
                        }
                    }
                } else if (queryType instanceof Contains) {
                    Contains contains = (Contains) queryType;
                    arrayList.add(contains.getFieldName() + " CONTAINS[c] $" + size);
                    arrayList2.add(contains.getValue());
                } else if (queryType instanceof Like) {
                    Like like = (Like) queryType;
                    arrayList.add(like.getFieldName() + " LIKE[c] $" + size);
                    arrayList2.add(like.getValue());
                } else if (queryType instanceof And) {
                    arrayList.add("AND");
                } else if (queryType instanceof Or) {
                    arrayList.add("OR");
                } else if (queryType instanceof Not) {
                    arrayList.add("NOT");
                }
                size++;
            }
            String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null);
            if (StringsKt.isBlank(strJoinToString$default)) {
                realmQueryQuery$default = TypedRealm.DefaultImpls.query$default(realm, clazz, null, new Object[0], 2, null);
            } else {
                Object[] array = arrayList2.toArray(new Object[0]);
                realmQueryQuery$default = realm.query(clazz, strJoinToString$default, Arrays.copyOf(array, array.length));
            }
            for (QueryType queryType2 : list) {
                if (queryType2 instanceof Sort) {
                    Sort sort = (Sort) queryType2;
                    realmQueryQuery$default = realmQueryQuery$default.sort(sort.getFieldName(), RealmDatabaseKt.toRealmKotlinSort(sort.getType()));
                } else if (queryType2 instanceof SortList) {
                    SortList sortList = (SortList) queryType2;
                    int i3 = 0;
                    for (Object obj : sortList.getFieldNames()) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        String str = (String) obj;
                        io.realm.kotlin.query.Sort sort2 = (io.realm.kotlin.query.Sort) CollectionsKt.getOrNull(sortList.getSortOrder(), i3);
                        if (sort2 == null || (realmKotlinSort = RealmDatabaseKt.toRealmKotlinSort(sort2)) == null) {
                            realmKotlinSort = io.realm.kotlin.query.Sort.ASCENDING;
                        }
                        realmQueryQuery$default = realmQueryQuery$default.sort(str, realmKotlinSort);
                        i3 = i4;
                    }
                } else if (queryType2 instanceof Distinct) {
                    realmQueryQuery$default = realmQueryQuery$default.distinct(((Distinct) queryType2).getFieldName(), new String[0]);
                }
            }
            return realmQueryQuery$default;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Equal;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Equal implements QueryType {
        private final String fieldName;
        private final Object value;

        public static /* synthetic */ Equal copy$default(Equal equal, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = equal.fieldName;
            }
            if ((i & 2) != 0) {
                obj = equal.value;
            }
            return equal.copy(str, obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final Equal copy(String fieldName, Object value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Equal(fieldName, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Equal)) {
                return false;
            }
            Equal equal = (Equal) other;
            return Intrinsics.areEqual(this.fieldName, equal.fieldName) && Intrinsics.areEqual(this.value, equal.value);
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Equal(fieldName=" + this.fieldName + ", value=" + this.value + ")";
        }

        public Equal(String fieldName, Object value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fieldName = fieldName;
            this.value = value;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$NotEqual;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class NotEqual implements QueryType {
        private final String fieldName;
        private final Object value;

        public static /* synthetic */ NotEqual copy$default(NotEqual notEqual, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = notEqual.fieldName;
            }
            if ((i & 2) != 0) {
                obj = notEqual.value;
            }
            return notEqual.copy(str, obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final NotEqual copy(String fieldName, Object value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            return new NotEqual(fieldName, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotEqual)) {
                return false;
            }
            NotEqual notEqual = (NotEqual) other;
            return Intrinsics.areEqual(this.fieldName, notEqual.fieldName) && Intrinsics.areEqual(this.value, notEqual.value);
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "NotEqual(fieldName=" + this.fieldName + ", value=" + this.value + ")";
        }

        public NotEqual(String fieldName, Object value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fieldName = fieldName;
            this.value = value;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Sort;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/realm/kotlin/query/Sort;", "<init>", "(Ljava/lang/String;Lio/realm/kotlin/query/Sort;)V", "getFieldName", "()Ljava/lang/String;", "getType", "()Lio/realm/kotlin/query/Sort;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Sort implements QueryType {
        private final String fieldName;
        private final io.realm.kotlin.query.Sort type;

        public static /* synthetic */ Sort copy$default(Sort sort, String str, io.realm.kotlin.query.Sort sort2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sort.fieldName;
            }
            if ((i & 2) != 0) {
                sort2 = sort.type;
            }
            return sort.copy(str, sort2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final io.realm.kotlin.query.Sort getType() {
            return this.type;
        }

        public final Sort copy(String fieldName, io.realm.kotlin.query.Sort type) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Sort(fieldName, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sort)) {
                return false;
            }
            Sort sort = (Sort) other;
            return Intrinsics.areEqual(this.fieldName, sort.fieldName) && this.type == sort.type;
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Sort(fieldName=" + this.fieldName + ", type=" + this.type + ")";
        }

        public Sort(String fieldName, io.realm.kotlin.query.Sort type) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(type, "type");
            this.fieldName = fieldName;
            this.type = type;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public /* synthetic */ Sort(String str, io.realm.kotlin.query.Sort sort, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? io.realm.kotlin.query.Sort.ASCENDING : sort);
        }

        public final io.realm.kotlin.query.Sort getType() {
            return this.type;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$SortList;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldNames", "", "", "sortOrder", "Lio/realm/kotlin/query/Sort;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFieldNames", "()Ljava/util/List;", "getSortOrder", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SortList implements QueryType {
        private final List<String> fieldNames;
        private final List<io.realm.kotlin.query.Sort> sortOrder;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SortList copy$default(SortList sortList, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = sortList.fieldNames;
            }
            if ((i & 2) != 0) {
                list2 = sortList.sortOrder;
            }
            return sortList.copy(list, list2);
        }

        public final List<String> component1() {
            return this.fieldNames;
        }

        public final List<io.realm.kotlin.query.Sort> component2() {
            return this.sortOrder;
        }

        public final SortList copy(List<String> fieldNames, List<? extends io.realm.kotlin.query.Sort> sortOrder) {
            Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
            Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
            return new SortList(fieldNames, sortOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortList)) {
                return false;
            }
            SortList sortList = (SortList) other;
            return Intrinsics.areEqual(this.fieldNames, sortList.fieldNames) && Intrinsics.areEqual(this.sortOrder, sortList.sortOrder);
        }

        public int hashCode() {
            return (this.fieldNames.hashCode() * 31) + this.sortOrder.hashCode();
        }

        public String toString() {
            return "SortList(fieldNames=" + this.fieldNames + ", sortOrder=" + this.sortOrder + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SortList(List<String> fieldNames, List<? extends io.realm.kotlin.query.Sort> sortOrder) {
            Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
            Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
            this.fieldNames = fieldNames;
            this.sortOrder = sortOrder;
        }

        public final List<String> getFieldNames() {
            return this.fieldNames;
        }

        public final List<io.realm.kotlin.query.Sort> getSortOrder() {
            return this.sortOrder;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$In;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", "values", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFieldName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class In implements QueryType {
        private final String fieldName;
        private final List<Object> values;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ In copy$default(In in, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = in.fieldName;
            }
            if ((i & 2) != 0) {
                list = in.values;
            }
            return in.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        public final List<Object> component2() {
            return this.values;
        }

        public final In copy(String fieldName, List<? extends Object> values) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(values, "values");
            return new In(fieldName, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof In)) {
                return false;
            }
            In in = (In) other;
            return Intrinsics.areEqual(this.fieldName, in.fieldName) && Intrinsics.areEqual(this.values, in.values);
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.values.hashCode();
        }

        public String toString() {
            return "In(fieldName=" + this.fieldName + ", values=" + this.values + ")";
        }

        public In(String fieldName, List<? extends Object> values) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(values, "values");
            this.fieldName = fieldName;
            this.values = values;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final List<Object> getValues() {
            return this.values;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$WhereIn;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", "values", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFieldName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class WhereIn implements QueryType {
        private final String fieldName;
        private final List<Object> values;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WhereIn copy$default(WhereIn whereIn, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = whereIn.fieldName;
            }
            if ((i & 2) != 0) {
                list = whereIn.values;
            }
            return whereIn.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        public final List<Object> component2() {
            return this.values;
        }

        public final WhereIn copy(String fieldName, List<? extends Object> values) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(values, "values");
            return new WhereIn(fieldName, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhereIn)) {
                return false;
            }
            WhereIn whereIn = (WhereIn) other;
            return Intrinsics.areEqual(this.fieldName, whereIn.fieldName) && Intrinsics.areEqual(this.values, whereIn.values);
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.values.hashCode();
        }

        public String toString() {
            return "WhereIn(fieldName=" + this.fieldName + ", values=" + this.values + ")";
        }

        public WhereIn(String fieldName, List<? extends Object> values) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(values, "values");
            this.fieldName = fieldName;
            this.values = values;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final List<Object> getValues() {
            return this.values;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Contains;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Contains implements QueryType {
        private final String fieldName;
        private final String value;

        public static /* synthetic */ Contains copy$default(Contains contains, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contains.fieldName;
            }
            if ((i & 2) != 0) {
                str2 = contains.value;
            }
            return contains.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Contains copy(String fieldName, String value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Contains(fieldName, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contains)) {
                return false;
            }
            Contains contains = (Contains) other;
            return Intrinsics.areEqual(this.fieldName, contains.fieldName) && Intrinsics.areEqual(this.value, contains.value);
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Contains(fieldName=" + this.fieldName + ", value=" + this.value + ")";
        }

        public Contains(String fieldName, String value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fieldName = fieldName;
            this.value = value;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Like;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Like implements QueryType {
        private final String fieldName;
        private final String value;

        public static /* synthetic */ Like copy$default(Like like, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = like.fieldName;
            }
            if ((i & 2) != 0) {
                str2 = like.value;
            }
            return like.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Like copy(String fieldName, String value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Like(fieldName, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Like)) {
                return false;
            }
            Like like = (Like) other;
            return Intrinsics.areEqual(this.fieldName, like.fieldName) && Intrinsics.areEqual(this.value, like.value);
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Like(fieldName=" + this.fieldName + ", value=" + this.value + ")";
        }

        public Like(String fieldName, String value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fieldName = fieldName;
            this.value = value;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Distinct;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "fieldName", "", "<init>", "(Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Distinct implements QueryType {
        private final String fieldName;

        public static /* synthetic */ Distinct copy$default(Distinct distinct, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = distinct.fieldName;
            }
            return distinct.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        public final Distinct copy(String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new Distinct(fieldName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Distinct) && Intrinsics.areEqual(this.fieldName, ((Distinct) other).fieldName);
        }

        public int hashCode() {
            return this.fieldName.hashCode();
        }

        public String toString() {
            return "Distinct(fieldName=" + this.fieldName + ")";
        }

        public Distinct(String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            this.fieldName = fieldName;
        }

        public final String getFieldName() {
            return this.fieldName;
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Or;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "<init>", "()V", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Or implements QueryType {
        public static final Or INSTANCE = new Or();

        private Or() {
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$And;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "<init>", "()V", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class And implements QueryType {
        public static final And INSTANCE = new And();

        private And() {
        }
    }

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/database/realm/QueryType$Not;", "Lcom/medicmedia/medilink/database/realm/QueryType;", "<init>", "()V", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Not implements QueryType {
        public static final Not INSTANCE = new Not();

        private Not() {
        }
    }
}
