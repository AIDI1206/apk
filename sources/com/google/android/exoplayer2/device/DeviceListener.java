package com.google.android.exoplayer2.device;

/* JADX INFO: loaded from: classes4.dex */
public interface DeviceListener {
    default void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    default void onDeviceVolumeChanged(int i, boolean z) {
    }
}
