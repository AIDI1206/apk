package com.medicmedia.medilink.data;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.PlatformScheduler;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.ui.DownloadNotificationHelper;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.medicmedia.medilink.data.model.ConstKt;
import com.medicmedia.medilink.data.repository.ContentsRepository;
import com.medicmedia.medilink.data.repository.R;
import com.medicmedia.medilink.data.repository.VideoContentsRepository;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: VideoDownloadService.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001%\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\"\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u000201H\u0003J\b\u00102\u001a\u00020\u0005H\u0014J\n\u00103\u001a\u0004\u0018\u000104H\u0014J\u0016\u00105\u001a\u0002012\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&¨\u00069"}, d2 = {"Lcom/medicmedia/medilink/data/VideoDownloadService;", "Lcom/google/android/exoplayer2/offline/DownloadService;", "<init>", "()V", "manager", "Lcom/google/android/exoplayer2/offline/DownloadManager;", "getManager", "()Lcom/google/android/exoplayer2/offline/DownloadManager;", "setManager", "(Lcom/google/android/exoplayer2/offline/DownloadManager;)V", "downloadNotificationHelper", "Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;", "getDownloadNotificationHelper", "()Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;", "setDownloadNotificationHelper", "(Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;)V", "contentsRepository", "Lcom/medicmedia/medilink/data/repository/ContentsRepository;", "getContentsRepository", "()Lcom/medicmedia/medilink/data/repository/ContentsRepository;", "setContentsRepository", "(Lcom/medicmedia/medilink/data/repository/ContentsRepository;)V", "videoContentsRepository", "Lcom/medicmedia/medilink/data/repository/VideoContentsRepository;", "getVideoContentsRepository", "()Lcom/medicmedia/medilink/data/repository/VideoContentsRepository;", "setVideoContentsRepository", "(Lcom/medicmedia/medilink/data/repository/VideoContentsRepository;)V", "loginDataStore", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "getLoginDataStore", "()Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "setLoginDataStore", "(Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;)V", "downloadScope", "Lkotlinx/coroutines/CoroutineScope;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "com/medicmedia/medilink/data/VideoDownloadService$listener$1", "Lcom/medicmedia/medilink/data/VideoDownloadService$listener$1;", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "createNotification", "Landroid/app/Notification;", "getDownloadManager", "getScheduler", "Lcom/google/android/exoplayer2/scheduler/Scheduler;", "getForegroundNotification", ConstKt.downloadContentDirectory, "", "Lcom/google/android/exoplayer2/offline/Download;", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class VideoDownloadService extends Hilt_VideoDownloadService {

    @Inject
    public ContentsRepository contentsRepository;

    @Inject
    public DownloadNotificationHelper downloadNotificationHelper;
    private final CoroutineScope downloadScope;
    private final VideoDownloadService$listener$1 listener;

    @Inject
    public LoginDataStore loginDataStore;

    @Inject
    public DownloadManager manager;

    @Inject
    public VideoContentsRepository videoContentsRepository;

    public VideoDownloadService() {
        super(1, 1000L, ConstKt.downloadNotificationChannelId, R.string.exo_download_notification_channel_name, 0);
        this.downloadScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.listener = new VideoDownloadService$listener$1(this);
    }

    public final DownloadManager getManager() {
        DownloadManager downloadManager = this.manager;
        if (downloadManager != null) {
            return downloadManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("manager");
        return null;
    }

    public final void setManager(DownloadManager downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "<set-?>");
        this.manager = downloadManager;
    }

    public final DownloadNotificationHelper getDownloadNotificationHelper() {
        DownloadNotificationHelper downloadNotificationHelper = this.downloadNotificationHelper;
        if (downloadNotificationHelper != null) {
            return downloadNotificationHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadNotificationHelper");
        return null;
    }

    public final void setDownloadNotificationHelper(DownloadNotificationHelper downloadNotificationHelper) {
        Intrinsics.checkNotNullParameter(downloadNotificationHelper, "<set-?>");
        this.downloadNotificationHelper = downloadNotificationHelper;
    }

    public final ContentsRepository getContentsRepository() {
        ContentsRepository contentsRepository = this.contentsRepository;
        if (contentsRepository != null) {
            return contentsRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentsRepository");
        return null;
    }

    public final void setContentsRepository(ContentsRepository contentsRepository) {
        Intrinsics.checkNotNullParameter(contentsRepository, "<set-?>");
        this.contentsRepository = contentsRepository;
    }

    public final VideoContentsRepository getVideoContentsRepository() {
        VideoContentsRepository videoContentsRepository = this.videoContentsRepository;
        if (videoContentsRepository != null) {
            return videoContentsRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoContentsRepository");
        return null;
    }

    public final void setVideoContentsRepository(VideoContentsRepository videoContentsRepository) {
        Intrinsics.checkNotNullParameter(videoContentsRepository, "<set-?>");
        this.videoContentsRepository = videoContentsRepository;
    }

    public final LoginDataStore getLoginDataStore() {
        LoginDataStore loginDataStore = this.loginDataStore;
        if (loginDataStore != null) {
            return loginDataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginDataStore");
        return null;
    }

    public final void setLoginDataStore(LoginDataStore loginDataStore) {
        Intrinsics.checkNotNullParameter(loginDataStore, "<set-?>");
        this.loginDataStore = loginDataStore;
    }

    @Override // com.medicmedia.medilink.data.Hilt_VideoDownloadService, com.google.android.exoplayer2.offline.DownloadService, android.app.Service
    public void onCreate() {
        super.onCreate();
        getManager().addListener(this.listener);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        CoroutineScopeKt.cancel$default(this.downloadScope, null, 1, null);
        getManager().removeListener(this.listener);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        int iOnStartCommand = super.onStartCommand(intent, flags, startId);
        startForeground(1, createNotification());
        return iOnStartCommand;
    }

    private final Notification createNotification() {
        NotificationChannel notificationChannel = new NotificationChannel(ConstKt.notificationVideoDownloadId, ConstKt.notificationVideoDownloadId, 0);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        Notification notificationBuild = new NotificationCompat.Builder(this, ConstKt.notificationVideoDownloadId).setOngoing(false).setSmallIcon(R.mipmap.ic_stat_notification_medilink).setContentTitle(getString(R.string.video_download_title)).setContentText(getString(R.string.video_download_message)).setPriority(-2).setCategory(NotificationCompat.CATEGORY_SERVICE).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    protected DownloadManager getDownloadManager() {
        return getManager();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    protected Scheduler getScheduler() {
        if (Util.SDK_INT >= 21) {
            return new PlatformScheduler(this, 1);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    protected Notification getForegroundNotification(List<Download> downloads) {
        Intrinsics.checkNotNullParameter(downloads, "downloads");
        Notification notificationBuildProgressNotification = getDownloadNotificationHelper().buildProgressNotification(this, R.mipmap.ic_stat_notification_medilink, null, null, downloads);
        Intrinsics.checkNotNullExpressionValue(notificationBuildProgressNotification, "buildProgressNotification(...)");
        return notificationBuildProgressNotification;
    }
}
