package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MultiLevelViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002\u001a$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"collectSelfAndDescendants", "", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", "findCheckedItems", "checkedIds", "", "", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MultiLevelViewItemKt {
    public static final List<MultiLevelViewItem> collectSelfAndDescendants(MultiLevelViewItem multiLevelViewItem) {
        Intrinsics.checkNotNullParameter(multiLevelViewItem, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(multiLevelViewItem);
        while (!arrayDeque.isEmpty()) {
            MultiLevelViewItem multiLevelViewItem2 = (MultiLevelViewItem) arrayDeque.removeLast();
            arrayList.add(multiLevelViewItem2);
            Iterator<T> it = multiLevelViewItem2.getChildren().iterator();
            while (it.hasNext()) {
                arrayDeque.addLast((MultiLevelViewItem) it.next());
            }
        }
        return arrayList;
    }

    public static final List<MultiLevelViewItem> findCheckedItems(List<? extends MultiLevelViewItem> list, Set<String> checkedIds) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        if (checkedIds.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((MultiLevelViewItem) it.next());
        }
        while (!arrayDeque.isEmpty()) {
            MultiLevelViewItem multiLevelViewItem = (MultiLevelViewItem) arrayDeque.removeLast();
            if (checkedIds.contains(multiLevelViewItem.getId())) {
                arrayList.add(multiLevelViewItem);
            }
            Iterator<T> it2 = multiLevelViewItem.getChildren().iterator();
            while (it2.hasNext()) {
                arrayDeque.addLast((MultiLevelViewItem) it2.next());
            }
        }
        return arrayList;
    }
}
