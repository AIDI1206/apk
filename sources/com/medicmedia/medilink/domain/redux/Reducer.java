package com.medicmedia.medilink.domain.redux;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.domain.redux.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: Reducer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/Reducer;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/medicmedia/medilink/domain/redux/State;", "", "reduce", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "Lcom/medicmedia/medilink/domain/redux/Action;", "(Lcom/medicmedia/medilink/domain/redux/State;Lcom/medicmedia/medilink/domain/redux/Action;)Lcom/medicmedia/medilink/domain/redux/State;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface Reducer<T extends State> {
    T reduce(T state, Action action);
}
