package com.medicmedia.medilink.domain.redux;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.medicmedia.medilink.domain.redux.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: Store.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/Store;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/medicmedia/medilink/domain/redux/State;", "", "dispatch", "", "action", "Lcom/medicmedia/medilink/domain/redux/Action;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface Store<T extends State> {
    void dispatch(Action action);
}
