package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CoreLogLevel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0013"}, d2 = {"Lio/realm/kotlin/internal/interop/CoreLogLevel;", "", "internalPriority", "", "<init>", "(Ljava/lang/String;II)V", "RLM_LOG_LEVEL_ALL", "RLM_LOG_LEVEL_TRACE", "RLM_LOG_LEVEL_DEBUG", "RLM_LOG_LEVEL_DETAIL", "RLM_LOG_LEVEL_INFO", "RLM_LOG_LEVEL_WARNING", "RLM_LOG_LEVEL_ERROR", "RLM_LOG_LEVEL_FATAL", "RLM_LOG_LEVEL_OFF", "priority", "getPriority", "()I", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum CoreLogLevel {
    RLM_LOG_LEVEL_ALL(0),
    RLM_LOG_LEVEL_TRACE(1),
    RLM_LOG_LEVEL_DEBUG(2),
    RLM_LOG_LEVEL_DETAIL(3),
    RLM_LOG_LEVEL_INFO(4),
    RLM_LOG_LEVEL_WARNING(5),
    RLM_LOG_LEVEL_ERROR(6),
    RLM_LOG_LEVEL_FATAL(7),
    RLM_LOG_LEVEL_OFF(8);

    private final int internalPriority;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<CoreLogLevel> getEntries() {
        return $ENTRIES;
    }

    CoreLogLevel(int i) {
        this.internalPriority = i;
    }

    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public final int getInternalPriority() {
        return this.internalPriority;
    }

    /* JADX INFO: compiled from: CoreLogLevel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/CoreLogLevel$Companion;", "", "<init>", "()V", "valueFromPriority", "Lio/realm/kotlin/internal/interop/CoreLogLevel;", "priority", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CoreLogLevel valueFromPriority(short priority) {
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_ALL.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_ALL;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_TRACE.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_TRACE;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_DEBUG.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_DEBUG;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_DETAIL.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_DETAIL;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_INFO.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_INFO;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_WARNING.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_WARNING;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_ERROR.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_ERROR;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_FATAL.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_FATAL;
            }
            if (priority == CoreLogLevel.RLM_LOG_LEVEL_OFF.getInternalPriority()) {
                return CoreLogLevel.RLM_LOG_LEVEL_OFF;
            }
            throw new IllegalArgumentException("Invalid log level: " + ((int) priority));
        }
    }
}
