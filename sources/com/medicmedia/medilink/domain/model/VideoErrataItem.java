package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: VideoErrataItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010&\u001a\u00020\u0007J\b\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0002J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0002J2\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0002J\f\u00101\u001a\u00020\u0003*\u00020.H\u0002J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J£\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006G"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoErrataItem;", "", "errataId", "", "courseId", "chapterId", "modifiedDate", "", "media", "point", "overview", "wrong", "correct", "supplement", "insertedDate", "updatedDate", "insertedUser", "updatedUser", WorkerKey.KEY_VERSION, "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getErrataId", "()I", "getCourseId", "getChapterId", "getModifiedDate", "()Ljava/lang/String;", "getMedia", "getPoint", "getOverview", "getWrong", "getCorrect", "getSupplement", "getInsertedDate", "getUpdatedDate", "getInsertedUser", "getUpdatedUser", "getVersion", "toHtmlString", "displayDateString", "spanRgbToFont", "html", "deleteParagraph", "hslToRgb", "Lkotlin/Triple;", "hDegrees", "", "s", "l", "roundToInt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoErrataItem {
    private final int chapterId;
    private final String correct;
    private final int courseId;
    private final int errataId;
    private final String insertedDate;
    private final String insertedUser;
    private final String media;
    private final String modifiedDate;
    private final String overview;
    private final String point;
    private final String supplement;
    private final String updatedDate;
    private final String updatedUser;
    private final int version;
    private final String wrong;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrataId() {
        return this.errataId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSupplement() {
        return this.supplement;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getInsertedDate() {
        return this.insertedDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getInsertedUser() {
        return this.insertedUser;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUpdatedUser() {
        return this.updatedUser;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModifiedDate() {
        return this.modifiedDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMedia() {
        return this.media;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPoint() {
        return this.point;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOverview() {
        return this.overview;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWrong() {
        return this.wrong;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCorrect() {
        return this.correct;
    }

    public final VideoErrataItem copy(int errataId, int courseId, int chapterId, String modifiedDate, String media, String point, String overview, String wrong, String correct, String supplement, String insertedDate, String updatedDate, String insertedUser, String updatedUser, int version) {
        Intrinsics.checkNotNullParameter(modifiedDate, "modifiedDate");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(wrong, "wrong");
        Intrinsics.checkNotNullParameter(correct, "correct");
        Intrinsics.checkNotNullParameter(supplement, "supplement");
        Intrinsics.checkNotNullParameter(insertedDate, "insertedDate");
        Intrinsics.checkNotNullParameter(insertedUser, "insertedUser");
        return new VideoErrataItem(errataId, courseId, chapterId, modifiedDate, media, point, overview, wrong, correct, supplement, insertedDate, updatedDate, insertedUser, updatedUser, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoErrataItem)) {
            return false;
        }
        VideoErrataItem videoErrataItem = (VideoErrataItem) other;
        return this.errataId == videoErrataItem.errataId && this.courseId == videoErrataItem.courseId && this.chapterId == videoErrataItem.chapterId && Intrinsics.areEqual(this.modifiedDate, videoErrataItem.modifiedDate) && Intrinsics.areEqual(this.media, videoErrataItem.media) && Intrinsics.areEqual(this.point, videoErrataItem.point) && Intrinsics.areEqual(this.overview, videoErrataItem.overview) && Intrinsics.areEqual(this.wrong, videoErrataItem.wrong) && Intrinsics.areEqual(this.correct, videoErrataItem.correct) && Intrinsics.areEqual(this.supplement, videoErrataItem.supplement) && Intrinsics.areEqual(this.insertedDate, videoErrataItem.insertedDate) && Intrinsics.areEqual(this.updatedDate, videoErrataItem.updatedDate) && Intrinsics.areEqual(this.insertedUser, videoErrataItem.insertedUser) && Intrinsics.areEqual(this.updatedUser, videoErrataItem.updatedUser) && this.version == videoErrataItem.version;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((Integer.hashCode(this.errataId) * 31) + Integer.hashCode(this.courseId)) * 31) + Integer.hashCode(this.chapterId)) * 31) + this.modifiedDate.hashCode()) * 31) + this.media.hashCode()) * 31) + this.point.hashCode()) * 31) + this.overview.hashCode()) * 31) + this.wrong.hashCode()) * 31) + this.correct.hashCode()) * 31) + this.supplement.hashCode()) * 31) + this.insertedDate.hashCode()) * 31;
        String str = this.updatedDate;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.insertedUser.hashCode()) * 31;
        String str2 = this.updatedUser;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "VideoErrataItem(errataId=" + this.errataId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", modifiedDate=" + this.modifiedDate + ", media=" + this.media + ", point=" + this.point + ", overview=" + this.overview + ", wrong=" + this.wrong + ", correct=" + this.correct + ", supplement=" + this.supplement + ", insertedDate=" + this.insertedDate + ", updatedDate=" + this.updatedDate + ", insertedUser=" + this.insertedUser + ", updatedUser=" + this.updatedUser + ", version=" + this.version + ")";
    }

    public VideoErrataItem(int i, int i2, int i3, String modifiedDate, String media, String point, String overview, String wrong, String correct, String supplement, String insertedDate, String str, String insertedUser, String str2, int i4) {
        Intrinsics.checkNotNullParameter(modifiedDate, "modifiedDate");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(wrong, "wrong");
        Intrinsics.checkNotNullParameter(correct, "correct");
        Intrinsics.checkNotNullParameter(supplement, "supplement");
        Intrinsics.checkNotNullParameter(insertedDate, "insertedDate");
        Intrinsics.checkNotNullParameter(insertedUser, "insertedUser");
        this.errataId = i;
        this.courseId = i2;
        this.chapterId = i3;
        this.modifiedDate = modifiedDate;
        this.media = media;
        this.point = point;
        this.overview = overview;
        this.wrong = wrong;
        this.correct = correct;
        this.supplement = supplement;
        this.insertedDate = insertedDate;
        this.updatedDate = str;
        this.insertedUser = insertedUser;
        this.updatedUser = str2;
        this.version = i4;
    }

    public final int getErrataId() {
        return this.errataId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final String getModifiedDate() {
        return this.modifiedDate;
    }

    public final String getMedia() {
        return this.media;
    }

    public final String getPoint() {
        return this.point;
    }

    public final String getOverview() {
        return this.overview;
    }

    public final String getWrong() {
        return this.wrong;
    }

    public final String getCorrect() {
        return this.correct;
    }

    public final String getSupplement() {
        return this.supplement;
    }

    public final String getInsertedDate() {
        return this.insertedDate;
    }

    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public final String getInsertedUser() {
        return this.insertedUser;
    }

    public final String getUpdatedUser() {
        return this.updatedUser;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String toHtmlString() {
        String strDeleteParagraph;
        String strDeleteParagraph2;
        String strDisplayDateString = displayDateString();
        String str = this.media;
        String strSpanRgbToFont = null;
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        String strSpanRgbToFont2 = str != null ? spanRgbToFont(str) : null;
        String str2 = this.point;
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        String strSpanRgbToFont3 = str2 != null ? spanRgbToFont(str2) : null;
        String str3 = this.overview;
        if (StringsKt.isBlank(str3)) {
            str3 = null;
        }
        String strSpanRgbToFont4 = str3 != null ? spanRgbToFont(str3) : null;
        String str4 = this.wrong;
        if (StringsKt.isBlank(str4)) {
            str4 = null;
        }
        String strSpanRgbToFont5 = (str4 == null || (strDeleteParagraph2 = deleteParagraph(str4)) == null) ? null : spanRgbToFont(strDeleteParagraph2);
        String str5 = this.correct;
        if (StringsKt.isBlank(str5)) {
            str5 = null;
        }
        if (str5 != null && (strDeleteParagraph = deleteParagraph(str5)) != null) {
            strSpanRgbToFont = spanRgbToFont(strDeleteParagraph);
        }
        String str6 = strDisplayDateString.length() > 0 ? "<b>" + strDisplayDateString + "</b>" : "";
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (strSpanRgbToFont2 != null) {
            listCreateListBuilder.add(strSpanRgbToFont2);
        }
        if (strSpanRgbToFont3 != null) {
            listCreateListBuilder.add(strSpanRgbToFont3);
        }
        if (strSpanRgbToFont4 != null) {
            listCreateListBuilder.add(strSpanRgbToFont4);
        }
        if (strSpanRgbToFont5 != null) {
            listCreateListBuilder.add("【×】 " + strSpanRgbToFont5);
        }
        if (strSpanRgbToFont != null) {
            listCreateListBuilder.add("【○】 " + strSpanRgbToFont);
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), "\u3000", null, null, 0, null, null, 62, null);
        String str7 = str6;
        if (str7.length() <= 0 || strJoinToString$default.length() <= 0) {
            return str7.length() > 0 ? str6 : strJoinToString$default;
        }
        return str6 + "\u3000" + strJoinToString$default;
    }

    private final String displayDateString() {
        SimpleDateFormat simpleDateFormat;
        String str = this.updatedDate;
        if (str == null) {
            str = this.modifiedDate.length() > 0 ? this.modifiedDate : this.insertedDate;
        }
        Locale locale = Locale.JAPAN;
        if (str.length() == 10) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd", locale);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return "";
            }
            return simpleDateFormat2.format(date);
        } catch (Exception e) {
            Logger logger = Logger.INSTANCE;
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            logger.error(simpleName, e);
            return "";
        }
    }

    private final String spanRgbToFont(String html) {
        return new Regex("</\\s*span\\s*>", RegexOption.IGNORE_CASE).replace(new Regex("<span\\s+[^>]*?style\\s*=\\s*(['\"])[^'\"]*?color\\s*:\\s*hsl\\(\\s*(-?\\d+(?:\\.\\d+)?)\\s*,\\s*(\\d+(?:\\.\\d+)?)%\\s*,\\s*(\\d+(?:\\.\\d+)?)%\\s*\\)[^'\"]*\\1[^>]*>", RegexOption.IGNORE_CASE).replace(new Regex("<span\\s+[^>]*?style\\s*=\\s*(['\"])[^'\"]*?color\\s*:\\s*rgb\\(\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,\\s*(\\d+)\\s*\\)[^'\"]*\\1[^>]*>", RegexOption.IGNORE_CASE).replace(html, new Function1() { // from class: com.medicmedia.medilink.domain.model.VideoErrataItem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoErrataItem.spanRgbToFont$lambda$17((MatchResult) obj);
            }
        }), new Function1() { // from class: com.medicmedia.medilink.domain.model.VideoErrataItem$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoErrataItem.spanRgbToFont$lambda$18(this.f$0, (MatchResult) obj);
            }
        }), "</font>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence spanRgbToFont$lambda$17(MatchResult m) {
        Intrinsics.checkNotNullParameter(m, "m");
        int iCoerceIn = RangesKt.coerceIn(Integer.parseInt(m.getGroupValues().get(2)), 0, 255);
        int iCoerceIn2 = RangesKt.coerceIn(Integer.parseInt(m.getGroupValues().get(3)), 0, 255);
        int iCoerceIn3 = RangesKt.coerceIn(Integer.parseInt(m.getGroupValues().get(4)), 0, 255);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iCoerceIn), Integer.valueOf(iCoerceIn2), Integer.valueOf(iCoerceIn3)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return "<font color=\"" + str + "\">";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence spanRgbToFont$lambda$18(VideoErrataItem videoErrataItem, MatchResult m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Triple<Integer, Integer, Integer> tripleHslToRgb = videoErrataItem.hslToRgb(Double.parseDouble(m.getGroupValues().get(2)), RangesKt.coerceIn(Double.parseDouble(m.getGroupValues().get(3)) / 100.0d, 0.0d, 1.0d), RangesKt.coerceIn(Double.parseDouble(m.getGroupValues().get(4)) / 100.0d, 0.0d, 1.0d));
        int iIntValue = tripleHslToRgb.component1().intValue();
        int iIntValue2 = tripleHslToRgb.component2().intValue();
        int iIntValue3 = tripleHslToRgb.component3().intValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return "<font color=\"" + str + "\">";
    }

    private final String deleteParagraph(String html) {
        return new Regex("</?\\s*p\\b[^>]*>", RegexOption.IGNORE_CASE).replace(html, "");
    }

    private final Triple<Integer, Integer, Integer> hslToRgb(double hDegrees, double s, double l) {
        Triple triple;
        double d = hDegrees % 360.0d;
        Double dValueOf = Double.valueOf(0.0d);
        if (d < 0.0d) {
            d += 360.0d;
        }
        double d2 = 1;
        double d3 = 2;
        double dAbs = (d2 - Math.abs((d3 * l) - d2)) * s;
        double dAbs2 = (d2 - Math.abs(((d / 60.0d) % d3) - d2)) * dAbs;
        double d4 = l - (dAbs / 2.0d);
        if (d < 60.0d) {
            triple = new Triple(Double.valueOf(dAbs), Double.valueOf(dAbs2), dValueOf);
        } else if (d < 120.0d) {
            triple = new Triple(Double.valueOf(dAbs2), Double.valueOf(dAbs), dValueOf);
        } else if (d < 180.0d) {
            triple = new Triple(dValueOf, Double.valueOf(dAbs), Double.valueOf(dAbs2));
        } else if (d < 240.0d) {
            triple = new Triple(dValueOf, Double.valueOf(dAbs2), Double.valueOf(dAbs));
        } else if (d < 300.0d) {
            triple = new Triple(Double.valueOf(dAbs2), dValueOf, Double.valueOf(dAbs));
        } else {
            triple = new Triple(Double.valueOf(dAbs), dValueOf, Double.valueOf(dAbs2));
        }
        return new Triple<>(Integer.valueOf(RangesKt.coerceIn(roundToInt((((Number) triple.component1()).doubleValue() + d4) * 255.0d), 0, 255)), Integer.valueOf(RangesKt.coerceIn(roundToInt((((Number) triple.component2()).doubleValue() + d4) * 255.0d), 0, 255)), Integer.valueOf(RangesKt.coerceIn(roundToInt((((Number) triple.component3()).doubleValue() + d4) * 255.0d), 0, 255)));
    }

    private final int roundToInt(double d) {
        return (int) Math.rint(d);
    }
}
