package com.medicmedia.medilink.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainTabViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabChildCommand;", "", TypedValues.AttributesType.S_TARGET, "Lcom/medicmedia/medilink/ui/MainTabType;", "getTarget", "()Lcom/medicmedia/medilink/ui/MainTabType;", "ScrollToTop", "Lcom/medicmedia/medilink/ui/MainTabChildCommand$ScrollToTop;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MainTabChildCommand {
    MainTabType getTarget();

    /* JADX INFO: compiled from: MainTabViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabChildCommand$ScrollToTop;", "Lcom/medicmedia/medilink/ui/MainTabChildCommand;", TypedValues.AttributesType.S_TARGET, "Lcom/medicmedia/medilink/ui/MainTabType;", "<init>", "(Lcom/medicmedia/medilink/ui/MainTabType;)V", "getTarget", "()Lcom/medicmedia/medilink/ui/MainTabType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ScrollToTop implements MainTabChildCommand {
        public static final int $stable = 0;
        private final MainTabType target;

        public static /* synthetic */ ScrollToTop copy$default(ScrollToTop scrollToTop, MainTabType mainTabType, int i, Object obj) {
            if ((i & 1) != 0) {
                mainTabType = scrollToTop.target;
            }
            return scrollToTop.copy(mainTabType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MainTabType getTarget() {
            return this.target;
        }

        public final ScrollToTop copy(MainTabType target) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new ScrollToTop(target);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollToTop) && this.target == ((ScrollToTop) other).target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return "ScrollToTop(target=" + this.target + ")";
        }

        public ScrollToTop(MainTabType target) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
        }

        @Override // com.medicmedia.medilink.ui.MainTabChildCommand
        public MainTabType getTarget() {
            return this.target;
        }
    }
}
