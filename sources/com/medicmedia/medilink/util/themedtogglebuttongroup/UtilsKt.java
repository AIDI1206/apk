package com.medicmedia.medilink.util.themedtogglebuttongroup;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\u001aA\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\u0010\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001ap\u0010\n\u001a\u00020\u0001*\u00020\u000b2b\u0010\f\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\rH\u0000\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0002\u001ae\u0010\u0017\u001a\u00020\u0001*\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0002\u0010 \u001a;\u0010'\u001a\u0004\u0018\u0001H(\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010(*\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H(0*2\u0006\u0010+\u001a\u0002H)2\u0006\u0010!\u001a\u0002H(H\u0000¢\u0006\u0002\u0010,\u001a'\u0010-\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010.*\b\u0012\u0004\u0012\u0002H.0/2\u0006\u00100\u001a\u0002H.H\u0000¢\u0006\u0002\u00101\u001a\u001f\u00102\u001a\u0004\u0018\u0001H.\"\u0004\b\u0000\u0010.*\b\u0012\u0004\u0012\u0002H.0/H\u0000¢\u0006\u0002\u00103\"(\u0010\"\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00048@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\"\u0018\u0010\u0010\u001a\u000204*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0018\u00107\u001a\u00020\u0004*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0018\u0010:\u001a\u00020\u0019*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0018\u00107\u001a\u00020\u0019*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010=\"\u0018\u0010>\u001a\u00020\u0004*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u00109\"\u0018\u0010>\u001a\u00020\u0004*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\"\u0018\u0010A\u001a\u00020\u0019*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0018\u0010D\u001a\u00020\u0019*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006F"}, d2 = {"setMargin", "", "Lcom/medicmedia/medilink/util/themedtogglebuttongroup/ThemedButton;", "leftMargin", "", "topMargin", "rightMargin", "bottomMargin", "(Lcom/medicmedia/medilink/util/themedtogglebuttongroup/ThemedButton;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "bounceDown", "setOnBoundedTouchListener", "Landroid/view/View;", "callback", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "isActionDown", "isActionUp", "isActionCancel", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "bounceUp", "setViewPadding", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "horizontal", "vertical", TtmlNode.COMBINE_ALL, "(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "value", "layoutGravity", "getLayoutGravity", "(Landroid/view/View;)I", "setLayoutGravity", "(Landroid/view/View;I)V", "addIfAbsent", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "K", "", "key", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "enqueue", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "(Ljava/util/List;Ljava/lang/Object;)Lkotlin/Unit;", "dequeue", "(Ljava/util/List;)Ljava/lang/Object;", "", "getName", "(Landroid/view/View;)Ljava/lang/String;", "px", "getPx", "(I)I", "pxf", "getPxf", "(I)F", "(F)F", "dp", "getDp", "(F)I", "centerX", "getCenterX", "(Lcom/medicmedia/medilink/util/themedtogglebuttongroup/ThemedButton;)F", "centerY", "getCenterY", "app_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UtilsKt {
    public static /* synthetic */ void setMargin$default(ThemedButton themedButton, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        setMargin(themedButton, num, num2, num3, num4);
    }

    public static final void setMargin(ThemedButton themedButton, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(themedButton, "<this>");
        ViewGroup.LayoutParams layoutParams = themedButton.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(num != null ? num.intValue() : marginLayoutParams.leftMargin, num2 != null ? num2.intValue() : marginLayoutParams.topMargin, num3 != null ? num3.intValue() : marginLayoutParams.rightMargin, num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin);
        themedButton.setLayoutParams(marginLayoutParams);
    }

    public static final void bounceDown(ThemedButton themedButton) {
        Intrinsics.checkNotNullParameter(themedButton, "<this>");
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, themedButton.getWidth() / 2, themedButton.getHeight() / 2);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        themedButton.startAnimation(scaleAnimation);
    }

    public static final void setOnBoundedTouchListener(final View view, final Function4<? super Boolean, ? super Boolean, ? super Boolean, ? super MotionEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.UtilsKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return UtilsKt.setOnBoundedTouchListener$lambda$0(view, booleanRef, callback, objectRef, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [T, android.graphics.Rect] */
    public static final boolean setOnBoundedTouchListener$lambda$0(View view, Ref.BooleanRef booleanRef, Function4 function4, Ref.ObjectRef objectRef, View view2, MotionEvent motionEvent) {
        view.performClick();
        int left = view2 != null ? view2.getLeft() : 0;
        int top = view2 != null ? view2.getTop() : 0;
        int right = view2 != null ? view2.getRight() : 0;
        int bottom = view2 != null ? view2.getBottom() : 0;
        int x = motionEvent != null ? (int) motionEvent.getX() : 0;
        int y = motionEvent != null ? (int) motionEvent.getY() : 0;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            booleanRef.element = false;
            function4.invoke(true, false, false, motionEvent);
            objectRef.element = new Rect(left, top, right, bottom);
        } else if (numValueOf != null && numValueOf.intValue() == 1 && !booleanRef.element) {
            Rect rect = (Rect) objectRef.element;
            if (rect == null || rect.contains(left + x, top + y)) {
                function4.invoke(false, true, false, motionEvent);
            } else {
                booleanRef.element = true;
                function4.invoke(false, false, true, motionEvent);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            Rect rect2 = (Rect) objectRef.element;
            if (rect2 != null && !rect2.contains(left + x, top + y) && !booleanRef.element) {
                booleanRef.element = true;
                function4.invoke(false, false, true, motionEvent);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 3 && !booleanRef.element) {
            booleanRef.element = true;
            function4.invoke(false, false, true, motionEvent);
        }
        return true;
    }

    public static final void bounceUp(ThemedButton themedButton) {
        Intrinsics.checkNotNullParameter(themedButton, "<this>");
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, themedButton.getWidth() / 2, themedButton.getHeight() / 2);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setStartOffset(100L);
        scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
        themedButton.startAnimation(scaleAnimation);
    }

    public static /* synthetic */ void setViewPadding$default(View view, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        if ((i & 16) != 0) {
            f5 = null;
        }
        if ((i & 32) != 0) {
            f6 = null;
        }
        if ((i & 64) != 0) {
            f7 = null;
        }
        setViewPadding(view, f, f2, f3, f4, f5, f6, f7);
    }

    public static final void setViewPadding(View view, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new Float[]{f, f2, f3, f4, f5, f6, f7});
        if (!(listListOfNotNull instanceof Collection) || !listListOfNotNull.isEmpty()) {
            Iterator it = listListOfNotNull.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).floatValue() < 0.0f) {
                    return;
                }
            }
        }
        if (f7 != null) {
            int iFloatValue = (int) f7.floatValue();
            view.setPadding(iFloatValue, iFloatValue, iFloatValue, iFloatValue);
        }
        if (f5 != null) {
            int iFloatValue2 = (int) f5.floatValue();
            view.setPadding(iFloatValue2, view.getPaddingTop(), iFloatValue2, view.getPaddingBottom());
        }
        if (f6 != null) {
            int iFloatValue3 = (int) f6.floatValue();
            view.setPadding(view.getPaddingLeft(), iFloatValue3, view.getPaddingRight(), iFloatValue3);
        }
        view.setPadding(f != null ? (int) f.floatValue() : view.getPaddingLeft(), f2 != null ? (int) f2.floatValue() : view.getPaddingTop(), f3 != null ? (int) f3.floatValue() : view.getPaddingRight(), f4 != null ? (int) f4.floatValue() : view.getPaddingBottom());
    }

    public static final int getLayoutGravity(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public static final void setLayoutGravity(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setLayoutParams(new FrameLayout.LayoutParams(view.getLayoutParams().width, view.getLayoutParams().height, i));
    }

    public static final <K, V> V addIfAbsent(Map<K, V> map, K k, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        V v2 = map.get(k);
        return v2 == null ? map.put(k, v) : v2;
    }

    public static final <T> Unit enqueue(List<T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(t)) {
            return null;
        }
        list.add(list.size(), t);
        return Unit.INSTANCE;
    }

    public static final <T> T dequeue(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

    public static final String getName(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getId() == -1) {
            return "no-id";
        }
        String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
        return resourceEntryName == null ? "error-getting-name" : resourceEntryName;
    }

    public static final int getPx(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float getPxf(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float getPx(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int getDp(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int getDp(float f) {
        return (int) (f / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float getCenterX(ThemedButton themedButton) {
        Intrinsics.checkNotNullParameter(themedButton, "<this>");
        return themedButton.getWidth() / 2;
    }

    public static final float getCenterY(ThemedButton themedButton) {
        Intrinsics.checkNotNullParameter(themedButton, "<this>");
        return themedButton.getHeight() / 2;
    }
}
