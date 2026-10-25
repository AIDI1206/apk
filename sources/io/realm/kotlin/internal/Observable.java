package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.CoreNotifiable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Notifiable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lio/realm/kotlin/internal/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/internal/CoreNotifiable;", "C", "", "notifiable", "Lio/realm/kotlin/internal/Notifiable;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface Observable<T extends CoreNotifiable<T, C>, C> {
    Notifiable<T, C> notifiable();
}
