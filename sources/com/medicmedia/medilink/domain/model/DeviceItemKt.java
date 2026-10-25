package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.DevicesResponse;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeviceItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toItem", "Lcom/medicmedia/medilink/domain/model/DeviceItem;", "Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse$Device;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DeviceItemKt {
    public static final DeviceItem toItem(DevicesResponse.Device device) {
        Intrinsics.checkNotNullParameter(device, "<this>");
        return new DeviceItem(device.getName(), new Date(device.getDate()), device.getKey());
    }
}
