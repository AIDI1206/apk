package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: ApiLog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000f\u001a\u00020\u00032\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/domain/model/LogDetail;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APP_LAUNCH", "APP_AUTH", "APP_AUTH_ERROR", "APP_API", "APP_CONTENTS", "APP_SETTING", "APP_SETTING_ERROR", "format", "argument", "", "", "([Ljava/lang/Object;)Ljava/lang/String;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum LogDetail {
    APP_LAUNCH(MLConst.MedilinkLogs.APP_LAUNCH),
    APP_AUTH("{\"event\":\"auth\"}"),
    APP_AUTH_ERROR("{\"event\":\"auth\",\"error\":\"%s\",\"error message\":\"%s\"_\"%s\"}"),
    APP_API("{\"event\":\"api\",\"url\":\"%s\"}"),
    APP_CONTENTS(MLConst.MedilinkLogs.APP_CONTENTS),
    APP_SETTING("{\"event\":\"setting\",\"url\":\"%s\"}"),
    APP_SETTING_ERROR("{\"event\":\"setting\",\"url\":\"%s\",\"stacktrace\":\"%s\"}");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final String value;

    public static EnumEntries<LogDetail> getEntries() {
        return $ENTRIES;
    }

    LogDetail(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final String format(Object... argument) {
        Intrinsics.checkNotNullParameter(argument, "argument");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = this.value;
        Object[] objArrCopyOf = Arrays.copyOf(argument, argument.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
