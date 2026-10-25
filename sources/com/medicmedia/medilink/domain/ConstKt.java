package com.medicmedia.medilink.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Const.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\"\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"appInnerDomain", "", "qbOnlineShareSet", "bookVideoLinkUrl", "BOOKMARK_ID", "contentsDir", "dateFormatFull", "Ljava/text/SimpleDateFormat;", "getDateFormatFull", "()Ljava/text/SimpleDateFormat;", "dateFormatLocal", "getDateFormatLocal", "dateFormatCard", "getDateFormatCard", "dateFormatSlashYYYYMMDD", "getDateFormatSlashYYYYMMDD", "dateFormatYYYYMMDDJP", "getDateFormatYYYYMMDDJP", "dateFormatYYYYMM", "getDateFormatYYYYMM", "dateFormatYYYYMMDD", "getDateFormatYYYYMMDD", "dateFormatHHMM", "getDateFormatHHMM", "dataFormatMMSS", "getDataFormatMMSS", "movieLicenseMaxDate", "tagPrefix", "", "getTagPrefix", "()Ljava/util/List;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ConstKt {
    public static final String BOOKMARK_ID = "bm";
    public static final String appInnerDomain = "medilink-study.com/medilink_app/";
    public static final String bookVideoLinkUrl = "https://lec.medilink-study.com/front/open";
    public static final String contentsDir = "contents_files";
    public static final String movieLicenseMaxDate = "2200/01/01";
    public static final String qbOnlineShareSet = "https://qb.medilink-study.com/RegisterQuestionSet/";
    private static final SimpleDateFormat dateFormatFull = new SimpleDateFormat(DateFormatType.FULL, Locale.JAPAN);
    private static final SimpleDateFormat dateFormatLocal = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.JAPAN);
    private static final SimpleDateFormat dateFormatCard = new SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.JAPAN);
    private static final SimpleDateFormat dateFormatSlashYYYYMMDD = new SimpleDateFormat("yyyy/MM/dd", Locale.JAPAN);
    private static final SimpleDateFormat dateFormatYYYYMMDDJP = new SimpleDateFormat("yyyy年MM月dd日", Locale.JAPAN);
    private static final SimpleDateFormat dateFormatYYYYMM = new SimpleDateFormat(DateFormatType.YYYYMM, Locale.JAPAN);
    private static final SimpleDateFormat dateFormatYYYYMMDD = new SimpleDateFormat(DateFormatType.YYYYMMDD, Locale.JAPAN);
    private static final SimpleDateFormat dateFormatHHMM = new SimpleDateFormat(DateFormatType.HHMM, Locale.JAPAN);
    private static final SimpleDateFormat dataFormatMMSS = new SimpleDateFormat(DateFormatType.MMSS, Locale.US);
    private static final List<String> tagPrefix = CollectionsKt.listOf((Object[]) new String[]{".*lec.medilink.*", ".*lecref.*", ".*qrref.*", ".*qbref.*", "R1.", "R2.", "A0.", "R5.", "Y0[0-9]", "Y0[A-Za-z]", "B[0-9A-Za-z].", "K[0-9A-Za-z].", "P[0-9A-Za-z].", "T0.", "R3.", "K2", "K3"});

    public static final SimpleDateFormat getDateFormatFull() {
        return dateFormatFull;
    }

    public static final SimpleDateFormat getDateFormatLocal() {
        return dateFormatLocal;
    }

    public static final SimpleDateFormat getDateFormatCard() {
        return dateFormatCard;
    }

    public static final SimpleDateFormat getDateFormatSlashYYYYMMDD() {
        return dateFormatSlashYYYYMMDD;
    }

    public static final SimpleDateFormat getDateFormatYYYYMMDDJP() {
        return dateFormatYYYYMMDDJP;
    }

    public static final SimpleDateFormat getDateFormatYYYYMM() {
        return dateFormatYYYYMM;
    }

    public static final SimpleDateFormat getDateFormatYYYYMMDD() {
        return dateFormatYYYYMMDD;
    }

    public static final SimpleDateFormat getDateFormatHHMM() {
        return dateFormatHHMM;
    }

    public static final SimpleDateFormat getDataFormatMMSS() {
        return dataFormatMMSS;
    }

    public static final List<String> getTagPrefix() {
        return tagPrefix;
    }
}
