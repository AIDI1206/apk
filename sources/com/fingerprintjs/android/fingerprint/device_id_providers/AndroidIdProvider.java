package com.fingerprintjs.android.fingerprint.device_id_providers;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidIdProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getAndroidId", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AndroidIdProvider {
    private final ContentResolver contentResolver;

    public AndroidIdProvider(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    public final String getAndroidId() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.device_id_providers.AndroidIdProvider.getAndroidId.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                ContentResolver contentResolver = AndroidIdProvider.this.contentResolver;
                Intrinsics.checkNotNull(contentResolver);
                String string = Settings.Secure.getString(contentResolver, "android_id");
                Intrinsics.checkNotNull(string);
                return string;
            }
        }, 1, null);
        if (Result.m11505isFailureimpl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }
}
