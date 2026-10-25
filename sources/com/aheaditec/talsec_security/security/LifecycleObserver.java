package com.aheaditec.talsec_security.security;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes3.dex */
public class LifecycleObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f314a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f315a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f315a = iArr;
            try {
                int iOrdinal = Lifecycle.Event.ON_PAUSE.ordinal();
                int i = (549585449 - ((~("com.aheaditec.talsec_security.security.LifecycleObserver$a".length() & 574795777)) | 549585450)) + (((~"com.aheaditec.talsec_security.security.LifecycleObserver$a".length()) | 1503612350) & 51771409);
                iArr[iOrdinal] = (i | 601356858) - (601356858 & i);
            } catch (NoSuchFieldError unused) {
            }
            try {
                f315a[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void a();

        void b();
    }

    public LifecycleObserver(b bVar) {
        this.f314a = bVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = a.f315a[event.ordinal()];
        if (i == 1) {
            this.f314a.b();
        } else {
            if (i != 2) {
                return;
            }
            this.f314a.a();
        }
    }
}
