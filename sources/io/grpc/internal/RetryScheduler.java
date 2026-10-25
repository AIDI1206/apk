package io.grpc.internal;

/* JADX INFO: loaded from: classes6.dex */
public interface RetryScheduler {
    void reset();

    void schedule(Runnable runnable);
}
