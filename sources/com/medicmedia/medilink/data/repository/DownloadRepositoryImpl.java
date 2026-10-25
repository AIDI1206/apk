package com.medicmedia.medilink.data.repository;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.medicmedia.medilink.data.model.ContentStatus;
import com.medicmedia.medilink.data.model.DownloadIdType;
import com.medicmedia.medilink.data.model.DownloadProgressType;
import com.medicmedia.medilink.database.models.BookShelfItem;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import com.medicmedia.medilink.domain.model.WorkerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: DownloadRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/data/repository/DownloadRepositoryImpl;", "Lcom/medicmedia/medilink/data/repository/DownloadRepository;", "context", "Landroid/content/Context;", "downloadManager", "Landroid/app/DownloadManager;", "loginDataStore", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "<init>", "(Landroid/content/Context;Landroid/app/DownloadManager;Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;)V", "remove", "", WorkerKey.KEY_DOWNLOAD_ID, "", "removeDownloadedData", "enqueueRequest", "uri", "Landroid/net/Uri;", HistoryRepositoryImpl.FieldName.TITLE, "description", "dirType", "subPath", "getDownloadIds", "", "downloadIdType", "Lcom/medicmedia/medilink/data/model/DownloadIdType;", "removeById", "", "columnId", "getLocalUri", "getProgressType", "Lcom/medicmedia/medilink/data/model/DownloadProgressType;", "item", "Lcom/medicmedia/medilink/database/models/BookShelfItem;", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DownloadRepositoryImpl implements DownloadRepository {
    private final Context context;
    private final DownloadManager downloadManager;
    private final LoginDataStore loginDataStore;

    @Inject
    public DownloadRepositoryImpl(Context context, DownloadManager downloadManager, LoginDataStore loginDataStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(loginDataStore, "loginDataStore");
        this.context = context;
        this.downloadManager = downloadManager;
        this.loginDataStore = loginDataStore;
    }

    @Override // com.medicmedia.medilink.data.repository.DownloadRepository
    public String remove(long downloadId) {
        Cursor cursorQuery = this.downloadManager.query(new DownloadManager.Query().setFilterById(downloadId));
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToFirst()) {
                int columnIndex = cursor2.getColumnIndex(NotificationCompat.CATEGORY_STATUS);
                int columnIndex2 = cursor2.getColumnIndex("reason");
                int columnIndex3 = cursor2.getColumnIndex("local_uri");
                if (columnIndex >= 0) {
                    int i = cursor2.getInt(columnIndex);
                    int i2 = cursor2.getInt(columnIndex2);
                    if (i == 1 || i == 2) {
                        this.downloadManager.remove(downloadId);
                    } else if (i != 4) {
                        if (i != 8) {
                            this.downloadManager.remove(downloadId);
                        }
                    } else if (i2 != 2) {
                        this.downloadManager.remove(downloadId);
                    }
                    if (columnIndex3 >= 0) {
                        String string = cursor2.getString(columnIndex3);
                        CloseableKt.closeFinally(cursor, null);
                        return string;
                    }
                }
            }
            CloseableKt.closeFinally(cursor, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    @Override // com.medicmedia.medilink.data.repository.DownloadRepository
    public String removeDownloadedData(long downloadId) {
        Cursor cursorQuery = this.downloadManager.query(new DownloadManager.Query().setFilterById(downloadId));
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToFirst()) {
                int columnIndex = cursor2.getColumnIndex(NotificationCompat.CATEGORY_STATUS);
                int columnIndex2 = cursor2.getColumnIndex("local_uri");
                if (columnIndex >= 0 && cursor2.getInt(columnIndex) == 8) {
                    this.downloadManager.remove(downloadId);
                }
                if (columnIndex2 >= 0) {
                    String string = cursor2.getString(columnIndex2);
                    CloseableKt.closeFinally(cursor, null);
                    return string;
                }
            }
            CloseableKt.closeFinally(cursor, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    @Override // com.medicmedia.medilink.data.repository.DownloadRepository
    public long enqueueRequest(Uri uri, String title, String description, String dirType, String subPath) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dirType, "dirType");
        Intrinsics.checkNotNullParameter(subPath, "subPath");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setAllowedNetworkTypes(this.loginDataStore.isOnlyWifi() ? 2 : 3);
        request.setAllowedOverRoaming(false);
        request.setTitle(title);
        request.setDescription(description);
        request.setVisibleInDownloadsUi(false);
        request.setDestinationInExternalFilesDir(this.context, dirType, subPath);
        return this.downloadManager.enqueue(request);
    }

    @Override // com.medicmedia.medilink.data.repository.DownloadRepository
    public List<Long> getDownloadIds(DownloadIdType downloadIdType) {
        Intrinsics.checkNotNullParameter(downloadIdType, "downloadIdType");
        Cursor cursorQuery = this.downloadManager.query(new DownloadManager.Query());
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                ArrayList arrayList = new ArrayList();
                int columnIndex = cursor2.getColumnIndex(NotificationCompat.CATEGORY_STATUS);
                int columnIndex2 = cursor2.getColumnIndex("_id");
                int columnIndex3 = cursor2.getColumnIndex("local_uri");
                if (columnIndex < 0 || columnIndex2 < 0 || columnIndex3 < 0) {
                    arrayList = CollectionsKt.emptyList();
                } else {
                    while (cursor2.moveToNext()) {
                        if (downloadIdType.isCheck(cursor2.getInt(columnIndex))) {
                            arrayList.add(Long.valueOf(cursor2.getLong(columnIndex2)));
                        }
                    }
                }
                CloseableKt.closeFinally(cursor, null);
                if (arrayList != null) {
                    return arrayList;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursor, th);
                    throw th2;
                }
            }
        }
        return CollectionsKt.emptyList();
    }

    @Override // com.medicmedia.medilink.data.repository.DownloadRepository
    public void removeById(long columnId) {
        this.downloadManager.remove(columnId);
    }

    @Override // com.medicmedia.medilink.data.repository.DownloadRepository
    public String getLocalUri(long downloadId) {
        int columnIndex;
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(downloadId);
        Cursor cursorQuery = this.downloadManager.query(query);
        String string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("local_uri")) < 0) ? null : cursorQuery.getString(columnIndex);
        cursorQuery.close();
        return string;
    }

    @Override // com.medicmedia.medilink.data.repository.DownloadRepository
    public DownloadProgressType getProgressType(BookShelfItem item, long downloadId) {
        DownloadProgressType.Downloading downloading;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z = true;
        Cursor cursorQuery = this.downloadManager.query(new DownloadManager.Query().setFilterById(downloadId));
        if (cursorQuery == null) {
            return new DownloadProgressType.DownloadCountZero(item.isNeedUpdateVersion());
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (!cursor2.moveToFirst()) {
                DownloadProgressType.DownloadCountZero downloadCountZero = new DownloadProgressType.DownloadCountZero(item.isNeedUpdateVersion());
                CloseableKt.closeFinally(cursor, null);
                return downloadCountZero;
            }
            int columnIndex = cursor2.getColumnIndex(NotificationCompat.CATEGORY_STATUS);
            if (columnIndex < 0) {
                DownloadProgressType.Other other = new DownloadProgressType.Other(item, -1, cursor2.getCount());
                CloseableKt.closeFinally(cursor, null);
                return other;
            }
            int i = cursor2.getInt(columnIndex);
            if (i == 2 || i == 4 || i == 1) {
                int columnIndex2 = cursor2.getColumnIndex("bytes_so_far");
                int columnIndex3 = cursor2.getColumnIndex("total_size");
                long j = columnIndex2 >= 0 ? cursor2.getLong(columnIndex2) : 0L;
                long j2 = columnIndex3 >= 0 ? cursor2.getLong(columnIndex3) : 0L;
                int iCoerceIn = j2 > 0 ? RangesKt.coerceIn((int) ((j * 100.0d) / j2), 0, 100) : 0;
                if (i != 1 && i != 4) {
                    z = false;
                }
                downloading = new DownloadProgressType.Downloading(iCoerceIn, z);
            } else if (i == ContentStatus.COMPLETE_SUCCESS.getValue() || i == ContentStatus.FULL_COMPLETE_SUCCESS.getValue()) {
                downloading = new DownloadProgressType.Completed(item);
            } else {
                downloading = new DownloadProgressType.Other(item, i, cursor2.getCount());
            }
            CloseableKt.closeFinally(cursor, null);
            return downloading;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }
}
