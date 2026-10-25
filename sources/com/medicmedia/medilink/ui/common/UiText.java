package com.medicmedia.medilink.ui.common;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UiText.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/ui/common/UiText;", "", "<init>", "()V", "asString", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "context", "Landroid/content/Context;", "Resource", "Raw", "Combined", "Lcom/medicmedia/medilink/ui/common/UiText$Combined;", "Lcom/medicmedia/medilink/ui/common/UiText$Raw;", "Lcom/medicmedia/medilink/ui/common/UiText$Resource;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class UiText {
    public static final int $stable = 0;

    public /* synthetic */ UiText(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiText() {
    }

    /* JADX INFO: compiled from: UiText.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/common/UiText$Resource;", "Lcom/medicmedia/medilink/ui/common/UiText;", "id", "", "args", "", "", "<init>", "(ILjava/util/List;)V", "getId", "()I", "getArgs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Resource extends UiText {
        public static final int $stable = 8;
        private final List<Object> args;
        private final int id;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resource copy$default(Resource resource, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resource.id;
            }
            if ((i2 & 2) != 0) {
                list = resource.args;
            }
            return resource.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final List<Object> component2() {
            return this.args;
        }

        public final Resource copy(int id, List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new Resource(id, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) other;
            return this.id == resource.id && Intrinsics.areEqual(this.args, resource.args);
        }

        public int hashCode() {
            return (Integer.hashCode(this.id) * 31) + this.args.hashCode();
        }

        public String toString() {
            return "Resource(id=" + this.id + ", args=" + this.args + ")";
        }

        public final int getId() {
            return this.id;
        }

        public /* synthetic */ Resource(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<Object> getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resource(int i, List<? extends Object> args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.id = i;
            this.args = args;
        }
    }

    /* JADX INFO: compiled from: UiText.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/UiText$Raw;", "Lcom/medicmedia/medilink/ui/common/UiText;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Raw extends UiText {
        public static final int $stable = 0;
        private final String value;

        public static /* synthetic */ Raw copy$default(Raw raw, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = raw.value;
            }
            return raw.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Raw copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Raw(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Raw) && Intrinsics.areEqual(this.value, ((Raw) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Raw(value=" + this.value + ")";
        }

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Raw(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    /* JADX INFO: compiled from: UiText.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/common/UiText$Combined;", "Lcom/medicmedia/medilink/ui/common/UiText;", "parts", "", "separator", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getParts", "()Ljava/util/List;", "getSeparator", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Combined extends UiText {
        public static final int $stable = 8;
        private final List<UiText> parts;
        private final String separator;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Combined copy$default(Combined combined, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = combined.parts;
            }
            if ((i & 2) != 0) {
                str = combined.separator;
            }
            return combined.copy(list, str);
        }

        public final List<UiText> component1() {
            return this.parts;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSeparator() {
            return this.separator;
        }

        public final Combined copy(List<? extends UiText> parts, String separator) {
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(separator, "separator");
            return new Combined(parts, separator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Combined)) {
                return false;
            }
            Combined combined = (Combined) other;
            return Intrinsics.areEqual(this.parts, combined.parts) && Intrinsics.areEqual(this.separator, combined.separator);
        }

        public int hashCode() {
            return (this.parts.hashCode() * 31) + this.separator.hashCode();
        }

        public String toString() {
            return "Combined(parts=" + this.parts + ", separator=" + this.separator + ")";
        }

        public final List<UiText> getParts() {
            return this.parts;
        }

        public /* synthetic */ Combined(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? "" : str);
        }

        public final String getSeparator() {
            return this.separator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Combined(List<? extends UiText> parts, String separator) {
            super(null);
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(separator, "separator");
            this.parts = parts;
            this.separator = separator;
        }
    }

    public final String asString(Composer composer, int i) {
        String strJoinToString$default;
        composer.startReplaceGroup(-1987548687);
        ComposerKt.sourceInformation(composer, "C(asString):UiText.kt#f37aep");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1987548687, i, -1, "com.medicmedia.medilink.ui.common.UiText.asString (UiText.kt:30)");
        }
        if (this instanceof Resource) {
            composer.startReplaceGroup(-578417033);
            ComposerKt.sourceInformation(composer, "");
            Resource resource = (Resource) this;
            if (resource.getArgs().isEmpty()) {
                composer.startReplaceGroup(-751041787);
                ComposerKt.sourceInformation(composer, "32@794L18");
                strJoinToString$default = StringResources_androidKt.stringResource(resource.getId(), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-750993489);
                ComposerKt.sourceInformation(composer, "34@842L40");
                int id = resource.getId();
                Object[] array = resource.getArgs().toArray(new Object[0]);
                strJoinToString$default = StringResources_androidKt.stringResource(id, Arrays.copyOf(array, array.length), composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else if (this instanceof Raw) {
            composer.startReplaceGroup(-578412328);
            composer.endReplaceGroup();
            strJoinToString$default = ((Raw) this).getValue();
        } else {
            if (!(this instanceof Combined)) {
                composer.startReplaceGroup(-578417908);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-750877611);
            ComposerKt.sourceInformation(composer, "*40@1092L10");
            Combined combined = (Combined) this;
            List<UiText> parts = combined.getParts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parts, 10));
            Iterator<T> it = parts.iterator();
            while (it.hasNext()) {
                arrayList.add(((UiText) it.next()).asString(composer, 0));
            }
            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, combined.getSeparator(), null, null, 0, null, null, 62, null);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strJoinToString$default;
    }

    public final String asString(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this instanceof Resource) {
            Resource resource = (Resource) this;
            if (resource.getArgs().isEmpty()) {
                String string = context.getString(resource.getId());
                Intrinsics.checkNotNull(string);
                return string;
            }
            int id = resource.getId();
            Object[] array = resource.getArgs().toArray(new Object[0]);
            String string2 = context.getString(id, Arrays.copyOf(array, array.length));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (this instanceof Raw) {
            return ((Raw) this).getValue();
        }
        if (!(this instanceof Combined)) {
            throw new NoWhenBranchMatchedException();
        }
        Combined combined = (Combined) this;
        return CollectionsKt.joinToString$default(combined.getParts(), combined.getSeparator(), null, null, 0, null, new Function1() { // from class: com.medicmedia.medilink.ui.common.UiText$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiText.asString$lambda$1(context, (UiText) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence asString$lambda$1(Context context, UiText it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.asString(context);
    }
}
