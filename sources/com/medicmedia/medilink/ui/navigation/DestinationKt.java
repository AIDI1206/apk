package com.medicmedia.medilink.ui.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.IntermediatePageEntryType;
import com.medicmedia.medilink.domain.model.QrContentsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Destination.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toDestination", "Lcom/medicmedia/medilink/ui/navigation/Destination$IntermediatePage;", "Lcom/medicmedia/medilink/domain/model/QrContentsItem;", "entryType", "Lcom/medicmedia/medilink/domain/model/IntermediatePageEntryType;", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DestinationKt {
    public static final Destination.IntermediatePage toDestination(QrContentsItem qrContentsItem, IntermediatePageEntryType entryType) {
        Intrinsics.checkNotNullParameter(qrContentsItem, "<this>");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        return new Destination.IntermediatePage(entryType, qrContentsItem);
    }
}
