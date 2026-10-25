package com.medicmedia.medilink.ui.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.actions.SearchIntents;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.ShareType;
import com.medicmedia.medilink.domain.model.FAEventItem;
import com.medicmedia.medilink.domain.model.IntermediatePageEntryType;
import com.medicmedia.medilink.domain.model.QBContentsLinkItem;
import com.medicmedia.medilink.domain.model.QrContentsItem;
import com.medicmedia.medilink.ui.chatbot.ChatbotStartType;
import com.medicmedia.medilink.ui.web.OtherWebViewArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Destination.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0019\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u0082\u0001\u0019\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination;", "", "Main", "Settings", "Announce", "CameraScan", "OfflineContents", "OnlineContents", "QBContents", "QBContentsFromLink", "ContentsEditList", "HistoryDeleteList", "Toc", "ContentsDetailHistoryList", "VideoList", "VideoChapterList", "VideoDetail", "VideoDownloadList", "VideoEditList", "Dashboard", "ContinuousCheckMode", "Chatbot", "IntermediatePage", "OtherWeb", "MLOtherSite", "Share", "GoogleSearch", "Lcom/medicmedia/medilink/ui/navigation/Destination$Announce;", "Lcom/medicmedia/medilink/ui/navigation/Destination$CameraScan;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Chatbot;", "Lcom/medicmedia/medilink/ui/navigation/Destination$ContentsDetailHistoryList;", "Lcom/medicmedia/medilink/ui/navigation/Destination$ContentsEditList;", "Lcom/medicmedia/medilink/ui/navigation/Destination$ContinuousCheckMode;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Dashboard;", "Lcom/medicmedia/medilink/ui/navigation/Destination$GoogleSearch;", "Lcom/medicmedia/medilink/ui/navigation/Destination$HistoryDeleteList;", "Lcom/medicmedia/medilink/ui/navigation/Destination$IntermediatePage;", "Lcom/medicmedia/medilink/ui/navigation/Destination$MLOtherSite;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Main;", "Lcom/medicmedia/medilink/ui/navigation/Destination$OfflineContents;", "Lcom/medicmedia/medilink/ui/navigation/Destination$OnlineContents;", "Lcom/medicmedia/medilink/ui/navigation/Destination$OtherWeb;", "Lcom/medicmedia/medilink/ui/navigation/Destination$QBContents;", "Lcom/medicmedia/medilink/ui/navigation/Destination$QBContentsFromLink;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Settings;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Share;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Toc;", "Lcom/medicmedia/medilink/ui/navigation/Destination$VideoChapterList;", "Lcom/medicmedia/medilink/ui/navigation/Destination$VideoDetail;", "Lcom/medicmedia/medilink/ui/navigation/Destination$VideoDownloadList;", "Lcom/medicmedia/medilink/ui/navigation/Destination$VideoEditList;", "Lcom/medicmedia/medilink/ui/navigation/Destination$VideoList;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface Destination {

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Main;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Main implements Destination {
        public static final int $stable = 0;
        public static final Main INSTANCE = new Main();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Main)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -479847763;
        }

        public String toString() {
            return "Main";
        }

        private Main() {
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Settings;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Settings implements Destination {
        public static final int $stable = 0;
        public static final Settings INSTANCE = new Settings();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1904593129;
        }

        public String toString() {
            return "Settings";
        }

        private Settings() {
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Announce;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Announce implements Destination {
        public static final int $stable = 0;
        public static final Announce INSTANCE = new Announce();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Announce)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 306122589;
        }

        public String toString() {
            return "Announce";
        }

        private Announce() {
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$CameraScan;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class CameraScan implements Destination {
        public static final int $stable = 0;
        public static final CameraScan INSTANCE = new CameraScan();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraScan)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1628795190;
        }

        public String toString() {
            return "CameraScan";
        }

        private CameraScan() {
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010#\u001a\u00020\fHÆ\u0003Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H×\u0003J\t\u0010*\u001a\u00020\u0007H×\u0001J\t\u0010+\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$OfflineContents;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "url", BundleKey.THUMBNAIL, "index", "", SearchIntents.EXTRA_QUERY, BundleKey.TAG_ID, BundleKey.TAB_NO, "faEvent", "Lcom/medicmedia/medilink/domain/model/FAEventItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/domain/model/FAEventItem;)V", "getContentsId", "()Ljava/lang/String;", "getUrl", "getThumbnail", "getIndex", "()I", "getQuery", "getTagId", "getTabNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFaEvent", "()Lcom/medicmedia/medilink/domain/model/FAEventItem;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/domain/model/FAEventItem;)Lcom/medicmedia/medilink/ui/navigation/Destination$OfflineContents;", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OfflineContents implements Destination {
        public static final int $stable = 8;
        private final String contentsId;
        private final FAEventItem faEvent;
        private final int index;
        private final String query;
        private final Integer tabNo;
        private final String tagId;
        private final String thumbnail;
        private final String url;

        public static /* synthetic */ OfflineContents copy$default(OfflineContents offlineContents, String str, String str2, String str3, int i, String str4, String str5, Integer num, FAEventItem fAEventItem, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = offlineContents.contentsId;
            }
            if ((i2 & 2) != 0) {
                str2 = offlineContents.url;
            }
            if ((i2 & 4) != 0) {
                str3 = offlineContents.thumbnail;
            }
            if ((i2 & 8) != 0) {
                i = offlineContents.index;
            }
            if ((i2 & 16) != 0) {
                str4 = offlineContents.query;
            }
            if ((i2 & 32) != 0) {
                str5 = offlineContents.tagId;
            }
            if ((i2 & 64) != 0) {
                num = offlineContents.tabNo;
            }
            if ((i2 & 128) != 0) {
                fAEventItem = offlineContents.faEvent;
            }
            Integer num2 = num;
            FAEventItem fAEventItem2 = fAEventItem;
            String str6 = str4;
            String str7 = str5;
            return offlineContents.copy(str, str2, str3, i, str6, str7, num2, fAEventItem2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getThumbnail() {
            return this.thumbnail;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTagId() {
            return this.tagId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getTabNo() {
            return this.tabNo;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final FAEventItem getFaEvent() {
            return this.faEvent;
        }

        public final OfflineContents copy(String contentsId, String url, String thumbnail, int index, String query, String tagId, Integer tabNo, FAEventItem faEvent) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            Intrinsics.checkNotNullParameter(faEvent, "faEvent");
            return new OfflineContents(contentsId, url, thumbnail, index, query, tagId, tabNo, faEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfflineContents)) {
                return false;
            }
            OfflineContents offlineContents = (OfflineContents) other;
            return Intrinsics.areEqual(this.contentsId, offlineContents.contentsId) && Intrinsics.areEqual(this.url, offlineContents.url) && Intrinsics.areEqual(this.thumbnail, offlineContents.thumbnail) && this.index == offlineContents.index && Intrinsics.areEqual(this.query, offlineContents.query) && Intrinsics.areEqual(this.tagId, offlineContents.tagId) && Intrinsics.areEqual(this.tabNo, offlineContents.tabNo) && Intrinsics.areEqual(this.faEvent, offlineContents.faEvent);
        }

        public int hashCode() {
            int iHashCode = ((((((this.contentsId.hashCode() * 31) + this.url.hashCode()) * 31) + this.thumbnail.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
            String str = this.query;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tagId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.tabNo;
            return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.faEvent.hashCode();
        }

        public String toString() {
            return "OfflineContents(contentsId=" + this.contentsId + ", url=" + this.url + ", thumbnail=" + this.thumbnail + ", index=" + this.index + ", query=" + this.query + ", tagId=" + this.tagId + ", tabNo=" + this.tabNo + ", faEvent=" + this.faEvent + ")";
        }

        public OfflineContents(String contentsId, String url, String thumbnail, int i, String str, String str2, Integer num, FAEventItem faEvent) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            Intrinsics.checkNotNullParameter(faEvent, "faEvent");
            this.contentsId = contentsId;
            this.url = url;
            this.thumbnail = thumbnail;
            this.index = i;
            this.query = str;
            this.tagId = str2;
            this.tabNo = num;
            this.faEvent = faEvent;
        }

        public /* synthetic */ OfflineContents(String str, String str2, String str3, int i, String str4, String str5, Integer num, FAEventItem fAEventItem, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, i, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : num, fAEventItem);
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getThumbnail() {
            return this.thumbnail;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getQuery() {
            return this.query;
        }

        public final String getTagId() {
            return this.tagId;
        }

        public final Integer getTabNo() {
            return this.tabNo;
        }

        public final FAEventItem getFaEvent() {
            return this.faEvent;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$OnlineContents;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "url", BundleKey.THUMBNAIL, "isModal", "", "faEvent", "Lcom/medicmedia/medilink/domain/model/FAEventItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/medicmedia/medilink/domain/model/FAEventItem;)V", "getContentsId", "()Ljava/lang/String;", "getUrl", "getThumbnail", "()Z", "getFaEvent", "()Lcom/medicmedia/medilink/domain/model/FAEventItem;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OnlineContents implements Destination {
        public static final int $stable = 8;
        private final String contentsId;
        private final FAEventItem faEvent;
        private final boolean isModal;
        private final String thumbnail;
        private final String url;

        public static /* synthetic */ OnlineContents copy$default(OnlineContents onlineContents, String str, String str2, String str3, boolean z, FAEventItem fAEventItem, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onlineContents.contentsId;
            }
            if ((i & 2) != 0) {
                str2 = onlineContents.url;
            }
            if ((i & 4) != 0) {
                str3 = onlineContents.thumbnail;
            }
            if ((i & 8) != 0) {
                z = onlineContents.isModal;
            }
            if ((i & 16) != 0) {
                fAEventItem = onlineContents.faEvent;
            }
            FAEventItem fAEventItem2 = fAEventItem;
            String str4 = str3;
            return onlineContents.copy(str, str2, str4, z, fAEventItem2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getThumbnail() {
            return this.thumbnail;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsModal() {
            return this.isModal;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final FAEventItem getFaEvent() {
            return this.faEvent;
        }

        public final OnlineContents copy(String contentsId, String url, String thumbnail, boolean isModal, FAEventItem faEvent) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(faEvent, "faEvent");
            return new OnlineContents(contentsId, url, thumbnail, isModal, faEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnlineContents)) {
                return false;
            }
            OnlineContents onlineContents = (OnlineContents) other;
            return Intrinsics.areEqual(this.contentsId, onlineContents.contentsId) && Intrinsics.areEqual(this.url, onlineContents.url) && Intrinsics.areEqual(this.thumbnail, onlineContents.thumbnail) && this.isModal == onlineContents.isModal && Intrinsics.areEqual(this.faEvent, onlineContents.faEvent);
        }

        public int hashCode() {
            int iHashCode = ((this.contentsId.hashCode() * 31) + this.url.hashCode()) * 31;
            String str = this.thumbnail;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isModal)) * 31) + this.faEvent.hashCode();
        }

        public String toString() {
            return "OnlineContents(contentsId=" + this.contentsId + ", url=" + this.url + ", thumbnail=" + this.thumbnail + ", isModal=" + this.isModal + ", faEvent=" + this.faEvent + ")";
        }

        public OnlineContents(String contentsId, String url, String str, boolean z, FAEventItem faEvent) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(faEvent, "faEvent");
            this.contentsId = contentsId;
            this.url = url;
            this.thumbnail = str;
            this.isModal = z;
            this.faEvent = faEvent;
        }

        public /* synthetic */ OnlineContents(String str, String str2, String str3, boolean z, FAEventItem fAEventItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? false : z, fAEventItem);
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getThumbnail() {
            return this.thumbnail;
        }

        public final boolean isModal() {
            return this.isModal;
        }

        public final FAEventItem getFaEvent() {
            return this.faEvent;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$QBContents;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "linkUrl", "", BundleKey.THUMBNAIL, "contentInfo", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLinkUrl", "()Ljava/lang/String;", "getThumbnail", "getContentInfo", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class QBContents implements Destination {
        public static final int $stable = 8;
        private final List<String> contentInfo;
        private final String linkUrl;
        private final String thumbnail;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QBContents copy$default(QBContents qBContents, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qBContents.linkUrl;
            }
            if ((i & 2) != 0) {
                str2 = qBContents.thumbnail;
            }
            if ((i & 4) != 0) {
                list = qBContents.contentInfo;
            }
            return qBContents.copy(str, str2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getThumbnail() {
            return this.thumbnail;
        }

        public final List<String> component3() {
            return this.contentInfo;
        }

        public final QBContents copy(String linkUrl, String thumbnail, List<String> contentInfo) {
            Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
            Intrinsics.checkNotNullParameter(contentInfo, "contentInfo");
            return new QBContents(linkUrl, thumbnail, contentInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QBContents)) {
                return false;
            }
            QBContents qBContents = (QBContents) other;
            return Intrinsics.areEqual(this.linkUrl, qBContents.linkUrl) && Intrinsics.areEqual(this.thumbnail, qBContents.thumbnail) && Intrinsics.areEqual(this.contentInfo, qBContents.contentInfo);
        }

        public int hashCode() {
            int iHashCode = this.linkUrl.hashCode() * 31;
            String str = this.thumbnail;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contentInfo.hashCode();
        }

        public String toString() {
            return "QBContents(linkUrl=" + this.linkUrl + ", thumbnail=" + this.thumbnail + ", contentInfo=" + this.contentInfo + ")";
        }

        public QBContents(String linkUrl, String str, List<String> contentInfo) {
            Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
            Intrinsics.checkNotNullParameter(contentInfo, "contentInfo");
            this.linkUrl = linkUrl;
            this.thumbnail = str;
            this.contentInfo = contentInfo;
        }

        public final String getLinkUrl() {
            return this.linkUrl;
        }

        public final String getThumbnail() {
            return this.thumbnail;
        }

        public /* synthetic */ QBContents(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<String> getContentInfo() {
            return this.contentInfo;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$QBContentsFromLink;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "item", "Lcom/medicmedia/medilink/domain/model/QBContentsLinkItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/QBContentsLinkItem;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/QBContentsLinkItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class QBContentsFromLink implements Destination {
        public static final int $stable = 8;
        private final QBContentsLinkItem item;

        public static /* synthetic */ QBContentsFromLink copy$default(QBContentsFromLink qBContentsFromLink, QBContentsLinkItem qBContentsLinkItem, int i, Object obj) {
            if ((i & 1) != 0) {
                qBContentsLinkItem = qBContentsFromLink.item;
            }
            return qBContentsFromLink.copy(qBContentsLinkItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final QBContentsLinkItem getItem() {
            return this.item;
        }

        public final QBContentsFromLink copy(QBContentsLinkItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new QBContentsFromLink(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QBContentsFromLink) && Intrinsics.areEqual(this.item, ((QBContentsFromLink) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "QBContentsFromLink(item=" + this.item + ")";
        }

        public QBContentsFromLink(QBContentsLinkItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public final QBContentsLinkItem getItem() {
            return this.item;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$ContentsEditList;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "editMode", "", "<init>", "(I)V", "getEditMode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContentsEditList implements Destination {
        public static final int $stable = 0;
        private final int editMode;

        public static /* synthetic */ ContentsEditList copy$default(ContentsEditList contentsEditList, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = contentsEditList.editMode;
            }
            return contentsEditList.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getEditMode() {
            return this.editMode;
        }

        public final ContentsEditList copy(int editMode) {
            return new ContentsEditList(editMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContentsEditList) && this.editMode == ((ContentsEditList) other).editMode;
        }

        public int hashCode() {
            return Integer.hashCode(this.editMode);
        }

        public String toString() {
            return "ContentsEditList(editMode=" + this.editMode + ")";
        }

        public ContentsEditList(int i) {
            this.editMode = i;
        }

        public final int getEditMode() {
            return this.editMode;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$HistoryDeleteList;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "listType", "", "<init>", "(Ljava/lang/String;)V", "getListType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class HistoryDeleteList implements Destination {
        public static final int $stable = 0;
        private final String listType;

        public static /* synthetic */ HistoryDeleteList copy$default(HistoryDeleteList historyDeleteList, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = historyDeleteList.listType;
            }
            return historyDeleteList.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getListType() {
            return this.listType;
        }

        public final HistoryDeleteList copy(String listType) {
            Intrinsics.checkNotNullParameter(listType, "listType");
            return new HistoryDeleteList(listType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HistoryDeleteList) && Intrinsics.areEqual(this.listType, ((HistoryDeleteList) other).listType);
        }

        public int hashCode() {
            return this.listType.hashCode();
        }

        public String toString() {
            return "HistoryDeleteList(listType=" + this.listType + ")";
        }

        public HistoryDeleteList(String listType) {
            Intrinsics.checkNotNullParameter(listType, "listType");
            this.listType = listType;
        }

        public final String getListType() {
            return this.listType;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Toc;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "<init>", "()V", "Book", "Video", "Lcom/medicmedia/medilink/ui/navigation/Destination$Toc$Book;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Toc$Video;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class Toc implements Destination {
        public static final int $stable = 0;

        public /* synthetic */ Toc(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: Destination.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Toc$Book;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Toc;", "contentsId", "", BundleKey.TAG_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getTagId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Book extends Toc {
            public static final int $stable = 0;
            private final String contentsId;
            private final String tagId;

            public static /* synthetic */ Book copy$default(Book book, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = book.contentsId;
                }
                if ((i & 2) != 0) {
                    str2 = book.tagId;
                }
                return book.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getContentsId() {
                return this.contentsId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getTagId() {
                return this.tagId;
            }

            public final Book copy(String contentsId, String tagId) {
                Intrinsics.checkNotNullParameter(contentsId, "contentsId");
                return new Book(contentsId, tagId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Book)) {
                    return false;
                }
                Book book = (Book) other;
                return Intrinsics.areEqual(this.contentsId, book.contentsId) && Intrinsics.areEqual(this.tagId, book.tagId);
            }

            public int hashCode() {
                int iHashCode = this.contentsId.hashCode() * 31;
                String str = this.tagId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Book(contentsId=" + this.contentsId + ", tagId=" + this.tagId + ")";
            }

            public /* synthetic */ Book(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            public final String getContentsId() {
                return this.contentsId;
            }

            public final String getTagId() {
                return this.tagId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Book(String contentsId, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(contentsId, "contentsId");
                this.contentsId = contentsId;
                this.tagId = str;
            }
        }

        private Toc() {
        }

        /* JADX INFO: compiled from: Destination.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0005H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Toc$Video;", "Lcom/medicmedia/medilink/ui/navigation/Destination$Toc;", "contentsId", "", "chapterId", "", BundleKey.VIDEO_ID, "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getContentsId", "()Ljava/lang/String;", "getChapterId", "()I", "getVideoId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Integer;)Lcom/medicmedia/medilink/ui/navigation/Destination$Toc$Video;", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Video extends Toc {
            public static final int $stable = 0;
            private final int chapterId;
            private final String contentsId;
            private final Integer videoId;

            public static /* synthetic */ Video copy$default(Video video, String str, int i, Integer num, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = video.contentsId;
                }
                if ((i2 & 2) != 0) {
                    i = video.chapterId;
                }
                if ((i2 & 4) != 0) {
                    num = video.videoId;
                }
                return video.copy(str, i, num);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getContentsId() {
                return this.contentsId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getChapterId() {
                return this.chapterId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getVideoId() {
                return this.videoId;
            }

            public final Video copy(String contentsId, int chapterId, Integer videoId) {
                Intrinsics.checkNotNullParameter(contentsId, "contentsId");
                return new Video(contentsId, chapterId, videoId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.areEqual(this.contentsId, video.contentsId) && this.chapterId == video.chapterId && Intrinsics.areEqual(this.videoId, video.videoId);
            }

            public int hashCode() {
                int iHashCode = ((this.contentsId.hashCode() * 31) + Integer.hashCode(this.chapterId)) * 31;
                Integer num = this.videoId;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                return "Video(contentsId=" + this.contentsId + ", chapterId=" + this.chapterId + ", videoId=" + this.videoId + ")";
            }

            public /* synthetic */ Video(String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, (i2 & 4) != 0 ? null : num);
            }

            public final String getContentsId() {
                return this.contentsId;
            }

            public final int getChapterId() {
                return this.chapterId;
            }

            public final Integer getVideoId() {
                return this.videoId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Video(String contentsId, int i, Integer num) {
                super(null);
                Intrinsics.checkNotNullParameter(contentsId, "contentsId");
                this.contentsId = contentsId;
                this.chapterId = i;
                this.videoId = num;
            }
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$ContentsDetailHistoryList;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "<init>", "(Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContentsDetailHistoryList implements Destination {
        public static final int $stable = 0;
        private final String contentsId;

        public static /* synthetic */ ContentsDetailHistoryList copy$default(ContentsDetailHistoryList contentsDetailHistoryList, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentsDetailHistoryList.contentsId;
            }
            return contentsDetailHistoryList.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        public final ContentsDetailHistoryList copy(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new ContentsDetailHistoryList(contentsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContentsDetailHistoryList) && Intrinsics.areEqual(this.contentsId, ((ContentsDetailHistoryList) other).contentsId);
        }

        public int hashCode() {
            return this.contentsId.hashCode();
        }

        public String toString() {
            return "ContentsDetailHistoryList(contentsId=" + this.contentsId + ")";
        }

        public ContentsDetailHistoryList(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.contentsId = contentsId;
        }

        public final String getContentsId() {
            return this.contentsId;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0005H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$VideoList;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "tabIndex", "", "flags", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getContentsId", "()Ljava/lang/String;", "getTabIndex", "()I", "getFlags", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Integer;)Lcom/medicmedia/medilink/ui/navigation/Destination$VideoList;", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class VideoList implements Destination {
        public static final int $stable = 0;
        private final String contentsId;
        private final Integer flags;
        private final int tabIndex;

        public static /* synthetic */ VideoList copy$default(VideoList videoList, String str, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = videoList.contentsId;
            }
            if ((i2 & 2) != 0) {
                i = videoList.tabIndex;
            }
            if ((i2 & 4) != 0) {
                num = videoList.flags;
            }
            return videoList.copy(str, i, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTabIndex() {
            return this.tabIndex;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getFlags() {
            return this.flags;
        }

        public final VideoList copy(String contentsId, int tabIndex, Integer flags) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new VideoList(contentsId, tabIndex, flags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoList)) {
                return false;
            }
            VideoList videoList = (VideoList) other;
            return Intrinsics.areEqual(this.contentsId, videoList.contentsId) && this.tabIndex == videoList.tabIndex && Intrinsics.areEqual(this.flags, videoList.flags);
        }

        public int hashCode() {
            int iHashCode = ((this.contentsId.hashCode() * 31) + Integer.hashCode(this.tabIndex)) * 31;
            Integer num = this.flags;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "VideoList(contentsId=" + this.contentsId + ", tabIndex=" + this.tabIndex + ", flags=" + this.flags + ")";
        }

        public VideoList(String contentsId, int i, Integer num) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.contentsId = contentsId;
            this.tabIndex = i;
            this.flags = num;
        }

        public /* synthetic */ VideoList(String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : num);
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final int getTabIndex() {
            return this.tabIndex;
        }

        public final Integer getFlags() {
            return this.flags;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0005H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$VideoChapterList;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "chapterId", "", "flags", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getContentsId", "()Ljava/lang/String;", "getChapterId", "()I", "getFlags", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Integer;)Lcom/medicmedia/medilink/ui/navigation/Destination$VideoChapterList;", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class VideoChapterList implements Destination {
        public static final int $stable = 0;
        private final int chapterId;
        private final String contentsId;
        private final Integer flags;

        public static /* synthetic */ VideoChapterList copy$default(VideoChapterList videoChapterList, String str, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = videoChapterList.contentsId;
            }
            if ((i2 & 2) != 0) {
                i = videoChapterList.chapterId;
            }
            if ((i2 & 4) != 0) {
                num = videoChapterList.flags;
            }
            return videoChapterList.copy(str, i, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getChapterId() {
            return this.chapterId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getFlags() {
            return this.flags;
        }

        public final VideoChapterList copy(String contentsId, int chapterId, Integer flags) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new VideoChapterList(contentsId, chapterId, flags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoChapterList)) {
                return false;
            }
            VideoChapterList videoChapterList = (VideoChapterList) other;
            return Intrinsics.areEqual(this.contentsId, videoChapterList.contentsId) && this.chapterId == videoChapterList.chapterId && Intrinsics.areEqual(this.flags, videoChapterList.flags);
        }

        public int hashCode() {
            int iHashCode = ((this.contentsId.hashCode() * 31) + Integer.hashCode(this.chapterId)) * 31;
            Integer num = this.flags;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "VideoChapterList(contentsId=" + this.contentsId + ", chapterId=" + this.chapterId + ", flags=" + this.flags + ")";
        }

        public VideoChapterList(String contentsId, int i, Integer num) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.contentsId = contentsId;
            this.chapterId = i;
            this.flags = num;
        }

        public /* synthetic */ VideoChapterList(String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : num);
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final int getChapterId() {
            return this.chapterId;
        }

        public final Integer getFlags() {
            return this.flags;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020\u0005H×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006&"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$VideoDetail;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "courseId", "", "startVideoHash", "videoHashList", "", "sampleCourseId", "startTime", "isMemo", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getContentsId", "()Ljava/lang/String;", "getCourseId", "()I", "getStartVideoHash", "getVideoHashList", "()Ljava/util/List;", "getSampleCourseId", "getStartTime", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class VideoDetail implements Destination {
        public static final int $stable = 8;
        private final String contentsId;
        private final int courseId;
        private final boolean isMemo;
        private final String sampleCourseId;
        private final String startTime;
        private final String startVideoHash;
        private final List<String> videoHashList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoDetail copy$default(VideoDetail videoDetail, String str, int i, String str2, List list, String str3, String str4, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = videoDetail.contentsId;
            }
            if ((i2 & 2) != 0) {
                i = videoDetail.courseId;
            }
            if ((i2 & 4) != 0) {
                str2 = videoDetail.startVideoHash;
            }
            if ((i2 & 8) != 0) {
                list = videoDetail.videoHashList;
            }
            if ((i2 & 16) != 0) {
                str3 = videoDetail.sampleCourseId;
            }
            if ((i2 & 32) != 0) {
                str4 = videoDetail.startTime;
            }
            if ((i2 & 64) != 0) {
                z = videoDetail.isMemo;
            }
            String str5 = str4;
            boolean z2 = z;
            String str6 = str3;
            String str7 = str2;
            return videoDetail.copy(str, i, str7, list, str6, str5, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCourseId() {
            return this.courseId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStartVideoHash() {
            return this.startVideoHash;
        }

        public final List<String> component4() {
            return this.videoHashList;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSampleCourseId() {
            return this.sampleCourseId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsMemo() {
            return this.isMemo;
        }

        public final VideoDetail copy(String contentsId, int courseId, String startVideoHash, List<String> videoHashList, String sampleCourseId, String startTime, boolean isMemo) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(startVideoHash, "startVideoHash");
            Intrinsics.checkNotNullParameter(videoHashList, "videoHashList");
            return new VideoDetail(contentsId, courseId, startVideoHash, videoHashList, sampleCourseId, startTime, isMemo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoDetail)) {
                return false;
            }
            VideoDetail videoDetail = (VideoDetail) other;
            return Intrinsics.areEqual(this.contentsId, videoDetail.contentsId) && this.courseId == videoDetail.courseId && Intrinsics.areEqual(this.startVideoHash, videoDetail.startVideoHash) && Intrinsics.areEqual(this.videoHashList, videoDetail.videoHashList) && Intrinsics.areEqual(this.sampleCourseId, videoDetail.sampleCourseId) && Intrinsics.areEqual(this.startTime, videoDetail.startTime) && this.isMemo == videoDetail.isMemo;
        }

        public int hashCode() {
            int iHashCode = ((((((this.contentsId.hashCode() * 31) + Integer.hashCode(this.courseId)) * 31) + this.startVideoHash.hashCode()) * 31) + this.videoHashList.hashCode()) * 31;
            String str = this.sampleCourseId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.startTime;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMemo);
        }

        public String toString() {
            return "VideoDetail(contentsId=" + this.contentsId + ", courseId=" + this.courseId + ", startVideoHash=" + this.startVideoHash + ", videoHashList=" + this.videoHashList + ", sampleCourseId=" + this.sampleCourseId + ", startTime=" + this.startTime + ", isMemo=" + this.isMemo + ")";
        }

        public VideoDetail(String contentsId, int i, String startVideoHash, List<String> videoHashList, String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(startVideoHash, "startVideoHash");
            Intrinsics.checkNotNullParameter(videoHashList, "videoHashList");
            this.contentsId = contentsId;
            this.courseId = i;
            this.startVideoHash = startVideoHash;
            this.videoHashList = videoHashList;
            this.sampleCourseId = str;
            this.startTime = str2;
            this.isMemo = z;
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final int getCourseId() {
            return this.courseId;
        }

        public final String getStartVideoHash() {
            return this.startVideoHash;
        }

        public /* synthetic */ VideoDetail(String str, int i, String str2, List list, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? false : z);
        }

        public final List<String> getVideoHashList() {
            return this.videoHashList;
        }

        public final String getSampleCourseId() {
            return this.sampleCourseId;
        }

        public final String getStartTime() {
            return this.startTime;
        }

        public final boolean isMemo() {
            return this.isMemo;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$VideoDownloadList;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "<init>", "(Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class VideoDownloadList implements Destination {
        public static final int $stable = 0;
        private final String contentsId;

        public static /* synthetic */ VideoDownloadList copy$default(VideoDownloadList videoDownloadList, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoDownloadList.contentsId;
            }
            return videoDownloadList.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        public final VideoDownloadList copy(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new VideoDownloadList(contentsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VideoDownloadList) && Intrinsics.areEqual(this.contentsId, ((VideoDownloadList) other).contentsId);
        }

        public int hashCode() {
            return this.contentsId.hashCode();
        }

        public String toString() {
            return "VideoDownloadList(contentsId=" + this.contentsId + ")";
        }

        public VideoDownloadList(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.contentsId = contentsId;
        }

        public final String getContentsId() {
            return this.contentsId;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0005H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$VideoEditList;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "contentsId", "", "mode", "", "<init>", "(Ljava/lang/String;I)V", "getContentsId", "()Ljava/lang/String;", "getMode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class VideoEditList implements Destination {
        public static final int $stable = 0;
        private final String contentsId;
        private final int mode;

        public static /* synthetic */ VideoEditList copy$default(VideoEditList videoEditList, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = videoEditList.contentsId;
            }
            if ((i2 & 2) != 0) {
                i = videoEditList.mode;
            }
            return videoEditList.copy(str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMode() {
            return this.mode;
        }

        public final VideoEditList copy(String contentsId, int mode) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new VideoEditList(contentsId, mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoEditList)) {
                return false;
            }
            VideoEditList videoEditList = (VideoEditList) other;
            return Intrinsics.areEqual(this.contentsId, videoEditList.contentsId) && this.mode == videoEditList.mode;
        }

        public int hashCode() {
            return (this.contentsId.hashCode() * 31) + Integer.hashCode(this.mode);
        }

        public String toString() {
            return "VideoEditList(contentsId=" + this.contentsId + ", mode=" + this.mode + ")";
        }

        public VideoEditList(String contentsId, int i) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.contentsId = contentsId;
            this.mode = i;
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final int getMode() {
            return this.mode;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Dashboard;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Dashboard implements Destination {
        public static final int $stable = 0;
        public static final Dashboard INSTANCE = new Dashboard();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dashboard)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1484599776;
        }

        public String toString() {
            return "Dashboard";
        }

        private Dashboard() {
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$ContinuousCheckMode;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContinuousCheckMode implements Destination {
        public static final int $stable = 0;
        public static final ContinuousCheckMode INSTANCE = new ContinuousCheckMode();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContinuousCheckMode)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1863515896;
        }

        public String toString() {
            return "ContinuousCheckMode";
        }

        private ContinuousCheckMode() {
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Chatbot;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "screenName", "Lcom/medicmedia/medilink/ui/chatbot/ChatbotStartType;", "sessionId", "", "<init>", "(Lcom/medicmedia/medilink/ui/chatbot/ChatbotStartType;Ljava/lang/String;)V", "getScreenName", "()Lcom/medicmedia/medilink/ui/chatbot/ChatbotStartType;", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Chatbot implements Destination {
        public static final int $stable = 0;
        private final ChatbotStartType screenName;
        private final String sessionId;

        public static /* synthetic */ Chatbot copy$default(Chatbot chatbot, ChatbotStartType chatbotStartType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                chatbotStartType = chatbot.screenName;
            }
            if ((i & 2) != 0) {
                str = chatbot.sessionId;
            }
            return chatbot.copy(chatbotStartType, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ChatbotStartType getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final Chatbot copy(ChatbotStartType screenName, String sessionId) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            return new Chatbot(screenName, sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chatbot)) {
                return false;
            }
            Chatbot chatbot = (Chatbot) other;
            return this.screenName == chatbot.screenName && Intrinsics.areEqual(this.sessionId, chatbot.sessionId);
        }

        public int hashCode() {
            int iHashCode = this.screenName.hashCode() * 31;
            String str = this.sessionId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Chatbot(screenName=" + this.screenName + ", sessionId=" + this.sessionId + ")";
        }

        public Chatbot(ChatbotStartType screenName, String str) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            this.screenName = screenName;
            this.sessionId = str;
        }

        public /* synthetic */ Chatbot(ChatbotStartType chatbotStartType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(chatbotStartType, (i & 2) != 0 ? null : str);
        }

        public final ChatbotStartType getScreenName() {
            return this.screenName;
        }

        public final String getSessionId() {
            return this.sessionId;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$IntermediatePage;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "entryType", "Lcom/medicmedia/medilink/domain/model/IntermediatePageEntryType;", BundleKey.QR_CONTENTS_ITEM, "Lcom/medicmedia/medilink/domain/model/QrContentsItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/IntermediatePageEntryType;Lcom/medicmedia/medilink/domain/model/QrContentsItem;)V", "getEntryType", "()Lcom/medicmedia/medilink/domain/model/IntermediatePageEntryType;", "getQrContentsItem", "()Lcom/medicmedia/medilink/domain/model/QrContentsItem;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class IntermediatePage implements Destination {
        public static final int $stable = 8;
        private final IntermediatePageEntryType entryType;
        private final QrContentsItem qrContentsItem;

        public static /* synthetic */ IntermediatePage copy$default(IntermediatePage intermediatePage, IntermediatePageEntryType intermediatePageEntryType, QrContentsItem qrContentsItem, int i, Object obj) {
            if ((i & 1) != 0) {
                intermediatePageEntryType = intermediatePage.entryType;
            }
            if ((i & 2) != 0) {
                qrContentsItem = intermediatePage.qrContentsItem;
            }
            return intermediatePage.copy(intermediatePageEntryType, qrContentsItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IntermediatePageEntryType getEntryType() {
            return this.entryType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final QrContentsItem getQrContentsItem() {
            return this.qrContentsItem;
        }

        public final IntermediatePage copy(IntermediatePageEntryType entryType, QrContentsItem qrContentsItem) {
            Intrinsics.checkNotNullParameter(entryType, "entryType");
            Intrinsics.checkNotNullParameter(qrContentsItem, "qrContentsItem");
            return new IntermediatePage(entryType, qrContentsItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntermediatePage)) {
                return false;
            }
            IntermediatePage intermediatePage = (IntermediatePage) other;
            return this.entryType == intermediatePage.entryType && Intrinsics.areEqual(this.qrContentsItem, intermediatePage.qrContentsItem);
        }

        public int hashCode() {
            return (this.entryType.hashCode() * 31) + this.qrContentsItem.hashCode();
        }

        public String toString() {
            return "IntermediatePage(entryType=" + this.entryType + ", qrContentsItem=" + this.qrContentsItem + ")";
        }

        public IntermediatePage(IntermediatePageEntryType entryType, QrContentsItem qrContentsItem) {
            Intrinsics.checkNotNullParameter(entryType, "entryType");
            Intrinsics.checkNotNullParameter(qrContentsItem, "qrContentsItem");
            this.entryType = entryType;
            this.qrContentsItem = qrContentsItem;
        }

        public final IntermediatePageEntryType getEntryType() {
            return this.entryType;
        }

        public final QrContentsItem getQrContentsItem() {
            return this.qrContentsItem;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$OtherWeb;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "url", "", HistoryRepositoryImpl.FieldName.TITLE, "isPrimaryColor", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getTitle", "()Z", "toArgs", "Lcom/medicmedia/medilink/ui/web/OtherWebViewArgs;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OtherWeb implements Destination {
        public static final int $stable = 0;
        private final boolean isPrimaryColor;
        private final String title;
        private final String url;

        public OtherWeb() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ OtherWeb copy$default(OtherWeb otherWeb, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otherWeb.url;
            }
            if ((i & 2) != 0) {
                str2 = otherWeb.title;
            }
            if ((i & 4) != 0) {
                z = otherWeb.isPrimaryColor;
            }
            return otherWeb.copy(str, str2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsPrimaryColor() {
            return this.isPrimaryColor;
        }

        public final OtherWeb copy(String url, String title, boolean isPrimaryColor) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OtherWeb(url, title, isPrimaryColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtherWeb)) {
                return false;
            }
            OtherWeb otherWeb = (OtherWeb) other;
            return Intrinsics.areEqual(this.url, otherWeb.url) && Intrinsics.areEqual(this.title, otherWeb.title) && this.isPrimaryColor == otherWeb.isPrimaryColor;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            String str = this.title;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isPrimaryColor);
        }

        public String toString() {
            return "OtherWeb(url=" + this.url + ", title=" + this.title + ", isPrimaryColor=" + this.isPrimaryColor + ")";
        }

        public OtherWeb(String url, String str, boolean z) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.title = str;
            this.isPrimaryColor = z;
        }

        public /* synthetic */ OtherWeb(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean isPrimaryColor() {
            return this.isPrimaryColor;
        }

        public final OtherWebViewArgs toArgs() {
            return new OtherWebViewArgs(this.url, this.title, this.isPrimaryColor);
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$MLOtherSite;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class MLOtherSite implements Destination {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ MLOtherSite copy$default(MLOtherSite mLOtherSite, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mLOtherSite.url;
            }
            return mLOtherSite.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final MLOtherSite copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new MLOtherSite(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MLOtherSite) && Intrinsics.areEqual(this.url, ((MLOtherSite) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "MLOtherSite(url=" + this.url + ")";
        }

        public MLOtherSite(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$Share;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "value", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/ShareType;", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/ShareType;)V", "getValue", "()Ljava/lang/String;", "getType", "()Lcom/medicmedia/medilink/domain/ShareType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Share implements Destination {
        public static final int $stable = 0;
        private final ShareType type;
        private final String value;

        public static /* synthetic */ Share copy$default(Share share, String str, ShareType shareType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = share.value;
            }
            if ((i & 2) != 0) {
                shareType = share.type;
            }
            return share.copy(str, shareType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ShareType getType() {
            return this.type;
        }

        public final Share copy(String value, ShareType type) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Share(value, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Share)) {
                return false;
            }
            Share share = (Share) other;
            return Intrinsics.areEqual(this.value, share.value) && this.type == share.type;
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Share(value=" + this.value + ", type=" + this.type + ")";
        }

        public Share(String value, ShareType type) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = value;
            this.type = type;
        }

        public final String getValue() {
            return this.value;
        }

        public /* synthetic */ Share(String str, ShareType shareType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ShareType.TEXT_PLAIN : shareType);
        }

        public final ShareType getType() {
            return this.type;
        }
    }

    /* JADX INFO: compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/navigation/Destination$GoogleSearch;", "Lcom/medicmedia/medilink/ui/navigation/Destination;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class GoogleSearch implements Destination {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ GoogleSearch copy$default(GoogleSearch googleSearch, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = googleSearch.url;
            }
            return googleSearch.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final GoogleSearch copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new GoogleSearch(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoogleSearch) && Intrinsics.areEqual(this.url, ((GoogleSearch) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "GoogleSearch(url=" + this.url + ")";
        }

        public GoogleSearch(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }
}
