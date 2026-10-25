package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.VideoErrataResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoErrataItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toItem", "Lcom/medicmedia/medilink/domain/model/VideoErrataItem;", "Lcom/medicmedia/medilink/core/network/api/response/VideoErrataResponse$Errata;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoErrataItemKt {
    public static final VideoErrataItem toItem(VideoErrataResponse.Errata errata) {
        Intrinsics.checkNotNullParameter(errata, "<this>");
        return new VideoErrataItem(errata.getErrataId(), errata.getCourseId(), errata.getChapterId(), errata.getModifiedDate(), errata.getMedia(), errata.getPoint(), errata.getOverview(), errata.getWrong(), errata.getCorrect(), errata.getSupplement(), errata.getInsertedDate(), errata.getUpdatedDate(), errata.getInsertedUser(), errata.getUpdatedUser(), errata.getVersion());
    }
}
