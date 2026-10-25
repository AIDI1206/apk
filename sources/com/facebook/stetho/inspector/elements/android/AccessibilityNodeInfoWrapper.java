package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.stetho.common.android.AccessibilityUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityNodeInfoWrapper {
    public static AccessibilityNodeInfoCompat createNodeInfoFromView(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        ViewCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
        return accessibilityNodeInfoCompatObtain;
    }

    public static boolean getIsAccessibilityFocused(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        boolean zIsAccessibilityFocused = accessibilityNodeInfoCompatCreateNodeInfoFromView.isAccessibilityFocused();
        accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
        return zIsAccessibilityFocused;
    }

    public static boolean getIgnored(View view) {
        int importantForAccessibility = ViewCompat.getImportantForAccessibility(view);
        if (importantForAccessibility == 2 || importantForAccessibility == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (ViewCompat.getImportantForAccessibility((View) parent) == 4) {
                return true;
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!accessibilityNodeInfoCompatCreateNodeInfoFromView.isVisibleToUser()) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return true;
            }
            if (!AccessibilityUtil.isAccessibilityFocusable(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                if (AccessibilityUtil.hasFocusableAncestor(accessibilityNodeInfoCompatCreateNodeInfoFromView, view) || !AccessibilityUtil.hasText(accessibilityNodeInfoCompatCreateNodeInfoFromView)) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return true;
                }
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return false;
            }
            if (accessibilityNodeInfoCompatCreateNodeInfoFromView.getChildCount() <= 0) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return false;
            }
            if (AccessibilityUtil.isSpeakingNode(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return false;
            }
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
            return true;
        } catch (Throwable th) {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
            throw th;
        }
    }

    public static String getIgnoredReasons(View view) {
        int importantForAccessibility = ViewCompat.getImportantForAccessibility(view);
        if (importantForAccessibility == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (importantForAccessibility == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (ViewCompat.getImportantForAccessibility((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!accessibilityNodeInfoCompatCreateNodeInfoFromView.isVisibleToUser()) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return "View is actionable, but has no description.";
            }
            if (AccessibilityUtil.hasText(accessibilityNodeInfoCompatCreateNodeInfoFromView)) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return "View is not actionable, and an ancestor View has co-opted its description.";
            }
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
            return "View is not actionable and has no description.";
        } catch (Throwable th) {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
            throw th;
        }
    }

    public static String getFocusableReasons(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean zHasText = AccessibilityUtil.hasText(accessibilityNodeInfoCompatCreateNodeInfoFromView);
            boolean zIsCheckable = accessibilityNodeInfoCompatCreateNodeInfoFromView.isCheckable();
            boolean zHasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompatCreateNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(accessibilityNodeInfoCompatCreateNodeInfoFromView)) {
                if (accessibilityNodeInfoCompatCreateNodeInfoFromView.getChildCount() <= 0) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return "View is actionable and has no children.";
                }
                if (zHasText) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return "View is actionable and has a description.";
                }
                if (zIsCheckable) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return "View is actionable and checkable.";
                }
                if (zHasNonActionableSpeakingDescendants) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                if (zHasText) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return "View is a direct child of a scrollable container and has a description.";
                }
                if (zIsCheckable) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return "View is a direct child of a scrollable container and is checkable.";
                }
                if (zHasNonActionableSpeakingDescendants) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (zHasText) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
            return null;
        } catch (Throwable th) {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
            throw th;
        }
    }

    public static String getActions(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb = new StringBuilder();
            for (AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat : accessibilityNodeInfoCompatCreateNodeInfoFromView.getActionList()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                int id = accessibilityActionCompat.getId();
                if (id == 1) {
                    sb.append("focus");
                } else if (id == 2) {
                    sb.append("clear-focus");
                } else {
                    switch (id) {
                        case 4:
                            sb.append("select");
                            break;
                        case 8:
                            sb.append("clear-selection");
                            break;
                        case 16:
                            sb.append("click");
                            break;
                        case 32:
                            sb.append("long-click");
                            break;
                        case 64:
                            sb.append("accessibility-focus");
                            break;
                        case 128:
                            sb.append("clear-accessibility-focus");
                            break;
                        case 256:
                            sb.append("next-at-movement-granularity");
                            break;
                        case 512:
                            sb.append("previous-at-movement-granularity");
                            break;
                        case 1024:
                            sb.append("next-html-element");
                            break;
                        case 2048:
                            sb.append("previous-html-element");
                            break;
                        case 4096:
                            sb.append("scroll-forward");
                            break;
                        case 8192:
                            sb.append("scroll-backward");
                            break;
                        case 16384:
                            sb.append("copy");
                            break;
                        case 32768:
                            sb.append("paste");
                            break;
                        case 65536:
                            sb.append("cut");
                            break;
                        case 131072:
                            sb.append("set-selection");
                            break;
                        default:
                            CharSequence label = accessibilityActionCompat.getLabel();
                            if (label != null) {
                                sb.append(label);
                            } else {
                                sb.append(EnvironmentCompat.MEDIA_UNKNOWN);
                            }
                            break;
                    }
                }
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
        }
    }

    public static CharSequence getDescription(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence contentDescription = accessibilityNodeInfoCompatCreateNodeInfoFromView.getContentDescription();
            CharSequence text = accessibilityNodeInfoCompatCreateNodeInfoFromView.getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z = view instanceof EditText;
            if (!TextUtils.isEmpty(contentDescription) && (!z || zIsEmpty)) {
                return contentDescription;
            }
            if (!zIsEmpty) {
                return text;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
                ViewCompat.onInitializeAccessibilityNodeInfo(childAt, accessibilityNodeInfoCompatObtain);
                CharSequence description = (!AccessibilityUtil.isSpeakingNode(accessibilityNodeInfoCompatObtain, childAt) || AccessibilityUtil.isAccessibilityFocusable(accessibilityNodeInfoCompatObtain, childAt)) ? null : getDescription(childAt);
                if (!TextUtils.isEmpty(description)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(description);
                }
                accessibilityNodeInfoCompatObtain.recycle();
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
        }
    }
}
