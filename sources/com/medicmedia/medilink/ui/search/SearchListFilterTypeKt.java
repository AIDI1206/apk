package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.ContentsFilterSearchListItem;
import com.medicmedia.medilink.domain.model.SearchOperation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchListFilterType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"toFilterTypeList", "", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType;", "Lcom/medicmedia/medilink/domain/model/ContentsFilterSearchListItem;", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SearchListFilterTypeKt {
    public static final List<SearchListFilterType> toFilterTypeList(ContentsFilterSearchListItem contentsFilterSearchListItem) {
        Intrinsics.checkNotNullParameter(contentsFilterSearchListItem, "<this>");
        return CollectionsKt.listOf((Object[]) new SearchListFilterType[]{new SearchListFilterType.UnPurchasedContents(contentsFilterSearchListItem.isPurchase()), new SearchListFilterType.Operation(SearchOperation.INSTANCE.find(contentsFilterSearchListItem.getOperation())), new SearchListFilterType.Contents(contentsFilterSearchListItem.getContents(), 0, 2, null)});
    }
}
