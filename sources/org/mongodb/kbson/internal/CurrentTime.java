package org.mongodb.kbson.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: CurrentTime.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/mongodb/kbson/internal/CurrentTime;", "", "()V", "millisInASecond", "", "getCurrentTimeInMillis", "", "getCurrentTimeInSeconds", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CurrentTime {
    public static final CurrentTime INSTANCE = new CurrentTime();
    private static final int millisInASecond = 1000;

    private CurrentTime() {
    }

    public final long getCurrentTimeInMillis() {
        return System.currentTimeMillis();
    }

    public final int getCurrentTimeInSeconds() {
        return (int) (getCurrentTimeInMillis() / ((long) 1000));
    }
}
