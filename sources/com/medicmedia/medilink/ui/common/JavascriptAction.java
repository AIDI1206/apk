package com.medicmedia.medilink.ui.common;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0013\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "", "command", "", "getCommand", "()Ljava/lang/String;", "SetMemo", "SetMark", "SetMarker", "OnMarkerMode", "ChangeMarkerColor", "DeleteMarkerColor", "ResetMarker", "CreateTimeBox", "HighlightAll", "RemoveAllHighlights", "SetupElementTapDetector", "ConsumeTextTagTapped", "SjLayoutFix", "ConsumeTabTapped", "AnchorScroll", "SetupQuickReferenceTabChangeNotifier", "QuickReferenceCurrentTabNo", "QuickReferenceSelectTab", "QuickReferenceNavigateTo", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$AnchorScroll;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$ChangeMarkerColor;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$ConsumeTabTapped;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$ConsumeTextTagTapped;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$CreateTimeBox;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$DeleteMarkerColor;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$HighlightAll;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$OnMarkerMode;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$QuickReferenceCurrentTabNo;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$QuickReferenceNavigateTo;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$QuickReferenceSelectTab;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$RemoveAllHighlights;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$ResetMarker;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetMark;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetMarker;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetMemo;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetupElementTapDetector;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetupQuickReferenceTabChangeNotifier;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction$SjLayoutFix;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface JavascriptAction {
    String getCommand();

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetMemo;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "noteDataId", "", "isDelete", "", "command", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getNoteDataId", "()Ljava/lang/String;", "()Z", "getCommand", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetMemo implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final boolean isDelete;
        private final String noteDataId;

        public static /* synthetic */ SetMemo copy$default(SetMemo setMemo, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setMemo.noteDataId;
            }
            if ((i & 2) != 0) {
                z = setMemo.isDelete;
            }
            if ((i & 4) != 0) {
                str2 = setMemo.command;
            }
            return setMemo.copy(str, z, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNoteDataId() {
            return this.noteDataId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsDelete() {
            return this.isDelete;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final SetMemo copy(String noteDataId, boolean isDelete, String command) {
            Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
            Intrinsics.checkNotNullParameter(command, "command");
            return new SetMemo(noteDataId, isDelete, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetMemo)) {
                return false;
            }
            SetMemo setMemo = (SetMemo) other;
            return Intrinsics.areEqual(this.noteDataId, setMemo.noteDataId) && this.isDelete == setMemo.isDelete && Intrinsics.areEqual(this.command, setMemo.command);
        }

        public int hashCode() {
            return (((this.noteDataId.hashCode() * 31) + Boolean.hashCode(this.isDelete)) * 31) + this.command.hashCode();
        }

        public String toString() {
            return "SetMemo(noteDataId=" + this.noteDataId + ", isDelete=" + this.isDelete + ", command=" + this.command + ")";
        }

        public SetMemo(String noteDataId, boolean z, String command) {
            Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
            Intrinsics.checkNotNullParameter(command, "command");
            this.noteDataId = noteDataId;
            this.isDelete = z;
            this.command = command;
        }

        public final String getNoteDataId() {
            return this.noteDataId;
        }

        public final boolean isDelete() {
            return this.isDelete;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ SetMemo(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            z = (i & 2) != 0 ? false : z;
            if ((i & 4) != 0) {
                str2 = "javascript:setMemo('" + str + "'," + (z ? "false" : "true") + ");";
            }
            this(str, z, str2);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetMark;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "noteDataId", "", "isDelete", "", "command", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getNoteDataId", "()Ljava/lang/String;", "()Z", "getCommand", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetMark implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final boolean isDelete;
        private final String noteDataId;

        public static /* synthetic */ SetMark copy$default(SetMark setMark, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setMark.noteDataId;
            }
            if ((i & 2) != 0) {
                z = setMark.isDelete;
            }
            if ((i & 4) != 0) {
                str2 = setMark.command;
            }
            return setMark.copy(str, z, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNoteDataId() {
            return this.noteDataId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsDelete() {
            return this.isDelete;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final SetMark copy(String noteDataId, boolean isDelete, String command) {
            Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
            Intrinsics.checkNotNullParameter(command, "command");
            return new SetMark(noteDataId, isDelete, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetMark)) {
                return false;
            }
            SetMark setMark = (SetMark) other;
            return Intrinsics.areEqual(this.noteDataId, setMark.noteDataId) && this.isDelete == setMark.isDelete && Intrinsics.areEqual(this.command, setMark.command);
        }

        public int hashCode() {
            return (((this.noteDataId.hashCode() * 31) + Boolean.hashCode(this.isDelete)) * 31) + this.command.hashCode();
        }

        public String toString() {
            return "SetMark(noteDataId=" + this.noteDataId + ", isDelete=" + this.isDelete + ", command=" + this.command + ")";
        }

        public SetMark(String noteDataId, boolean z, String command) {
            Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
            Intrinsics.checkNotNullParameter(command, "command");
            this.noteDataId = noteDataId;
            this.isDelete = z;
            this.command = command;
        }

        public final String getNoteDataId() {
            return this.noteDataId;
        }

        public final boolean isDelete() {
            return this.isDelete;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ SetMark(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            z = (i & 2) != 0 ? false : z;
            if ((i & 4) != 0) {
                str2 = "javascript:setMark('" + str + "'," + (z ? "false" : "true") + ");";
            }
            this(str, z, str2);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetMarker;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "noteDataId", "", HistoryRepositoryImpl.QueryKey.RANGE, FirebaseAnalytics.Param.CONTENT, "color", "command", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNoteDataId", "()Ljava/lang/String;", "getRange", "getContent", "getColor", "getCommand", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetMarker implements JavascriptAction {
        public static final int $stable = 0;
        private final String color;
        private final String command;
        private final String content;
        private final String noteDataId;
        private final String range;

        public static /* synthetic */ SetMarker copy$default(SetMarker setMarker, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setMarker.noteDataId;
            }
            if ((i & 2) != 0) {
                str2 = setMarker.range;
            }
            if ((i & 4) != 0) {
                str3 = setMarker.content;
            }
            if ((i & 8) != 0) {
                str4 = setMarker.color;
            }
            if ((i & 16) != 0) {
                str5 = setMarker.command;
            }
            String str6 = str5;
            String str7 = str3;
            return setMarker.copy(str, str2, str7, str4, str6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNoteDataId() {
            return this.noteDataId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRange() {
            return this.range;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final SetMarker copy(String noteDataId, String range, String content, String color, String command) {
            Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
            Intrinsics.checkNotNullParameter(range, "range");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(command, "command");
            return new SetMarker(noteDataId, range, content, color, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetMarker)) {
                return false;
            }
            SetMarker setMarker = (SetMarker) other;
            return Intrinsics.areEqual(this.noteDataId, setMarker.noteDataId) && Intrinsics.areEqual(this.range, setMarker.range) && Intrinsics.areEqual(this.content, setMarker.content) && Intrinsics.areEqual(this.color, setMarker.color) && Intrinsics.areEqual(this.command, setMarker.command);
        }

        public int hashCode() {
            return (((((((this.noteDataId.hashCode() * 31) + this.range.hashCode()) * 31) + this.content.hashCode()) * 31) + this.color.hashCode()) * 31) + this.command.hashCode();
        }

        public String toString() {
            return "SetMarker(noteDataId=" + this.noteDataId + ", range=" + this.range + ", content=" + this.content + ", color=" + this.color + ", command=" + this.command + ")";
        }

        public SetMarker(String noteDataId, String range, String content, String color, String command) {
            Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
            Intrinsics.checkNotNullParameter(range, "range");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(command, "command");
            this.noteDataId = noteDataId;
            this.range = range;
            this.content = content;
            this.color = color;
            this.command = command;
        }

        public final String getNoteDataId() {
            return this.noteDataId;
        }

        public final String getRange() {
            return this.range;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getColor() {
            return this.color;
        }

        public /* synthetic */ SetMarker(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? "javascript:setMarker('" + str + "'," + str2 + ",'" + str3 + "','" + str4 + "');" : str5);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$OnMarkerMode;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "isOn", "", "command", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getCommand", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OnMarkerMode implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final boolean isOn;

        public OnMarkerMode() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OnMarkerMode copy$default(OnMarkerMode onMarkerMode, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onMarkerMode.isOn;
            }
            if ((i & 2) != 0) {
                str = onMarkerMode.command;
            }
            return onMarkerMode.copy(z, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsOn() {
            return this.isOn;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final OnMarkerMode copy(boolean isOn, String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new OnMarkerMode(isOn, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnMarkerMode)) {
                return false;
            }
            OnMarkerMode onMarkerMode = (OnMarkerMode) other;
            return this.isOn == onMarkerMode.isOn && Intrinsics.areEqual(this.command, onMarkerMode.command);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isOn) * 31) + this.command.hashCode();
        }

        public String toString() {
            return "OnMarkerMode(isOn=" + this.isOn + ", command=" + this.command + ")";
        }

        public OnMarkerMode(boolean z, String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.isOn = z;
            this.command = command;
        }

        public final boolean isOn() {
            return this.isOn;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ OnMarkerMode(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            z = (i & 1) != 0 ? false : z;
            if ((i & 2) != 0) {
                str = String.format("onMarkerMode(%b)", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            this(z, str);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$ChangeMarkerColor;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType;", "command", "", "<init>", "(Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType;Ljava/lang/String;)V", "getType", "()Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType;", "getCommand", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ChangeMarkerColor implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final MarkerColorSelectorType type;

        public static /* synthetic */ ChangeMarkerColor copy$default(ChangeMarkerColor changeMarkerColor, MarkerColorSelectorType markerColorSelectorType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                markerColorSelectorType = changeMarkerColor.type;
            }
            if ((i & 2) != 0) {
                str = changeMarkerColor.command;
            }
            return changeMarkerColor.copy(markerColorSelectorType, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MarkerColorSelectorType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final ChangeMarkerColor copy(MarkerColorSelectorType type, String command) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(command, "command");
            return new ChangeMarkerColor(type, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeMarkerColor)) {
                return false;
            }
            ChangeMarkerColor changeMarkerColor = (ChangeMarkerColor) other;
            return this.type == changeMarkerColor.type && Intrinsics.areEqual(this.command, changeMarkerColor.command);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.command.hashCode();
        }

        public String toString() {
            return "ChangeMarkerColor(type=" + this.type + ", command=" + this.command + ")";
        }

        public ChangeMarkerColor(MarkerColorSelectorType type, String command) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(command, "command");
            this.type = type;
            this.command = command;
        }

        public final MarkerColorSelectorType getType() {
            return this.type;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ChangeMarkerColor(MarkerColorSelectorType markerColorSelectorType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                str = String.format("changeMarkerColor(\"#%s\")", Arrays.copyOf(new Object[]{markerColorSelectorType.getValue()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            this(markerColorSelectorType, str);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$DeleteMarkerColor;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DeleteMarkerColor implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public DeleteMarkerColor() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DeleteMarkerColor copy$default(DeleteMarkerColor deleteMarkerColor, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deleteMarkerColor.command;
            }
            return deleteMarkerColor.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final DeleteMarkerColor copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new DeleteMarkerColor(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteMarkerColor) && Intrinsics.areEqual(this.command, ((DeleteMarkerColor) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "DeleteMarkerColor(command=" + this.command + ")";
        }

        public DeleteMarkerColor(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        public /* synthetic */ DeleteMarkerColor(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "changeMarkerColor(\"delete\")" : str);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$ResetMarker;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ResetMarker implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public ResetMarker() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ResetMarker copy$default(ResetMarker resetMarker, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resetMarker.command;
            }
            return resetMarker.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final ResetMarker copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new ResetMarker(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResetMarker) && Intrinsics.areEqual(this.command, ((ResetMarker) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "ResetMarker(command=" + this.command + ")";
        }

        public ResetMarker(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        public /* synthetic */ ResetMarker(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "javascript:resetMarker()" : str);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$CreateTimeBox;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "value", "", "command", "", "<init>", "(ILjava/lang/String;)V", "getValue", "()I", "getCommand", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class CreateTimeBox implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final int value;

        public static /* synthetic */ CreateTimeBox copy$default(CreateTimeBox createTimeBox, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = createTimeBox.value;
            }
            if ((i2 & 2) != 0) {
                str = createTimeBox.command;
            }
            return createTimeBox.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final CreateTimeBox copy(int value, String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new CreateTimeBox(value, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateTimeBox)) {
                return false;
            }
            CreateTimeBox createTimeBox = (CreateTimeBox) other;
            return this.value == createTimeBox.value && Intrinsics.areEqual(this.command, createTimeBox.command);
        }

        public int hashCode() {
            return (Integer.hashCode(this.value) * 31) + this.command.hashCode();
        }

        public String toString() {
            return "CreateTimeBox(value=" + this.value + ", command=" + this.command + ")";
        }

        public CreateTimeBox(int i, String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.value = i;
            this.command = command;
        }

        public final int getValue() {
            return this.value;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ CreateTimeBox(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                str = String.format("javascript:createTimeBox(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            this(i, str);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$HighlightAll;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", SearchIntents.EXTRA_QUERY, "", "command", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "getCommand", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class HighlightAll implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final String query;

        public static /* synthetic */ HighlightAll copy$default(HighlightAll highlightAll, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = highlightAll.query;
            }
            if ((i & 2) != 0) {
                str2 = highlightAll.command;
            }
            return highlightAll.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final HighlightAll copy(String query, String command) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(command, "command");
            return new HighlightAll(query, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightAll)) {
                return false;
            }
            HighlightAll highlightAll = (HighlightAll) other;
            return Intrinsics.areEqual(this.query, highlightAll.query) && Intrinsics.areEqual(this.command, highlightAll.command);
        }

        public int hashCode() {
            return (this.query.hashCode() * 31) + this.command.hashCode();
        }

        public String toString() {
            return "HighlightAll(query=" + this.query + ", command=" + this.command + ")";
        }

        public HighlightAll(String query, String command) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(command, "command");
            this.query = query;
            this.command = command;
        }

        public final String getQuery() {
            return this.query;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ HighlightAll(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                str2 = String.format("javascript:uiWebview_HighlightAllOccurencesOfNextString('%s')", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            }
            this(str, str2);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$RemoveAllHighlights;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class RemoveAllHighlights implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public RemoveAllHighlights() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RemoveAllHighlights copy$default(RemoveAllHighlights removeAllHighlights, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = removeAllHighlights.command;
            }
            return removeAllHighlights.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final RemoveAllHighlights copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new RemoveAllHighlights(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoveAllHighlights) && Intrinsics.areEqual(this.command, ((RemoveAllHighlights) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "RemoveAllHighlights(command=" + this.command + ")";
        }

        public RemoveAllHighlights(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        public /* synthetic */ RemoveAllHighlights(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "javascript:uiWebview_RemoveAllHighlights()" : str);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetupElementTapDetector;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetupElementTapDetector implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public SetupElementTapDetector() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SetupElementTapDetector copy$default(SetupElementTapDetector setupElementTapDetector, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupElementTapDetector.command;
            }
            return setupElementTapDetector.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final SetupElementTapDetector copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new SetupElementTapDetector(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetupElementTapDetector) && Intrinsics.areEqual(this.command, ((SetupElementTapDetector) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "SetupElementTapDetector(command=" + this.command + ")";
        }

        public SetupElementTapDetector(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }

        public /* synthetic */ SetupElementTapDetector(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "(function() {\n    window.__androidQbRefTapped = false;\n    window.__androidTabTapped = false;\n\n    if (window.__androidTapDetectorInstalled) return true;\n    window.__androidTapDetectorInstalled = true;\n\n    function markIfSpecial(target) {\n        if (!target) return;\n\n        var node = target.nodeType === Node.TEXT_NODE ? target.parentElement : target;\n        if (!node || !node.closest) return;\n\n        var qbref = node.closest('span.qbref_class[data-id], span.qbref_class[data-no]');\n        var anki = node.closest('span.anki');\n\n        if (qbref || anki) {\n            window.__androidQbRefTapped = true;\n        }\n\n        if (node.closest('button.tab-button')) {\n            window.__androidTabTapped = true;\n        }\n    }\n\n    document.addEventListener('click', function(event) {\n        markIfSpecial(event.target);\n    }, true);\n\n    document.addEventListener('touchend', function(event) {\n        markIfSpecial(event.target);\n    }, true);\n\n    document.addEventListener('mouseup', function(event) {\n        markIfSpecial(event.target);\n    }, true);\n\n    return true;\n})();" : str);
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$ConsumeTextTagTapped;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ConsumeTextTagTapped implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public ConsumeTextTagTapped() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ConsumeTextTagTapped copy$default(ConsumeTextTagTapped consumeTextTagTapped, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = consumeTextTagTapped.command;
            }
            return consumeTextTagTapped.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final ConsumeTextTagTapped copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new ConsumeTextTagTapped(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConsumeTextTagTapped) && Intrinsics.areEqual(this.command, ((ConsumeTextTagTapped) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "ConsumeTextTagTapped(command=" + this.command + ")";
        }

        public ConsumeTextTagTapped(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }

        public /* synthetic */ ConsumeTextTagTapped(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "(function() {\n    const result = !!window.__androidQbRefTapped;\n    window.__androidQbRefTapped = false;\n    return result;\n})();" : str);
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$SjLayoutFix;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SjLayoutFix implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public SjLayoutFix() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SjLayoutFix copy$default(SjLayoutFix sjLayoutFix, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sjLayoutFix.command;
            }
            return sjLayoutFix.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final SjLayoutFix copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new SjLayoutFix(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SjLayoutFix) && Intrinsics.areEqual(this.command, ((SjLayoutFix) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "SjLayoutFix(command=" + this.command + ")";
        }

        public SjLayoutFix(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }

        public /* synthetic */ SjLayoutFix(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "(function() {\n  var h = window.innerHeight + 'px';\n  var w = window.innerWidth + 'px';\n\n  document.documentElement.style.height = h;\n  document.documentElement.style.width = w;\n  document.body.style.height = h;\n  document.body.style.width = w;\n\n  var docdata = document.querySelector('.docdata');\n  if (docdata) {\n    docdata.style.height = h;\n    docdata.style.width = w;\n  }\n\n  var article = document.querySelector('article');\n  if (article) {\n    article.style.height = h;\n    article.style.width = w;\n    article.style.top = '0';\n    article.style.left = '0';\n  }\n\n  window.dispatchEvent(new Event('resize'));\n  return 'done';\n})();" : str);
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$ConsumeTabTapped;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ConsumeTabTapped implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public ConsumeTabTapped() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ConsumeTabTapped copy$default(ConsumeTabTapped consumeTabTapped, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = consumeTabTapped.command;
            }
            return consumeTabTapped.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final ConsumeTabTapped copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new ConsumeTabTapped(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConsumeTabTapped) && Intrinsics.areEqual(this.command, ((ConsumeTabTapped) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "ConsumeTabTapped(command=" + this.command + ")";
        }

        public ConsumeTabTapped(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }

        public /* synthetic */ ConsumeTabTapped(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "(function() {\n    const result = !!window.__androidTabTapped;\n    window.__androidTabTapped = false;\n    return result;\n})();" : str);
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$AnchorScroll;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "anchor", "", "topOffset", "", "<init>", "(Ljava/lang/String;I)V", "command", "getCommand", "()Ljava/lang/String;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AnchorScroll implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public AnchorScroll(String anchor, int i) {
            Intrinsics.checkNotNullParameter(anchor, "anchor");
            this.command = StringsKt.trimIndent("\n            (function() {\n                var anchorId = '" + StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.removePrefix(anchor, (CharSequence) MLConst.MLCommon.SHARP), "\\", "\\\\", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null), IOUtils.LINE_SEPARATOR_UNIX, "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null) + "';\n                var offset = " + RangesKt.coerceAtLeast(i, 0) + ";\n                var lastTop = null;\n                var stableCount = 0;\n                var frameCount = 0;\n                var maxFrames = 60;\n\n                function findTarget() {\n                    var target = document.getElementById(anchorId);\n                    if (target) { return target; }\n\n                    var namedTargets = document.getElementsByName(anchorId);\n                    return namedTargets.length > 0 ? namedTargets[0] : null;\n                }\n\n                function scrollWhenStable() {\n                    var target = findTarget();\n                    if (!target) {\n                        return false;\n                    }\n\n                    var top = target.getBoundingClientRect().top + window.pageYOffset;\n\n                    if (lastTop !== null && Math.abs(top - lastTop) < 1) {\n                        stableCount++;\n                    } else {\n                        stableCount = 0;\n                    }\n\n                    lastTop = top;\n                    frameCount++;\n\n                    if (stableCount >= 3 || frameCount >= maxFrames) {\n                        window.scrollTo(0, Math.max(0, top - offset));\n                        return true;\n                    }\n\n                    requestAnimationFrame(scrollWhenStable);\n                    return true;\n                }\n\n                requestAnimationFrame(scrollWhenStable);\n                return true;\n            })();\n            ");
        }

        public /* synthetic */ AnchorScroll(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$SetupQuickReferenceTabChangeNotifier;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetupQuickReferenceTabChangeNotifier implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public SetupQuickReferenceTabChangeNotifier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SetupQuickReferenceTabChangeNotifier copy$default(SetupQuickReferenceTabChangeNotifier setupQuickReferenceTabChangeNotifier, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupQuickReferenceTabChangeNotifier.command;
            }
            return setupQuickReferenceTabChangeNotifier.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final SetupQuickReferenceTabChangeNotifier copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new SetupQuickReferenceTabChangeNotifier(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetupQuickReferenceTabChangeNotifier) && Intrinsics.areEqual(this.command, ((SetupQuickReferenceTabChangeNotifier) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "SetupQuickReferenceTabChangeNotifier(command=" + this.command + ")";
        }

        public SetupQuickReferenceTabChangeNotifier(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }

        public /* synthetic */ SetupQuickReferenceTabChangeNotifier(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "(function() {\n    if (window.__androidQuickRefTabNotifierInstalled) { return; }\n    window.__androidQuickRefTabNotifierInstalled = true;\n\n    var swiperEl = document.querySelector('.swiper');\n    if (!swiperEl || !swiperEl.swiper) { return; }\n\n    swiperEl.swiper.on('transitionEnd', function() {\n        location.href = 'medilink://quickref-tab-changed?index=' + swiperEl.swiper.activeIndex;\n    });\n})();" : str);
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$QuickReferenceCurrentTabNo;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class QuickReferenceCurrentTabNo implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;

        public QuickReferenceCurrentTabNo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ QuickReferenceCurrentTabNo copy$default(QuickReferenceCurrentTabNo quickReferenceCurrentTabNo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quickReferenceCurrentTabNo.command;
            }
            return quickReferenceCurrentTabNo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final QuickReferenceCurrentTabNo copy(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new QuickReferenceCurrentTabNo(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuickReferenceCurrentTabNo) && Intrinsics.areEqual(this.command, ((QuickReferenceCurrentTabNo) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "QuickReferenceCurrentTabNo(command=" + this.command + ")";
        }

        public QuickReferenceCurrentTabNo(String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ QuickReferenceCurrentTabNo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = StringsKt.trimIndent("\n            (function() {\n                " + ActionModeSwitchWebViewKt.quickReferenceTabSupport + "\n                return window.medilinkGetQuickReferenceTabNo ? window.medilinkGetQuickReferenceTabNo() : null;\n            })();\n        ");
            }
            this(str);
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$QuickReferenceSelectTab;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", BundleKey.TAB_NO, "", "command", "", "<init>", "(ILjava/lang/String;)V", "getTabNo", "()I", "getCommand", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class QuickReferenceSelectTab implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final int tabNo;

        public static /* synthetic */ QuickReferenceSelectTab copy$default(QuickReferenceSelectTab quickReferenceSelectTab, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = quickReferenceSelectTab.tabNo;
            }
            if ((i2 & 2) != 0) {
                str = quickReferenceSelectTab.command;
            }
            return quickReferenceSelectTab.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTabNo() {
            return this.tabNo;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        public final QuickReferenceSelectTab copy(int tabNo, String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new QuickReferenceSelectTab(tabNo, command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickReferenceSelectTab)) {
                return false;
            }
            QuickReferenceSelectTab quickReferenceSelectTab = (QuickReferenceSelectTab) other;
            return this.tabNo == quickReferenceSelectTab.tabNo && Intrinsics.areEqual(this.command, quickReferenceSelectTab.command);
        }

        public int hashCode() {
            return (Integer.hashCode(this.tabNo) * 31) + this.command.hashCode();
        }

        public String toString() {
            return "QuickReferenceSelectTab(tabNo=" + this.tabNo + ", command=" + this.command + ")";
        }

        public QuickReferenceSelectTab(int i, String command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.tabNo = i;
            this.command = command;
        }

        public final int getTabNo() {
            return this.tabNo;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }

        public /* synthetic */ QuickReferenceSelectTab(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? StringsKt.trimIndent("\n            (function() {\n            var tabNo = " + i + ";\n\n            var buttons = Array.prototype.slice.call(document.querySelectorAll('.tab-button'));\n            if (tabNo < 0 || tabNo >= buttons.length) {\n                return false;\n            }\n\n            var swiperEl = document.querySelector('.swiper');\n            var swiper = swiperEl ? swiperEl.swiper : null;\n\n            if (swiper && typeof swiper.slideTo === 'function') {\n                swiper.slideTo(tabNo, 0, false);\n            }\n\n            buttons.forEach(function(button, index) {\n                button.classList.toggle('active', index === tabNo);\n                button.classList.toggle('selected', index === tabNo);\n                button.setAttribute('aria-selected', index === tabNo ? 'true' : 'false');\n            });\n\n            window.medilinkQuickReferenceSelectedTabNo = tabNo;\n            return true;\n        })();\n        ") : str);
        }
    }

    /* JADX INFO: compiled from: ActionModeSwitchWebView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/ui/common/JavascriptAction$QuickReferenceNavigateTo;", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", BundleKey.TAB_NO, "", "anchor", "", "topOffset", "<init>", "(ILjava/lang/String;I)V", "getTabNo", "()I", "command", "getCommand", "()Ljava/lang/String;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class QuickReferenceNavigateTo implements JavascriptAction {
        public static final int $stable = 0;
        private final String command;
        private final int tabNo;

        public QuickReferenceNavigateTo(int i, String anchor, int i2) {
            Intrinsics.checkNotNullParameter(anchor, "anchor");
            this.tabNo = i;
            this.command = StringsKt.trimIndent("\n            (function() {\n                " + ActionModeSwitchWebViewKt.anchorScrollSupport + "\n\n                var tabIndex = " + i + ";\n                var anchorId = '" + ActionModeSwitchWebViewKt.escapeForSingleQuotedJs(ActionModeSwitchWebViewKt.toAnchorId(anchor)) + "';\n\n                var swiperEl = document.querySelector('.swiper');\n                var swiper = swiperEl ? swiperEl.swiper : null;\n                if (!swiper) { return false; }\n\n                swiper.slideTo(tabIndex, 0, false);\n\n                document.querySelectorAll('.tab-button').forEach(function(button, index) {\n                    var selected = index === tabIndex;\n                    button.classList.toggle('active', selected);\n                    button.classList.toggle('selected', selected);\n                    button.setAttribute('aria-selected', selected ? 'true' : 'false');\n                });\n\n                if (typeof swiper.updateAutoHeight === 'function') {\n                    swiper.updateAutoHeight(0);\n                }\n                if (typeof swiper.update === 'function') {\n                    swiper.update();\n                }\n\n                window.medilinkScrollToAnchorOnNextFrame(anchorId, " + i2 + ");\n\n                return true;\n            })();\n            ");
        }

        public /* synthetic */ QuickReferenceNavigateTo(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i3 & 4) != 0 ? 0 : i2);
        }

        public final int getTabNo() {
            return this.tabNo;
        }

        @Override // com.medicmedia.medilink.ui.common.JavascriptAction
        public String getCommand() {
            return this.command;
        }
    }
}
