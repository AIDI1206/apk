package com.medicmedia.medilink.datastore.firebase.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchItemFirestoreExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"convertToMap", "", "", "", "Lcom/medicmedia/medilink/datastore/firebase/models/SearchIItemFirestore;", SearchIntents.EXTRA_QUERY, "datastore_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SearchItemFirestoreExtensionKt {
    public static final Map<String, Object> convertToMap(SearchIItemFirestore searchIItemFirestore, String query) {
        Intrinsics.checkNotNullParameter(searchIItemFirestore, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        return MapsKt.mapOf(TuplesKt.to("updated_date", new Date()), TuplesKt.to("contents_id", searchIItemFirestore.getContents_id()), TuplesKt.to("contents_title", searchIItemFirestore.getContents_title()), TuplesKt.to(AnalyticsEvent.Param.ENTRY, searchIItemFirestore.getEntry()), TuplesKt.to("id", searchIItemFirestore.getId()), TuplesKt.to("index", Integer.valueOf(searchIItemFirestore.getIndex())), TuplesKt.to("input_keyword", query), TuplesKt.to("keyword", searchIItemFirestore.keyword), TuplesKt.to(FirebaseAnalytics.Param.LEVEL, Integer.valueOf(searchIItemFirestore.getLevel())), TuplesKt.to("refbody", searchIItemFirestore.getRefbody()), TuplesKt.to("refid", searchIItemFirestore.getRefid()), TuplesKt.to(HistoryRepositoryImpl.FieldName.TITLE, searchIItemFirestore.getTitle()));
    }
}
