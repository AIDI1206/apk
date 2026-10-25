package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VersionParts.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"toVersionParts", "Lcom/medicmedia/medilink/domain/model/VersionParts;", "", "", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VersionPartsKt {
    public static final VersionParts toVersionParts(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() < 3) {
            return null;
        }
        return new VersionParts(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue());
    }
}
