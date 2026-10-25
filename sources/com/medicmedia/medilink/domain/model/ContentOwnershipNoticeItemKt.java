package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentOwnershipNoticeItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertTo", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeItem$Row;", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig$Row;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentOwnershipNoticeItemKt {
    public static final ContentOwnershipNoticeItem.Row convertTo(ContentOwnershipNoticeConfig.Row row) {
        Intrinsics.checkNotNullParameter(row, "<this>");
        return new ContentOwnershipNoticeItem.Row(row.getTitle(), row.getMessage(), row.getButtonTitle(), row.getButtonUrl());
    }
}
