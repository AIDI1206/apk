package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.ApiCommon;
import com.medicmedia.medilink.domain.model.ContentOwnershipNoticeConfig;
import com.medicmedia.medilink.domain.model.ContentOwnershipNoticeItem;
import com.medicmedia.medilink.domain.model.ContentsLicense;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: ContentOwnershipNoticeUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005H¦@¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H¦@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH&¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/ContentOwnershipNoticeUseCase;", "", "contentOwnershipNoticeConfig", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig;", "getLicenses", "Lkotlin/Pair;", "Lcom/medicmedia/medilink/domain/model/ApiCommon;", "", "Lcom/medicmedia/medilink/domain/model/ContentsLicense;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContentOwnershipNotice", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeItem;", "config", "licenses", "(Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOwnershipNoticeHiddenUntil", "", "item", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ContentOwnershipNoticeUseCase {
    ContentOwnershipNoticeConfig contentOwnershipNoticeConfig();

    Object getContentOwnershipNotice(ContentOwnershipNoticeConfig contentOwnershipNoticeConfig, List<ContentsLicense> list, Continuation<? super List<ContentOwnershipNoticeItem>> continuation);

    Object getLicenses(Continuation<? super Pair<ApiCommon, ? extends List<ContentsLicense>>> continuation);

    void saveOwnershipNoticeHiddenUntil(ContentOwnershipNoticeItem item);
}
