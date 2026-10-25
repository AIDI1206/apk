package com.medicmedia.medilink.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.firestore.DocumentSnapshot;
import com.medicmedia.medilink.datastore.model.NoteItem;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: compiled from: HistoryRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toNoteItemOrNull", "Lcom/medicmedia/medilink/datastore/model/NoteItem;", "Lcom/google/firebase/firestore/DocumentSnapshot;", "repository_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HistoryRepositoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NoteItem toNoteItemOrNull(DocumentSnapshot documentSnapshot) {
        Object objM11499constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl((NoteItem) documentSnapshot.toObject(NoteItem.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11505isFailureimpl(objM11499constructorimpl)) {
            objM11499constructorimpl = null;
        }
        return (NoteItem) objM11499constructorimpl;
    }
}
