package com.medicmedia.medilink.ui.bookshelf;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookListRow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003Jo\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020\bH×\u0001J\t\u0010!\u001a\u00020\"H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookListRowEvents;", "", "onClick", "Lkotlin/Function0;", "", "onLongClick", "onClickMenu", "Lkotlin/Function1;", "", "onClickHtml", "onClickPdf", "onDismissMenu", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnLongClick", "getOnClickMenu", "()Lkotlin/jvm/functions/Function1;", "getOnClickHtml", "getOnClickPdf", "getOnDismissMenu", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BookListRowEvents {
    public static final int $stable = 0;
    private final Function0<Unit> onClick;
    private final Function0<Unit> onClickHtml;
    private final Function1<Integer, Unit> onClickMenu;
    private final Function0<Unit> onClickPdf;
    private final Function0<Unit> onDismissMenu;
    private final Function0<Unit> onLongClick;

    public BookListRowEvents() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BookListRowEvents copy$default(BookListRowEvents bookListRowEvents, Function0 function0, Function0 function1, Function1 function2, Function0 function3, Function0 function4, Function0 function5, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = bookListRowEvents.onClick;
        }
        if ((i & 2) != 0) {
            function1 = bookListRowEvents.onLongClick;
        }
        if ((i & 4) != 0) {
            function2 = bookListRowEvents.onClickMenu;
        }
        if ((i & 8) != 0) {
            function3 = bookListRowEvents.onClickHtml;
        }
        if ((i & 16) != 0) {
            function4 = bookListRowEvents.onClickPdf;
        }
        if ((i & 32) != 0) {
            function5 = bookListRowEvents.onDismissMenu;
        }
        Function0 function6 = function4;
        Function0 function7 = function5;
        return bookListRowEvents.copy(function0, function1, function2, function3, function6, function7);
    }

    public final Function0<Unit> component1() {
        return this.onClick;
    }

    public final Function0<Unit> component2() {
        return this.onLongClick;
    }

    public final Function1<Integer, Unit> component3() {
        return this.onClickMenu;
    }

    public final Function0<Unit> component4() {
        return this.onClickHtml;
    }

    public final Function0<Unit> component5() {
        return this.onClickPdf;
    }

    public final Function0<Unit> component6() {
        return this.onDismissMenu;
    }

    public final BookListRowEvents copy(Function0<Unit> onClick, Function0<Unit> onLongClick, Function1<? super Integer, Unit> onClickMenu, Function0<Unit> onClickHtml, Function0<Unit> onClickPdf, Function0<Unit> onDismissMenu) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        Intrinsics.checkNotNullParameter(onClickMenu, "onClickMenu");
        Intrinsics.checkNotNullParameter(onClickHtml, "onClickHtml");
        Intrinsics.checkNotNullParameter(onClickPdf, "onClickPdf");
        Intrinsics.checkNotNullParameter(onDismissMenu, "onDismissMenu");
        return new BookListRowEvents(onClick, onLongClick, onClickMenu, onClickHtml, onClickPdf, onDismissMenu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookListRowEvents)) {
            return false;
        }
        BookListRowEvents bookListRowEvents = (BookListRowEvents) other;
        return Intrinsics.areEqual(this.onClick, bookListRowEvents.onClick) && Intrinsics.areEqual(this.onLongClick, bookListRowEvents.onLongClick) && Intrinsics.areEqual(this.onClickMenu, bookListRowEvents.onClickMenu) && Intrinsics.areEqual(this.onClickHtml, bookListRowEvents.onClickHtml) && Intrinsics.areEqual(this.onClickPdf, bookListRowEvents.onClickPdf) && Intrinsics.areEqual(this.onDismissMenu, bookListRowEvents.onDismissMenu);
    }

    public int hashCode() {
        return (((((((((this.onClick.hashCode() * 31) + this.onLongClick.hashCode()) * 31) + this.onClickMenu.hashCode()) * 31) + this.onClickHtml.hashCode()) * 31) + this.onClickPdf.hashCode()) * 31) + this.onDismissMenu.hashCode();
    }

    public String toString() {
        return "BookListRowEvents(onClick=" + this.onClick + ", onLongClick=" + this.onLongClick + ", onClickMenu=" + this.onClickMenu + ", onClickHtml=" + this.onClickHtml + ", onClickPdf=" + this.onClickPdf + ", onDismissMenu=" + this.onDismissMenu + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BookListRowEvents(Function0<Unit> onClick, Function0<Unit> onLongClick, Function1<? super Integer, Unit> onClickMenu, Function0<Unit> onClickHtml, Function0<Unit> onClickPdf, Function0<Unit> onDismissMenu) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        Intrinsics.checkNotNullParameter(onClickMenu, "onClickMenu");
        Intrinsics.checkNotNullParameter(onClickHtml, "onClickHtml");
        Intrinsics.checkNotNullParameter(onClickPdf, "onClickPdf");
        Intrinsics.checkNotNullParameter(onDismissMenu, "onDismissMenu");
        this.onClick = onClick;
        this.onLongClick = onLongClick;
        this.onClickMenu = onClickMenu;
        this.onClickHtml = onClickHtml;
        this.onClickPdf = onClickPdf;
        this.onDismissMenu = onDismissMenu;
    }

    public /* synthetic */ BookListRowEvents(Function0 function0, Function0 function1, Function1 function2, Function0 function3, Function0 function4, Function0 function5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: com.medicmedia.medilink.ui.bookshelf.BookListRowEvents$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0, (i & 2) != 0 ? new Function0() { // from class: com.medicmedia.medilink.ui.bookshelf.BookListRowEvents$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function1, (i & 4) != 0 ? new Function1() { // from class: com.medicmedia.medilink.ui.bookshelf.BookListRowEvents$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookListRowEvents._init_$lambda$2(((Integer) obj).intValue());
            }
        } : function2, (i & 8) != 0 ? new Function0() { // from class: com.medicmedia.medilink.ui.bookshelf.BookListRowEvents$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function3, (i & 16) != 0 ? new Function0() { // from class: com.medicmedia.medilink.ui.bookshelf.BookListRowEvents$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function4, (i & 32) != 0 ? new Function0() { // from class: com.medicmedia.medilink.ui.bookshelf.BookListRowEvents$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function5);
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final Function0<Unit> getOnLongClick() {
        return this.onLongClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(int i) {
        return Unit.INSTANCE;
    }

    public final Function1<Integer, Unit> getOnClickMenu() {
        return this.onClickMenu;
    }

    public final Function0<Unit> getOnClickHtml() {
        return this.onClickHtml;
    }

    public final Function0<Unit> getOnClickPdf() {
        return this.onClickPdf;
    }

    public final Function0<Unit> getOnDismissMenu() {
        return this.onDismissMenu;
    }
}
