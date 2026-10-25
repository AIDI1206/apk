package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CoreLogLevel;
import io.realm.kotlin.log.LogCategory;
import io.realm.kotlin.log.LogCategoryImpl;
import io.realm.kotlin.log.LogLevel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: LogUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u001c\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0000\" \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"toCoreLogLevel", "Lio/realm/kotlin/internal/interop/CoreLogLevel;", "Lio/realm/kotlin/log/LogLevel;", "fromCoreLogLevel", "newCategory", "Lio/realm/kotlin/log/LogCategory;", "name", "", "parent", "categoriesByPath", "", "getCategoriesByPath", "()Ljava/util/Map;", "messageWithCategory", "category", "message", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogUtilsKt {
    private static final Map<String, LogCategory> categoriesByPath = new LinkedHashMap();

    /* JADX INFO: compiled from: LogUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.TRACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.WARN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LogLevel.WTF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LogLevel.NONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CoreLogLevel.values().length];
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_TRACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_DETAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_WARNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_FATAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CoreLogLevel.RLM_LOG_LEVEL_OFF.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CoreLogLevel toCoreLogLevel(LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()]) {
            case 1:
                return CoreLogLevel.RLM_LOG_LEVEL_ALL;
            case 2:
                return CoreLogLevel.RLM_LOG_LEVEL_TRACE;
            case 3:
                return CoreLogLevel.RLM_LOG_LEVEL_DEBUG;
            case 4:
                return CoreLogLevel.RLM_LOG_LEVEL_INFO;
            case 5:
                return CoreLogLevel.RLM_LOG_LEVEL_WARNING;
            case 6:
                return CoreLogLevel.RLM_LOG_LEVEL_ERROR;
            case 7:
                return CoreLogLevel.RLM_LOG_LEVEL_FATAL;
            case 8:
                return CoreLogLevel.RLM_LOG_LEVEL_OFF;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final LogLevel fromCoreLogLevel(CoreLogLevel coreLogLevel) {
        Intrinsics.checkNotNullParameter(coreLogLevel, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[coreLogLevel.ordinal()]) {
            case 1:
                return LogLevel.ALL;
            case 2:
                return LogLevel.TRACE;
            case 3:
            case 4:
                return LogLevel.DEBUG;
            case 5:
                return LogLevel.INFO;
            case 6:
                return LogLevel.WARN;
            case 7:
                return LogLevel.ERROR;
            case 8:
                return LogLevel.WTF;
            case 9:
                return LogLevel.NONE;
            default:
                throw new IllegalArgumentException("Invalid core log level: " + coreLogLevel);
        }
    }

    public static /* synthetic */ LogCategory newCategory$default(String str, LogCategory logCategory, int i, Object obj) {
        if ((i & 2) != 0) {
            logCategory = null;
        }
        return newCategory(str, logCategory);
    }

    public static final LogCategory newCategory(String name, LogCategory logCategory) {
        Intrinsics.checkNotNullParameter(name, "name");
        LogCategoryImpl logCategoryImpl = new LogCategoryImpl(name, logCategory);
        categoriesByPath.put(String.valueOf(logCategoryImpl), logCategoryImpl);
        return logCategoryImpl;
    }

    public static final Map<String, LogCategory> getCategoriesByPath() {
        return categoriesByPath;
    }

    public static final String messageWithCategory(LogCategory category, String str) {
        Intrinsics.checkNotNullParameter(category, "category");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return null;
        }
        return "[" + category.getName() + "] " + str;
    }
}
