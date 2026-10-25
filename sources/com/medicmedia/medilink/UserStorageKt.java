package com.medicmedia.medilink;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.preferences.di.PreferencesName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: UserStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0002¨\u0006\b"}, d2 = {"getBaristaToken", "Lcom/medicmedia/medilink/BaristaToken;", "Landroid/content/Context;", "saveBaristaToken", "", "baristaToken", "getUser", "Lcom/medicmedia/medilink/User;", "app_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UserStorageKt {
    public static final BaristaToken getBaristaToken(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferencesName.LOGIN, 0);
        String string = sharedPreferences.getString("access_token", null);
        String string2 = sharedPreferences.getString("reflesh_token", null);
        long j = sharedPreferences.getLong("access_token_limit_date", 0L);
        long j2 = sharedPreferences.getLong("reflesh_token_limit_date", 0L);
        if (string == null || !(!StringsKt.isBlank(string)) || string2 == null || !(!StringsKt.isBlank(string2)) || j == 0 || j2 == 0) {
            return null;
        }
        return new BaristaToken(string, string2, j, j2);
    }

    public static final void saveBaristaToken(Context context, BaristaToken baristaToken) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(baristaToken, "baristaToken");
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PreferencesName.LOGIN, 0).edit();
        editorEdit.putString("access_token", baristaToken.getAccessToken());
        editorEdit.putString("reflesh_token", baristaToken.getRefleshToken());
        editorEdit.putLong("access_token_limit_date", baristaToken.getAccessTokenDate());
        editorEdit.putLong("reflesh_token_limit_date", baristaToken.getRefleshTokenDate());
        editorEdit.apply();
    }

    public static final User getUser(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferencesName.LOGIN, 0);
        String string = sharedPreferences.getString("login", null);
        String string2 = sharedPreferences.getString("password", null);
        if (string == null || !(!StringsKt.isBlank(string)) || string2 == null || !(!StringsKt.isBlank(string2))) {
            return null;
        }
        return new User(string, string2);
    }
}
