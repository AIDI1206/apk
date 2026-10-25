package io.grpc.stub;

/* JADX INFO: loaded from: classes6.dex */
public interface StreamObserver<V> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(V v);
}
