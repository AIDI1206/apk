package com.medicmedia.medilink.domain.model;

import android.os.Environment;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.gson.Gson;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.data.repository.UserDataRepositoryImpl;
import com.medicmedia.medilink.database.models.BookShelfContentType;
import com.medicmedia.medilink.domain.VideoCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BookShelfViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u009a\u00012\u00020\u0001:\u0006\u009a\u0001\u009b\u0001\u009c\u0001BÅ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J\u0006\u0010$\u001a\u00020\u0005J\u0006\u0010g\u001a\u00020\u0012J\u0006\u0010h\u001a\u00020\u0012J\u0006\u0010i\u001a\u00020\u0012J\u0006\u0010j\u001a\u00020\u0012J\u0006\u0010k\u001a\u00020\u0012J\u0006\u0010l\u001a\u00020\u0012J\u0006\u0010m\u001a\u00020\u0012J\b\u0010n\u001a\u00020\u0012H\u0002J\b\u0010o\u001a\u0004\u0018\u00010pJ\u0006\u0010q\u001a\u00020\u0012J\r\u0010r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00108J\u0006\u0010s\u001a\u00020\u0005J\u0006\u0010t\u001a\u00020\u0005J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0005HÆ\u0003J\t\u0010{\u001a\u00020\u0005HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010:J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010:J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0012HÆ\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003JÎ\u0002\u0010\u0093\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u0003HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0016\u0010\u0095\u0001\u001a\u00020\u00122\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001HÖ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0099\u0001\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010;\u001a\u0004\b\u0011\u0010:R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010;\u001a\u0004\b\u0013\u0010:R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010,R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010KR\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010,R\u001a\u0010!\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010?\"\u0004\bM\u0010NR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\bO\u00108\"\u0004\bP\u0010QR\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010,\"\u0004\bS\u0010TR\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010,R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010,R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010*R\u001b\u0010X\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bX\u0010?R\u001b\u0010[\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010Z\u001a\u0004\b[\u0010?R\u0011\u0010]\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b]\u0010?R\u0011\u0010^\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b^\u0010?R\u001d\u0010_\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010Z\u001a\u0004\b`\u0010,R\u0011\u0010b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bb\u0010?R\u0011\u0010c\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bc\u0010?R\u001d\u0010d\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010Z\u001a\u0004\be\u0010,¨\u0006\u009d\u0001"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "Lcom/medicmedia/medilink/domain/model/RecyclerViewItem;", "possession", "", "dirName", "", "fileName", RemoteConfigComponent.ACTIVATE_FILE_NAME, "openDate", "closeDate", "option", "thumbnailUrl", "fileSize", "storeUrl", HistoryRepositoryImpl.FieldName.TITLE, "phonetic", "dataYear", "isQb", "", "isCbt", WorkerKey.KEY_VERSION, "id", "updateFlag", "category", HistoryRepositoryImpl.Path.TAGS, "", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem$Tag;", UserDataRepositoryImpl.Path.RESUME, "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem$Resume;", WorkerKey.KEY_DOWNLOAD_ID, "", NotificationCompat.CATEGORY_STATUS, "updateVersion", "isUnDisplay", "userSortIndex", "dirPath", "tagPrefix", "globalReadDate", "sortOrderWithinCategory", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/medicmedia/medilink/domain/model/BookShelfViewItem$Resume;JILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getPossession", "()I", "getDirName", "()Ljava/lang/String;", "getFileName", "getActivate", "getOpenDate", "getCloseDate", "getOption", "getThumbnailUrl", "getFileSize", "getStoreUrl", "getTitle", "getPhonetic", "getDataYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVersion", "getId", "getUpdateFlag", "()Z", "getCategory", "getTags", "()Ljava/util/List;", "getResume", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem$Resume;", "getDownloadId", "()J", "setDownloadId", "(J)V", "getStatus", "setStatus", "(I)V", "getUpdateVersion", "setUnDisplay", "(Z)V", "getUserSortIndex", "setUserSortIndex", "(Ljava/lang/Integer;)V", "getDirPath", "setDirPath", "(Ljava/lang/String;)V", "getTagPrefix", "getGlobalReadDate", "getSortOrderWithinCategory", "isOnline", "isOnline$delegate", "Lkotlin/Lazy;", "isChatbot", "isChatbot$delegate", "isNative", "isOtherBrowser", "contentsUrl", "getContentsUrl", "contentsUrl$delegate", "isIshikokushi", "isNotEnoughStorageSpace", "titleCode", "getTitleCode", "titleCode$delegate", "isNeedUpdateVersion", "isMinorUpdateVersion", "isComplete", "isVideoContents", "hasHtml", "hasPdf", "isPdf", "isDownloadableContent", "getContentType", "Lcom/medicmedia/medilink/database/models/BookShelfContentType;", "isQbv4", "qbVersion", "tagToJsonString", "resumeToJsonString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/medicmedia/medilink/domain/model/BookShelfViewItem$Resume;JILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "equals", "other", "", "hashCode", "toString", "Companion", "Tag", "Resume", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BookShelfViewItem extends RecyclerViewItem {
    private static final Set<String> VIDEO_CONTENT_IDS;
    private final int activate;
    private final String category;
    private final String closeDate;

    /* JADX INFO: renamed from: contentsUrl$delegate, reason: from kotlin metadata */
    private final Lazy contentsUrl;
    private final Integer dataYear;
    private final String dirName;
    private String dirPath;
    private long downloadId;
    private final String fileName;
    private final int fileSize;
    private final String globalReadDate;
    private final String id;
    private final Boolean isCbt;

    /* JADX INFO: renamed from: isChatbot$delegate, reason: from kotlin metadata */
    private final Lazy isChatbot;
    private final boolean isIshikokushi;

    /* JADX INFO: renamed from: isOnline$delegate, reason: from kotlin metadata */
    private final Lazy isOnline;
    private final Boolean isQb;
    private boolean isUnDisplay;
    private final String openDate;
    private final String option;
    private final String phonetic;
    private final int possession;
    private final Resume resume;
    private final int sortOrderWithinCategory;
    private int status;
    private final String storeUrl;
    private final String tagPrefix;
    private final List<Tag> tags;
    private final String thumbnailUrl;
    private final String title;

    /* JADX INFO: renamed from: titleCode$delegate, reason: from kotlin metadata */
    private final Lazy titleCode;
    private final boolean updateFlag;
    private final String updateVersion;
    private Integer userSortIndex;
    private final String version;

    public BookShelfViewItem() {
        this(0, null, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, 0L, 0, null, false, null, null, null, null, 0, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BookShelfViewItem copy$default(BookShelfViewItem bookShelfViewItem, int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, Integer num, Boolean bool, Boolean bool2, String str10, String str11, boolean z, String str12, List list, Resume resume, long j, int i4, String str13, boolean z2, Integer num2, String str14, String str15, String str16, int i5, int i6, Object obj) {
        int i7;
        String str17;
        int i8 = (i6 & 1) != 0 ? bookShelfViewItem.possession : i;
        String str18 = (i6 & 2) != 0 ? bookShelfViewItem.dirName : str;
        String str19 = (i6 & 4) != 0 ? bookShelfViewItem.fileName : str2;
        int i9 = (i6 & 8) != 0 ? bookShelfViewItem.activate : i2;
        String str20 = (i6 & 16) != 0 ? bookShelfViewItem.openDate : str3;
        String str21 = (i6 & 32) != 0 ? bookShelfViewItem.closeDate : str4;
        String str22 = (i6 & 64) != 0 ? bookShelfViewItem.option : str5;
        String str23 = (i6 & 128) != 0 ? bookShelfViewItem.thumbnailUrl : str6;
        int i10 = (i6 & 256) != 0 ? bookShelfViewItem.fileSize : i3;
        String str24 = (i6 & 512) != 0 ? bookShelfViewItem.storeUrl : str7;
        String str25 = (i6 & 1024) != 0 ? bookShelfViewItem.title : str8;
        String str26 = (i6 & 2048) != 0 ? bookShelfViewItem.phonetic : str9;
        Integer num3 = (i6 & 4096) != 0 ? bookShelfViewItem.dataYear : num;
        Boolean bool3 = (i6 & 8192) != 0 ? bookShelfViewItem.isQb : bool;
        int i11 = i8;
        Boolean bool4 = (i6 & 16384) != 0 ? bookShelfViewItem.isCbt : bool2;
        String str27 = (i6 & 32768) != 0 ? bookShelfViewItem.version : str10;
        String str28 = (i6 & 65536) != 0 ? bookShelfViewItem.id : str11;
        boolean z3 = (i6 & 131072) != 0 ? bookShelfViewItem.updateFlag : z;
        String str29 = (i6 & 262144) != 0 ? bookShelfViewItem.category : str12;
        List list2 = (i6 & 524288) != 0 ? bookShelfViewItem.tags : list;
        Resume resume2 = (i6 & 1048576) != 0 ? bookShelfViewItem.resume : resume;
        Boolean bool5 = bool4;
        long j2 = (i6 & 2097152) != 0 ? bookShelfViewItem.downloadId : j;
        int i12 = (i6 & 4194304) != 0 ? bookShelfViewItem.status : i4;
        String str30 = (i6 & 8388608) != 0 ? bookShelfViewItem.updateVersion : str13;
        int i13 = i12;
        boolean z4 = (i6 & 16777216) != 0 ? bookShelfViewItem.isUnDisplay : z2;
        Integer num4 = (i6 & 33554432) != 0 ? bookShelfViewItem.userSortIndex : num2;
        String str31 = (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? bookShelfViewItem.dirPath : str14;
        String str32 = (i6 & 134217728) != 0 ? bookShelfViewItem.tagPrefix : str15;
        String str33 = (i6 & 268435456) != 0 ? bookShelfViewItem.globalReadDate : str16;
        if ((i6 & 536870912) != 0) {
            str17 = str33;
            i7 = bookShelfViewItem.sortOrderWithinCategory;
        } else {
            i7 = i5;
            str17 = str33;
        }
        return bookShelfViewItem.copy(i11, str18, str19, i9, str20, str21, str22, str23, i10, str24, str25, str26, num3, bool3, bool5, str27, str28, z3, str29, list2, resume2, j2, i13, str30, z4, num4, str31, str32, str17, i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPossession() {
        return this.possession;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStoreUrl() {
        return this.storeUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPhonetic() {
        return this.phonetic;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getDataYear() {
        return this.dataYear;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsQb() {
        return this.isQb;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsCbt() {
        return this.isCbt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getUpdateFlag() {
        return this.updateFlag;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirName() {
        return this.dirName;
    }

    public final List<Tag> component20() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Resume getResume() {
        return this.resume;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getDownloadId() {
        return this.downloadId;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getUpdateVersion() {
        return this.updateVersion;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsUnDisplay() {
        return this.isUnDisplay;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getUserSortIndex() {
        return this.userSortIndex;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDirPath() {
        return this.dirPath;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTagPrefix() {
        return this.tagPrefix;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getGlobalReadDate() {
        return this.globalReadDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getSortOrderWithinCategory() {
        return this.sortOrderWithinCategory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getActivate() {
        return this.activate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCloseDate() {
        return this.closeDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    public final BookShelfViewItem copy(int possession, String dirName, String fileName, int activate, String openDate, String closeDate, String option, String thumbnailUrl, int fileSize, String storeUrl, String title, String phonetic, Integer dataYear, Boolean isQb, Boolean isCbt, String version, String id, boolean updateFlag, String category, List<Tag> tags, Resume resume, long downloadId, int status, String updateVersion, boolean isUnDisplay, Integer userSortIndex, String dirPath, String tagPrefix, String globalReadDate, int sortOrderWithinCategory) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(closeDate, "closeDate");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(storeUrl, "storeUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(phonetic, "phonetic");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(updateVersion, "updateVersion");
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(tagPrefix, "tagPrefix");
        Intrinsics.checkNotNullParameter(globalReadDate, "globalReadDate");
        return new BookShelfViewItem(possession, dirName, fileName, activate, openDate, closeDate, option, thumbnailUrl, fileSize, storeUrl, title, phonetic, dataYear, isQb, isCbt, version, id, updateFlag, category, tags, resume, downloadId, status, updateVersion, isUnDisplay, userSortIndex, dirPath, tagPrefix, globalReadDate, sortOrderWithinCategory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookShelfViewItem)) {
            return false;
        }
        BookShelfViewItem bookShelfViewItem = (BookShelfViewItem) other;
        return this.possession == bookShelfViewItem.possession && Intrinsics.areEqual(this.dirName, bookShelfViewItem.dirName) && Intrinsics.areEqual(this.fileName, bookShelfViewItem.fileName) && this.activate == bookShelfViewItem.activate && Intrinsics.areEqual(this.openDate, bookShelfViewItem.openDate) && Intrinsics.areEqual(this.closeDate, bookShelfViewItem.closeDate) && Intrinsics.areEqual(this.option, bookShelfViewItem.option) && Intrinsics.areEqual(this.thumbnailUrl, bookShelfViewItem.thumbnailUrl) && this.fileSize == bookShelfViewItem.fileSize && Intrinsics.areEqual(this.storeUrl, bookShelfViewItem.storeUrl) && Intrinsics.areEqual(this.title, bookShelfViewItem.title) && Intrinsics.areEqual(this.phonetic, bookShelfViewItem.phonetic) && Intrinsics.areEqual(this.dataYear, bookShelfViewItem.dataYear) && Intrinsics.areEqual(this.isQb, bookShelfViewItem.isQb) && Intrinsics.areEqual(this.isCbt, bookShelfViewItem.isCbt) && Intrinsics.areEqual(this.version, bookShelfViewItem.version) && Intrinsics.areEqual(this.id, bookShelfViewItem.id) && this.updateFlag == bookShelfViewItem.updateFlag && Intrinsics.areEqual(this.category, bookShelfViewItem.category) && Intrinsics.areEqual(this.tags, bookShelfViewItem.tags) && Intrinsics.areEqual(this.resume, bookShelfViewItem.resume) && this.downloadId == bookShelfViewItem.downloadId && this.status == bookShelfViewItem.status && Intrinsics.areEqual(this.updateVersion, bookShelfViewItem.updateVersion) && this.isUnDisplay == bookShelfViewItem.isUnDisplay && Intrinsics.areEqual(this.userSortIndex, bookShelfViewItem.userSortIndex) && Intrinsics.areEqual(this.dirPath, bookShelfViewItem.dirPath) && Intrinsics.areEqual(this.tagPrefix, bookShelfViewItem.tagPrefix) && Intrinsics.areEqual(this.globalReadDate, bookShelfViewItem.globalReadDate) && this.sortOrderWithinCategory == bookShelfViewItem.sortOrderWithinCategory;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((Integer.hashCode(this.possession) * 31) + this.dirName.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.activate)) * 31) + this.openDate.hashCode()) * 31) + this.closeDate.hashCode()) * 31) + this.option.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + Integer.hashCode(this.fileSize)) * 31) + this.storeUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.phonetic.hashCode()) * 31;
        Integer num = this.dataYear;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isQb;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCbt;
        int iHashCode4 = (((((((((iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.version.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.updateFlag)) * 31) + this.category.hashCode()) * 31;
        List<Tag> list = this.tags;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Resume resume = this.resume;
        int iHashCode6 = (((((((((iHashCode5 + (resume == null ? 0 : resume.hashCode())) * 31) + Long.hashCode(this.downloadId)) * 31) + Integer.hashCode(this.status)) * 31) + this.updateVersion.hashCode()) * 31) + Boolean.hashCode(this.isUnDisplay)) * 31;
        Integer num2 = this.userSortIndex;
        return ((((((((iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.dirPath.hashCode()) * 31) + this.tagPrefix.hashCode()) * 31) + this.globalReadDate.hashCode()) * 31) + Integer.hashCode(this.sortOrderWithinCategory);
    }

    public String toString() {
        return "BookShelfViewItem(possession=" + this.possession + ", dirName=" + this.dirName + ", fileName=" + this.fileName + ", activate=" + this.activate + ", openDate=" + this.openDate + ", closeDate=" + this.closeDate + ", option=" + this.option + ", thumbnailUrl=" + this.thumbnailUrl + ", fileSize=" + this.fileSize + ", storeUrl=" + this.storeUrl + ", title=" + this.title + ", phonetic=" + this.phonetic + ", dataYear=" + this.dataYear + ", isQb=" + this.isQb + ", isCbt=" + this.isCbt + ", version=" + this.version + ", id=" + this.id + ", updateFlag=" + this.updateFlag + ", category=" + this.category + ", tags=" + this.tags + ", resume=" + this.resume + ", downloadId=" + this.downloadId + ", status=" + this.status + ", updateVersion=" + this.updateVersion + ", isUnDisplay=" + this.isUnDisplay + ", userSortIndex=" + this.userSortIndex + ", dirPath=" + this.dirPath + ", tagPrefix=" + this.tagPrefix + ", globalReadDate=" + this.globalReadDate + ", sortOrderWithinCategory=" + this.sortOrderWithinCategory + ")";
    }

    public /* synthetic */ BookShelfViewItem(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, Integer num, Boolean bool, Boolean bool2, String str10, String str11, boolean z, String str12, List list, Resume resume, long j, int i4, String str13, boolean z2, Integer num2, String str14, String str15, String str16, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? "" : str3, (i6 & 32) != 0 ? "" : str4, (i6 & 64) != 0 ? "" : str5, (i6 & 128) != 0 ? "" : str6, (i6 & 256) != 0 ? 0 : i3, (i6 & 512) != 0 ? "" : str7, (i6 & 1024) != 0 ? "" : str8, (i6 & 2048) != 0 ? "" : str9, (i6 & 4096) != 0 ? null : num, (i6 & 8192) != 0 ? null : bool, (i6 & 16384) != 0 ? null : bool2, (i6 & 32768) != 0 ? "" : str10, (i6 & 65536) != 0 ? "" : str11, (i6 & 131072) != 0 ? false : z, (i6 & 262144) != 0 ? "" : str12, (i6 & 524288) != 0 ? null : list, (i6 & 1048576) != 0 ? null : resume, (i6 & 2097152) != 0 ? 0L : j, (i6 & 4194304) != 0 ? 0 : i4, (i6 & 8388608) != 0 ? "" : str13, (i6 & 16777216) != 0 ? false : z2, (i6 & 33554432) == 0 ? num2 : null, (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? "" : str14, (i6 & 134217728) != 0 ? "" : str15, (i6 & 268435456) == 0 ? str16 : "", (i6 & 536870912) != 0 ? 0 : i5);
    }

    public final int getPossession() {
        return this.possession;
    }

    public final String getDirName() {
        return this.dirName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getActivate() {
        return this.activate;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final String getCloseDate() {
        return this.closeDate;
    }

    public final String getOption() {
        return this.option;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final String getStoreUrl() {
        return this.storeUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPhonetic() {
        return this.phonetic;
    }

    public final Integer getDataYear() {
        return this.dataYear;
    }

    public final Boolean isQb() {
        return this.isQb;
    }

    public final Boolean isCbt() {
        return this.isCbt;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getUpdateFlag() {
        return this.updateFlag;
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<Tag> getTags() {
        return this.tags;
    }

    public final Resume getResume() {
        return this.resume;
    }

    public final long getDownloadId() {
        return this.downloadId;
    }

    public final void setDownloadId(long j) {
        this.downloadId = j;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final String getUpdateVersion() {
        return this.updateVersion;
    }

    public final boolean isUnDisplay() {
        return this.isUnDisplay;
    }

    public final void setUnDisplay(boolean z) {
        this.isUnDisplay = z;
    }

    public final Integer getUserSortIndex() {
        return this.userSortIndex;
    }

    public final void setUserSortIndex(Integer num) {
        this.userSortIndex = num;
    }

    public final String getDirPath() {
        return this.dirPath;
    }

    public final void setDirPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dirPath = str;
    }

    public final String getTagPrefix() {
        return this.tagPrefix;
    }

    public final String getGlobalReadDate() {
        return this.globalReadDate;
    }

    public final int getSortOrderWithinCategory() {
        return this.sortOrderWithinCategory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookShelfViewItem(int i, String dirName, String fileName, int i2, String openDate, String closeDate, String option, String thumbnailUrl, int i3, String storeUrl, String title, String phonetic, Integer num, Boolean bool, Boolean bool2, String version, String id, boolean z, String category, List<Tag> list, Resume resume, long j, int i4, String updateVersion, boolean z2, Integer num2, String dirPath, String tagPrefix, String globalReadDate, int i5) {
        super(ContentsItemLevel.BOOK.getValue());
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(closeDate, "closeDate");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(storeUrl, "storeUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(phonetic, "phonetic");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(updateVersion, "updateVersion");
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(tagPrefix, "tagPrefix");
        Intrinsics.checkNotNullParameter(globalReadDate, "globalReadDate");
        this.possession = i;
        this.dirName = dirName;
        this.fileName = fileName;
        this.activate = i2;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.option = option;
        this.thumbnailUrl = thumbnailUrl;
        this.fileSize = i3;
        this.storeUrl = storeUrl;
        this.title = title;
        this.phonetic = phonetic;
        this.dataYear = num;
        this.isQb = bool;
        this.isCbt = bool2;
        this.version = version;
        this.id = id;
        this.updateFlag = z;
        this.category = category;
        this.tags = list;
        this.resume = resume;
        this.downloadId = j;
        this.status = i4;
        this.updateVersion = updateVersion;
        this.isUnDisplay = z2;
        this.userSortIndex = num2;
        this.dirPath = dirPath;
        this.tagPrefix = tagPrefix;
        this.globalReadDate = globalReadDate;
        this.sortOrderWithinCategory = i5;
        this.isOnline = LazyKt.lazy(new Function0() { // from class: com.medicmedia.medilink.domain.model.BookShelfViewItem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(BookShelfViewItem.isOnline_delegate$lambda$3(this.f$0));
            }
        });
        this.isChatbot = LazyKt.lazy(new Function0() { // from class: com.medicmedia.medilink.domain.model.BookShelfViewItem$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(BookShelfViewItem.isChatbot_delegate$lambda$7(this.f$0));
            }
        });
        this.contentsUrl = LazyKt.lazy(new Function0() { // from class: com.medicmedia.medilink.domain.model.BookShelfViewItem$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BookShelfViewItem.contentsUrl_delegate$lambda$11(this.f$0);
            }
        });
        this.isIshikokushi = Intrinsics.areEqual(id, QBConstants.CONTENT_CODE_ISHIKOKUSHI);
        this.titleCode = LazyKt.lazy(new Function0() { // from class: com.medicmedia.medilink.domain.model.BookShelfViewItem$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BookShelfViewItem.titleCode_delegate$lambda$15(this.f$0);
            }
        });
    }

    static {
        EnumEntries<VideoCode> entries = VideoCode.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator<VideoCode> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        VIDEO_CONTENT_IDS = CollectionsKt.toSet(arrayList);
    }

    /* JADX INFO: compiled from: BookShelfViewItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookShelfViewItem$Tag;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Tag {
        private final String name;

        public static /* synthetic */ Tag copy$default(Tag tag, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tag.name;
            }
            return tag.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Tag copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Tag(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tag) && Intrinsics.areEqual(this.name, ((Tag) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "Tag(name=" + this.name + ")";
        }

        public Tag(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: BookShelfViewItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookShelfViewItem$Resume;", "", "info", "", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "getDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Resume {
        private final String date;
        private final String info;

        public static /* synthetic */ Resume copy$default(Resume resume, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resume.info;
            }
            if ((i & 2) != 0) {
                str2 = resume.date;
            }
            return resume.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final Resume copy(String info, String date) {
            return new Resume(info, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resume)) {
                return false;
            }
            Resume resume = (Resume) other;
            return Intrinsics.areEqual(this.info, resume.info) && Intrinsics.areEqual(this.date, resume.date);
        }

        public int hashCode() {
            String str = this.info;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.date;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Resume(info=" + this.info + ", date=" + this.date + ")";
        }

        public Resume(String str, String str2) {
            this.info = str;
            this.date = str2;
        }

        public final String getInfo() {
            return this.info;
        }

        public final String getDate() {
            return this.date;
        }
    }

    public final boolean isOnline() {
        return ((Boolean) this.isOnline.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isOnline_delegate$lambda$3(BookShelfViewItem bookShelfViewItem) {
        Object objM11499constructorimpl;
        String str = bookShelfViewItem.option;
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(Boolean.valueOf(new JSONObject(str).getInt("is_online") == 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        return Intrinsics.areEqual(Result.m11505isFailureimpl(objM11499constructorimpl) ? null : objM11499constructorimpl, (Object) true);
    }

    public final boolean isChatbot() {
        return ((Boolean) this.isChatbot.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isChatbot_delegate$lambda$7(BookShelfViewItem bookShelfViewItem) {
        Object objM11499constructorimpl;
        String str = bookShelfViewItem.option;
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(Boolean.valueOf(Intrinsics.areEqual(new JSONObject(str).getString(FirebaseAnalytics.Param.CONTENT_TYPE), "chatbot")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        return Intrinsics.areEqual(Result.m11505isFailureimpl(objM11499constructorimpl) ? null : objM11499constructorimpl, (Object) true);
    }

    public final boolean isNative() {
        if (this.option.length() == 0) {
            return false;
        }
        try {
            return new JSONObject(this.option).has("is_native");
        } catch (JSONException e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            return false;
        }
    }

    public final boolean isOtherBrowser() {
        if (this.option.length() == 0) {
            return false;
        }
        try {
            return new JSONObject(this.option).has("is_other_browser");
        } catch (JSONException e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            return false;
        }
    }

    public final String getContentsUrl() {
        return (String) this.contentsUrl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentsUrl_delegate$lambda$11(BookShelfViewItem bookShelfViewItem) {
        Object objM11499constructorimpl;
        String str = bookShelfViewItem.option;
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(new JSONObject(str).getString("content_url"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m11505isFailureimpl(objM11499constructorimpl) ? null : objM11499constructorimpl);
    }

    /* JADX INFO: renamed from: isIshikokushi, reason: from getter */
    public final boolean getIsIshikokushi() {
        return this.isIshikokushi;
    }

    public final boolean isNotEnoughStorageSpace() {
        long j = 1024;
        return ((((long) this.fileSize) * j) * j) * ((long) 2) > Environment.getDataDirectory().getFreeSpace();
    }

    public final String getTitleCode() {
        return (String) this.titleCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String titleCode_delegate$lambda$15(BookShelfViewItem bookShelfViewItem) {
        Object objM11499constructorimpl;
        String str = bookShelfViewItem.option;
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(new JSONObject(str).getString("path"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m11505isFailureimpl(objM11499constructorimpl) ? null : objM11499constructorimpl);
    }

    public final String tagPrefix() {
        if (this.option.length() == 0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(this.option);
            return jSONObject.has("tag_prefix") ? jSONObject.getString("tag_prefix") : "";
        } catch (JSONException e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            return "";
        }
    }

    public final boolean isNeedUpdateVersion() {
        return this.updateVersion.length() > 0;
    }

    public final boolean isMinorUpdateVersion() {
        return this.updateVersion.length() > 0 && isComplete();
    }

    public final boolean isComplete() {
        int i = this.status;
        return i == 8 || i == 9;
    }

    public final boolean isVideoContents() {
        if (this.id.length() > 0) {
            return VIDEO_CONTENT_IDS.contains(this.id);
        }
        return false;
    }

    public final boolean hasHtml() {
        if (isDownloadableContent()) {
            return getContentType() == null || getContentType() == BookShelfContentType.HTML || getContentType() == BookShelfContentType.BOTH;
        }
        return false;
    }

    public final boolean hasPdf() {
        if (isDownloadableContent()) {
            return isPdf() || getContentType() == BookShelfContentType.BOTH;
        }
        return false;
    }

    public final boolean isPdf() {
        return getContentType() == BookShelfContentType.PDF;
    }

    private final boolean isDownloadableContent() {
        return (isVideoContents() || isChatbot() || isOnline()) ? false : true;
    }

    public final BookShelfContentType getContentType() {
        if (this.option.length() == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.option);
            if (!jSONObject.has(FirebaseAnalytics.Param.CONTENT_TYPE)) {
                return null;
            }
            BookShelfContentType.Companion companion = BookShelfContentType.INSTANCE;
            String string = jSONObject.getString(FirebaseAnalytics.Param.CONTENT_TYPE);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return companion.convertTo(string);
        } catch (JSONException e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            return null;
        }
    }

    public final boolean isQbv4() {
        Integer numQbVersion = qbVersion();
        return numQbVersion != null && numQbVersion.intValue() == 4;
    }

    public final Integer qbVersion() {
        if (this.option.length() <= 0) {
            return null;
        }
        try {
            return Integer.valueOf(new JSONObject(this.option).getInt("qb_version"));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String tagToJsonString() {
        List<Tag> list = this.tags;
        if (list == null || list.isEmpty()) {
            return "";
        }
        try {
            return new JSONArray((Collection) list).toString();
        } catch (JSONException e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            return "";
        }
    }

    public final String resumeToJsonString() {
        String json;
        return (this.resume == null || (json = new Gson().toJson(this)) == null) ? "" : json;
    }
}
