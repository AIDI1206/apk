package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import com.medicmedia.medilink.domain.model.ContentsFilterBrowsingListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterListItemKt;
import com.medicmedia.medilink.domain.model.ContentsFilterSearchListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterWritingListItem;
import com.medicmedia.medilink.domain.model.LegacyContentsColorFilterItem;
import com.medicmedia.medilink.domain.model.LegacyContentsFilterItem;
import com.medicmedia.medilink.domain.model.SearchOperation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsFilterUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCaseImpl;", "Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;", "loginDataStore", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "<init>", "(Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;)V", "checkMigration", "", "browsingListFilterItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterBrowsingListItem;", "writingListFilterItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterWritingListItem;", "searchListFilterItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterSearchListItem;", "updateContentsFilterItem", "item", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListItem;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsFilterUseCaseImpl implements ContentsFilterUseCase {
    private final LoginDataStore loginDataStore;

    @Inject
    public ContentsFilterUseCaseImpl(LoginDataStore loginDataStore) {
        Intrinsics.checkNotNullParameter(loginDataStore, "loginDataStore");
        this.loginDataStore = loginDataStore;
    }

    @Override // com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase
    public void checkMigration() {
        if (this.loginDataStore.isMigratedContentsFilter()) {
            return;
        }
        String strConvertToString = ContentsFilterListItemKt.convertToString(new ContentsFilterBrowsingListItem(LegacyContentsFilterItem.INSTANCE.convertTo(this.loginDataStore.legacyContentsReadFilter()).getNewFormatContents()));
        if (strConvertToString != null) {
            this.loginDataStore.setContentsBrowsingListFilter(strConvertToString);
        }
        String strConvertToString2 = ContentsFilterListItemKt.convertToString(new ContentsFilterWritingListItem(LegacyContentsFilterItem.INSTANCE.convertTo(this.loginDataStore.legacyContentsWriteFilter()).getNewFormatContents(), LegacyContentsColorFilterItem.INSTANCE.convertTo(this.loginDataStore.legacyContentsWriteColorFilter()).getNewFormatColors(), this.loginDataStore.legacyContentsWriteBookMarkFilter(), this.loginDataStore.legacyContentsWriteMemoFilter()));
        if (strConvertToString2 != null) {
            this.loginDataStore.setContentsWritingListFilter(strConvertToString2);
        }
        boolean zLegacySearchPurchaseFilter = this.loginDataStore.legacySearchPurchaseFilter();
        String strLegacySearchOperationFilter = this.loginDataStore.legacySearchOperationFilter();
        if (strLegacySearchOperationFilter == null) {
            strLegacySearchOperationFilter = SearchOperation.AND.getValue();
        }
        String strConvertToString3 = ContentsFilterListItemKt.convertToString(new ContentsFilterSearchListItem(null, zLegacySearchPurchaseFilter, strLegacySearchOperationFilter, 1, null));
        if (strConvertToString3 != null) {
            this.loginDataStore.setContentsSearchListFilter(strConvertToString3);
        }
        this.loginDataStore.setContentsFilterMigrationFlag(true);
    }

    @Override // com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase
    public ContentsFilterBrowsingListItem browsingListFilterItem() {
        return ContentsFilterBrowsingListItem.INSTANCE.convertTo(this.loginDataStore.contentsBrowsingListFilter());
    }

    @Override // com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase
    public ContentsFilterWritingListItem writingListFilterItem() {
        return ContentsFilterWritingListItem.INSTANCE.convertTo(this.loginDataStore.contentsWritingListFilter());
    }

    @Override // com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase
    public ContentsFilterSearchListItem searchListFilterItem() {
        return ContentsFilterSearchListItem.INSTANCE.convertTo(this.loginDataStore.contentsSearchListFilter());
    }

    @Override // com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase
    public void updateContentsFilterItem(ContentsFilterListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String strConvertToString = ContentsFilterListItemKt.convertToString(item);
        if (strConvertToString != null) {
            if (item instanceof ContentsFilterBrowsingListItem) {
                this.loginDataStore.setContentsBrowsingListFilter(strConvertToString);
            } else if (item instanceof ContentsFilterWritingListItem) {
                this.loginDataStore.setContentsWritingListFilter(strConvertToString);
            } else if (item instanceof ContentsFilterSearchListItem) {
                this.loginDataStore.setContentsSearchListFilter(strConvertToString);
            }
        }
    }
}
