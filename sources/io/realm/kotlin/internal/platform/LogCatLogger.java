package io.realm.kotlin.internal.platform;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.realm.kotlin.internal.LogUtilsKt;
import io.realm.kotlin.log.LogCategory;
import io.realm.kotlin.log.LogLevel;
import io.realm.kotlin.log.RealmLogger;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: LogCatLogger.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010\"\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J9\u0010\u0017\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010\"\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010\"\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lio/realm/kotlin/internal/platform/LogCatLogger;", "Lio/realm/kotlin/log/RealmLogger;", "tag", "", "<init>", "(Ljava/lang/String;)V", "log", "", "category", "Lio/realm/kotlin/log/LogCategory;", FirebaseAnalytics.Param.LEVEL, "Lio/realm/kotlin/log/LogLevel;", "throwable", "", "message", "args", "", "", "(Lio/realm/kotlin/log/LogCategory;Lio/realm/kotlin/log/LogLevel;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "printMessage", "priority", "", "logMessage", "prepareLogMessage", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getStackTraceString", "t", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogCatLogger implements RealmLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int INITIAL_BUFFER_SIZE = 256;
    private static final int MAX_LOG_LENGTH = 4000;
    private static final int MAX_TAG_LENGTH = 23;
    private final String tag;

    public LogCatLogger(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    @Override // io.realm.kotlin.log.RealmLogger
    public void log(LogCategory category, LogLevel level, Throwable throwable, String message, Object... args) {
        int iMin;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(args, "args");
        int priority = level.getPriority();
        String strPrepareLogMessage = prepareLogMessage(throwable, LogUtilsKt.messageWithCategory(category, message), Arrays.copyOf(args, args.length));
        if (strPrepareLogMessage.length() < 4000) {
            printMessage(priority, strPrepareLogMessage);
            return;
        }
        int length = strPrepareLogMessage.length();
        int i = 0;
        while (i < length) {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strPrepareLogMessage, '\n', i, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf$default, i + 4000);
                String strSubstring = strPrepareLogMessage.substring(i, iMin);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                printMessage(priority, strSubstring);
                if (iMin >= iIndexOf$default) {
                    break;
                } else {
                    i = iMin;
                }
            }
            i = iMin + 1;
        }
    }

    private final void printMessage(int priority, String logMessage) {
        if (priority <= LogLevel.TRACE.getPriority()) {
            Log.v(this.tag, logMessage);
            return;
        }
        if (priority == LogLevel.DEBUG.getPriority()) {
            Log.d(this.tag, logMessage);
        } else if (priority == LogLevel.WTF.getPriority()) {
            Log.wtf(this.tag, logMessage);
        } else {
            Log.println(priority, this.tag, logMessage);
        }
    }

    private final String prepareLogMessage(Throwable throwable, String message, Object... args) {
        String str = message;
        if (str == null || str.length() == 0) {
            if (throwable == null) {
                return "";
            }
            return getStackTraceString(throwable);
        }
        if (!(args.length == 0)) {
            message = formatMessage(message, Arrays.copyOf(args, args.length));
        }
        return throwable != null ? message + '\n' + getStackTraceString(throwable) : message;
    }

    private final String formatMessage(String message, Object... args) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getStackTraceString(Throwable t) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        t.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: compiled from: LogCatLogger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/platform/LogCatLogger$Companion;", "", "<init>", "()V", "MAX_TAG_LENGTH", "", "getMAX_TAG_LENGTH$annotations", "MAX_LOG_LENGTH", "INITIAL_BUFFER_SIZE", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getMAX_TAG_LENGTH$annotations() {
        }

        private Companion() {
        }
    }
}
