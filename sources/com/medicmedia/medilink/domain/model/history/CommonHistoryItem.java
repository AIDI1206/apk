package com.medicmedia.medilink.domain.model.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.history.CommonHistoryItem;
import kotlin.Metadata;

/* JADX INFO: compiled from: HistoryItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002J/\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0002\u0010\u0017J#\u0010\u0016\u001a\u00028\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0018R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/model/history/CommonHistoryItem;", "SELF", "", "contentsId", "", "getContentsId", "()Ljava/lang/String;", "contentsTitle", "getContentsTitle", "url", "getUrl", "thumbnailUrl", "getThumbnailUrl", "videoThumbnailUrl", "getVideoThumbnailUrl", "isMasking", "", "()Z", "documentReferenceId", "getDocumentReferenceId", "isQbv4", "()Ljava/lang/Boolean;", "copyItem", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/domain/model/history/CommonHistoryItem;", "(Ljava/lang/String;Z)Lcom/medicmedia/medilink/domain/model/history/CommonHistoryItem;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface CommonHistoryItem<SELF extends CommonHistoryItem<SELF>> {
    SELF copyItem(String contentsTitle, String thumbnailUrl, boolean isMasking, Boolean isQbv4);

    SELF copyItem(String videoThumbnailUrl, boolean isMasking);

    String getContentsId();

    String getContentsTitle();

    String getDocumentReferenceId();

    String getThumbnailUrl();

    String getUrl();

    String getVideoThumbnailUrl();

    boolean isMasking();

    Boolean isQbv4();

    /* JADX INFO: compiled from: HistoryItem.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ CommonHistoryItem copyItem$default(CommonHistoryItem commonHistoryItem, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyItem");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return commonHistoryItem.copyItem(str, z);
        }
    }
}
