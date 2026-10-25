package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoOtherSettingState;", "", "enableBackgroundPlayback", "", "enableResume", "enableRepeatAll", "<init>", "(ZZZ)V", "getEnableBackgroundPlayback", "()Z", "getEnableResume", "getEnableRepeatAll", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoOtherSettingState {
    public static final int $stable = 0;
    private final boolean enableBackgroundPlayback;
    private final boolean enableRepeatAll;
    private final boolean enableResume;

    public VideoOtherSettingState() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ VideoOtherSettingState copy$default(VideoOtherSettingState videoOtherSettingState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoOtherSettingState.enableBackgroundPlayback;
        }
        if ((i & 2) != 0) {
            z2 = videoOtherSettingState.enableResume;
        }
        if ((i & 4) != 0) {
            z3 = videoOtherSettingState.enableRepeatAll;
        }
        return videoOtherSettingState.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableBackgroundPlayback() {
        return this.enableBackgroundPlayback;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnableResume() {
        return this.enableResume;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableRepeatAll() {
        return this.enableRepeatAll;
    }

    public final VideoOtherSettingState copy(boolean enableBackgroundPlayback, boolean enableResume, boolean enableRepeatAll) {
        return new VideoOtherSettingState(enableBackgroundPlayback, enableResume, enableRepeatAll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoOtherSettingState)) {
            return false;
        }
        VideoOtherSettingState videoOtherSettingState = (VideoOtherSettingState) other;
        return this.enableBackgroundPlayback == videoOtherSettingState.enableBackgroundPlayback && this.enableResume == videoOtherSettingState.enableResume && this.enableRepeatAll == videoOtherSettingState.enableRepeatAll;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enableBackgroundPlayback) * 31) + Boolean.hashCode(this.enableResume)) * 31) + Boolean.hashCode(this.enableRepeatAll);
    }

    public String toString() {
        return "VideoOtherSettingState(enableBackgroundPlayback=" + this.enableBackgroundPlayback + ", enableResume=" + this.enableResume + ", enableRepeatAll=" + this.enableRepeatAll + ")";
    }

    public VideoOtherSettingState(boolean z, boolean z2, boolean z3) {
        this.enableBackgroundPlayback = z;
        this.enableResume = z2;
        this.enableRepeatAll = z3;
    }

    public /* synthetic */ VideoOtherSettingState(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean getEnableBackgroundPlayback() {
        return this.enableBackgroundPlayback;
    }

    public final boolean getEnableResume() {
        return this.enableResume;
    }

    public final boolean getEnableRepeatAll() {
        return this.enableRepeatAll;
    }
}
