package com.medicmedia.medilink.domain.model.announce;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import io.realm.kotlin.types.RealmInstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnnounceItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J[\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "date", "Lio/realm/kotlin/types/RealmInstant;", "option", "message", "url", "labels", "isRead", "", "<init>", "(Ljava/lang/String;Lio/realm/kotlin/types/RealmInstant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getDate", "()Lio/realm/kotlin/types/RealmInstant;", "getOption", "getMessage", "getUrl", "getLabels", "()Z", "id", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AnnounceItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AnnounceItem sample = new AnnounceItem("【重要】メンテナンスのお知らせ", RealmInstant.INSTANCE.from(2025, 0), null, "<b>2025/11/10</b> 深夜にシステムメンテナンスを実施します。", "https://example.com/info/maintenance", "重要", false, 4, null);
    private static final List<AnnounceItem> sampleList;
    private final RealmInstant date;
    private final boolean isRead;
    private final String labels;
    private final String message;
    private final String option;
    private final String title;
    private final String url;

    public AnnounceItem() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ AnnounceItem copy$default(AnnounceItem announceItem, String str, RealmInstant realmInstant, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = announceItem.title;
        }
        if ((i & 2) != 0) {
            realmInstant = announceItem.date;
        }
        if ((i & 4) != 0) {
            str2 = announceItem.option;
        }
        if ((i & 8) != 0) {
            str3 = announceItem.message;
        }
        if ((i & 16) != 0) {
            str4 = announceItem.url;
        }
        if ((i & 32) != 0) {
            str5 = announceItem.labels;
        }
        if ((i & 64) != 0) {
            z = announceItem.isRead;
        }
        String str6 = str5;
        boolean z2 = z;
        String str7 = str4;
        String str8 = str2;
        return announceItem.copy(str, realmInstant, str8, str3, str7, str6, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RealmInstant getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabels() {
        return this.labels;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final AnnounceItem copy(String title, RealmInstant date, String option, String message, String url, String labels, boolean isRead) {
        return new AnnounceItem(title, date, option, message, url, labels, isRead);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnounceItem)) {
            return false;
        }
        AnnounceItem announceItem = (AnnounceItem) other;
        return Intrinsics.areEqual(this.title, announceItem.title) && Intrinsics.areEqual(this.date, announceItem.date) && Intrinsics.areEqual(this.option, announceItem.option) && Intrinsics.areEqual(this.message, announceItem.message) && Intrinsics.areEqual(this.url, announceItem.url) && Intrinsics.areEqual(this.labels, announceItem.labels) && this.isRead == announceItem.isRead;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RealmInstant realmInstant = this.date;
        int iHashCode2 = (iHashCode + (realmInstant == null ? 0 : realmInstant.hashCode())) * 31;
        String str2 = this.option;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.labels;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRead);
    }

    public String toString() {
        return "AnnounceItem(title=" + this.title + ", date=" + this.date + ", option=" + this.option + ", message=" + this.message + ", url=" + this.url + ", labels=" + this.labels + ", isRead=" + this.isRead + ")";
    }

    public AnnounceItem(String str, RealmInstant realmInstant, String str2, String str3, String str4, String str5, boolean z) {
        this.title = str;
        this.date = realmInstant;
        this.option = str2;
        this.message = str3;
        this.url = str4;
        this.labels = str5;
        this.isRead = z;
    }

    public /* synthetic */ AnnounceItem(String str, RealmInstant realmInstant, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : realmInstant, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z);
    }

    public final String getTitle() {
        return this.title;
    }

    public final RealmInstant getDate() {
        return this.date;
    }

    public final String getOption() {
        return this.option;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getLabels() {
        return this.labels;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final String getId() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        String str2 = this.title;
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: compiled from: AnnounceItem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem$Companion;", "", "<init>", "()V", "sample", "Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;", "getSample", "()Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;", "sampleList", "", "getSampleList", "()Ljava/util/List;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnnounceItem getSample() {
            return AnnounceItem.sample;
        }

        public final List<AnnounceItem> getSampleList() {
            return AnnounceItem.sampleList;
        }
    }

    static {
        String str = null;
        sampleList = CollectionsKt.listOf((Object[]) new AnnounceItem[]{new AnnounceItem("【重要】メンテナンスのお知らせ", 0 == true ? 1 : 0, null, "11月10日にシステムメンテナンスを実施します。", null, str, false, 54, null), new AnnounceItem("新機能リリース", 0 == true ? 1 : 0, null, "ブックマーク機能を追加しました。", str, null, true, 54, null)});
    }
}
