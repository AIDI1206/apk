package com.medicmedia.medilink.multilevelview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.medicmedia.medilink.domain.model.RecyclerViewItem;
import com.medicmedia.medilink.multilevelview.animators.DefaultItemAnimator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MultiLevelRecyclerView extends RecyclerView implements OnRecyclerItemClickListener {
    public static final String TAG = "com.medicmedia.medilink.multilevelview.MultiLevelRecyclerView";
    private boolean accordion;
    private boolean isExpanded;
    private boolean isToggleItemOnClick;
    public boolean is_enable_inter_cept;
    Context mContext;
    private MultiLevelAdapter mMultiLevelAdapter;
    private int numberOfItemsAdded;
    private OnRecyclerItemClickListener onRecyclerItemClickListener;
    private int prevClickedPosition;
    private RecyclerItemClickListener recyclerItemClickListener;

    public void setAccordion(boolean z) {
        this.accordion = z;
    }

    public void setOnItemClick(OnRecyclerItemClickListener onRecyclerItemClickListener) {
        this.onRecyclerItemClickListener = onRecyclerItemClickListener;
    }

    public void setToggleItemOnClick(boolean z) {
        this.isToggleItemOnClick = z;
    }

    public MultiLevelRecyclerView(Context context) {
        super(context);
        this.isExpanded = false;
        this.accordion = false;
        this.prevClickedPosition = -1;
        this.numberOfItemsAdded = 0;
        this.isToggleItemOnClick = true;
        this.is_enable_inter_cept = true;
        this.mContext = context;
        setUp(context);
    }

    public MultiLevelRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isExpanded = false;
        this.accordion = false;
        this.prevClickedPosition = -1;
        this.numberOfItemsAdded = 0;
        this.isToggleItemOnClick = true;
        this.is_enable_inter_cept = true;
        setUp(context);
    }

    public MultiLevelRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isExpanded = false;
        this.accordion = false;
        this.prevClickedPosition = -1;
        this.numberOfItemsAdded = 0;
        this.isToggleItemOnClick = true;
        this.is_enable_inter_cept = true;
        setUp(context);
    }

    private void setUp(Context context) {
        RecyclerItemClickListener recyclerItemClickListener = new RecyclerItemClickListener(context);
        this.recyclerItemClickListener = recyclerItemClickListener;
        recyclerItemClickListener.setOnItemClick(this);
        addOnItemTouchListener(this.recyclerItemClickListener);
        setItemAnimator(new DefaultItemAnimator());
    }

    public void removeItemClickListeners() {
        RecyclerItemClickListener recyclerItemClickListener = this.recyclerItemClickListener;
        if (recyclerItemClickListener != null) {
            removeOnItemTouchListener(recyclerItemClickListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        super.setItemAnimator(itemAnimator);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (!(adapter instanceof MultiLevelAdapter)) {
            throw new IllegalStateException("Please Set Adapter Of the MultiLevelAdapter Class.");
        }
        this.mMultiLevelAdapter = (MultiLevelAdapter) adapter;
        super.setAdapter(adapter);
    }

    public void removeAllChildren(List<RecyclerViewItem> list) {
        for (RecyclerViewItem recyclerViewItem : list) {
            if (recyclerViewItem.isExpanded()) {
                recyclerViewItem.setExpanded(false);
                removeAllChildren(recyclerViewItem.getChildren());
                removePrevItems(this.mMultiLevelAdapter.getRecyclerViewItemList(), recyclerViewItem.getPosition(), recyclerViewItem.getChildren().size());
            }
        }
    }

    public int getExpandedPosition(int i) {
        List<RecyclerViewItem> recyclerViewItemList = this.mMultiLevelAdapter.getRecyclerViewItemList();
        for (RecyclerViewItem recyclerViewItem : recyclerViewItemList) {
            if (i == recyclerViewItem.getLevel() && recyclerViewItem.isExpanded()) {
                return recyclerViewItemList.indexOf(recyclerViewItem);
            }
        }
        return -1;
    }

    private int getItemsToBeRemoved(int i) {
        Iterator<RecyclerViewItem> it = this.mMultiLevelAdapter.getRecyclerViewItemList().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (i < it.next().getLevel()) {
                i2++;
            }
        }
        return i2;
    }

    public void openTill(int... iArr) {
        List<RecyclerViewItem> recyclerViewItemList;
        MultiLevelAdapter multiLevelAdapter = this.mMultiLevelAdapter;
        if (multiLevelAdapter == null || (recyclerViewItemList = multiLevelAdapter.getRecyclerViewItemList()) == null || iArr.length <= 0) {
            return;
        }
        int size = recyclerViewItemList.size();
        int i = -1;
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
            if (i2 > i && i2 < size) {
                addItems(recyclerViewItemList.get(i2), recyclerViewItemList, i2);
                if (recyclerViewItemList.get(i2).getChildren() == null) {
                    return;
                }
                size = recyclerViewItemList.get(i2).getChildren().size();
                i = i2;
                i2++;
            }
        }
    }

    public boolean isOverPosition(int i) {
        return this.mMultiLevelAdapter.getRecyclerViewItemList().size() <= i;
    }

    public void toggleItemsGroup(int i) {
        if (i == -1) {
            return;
        }
        List<RecyclerViewItem> recyclerViewItemList = this.mMultiLevelAdapter.getRecyclerViewItemList();
        RecyclerViewItem recyclerViewItem = recyclerViewItemList.get(i);
        if (this.accordion) {
            if (recyclerViewItem.isExpanded()) {
                recyclerViewItem.setExpanded(false);
                removeAllChildren(recyclerViewItem.getChildren());
                removePrevItems(recyclerViewItemList, i, recyclerViewItem.getChildren().size());
                this.prevClickedPosition = -1;
                this.numberOfItemsAdded = 0;
                return;
            }
            int expandedPosition = getExpandedPosition(recyclerViewItem.getLevel());
            int itemsToBeRemoved = getItemsToBeRemoved(recyclerViewItem.getLevel());
            if (expandedPosition != -1) {
                removePrevItems(recyclerViewItemList, expandedPosition, itemsToBeRemoved);
                recyclerViewItemList.get(expandedPosition).setExpanded(false);
                if (recyclerViewItem.getPosition() > recyclerViewItemList.get(expandedPosition).getPosition()) {
                    addItems(recyclerViewItem, recyclerViewItemList, i - itemsToBeRemoved);
                    return;
                } else {
                    addItems(recyclerViewItem, recyclerViewItemList, i);
                    return;
                }
            }
            addItems(recyclerViewItem, recyclerViewItemList, i);
            return;
        }
        if (recyclerViewItem.isExpanded()) {
            recyclerViewItem.setExpanded(false);
            removeAllChildren(recyclerViewItem.getChildren());
            removePrevItems(recyclerViewItemList, i, recyclerViewItem.getChildren().size());
            this.prevClickedPosition = -1;
            this.numberOfItemsAdded = 0;
            return;
        }
        if (recyclerViewItem.isExpanded()) {
            removePrevItems(recyclerViewItemList, this.prevClickedPosition, this.numberOfItemsAdded);
            addItems(recyclerViewItem, recyclerViewItemList, recyclerViewItem.getPosition());
        } else {
            addItems(recyclerViewItem, recyclerViewItemList, i);
        }
    }

    @Override // com.medicmedia.medilink.multilevelview.OnRecyclerItemClickListener
    public void onItemClick(View view, RecyclerViewItem recyclerViewItem, int i) {
        if (this.isToggleItemOnClick) {
            toggleItemsGroup(i);
        }
        OnRecyclerItemClickListener onRecyclerItemClickListener = this.onRecyclerItemClickListener;
        if (onRecyclerItemClickListener != null) {
            onRecyclerItemClickListener.onItemClick(view, recyclerViewItem, i);
        }
    }

    private void removePrevItems(List<RecyclerViewItem> list, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                list.remove(i + 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.isExpanded = false;
        this.mMultiLevelAdapter.setRecyclerViewItemList(list);
        this.mMultiLevelAdapter.notifyItemRangeRemoved(i + 1, i2);
        refreshPosition();
    }

    public void refreshPosition() {
        Iterator<RecyclerViewItem> it = this.mMultiLevelAdapter.getRecyclerViewItemList().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().setPosition(i);
            i++;
        }
    }

    public RecyclerViewItem getParentOfItem(RecyclerViewItem recyclerViewItem) {
        try {
            List<RecyclerViewItem> recyclerViewItemList = this.mMultiLevelAdapter.getRecyclerViewItemList();
            if (recyclerViewItem.getLevel() == 1) {
                return recyclerViewItemList.get(recyclerViewItem.getPosition());
            }
            int position = recyclerViewItem.getPosition();
            while (recyclerViewItemList.get(position).getLevel() != recyclerViewItem.getLevel() - 1) {
                position--;
            }
            return recyclerViewItemList.get(position);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    private void addItems(RecyclerViewItem recyclerViewItem, List<RecyclerViewItem> list, int i) {
        if (recyclerViewItem.hasChildren()) {
            this.isExpanded = true;
            this.prevClickedPosition = i;
            int i2 = i + 1;
            list.addAll(i2, recyclerViewItem.getChildren());
            recyclerViewItem.setExpanded(true);
            this.numberOfItemsAdded = recyclerViewItem.getChildren().size();
            this.mMultiLevelAdapter.setRecyclerViewItemList(list);
            this.mMultiLevelAdapter.notifyItemRangeInserted(i2, recyclerViewItem.getChildren().size());
            smoothScrollToPosition(i);
            refreshPosition();
        }
    }

    private final class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
        private GestureDetector mGestureDetector;
        private OnRecyclerItemClickListener onItemClick;

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        void setOnItemClick(OnRecyclerItemClickListener onRecyclerItemClickListener) {
            this.onItemClick = onRecyclerItemClickListener;
        }

        RecyclerItemClickListener(Context context) {
            this.mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.medicmedia.medilink.multilevelview.MultiLevelRecyclerView.RecyclerItemClickListener.1
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onSingleTapUp(MotionEvent motionEvent) {
                    return true;
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            View viewFindChildViewUnder;
            if (!MultiLevelRecyclerView.this.is_enable_inter_cept || (viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null || !this.mGestureDetector.onTouchEvent(motionEvent)) {
                return false;
            }
            viewFindChildViewUnder.performClick();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder);
            Log.e(MultiLevelRecyclerView.TAG, childAdapterPosition + " Clicked On RecyclerView");
            OnRecyclerItemClickListener onRecyclerItemClickListener = this.onItemClick;
            if (onRecyclerItemClickListener != null) {
                onRecyclerItemClickListener.onItemClick(viewFindChildViewUnder, MultiLevelRecyclerView.this.mMultiLevelAdapter.getRecyclerViewItemList().get(childAdapterPosition), childAdapterPosition);
            }
            return MultiLevelRecyclerView.this.isToggleItemOnClick;
        }
    }
}
