package com.medicmedia.medilink.datastore.firebase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.WriteBatch;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: FirebaseDataStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\tH&J\b\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\tH&J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\tH¦@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0001H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0005H&J\b\u0010 \u001a\u00020\u0005H&J\b\u0010!\u001a\u00020\u000fH&J\b\u0010\"\u001a\u00020\u000fH&J\n\u0010#\u001a\u0004\u0018\u00010\tH&J\n\u0010$\u001a\u0004\u0018\u00010\tH&J\b\u0010%\u001a\u00020\tH&J\b\u0010&\u001a\u00020\u0005H&J\b\u0010'\u001a\u00020\u0005H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0)H&JB\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-0,0+\"\u0004\b\u0000\u0010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\tH&JB\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-0,02\"\u0004\b\u0000\u0010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\tH&JD\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-040+\"\u0004\b\u0000\u0010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0006\u0010\u0018\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H&Jd\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-040+\"\u0004\b\u0000\u0010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0006\u0010\u0018\u001a\u00020\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00109\u001a\u00020\u00052\u0016\b\u0002\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010,H&JR\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-040+\"\u0004\b\u0000\u0010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0006\u0010\u0018\u001a\u00020\t2\u001a\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000106\u0018\u00010,H&JE\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-0,0+\"\b\b\u0000\u0010-*\u00020\u00012\u0006\u0010>\u001a\u0002H-2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\tH&¢\u0006\u0002\u0010@JE\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-0,02\"\b\b\u0000\u0010-*\u00020\u00012\u0006\u0010>\u001a\u0002H-2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\tH&¢\u0006\u0002\u0010BJ2\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0+2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000104H&J*\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010E\u001a\u00020\t2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000104H&J*\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010\u0018\u001a\u00020\t2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000104H&J*\u0010G\u001a\b\u0012\u0004\u0012\u00020H022\u0006\u0010E\u001a\u00020\t2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020K0JH&J\u0018\u0010L\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH&J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010E\u001a\u00020\tH&J$\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010\u0018\u001a\u00020\t2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\t06H&J,\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010\u0018\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010Q\u001a\u00020RH&J,\u0010S\u001a\b\u0012\u0004\u0012\u00020\u0003022\u0006\u0010\u0018\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010Q\u001a\u00020RH&J \u0010T\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0001H&J4\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030+\"\b\b\u0000\u0010-*\u00020\u00012\u0006\u0010E\u001a\u00020\t2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H-04H&J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00030+H&J\b\u0010X\u001a\u00020\tH&¨\u0006Y"}, d2 = {"Lcom/medicmedia/medilink/datastore/firebase/FirebaseDataStore;", "", "setNetwork", "", "isEnable", "", "document", "Lcom/google/firebase/firestore/DocumentReference;", "path", "", "collection", "Lcom/google/firebase/firestore/CollectionReference;", "batch", "Lcom/google/firebase/firestore/WriteBatch;", "maxDeviceLimit", "", "externalBrowserUrls", "forcedUpdateString", "concatenatedToc", "forceOfflineSearchContents", "bookCategorySort", "fetchDocument", "Lkotlin/Result;", "Lcom/google/firebase/firestore/DocumentSnapshot;", "documentPath", "fetchDocument-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveDocument", "data", "saveDocument-0E7RQCE", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enableRootDetection", "enabledDashboard", "chatbotMaxMonthlyQueries", "chatbotMaxQueryLength", "movieToQbLink", "referenceValue", "contentOwnershipNoticeConfig", "enablePdfContentsForBrowser", "shouldGetVideoPDFInfoFromAPI", "getExcludedPdfIds", "", "getObject", "Lio/reactivex/Single;", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "documentId", "getObjectFlow", "Lkotlinx/coroutines/flow/Flow;", "getObjects", "", "queryTypes", "", "Lcom/medicmedia/medilink/datastore/firebase/FireStoreQueryType;", "orderKey", "isAscending", "equalPattern", "getObjectsWhereIn", "whereInPattern", "setObject", "item", "itemId", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "setObjectFlow", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "update", "updateInfo", "collectionPath", "updateDocumentField", "snapshotsFlow", "Lcom/google/firebase/firestore/QuerySnapshot;", "builder", "Lkotlin/Function1;", "Lcom/google/firebase/firestore/Query;", "delete", "deleteCollection", "deleteDocumentFields", "deletedFields", "deleteLimitOver", "limitCount", "", "deleteLimitOverFlow", "setItem", "setItems", FirebaseAnalytics.Param.ITEMS, "batchCommit", "firebaseToken", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface FirebaseDataStore {
    WriteBatch batch();

    Single<Unit> batchCommit();

    String bookCategorySort();

    long chatbotMaxMonthlyQueries();

    long chatbotMaxQueryLength();

    CollectionReference collection(String path);

    String concatenatedToc();

    String contentOwnershipNoticeConfig();

    void delete(String documentPath, String documentId);

    Single<Unit> deleteCollection(String collectionPath);

    Single<Unit> deleteDocumentFields(String documentPath, List<String> deletedFields);

    Single<Unit> deleteLimitOver(String documentPath, List<? extends FireStoreQueryType> queryTypes, int limitCount);

    Flow<Unit> deleteLimitOverFlow(String documentPath, List<? extends FireStoreQueryType> queryTypes, int limitCount);

    DocumentReference document(String path);

    boolean enablePdfContentsForBrowser();

    boolean enableRootDetection();

    boolean enabledDashboard();

    String externalBrowserUrls();

    /* JADX INFO: renamed from: fetchDocument-gIAlu-s, reason: not valid java name */
    Object mo10377fetchDocumentgIAlus(String str, Continuation<? super Result<? extends DocumentSnapshot>> continuation);

    String firebaseToken();

    String forceOfflineSearchContents();

    String forcedUpdateString();

    Set<String> getExcludedPdfIds();

    <T> Single<Pair<String, T>> getObject(Class<T> clazz, String path, String documentId);

    <T> Flow<Pair<String, T>> getObjectFlow(Class<T> clazz, String path, String documentId);

    <T> Single<Map<String, T>> getObjects(Class<T> clazz, String documentPath, String orderKey, boolean isAscending, Pair<String, ? extends Object> equalPattern);

    <T> Single<Map<String, T>> getObjects(Class<T> clazz, String documentPath, List<? extends FireStoreQueryType> queryTypes);

    <T> Single<Map<String, T>> getObjectsWhereIn(Class<T> clazz, String documentPath, Pair<String, ? extends List<? extends Object>> whereInPattern);

    long maxDeviceLimit();

    String movieToQbLink();

    String referenceValue();

    /* JADX INFO: renamed from: saveDocument-0E7RQCE, reason: not valid java name */
    Object mo10378saveDocument0E7RQCE(String str, Object obj, Continuation<? super Result<Unit>> continuation);

    void setItem(String documentPath, String documentId, Object data);

    <T> Single<Unit> setItems(String collectionPath, Map<String, ? extends T> items);

    void setNetwork(boolean isEnable);

    <T> Single<Pair<String, T>> setObject(T item, String itemId, String documentPath);

    <T> Flow<Pair<String, T>> setObjectFlow(T item, String itemId, String documentPath);

    boolean shouldGetVideoPDFInfoFromAPI();

    Flow<QuerySnapshot> snapshotsFlow(String collectionPath, Function1<? super CollectionReference, ? extends Query> builder);

    Single<String> update(String documentPath, String documentId, Map<String, ? extends Object> updateInfo);

    Single<Unit> update(String collectionPath, Map<String, ? extends Object> updateInfo);

    Single<Unit> updateDocumentField(String documentPath, Map<String, ? extends Object> updateInfo);

    /* JADX INFO: compiled from: FirebaseDataStore.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Single getObject$default(FirebaseDataStore firebaseDataStore, Class cls, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObject");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return firebaseDataStore.getObject(cls, str, str2);
        }

        public static /* synthetic */ Flow getObjectFlow$default(FirebaseDataStore firebaseDataStore, Class cls, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObjectFlow");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return firebaseDataStore.getObjectFlow(cls, str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Single getObjects$default(FirebaseDataStore firebaseDataStore, Class cls, String str, String str2, boolean z, Pair pair, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObjects");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            if ((i & 16) != 0) {
                pair = null;
            }
            return firebaseDataStore.getObjects(cls, str, str2, z, pair);
        }

        public static /* synthetic */ Single setObject$default(FirebaseDataStore firebaseDataStore, Object obj, String str, String str2, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setObject");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return firebaseDataStore.setObject(obj, str, str2);
        }

        public static /* synthetic */ Flow setObjectFlow$default(FirebaseDataStore firebaseDataStore, Object obj, String str, String str2, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setObjectFlow");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return firebaseDataStore.setObjectFlow(obj, str, str2);
        }
    }
}
