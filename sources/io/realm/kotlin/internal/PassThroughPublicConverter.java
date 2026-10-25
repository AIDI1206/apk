package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: compiled from: Converters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/PassThroughPublicConverter;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/internal/CompositeConverter;", "<init>", "()V", "fromPublic", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "toPublic", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class PassThroughPublicConverter<T> extends CompositeConverter<T, T> {
    @Override // io.realm.kotlin.internal.PublicConverter
    public T fromPublic(T value) {
        return value;
    }

    @Override // io.realm.kotlin.internal.PublicConverter
    public T toPublic(T value) {
        return value;
    }
}
