package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.history.BrowsingHistoryItem;
import com.medicmedia.medilink.domain.model.history.CommonHistoryItem;
import com.medicmedia.medilink.domain.model.history.WritingHistoryItem;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: HistoryUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH¦@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rH¦@¢\u0006\u0002\u0010\u000eJ,\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00120\r\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\rH&J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00120\r\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\rH&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0010H&J\u001c\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH¦@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH¦@¢\u0006\u0002\u0010\u001bJ$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH¦@¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/HistoryUseCase;", "", "historyTabIndex", "", "setHistoryTabIndex", "", "value", "fetchLastBrowsingHistoryItem", "Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;", "contentsId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchBrowsingHistoryItems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchWritingHistoryItems", "Lcom/medicmedia/medilink/domain/model/history/WritingHistoryItem;", "addContentsInfoToHistoryItem", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/medicmedia/medilink/domain/model/history/CommonHistoryItem;", FirebaseAnalytics.Param.ITEMS, "addVideoContentsInfoToHistoryItem", "updateViewDateOfNoteItem", "item", "deleteWritingHistoryItems", "referenceIds", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBrowsingHistoryItems", "searchByPrefixForBrowsingHistory", "propertyName", "keyword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface HistoryUseCase {
    <T extends CommonHistoryItem<T>> List<T> addContentsInfoToHistoryItem(List<? extends T> items);

    <T extends CommonHistoryItem<T>> List<T> addVideoContentsInfoToHistoryItem(List<? extends T> items);

    Object deleteBrowsingHistoryItems(Set<String> set, Continuation<? super Unit> continuation);

    Object deleteWritingHistoryItems(Set<String> set, Continuation<? super Unit> continuation);

    Object fetchBrowsingHistoryItems(Continuation<? super List<BrowsingHistoryItem>> continuation);

    Object fetchLastBrowsingHistoryItem(String str, Continuation<? super BrowsingHistoryItem> continuation);

    Object fetchWritingHistoryItems(Continuation<? super List<WritingHistoryItem>> continuation);

    int historyTabIndex();

    Object searchByPrefixForBrowsingHistory(String str, String str2, Continuation<? super List<BrowsingHistoryItem>> continuation);

    void setHistoryTabIndex(int value);

    void updateViewDateOfNoteItem(WritingHistoryItem item);
}
