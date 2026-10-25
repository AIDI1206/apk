package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.ContentsFilterBrowsingListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterSearchListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterWritingListItem;
import kotlin.Metadata;

/* JADX INFO: compiled from: ContentsFilterUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;", "", "checkMigration", "", "browsingListFilterItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterBrowsingListItem;", "writingListFilterItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterWritingListItem;", "searchListFilterItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterSearchListItem;", "updateContentsFilterItem", "item", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListItem;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ContentsFilterUseCase {
    ContentsFilterBrowsingListItem browsingListFilterItem();

    void checkMigration();

    ContentsFilterSearchListItem searchListFilterItem();

    void updateContentsFilterItem(ContentsFilterListItem item);

    ContentsFilterWritingListItem writingListFilterItem();
}
