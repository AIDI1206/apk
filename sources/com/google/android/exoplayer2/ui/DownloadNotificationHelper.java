package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list) {
        int i2;
        int i3;
        int i4;
        boolean z;
        float f = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = false;
        boolean z6 = true;
        for (int i6 = 0; i6 < list.size(); i6++) {
            Download download = list.get(i6);
            if (download.state == 5) {
                z4 = true;
            } else if (download.state == 7 || download.state == 2) {
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z6 = false;
                }
                z5 |= download.getBytesDownloaded() > 0;
                i5++;
                z3 = true;
            }
        }
        if (z3) {
            i3 = R.string.exo_download_downloading;
        } else {
            if (z4) {
                i3 = R.string.exo_download_removing;
            } else {
                i2 = 0;
            }
            if (z3) {
                int i7 = (int) (f / i5);
                if (z6 && z5) {
                    z2 = true;
                }
                i4 = i7;
                z = z2;
            } else {
                i4 = 0;
                z = true;
            }
            return buildNotification(context, i, pendingIntent, str, i2, 100, i4, z, true, false);
        }
        i2 = i3;
        if (z3) {
            int i8 = (int) (f / i5);
            if (z6) {
                z2 = true;
            }
            i4 = i8;
            z = z2;
        } else {
            i4 = 0;
            z = true;
        }
        return buildNotification(context, i, pendingIntent, str, i2, 100, i4, z, true, false);
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, R.string.exo_download_failed);
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        return this.notificationBuilder.build();
    }
}
