package com.medicmedia.medilink.util.rate;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;

/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/util/rate/Constants;", "", "<init>", "()V", HttpHeaders.DATE, "Utils", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Constants {
    public static final int $stable = 0;
    public static final Constants INSTANCE = new Constants();

    private Constants() {
    }

    /* JADX INFO: compiled from: Constants.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/util/rate/Constants$Date;", "", "<init>", "()V", "YEAR_IN_DAYS", "", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Date {
        public static final int $stable = 0;
        public static final Date INSTANCE = new Date();
        public static final short YEAR_IN_DAYS = 365;

        private Date() {
        }
    }

    /* JADX INFO: compiled from: Constants.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00078\u0000X\u0081\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/util/rate/Constants$Utils;", "", "<init>", "()V", "EMPTY_STRING", "", "EMPTY_STRING_ARRAY", "", "[Ljava/lang/String;", "LOG_MESSAGE_PART_1", "TAG", "UTILITY_CLASS_MESSAGE", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Utils {
        public static final String EMPTY_STRING = "";
        public static final String LOG_MESSAGE_PART_1 = "Failed to rate app, ";
        public static final String TAG = "ANDROIDRATE";
        public static final String UTILITY_CLASS_MESSAGE = " is a utility class and it can't be instantiated!";
        public static final Utils INSTANCE = new Utils();
        public static final String[] EMPTY_STRING_ARRAY = new String[0];
        public static final int $stable = 8;

        private Utils() {
        }
    }
}
