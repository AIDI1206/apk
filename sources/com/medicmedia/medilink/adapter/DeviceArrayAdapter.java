package com.medicmedia.medilink.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.medicmedia.medilink.R;
import com.medicmedia.medilink.domain.model.DeviceItem;
import com.medicmedia.medilink.models.event.DataAdapterEvent;
import com.medicmedia.medilink.util.ItemClickListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceArrayAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final ArrayList<DeviceItem> adapterData;
    private Context context;
    private final Consumer<DataAdapterEvent> eventConsumer;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DeviceArrayAdapter(Context context, ArrayList<DeviceItem> arrayList, Consumer<DataAdapterEvent> consumer) {
        this.context = context;
        this.adapterData = arrayList;
        this.eventConsumer = consumer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_device, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.adapterData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final DeviceItem deviceItem = this.adapterData.get(i);
        try {
            String deviceName = deviceItem.getDeviceName();
            if (deviceName == null) {
                deviceName = this.context.getString(R.string.device_list_unknown_device);
            }
            viewHolder.deviceName.setText(deviceName);
            viewHolder.deviceDate.setText(new SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.JAPAN).format(deviceItem.getDate()));
            viewHolder.key = deviceItem.getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
        viewHolder.setClickListener(new ItemClickListener() { // from class: com.medicmedia.medilink.adapter.DeviceArrayAdapter$$ExternalSyntheticLambda0
            @Override // com.medicmedia.medilink.util.ItemClickListener
            public final void onClick(View view, int i2, boolean z) {
                this.f$0.m10044x91848e4b(deviceItem, view, i2, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$0$com-medicmedia-medilink-adapter-DeviceArrayAdapter, reason: not valid java name */
    /* synthetic */ void m10044x91848e4b(DeviceItem deviceItem, View view, int i, boolean z) {
        this.eventConsumer.accept(new DataAdapterEvent.SelectedDeviceItem(deviceItem));
    }

    public void delete(DeviceItem deviceItem) {
        int iIndexOf = this.adapterData.indexOf(deviceItem);
        if (iIndexOf >= 0) {
            this.adapterData.remove(iIndexOf);
            notifyItemRemoved(iIndexOf);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        private ItemClickListener clickListener;
        public TextView deviceDate;
        public TextView deviceName;
        public String key;

        public ViewHolder(View view) {
            super(view);
            this.deviceName = (TextView) view.findViewById(R.id.deviceName);
            this.deviceDate = (TextView) view.findViewById(R.id.deviceDate);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
        }

        public void setClickListener(ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.clickListener.onClick(view, getLayoutPosition(), false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.clickListener.onClick(view, getLayoutPosition(), true);
            return true;
        }
    }
}
