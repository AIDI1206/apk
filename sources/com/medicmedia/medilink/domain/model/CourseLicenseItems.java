package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CourseLicenseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/CourseLicenseItems;", "", "courses", "", "Lcom/medicmedia/medilink/domain/model/CourseLicenseItem;", "<init>", "(Ljava/util/List;)V", "getCourses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CourseLicenseItems {
    private final List<CourseLicenseItem> courses;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseLicenseItems copy$default(CourseLicenseItems courseLicenseItems, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = courseLicenseItems.courses;
        }
        return courseLicenseItems.copy(list);
    }

    public final List<CourseLicenseItem> component1() {
        return this.courses;
    }

    public final CourseLicenseItems copy(List<CourseLicenseItem> courses) {
        Intrinsics.checkNotNullParameter(courses, "courses");
        return new CourseLicenseItems(courses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CourseLicenseItems) && Intrinsics.areEqual(this.courses, ((CourseLicenseItems) other).courses);
    }

    public int hashCode() {
        return this.courses.hashCode();
    }

    public String toString() {
        return "CourseLicenseItems(courses=" + this.courses + ")";
    }

    public CourseLicenseItems(List<CourseLicenseItem> courses) {
        Intrinsics.checkNotNullParameter(courses, "courses");
        this.courses = courses;
    }

    public final List<CourseLicenseItem> getCourses() {
        return this.courses;
    }
}
