package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes4.dex */
final class x extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f402a;

    x(ae aeVar) {
        this.f402a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f402a.g) {
            if (this.f402a.m.get() > 0 && this.f402a.m.decrementAndGet() > 0) {
                this.f402a.c.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            ae aeVar = this.f402a;
            if (aeVar.o != null) {
                aeVar.c.d("Unbind from service.", new Object[0]);
                ae aeVar2 = this.f402a;
                aeVar2.b.unbindService(aeVar2.n);
                this.f402a.h = false;
                this.f402a.o = null;
                this.f402a.n = null;
            }
            this.f402a.x();
        }
    }
}
