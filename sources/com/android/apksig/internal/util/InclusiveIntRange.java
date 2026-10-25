package com.android.apksig.internal.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InclusiveIntRange {
    private final int max;
    private final int min;

    private InclusiveIntRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public static InclusiveIntRange fromTo(int min, int max) {
        return new InclusiveIntRange(min, max);
    }

    public static InclusiveIntRange from(int min) {
        return new InclusiveIntRange(min, Integer.MAX_VALUE);
    }

    public List<InclusiveIntRange> getValuesNotIn(List<InclusiveIntRange> sortedNonOverlappingRanges) {
        if (sortedNonOverlappingRanges.isEmpty()) {
            return Collections.singletonList(this);
        }
        int i = this.min;
        ArrayList arrayList = null;
        for (InclusiveIntRange inclusiveIntRange : sortedNonOverlappingRanges) {
            int i2 = inclusiveIntRange.max;
            if (i <= i2) {
                int i3 = inclusiveIntRange.min;
                if (i < i3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fromTo(i, i3 - 1));
                }
                if (i2 >= this.max) {
                    return arrayList != null ? arrayList : Collections.emptyList();
                }
                i = i2 + 1;
            }
        }
        if (i <= this.max) {
            if (arrayList == null) {
                arrayList = new ArrayList(1);
            }
            arrayList.add(fromTo(i, this.max));
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    public String toString() {
        return "[" + this.min + ", " + (this.max < Integer.MAX_VALUE ? this.max + "]" : "∞)");
    }
}
