package com.medicmedia.medilink.ui.common;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import io.realm.kotlin.internal.interop.realm_sync_errno_session_e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OptionDropdownMenu.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuLayout;", "", "buttonSize", "", "widthInMin", "menuHeight", TtmlNode.ATTR_TTS_FONT_SIZE, "<init>", "(IIII)V", "getButtonSize", "()I", "getWidthInMin", "getMenuHeight", "getFontSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OptionDropdownMenuLayout {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final OptionDropdownMenuLayout f106default;
    private static final OptionDropdownMenuLayout header;
    private final int buttonSize;
    private final int fontSize;
    private final int menuHeight;
    private final int widthInMin;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final OptionDropdownMenuLayout video = new OptionDropdownMenuLayout(27, 40, 0, 0, 12, null);

    public OptionDropdownMenuLayout() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ OptionDropdownMenuLayout copy$default(OptionDropdownMenuLayout optionDropdownMenuLayout, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = optionDropdownMenuLayout.buttonSize;
        }
        if ((i5 & 2) != 0) {
            i2 = optionDropdownMenuLayout.widthInMin;
        }
        if ((i5 & 4) != 0) {
            i3 = optionDropdownMenuLayout.menuHeight;
        }
        if ((i5 & 8) != 0) {
            i4 = optionDropdownMenuLayout.fontSize;
        }
        return optionDropdownMenuLayout.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getButtonSize() {
        return this.buttonSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidthInMin() {
        return this.widthInMin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMenuHeight() {
        return this.menuHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    public final OptionDropdownMenuLayout copy(int buttonSize, int widthInMin, int menuHeight, int fontSize) {
        return new OptionDropdownMenuLayout(buttonSize, widthInMin, menuHeight, fontSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionDropdownMenuLayout)) {
            return false;
        }
        OptionDropdownMenuLayout optionDropdownMenuLayout = (OptionDropdownMenuLayout) other;
        return this.buttonSize == optionDropdownMenuLayout.buttonSize && this.widthInMin == optionDropdownMenuLayout.widthInMin && this.menuHeight == optionDropdownMenuLayout.menuHeight && this.fontSize == optionDropdownMenuLayout.fontSize;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.buttonSize) * 31) + Integer.hashCode(this.widthInMin)) * 31) + Integer.hashCode(this.menuHeight)) * 31) + Integer.hashCode(this.fontSize);
    }

    public String toString() {
        return "OptionDropdownMenuLayout(buttonSize=" + this.buttonSize + ", widthInMin=" + this.widthInMin + ", menuHeight=" + this.menuHeight + ", fontSize=" + this.fontSize + ")";
    }

    public OptionDropdownMenuLayout(int i, int i2, int i3, int i4) {
        this.buttonSize = i;
        this.widthInMin = i2;
        this.menuHeight = i3;
        this.fontSize = i4;
    }

    public /* synthetic */ OptionDropdownMenuLayout(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 30 : i, (i5 & 2) != 0 ? 170 : i2, (i5 & 4) != 0 ? 50 : i3, (i5 & 8) != 0 ? 15 : i4);
    }

    public final int getButtonSize() {
        return this.buttonSize;
    }

    public final int getWidthInMin() {
        return this.widthInMin;
    }

    public final int getMenuHeight() {
        return this.menuHeight;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: compiled from: OptionDropdownMenu.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuLayout$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuLayout;", "getDefault", "()Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuLayout;", "header", "getHeader", MimeTypes.BASE_TYPE_VIDEO, "getVideo", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionDropdownMenuLayout getDefault() {
            return OptionDropdownMenuLayout.f106default;
        }

        public final OptionDropdownMenuLayout getHeader() {
            return OptionDropdownMenuLayout.header;
        }

        public final OptionDropdownMenuLayout getVideo() {
            return OptionDropdownMenuLayout.video;
        }
    }

    static {
        int i = 0;
        int i2 = 0;
        f106default = new OptionDropdownMenuLayout(0, i, 0, i2, 15, null);
        header = new OptionDropdownMenuLayout(i, realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_CLIENT_VERSION, i2, 16, 5, null);
    }
}
