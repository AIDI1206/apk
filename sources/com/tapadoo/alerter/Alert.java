package com.tapadoo.alerter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.tapadoo.alerter.utils.ExAlertKt;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Alert.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 ³\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002³\u0001B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ \u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\b\b\u0001\u0010^\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u0002J\b\u0010`\u001a\u00020+H\u0016J\u0006\u0010a\u001a\u00020[J\u000e\u0010*\u001a\u00020[2\u0006\u0010b\u001a\u00020+J\u0006\u0010c\u001a\u00020[J\u0006\u0010d\u001a\u00020eJ\u0006\u0010f\u001a\u00020eJ\b\u0010g\u001a\u00020[H\u0002J\u0006\u00109\u001a\u00020+J\u0010\u0010h\u001a\u00020[2\u0006\u0010i\u001a\u000201H\u0016J\u0010\u0010j\u001a\u00020[2\u0006\u0010i\u001a\u000201H\u0016J\u0010\u0010k\u001a\u00020[2\u0006\u0010i\u001a\u000201H\u0016J\b\u0010l\u001a\u00020[H\u0014J\u0010\u0010_\u001a\u00020[2\u0006\u0010m\u001a\u00020;H\u0016J\b\u0010n\u001a\u00020[H\u0014J\u0010\u0010o\u001a\u00020[2\u0006\u0010p\u001a\u00020;H\u0016J\u0018\u0010q\u001a\u00020[2\u0006\u0010r\u001a\u00020\b2\u0006\u0010s\u001a\u00020\bH\u0014J\u0018\u0010t\u001a\u00020[2\u0006\u0010p\u001a\u00020;2\u0006\u0010u\u001a\u00020+H\u0016J\u0010\u0010v\u001a\u00020+2\u0006\u0010w\u001a\u00020xH\u0017J\u000e\u0010y\u001a\u00020[2\u0006\u0010z\u001a\u00020+J\u000e\u0010{\u001a\u00020[2\u0006\u0010z\u001a\u00020+J\r\u0010|\u001a\u00020[H\u0000¢\u0006\u0002\b}J\u0010\u0010~\u001a\u00020[2\b\b\u0001\u0010\u007f\u001a\u00020\bJ\u0011\u0010\u0080\u0001\u001a\u00020[2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020[2\t\b\u0001\u0010\u0084\u0001\u001a\u00020\bJ\u0013\u0010\u0085\u0001\u001a\u00020[2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0007J\u0010\u0010\u0088\u0001\u001a\u00020[2\u0007\u0010\u0089\u0001\u001a\u00020+J\u000f\u0010\u008a\u0001\u001a\u00020[2\u0006\u0010-\u001a\u00020+J\u000f\u0010\u008b\u0001\u001a\u00020[2\u0006\u0010.\u001a\u00020+J\u0011\u0010\u008c\u0001\u001a\u00020[2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J\u0011\u0010\u008c\u0001\u001a\u00020[2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0012\u0010\u008c\u0001\u001a\u00020[2\t\b\u0001\u0010\u008f\u0001\u001a\u00020\bJ\u0011\u0010\u0090\u0001\u001a\u00020[2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001J\u0011\u0010\u0090\u0001\u001a\u00020[2\b\b\u0001\u0010\u007f\u001a\u00020\bJ\u001b\u0010\u0090\u0001\u001a\u00020[2\b\b\u0001\u0010\u007f\u001a\u00020\b2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0012\u0010\u0095\u0001\u001a\u00020[2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\bJ\u0012\u0010\u0097\u0001\u001a\u00020[2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\bJ\u0014\u0010\u0098\u0001\u001a\u00020[2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u009a\u0001\u001a\u00020[2\u0007\u0010\u0099\u0001\u001a\u00020NJ\u0011\u0010\u009b\u0001\u001a\u00020[2\b\b\u0001\u0010\u007f\u001a\u00020\bJ\u0011\u0010\u009c\u0001\u001a\u00020[2\b\b\u0001\u0010\u007f\u001a\u00020\bJ\u0011\u0010\u009d\u0001\u001a\u00020[2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J\u0011\u0010\u009d\u0001\u001a\u00020[2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0012\u0010\u009d\u0001\u001a\u00020[2\t\b\u0001\u0010\u008f\u0001\u001a\u00020\bJ\u0011\u0010\u009e\u0001\u001a\u00020[2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001J\u0011\u0010\u009e\u0001\u001a\u00020[2\b\b\u0001\u0010\u007f\u001a\u00020\bJ\u001b\u0010\u009e\u0001\u001a\u00020[2\b\b\u0001\u0010\u007f\u001a\u00020\b2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0012\u0010\u009f\u0001\u001a\u00020[2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\bJ\u0010\u0010 \u0001\u001a\u00020[2\u0007\u0010¡\u0001\u001a\u00020\bJ\u0012\u0010¢\u0001\u001a\u00020[2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\bJ\u0011\u0010£\u0001\u001a\u00020[2\b\u0010U\u001a\u0004\u0018\u00010VJ\u000f\u0010¤\u0001\u001a\u00020[2\u0006\u0010\\\u001a\u00020]J\u0012\u0010¤\u0001\u001a\u00020[2\t\b\u0001\u0010¥\u0001\u001a\u00020\bJ\u0012\u0010¦\u0001\u001a\u00020[2\t\b\u0001\u0010§\u0001\u001a\u00020\bJ\u0010\u0010¨\u0001\u001a\u00020[2\u0007\u0010©\u0001\u001a\u00020\u000eJ\u0010\u0010ª\u0001\u001a\u00020[2\u0007\u0010«\u0001\u001a\u00020]J\u0012\u0010ª\u0001\u001a\u00020[2\t\b\u0001\u0010¬\u0001\u001a\u00020\bJ\u0012\u0010\u00ad\u0001\u001a\u00020[2\t\b\u0001\u0010§\u0001\u001a\u00020\bJ\u0010\u0010®\u0001\u001a\u00020[2\u0007\u0010©\u0001\u001a\u00020\u000eJ\u000f\u0010¯\u0001\u001a\u00020[2\u0006\u0010Y\u001a\u00020+J\u0012\u0010°\u0001\u001a\u00020[2\u0007\u0010±\u0001\u001a\u00020\bH\u0016J\u000e\u0010S\u001a\u00020[2\u0006\u0010S\u001a\u00020+J\u000e\u0010T\u001a\u00020[2\u0006\u0010T\u001a\u00020+J\t\u0010²\u0001\u001a\u00020[H\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u001a\u0010$\u001a\u00020%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000201X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000201X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u000e\u00109\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010:\u001a\u0004\u0018\u00010;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010!\u001a\u0004\b<\u0010=R$\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u0010\u001bR\u000e\u0010C\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010D\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010!\u001a\u0004\bE\u0010\u0019R\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0019R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0019R\u000e\u0010Y\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006´\u0001"}, d2 = {"Lcom/tapadoo/alerter/Alert;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/animation/Animation$AnimationListener;", "Lcom/tapadoo/alerter/SwipeDismissTouchListener$DismissCallbacks;", "context", "Landroid/content/Context;", "layoutId", "", "attrs", "Landroid/util/AttributeSet;", "defStyle", "(Landroid/content/Context;ILandroid/util/AttributeSet;I)V", "buttonTypeFace", "Landroid/graphics/Typeface;", "getButtonTypeFace", "()Landroid/graphics/Typeface;", "setButtonTypeFace", "(Landroid/graphics/Typeface;)V", "buttons", "Ljava/util/ArrayList;", "Landroid/widget/Button;", "Lkotlin/collections/ArrayList;", "contentGravity", "getContentGravity", "()I", "setContentGravity", "(I)V", "currentDisplay", "Landroid/view/Display;", "getCurrentDisplay", "()Landroid/view/Display;", "currentDisplay$delegate", "Lkotlin/Lazy;", "cutoutsHeight", "getCutoutsHeight", TypedValues.TransitionType.S_DURATION, "", "getDuration$alerter_release", "()J", "setDuration$alerter_release", "(J)V", "enableClickAnimation", "", "enableIconPulse", "enableInfiniteDuration", "enableProgress", "enableRightIconPurse", "enterAnimation", "Landroid/view/animation/Animation;", "getEnterAnimation$alerter_release", "()Landroid/view/animation/Animation;", "setEnterAnimation$alerter_release", "(Landroid/view/animation/Animation;)V", "exitAnimation", "getExitAnimation$alerter_release", "setExitAnimation$alerter_release", "isDismissible", "layoutContainer", "Landroid/view/View;", "getLayoutContainer", "()Landroid/view/View;", "layoutContainer$delegate", "value", "layoutGravity", "getLayoutGravity", "setLayoutGravity", "marginSet", "navigationBarHeight", "getNavigationBarHeight", "navigationBarHeight$delegate", "onHideListener", "Lcom/tapadoo/alerter/OnHideAlertListener;", "getOnHideListener$alerter_release", "()Lcom/tapadoo/alerter/OnHideAlertListener;", "setOnHideListener$alerter_release", "(Lcom/tapadoo/alerter/OnHideAlertListener;)V", "onShowListener", "Lcom/tapadoo/alerter/OnShowAlertListener;", "physicalScreenHeight", "getPhysicalScreenHeight", "runningAnimation", "Ljava/lang/Runnable;", "showIcon", "showRightIcon", "soundUri", "Landroid/net/Uri;", "usableScreenHeight", "getUsableScreenHeight", "vibrationEnabled", "addButton", "", "text", "", TtmlNode.TAG_STYLE, "onClick", "canDismiss", "disableOutsideTouch", "enabled", "enableSwipeToDismiss", "getText", "Landroid/widget/TextView;", "getTitle", "hide", "onAnimationEnd", "animation", "onAnimationRepeat", "onAnimationStart", "onAttachedToWindow", "v", "onDetachedFromWindow", "onDismiss", "view", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouch", "touch", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "pulseIcon", "shouldPulse", "pulseRightIcon", "removeFromParent", "removeFromParent$alerter_release", "setAlertBackgroundColor", "color", "setAlertBackgroundDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setAlertBackgroundResource", "resource", "setBackgroundElevation", "elevation", "", "setDismissible", "dismissible", "setEnableInfiniteDuration", "setEnableProgress", "setIcon", "bitmap", "Landroid/graphics/Bitmap;", "iconId", "setIconColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "mode", "Landroid/graphics/PorterDuff$Mode;", "setIconPixelSize", "size", "setIconSize", "setOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnShowListener", "setProgressColorInt", "setProgressColorRes", "setRightIcon", "setRightIconColorFilter", "setRightIconPixelSize", "setRightIconPosition", "position", "setRightIconSize", "setSound", "setText", "textId", "setTextAppearance", "textAppearance", "setTextTypeface", "typeface", "setTitle", HistoryRepositoryImpl.FieldName.TITLE, "titleId", "setTitleAppearance", "setTitleTypeface", "setVibrationEnabled", "setVisibility", "visibility", "startHideAnimation", "Companion", "alerter_release"}, k = 1, mv = {1, 4, 1})
public final class Alert extends FrameLayout implements View.OnClickListener, Animation.AnimationListener, SwipeDismissTouchListener.DismissCallbacks {
    private static final int CLEAN_UP_DELAY_MILLIS = 100;
    private static final long DISPLAY_TIME_IN_SECONDS = 3000;
    private static final int MUL = -16777216;
    private HashMap _$_findViewCache;
    private Typeface buttonTypeFace;
    private ArrayList<Button> buttons;

    /* JADX INFO: renamed from: currentDisplay$delegate, reason: from kotlin metadata */
    private final Lazy currentDisplay;
    private long duration;
    private boolean enableClickAnimation;
    private boolean enableIconPulse;
    private boolean enableInfiniteDuration;
    private boolean enableProgress;
    private boolean enableRightIconPurse;
    private Animation enterAnimation;
    private Animation exitAnimation;
    private boolean isDismissible;

    /* JADX INFO: renamed from: layoutContainer$delegate, reason: from kotlin metadata */
    private final Lazy layoutContainer;
    private int layoutGravity;
    private boolean marginSet;

    /* JADX INFO: renamed from: navigationBarHeight$delegate, reason: from kotlin metadata */
    private final Lazy navigationBarHeight;
    private OnHideAlertListener onHideListener;
    private OnShowAlertListener onShowListener;
    private Runnable runningAnimation;
    private boolean showIcon;
    private boolean showRightIcon;
    private Uri soundUri;
    private boolean vibrationEnabled;

    public Alert(Context context, int i) {
        this(context, i, null, 0, 12, null);
    }

    public Alert(Context context, int i, AttributeSet attributeSet) {
        this(context, i, attributeSet, 0, 8, null);
    }

    private final Display getCurrentDisplay() {
        return (Display) this.currentDisplay.getValue();
    }

    private final int getNavigationBarHeight() {
        return ((Number) this.navigationBarHeight.getValue()).intValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final View getLayoutContainer() {
        return (View) this.layoutContainer.getValue();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Alert(Context context, int i, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 4) != 0) {
            attributeSet = null;
        }
        this(context, i, attributeSet, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Alert(final Context context, int i, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.alerter_slide_in_from_top);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "AnimationUtils.loadAnima…lerter_slide_in_from_top)");
        this.enterAnimation = animationLoadAnimation;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.alerter_slide_out_to_top);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation2, "AnimationUtils.loadAnima…alerter_slide_out_to_top)");
        this.exitAnimation = animationLoadAnimation2;
        this.duration = 3000L;
        this.showIcon = true;
        this.enableIconPulse = true;
        this.enableClickAnimation = true;
        this.enableRightIconPurse = true;
        this.isDismissible = true;
        this.buttons = new ArrayList<>();
        this.vibrationEnabled = true;
        this.layoutGravity = 48;
        this.layoutContainer = LazyKt.lazy(new Function0<View>() { // from class: com.tapadoo.alerter.Alert$layoutContainer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return this.this$0.findViewById(R.id.vAlertContentContainer);
            }
        });
        this.currentDisplay = LazyKt.lazy(new Function0<Display>() { // from class: com.tapadoo.alerter.Alert$currentDisplay$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Display invoke() {
                if (Build.VERSION.SDK_INT >= 30) {
                    return context.getDisplay();
                }
                Object systemService = context.getApplicationContext().getSystemService("window");
                if (systemService != null) {
                    return ((WindowManager) systemService).getDefaultDisplay();
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
        });
        this.navigationBarHeight = LazyKt.lazy(new Function0<Integer>() { // from class: com.tapadoo.alerter.Alert$navigationBarHeight$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return (this.this$0.getPhysicalScreenHeight() - this.this$0.getUsableScreenHeight()) - this.this$0.getCutoutsHeight();
            }
        });
        FrameLayout.inflate(context, R.layout.alerter_alert_view, this);
        ViewStub vAlertContentContainer = (ViewStub) findViewById(R.id.vAlertContentContainer);
        Intrinsics.checkNotNullExpressionValue(vAlertContentContainer, "vAlertContentContainer");
        vAlertContentContainer.setLayoutResource(i);
        ((ViewStub) findViewById(R.id.vAlertContentContainer)).inflate();
        setHapticFeedbackEnabled(true);
        ViewCompat.setTranslationZ(this, Integer.MAX_VALUE);
        ((LinearLayout) _$_findCachedViewById(R.id.llAlertBackground)).setOnClickListener(this);
    }

    /* JADX INFO: renamed from: getOnHideListener$alerter_release, reason: from getter */
    public final OnHideAlertListener getOnHideListener() {
        return this.onHideListener;
    }

    public final void setOnHideListener$alerter_release(OnHideAlertListener onHideAlertListener) {
        this.onHideListener = onHideAlertListener;
    }

    /* JADX INFO: renamed from: getEnterAnimation$alerter_release, reason: from getter */
    public final Animation getEnterAnimation() {
        return this.enterAnimation;
    }

    public final void setEnterAnimation$alerter_release(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "<set-?>");
        this.enterAnimation = animation;
    }

    /* JADX INFO: renamed from: getExitAnimation$alerter_release, reason: from getter */
    public final Animation getExitAnimation() {
        return this.exitAnimation;
    }

    public final void setExitAnimation$alerter_release(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "<set-?>");
        this.exitAnimation = animation;
    }

    /* JADX INFO: renamed from: getDuration$alerter_release, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration$alerter_release(long j) {
        this.duration = j;
    }

    public final Typeface getButtonTypeFace() {
        return this.buttonTypeFace;
    }

    public final void setButtonTypeFace(Typeface typeface) {
        this.buttonTypeFace = typeface;
    }

    public final int getLayoutGravity() {
        return this.layoutGravity;
    }

    public final void setLayoutGravity(int i) {
        if (i != 48) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.alerter_slide_in_from_bottom);
            Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "AnimationUtils.loadAnima…ter_slide_in_from_bottom)");
            this.enterAnimation = animationLoadAnimation;
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.alerter_slide_out_to_bottom);
            Intrinsics.checkNotNullExpressionValue(animationLoadAnimation2, "AnimationUtils.loadAnima…rter_slide_out_to_bottom)");
            this.exitAnimation = animationLoadAnimation2;
        }
        this.layoutGravity = i;
    }

    public final int getContentGravity() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llAlertBackground);
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            return ((FrameLayout.LayoutParams) layoutParams).gravity;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setContentGravity(int i) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.tvTitle);
        ViewGroup.LayoutParams layoutParams = appCompatTextView != null ? appCompatTextView.getLayoutParams() : null;
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i;
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(R.id.tvText);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView2 != null ? appCompatTextView2.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) (layoutParams3 instanceof LinearLayout.LayoutParams ? layoutParams3 : null);
        if (layoutParams4 != null) {
            layoutParams4.gravity = i;
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(R.id.tvText);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setLayoutParams(layoutParams4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPhysicalScreenHeight() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display currentDisplay = getCurrentDisplay();
        if (currentDisplay != null) {
            currentDisplay.getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getUsableScreenHeight() {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return system.getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCutoutsHeight() {
        DisplayCutout displayCutout;
        int safeInsetTop;
        int safeInsetBottom;
        DisplayCutout cutout;
        if (Build.VERSION.SDK_INT >= 29) {
            Display currentDisplay = getCurrentDisplay();
            if (currentDisplay == null || (cutout = currentDisplay.getCutout()) == null) {
                return 0;
            }
            safeInsetTop = cutout.getSafeInsetTop();
            safeInsetBottom = cutout.getSafeInsetBottom();
        } else {
            WindowInsets rootWindowInsets = getRootWindowInsets();
            if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                return 0;
            }
            safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
        }
        return safeInsetTop + safeInsetBottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Drawable rippleDrawable;
        super.onAttachedToWindow();
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llAlertBackground);
        if (this.enableClickAnimation) {
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            rippleDrawable = ExAlertKt.getRippleDrawable(context);
        } else {
            rippleDrawable = null;
        }
        linearLayout.setForeground(rippleDrawable);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        ((FrameLayout.LayoutParams) layoutParams).gravity = this.layoutGravity;
        if (this.layoutGravity != 48) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), ExAlertKt.getDimenPixelSize(this, R.dimen.alerter_padding_default), linearLayout.getPaddingRight(), ExAlertKt.getDimenPixelSize(this, R.dimen.alerter_alert_padding));
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (this.layoutGravity != 48) {
            marginLayoutParams.bottomMargin = getNavigationBarHeight();
        }
        this.enterAnimation.setAnimationListener(this);
        setAnimation(this.enterAnimation);
        for (Button button : this.buttons) {
            Typeface typeface = this.buttonTypeFace;
            if (typeface != null) {
                button.setTypeface(typeface);
            }
            ((LinearLayout) _$_findCachedViewById(R.id.llButtonContainer)).addView(button);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.marginSet) {
            this.marginSet = true;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ExAlertKt.getDimenPixelSize(this, R.dimen.alerter_alert_negative_margin_top);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llAlertBackground);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop() + (ExAlertKt.notchHeight(this) / 2), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.enterAnimation.setAnimationListener(null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.performClick();
        return super.onTouchEvent(event);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.isDismissible) {
            hide();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        ((LinearLayout) _$_findCachedViewById(R.id.llAlertBackground)).setOnClickListener(listener);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(i)");
            childAt.setVisibility(visibility);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (isInEditMode()) {
            return;
        }
        setVisibility(0);
        if (this.vibrationEnabled) {
            performHapticFeedback(1);
        }
        if (this.soundUri != null) {
            RingtoneManager.getRingtone(getContext(), this.soundUri).play();
        }
        if (this.enableProgress) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(4);
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setVisibility(4);
            }
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.pbProgress);
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        if (this.showIcon) {
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
            if (appCompatImageView5 != null) {
                appCompatImageView5.setVisibility(0);
            }
            if (this.enableIconPulse && (appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon)) != null) {
                appCompatImageView2.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.alerter_pulse));
            }
        } else {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.flIconContainer);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
        if (this.showRightIcon) {
            AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
            if (appCompatImageView6 != null) {
                appCompatImageView6.setVisibility(0);
            }
            if (!this.enableRightIconPurse || (appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon)) == null) {
                return;
            }
            appCompatImageView.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.alerter_pulse));
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.flRightIconContainer);
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        OnShowAlertListener onShowAlertListener = this.onShowListener;
        if (onShowAlertListener != null) {
            onShowAlertListener.onShow();
        }
        startHideAnimation();
    }

    private final void startHideAnimation() {
        if (this.enableInfiniteDuration) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.tapadoo.alerter.Alert.startHideAnimation.1
            @Override // java.lang.Runnable
            public final void run() {
                Alert.this.hide();
            }
        };
        this.runningAnimation = runnable;
        postDelayed(runnable, this.duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hide() {
        try {
            this.exitAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.tapadoo.alerter.Alert.hide.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    LinearLayout linearLayout = (LinearLayout) Alert.this._$_findCachedViewById(R.id.llAlertBackground);
                    if (linearLayout != null) {
                        linearLayout.setOnClickListener(null);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) Alert.this._$_findCachedViewById(R.id.llAlertBackground);
                    if (linearLayout2 != null) {
                        linearLayout2.setClickable(false);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    Alert.this.removeFromParent$alerter_release();
                }
            });
            startAnimation(this.exitAnimation);
        } catch (Exception e) {
            Log.e(getClass().getSimpleName(), Log.getStackTraceString(e));
        }
    }

    public final void removeFromParent$alerter_release() {
        clearAnimation();
        setVisibility(8);
        postDelayed(new Runnable() { // from class: com.tapadoo.alerter.Alert$removeFromParent$1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (this.this$0.getParent() != null) {
                        try {
                            ViewParent parent = this.this$0.getParent();
                            if (parent == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                            }
                            ((ViewGroup) parent).removeView(this.this$0);
                            OnHideAlertListener onHideListener = this.this$0.getOnHideListener();
                            if (onHideListener != null) {
                                onHideListener.onHide();
                            }
                        } catch (Exception unused) {
                            Log.e(getClass().getSimpleName(), "Cannot remove from parent layout");
                        }
                    }
                } catch (Exception e) {
                    Log.e(getClass().getSimpleName(), Log.getStackTraceString(e));
                }
            }
        }, 100);
    }

    public final void setAlertBackgroundColor(int color) {
        ((LinearLayout) _$_findCachedViewById(R.id.llAlertBackground)).setBackgroundColor(color);
    }

    public final void setAlertBackgroundResource(int resource) {
        ((LinearLayout) _$_findCachedViewById(R.id.llAlertBackground)).setBackgroundResource(resource);
    }

    public final void setAlertBackgroundDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ViewCompat.setBackground((LinearLayout) _$_findCachedViewById(R.id.llAlertBackground), drawable);
    }

    public final void setTitle(int titleId) {
        String string = getContext().getString(titleId);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(titleId)");
        setTitle(string);
    }

    public final void setText(int textId) {
        String string = getContext().getString(textId);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(textId)");
        setText(string);
    }

    public final void disableOutsideTouch() {
        FrameLayout flClickShield = (FrameLayout) _$_findCachedViewById(R.id.flClickShield);
        Intrinsics.checkNotNullExpressionValue(flClickShield, "flClickShield");
        flClickShield.setClickable(true);
    }

    public final void setTitle(CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        if (TextUtils.isEmpty(title)) {
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.tvTitle);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(R.id.tvTitle);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(title);
        }
    }

    public final void setTitleAppearance(int textAppearance) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.tvTitle);
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(textAppearance);
        }
    }

    public final void setTitleTypeface(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.tvTitle);
        if (appCompatTextView != null) {
            appCompatTextView.setTypeface(typeface);
        }
    }

    public final void setTextTypeface(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.tvText);
        if (appCompatTextView != null) {
            appCompatTextView.setTypeface(typeface);
        }
    }

    public final void setText(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (TextUtils.isEmpty(text)) {
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.tvText);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(R.id.tvText);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(text);
        }
    }

    public final void setTextAppearance(int textAppearance) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.tvText);
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(textAppearance);
        }
    }

    public final void setIcon(int iconId) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(AppCompatResources.getDrawable(getContext(), iconId));
        }
    }

    public final void setIconColorFilter(int color) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(color);
        }
    }

    public final void setIconColorFilter(ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(colorFilter);
        }
    }

    public final void setIconColorFilter(int color, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(color, mode);
        }
    }

    public final void setIcon(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageBitmap(bitmap);
        }
    }

    public final void setIcon(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    public final void setIconSize(int size) {
        setIconPixelSize(ExAlertKt.getDimenPixelSize(this, size));
    }

    public final void setIconPixelSize(int size) {
        AppCompatImageView ivIcon = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        AppCompatImageView ivIcon2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivIcon);
        Intrinsics.checkNotNullExpressionValue(ivIcon2, "ivIcon");
        ViewGroup.LayoutParams layoutParams = ivIcon2.getLayoutParams();
        layoutParams.width = size;
        layoutParams.height = size;
        setMinimumWidth(size);
        setMinimumHeight(size);
        Unit unit = Unit.INSTANCE;
        ivIcon.setLayoutParams(layoutParams);
    }

    public final void showIcon(boolean showIcon) {
        this.showIcon = showIcon;
    }

    public final void setRightIcon(int iconId) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(AppCompatResources.getDrawable(getContext(), iconId));
        }
    }

    public final void setRightIconColorFilter(int color) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(color);
        }
    }

    public final void setRightIconColorFilter(ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(colorFilter);
        }
    }

    public final void setRightIconColorFilter(int color, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(color, mode);
        }
    }

    public final void setRightIcon(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageBitmap(bitmap);
        }
    }

    public final void setRightIcon(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    public final void setRightIconSize(int size) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setRightIconPixelSize(context.getResources().getDimensionPixelSize(size));
    }

    public final void setRightIconPixelSize(int size) {
        AppCompatImageView ivRightIcon = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        Intrinsics.checkNotNullExpressionValue(ivRightIcon, "ivRightIcon");
        AppCompatImageView ivRightIcon2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivRightIcon);
        Intrinsics.checkNotNullExpressionValue(ivRightIcon2, "ivRightIcon");
        ViewGroup.LayoutParams layoutParams = ivRightIcon2.getLayoutParams();
        layoutParams.width = size;
        layoutParams.height = size;
        setMinimumWidth(size);
        setMinimumHeight(size);
        Unit unit = Unit.INSTANCE;
        ivRightIcon.setLayoutParams(layoutParams);
    }

    public final void showRightIcon(boolean showRightIcon) {
        this.showRightIcon = showRightIcon;
    }

    public final void enableClickAnimation(boolean enabled) {
        this.enableClickAnimation = enabled;
    }

    public final void setRightIconPosition(int position) {
        if (position == 48 || position == 17 || position == 16 || position == 80) {
            FrameLayout flRightIconContainer = (FrameLayout) _$_findCachedViewById(R.id.flRightIconContainer);
            Intrinsics.checkNotNullExpressionValue(flRightIconContainer, "flRightIconContainer");
            FrameLayout flRightIconContainer2 = (FrameLayout) _$_findCachedViewById(R.id.flRightIconContainer);
            Intrinsics.checkNotNullExpressionValue(flRightIconContainer2, "flRightIconContainer");
            ViewGroup.LayoutParams layoutParams = flRightIconContainer2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = position;
            Unit unit = Unit.INSTANCE;
            flRightIconContainer.setLayoutParams(layoutParams2);
        }
    }

    public final void setDismissible(boolean dismissible) {
        this.isDismissible = dismissible;
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    public final void enableSwipeToDismiss() {
        LinearLayout it = (LinearLayout) _$_findCachedViewById(R.id.llAlertBackground);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        it.setOnTouchListener(new SwipeDismissTouchListener(it, new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.tapadoo.alerter.Alert$enableSwipeToDismiss$$inlined$let$lambda$1
            @Override // com.tapadoo.alerter.SwipeDismissTouchListener.DismissCallbacks
            /* JADX INFO: renamed from: canDismiss */
            public boolean getIsDismissible() {
                return true;
            }

            @Override // com.tapadoo.alerter.SwipeDismissTouchListener.DismissCallbacks
            public void onTouch(View view, boolean touch) {
                Intrinsics.checkNotNullParameter(view, "view");
            }

            @Override // com.tapadoo.alerter.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.removeFromParent$alerter_release();
            }
        }));
    }

    public final void pulseIcon(boolean shouldPulse) {
        this.enableIconPulse = shouldPulse;
    }

    public final void pulseRightIcon(boolean shouldPulse) {
        this.enableRightIconPurse = shouldPulse;
    }

    public final void setEnableInfiniteDuration(boolean enableInfiniteDuration) {
        this.enableInfiniteDuration = enableInfiniteDuration;
    }

    public final void setEnableProgress(boolean enableProgress) {
        this.enableProgress = enableProgress;
    }

    public final void setProgressColorRes(int color) {
        Drawable progressDrawable;
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.pbProgress);
        if (progressBar == null || (progressDrawable = progressBar.getProgressDrawable()) == null) {
            return;
        }
        progressDrawable.setColorFilter(new LightingColorFilter(-16777216, ContextCompat.getColor(getContext(), color)));
    }

    public final void setProgressColorInt(int color) {
        Drawable progressDrawable;
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.pbProgress);
        if (progressBar == null || (progressDrawable = progressBar.getProgressDrawable()) == null) {
            return;
        }
        progressDrawable.setColorFilter(new LightingColorFilter(-16777216, color));
    }

    public final void setOnShowListener(OnShowAlertListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onShowListener = listener;
    }

    public final void setVibrationEnabled(boolean vibrationEnabled) {
        this.vibrationEnabled = vibrationEnabled;
    }

    public final void setSound(Uri soundUri) {
        this.soundUri = soundUri;
    }

    public final void setBackgroundElevation(float elevation) {
        LinearLayout llAlertBackground = (LinearLayout) _$_findCachedViewById(R.id.llAlertBackground);
        Intrinsics.checkNotNullExpressionValue(llAlertBackground, "llAlertBackground");
        llAlertBackground.setElevation(elevation);
    }

    public final void addButton(CharSequence text, int style, View.OnClickListener onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Button button = new Button(new ContextThemeWrapper(getContext(), style), null, style);
        button.setText(text);
        button.setOnClickListener(onClick);
        this.buttons.add(button);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llAlertBackground);
        if (linearLayout != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom() / 2);
        }
    }

    public final TextView getTitle() {
        AppCompatTextView tvTitle = (AppCompatTextView) _$_findCachedViewById(R.id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        return tvTitle;
    }

    public final TextView getText() {
        AppCompatTextView tvText = (AppCompatTextView) _$_findCachedViewById(R.id.tvText);
        Intrinsics.checkNotNullExpressionValue(tvText, "tvText");
        return tvText;
    }

    @Override // com.tapadoo.alerter.SwipeDismissTouchListener.DismissCallbacks
    /* JADX INFO: renamed from: canDismiss, reason: from getter */
    public boolean getIsDismissible() {
        return this.isDismissible;
    }

    @Override // com.tapadoo.alerter.SwipeDismissTouchListener.DismissCallbacks
    public void onDismiss(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.flClickShield);
        if (frameLayout != null) {
            frameLayout.removeView((LinearLayout) _$_findCachedViewById(R.id.llAlertBackground));
        }
    }

    @Override // com.tapadoo.alerter.SwipeDismissTouchListener.DismissCallbacks
    public void onTouch(View view, boolean touch) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (touch) {
            removeCallbacks(this.runningAnimation);
        } else {
            startHideAnimation();
        }
    }
}
