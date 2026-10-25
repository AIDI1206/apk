package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.firebase.models.SearchIItemFirestore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchHistoryItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertTo", "Lcom/medicmedia/medilink/domain/model/SearchHistoryItem;", "Lcom/medicmedia/medilink/datastore/firebase/models/SearchIItemFirestore;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SearchHistoryItemKt {
    public static final SearchHistoryItem convertTo(SearchIItemFirestore searchIItemFirestore) {
        Intrinsics.checkNotNullParameter(searchIItemFirestore, "<this>");
        String str = searchIItemFirestore.input_keyword;
        if (str == null) {
            str = "";
        }
        String str2 = searchIItemFirestore.keyword;
        if (str2 == null) {
            str2 = "";
        }
        int index = searchIItemFirestore.getIndex();
        int level = searchIItemFirestore.getLevel();
        String refid = searchIItemFirestore.getRefid();
        if (refid == null) {
            refid = "";
        }
        String title = searchIItemFirestore.getTitle();
        if (title == null) {
            title = "";
        }
        String entry = searchIItemFirestore.getEntry();
        if (entry == null) {
            entry = "";
        }
        String id = searchIItemFirestore.getId();
        if (id == null) {
            id = "";
        }
        String refbody = searchIItemFirestore.getRefbody();
        if (refbody == null) {
            refbody = "";
        }
        String contents_id = searchIItemFirestore.getContents_id();
        if (contents_id == null) {
            contents_id = "";
        }
        String contents_title = searchIItemFirestore.getContents_title();
        if (contents_title == null) {
            contents_title = "";
        }
        return new SearchHistoryItem(str, str2, index, level, refid, title, entry, id, refbody, contents_id, contents_title, searchIItemFirestore.getUpdated_date());
    }
}
