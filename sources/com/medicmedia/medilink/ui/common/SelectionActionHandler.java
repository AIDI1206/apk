package com.medicmedia.medilink.ui.common;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SelectionActionWebView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u00120\u0010\n\u001a,\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0012K\u0010\u000e\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u000f\u0012!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018\u0012!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018\u0012 \b\u0002\u0010\u001a\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018\u0012!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J8\u00103\u001a,\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010$JN\u00104\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u000fHÆ\u0003J$\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018HÆ\u0003J$\u00106\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018HÆ\u0003J&\u00107\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010)J$\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018HÆ\u0003Jô\u0002\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000322\b\u0002\u0010\n\u001a,\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2M\b\u0002\u0010\u000e\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u000f2#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u00182#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u00182 \b\u0002\u0010\u001a\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00182#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018HÇ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010=\u001a\u00020>H×\u0001J\t\u0010?\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR=\u0010\n\u001a,\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$RV\u0010\u000e\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R,\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R,\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R+\u0010\u001a\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010,\u001a\u0004\b+\u0010)R,\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)¨\u0006@"}, d2 = {"Lcom/medicmedia/medilink/ui/common/SelectionActionHandler;", "", "webSearchTitle", "Lkotlin/Function0;", "", "appSearchTitle", "markerTitle", "shareTitle", "isMarkerBarVisible", "", "formatHighlightText", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Pair;", "onCopy", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "text", "isOver", "Landroid/view/View;", "anchorView", "", "onWebSearch", "Lkotlin/Function1;", "onAppSearch", "onShowMarker", "onShare", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getWebSearchTitle", "()Lkotlin/jvm/functions/Function0;", "getAppSearchTitle", "getMarkerTitle", "getShareTitle", "getFormatHighlightText", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "getOnCopy", "()Lkotlin/jvm/functions/Function3;", "getOnWebSearch", "()Lkotlin/jvm/functions/Function1;", "getOnAppSearch", "getOnShowMarker", "Lkotlin/jvm/functions/Function1;", "getOnShare", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/medicmedia/medilink/ui/common/SelectionActionHandler;", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SelectionActionHandler {
    public static final int $stable = 8;
    private final Function0<String> appSearchTitle;
    private final Function2<String, Continuation<? super Pair<Boolean, String>>, Object> formatHighlightText;
    private final Function0<Boolean> isMarkerBarVisible;
    private final Function0<String> markerTitle;
    private final Function1<String, Unit> onAppSearch;
    private final Function3<String, Boolean, View, Unit> onCopy;
    private final Function1<String, Unit> onShare;
    private final Function1<Continuation<? super Unit>, Object> onShowMarker;
    private final Function1<String, Unit> onWebSearch;
    private final Function0<String> shareTitle;
    private final Function0<String> webSearchTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionActionHandler copy$default(SelectionActionHandler selectionActionHandler, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function2 function5, Function3 function6, Function1 function7, Function1 function8, Function1 function9, Function1 function10, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = selectionActionHandler.webSearchTitle;
        }
        if ((i & 2) != 0) {
            function1 = selectionActionHandler.appSearchTitle;
        }
        if ((i & 4) != 0) {
            function2 = selectionActionHandler.markerTitle;
        }
        if ((i & 8) != 0) {
            function3 = selectionActionHandler.shareTitle;
        }
        if ((i & 16) != 0) {
            function4 = selectionActionHandler.isMarkerBarVisible;
        }
        if ((i & 32) != 0) {
            function5 = selectionActionHandler.formatHighlightText;
        }
        if ((i & 64) != 0) {
            function6 = selectionActionHandler.onCopy;
        }
        if ((i & 128) != 0) {
            function7 = selectionActionHandler.onWebSearch;
        }
        if ((i & 256) != 0) {
            function8 = selectionActionHandler.onAppSearch;
        }
        if ((i & 512) != 0) {
            function9 = selectionActionHandler.onShowMarker;
        }
        if ((i & 1024) != 0) {
            function10 = selectionActionHandler.onShare;
        }
        Function1 function11 = function9;
        Function1 function12 = function10;
        Function1 function13 = function7;
        Function1 function14 = function8;
        Function2 function15 = function5;
        Function3 function16 = function6;
        Function0 function17 = function4;
        Function0 function18 = function2;
        return selectionActionHandler.copy(function0, function1, function18, function3, function17, function15, function16, function13, function14, function11, function12);
    }

    public final Function0<String> component1() {
        return this.webSearchTitle;
    }

    public final Function1<Continuation<? super Unit>, Object> component10() {
        return this.onShowMarker;
    }

    public final Function1<String, Unit> component11() {
        return this.onShare;
    }

    public final Function0<String> component2() {
        return this.appSearchTitle;
    }

    public final Function0<String> component3() {
        return this.markerTitle;
    }

    public final Function0<String> component4() {
        return this.shareTitle;
    }

    public final Function0<Boolean> component5() {
        return this.isMarkerBarVisible;
    }

    public final Function2<String, Continuation<? super Pair<Boolean, String>>, Object> component6() {
        return this.formatHighlightText;
    }

    public final Function3<String, Boolean, View, Unit> component7() {
        return this.onCopy;
    }

    public final Function1<String, Unit> component8() {
        return this.onWebSearch;
    }

    public final Function1<String, Unit> component9() {
        return this.onAppSearch;
    }

    public final SelectionActionHandler copy(Function0<String> webSearchTitle, Function0<String> appSearchTitle, Function0<String> markerTitle, Function0<String> shareTitle, Function0<Boolean> isMarkerBarVisible, Function2<? super String, ? super Continuation<? super Pair<Boolean, String>>, ? extends Object> formatHighlightText, Function3<? super String, ? super Boolean, ? super View, Unit> onCopy, Function1<? super String, Unit> onWebSearch, Function1<? super String, Unit> onAppSearch, Function1<? super Continuation<? super Unit>, ? extends Object> onShowMarker, Function1<? super String, Unit> onShare) {
        Intrinsics.checkNotNullParameter(webSearchTitle, "webSearchTitle");
        Intrinsics.checkNotNullParameter(appSearchTitle, "appSearchTitle");
        Intrinsics.checkNotNullParameter(shareTitle, "shareTitle");
        Intrinsics.checkNotNullParameter(isMarkerBarVisible, "isMarkerBarVisible");
        Intrinsics.checkNotNullParameter(formatHighlightText, "formatHighlightText");
        Intrinsics.checkNotNullParameter(onCopy, "onCopy");
        Intrinsics.checkNotNullParameter(onWebSearch, "onWebSearch");
        Intrinsics.checkNotNullParameter(onAppSearch, "onAppSearch");
        Intrinsics.checkNotNullParameter(onShare, "onShare");
        return new SelectionActionHandler(webSearchTitle, appSearchTitle, markerTitle, shareTitle, isMarkerBarVisible, formatHighlightText, onCopy, onWebSearch, onAppSearch, onShowMarker, onShare);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionActionHandler)) {
            return false;
        }
        SelectionActionHandler selectionActionHandler = (SelectionActionHandler) other;
        return Intrinsics.areEqual(this.webSearchTitle, selectionActionHandler.webSearchTitle) && Intrinsics.areEqual(this.appSearchTitle, selectionActionHandler.appSearchTitle) && Intrinsics.areEqual(this.markerTitle, selectionActionHandler.markerTitle) && Intrinsics.areEqual(this.shareTitle, selectionActionHandler.shareTitle) && Intrinsics.areEqual(this.isMarkerBarVisible, selectionActionHandler.isMarkerBarVisible) && Intrinsics.areEqual(this.formatHighlightText, selectionActionHandler.formatHighlightText) && Intrinsics.areEqual(this.onCopy, selectionActionHandler.onCopy) && Intrinsics.areEqual(this.onWebSearch, selectionActionHandler.onWebSearch) && Intrinsics.areEqual(this.onAppSearch, selectionActionHandler.onAppSearch) && Intrinsics.areEqual(this.onShowMarker, selectionActionHandler.onShowMarker) && Intrinsics.areEqual(this.onShare, selectionActionHandler.onShare);
    }

    public int hashCode() {
        int iHashCode = ((this.webSearchTitle.hashCode() * 31) + this.appSearchTitle.hashCode()) * 31;
        Function0<String> function0 = this.markerTitle;
        int iHashCode2 = (((((((((((((iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31) + this.shareTitle.hashCode()) * 31) + this.isMarkerBarVisible.hashCode()) * 31) + this.formatHighlightText.hashCode()) * 31) + this.onCopy.hashCode()) * 31) + this.onWebSearch.hashCode()) * 31) + this.onAppSearch.hashCode()) * 31;
        Function1<Continuation<? super Unit>, Object> function1 = this.onShowMarker;
        return ((iHashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31) + this.onShare.hashCode();
    }

    public String toString() {
        return "SelectionActionHandler(webSearchTitle=" + this.webSearchTitle + ", appSearchTitle=" + this.appSearchTitle + ", markerTitle=" + this.markerTitle + ", shareTitle=" + this.shareTitle + ", isMarkerBarVisible=" + this.isMarkerBarVisible + ", formatHighlightText=" + this.formatHighlightText + ", onCopy=" + this.onCopy + ", onWebSearch=" + this.onWebSearch + ", onAppSearch=" + this.onAppSearch + ", onShowMarker=" + this.onShowMarker + ", onShare=" + this.onShare + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectionActionHandler(Function0<String> webSearchTitle, Function0<String> appSearchTitle, Function0<String> function0, Function0<String> shareTitle, Function0<Boolean> isMarkerBarVisible, Function2<? super String, ? super Continuation<? super Pair<Boolean, String>>, ? extends Object> formatHighlightText, Function3<? super String, ? super Boolean, ? super View, Unit> onCopy, Function1<? super String, Unit> onWebSearch, Function1<? super String, Unit> onAppSearch, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function1<? super String, Unit> onShare) {
        Intrinsics.checkNotNullParameter(webSearchTitle, "webSearchTitle");
        Intrinsics.checkNotNullParameter(appSearchTitle, "appSearchTitle");
        Intrinsics.checkNotNullParameter(shareTitle, "shareTitle");
        Intrinsics.checkNotNullParameter(isMarkerBarVisible, "isMarkerBarVisible");
        Intrinsics.checkNotNullParameter(formatHighlightText, "formatHighlightText");
        Intrinsics.checkNotNullParameter(onCopy, "onCopy");
        Intrinsics.checkNotNullParameter(onWebSearch, "onWebSearch");
        Intrinsics.checkNotNullParameter(onAppSearch, "onAppSearch");
        Intrinsics.checkNotNullParameter(onShare, "onShare");
        this.webSearchTitle = webSearchTitle;
        this.appSearchTitle = appSearchTitle;
        this.markerTitle = function0;
        this.shareTitle = shareTitle;
        this.isMarkerBarVisible = isMarkerBarVisible;
        this.formatHighlightText = formatHighlightText;
        this.onCopy = onCopy;
        this.onWebSearch = onWebSearch;
        this.onAppSearch = onAppSearch;
        this.onShowMarker = function1;
        this.onShare = onShare;
    }

    public /* synthetic */ SelectionActionHandler(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function2 function5, Function3 function6, Function1 function7, Function1 function8, Function1 function9, Function1 function10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, (i & 4) != 0 ? null : function2, function3, function4, function5, function6, function7, function8, (i & 512) != 0 ? null : function9, function10);
    }

    public final Function0<String> getWebSearchTitle() {
        return this.webSearchTitle;
    }

    public final Function0<String> getAppSearchTitle() {
        return this.appSearchTitle;
    }

    public final Function0<String> getMarkerTitle() {
        return this.markerTitle;
    }

    public final Function0<String> getShareTitle() {
        return this.shareTitle;
    }

    public final Function0<Boolean> isMarkerBarVisible() {
        return this.isMarkerBarVisible;
    }

    public final Function2<String, Continuation<? super Pair<Boolean, String>>, Object> getFormatHighlightText() {
        return this.formatHighlightText;
    }

    public final Function3<String, Boolean, View, Unit> getOnCopy() {
        return this.onCopy;
    }

    public final Function1<String, Unit> getOnWebSearch() {
        return this.onWebSearch;
    }

    public final Function1<String, Unit> getOnAppSearch() {
        return this.onAppSearch;
    }

    public final Function1<Continuation<? super Unit>, Object> getOnShowMarker() {
        return this.onShowMarker;
    }

    public final Function1<String, Unit> getOnShare() {
        return this.onShare;
    }
}
