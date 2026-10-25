package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes4.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f364a;
    final /* synthetic */ bn b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.b = bnVar;
        this.f364a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) throws RemoteException {
        this.b.f366a.v(this.f364a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) throws RemoteException {
        this.b.f366a.v(this.f364a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) throws RemoteException {
        this.b.f366a.v(this.f364a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) throws RemoteException {
        this.b.f366a.v(this.f364a);
    }
}
