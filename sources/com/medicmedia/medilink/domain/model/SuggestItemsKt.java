package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.SuggestResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SuggestItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"convertTo", "Lcom/medicmedia/medilink/domain/model/SuggestItems;", "Lcom/medicmedia/medilink/core/network/api/response/SuggestResponse;", "Lcom/medicmedia/medilink/domain/model/SuggestItem;", "Lcom/medicmedia/medilink/core/network/api/response/SuggestResponse$Suggest;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SuggestItemsKt {
    public static final SuggestItems convertTo(SuggestResponse suggestResponse) {
        ArrayList arrayListEmptyList;
        Intrinsics.checkNotNullParameter(suggestResponse, "<this>");
        Integer took = suggestResponse.getTook();
        Boolean timedOut = suggestResponse.getTimedOut();
        List<SuggestResponse.Suggest> suggests = suggestResponse.getSuggests();
        if (suggests == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            List<SuggestResponse.Suggest> list = suggests;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(convertTo((SuggestResponse.Suggest) it.next()));
            }
            arrayListEmptyList = arrayList;
        }
        return new SuggestItems(took, timedOut, arrayListEmptyList);
    }

    public static final SuggestItem convertTo(SuggestResponse.Suggest suggest) {
        Intrinsics.checkNotNullParameter(suggest, "<this>");
        return new SuggestItem(suggest.getValue(), suggest.getDocCount(), suggest.getRecord(), suggest.getSystem());
    }
}
