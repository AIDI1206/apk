package com.medicmedia.medilink;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.firebase.messaging.RemoteMessage;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.VideoCode;
import com.medicmedia.medilink.domain.model.PayloadType;
import com.medicmedia.medilink.domain.model.PushNotificationPayload;
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.web.OtherWebViewArgs;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: PushNotificationMessagingService.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J0\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J \u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006&"}, d2 = {"Lcom/medicmedia/medilink/PushNotificationMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "tag", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "onNewToken", "", "token", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onDestroy", "showNotification", BundleKey.NOTIFICATION_ID, "", "channelId", HistoryRepositoryImpl.FieldName.TITLE, "message", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "createNotificationChannelIfNeeded", "getPendingIntent", "requestCode", "getAnnouncementPendingIntent", "url", "getMoviePendingIntent", "contentsCode", "tabIndex", "getDlContentsPendingIntent", "getLibraryPendingIntent", "intent", "Landroid/content/Intent;", "flags", "generateNotificationId", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class PushNotificationMessagingService extends Hilt_PushNotificationMessagingService {
    public static final int $stable = 0;
    private static final AtomicInteger notificationIdGenerator = new AtomicInteger(1);
    private final String tag = "PushNotificationMessagingService";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        Log.d(this.tag, "token=" + token);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String string;
        String body;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification == null || (string = notification.getTitle()) == null) {
            string = getString(R.string.app_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        String str = string;
        RemoteMessage.Notification notification2 = remoteMessage.getNotification();
        if (notification2 == null || (body = notification2.getBody()) == null) {
            body = remoteMessage.getData().get("body");
        }
        String str2 = body;
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3) || UserStorageKt.getBaristaToken(this) == null) {
            return;
        }
        String string2 = getString(R.string.default_notification_channel_id);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        createNotificationChannelIfNeeded(string2);
        int iGenerateNotificationId = generateNotificationId();
        showNotification(iGenerateNotificationId, string2, str, str2, getPendingIntent(remoteMessage, iGenerateNotificationId));
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    private final void showNotification(int notificationId, String channelId, String title, String message, PendingIntent pendingIntent) {
        String str = title;
        String str2 = message;
        NotificationCompat.Builder defaults = new NotificationCompat.Builder(getApplicationContext(), channelId).setSmallIcon(R.mipmap.ic_stat_notification_medilink).setContentTitle(str).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str).bigText(str2)).setAutoCancel(true).setContentIntent(pendingIntent).setPriority(1).setCategory(NotificationCompat.CATEGORY_MESSAGE).setVisibility(1).setOnlyAlertOnce(false).setDefaults(7);
        if (ActivityCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            Log.w(this.tag, "POST_NOTIFICATIONS が未許可のため通知を表示できません");
        } else {
            NotificationManagerCompat.from(getApplicationContext()).notify(notificationId, defaults.build());
        }
    }

    private final void createNotificationChannelIfNeeded(String channelId) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            return;
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(channelId);
        if (notificationChannel != null) {
            Log.d(this.tag, "channel already exists. importance=" + notificationChannel.getImportance());
        } else {
            NotificationChannel notificationChannel2 = new NotificationChannel(channelId, getString(com.medicmedia.medilink.ui.R.string.notification_channel_name), 4);
            notificationChannel2.setDescription(getString(com.medicmedia.medilink.ui.R.string.notification_channel_description));
            notificationChannel2.enableLights(true);
            notificationChannel2.enableVibration(true);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    private final PendingIntent getPendingIntent(RemoteMessage remoteMessage, int requestCode) {
        PendingIntent dlContentsPendingIntent;
        PayloadType.Companion companion = PayloadType.INSTANCE;
        Map<String, String> data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        PushNotificationPayload pushNotificationPayloadConvertToPayload = companion.convertToPayload(data);
        if (pushNotificationPayloadConvertToPayload != null) {
            if (pushNotificationPayloadConvertToPayload instanceof PushNotificationPayload.Library) {
                dlContentsPendingIntent = getLibraryPendingIntent(requestCode);
            } else if (pushNotificationPayloadConvertToPayload instanceof PushNotificationPayload.Announcement) {
                String url = ((PushNotificationPayload.Announcement) pushNotificationPayloadConvertToPayload).getUrl();
                if (url != null) {
                    dlContentsPendingIntent = getAnnouncementPendingIntent(requestCode, url);
                } else {
                    dlContentsPendingIntent = null;
                }
            } else if (pushNotificationPayloadConvertToPayload instanceof PushNotificationPayload.Movie) {
                PushNotificationPayload.Movie movie = (PushNotificationPayload.Movie) pushNotificationPayloadConvertToPayload;
                String contentsCode = movie.getContentsCode();
                if (contentsCode != null) {
                    dlContentsPendingIntent = getMoviePendingIntent(requestCode, contentsCode, movie.getTabIndex());
                } else {
                    dlContentsPendingIntent = null;
                }
            } else {
                if (!(pushNotificationPayloadConvertToPayload instanceof PushNotificationPayload.DlContents)) {
                    throw new NoWhenBranchMatchedException();
                }
                String contentsCode2 = ((PushNotificationPayload.DlContents) pushNotificationPayloadConvertToPayload).getContentsCode();
                if (contentsCode2 != null) {
                    dlContentsPendingIntent = getDlContentsPendingIntent(requestCode, contentsCode2);
                } else {
                    dlContentsPendingIntent = null;
                }
            }
            if (dlContentsPendingIntent != null) {
                return dlContentsPendingIntent;
            }
        }
        return getLibraryPendingIntent(requestCode);
    }

    private final PendingIntent getAnnouncementPendingIntent(int requestCode, String url) {
        String str = url;
        if (str.length() > 0 && Patterns.WEB_URL.matcher(str).matches()) {
            Intent intent = new Intent(this, (Class<?>) OtherWebViewActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(BundleKey.WEB_ARGS, new OtherWebViewArgs(url, null, false, 2, null));
            intent.putExtras(bundle);
            return getPendingIntent$default(this, requestCode, intent, 0, 4, null);
        }
        return getLibraryPendingIntent(requestCode);
    }

    private final PendingIntent getMoviePendingIntent(int requestCode, String contentsCode, int tabIndex) {
        if (VideoCode.INSTANCE.equals(contentsCode)) {
            return getPendingIntent$default(this, requestCode, VideoListActivity.INSTANCE.createIntent(this, new Destination.VideoList(contentsCode, tabIndex, null, 4, null)), 0, 4, null);
        }
        return getLibraryPendingIntent(requestCode);
    }

    private final PendingIntent getDlContentsPendingIntent(int requestCode, String contentsCode) {
        ExternalEntryActivity.Companion companion = ExternalEntryActivity.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intent intentCreateDlContentsIntent = companion.createDlContentsIntent(applicationContext, contentsCode);
        intentCreateDlContentsIntent.setFlags(335544320);
        return getPendingIntent$default(this, requestCode, intentCreateDlContentsIntent, 0, 4, null);
    }

    private final PendingIntent getLibraryPendingIntent(int requestCode) {
        Intent intentCreateIntent = MLMainActivity.createIntent(getApplicationContext());
        intentCreateIntent.putExtra(BundleKey.LIBRARY_TAB, true);
        intentCreateIntent.setFlags(335544320);
        Intrinsics.checkNotNull(intentCreateIntent);
        return getPendingIntent$default(this, requestCode, intentCreateIntent, 0, 4, null);
    }

    static /* synthetic */ PendingIntent getPendingIntent$default(PushNotificationMessagingService pushNotificationMessagingService, int i, Intent intent, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 134217728;
        }
        return pushNotificationMessagingService.getPendingIntent(i, intent, i2);
    }

    private final PendingIntent getPendingIntent(int requestCode, Intent intent, int flags) {
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), requestCode, intent, flags | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    private final int generateNotificationId() {
        return notificationIdGenerator.getAndIncrement();
    }
}
