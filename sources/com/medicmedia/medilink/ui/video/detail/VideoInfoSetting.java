package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.perf.FirebasePerformance;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.video.VideoDownloadState;
import com.medicmedia.medilink.ui.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting;", "", "<init>", "()V", "Title", "Type", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoInfoSetting {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SWITCH", FirebasePerformance.HttpMethod.DELETE, "WEB", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum Type {
        SWITCH,
        DELETE,
        WEB;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u000f\u0010\u0011\u0012\u0013\u0014R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "", "textId", "", "getTextId", "()I", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "getType", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "checked", "", "getChecked", "()Z", "isSwitch", "BgPlayback", "Resume", "Repeat", "DeleteVideo", "Errata", "Issue", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$BgPlayback;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$DeleteVideo;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Errata;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Issue;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Repeat;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Resume;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Title {
        boolean getChecked();

        int getTextId();

        Type getType();

        boolean isSwitch();

        /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class DefaultImpls {
            public static boolean isSwitch(Title title) {
                return title.getType() == Type.SWITCH;
            }
        }

        /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$BgPlayback;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "textId", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "checked", "", "<init>", "(ILcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;Z)V", "getTextId", "()I", "getType", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class BgPlayback implements Title {
            public static final int $stable = 0;
            private final boolean checked;
            private final int textId;
            private final Type type;

            public BgPlayback() {
                this(0, null, false, 7, null);
            }

            public static /* synthetic */ BgPlayback copy$default(BgPlayback bgPlayback, int i, Type type, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bgPlayback.textId;
                }
                if ((i2 & 2) != 0) {
                    type = bgPlayback.type;
                }
                if ((i2 & 4) != 0) {
                    z = bgPlayback.checked;
                }
                return bgPlayback.copy(i, type, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTextId() {
                return this.textId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            public final BgPlayback copy(int textId, Type type, boolean checked) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new BgPlayback(textId, type, checked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BgPlayback)) {
                    return false;
                }
                BgPlayback bgPlayback = (BgPlayback) other;
                return this.textId == bgPlayback.textId && this.type == bgPlayback.type && this.checked == bgPlayback.checked;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.textId) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            public String toString() {
                return "BgPlayback(textId=" + this.textId + ", type=" + this.type + ", checked=" + this.checked + ")";
            }

            public BgPlayback(int i, Type type, boolean z) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.textId = i;
                this.type = type;
                this.checked = z;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean isSwitch() {
                return DefaultImpls.isSwitch(this);
            }

            public /* synthetic */ BgPlayback(int i, Type type, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.video_info_panel_setting_bg_playback : i, (i2 & 2) != 0 ? Type.SWITCH : type, (i2 & 4) != 0 ? false : z);
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public int getTextId() {
                return this.textId;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public Type getType() {
                return this.type;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean getChecked() {
                return this.checked;
            }
        }

        /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Resume;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "textId", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "checked", "", "<init>", "(ILcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;Z)V", "getTextId", "()I", "getType", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Resume implements Title {
            public static final int $stable = 0;
            private final boolean checked;
            private final int textId;
            private final Type type;

            public Resume() {
                this(0, null, false, 7, null);
            }

            public static /* synthetic */ Resume copy$default(Resume resume, int i, Type type, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = resume.textId;
                }
                if ((i2 & 2) != 0) {
                    type = resume.type;
                }
                if ((i2 & 4) != 0) {
                    z = resume.checked;
                }
                return resume.copy(i, type, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTextId() {
                return this.textId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            public final Resume copy(int textId, Type type, boolean checked) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Resume(textId, type, checked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Resume)) {
                    return false;
                }
                Resume resume = (Resume) other;
                return this.textId == resume.textId && this.type == resume.type && this.checked == resume.checked;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.textId) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            public String toString() {
                return "Resume(textId=" + this.textId + ", type=" + this.type + ", checked=" + this.checked + ")";
            }

            public Resume(int i, Type type, boolean z) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.textId = i;
                this.type = type;
                this.checked = z;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean isSwitch() {
                return DefaultImpls.isSwitch(this);
            }

            public /* synthetic */ Resume(int i, Type type, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.video_info_panel_setting_resume : i, (i2 & 2) != 0 ? Type.SWITCH : type, (i2 & 4) != 0 ? false : z);
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public int getTextId() {
                return this.textId;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public Type getType() {
                return this.type;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean getChecked() {
                return this.checked;
            }
        }

        /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Repeat;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "textId", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "checked", "", "<init>", "(ILcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;Z)V", "getTextId", "()I", "getType", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Repeat implements Title {
            public static final int $stable = 0;
            private final boolean checked;
            private final int textId;
            private final Type type;

            public Repeat() {
                this(0, null, false, 7, null);
            }

            public static /* synthetic */ Repeat copy$default(Repeat repeat, int i, Type type, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = repeat.textId;
                }
                if ((i2 & 2) != 0) {
                    type = repeat.type;
                }
                if ((i2 & 4) != 0) {
                    z = repeat.checked;
                }
                return repeat.copy(i, type, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTextId() {
                return this.textId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            public final Repeat copy(int textId, Type type, boolean checked) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Repeat(textId, type, checked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Repeat)) {
                    return false;
                }
                Repeat repeat = (Repeat) other;
                return this.textId == repeat.textId && this.type == repeat.type && this.checked == repeat.checked;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.textId) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            public String toString() {
                return "Repeat(textId=" + this.textId + ", type=" + this.type + ", checked=" + this.checked + ")";
            }

            public Repeat(int i, Type type, boolean z) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.textId = i;
                this.type = type;
                this.checked = z;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean isSwitch() {
                return DefaultImpls.isSwitch(this);
            }

            public /* synthetic */ Repeat(int i, Type type, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.video_info_panel_setting_repeat : i, (i2 & 2) != 0 ? Type.SWITCH : type, (i2 & 4) != 0 ? false : z);
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public int getTextId() {
                return this.textId;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public Type getType() {
                return this.type;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean getChecked() {
                return this.checked;
            }
        }

        /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$DeleteVideo;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "textId", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "checked", "", "<init>", "(ILcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;Z)V", "getTextId", "()I", "getType", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class DeleteVideo implements Title {
            public static final int $stable = 0;
            private final boolean checked;
            private final int textId;
            private final Type type;

            public DeleteVideo() {
                this(0, null, false, 7, null);
            }

            public static /* synthetic */ DeleteVideo copy$default(DeleteVideo deleteVideo, int i, Type type, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = deleteVideo.textId;
                }
                if ((i2 & 2) != 0) {
                    type = deleteVideo.type;
                }
                if ((i2 & 4) != 0) {
                    z = deleteVideo.checked;
                }
                return deleteVideo.copy(i, type, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTextId() {
                return this.textId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            public final DeleteVideo copy(int textId, Type type, boolean checked) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new DeleteVideo(textId, type, checked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeleteVideo)) {
                    return false;
                }
                DeleteVideo deleteVideo = (DeleteVideo) other;
                return this.textId == deleteVideo.textId && this.type == deleteVideo.type && this.checked == deleteVideo.checked;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.textId) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            public String toString() {
                return "DeleteVideo(textId=" + this.textId + ", type=" + this.type + ", checked=" + this.checked + ")";
            }

            public DeleteVideo(int i, Type type, boolean z) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.textId = i;
                this.type = type;
                this.checked = z;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean isSwitch() {
                return DefaultImpls.isSwitch(this);
            }

            public /* synthetic */ DeleteVideo(int i, Type type, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.video_info_panel_setting_delete_video : i, (i2 & 2) != 0 ? Type.DELETE : type, (i2 & 4) != 0 ? false : z);
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public int getTextId() {
                return this.textId;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public Type getType() {
                return this.type;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean getChecked() {
                return this.checked;
            }
        }

        /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Errata;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "textId", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "checked", "", "<init>", "(ILcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;Z)V", "getTextId", "()I", "getType", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Errata implements Title {
            public static final int $stable = 0;
            private final boolean checked;
            private final int textId;
            private final Type type;

            public Errata() {
                this(0, null, false, 7, null);
            }

            public static /* synthetic */ Errata copy$default(Errata errata, int i, Type type, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = errata.textId;
                }
                if ((i2 & 2) != 0) {
                    type = errata.type;
                }
                if ((i2 & 4) != 0) {
                    z = errata.checked;
                }
                return errata.copy(i, type, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTextId() {
                return this.textId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            public final Errata copy(int textId, Type type, boolean checked) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Errata(textId, type, checked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Errata)) {
                    return false;
                }
                Errata errata = (Errata) other;
                return this.textId == errata.textId && this.type == errata.type && this.checked == errata.checked;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.textId) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            public String toString() {
                return "Errata(textId=" + this.textId + ", type=" + this.type + ", checked=" + this.checked + ")";
            }

            public Errata(int i, Type type, boolean z) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.textId = i;
                this.type = type;
                this.checked = z;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean isSwitch() {
                return DefaultImpls.isSwitch(this);
            }

            public /* synthetic */ Errata(int i, Type type, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.video_info_panel_setting_errata : i, (i2 & 2) != 0 ? Type.WEB : type, (i2 & 4) != 0 ? false : z);
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public int getTextId() {
                return this.textId;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public Type getType() {
                return this.type;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean getChecked() {
                return this.checked;
            }
        }

        /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title$Issue;", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "textId", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "checked", "", "<init>", "(ILcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;Z)V", "getTextId", "()I", "getType", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Type;", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Issue implements Title {
            public static final int $stable = 0;
            private final boolean checked;
            private final int textId;
            private final Type type;

            public Issue() {
                this(0, null, false, 7, null);
            }

            public static /* synthetic */ Issue copy$default(Issue issue, int i, Type type, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = issue.textId;
                }
                if ((i2 & 2) != 0) {
                    type = issue.type;
                }
                if ((i2 & 4) != 0) {
                    z = issue.checked;
                }
                return issue.copy(i, type, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTextId() {
                return this.textId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            public final Issue copy(int textId, Type type, boolean checked) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Issue(textId, type, checked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Issue)) {
                    return false;
                }
                Issue issue = (Issue) other;
                return this.textId == issue.textId && this.type == issue.type && this.checked == issue.checked;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.textId) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            public String toString() {
                return "Issue(textId=" + this.textId + ", type=" + this.type + ", checked=" + this.checked + ")";
            }

            public Issue(int i, Type type, boolean z) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.textId = i;
                this.type = type;
                this.checked = z;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean isSwitch() {
                return DefaultImpls.isSwitch(this);
            }

            public /* synthetic */ Issue(int i, Type type, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.video_info_panel_setting_issue : i, (i2 & 2) != 0 ? Type.WEB : type, (i2 & 4) != 0 ? false : z);
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public int getTextId() {
                return this.textId;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public Type getType() {
                return this.type;
            }

            @Override // com.medicmedia.medilink.ui.video.detail.VideoInfoSetting.Title
            public boolean getChecked() {
                return this.checked;
            }
        }
    }

    /* JADX INFO: compiled from: VideoInfoSettingBottomSheet.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Companion;", "", "<init>", "()V", "titles", "", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoSetting$Title;", "downloadState", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "isChecked", "", HistoryRepositoryImpl.FieldName.TITLE, "settingState", "Lcom/medicmedia/medilink/ui/video/detail/VideoOtherSettingState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Title> titles(VideoDownloadState downloadState) {
            List<Title> listListOf;
            return (downloadState == null || (listListOf = CollectionsKt.listOf((Object[]) new Title[]{new Title.BgPlayback(0, null, false, 7, null), new Title.Resume(0, null, false, 7, null), new Title.Repeat(0, null, false, 7, null), new Title.DeleteVideo(0, null, false, 7, null), new Title.Errata(0, null, false, 7, null), new Title.Issue(0, null, false, 7, null)})) == null) ? CollectionsKt.listOf((Object[]) new Title[]{new Title.BgPlayback(0, null, false, 7, null), new Title.Resume(0, null, false, 7, null), new Title.Repeat(0, null, false, 7, null), new Title.Errata(0, null, false, 7, null), new Title.Issue(0, null, false, 7, null)}) : listListOf;
        }

        public final boolean isChecked(Title title, VideoOtherSettingState settingState) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(settingState, "settingState");
            if (title instanceof Title.BgPlayback) {
                return settingState.getEnableBackgroundPlayback();
            }
            if (title instanceof Title.Resume) {
                return settingState.getEnableResume();
            }
            if (title instanceof Title.Repeat) {
                return settingState.getEnableRepeatAll();
            }
            return false;
        }
    }
}
