package com.medicmedia.medilink.domain.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RecyclerViewItem {
    private List<RecyclerViewItem> children;
    private boolean expanded = false;
    private int level;
    private int position;

    public boolean isExpanded() {
        return this.expanded;
    }

    public void setExpanded(boolean z) {
        this.expanded = z;
    }

    protected RecyclerViewItem(int i) {
        this.level = i;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public int getLevel() {
        return this.level;
    }

    public List<RecyclerViewItem> getChildren() {
        List<RecyclerViewItem> list = this.children;
        return list != null ? list : new ArrayList();
    }

    public void addChildren(List<RecyclerViewItem> list) {
        this.children = list;
    }

    public boolean hasChildren() {
        List<RecyclerViewItem> list = this.children;
        return list != null && list.size() > 0;
    }
}
