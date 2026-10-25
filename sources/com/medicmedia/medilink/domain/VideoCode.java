package com.medicmedia.medilink.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.medicmedia.medilink.datastore.preferences.LoginPreferencesDefault;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Const.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/domain/VideoCode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IGAKU", "KANGO", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum VideoCode {
    IGAKU(LoginPreferencesDefault.DISPLAY_VIDEO_CONTENTS_ID),
    KANGO("3G00000");

    private static final List<String> values;
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<VideoCode> getEntries() {
        return $ENTRIES;
    }

    VideoCode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        EnumEntries<VideoCode> entries = getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator<VideoCode> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        values = arrayList;
    }

    /* JADX INFO: compiled from: Const.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/VideoCode$Companion;", "", "<init>", "()V", "values", "", "", "getValues", "()Ljava/util/List;", "equals", "", "contentCode", "contains", "isIgaku", NotificationCompat.CATEGORY_SERVICE, "cid", "", "contentsId", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getValues() {
            return VideoCode.values;
        }

        public final boolean equals(String contentCode) {
            String str = contentCode;
            if (str != null && str.length() != 0) {
                List<String> values = getValues();
                if ((values instanceof Collection) && values.isEmpty()) {
                    return false;
                }
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual((String) it.next(), contentCode)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean contains(String contentCode) {
            String str = contentCode;
            if (str != null && str.length() != 0) {
                List<String> values = getValues();
                if ((values instanceof Collection) && values.isEmpty()) {
                    return false;
                }
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) it.next(), false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean isIgaku(String contentCode) {
            return Intrinsics.areEqual(VideoCode.IGAKU.getValue(), contentCode);
        }

        public final String contentCode(String service) {
            if (Intrinsics.areEqual(service, "igaku")) {
                return VideoCode.IGAKU.getValue();
            }
            if (Intrinsics.areEqual(service, "kango")) {
                return VideoCode.KANGO.getValue();
            }
            return null;
        }

        public final int cid(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return Intrinsics.areEqual(contentsId, VideoCode.KANGO.getValue()) ? 19 : 10;
        }
    }
}
