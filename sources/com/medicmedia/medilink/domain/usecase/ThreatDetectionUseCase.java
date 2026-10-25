package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: ThreatDetectionUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/ThreatDetectionUseCase;", "", "isThreatDetected", "", "awaitThreatDetected", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeThreatDetected", "", "onDetected", "Ljava/lang/Runnable;", "recordNonFatalException", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ThreatDetectionUseCase {
    Object awaitThreatDetected(Continuation<? super Boolean> continuation);

    boolean isThreatDetected();

    void observeThreatDetected(Runnable onDetected);

    void recordNonFatalException();
}
