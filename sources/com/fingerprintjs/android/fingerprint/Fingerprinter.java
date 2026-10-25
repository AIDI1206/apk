package com.fingerprintjs.android.fingerprint;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.tools.DummyResults;
import com.fingerprintjs.android.fingerprint.tools.ResultExtensionsKt;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import com.fingerprintjs.android.fingerprint.tools.logs.Logger;
import com.fingerprintjs.android.fingerprint.tools.logs.MessagesKt;
import com.fingerprintjs.android.fingerprint.tools.threading.AnotherThreadKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.medicmedia.medilink.domain.model.WorkerKey;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Fingerprinter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002)*B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0082\bJ\u001c\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012J8\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J&\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J$\u0010\u0016\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007J\n\u0010 \u001a\u0004\u0018\u00010!H\u0007J\\\u0010\"\u001a\u00020\u000f\"\u0004\b\u0000\u0010#2\u0014\b\u0004\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0\u00122\u0014\b\u0004\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u00020\u000f0\u00122\u001f\b\u0004\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\t0\u0012¢\u0006\u0002\b(H\u0082\bR'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8BX\u0082\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter;", "", "implFactory", "Lkotlin/Function0;", "Lcom/fingerprintjs/android/fingerprint/FingerprinterImpl;", "isLegacyFactory", "", "(Lkotlin/jvm/functions/Function0;Z)V", "impl", "Lkotlin/Result;", "getImpl-d1pmJ48", "()Ljava/lang/Object;", "impl$delegate", "Lkotlin/Lazy;", "checkThisLegacyMethodSupported", "", "getDeviceId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", WorkerKey.KEY_VERSION, "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getFingerprint", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "", "Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "fingerprintingSignals", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "getFingerprintingSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "runFingerprinterImplOnAnotherThread", ExifInterface.GPS_DIRECTION_TRUE, "onError", "", "onSuccess", NotificationCompat.CATEGORY_CALL, "Lkotlin/ExtensionFunctionType;", "LegacyArgs", "Version", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Fingerprinter {

    /* JADX INFO: renamed from: impl$delegate, reason: from kotlin metadata */
    private final Lazy impl;
    private final Function0<FingerprinterImpl> implFactory;
    private final boolean isLegacyFactory;

    public final String getFingerprint(List<? extends FingerprintingSignal<?>> fingerprintingSignals) {
        Intrinsics.checkNotNullParameter(fingerprintingSignals, "fingerprintingSignals");
        return getFingerprint$default(this, fingerprintingSignals, (Hasher) null, 2, (Object) null);
    }

    public final void getFingerprint(Version version, StabilityLevel stabilityLevel, Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getFingerprint$default(this, version, stabilityLevel, null, listener, 4, null);
    }

    public final void getFingerprint(Version version, Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getFingerprint$default(this, version, null, null, listener, 6, null);
    }

    @Deprecated(message = "\n        This method is deprecated in favor of getFingerprint(version,stabilityLevel, hasher, listener)\n        overload. Check out method doc for details.\n        ")
    public final void getFingerprint(Function1<? super FingerprintResult, Unit> listener) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getFingerprint$default(this, (StabilityLevel) null, listener, 1, (Object) null);
    }

    public Fingerprinter(Function0<FingerprinterImpl> implFactory, boolean z) {
        Intrinsics.checkNotNullParameter(implFactory, "implFactory");
        this.implFactory = implFactory;
        this.isLegacyFactory = z;
        this.impl = LazyKt.lazy(new Function0<Result<? extends FingerprinterImpl>>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$impl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Result<? extends FingerprinterImpl> invoke() {
                return Result.m11498boximpl(m9391invoked1pmJ48());
            }

            /* JADX INFO: renamed from: invoke-d1pmJ48, reason: not valid java name */
            public final Object m9391invoked1pmJ48() {
                Fingerprinter fingerprinter = this.this$0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m11499constructorimpl((FingerprinterImpl) fingerprinter.implFactory.invoke());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11499constructorimpl(ResultKt.createFailure(th));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getImpl-d1pmJ48, reason: not valid java name */
    public final Object m9390getImpld1pmJ48() {
        return ((Result) this.impl.getValue()).getValue();
    }

    public static /* synthetic */ void getFingerprint$default(Fingerprinter fingerprinter, StabilityLevel stabilityLevel, Function1 function1, int i, Object obj) throws IllegalStateException {
        if ((i & 1) != 0) {
            stabilityLevel = StabilityLevel.OPTIMAL;
        }
        fingerprinter.getFingerprint(stabilityLevel, (Function1<? super FingerprintResult, Unit>) function1);
    }

    public static /* synthetic */ void getFingerprint$default(Fingerprinter fingerprinter, Version version, StabilityLevel stabilityLevel, Hasher hasher, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            stabilityLevel = StabilityLevel.OPTIMAL;
        }
        if ((i & 4) != 0) {
            hasher = new MurMur3x64x128Hasher();
        }
        fingerprinter.getFingerprint(version, stabilityLevel, hasher, function1);
    }

    public static /* synthetic */ String getFingerprint$default(Fingerprinter fingerprinter, List list, Hasher hasher, int i, Object obj) {
        if ((i & 2) != 0) {
            hasher = new MurMur3x64x128Hasher();
        }
        return fingerprinter.getFingerprint((List<? extends FingerprintingSignal<?>>) list, hasher);
    }

    public final String getFingerprint(List<? extends FingerprintingSignal<?>> fingerprintingSignals, Hasher hasher) {
        Object objM11499constructorimpl;
        Intrinsics.checkNotNullParameter(fingerprintingSignals, "fingerprintingSignals");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        Object objM9390getImpld1pmJ48 = m9390getImpld1pmJ48();
        if (Result.m11506isSuccessimpl(objM9390getImpld1pmJ48)) {
            Result.Companion companion = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(Result.m11498boximpl(((FingerprinterImpl) objM9390getImpld1pmJ48).m9396getFingerprintgIAlus(fingerprintingSignals, hasher)));
        } else {
            objM11499constructorimpl = Result.m11499constructorimpl(objM9390getImpld1pmJ48);
        }
        Object objFlatten = ResultExtensionsKt.flatten(objM11499constructorimpl);
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(objFlatten);
        if (thM11502exceptionOrNullimpl != null) {
            MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl);
        }
        if (Result.m11505isFailureimpl(objFlatten)) {
            objFlatten = "";
        }
        return (String) objFlatten;
    }

    public final FingerprintingSignalsProvider getFingerprintingSignalsProvider() {
        Object objM9390getImpld1pmJ48 = m9390getImpld1pmJ48();
        if (Result.m11506isSuccessimpl(objM9390getImpld1pmJ48)) {
            Result.Companion companion = Result.INSTANCE;
            objM9390getImpld1pmJ48 = ((FingerprinterImpl) objM9390getImpld1pmJ48).getFpSignalsProvider();
        }
        Object objM11499constructorimpl = Result.m11499constructorimpl(objM9390getImpld1pmJ48);
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(objM11499constructorimpl);
        if (thM11502exceptionOrNullimpl != null) {
            MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl);
        }
        if (Result.m11505isFailureimpl(objM11499constructorimpl)) {
            objM11499constructorimpl = null;
        }
        return (FingerprintingSignalsProvider) objM11499constructorimpl;
    }

    private final void checkThisLegacyMethodSupported() {
        if (!this.isLegacyFactory) {
            throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
        }
    }

    private final <T> void runFingerprinterImplOnAnotherThread(final Function1<? super Throwable, Unit> onError, final Function1<? super T, Unit> onSuccess, final Function1<? super FingerprinterImpl, ? extends Result<? extends T>> call) {
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter.runFingerprinterImplOnAnotherThread.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object objM9390getImpld1pmJ48 = Fingerprinter.this.m9390getImpld1pmJ48();
                Function1<FingerprinterImpl, Result<T>> function1 = call;
                if (Result.m11506isSuccessimpl(objM9390getImpld1pmJ48)) {
                    Result.Companion companion = Result.INSTANCE;
                    objM9390getImpld1pmJ48 = Result.m11498boximpl(((Result) function1.invoke((FingerprinterImpl) objM9390getImpld1pmJ48)).getValue());
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.m11499constructorimpl(objM9390getImpld1pmJ48));
                Function1<T, Unit> function2 = onSuccess;
                Function1<Throwable, Unit> function3 = onError;
                Throwable thM11502exceptionOrNullimpl2 = Result.m11502exceptionOrNullimpl(objFlatten);
                if (thM11502exceptionOrNullimpl2 != null) {
                    function3.invoke(thM11502exceptionOrNullimpl2);
                } else {
                    function2.invoke((T) objFlatten);
                }
            }
        }));
        if (thM11502exceptionOrNullimpl != null) {
            onError.invoke(thM11502exceptionOrNullimpl);
        }
    }

    /* JADX INFO: compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "", "intValue", "", "(Ljava/lang/String;II)V", "getIntValue$fingerprint_release", "()I", "V_1", "V_2", "V_3", "V_4", "V_5", "V_6", "Companion", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum Version {
        V_1(1),
        V_2(2),
        V_3(3),
        V_4(4),
        V_5(5),
        V_6(6);

        private final int intValue;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public static EnumEntries<Version> getEntries() {
            return $ENTRIES;
        }

        Version(int i) {
            this.intValue = i;
        }

        /* JADX INFO: renamed from: getIntValue$fingerprint_release, reason: from getter */
        public final int getIntValue() {
            return this.intValue;
        }

        /* JADX INFO: compiled from: Fingerprinter.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version$Companion;", "", "()V", "fingerprintingFlattenedSignalsFirstVersion", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release", "()Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "fingerprintingGroupedSignalsLastVersion", "getFingerprintingGroupedSignalsLastVersion$fingerprint_release", "latest", "getLatest", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Version getLatest() {
                return (Version) ArraysKt.last(Version.values());
            }

            public final Version getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release() {
                return Version.V_5;
            }

            public final Version getFingerprintingGroupedSignalsLastVersion$fingerprint_release() {
                return Version.V_4;
            }
        }
    }

    /* JADX INFO: compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter$LegacyArgs;", "", "hardwareSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "osBuildSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "deviceIdProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "installedAppsSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "deviceStateSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "configuration", "Lcom/fingerprintjs/android/fingerprint/Configuration;", "(Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/Configuration;)V", "getConfiguration", "()Lcom/fingerprintjs/android/fingerprint/Configuration;", "getDeviceIdProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "getDeviceStateSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "getHardwareSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "getInstalledAppsSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "getOsBuildSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class LegacyArgs {
        private final Configuration configuration;
        private final DeviceIdProvider deviceIdProvider;
        private final DeviceStateSignalGroupProvider deviceStateSignalProvider;
        private final HardwareSignalGroupProvider hardwareSignalProvider;
        private final InstalledAppsSignalGroupProvider installedAppsSignalProvider;
        private final OsBuildSignalGroupProvider osBuildSignalProvider;

        public static /* synthetic */ LegacyArgs copy$default(LegacyArgs legacyArgs, HardwareSignalGroupProvider hardwareSignalGroupProvider, OsBuildSignalGroupProvider osBuildSignalGroupProvider, DeviceIdProvider deviceIdProvider, InstalledAppsSignalGroupProvider installedAppsSignalGroupProvider, DeviceStateSignalGroupProvider deviceStateSignalGroupProvider, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                hardwareSignalGroupProvider = legacyArgs.hardwareSignalProvider;
            }
            if ((i & 2) != 0) {
                osBuildSignalGroupProvider = legacyArgs.osBuildSignalProvider;
            }
            if ((i & 4) != 0) {
                deviceIdProvider = legacyArgs.deviceIdProvider;
            }
            if ((i & 8) != 0) {
                installedAppsSignalGroupProvider = legacyArgs.installedAppsSignalProvider;
            }
            if ((i & 16) != 0) {
                deviceStateSignalGroupProvider = legacyArgs.deviceStateSignalProvider;
            }
            if ((i & 32) != 0) {
                configuration = legacyArgs.configuration;
            }
            DeviceStateSignalGroupProvider deviceStateSignalGroupProvider2 = deviceStateSignalGroupProvider;
            Configuration configuration2 = configuration;
            return legacyArgs.copy(hardwareSignalGroupProvider, osBuildSignalGroupProvider, deviceIdProvider, installedAppsSignalGroupProvider, deviceStateSignalGroupProvider2, configuration2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HardwareSignalGroupProvider getHardwareSignalProvider() {
            return this.hardwareSignalProvider;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OsBuildSignalGroupProvider getOsBuildSignalProvider() {
            return this.osBuildSignalProvider;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DeviceIdProvider getDeviceIdProvider() {
            return this.deviceIdProvider;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final InstalledAppsSignalGroupProvider getInstalledAppsSignalProvider() {
            return this.installedAppsSignalProvider;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final DeviceStateSignalGroupProvider getDeviceStateSignalProvider() {
            return this.deviceStateSignalProvider;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final LegacyArgs copy(HardwareSignalGroupProvider hardwareSignalProvider, OsBuildSignalGroupProvider osBuildSignalProvider, DeviceIdProvider deviceIdProvider, InstalledAppsSignalGroupProvider installedAppsSignalProvider, DeviceStateSignalGroupProvider deviceStateSignalProvider, Configuration configuration) {
            Intrinsics.checkNotNullParameter(hardwareSignalProvider, "hardwareSignalProvider");
            Intrinsics.checkNotNullParameter(osBuildSignalProvider, "osBuildSignalProvider");
            Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
            Intrinsics.checkNotNullParameter(installedAppsSignalProvider, "installedAppsSignalProvider");
            Intrinsics.checkNotNullParameter(deviceStateSignalProvider, "deviceStateSignalProvider");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new LegacyArgs(hardwareSignalProvider, osBuildSignalProvider, deviceIdProvider, installedAppsSignalProvider, deviceStateSignalProvider, configuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegacyArgs)) {
                return false;
            }
            LegacyArgs legacyArgs = (LegacyArgs) other;
            return Intrinsics.areEqual(this.hardwareSignalProvider, legacyArgs.hardwareSignalProvider) && Intrinsics.areEqual(this.osBuildSignalProvider, legacyArgs.osBuildSignalProvider) && Intrinsics.areEqual(this.deviceIdProvider, legacyArgs.deviceIdProvider) && Intrinsics.areEqual(this.installedAppsSignalProvider, legacyArgs.installedAppsSignalProvider) && Intrinsics.areEqual(this.deviceStateSignalProvider, legacyArgs.deviceStateSignalProvider) && Intrinsics.areEqual(this.configuration, legacyArgs.configuration);
        }

        public int hashCode() {
            return (((((((((this.hardwareSignalProvider.hashCode() * 31) + this.osBuildSignalProvider.hashCode()) * 31) + this.deviceIdProvider.hashCode()) * 31) + this.installedAppsSignalProvider.hashCode()) * 31) + this.deviceStateSignalProvider.hashCode()) * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "LegacyArgs(hardwareSignalProvider=" + this.hardwareSignalProvider + ", osBuildSignalProvider=" + this.osBuildSignalProvider + ", deviceIdProvider=" + this.deviceIdProvider + ", installedAppsSignalProvider=" + this.installedAppsSignalProvider + ", deviceStateSignalProvider=" + this.deviceStateSignalProvider + ", configuration=" + this.configuration + ')';
        }

        public LegacyArgs(HardwareSignalGroupProvider hardwareSignalProvider, OsBuildSignalGroupProvider osBuildSignalProvider, DeviceIdProvider deviceIdProvider, InstalledAppsSignalGroupProvider installedAppsSignalProvider, DeviceStateSignalGroupProvider deviceStateSignalProvider, Configuration configuration) {
            Intrinsics.checkNotNullParameter(hardwareSignalProvider, "hardwareSignalProvider");
            Intrinsics.checkNotNullParameter(osBuildSignalProvider, "osBuildSignalProvider");
            Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
            Intrinsics.checkNotNullParameter(installedAppsSignalProvider, "installedAppsSignalProvider");
            Intrinsics.checkNotNullParameter(deviceStateSignalProvider, "deviceStateSignalProvider");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.hardwareSignalProvider = hardwareSignalProvider;
            this.osBuildSignalProvider = osBuildSignalProvider;
            this.deviceIdProvider = deviceIdProvider;
            this.installedAppsSignalProvider = installedAppsSignalProvider;
            this.deviceStateSignalProvider = deviceStateSignalProvider;
            this.configuration = configuration;
        }

        public final HardwareSignalGroupProvider getHardwareSignalProvider() {
            return this.hardwareSignalProvider;
        }

        public final OsBuildSignalGroupProvider getOsBuildSignalProvider() {
            return this.osBuildSignalProvider;
        }

        public final DeviceIdProvider getDeviceIdProvider() {
            return this.deviceIdProvider;
        }

        public final InstalledAppsSignalGroupProvider getInstalledAppsSignalProvider() {
            return this.installedAppsSignalProvider;
        }

        public final DeviceStateSignalGroupProvider getDeviceStateSignalProvider() {
            return this.deviceStateSignalProvider;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }
    }

    @Deprecated(message = "\n        This method has been deprecated in favor of getDeviceId(version, listener) overload. Check out method doc for details.\n    ")
    public final void getDeviceId(final Function1<? super DeviceIdResult, Unit> listener) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.isLegacyFactory) {
            throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
        }
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object objM9390getImpld1pmJ48 = this.this$0.m9390getImpld1pmJ48();
                if (Result.m11506isSuccessimpl(objM9390getImpld1pmJ48)) {
                    Result.Companion companion = Result.INSTANCE;
                    objM9390getImpld1pmJ48 = Result.m11498boximpl(((FingerprinterImpl) objM9390getImpld1pmJ48).m9393getDeviceIdd1pmJ48());
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.m11499constructorimpl(objM9390getImpld1pmJ48));
                Function1 function1 = listener;
                Throwable thM11502exceptionOrNullimpl2 = Result.m11502exceptionOrNullimpl(objFlatten);
                if (thM11502exceptionOrNullimpl2 == null) {
                    function1.invoke(objFlatten);
                } else {
                    listener.invoke(DummyResults.INSTANCE.getDeviceIdResult());
                    MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl2);
                }
            }
        }));
        if (thM11502exceptionOrNullimpl != null) {
            listener.invoke(DummyResults.INSTANCE.getDeviceIdResult());
            MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl);
        }
    }

    public final void getDeviceId(final Version version, final Function1<? super DeviceIdResult, Unit> listener) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object objM9390getImpld1pmJ48 = this.this$0.m9390getImpld1pmJ48();
                if (Result.m11506isSuccessimpl(objM9390getImpld1pmJ48)) {
                    Result.Companion companion = Result.INSTANCE;
                    objM9390getImpld1pmJ48 = Result.m11498boximpl(((FingerprinterImpl) objM9390getImpld1pmJ48).m9392getDeviceIdIoAF18A(version));
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.m11499constructorimpl(objM9390getImpld1pmJ48));
                Function1 function1 = listener;
                Throwable thM11502exceptionOrNullimpl2 = Result.m11502exceptionOrNullimpl(objFlatten);
                if (thM11502exceptionOrNullimpl2 == null) {
                    function1.invoke(objFlatten);
                } else {
                    listener.invoke(DummyResults.INSTANCE.getDeviceIdResult());
                    MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl2);
                }
            }
        }));
        if (thM11502exceptionOrNullimpl != null) {
            listener.invoke(DummyResults.INSTANCE.getDeviceIdResult());
            MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl);
        }
    }

    @Deprecated(message = "\n        This method is deprecated in favor of getFingerprint(version,stabilityLevel, hasher, listener)\n        overload. Check out method doc for details.\n        ")
    public final void getFingerprint(final StabilityLevel stabilityLevel, final Function1<? super FingerprintResult, Unit> listener) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.isLegacyFactory) {
            throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
        }
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object objM9390getImpld1pmJ48 = this.this$0.m9390getImpld1pmJ48();
                if (Result.m11506isSuccessimpl(objM9390getImpld1pmJ48)) {
                    Result.Companion companion = Result.INSTANCE;
                    objM9390getImpld1pmJ48 = Result.m11498boximpl(((FingerprinterImpl) objM9390getImpld1pmJ48).m9395getFingerprintIoAF18A(stabilityLevel));
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.m11499constructorimpl(objM9390getImpld1pmJ48));
                Function1 function1 = listener;
                Throwable thM11502exceptionOrNullimpl2 = Result.m11502exceptionOrNullimpl(objFlatten);
                if (thM11502exceptionOrNullimpl2 == null) {
                    function1.invoke(objFlatten);
                } else {
                    listener.invoke(DummyResults.INSTANCE.getFingerprintResult());
                    MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl2);
                }
            }
        }));
        if (thM11502exceptionOrNullimpl != null) {
            listener.invoke(DummyResults.INSTANCE.getFingerprintResult());
            MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl);
        }
    }

    public final void getFingerprint(final Version version, final StabilityLevel stabilityLevel, final Hasher hasher, final Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object objM9390getImpld1pmJ48 = this.this$0.m9390getImpld1pmJ48();
                if (Result.m11506isSuccessimpl(objM9390getImpld1pmJ48)) {
                    Result.Companion companion = Result.INSTANCE;
                    objM9390getImpld1pmJ48 = Result.m11498boximpl(((FingerprinterImpl) objM9390getImpld1pmJ48).m9394getFingerprint0E7RQCE(version, stabilityLevel, hasher));
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.m11499constructorimpl(objM9390getImpld1pmJ48));
                Function1 function1 = listener;
                Throwable thM11502exceptionOrNullimpl2 = Result.m11502exceptionOrNullimpl(objFlatten);
                if (thM11502exceptionOrNullimpl2 == null) {
                    function1.invoke(objFlatten);
                } else {
                    listener.invoke("");
                    MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl2);
                }
            }
        }));
        if (thM11502exceptionOrNullimpl != null) {
            listener.invoke("");
            MessagesKt.ePleaseReport(Logger.INSTANCE, thM11502exceptionOrNullimpl);
        }
    }
}
