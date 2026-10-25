package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.database.realm.QueryType;
import com.medicmedia.medilink.domain.model.announce.AnnounceItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: AnnounceUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/AnnounceUseCase;", "", "findAnnounceItems", "", "Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;", "queryTypes", "Lcom/medicmedia/medilink/database/realm/QueryType;", "read", "", "item", "(Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNewsOpenedEvent", "url", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AnnounceUseCase {
    List<AnnounceItem> findAnnounceItems(List<? extends QueryType> queryTypes);

    Object read(AnnounceItem announceItem, Continuation<? super Unit> continuation);

    void sendNewsOpenedEvent(String url);
}
