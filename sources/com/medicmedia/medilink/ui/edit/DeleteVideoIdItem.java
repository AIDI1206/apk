package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsDeleteListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/DeleteVideoIdItem;", "", "courseId", "", "chapterId", "categoryId", "<init>", "(IILjava/lang/Integer;)V", "getCourseId", "()I", "getChapterId", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "hasCategory", "", "getHasCategory", "()Z", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/medicmedia/medilink/ui/edit/DeleteVideoIdItem;", "equals", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DeleteVideoIdItem {
    public static final int $stable = 0;
    private final Integer categoryId;
    private final int chapterId;
    private final int courseId;

    public static /* synthetic */ DeleteVideoIdItem copy$default(DeleteVideoIdItem deleteVideoIdItem, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deleteVideoIdItem.courseId;
        }
        if ((i3 & 2) != 0) {
            i2 = deleteVideoIdItem.chapterId;
        }
        if ((i3 & 4) != 0) {
            num = deleteVideoIdItem.categoryId;
        }
        return deleteVideoIdItem.copy(i, i2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final DeleteVideoIdItem copy(int courseId, int chapterId, Integer categoryId) {
        return new DeleteVideoIdItem(courseId, chapterId, categoryId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteVideoIdItem)) {
            return false;
        }
        DeleteVideoIdItem deleteVideoIdItem = (DeleteVideoIdItem) other;
        return this.courseId == deleteVideoIdItem.courseId && this.chapterId == deleteVideoIdItem.chapterId && Intrinsics.areEqual(this.categoryId, deleteVideoIdItem.categoryId);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.chapterId)) * 31;
        Integer num = this.categoryId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "DeleteVideoIdItem(courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", categoryId=" + this.categoryId + ")";
    }

    public DeleteVideoIdItem(int i, int i2, Integer num) {
        this.courseId = i;
        this.chapterId = i2;
        this.categoryId = num;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final boolean getHasCategory() {
        Integer num = this.categoryId;
        if (num != null) {
            return num == null || num.intValue() != 0;
        }
        return false;
    }
}
