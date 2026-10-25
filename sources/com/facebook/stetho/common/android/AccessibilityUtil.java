package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    public static boolean hasText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        return (TextUtils.isEmpty(accessibilityNodeInfoCompat.getText()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.getContentDescription())) ? false : true;
    }

    public static boolean isSpeakingNode(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        int importantForAccessibility;
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.isVisibleToUser() || (importantForAccessibility = ViewCompat.getImportantForAccessibility(view)) == 4 || (importantForAccessibility == 2 && accessibilityNodeInfoCompat.getChildCount() <= 0)) {
            return false;
        }
        return accessibilityNodeInfoCompat.isCheckable() || hasText(accessibilityNodeInfoCompat) || hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompat, view);
    }

    public static boolean hasNonActionableSpeakingDescendants(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
                    try {
                        ViewCompat.onInitializeAccessibilityNodeInfo(childAt, accessibilityNodeInfoCompatObtain);
                        if (!isAccessibilityFocusable(accessibilityNodeInfoCompatObtain, childAt) && isSpeakingNode(accessibilityNodeInfoCompatObtain, childAt)) {
                            return true;
                        }
                        accessibilityNodeInfoCompatObtain.recycle();
                    } finally {
                        accessibilityNodeInfoCompatObtain.recycle();
                    }
                }
            }
        }
        return false;
    }

    public static boolean isAccessibilityFocusable(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.isVisibleToUser()) {
            return false;
        }
        if (isActionableForAccessibility(accessibilityNodeInfoCompat)) {
            return true;
        }
        return isTopLevelScrollItem(accessibilityNodeInfoCompat, view) && isSpeakingNode(accessibilityNodeInfoCompat, view);
    }

    public static boolean isTopLevelScrollItem(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        View view2;
        if (accessibilityNodeInfoCompat == null || view == null || (view2 = (View) ViewCompat.getParentForAccessibility(view)) == null) {
            return false;
        }
        if (accessibilityNodeInfoCompat.isScrollable()) {
            return true;
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = accessibilityNodeInfoCompat.getActionList();
        if (!actionList.contains(4096) && !actionList.contains(8192)) {
            if (view2 instanceof Spinner) {
                return false;
            }
            if (!(view2 instanceof AdapterView) && !(view2 instanceof ScrollView) && !(view2 instanceof HorizontalScrollView)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isActionableForAccessibility(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.isClickable() && !accessibilityNodeInfoCompat.isLongClickable() && !accessibilityNodeInfoCompat.isFocusable()) {
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = accessibilityNodeInfoCompat.getActionList();
            if (!actionList.contains(16) && !actionList.contains(32) && !actionList.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasFocusableAncestor(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null) {
            return false;
        }
        Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
        if (!(parentForAccessibility instanceof View)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        try {
            ViewCompat.onInitializeAccessibilityNodeInfo((View) parentForAccessibility, accessibilityNodeInfoCompatObtain);
            if (accessibilityNodeInfoCompatObtain != null) {
                if (!isAccessibilityFocusable(accessibilityNodeInfoCompatObtain, (View) parentForAccessibility)) {
                    if (hasFocusableAncestor(accessibilityNodeInfoCompatObtain, (View) parentForAccessibility)) {
                        accessibilityNodeInfoCompatObtain.recycle();
                        return true;
                    }
                    accessibilityNodeInfoCompatObtain.recycle();
                    return false;
                }
                accessibilityNodeInfoCompatObtain.recycle();
                return true;
            }
            accessibilityNodeInfoCompatObtain.recycle();
            return false;
        } catch (Throwable th) {
            accessibilityNodeInfoCompatObtain.recycle();
            throw th;
        }
    }
}
