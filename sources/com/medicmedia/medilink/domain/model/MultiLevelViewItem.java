package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MultiLevelViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", "", "id", "", FirebaseAnalytics.Param.LEVEL, "", "<init>", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getLevel", "()I", "_children", "", "children", "", "getChildren", "()Ljava/util/List;", "hasChildren", "", "getHasChildren", "()Z", "addChildren", "", FirebaseAnalytics.Param.ITEMS, "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public class MultiLevelViewItem {
    private List<MultiLevelViewItem> _children;
    private final String id;
    private final int level;

    public MultiLevelViewItem(String id, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.level = i;
        this._children = new ArrayList();
    }

    public String getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public final List<MultiLevelViewItem> getChildren() {
        return this._children;
    }

    public final boolean getHasChildren() {
        return !this._children.isEmpty();
    }

    public final void addChildren(List<? extends MultiLevelViewItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this._children.addAll(items);
    }
}
