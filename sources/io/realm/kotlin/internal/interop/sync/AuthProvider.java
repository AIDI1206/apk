package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.NativeEnumerated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AuthProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/AuthProvider;", "Lio/realm/kotlin/internal/interop/NativeEnumerated;", "", "nativeValue", "", "<init>", "(Ljava/lang/String;II)V", "getNativeValue", "()I", "RLM_AUTH_PROVIDER_ANONYMOUS", "RLM_AUTH_PROVIDER_ANONYMOUS_NO_REUSE", "RLM_AUTH_PROVIDER_FACEBOOK", "RLM_AUTH_PROVIDER_GOOGLE", "RLM_AUTH_PROVIDER_APPLE", "RLM_AUTH_PROVIDER_CUSTOM", "RLM_AUTH_PROVIDER_EMAIL_PASSWORD", "RLM_AUTH_PROVIDER_FUNCTION", "RLM_AUTH_PROVIDER_API_KEY", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum AuthProvider implements NativeEnumerated {
    RLM_AUTH_PROVIDER_ANONYMOUS(0),
    RLM_AUTH_PROVIDER_ANONYMOUS_NO_REUSE(1),
    RLM_AUTH_PROVIDER_FACEBOOK(2),
    RLM_AUTH_PROVIDER_GOOGLE(3),
    RLM_AUTH_PROVIDER_APPLE(4),
    RLM_AUTH_PROVIDER_CUSTOM(5),
    RLM_AUTH_PROVIDER_EMAIL_PASSWORD(6),
    RLM_AUTH_PROVIDER_FUNCTION(7),
    RLM_AUTH_PROVIDER_API_KEY(8);

    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<AuthProvider> getEntries() {
        return $ENTRIES;
    }

    AuthProvider(int i) {
        this.nativeValue = i;
    }

    @Override // io.realm.kotlin.internal.interop.NativeEnumerated
    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX INFO: compiled from: AuthProvider.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/AuthProvider$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/sync/AuthProvider;", "id", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AuthProvider of(int id) {
            for (AuthProvider authProvider : AuthProvider.values()) {
                if (authProvider.getNativeValue() == id) {
                    return authProvider;
                }
            }
            throw new IllegalStateException(("Unknown authentication provider " + id).toString());
        }
    }
}
