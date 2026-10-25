package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.firebase.FirebaseDataStore;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PdfViewerUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/PdfViewerUseCaseImpl;", "Lcom/medicmedia/medilink/domain/usecase/PdfViewerUseCase;", "firebaseDataStore", "Lcom/medicmedia/medilink/datastore/firebase/FirebaseDataStore;", "<init>", "(Lcom/medicmedia/medilink/datastore/firebase/FirebaseDataStore;)V", "isPdfViewerEnabled", "", "getPdfExcludedIds", "", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PdfViewerUseCaseImpl implements PdfViewerUseCase {
    private final FirebaseDataStore firebaseDataStore;

    @Inject
    public PdfViewerUseCaseImpl(FirebaseDataStore firebaseDataStore) {
        Intrinsics.checkNotNullParameter(firebaseDataStore, "firebaseDataStore");
        this.firebaseDataStore = firebaseDataStore;
    }

    @Override // com.medicmedia.medilink.domain.usecase.PdfViewerUseCase
    public boolean isPdfViewerEnabled() {
        return this.firebaseDataStore.enablePdfContentsForBrowser();
    }

    @Override // com.medicmedia.medilink.domain.usecase.PdfViewerUseCase
    public Set<String> getPdfExcludedIds() {
        return this.firebaseDataStore.getExcludedPdfIds();
    }
}
