package com.medicmedia.medilink.domain.model;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PushNotificationPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PayloadType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LIBRARY", "ANNOUNCEMENT", "MOVIE", "DL_CONTENTS", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum PayloadType {
    LIBRARY(AnalyticsEvent.ReadContentsRef.LIBRARY),
    ANNOUNCEMENT("announcement"),
    MOVIE("movie"),
    DL_CONTENTS("dlContents");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<PayloadType> getEntries() {
        return $ENTRIES;
    }

    PayloadType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: PushNotificationPayload.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PayloadType$Companion;", "", "<init>", "()V", "convertToPayload", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload;", "data", "", "", "intent", "Landroid/content/Intent;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PushNotificationPayload convertToPayload(Map<String, String> data) {
            PayloadType next;
            Intrinsics.checkNotNullParameter(data, "data");
            String str = data.get("to");
            if (str != null) {
                Iterator<PayloadType> it = PayloadType.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(next.getValue(), str));
                PayloadType payloadType = next;
                if (payloadType != null) {
                    return PushNotificationPayload.INSTANCE.convertTo(payloadType, data);
                }
            }
            return null;
        }

        public final PushNotificationPayload convertToPayload(Intent intent) {
            PayloadType next;
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra("to");
            if (stringExtra != null) {
                Iterator<PayloadType> it = PayloadType.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(next.getValue(), stringExtra));
                PayloadType payloadType = next;
                if (payloadType != null) {
                    return PushNotificationPayload.INSTANCE.convertTo(payloadType, intent);
                }
            }
            return null;
        }
    }
}
