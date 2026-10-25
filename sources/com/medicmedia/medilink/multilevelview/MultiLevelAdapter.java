package com.medicmedia.medilink.multilevelview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.medicmedia.medilink.domain.model.RecyclerViewItem;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MultiLevelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<RecyclerViewItem> recyclerViewItemList;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public abstract void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLevelAdapter(List<?> list) {
        this.recyclerViewItemList = list;
    }

    public void setRecyclerViewItemList(List<RecyclerViewItem> list) {
        this.recyclerViewItemList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.recyclerViewItemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.recyclerViewItemList.get(i).getLevel();
    }

    List<RecyclerViewItem> getRecyclerViewItemList() {
        return this.recyclerViewItemList;
    }
}
