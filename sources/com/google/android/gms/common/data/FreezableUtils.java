package com.google.android.gms.common.data;

import com.facebook.stetho.common.ArrayListAccumulator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        ArrayListAccumulator arrayListAccumulator = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayListAccumulator.add(arrayList.get(i).freeze());
        }
        return arrayListAccumulator;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        ArrayListAccumulator arrayListAccumulator = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            arrayListAccumulator.add(it.next().freeze());
        }
        return arrayListAccumulator;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        ArrayListAccumulator arrayListAccumulator = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            arrayListAccumulator.add(e.freeze());
        }
        return arrayListAccumulator;
    }
}
