package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\bg\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BÉ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00100\u001a\u000201¢\u0006\u0004\b2\u00103J\u000e\u0010m\u001a\u00020\u00042\u0006\u0010n\u001a\u00020\u0004J\u000b\u0010o\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010p\u001a\u00020\u0006HÆ\u0003J\t\u0010q\u001a\u00020\u0006HÆ\u0003J\t\u0010r\u001a\u00020\u0006HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\t\u0010t\u001a\u00020\u0006HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010x\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\u0012\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0003J\u0012\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0002\u0010YJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0002\u0010`J\n\u0010\u0094\u0001\u001a\u000201HÆ\u0003JÚ\u0003\u0010\u0095\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u000201HÆ\u0001¢\u0006\u0003\u0010\u0096\u0001J\u0016\u0010\u0097\u0001\u001a\u0002012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001HÖ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010\u009b\u0001\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\b@\u0010;R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\bI\u0010;R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\bJ\u0010;R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00105R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\b\u0019\u0010;R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\bL\u0010;R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\bM\u0010;R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00105R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00105R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00105R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00105R\u0015\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\bR\u0010;R\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bU\u0010TR\u0013\u0010&\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00105R\u0015\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\bW\u0010;R\u0015\u0010(\u001a\u0004\u0018\u00010)¢\u0006\n\n\u0002\u0010Z\u001a\u0004\bX\u0010YR\u0015\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010<\u001a\u0004\b[\u0010;R\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010-\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b^\u0010]R\u0015\u0010.\u001a\u0004\u0018\u00010/¢\u0006\n\n\u0002\u0010a\u001a\u0004\b_\u0010`R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b0\u0010bR\u0011\u0010c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bd\u00105R\u0013\u0010e\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bf\u00105R\u0011\u0010g\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bh\u00105R\u0013\u0010i\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bj\u0010]R\u0011\u0010k\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bl\u00105¨\u0006\u009c\u0001"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "Lcom/medicmedia/medilink/domain/model/VideoItemInterface;", "Lcom/medicmedia/medilink/domain/model/RecyclerViewItem;", "documentId", "", BundleKey.VIDEO_ID, "", "courseId", "chapterId", "subcategoryId", "displayOrder", "videoTitle", "detail", "recommend", "linkCode1", "linkCode2", "linkCode3", "linkUrl1", "linkUrl2", "linkUrl3", "videoCode", "lecture", "playTimeMin", "playTimeSec", "viewConditionId", "isCbt", "frequentOrder", "videogId", HistoryRepositoryImpl.FieldName.TITLE, "thumbnailXl", "thumbnailL", "videoHash", "courseVideoId", "qbQuestions", "", "Lcom/medicmedia/medilink/domain/model/VideoQBQuestion;", "refItems", "Lcom/medicmedia/medilink/domain/model/VideoRefItem;", "inputCardUrl", "downloadable", "srcSize", "", "videoNumber", "downloadDate", "Ljava/util/Date;", "lastViewDate", "userPlayTimeSec", "", "isComplete", "", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Long;Z)V", "getDocumentId", "()Ljava/lang/String;", "getVideoId", "()I", "getCourseId", "getChapterId", "getSubcategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisplayOrder", "getVideoTitle", "getDetail", "getRecommend", "getLinkCode1", "getLinkCode2", "getLinkCode3", "getLinkUrl1", "getLinkUrl2", "getLinkUrl3", "getVideoCode", "getLecture", "getPlayTimeMin", "getPlayTimeSec", "getViewConditionId", "getFrequentOrder", "getVideogId", "getTitle", "getThumbnailXl", "getThumbnailL", "getVideoHash", "getCourseVideoId", "getQbQuestions", "()Ljava/util/List;", "getRefItems", "getInputCardUrl", "getDownloadable", "getSrcSize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVideoNumber", "getDownloadDate", "()Ljava/util/Date;", "getLastViewDate", "getUserPlayTimeSec", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "displayPlayTime", "getDisplayPlayTime", "timeLabel", "getTimeLabel", "playSec", "getPlaySec", "expireDate", "getExpireDate", "qbQuestionsQuery", "getQbQuestionsQuery", "historyContentId", "contentId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(Ljava/lang/String;IIILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Long;Z)Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "equals", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoSubItem extends RecyclerViewItem implements VideoItemInterface {
    private final int chapterId;
    private final int courseId;
    private final Integer courseVideoId;
    private final String detail;
    private final int displayOrder;
    private final String documentId;
    private final Date downloadDate;
    private final Integer downloadable;
    private final Date expireDate;
    private final Integer frequentOrder;
    private final String inputCardUrl;
    private final Integer isCbt;
    private final boolean isComplete;
    private final Date lastViewDate;
    private final String lecture;
    private final String linkCode1;
    private final String linkCode2;
    private final String linkCode3;
    private final String linkUrl1;
    private final String linkUrl2;
    private final String linkUrl3;
    private final Integer playTimeMin;
    private final Integer playTimeSec;
    private final List<VideoQBQuestion> qbQuestions;
    private final Integer recommend;
    private final List<VideoRefItem> refItems;
    private final Double srcSize;
    private final Integer subcategoryId;
    private final String thumbnailL;
    private final String thumbnailXl;
    private final String title;
    private final Long userPlayTimeSec;
    private final String videoCode;
    private final String videoHash;
    private final int videoId;
    private final Integer videoNumber;
    private final String videoTitle;
    private final Integer videogId;
    private final String viewConditionId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoSubItem copy$default(VideoSubItem videoSubItem, String str, int i, int i2, int i3, Integer num, int i4, String str2, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num3, Integer num4, String str12, Integer num5, Integer num6, Integer num7, String str13, String str14, String str15, String str16, Integer num8, List list, List list2, String str17, Integer num9, Double d, Integer num10, Date date, Date date2, Long l, boolean z, int i5, int i6, Object obj) {
        boolean z2;
        Long l2;
        String str18 = (i5 & 1) != 0 ? videoSubItem.documentId : str;
        int i7 = (i5 & 2) != 0 ? videoSubItem.videoId : i;
        int i8 = (i5 & 4) != 0 ? videoSubItem.courseId : i2;
        int i9 = (i5 & 8) != 0 ? videoSubItem.chapterId : i3;
        Integer num11 = (i5 & 16) != 0 ? videoSubItem.subcategoryId : num;
        int i10 = (i5 & 32) != 0 ? videoSubItem.displayOrder : i4;
        String str19 = (i5 & 64) != 0 ? videoSubItem.videoTitle : str2;
        String str20 = (i5 & 128) != 0 ? videoSubItem.detail : str3;
        Integer num12 = (i5 & 256) != 0 ? videoSubItem.recommend : num2;
        String str21 = (i5 & 512) != 0 ? videoSubItem.linkCode1 : str4;
        String str22 = (i5 & 1024) != 0 ? videoSubItem.linkCode2 : str5;
        String str23 = (i5 & 2048) != 0 ? videoSubItem.linkCode3 : str6;
        String str24 = (i5 & 4096) != 0 ? videoSubItem.linkUrl1 : str7;
        String str25 = (i5 & 8192) != 0 ? videoSubItem.linkUrl2 : str8;
        String str26 = str18;
        String str27 = (i5 & 16384) != 0 ? videoSubItem.linkUrl3 : str9;
        String str28 = (i5 & 32768) != 0 ? videoSubItem.videoCode : str10;
        String str29 = (i5 & 65536) != 0 ? videoSubItem.lecture : str11;
        Integer num13 = (i5 & 131072) != 0 ? videoSubItem.playTimeMin : num3;
        Integer num14 = (i5 & 262144) != 0 ? videoSubItem.playTimeSec : num4;
        String str30 = (i5 & 524288) != 0 ? videoSubItem.viewConditionId : str12;
        Integer num15 = (i5 & 1048576) != 0 ? videoSubItem.isCbt : num5;
        Integer num16 = (i5 & 2097152) != 0 ? videoSubItem.frequentOrder : num6;
        Integer num17 = (i5 & 4194304) != 0 ? videoSubItem.videogId : num7;
        String str31 = (i5 & 8388608) != 0 ? videoSubItem.title : str13;
        String str32 = (i5 & 16777216) != 0 ? videoSubItem.thumbnailXl : str14;
        String str33 = (i5 & 33554432) != 0 ? videoSubItem.thumbnailL : str15;
        String str34 = (i5 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? videoSubItem.videoHash : str16;
        Integer num18 = (i5 & 134217728) != 0 ? videoSubItem.courseVideoId : num8;
        List list3 = (i5 & 268435456) != 0 ? videoSubItem.qbQuestions : list;
        List list4 = (i5 & 536870912) != 0 ? videoSubItem.refItems : list2;
        String str35 = (i5 & 1073741824) != 0 ? videoSubItem.inputCardUrl : str17;
        Integer num19 = (i5 & Integer.MIN_VALUE) != 0 ? videoSubItem.downloadable : num9;
        Double d2 = (i6 & 1) != 0 ? videoSubItem.srcSize : d;
        Integer num20 = (i6 & 2) != 0 ? videoSubItem.videoNumber : num10;
        Date date3 = (i6 & 4) != 0 ? videoSubItem.downloadDate : date;
        Date date4 = (i6 & 8) != 0 ? videoSubItem.lastViewDate : date2;
        Long l3 = (i6 & 16) != 0 ? videoSubItem.userPlayTimeSec : l;
        if ((i6 & 32) != 0) {
            l2 = l3;
            z2 = videoSubItem.isComplete;
        } else {
            z2 = z;
            l2 = l3;
        }
        return videoSubItem.copy(str26, i7, i8, i9, num11, i10, str19, str20, num12, str21, str22, str23, str24, str25, str27, str28, str29, num13, num14, str30, num15, num16, num17, str31, str32, str33, str34, num18, list3, list4, str35, num19, d2, num20, date3, date4, l2, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLinkCode1() {
        return this.linkCode1;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLinkCode2() {
        return this.linkCode2;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLinkCode3() {
        return this.linkCode3;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLinkUrl1() {
        return this.linkUrl1;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLinkUrl2() {
        return this.linkUrl2;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLinkUrl3() {
        return this.linkUrl3;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getVideoCode() {
        return this.videoCode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLecture() {
        return this.lecture;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getPlayTimeMin() {
        return this.playTimeMin;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getPlayTimeSec() {
        return this.playTimeSec;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getViewConditionId() {
        return this.viewConditionId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getIsCbt() {
        return this.isCbt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getFrequentOrder() {
        return this.frequentOrder;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getVideogId() {
        return this.videogId;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getThumbnailXl() {
        return this.thumbnailXl;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getThumbnailL() {
        return this.thumbnailL;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getCourseVideoId() {
        return this.courseVideoId;
    }

    public final List<VideoQBQuestion> component29() {
        return this.qbQuestions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    public final List<VideoRefItem> component30() {
        return this.refItems;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getInputCardUrl() {
        return this.inputCardUrl;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Integer getDownloadable() {
        return this.downloadable;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Double getSrcSize() {
        return this.srcSize;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Date getDownloadDate() {
        return this.downloadDate;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Date getLastViewDate() {
        return this.lastViewDate;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Long getUserPlayTimeSec() {
        return this.userPlayTimeSec;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSubcategoryId() {
        return this.subcategoryId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVideoTitle() {
        return this.videoTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getRecommend() {
        return this.recommend;
    }

    public final VideoSubItem copy(String documentId, int videoId, int courseId, int chapterId, Integer subcategoryId, int displayOrder, String videoTitle, String detail, Integer recommend, String linkCode1, String linkCode2, String linkCode3, String linkUrl1, String linkUrl2, String linkUrl3, String videoCode, String lecture, Integer playTimeMin, Integer playTimeSec, String viewConditionId, Integer isCbt, Integer frequentOrder, Integer videogId, String title, String thumbnailXl, String thumbnailL, String videoHash, Integer courseVideoId, List<VideoQBQuestion> qbQuestions, List<VideoRefItem> refItems, String inputCardUrl, Integer downloadable, Double srcSize, Integer videoNumber, Date downloadDate, Date lastViewDate, Long userPlayTimeSec, boolean isComplete) {
        return new VideoSubItem(documentId, videoId, courseId, chapterId, subcategoryId, displayOrder, videoTitle, detail, recommend, linkCode1, linkCode2, linkCode3, linkUrl1, linkUrl2, linkUrl3, videoCode, lecture, playTimeMin, playTimeSec, viewConditionId, isCbt, frequentOrder, videogId, title, thumbnailXl, thumbnailL, videoHash, courseVideoId, qbQuestions, refItems, inputCardUrl, downloadable, srcSize, videoNumber, downloadDate, lastViewDate, userPlayTimeSec, isComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSubItem)) {
            return false;
        }
        VideoSubItem videoSubItem = (VideoSubItem) other;
        return Intrinsics.areEqual(this.documentId, videoSubItem.documentId) && this.videoId == videoSubItem.videoId && this.courseId == videoSubItem.courseId && this.chapterId == videoSubItem.chapterId && Intrinsics.areEqual(this.subcategoryId, videoSubItem.subcategoryId) && this.displayOrder == videoSubItem.displayOrder && Intrinsics.areEqual(this.videoTitle, videoSubItem.videoTitle) && Intrinsics.areEqual(this.detail, videoSubItem.detail) && Intrinsics.areEqual(this.recommend, videoSubItem.recommend) && Intrinsics.areEqual(this.linkCode1, videoSubItem.linkCode1) && Intrinsics.areEqual(this.linkCode2, videoSubItem.linkCode2) && Intrinsics.areEqual(this.linkCode3, videoSubItem.linkCode3) && Intrinsics.areEqual(this.linkUrl1, videoSubItem.linkUrl1) && Intrinsics.areEqual(this.linkUrl2, videoSubItem.linkUrl2) && Intrinsics.areEqual(this.linkUrl3, videoSubItem.linkUrl3) && Intrinsics.areEqual(this.videoCode, videoSubItem.videoCode) && Intrinsics.areEqual(this.lecture, videoSubItem.lecture) && Intrinsics.areEqual(this.playTimeMin, videoSubItem.playTimeMin) && Intrinsics.areEqual(this.playTimeSec, videoSubItem.playTimeSec) && Intrinsics.areEqual(this.viewConditionId, videoSubItem.viewConditionId) && Intrinsics.areEqual(this.isCbt, videoSubItem.isCbt) && Intrinsics.areEqual(this.frequentOrder, videoSubItem.frequentOrder) && Intrinsics.areEqual(this.videogId, videoSubItem.videogId) && Intrinsics.areEqual(this.title, videoSubItem.title) && Intrinsics.areEqual(this.thumbnailXl, videoSubItem.thumbnailXl) && Intrinsics.areEqual(this.thumbnailL, videoSubItem.thumbnailL) && Intrinsics.areEqual(this.videoHash, videoSubItem.videoHash) && Intrinsics.areEqual(this.courseVideoId, videoSubItem.courseVideoId) && Intrinsics.areEqual(this.qbQuestions, videoSubItem.qbQuestions) && Intrinsics.areEqual(this.refItems, videoSubItem.refItems) && Intrinsics.areEqual(this.inputCardUrl, videoSubItem.inputCardUrl) && Intrinsics.areEqual(this.downloadable, videoSubItem.downloadable) && Intrinsics.areEqual((Object) this.srcSize, (Object) videoSubItem.srcSize) && Intrinsics.areEqual(this.videoNumber, videoSubItem.videoNumber) && Intrinsics.areEqual(this.downloadDate, videoSubItem.downloadDate) && Intrinsics.areEqual(this.lastViewDate, videoSubItem.lastViewDate) && Intrinsics.areEqual(this.userPlayTimeSec, videoSubItem.userPlayTimeSec) && this.isComplete == videoSubItem.isComplete;
    }

    public int hashCode() {
        String str = this.documentId;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.videoId)) * 31) + Integer.hashCode(this.courseId)) * 31) + Integer.hashCode(this.chapterId)) * 31;
        Integer num = this.subcategoryId;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.displayOrder)) * 31;
        String str2 = this.videoTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detail;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.recommend;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.linkCode1;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkCode2;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.linkCode3;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.linkUrl1;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.linkUrl2;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.linkUrl3;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.videoCode;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lecture;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num3 = this.playTimeMin;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.playTimeSec;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str12 = this.viewConditionId;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num5 = this.isCbt;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.frequentOrder;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.videogId;
        int iHashCode19 = (iHashCode18 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str13 = this.title;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.thumbnailXl;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.thumbnailL;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.videoHash;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num8 = this.courseVideoId;
        int iHashCode24 = (iHashCode23 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<VideoQBQuestion> list = this.qbQuestions;
        int iHashCode25 = (iHashCode24 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoRefItem> list2 = this.refItems;
        int iHashCode26 = (iHashCode25 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str17 = this.inputCardUrl;
        int iHashCode27 = (iHashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num9 = this.downloadable;
        int iHashCode28 = (iHashCode27 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Double d = this.srcSize;
        int iHashCode29 = (iHashCode28 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num10 = this.videoNumber;
        int iHashCode30 = (iHashCode29 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Date date = this.downloadDate;
        int iHashCode31 = (iHashCode30 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.lastViewDate;
        int iHashCode32 = (iHashCode31 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Long l = this.userPlayTimeSec;
        return ((iHashCode32 + (l != null ? l.hashCode() : 0)) * 31) + Boolean.hashCode(this.isComplete);
    }

    public String toString() {
        return "VideoSubItem(documentId=" + this.documentId + ", videoId=" + this.videoId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", subcategoryId=" + this.subcategoryId + ", displayOrder=" + this.displayOrder + ", videoTitle=" + this.videoTitle + ", detail=" + this.detail + ", recommend=" + this.recommend + ", linkCode1=" + this.linkCode1 + ", linkCode2=" + this.linkCode2 + ", linkCode3=" + this.linkCode3 + ", linkUrl1=" + this.linkUrl1 + ", linkUrl2=" + this.linkUrl2 + ", linkUrl3=" + this.linkUrl3 + ", videoCode=" + this.videoCode + ", lecture=" + this.lecture + ", playTimeMin=" + this.playTimeMin + ", playTimeSec=" + this.playTimeSec + ", viewConditionId=" + this.viewConditionId + ", isCbt=" + this.isCbt + ", frequentOrder=" + this.frequentOrder + ", videogId=" + this.videogId + ", title=" + this.title + ", thumbnailXl=" + this.thumbnailXl + ", thumbnailL=" + this.thumbnailL + ", videoHash=" + this.videoHash + ", courseVideoId=" + this.courseVideoId + ", qbQuestions=" + this.qbQuestions + ", refItems=" + this.refItems + ", inputCardUrl=" + this.inputCardUrl + ", downloadable=" + this.downloadable + ", srcSize=" + this.srcSize + ", videoNumber=" + this.videoNumber + ", downloadDate=" + this.downloadDate + ", lastViewDate=" + this.lastViewDate + ", userPlayTimeSec=" + this.userPlayTimeSec + ", isComplete=" + this.isComplete + ")";
    }

    public /* synthetic */ VideoSubItem(String str, int i, int i2, int i3, Integer num, int i4, String str2, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num3, Integer num4, String str12, Integer num5, Integer num6, Integer num7, String str13, String str14, String str15, String str16, Integer num8, List list, List list2, String str17, Integer num9, Double d, Integer num10, Date date, Date date2, Long l, boolean z, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, i, i2, i3, (i5 & 16) != 0 ? null : num, i4, (i5 & 64) != 0 ? null : str2, (i5 & 128) != 0 ? null : str3, (i5 & 256) != 0 ? null : num2, (i5 & 512) != 0 ? null : str4, (i5 & 1024) != 0 ? null : str5, (i5 & 2048) != 0 ? null : str6, (i5 & 4096) != 0 ? null : str7, (i5 & 8192) != 0 ? null : str8, (i5 & 16384) != 0 ? null : str9, (32768 & i5) != 0 ? null : str10, (65536 & i5) != 0 ? null : str11, (131072 & i5) != 0 ? null : num3, (262144 & i5) != 0 ? null : num4, (524288 & i5) != 0 ? null : str12, (1048576 & i5) != 0 ? null : num5, (2097152 & i5) != 0 ? null : num6, (4194304 & i5) != 0 ? null : num7, (8388608 & i5) != 0 ? null : str13, (16777216 & i5) != 0 ? null : str14, (33554432 & i5) != 0 ? null : str15, (67108864 & i5) != 0 ? null : str16, (134217728 & i5) != 0 ? null : num8, (268435456 & i5) != 0 ? null : list, (536870912 & i5) != 0 ? null : list2, (1073741824 & i5) != 0 ? null : str17, (i5 & Integer.MIN_VALUE) != 0 ? null : num9, (i6 & 1) != 0 ? null : d, (i6 & 2) != 0 ? null : num10, (i6 & 4) != 0 ? null : date, (i6 & 8) != 0 ? null : date2, (i6 & 16) != 0 ? null : l, (i6 & 32) != 0 ? false : z);
    }

    public final String getDocumentId() {
        return this.documentId;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final Integer getSubcategoryId() {
        return this.subcategoryId;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getVideoTitle() {
        return this.videoTitle;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final Integer getRecommend() {
        return this.recommend;
    }

    public final String getLinkCode1() {
        return this.linkCode1;
    }

    public final String getLinkCode2() {
        return this.linkCode2;
    }

    public final String getLinkCode3() {
        return this.linkCode3;
    }

    public final String getLinkUrl1() {
        return this.linkUrl1;
    }

    public final String getLinkUrl2() {
        return this.linkUrl2;
    }

    public final String getLinkUrl3() {
        return this.linkUrl3;
    }

    public final String getVideoCode() {
        return this.videoCode;
    }

    public final String getLecture() {
        return this.lecture;
    }

    public final Integer getPlayTimeMin() {
        return this.playTimeMin;
    }

    public final Integer getPlayTimeSec() {
        return this.playTimeSec;
    }

    public final String getViewConditionId() {
        return this.viewConditionId;
    }

    public final Integer isCbt() {
        return this.isCbt;
    }

    public final Integer getFrequentOrder() {
        return this.frequentOrder;
    }

    public final Integer getVideogId() {
        return this.videogId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getThumbnailXl() {
        return this.thumbnailXl;
    }

    public final String getThumbnailL() {
        return this.thumbnailL;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final Integer getCourseVideoId() {
        return this.courseVideoId;
    }

    public final List<VideoQBQuestion> getQbQuestions() {
        return this.qbQuestions;
    }

    public final List<VideoRefItem> getRefItems() {
        return this.refItems;
    }

    public final String getInputCardUrl() {
        return this.inputCardUrl;
    }

    public final Integer getDownloadable() {
        return this.downloadable;
    }

    public final Double getSrcSize() {
        return this.srcSize;
    }

    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    public final Date getDownloadDate() {
        return this.downloadDate;
    }

    public final Date getLastViewDate() {
        return this.lastViewDate;
    }

    public final Long getUserPlayTimeSec() {
        return this.userPlayTimeSec;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public VideoSubItem(String str, int i, int i2, int i3, Integer num, int i4, String str2, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num3, Integer num4, String str12, Integer num5, Integer num6, Integer num7, String str13, String str14, String str15, String str16, Integer num8, List<VideoQBQuestion> list, List<VideoRefItem> list2, String str17, Integer num9, Double d, Integer num10, Date date, Date date2, Long l, boolean z) {
        Date time;
        super(ContentsItemLevel.SUB.getValue());
        this.documentId = str;
        this.videoId = i;
        this.courseId = i2;
        this.chapterId = i3;
        this.subcategoryId = num;
        this.displayOrder = i4;
        this.videoTitle = str2;
        this.detail = str3;
        this.recommend = num2;
        this.linkCode1 = str4;
        this.linkCode2 = str5;
        this.linkCode3 = str6;
        this.linkUrl1 = str7;
        this.linkUrl2 = str8;
        this.linkUrl3 = str9;
        this.videoCode = str10;
        this.lecture = str11;
        this.playTimeMin = num3;
        this.playTimeSec = num4;
        this.viewConditionId = str12;
        this.isCbt = num5;
        this.frequentOrder = num6;
        this.videogId = num7;
        this.title = str13;
        this.thumbnailXl = str14;
        this.thumbnailL = str15;
        this.videoHash = str16;
        this.courseVideoId = num8;
        this.qbQuestions = list;
        this.refItems = list2;
        this.inputCardUrl = str17;
        this.downloadable = num9;
        this.srcSize = d;
        this.videoNumber = num10;
        this.downloadDate = date;
        this.lastViewDate = date2;
        this.userPlayTimeSec = l;
        this.isComplete = z;
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(3, 2);
            time = calendar.getTime();
        } else {
            time = null;
        }
        this.expireDate = time;
    }

    public final String getDisplayPlayTime() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.JAPAN;
        Integer num = this.playTimeMin;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        Integer num2 = this.playTimeSec;
        String str = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : 0)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String getTimeLabel() {
        Integer num = this.playTimeMin;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.playTimeSec;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        if (iIntValue == 0 && iIntValue2 == 0) {
            return null;
        }
        return getDisplayPlayTime();
    }

    public final String getPlaySec() {
        Integer num = this.playTimeMin;
        int iIntValue = (num != null ? num.intValue() : 0) * 60;
        Integer num2 = this.playTimeSec;
        return String.valueOf(iIntValue + (num2 != null ? num2.intValue() : 0));
    }

    public final Date getExpireDate() {
        return this.expireDate;
    }

    public final String getQbQuestionsQuery() {
        ArrayList arrayListEmptyList;
        List<VideoQBQuestion> list = this.qbQuestions;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String questionCode = ((VideoQBQuestion) it.next()).getQuestionCode();
                if (questionCode != null) {
                    arrayList.add(questionCode);
                }
            }
            arrayListEmptyList = arrayList;
        }
        if (!arrayListEmptyList.isEmpty()) {
            return "&q=" + CollectionsKt.joinToString$default(arrayListEmptyList, " ", null, null, 0, null, null, 62, null);
        }
        return "";
    }

    public final String historyContentId(String contentId) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        return contentId + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + this.courseId + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + this.chapterId + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + this.subcategoryId + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + this.videoId;
    }
}
