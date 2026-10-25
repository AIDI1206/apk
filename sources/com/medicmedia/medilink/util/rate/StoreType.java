package com.medicmedia.medilink.util.rate;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: StoreType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/util/rate/StoreType;", "", "<init>", "()V", "StoreWithoutApplicationId", "StoreWithApplicationId", "AnyStoreType", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public class StoreType {
    public static final int $stable = 0;
    public static final int AMAZON = 0;
    public static final int APPLE = 1;
    public static final int BAZAAR = 2;
    public static final int BLACKBERRY = 3;
    public static final int CHINESESTORES = 4;
    public static final int GOOGLEPLAY = 5;
    public static final int INTENT = 11;
    public static final int MI = 6;
    public static final int OTHER = 12;
    public static final int SAMSUNG = 7;
    public static final int SLIDEME = 8;
    public static final int TENCENT = 9;
    public static final int YANDEX = 10;

    /* JADX INFO: compiled from: StoreType.kt */
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/medicmedia/medilink/util/rate/StoreType$AnyStoreType;", "", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface AnyStoreType {
    }

    /* JADX INFO: compiled from: StoreType.kt */
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/medicmedia/medilink/util/rate/StoreType$StoreWithApplicationId;", "", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface StoreWithApplicationId {
    }

    /* JADX INFO: compiled from: StoreType.kt */
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/medicmedia/medilink/util/rate/StoreType$StoreWithoutApplicationId;", "", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface StoreWithoutApplicationId {
    }
}
