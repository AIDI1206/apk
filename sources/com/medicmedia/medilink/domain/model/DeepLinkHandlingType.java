package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: DeepLinkItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType;", "", "AppInner", "QbOnline", "OtherSite", "Companion", "Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType$AppInner;", "Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType$OtherSite;", "Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType$QbOnline;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DeepLinkHandlingType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DeepLinkItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType$AppInner;", "Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AppInner implements DeepLinkHandlingType {
        public static final AppInner INSTANCE = new AppInner();

        private AppInner() {
        }
    }

    /* JADX INFO: compiled from: DeepLinkItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType$QbOnline;", "Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class QbOnline implements DeepLinkHandlingType {
        public static final QbOnline INSTANCE = new QbOnline();

        private QbOnline() {
        }
    }

    /* JADX INFO: compiled from: DeepLinkItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType$OtherSite;", "Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class OtherSite implements DeepLinkHandlingType {
        public static final OtherSite INSTANCE = new OtherSite();

        private OtherSite() {
        }
    }

    /* JADX INFO: compiled from: DeepLinkItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/domain/model/DeepLinkHandlingType;", "url", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DeepLinkHandlingType convertTo(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            String str = url;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "medilink-study.com/medilink_app/", false, 2, (Object) null)) {
                return AppInner.INSTANCE;
            }
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "https://qb.medilink-study.com/RegisterQuestionSet/", false, 2, (Object) null)) {
                return QbOnline.INSTANCE;
            }
            return OtherSite.INSTANCE;
        }
    }
}
