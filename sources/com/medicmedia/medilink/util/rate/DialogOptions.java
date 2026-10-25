package com.medicmedia.medilink.util.rate;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.medicmedia.medilink.R;
import java.lang.ref.SoftReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DialogOptions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010B\u001a\u00020$J\u000e\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u00020I2\u0006\u0010C\u001a\u00020DJ\u000e\u0010K\u001a\u00020D2\u0006\u0010F\u001a\u00020GJ\u000e\u0010L\u001a\u00020I2\u0006\u0010J\u001a\u00020DJ\u000e\u0010N\u001a\u00020D2\u0006\u0010F\u001a\u00020GJ\u000e\u0010O\u001a\u00020I2\u0006\u0010M\u001a\u00020DJ\u000e\u0010Q\u001a\u00020D2\u0006\u0010F\u001a\u00020GJ\u000e\u0010R\u001a\u00020I2\u0006\u0010P\u001a\u00020DJ\u000e\u0010T\u001a\u00020D2\u0006\u0010F\u001a\u00020GJ\u000e\u0010U\u001a\u00020I2\u0006\u0010S\u001a\u00020DJ\b\u0010Y\u001a\u0004\u0018\u00010XJ\u000e\u0010Z\u001a\u00020I2\u0006\u0010V\u001a\u00020XJ\u0010\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010F\u001a\u00020GJ\u0010\u0010^\u001a\u00020I2\b\u0010[\u001a\u0004\u0018\u00010\\J\u0010\u0010_\u001a\u0004\u0018\u00010\\2\u0006\u0010F\u001a\u00020GJ\n\u0010b\u001a\u0004\u0018\u00010aH\u0007J\u0014\u0010b\u001a\u0004\u0018\u00010a2\b\u0010c\u001a\u0004\u0018\u00010GH\u0007J\u0010\u0010d\u001a\u00020I2\b\u0010`\u001a\u0004\u0018\u00010aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR \u0010\f\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010/\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001a\u00102\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R \u00105\u001a\u0004\u0018\u00010$8GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010;\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R \u0010>\u001a\u00020$X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b?\u0010\u0003\u001a\u0004\b@\u0010&\"\u0004\bA\u0010(R\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010V\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/medicmedia/medilink/util/rate/DialogOptions;", "", "<init>", "()V", "cancelable", "", "getCancelable", "()Z", "setCancelable", "(Z)V", "isRedrawn", "setRedrawn", "isShowIcon", "()Ljava/lang/Boolean;", "setShowIcon", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isShowMessage", "setShowMessage", "shouldShowMessage", "isShowNegativeButton", "setShowNegativeButton", "shouldShowNegativeButton", "isShowNeutralButton", "setShowNeutralButton", "shouldShowNeutralButton", "isShowTitle", "setShowTitle", "shouldShowTitle", "currentRating", "", "getCurrentRating", "()B", "setCurrentRating", "(B)V", "iconResId", "", "getIconResId", "()I", "setIconResId", "(I)V", "messageTextResId", "getMessageTextResId", "setMessageTextResId", "negativeTextResId", "getNegativeTextResId", "setNegativeTextResId", "neutralTextResId", "getNeutralTextResId", "setNeutralTextResId", "positiveTextResId", "getPositiveTextResId", "setPositiveTextResId", "themeResId", "getThemeResId", "()Ljava/lang/Integer;", "setThemeResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "titleTextResId", "getTitleTextResId", "setTitleTextResId", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType$annotations", "getType", "setType", "getDialogType", "messageText", "", "getMessageText", "context", "Landroid/content/Context;", "setMessageText", "", "negativeText", "getNegativeText", "setNegativeText", "neutralText", "getNeutralText", "setNeutralText", "positiveText", "getPositiveText", "setPositiveText", "titleText", "getTitleText", "setTitleText", "buttonListener", "Ljava/lang/ref/SoftReference;", "Lcom/medicmedia/medilink/util/rate/OnClickButtonListener;", "getButtonListener", "setButtonListener", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "setIcon", "getDialogIcon", "view", "Landroid/view/View;", "getView", "dialogContext", "setView", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DialogOptions {
    public static final int $stable = 8;
    private SoftReference<OnClickButtonListener> buttonListener;
    private boolean cancelable;
    private byte currentRating;
    private Drawable icon;
    private int iconResId;
    private boolean isRedrawn;
    private Boolean isShowIcon;
    private String messageText;
    private String negativeText;
    private String neutralText;
    private String positiveText;
    private Integer themeResId;
    private String titleText;
    private View view;
    private boolean isShowMessage = true;
    private boolean isShowNegativeButton = true;
    private boolean isShowNeutralButton = true;
    private boolean isShowTitle = true;
    private int messageTextResId = R.string.rate_dialog_message;
    private int negativeTextResId = R.string.rate_dialog_no;
    private int neutralTextResId = R.string.rate_dialog_cancel;
    private int positiveTextResId = R.string.rate_dialog_ok;
    private int titleTextResId = R.string.rate_dialog_title;
    private int type = 1;

    public static /* synthetic */ void getType$annotations() {
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final void setCancelable(boolean z) {
        this.cancelable = z;
    }

    /* JADX INFO: renamed from: isRedrawn, reason: from getter */
    public final boolean getIsRedrawn() {
        return this.isRedrawn;
    }

    public final void setRedrawn(boolean z) {
        this.isRedrawn = z;
    }

    public final void setShowIcon(Boolean bool) {
        this.isShowIcon = bool;
    }

    public final Boolean isShowIcon() {
        Boolean bool = this.isShowIcon;
        if (bool != null) {
            return bool;
        }
        return Boolean.valueOf(this.type != 1);
    }

    /* JADX INFO: renamed from: isShowMessage, reason: from getter */
    public final boolean getIsShowMessage() {
        return this.isShowMessage;
    }

    public final void setShowMessage(boolean z) {
        this.isShowMessage = z;
    }

    public final boolean shouldShowMessage() {
        return this.isShowMessage;
    }

    /* JADX INFO: renamed from: isShowNegativeButton, reason: from getter */
    public final boolean getIsShowNegativeButton() {
        return this.isShowNegativeButton;
    }

    public final void setShowNegativeButton(boolean z) {
        this.isShowNegativeButton = z;
    }

    public final boolean shouldShowNegativeButton() {
        return this.isShowNegativeButton;
    }

    /* JADX INFO: renamed from: isShowNeutralButton, reason: from getter */
    public final boolean getIsShowNeutralButton() {
        return this.isShowNeutralButton;
    }

    public final void setShowNeutralButton(boolean z) {
        this.isShowNeutralButton = z;
    }

    public final boolean shouldShowNeutralButton() {
        return this.isShowNeutralButton;
    }

    /* JADX INFO: renamed from: isShowTitle, reason: from getter */
    public final boolean getIsShowTitle() {
        return this.isShowTitle;
    }

    public final void setShowTitle(boolean z) {
        this.isShowTitle = z;
    }

    public final boolean shouldShowTitle() {
        return this.isShowTitle;
    }

    public final byte getCurrentRating() {
        return this.currentRating;
    }

    public final void setCurrentRating(byte b) {
        this.currentRating = b;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final void setIconResId(int i) {
        this.iconResId = i;
    }

    public final int getMessageTextResId() {
        return this.messageTextResId;
    }

    public final void setMessageTextResId(int i) {
        this.messageTextResId = i;
    }

    public final int getNegativeTextResId() {
        return this.negativeTextResId;
    }

    public final void setNegativeTextResId(int i) {
        this.negativeTextResId = i;
    }

    public final int getNeutralTextResId() {
        return this.neutralTextResId;
    }

    public final void setNeutralTextResId(int i) {
        this.neutralTextResId = i;
    }

    public final int getPositiveTextResId() {
        return this.positiveTextResId;
    }

    public final void setPositiveTextResId(int i) {
        this.positiveTextResId = i;
    }

    public final void setThemeResId(Integer num) {
        this.themeResId = num;
    }

    public final Integer getThemeResId() {
        Integer num = this.themeResId;
        if (num != null) {
            return num;
        }
        if (this.type != 1) {
            return Integer.valueOf(R.style.RateDialogTransparentTheme);
        }
        return 0;
    }

    public final int getTitleTextResId() {
        return this.titleTextResId;
    }

    public final void setTitleTextResId(int i) {
        this.titleTextResId = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: getDialogType, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final String getMessageText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.messageText;
        if (str != null) {
            return str == null ? "" : str;
        }
        String string = context.getString(this.messageTextResId);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void setMessageText(String messageText) {
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        this.messageText = messageText;
    }

    public final String getNegativeText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.negativeText;
        if (str != null) {
            return str == null ? "" : str;
        }
        String string = context.getString(this.negativeTextResId);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void setNegativeText(String negativeText) {
        Intrinsics.checkNotNullParameter(negativeText, "negativeText");
        this.negativeText = negativeText;
    }

    public final String getNeutralText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.neutralText;
        if (str != null) {
            return str == null ? "" : str;
        }
        String string = context.getString(this.neutralTextResId);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void setNeutralText(String neutralText) {
        Intrinsics.checkNotNullParameter(neutralText, "neutralText");
        this.neutralText = neutralText;
    }

    public final String getPositiveText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.positiveText;
        if (str != null) {
            return str == null ? "" : str;
        }
        String string = context.getString(this.positiveTextResId);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void setPositiveText(String positiveText) {
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        this.positiveText = positiveText;
    }

    public final String getTitleText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.titleText;
        if (str != null) {
            return str == null ? "" : str;
        }
        String string = context.getString(this.titleTextResId);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void setTitleText(String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        this.titleText = titleText;
    }

    public final OnClickButtonListener getButtonListener() {
        SoftReference<OnClickButtonListener> softReference = this.buttonListener;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public final void setButtonListener(OnClickButtonListener buttonListener) {
        Intrinsics.checkNotNullParameter(buttonListener, "buttonListener");
        this.buttonListener = new SoftReference<>(buttonListener);
    }

    public final Drawable getIcon(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.iconResId != 0) {
            try {
                return context.getDrawable(this.iconResId);
            } catch (Resources.NotFoundException unused) {
                Log.i(Constants.Utils.TAG, "Dialog icon with the given ResId doesn't exist.");
                Drawable drawable = this.icon;
                return drawable != null ? drawable : AppInformation.getIcon(context);
            }
        }
        Drawable drawable2 = this.icon;
        return drawable2 != null ? drawable2 : AppInformation.getIcon(context);
    }

    public final void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public final Drawable getDialogIcon(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getIcon(context);
    }

    @Deprecated(message = "Since 1.2.5 use DialogOptions.getView(Context) instead.")
    public final View getView() {
        if (this.type != 1) {
            Log.w(Constants.Utils.TAG, "For other than DialogType.CLASSIC dialog types call the DialogOptions.getView(Context) instead of the DialogOptions.getView().");
        }
        return getView(null);
    }

    public final View getView(Context dialogContext) {
        View view = this.view;
        if (view != null || this.type == 1) {
            return view;
        }
        View viewInflate = null;
        if (dialogContext != null) {
            try {
                viewInflate = LayoutInflater.from(dialogContext).inflate(R.layout.rate_dialog, (ViewGroup) null);
                Unit unit = Unit.INSTANCE;
                return viewInflate;
            } catch (AssertionError unused) {
                Integer.valueOf(Log.i(Constants.Utils.TAG, "Can't inflate the R.layout.rate_dialog, layoutInflater not found, DialogType.CLASSIC dialog will be used."));
                return viewInflate;
            }
        }
        Log.w(Constants.Utils.TAG, "Can't inflate the R.layout.rate_dialog, dialogContext == null, DialogType.CLASSIC dialog will be used.");
        return null;
    }

    public final void setView(View view) {
        this.view = view;
    }
}
