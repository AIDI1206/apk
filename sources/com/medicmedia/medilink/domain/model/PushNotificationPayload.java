package com.medicmedia.medilink.domain.model;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: PushNotificationPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PushNotificationPayload;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/PayloadType;", "getType", "()Lcom/medicmedia/medilink/domain/model/PayloadType;", "Companion", "Library", "Announcement", "Movie", "DlContents", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$Announcement;", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$DlContents;", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$Library;", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$Movie;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface PushNotificationPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String KEY_ANNOUNCEMENT_URL = "announcementUrl";
    public static final String KEY_BODY = "body";
    public static final String KEY_CONTENTS_CODE = "contentsCode";
    public static final String KEY_MOVIE_TAB = "movieTab";
    public static final String KEY_TO = "to";

    PayloadType getType();

    /* JADX INFO: compiled from: PushNotificationPayload.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$Companion;", "", "<init>", "()V", "KEY_BODY", "", "KEY_TO", "KEY_CONTENTS_CODE", "KEY_MOVIE_TAB", "KEY_ANNOUNCEMENT_URL", "convertTo", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/PayloadType;", "data", "", "intent", "Landroid/content/Intent;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_ANNOUNCEMENT_URL = "announcementUrl";
        public static final String KEY_BODY = "body";
        public static final String KEY_CONTENTS_CODE = "contentsCode";
        public static final String KEY_MOVIE_TAB = "movieTab";
        public static final String KEY_TO = "to";

        /* JADX INFO: compiled from: PushNotificationPayload.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PayloadType.values().length];
                try {
                    iArr[PayloadType.LIBRARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PayloadType.ANNOUNCEMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PayloadType.MOVIE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PayloadType.DL_CONTENTS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final PushNotificationPayload convertTo(PayloadType type, Map<String, String> data) {
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            int i2 = 1;
            PayloadType payloadType = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            if (i == 1) {
                return new Library(b2 == true ? 1 : 0, i2, b == true ? 1 : 0);
            }
            if (i == 2) {
                return new Announcement(b4 == true ? 1 : 0, data.get("announcementUrl"), i2, b3 == true ? 1 : 0);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return new DlContents(payloadType, data.get("contentsCode"), i2, b5 == true ? 1 : 0);
            }
            String str = data.get("contentsCode");
            String str2 = data.get("movieTab");
            return new Movie(null, str, (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) ? 0 : intOrNull.intValue(), 1, null);
        }

        public final PushNotificationPayload convertTo(PayloadType type, Intent intent) {
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(intent, "intent");
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            int i2 = 1;
            PayloadType payloadType = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            if (i == 1) {
                return new Library(b2 == true ? 1 : 0, i2, b == true ? 1 : 0);
            }
            if (i == 2) {
                return new Announcement(b4 == true ? 1 : 0, intent.getStringExtra("announcementUrl"), i2, b3 == true ? 1 : 0);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return new DlContents(payloadType, intent.getStringExtra("contentsCode"), i2, b5 == true ? 1 : 0);
            }
            String stringExtra = intent.getStringExtra("contentsCode");
            String stringExtra2 = intent.getStringExtra("movieTab");
            return new Movie(null, stringExtra, (stringExtra2 == null || (intOrNull = StringsKt.toIntOrNull(stringExtra2)) == null) ? 0 : intOrNull.intValue(), 1, null);
        }
    }

    /* JADX INFO: compiled from: PushNotificationPayload.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$Library;", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/PayloadType;", "<init>", "(Lcom/medicmedia/medilink/domain/model/PayloadType;)V", "getType", "()Lcom/medicmedia/medilink/domain/model/PayloadType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Library implements PushNotificationPayload {
        private final PayloadType type;

        public Library() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Library copy$default(Library library, PayloadType payloadType, int i, Object obj) {
            if ((i & 1) != 0) {
                payloadType = library.type;
            }
            return library.copy(payloadType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayloadType getType() {
            return this.type;
        }

        public final Library copy(PayloadType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Library(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Library) && this.type == ((Library) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "Library(type=" + this.type + ")";
        }

        public Library(PayloadType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public /* synthetic */ Library(PayloadType payloadType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PayloadType.LIBRARY : payloadType);
        }

        @Override // com.medicmedia.medilink.domain.model.PushNotificationPayload
        public PayloadType getType() {
            return this.type;
        }
    }

    /* JADX INFO: compiled from: PushNotificationPayload.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$Announcement;", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/PayloadType;", "url", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/PayloadType;Ljava/lang/String;)V", "getType", "()Lcom/medicmedia/medilink/domain/model/PayloadType;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Announcement implements PushNotificationPayload {
        private final PayloadType type;
        private final String url;

        public Announcement() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Announcement copy$default(Announcement announcement, PayloadType payloadType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                payloadType = announcement.type;
            }
            if ((i & 2) != 0) {
                str = announcement.url;
            }
            return announcement.copy(payloadType, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayloadType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Announcement copy(PayloadType type, String url) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Announcement(type, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Announcement)) {
                return false;
            }
            Announcement announcement = (Announcement) other;
            return this.type == announcement.type && Intrinsics.areEqual(this.url, announcement.url);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.url;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Announcement(type=" + this.type + ", url=" + this.url + ")";
        }

        public Announcement(PayloadType type, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.url = str;
        }

        public /* synthetic */ Announcement(PayloadType payloadType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PayloadType.ANNOUNCEMENT : payloadType, (i & 2) != 0 ? null : str);
        }

        @Override // com.medicmedia.medilink.domain.model.PushNotificationPayload
        public PayloadType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: PushNotificationPayload.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$Movie;", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/PayloadType;", "contentsCode", "", "tabIndex", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/PayloadType;Ljava/lang/String;I)V", "getType", "()Lcom/medicmedia/medilink/domain/model/PayloadType;", "getContentsCode", "()Ljava/lang/String;", "getTabIndex", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Movie implements PushNotificationPayload {
        private final String contentsCode;
        private final int tabIndex;
        private final PayloadType type;

        public Movie() {
            this(null, null, 0, 7, null);
        }

        public static /* synthetic */ Movie copy$default(Movie movie, PayloadType payloadType, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                payloadType = movie.type;
            }
            if ((i2 & 2) != 0) {
                str = movie.contentsCode;
            }
            if ((i2 & 4) != 0) {
                i = movie.tabIndex;
            }
            return movie.copy(payloadType, str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayloadType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContentsCode() {
            return this.contentsCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getTabIndex() {
            return this.tabIndex;
        }

        public final Movie copy(PayloadType type, String contentsCode, int tabIndex) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Movie(type, contentsCode, tabIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Movie)) {
                return false;
            }
            Movie movie = (Movie) other;
            return this.type == movie.type && Intrinsics.areEqual(this.contentsCode, movie.contentsCode) && this.tabIndex == movie.tabIndex;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.contentsCode;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.tabIndex);
        }

        public String toString() {
            return "Movie(type=" + this.type + ", contentsCode=" + this.contentsCode + ", tabIndex=" + this.tabIndex + ")";
        }

        public Movie(PayloadType type, String str, int i) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.contentsCode = str;
            this.tabIndex = i;
        }

        public /* synthetic */ Movie(PayloadType payloadType, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? PayloadType.MOVIE : payloadType, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
        }

        @Override // com.medicmedia.medilink.domain.model.PushNotificationPayload
        public PayloadType getType() {
            return this.type;
        }

        public final String getContentsCode() {
            return this.contentsCode;
        }

        public final int getTabIndex() {
            return this.tabIndex;
        }
    }

    /* JADX INFO: compiled from: PushNotificationPayload.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/model/PushNotificationPayload$DlContents;", "Lcom/medicmedia/medilink/domain/model/PushNotificationPayload;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/PayloadType;", "contentsCode", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/PayloadType;Ljava/lang/String;)V", "getType", "()Lcom/medicmedia/medilink/domain/model/PayloadType;", "getContentsCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DlContents implements PushNotificationPayload {
        private final String contentsCode;
        private final PayloadType type;

        public DlContents() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DlContents copy$default(DlContents dlContents, PayloadType payloadType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                payloadType = dlContents.type;
            }
            if ((i & 2) != 0) {
                str = dlContents.contentsCode;
            }
            return dlContents.copy(payloadType, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayloadType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContentsCode() {
            return this.contentsCode;
        }

        public final DlContents copy(PayloadType type, String contentsCode) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new DlContents(type, contentsCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DlContents)) {
                return false;
            }
            DlContents dlContents = (DlContents) other;
            return this.type == dlContents.type && Intrinsics.areEqual(this.contentsCode, dlContents.contentsCode);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.contentsCode;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DlContents(type=" + this.type + ", contentsCode=" + this.contentsCode + ")";
        }

        public DlContents(PayloadType type, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.contentsCode = str;
        }

        public /* synthetic */ DlContents(PayloadType payloadType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PayloadType.DL_CONTENTS : payloadType, (i & 2) != 0 ? null : str);
        }

        @Override // com.medicmedia.medilink.domain.model.PushNotificationPayload
        public PayloadType getType() {
            return this.type;
        }

        public final String getContentsCode() {
            return this.contentsCode;
        }
    }
}
