package com.appsflyer.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 \t2\u00020\u0001:\u0004\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "getMediationNetwork", "Ljava/lang/String;", "AFAdRevenueData", "AFa1zSDK", "AFa1tSDK", "AFa1vSDK", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class AFe1tSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> getRevenue = CollectionsKt.listOf((Object[]) new String[]{AFInAppEventType.ACHIEVEMENT_UNLOCKED, AFInAppEventType.AD_CLICK, AFInAppEventType.AD_VIEW, AFInAppEventType.ADD_PAYMENT_INFO, AFInAppEventType.ADD_TO_CART, AFInAppEventType.ADD_TO_WISH_LIST, AFInAppEventType.COMPLETE_REGISTRATION, AFInAppEventType.CONTENT_VIEW, AFInAppEventType.INITIATED_CHECKOUT, AFInAppEventType.INVITE, AFInAppEventType.LEVEL_ACHIEVED, AFInAppEventType.LIST_VIEW, AFInAppEventType.LOGIN, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.PURCHASE, AFInAppEventType.RATE, AFInAppEventType.RE_ENGAGE, AFInAppEventType.SEARCH, AFInAppEventType.SHARE, AFInAppEventType.SPENT_CREDIT, AFInAppEventType.START_TRIAL, AFInAppEventType.SUBSCRIBE, AFInAppEventType.TRAVEL_BOOKING, AFInAppEventType.TUTORIAL_COMPLETION, AFInAppEventType.UPDATE});

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    public final String AFAdRevenueData;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1tSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK$AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1rSDK;", "p0", "Lcom/appsflyer/internal/AFe1tSDK;", "getRevenue", "(Lcom/appsflyer/internal/AFh1rSDK;)Lcom/appsflyer/internal/AFe1tSDK;", "", "", "Ljava/util/List;", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public static AFe1tSDK getRevenue(AFh1rSDK p0) {
            String string;
            Object obj;
            String string2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getCurrencyIso4217Code() == AFe1mSDK.CONVERSION) {
                return AFa1tSDK.INSTANCE;
            }
            Integer intOrNull = null;
            if (p0.getCurrencyIso4217Code() != AFe1mSDK.INAPP || !AFe1tSDK.getRevenue.contains(p0.areAllFieldsValid)) {
                return null;
            }
            Map<String, Object> map = p0.getMonetizationNetwork;
            Float floatOrNull = (map == null || (obj = map.get(AFInAppEventParameterName.REVENUE)) == null || (string2 = obj.toString()) == null) ? null : StringsKt.toFloatOrNull(string2);
            Object obj2 = p0.AFAdRevenueData.get("iaecounter");
            if (obj2 != null && (string = obj2.toString()) != null) {
                intOrNull = StringsKt.toIntOrNull(string);
            }
            String str = p0.areAllFieldsValid;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return new AFa1vSDK(str, floatOrNull, intOrNull);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFe1tSDK(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK$AFa1tSDK;", "Lcom/appsflyer/internal/AFe1tSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AFa1tSDK extends AFe1tSDK {
        public static final AFa1tSDK INSTANCE = new AFa1tSDK();

        private AFa1tSDK() {
            super("install");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK$AFa1uSDK;", "Lcom/appsflyer/internal/AFe1tSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AFa1uSDK extends AFe1tSDK {
        public static final AFa1uSDK INSTANCE = new AFa1uSDK();

        private AFa1uSDK() {
            super("af_sandbox_revenue");
        }
    }

    public static final class AFa1vSDK extends AFe1tSDK {
        public final Integer getCurrencyIso4217Code;
        private final String getMonetizationNetwork;
        public final Float getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AFa1vSDK(String str, Float f, Integer num) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            this.getMonetizationNetwork = str;
            this.getRevenue = f;
            this.getCurrencyIso4217Code = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Intrinsics.areEqual(this.getMonetizationNetwork, aFa1vSDK.getMonetizationNetwork) && Intrinsics.areEqual((Object) this.getRevenue, (Object) aFa1vSDK.getRevenue) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFa1vSDK.getCurrencyIso4217Code);
        }

        public final int hashCode() {
            int iHashCode = this.getMonetizationNetwork.hashCode() * 31;
            Float f = this.getRevenue;
            int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.getCurrencyIso4217Code;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "PredefinedInAppEvent(name=" + this.getMonetizationNetwork + ", eventRevenue=" + this.getRevenue + ", eventCounter=" + this.getCurrencyIso4217Code + ")";
        }
    }
}
