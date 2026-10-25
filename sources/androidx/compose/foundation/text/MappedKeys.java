package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import kotlin.Metadata;

/* JADX INFO: compiled from: KeyMapping.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u0013\u0010\u0017\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0018\u0010\u0007R\u0013\u0010\u0019\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007R\u0013\u0010\u001b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001c\u0010\u0007R\u0013\u0010\u001d\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007R\u0013\u0010\u001f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b \u0010\u0007R\u0013\u0010!\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\"\u0010\u0007R\u0013\u0010#\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b$\u0010\u0007R\u0013\u0010%\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b&\u0010\u0007R\u0013\u0010'\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b(\u0010\u0007R\u0013\u0010)\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b*\u0010\u0007R\u0013\u0010+\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b,\u0010\u0007R\u0013\u0010-\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b.\u0010\u0007R\u0013\u0010/\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b0\u0010\u0007R\u0013\u00101\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b2\u0010\u0007R\u0013\u00103\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b4\u0010\u0007R\u0013\u00105\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b6\u0010\u0007R\u0013\u00107\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b8\u0010\u0007R\u0013\u00109\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b:\u0010\u0007¨\u0006;"}, d2 = {"Landroidx/compose/foundation/text/MappedKeys;", "", "<init>", "()V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/compose/ui/input/key/Key;", "getA-EK5gGoQ", "()J", "J", "C", "getC-EK5gGoQ", "H", "getH-EK5gGoQ", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getV-EK5gGoQ", "Y", "getY-EK5gGoQ", "X", "getX-EK5gGoQ", "Z", "getZ-EK5gGoQ", "Backslash", "getBackslash-EK5gGoQ", "DirectionLeft", "getDirectionLeft-EK5gGoQ", "DirectionRight", "getDirectionRight-EK5gGoQ", "DirectionUp", "getDirectionUp-EK5gGoQ", "DirectionDown", "getDirectionDown-EK5gGoQ", "DirectionCenter", "getDirectionCenter-EK5gGoQ", "PageUp", "getPageUp-EK5gGoQ", "PageDown", "getPageDown-EK5gGoQ", "MoveHome", "getMoveHome-EK5gGoQ", "MoveEnd", "getMoveEnd-EK5gGoQ", "Insert", "getInsert-EK5gGoQ", "Enter", "getEnter-EK5gGoQ", "NumPadEnter", "getNumPadEnter-EK5gGoQ", "Backspace", "getBackspace-EK5gGoQ", "Delete", "getDelete-EK5gGoQ", "Paste", "getPaste-EK5gGoQ", "Cut", "getCut-EK5gGoQ", "Copy", "getCopy-EK5gGoQ", "Tab", "getTab-EK5gGoQ", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MappedKeys {
    public static final int $stable = 0;
    public static final MappedKeys INSTANCE = new MappedKeys();
    private static final long A = Key_androidKt.Key(29);
    private static final long C = Key_androidKt.Key(31);
    private static final long H = Key_androidKt.Key(36);
    private static final long V = Key_androidKt.Key(50);
    private static final long Y = Key_androidKt.Key(53);
    private static final long X = Key_androidKt.Key(52);
    private static final long Z = Key_androidKt.Key(54);
    private static final long Backslash = Key_androidKt.Key(73);
    private static final long DirectionLeft = Key_androidKt.Key(21);
    private static final long DirectionRight = Key_androidKt.Key(22);
    private static final long DirectionUp = Key_androidKt.Key(19);
    private static final long DirectionDown = Key_androidKt.Key(20);
    private static final long DirectionCenter = Key_androidKt.Key(23);
    private static final long PageUp = Key_androidKt.Key(92);
    private static final long PageDown = Key_androidKt.Key(93);
    private static final long MoveHome = Key_androidKt.Key(122);
    private static final long MoveEnd = Key_androidKt.Key(123);
    private static final long Insert = Key_androidKt.Key(124);
    private static final long Enter = Key_androidKt.Key(66);
    private static final long NumPadEnter = Key_androidKt.Key(160);
    private static final long Backspace = Key_androidKt.Key(67);
    private static final long Delete = Key_androidKt.Key(realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_SIZE);
    private static final long Paste = Key_androidKt.Key(279);
    private static final long Cut = Key_androidKt.Key(277);
    private static final long Copy = Key_androidKt.Key(278);
    private static final long Tab = Key_androidKt.Key(61);

    private MappedKeys() {
    }

    /* JADX INFO: renamed from: getA-EK5gGoQ, reason: not valid java name */
    public final long m1592getAEK5gGoQ() {
        return A;
    }

    /* JADX INFO: renamed from: getC-EK5gGoQ, reason: not valid java name */
    public final long m1595getCEK5gGoQ() {
        return C;
    }

    /* JADX INFO: renamed from: getH-EK5gGoQ, reason: not valid java name */
    public final long m1605getHEK5gGoQ() {
        return H;
    }

    /* JADX INFO: renamed from: getV-EK5gGoQ, reason: not valid java name */
    public final long m1614getVEK5gGoQ() {
        return V;
    }

    /* JADX INFO: renamed from: getY-EK5gGoQ, reason: not valid java name */
    public final long m1616getYEK5gGoQ() {
        return Y;
    }

    /* JADX INFO: renamed from: getX-EK5gGoQ, reason: not valid java name */
    public final long m1615getXEK5gGoQ() {
        return X;
    }

    /* JADX INFO: renamed from: getZ-EK5gGoQ, reason: not valid java name */
    public final long m1617getZEK5gGoQ() {
        return Z;
    }

    /* JADX INFO: renamed from: getBackslash-EK5gGoQ, reason: not valid java name */
    public final long m1593getBackslashEK5gGoQ() {
        return Backslash;
    }

    /* JADX INFO: renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
    public final long m1601getDirectionLeftEK5gGoQ() {
        return DirectionLeft;
    }

    /* JADX INFO: renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
    public final long m1602getDirectionRightEK5gGoQ() {
        return DirectionRight;
    }

    /* JADX INFO: renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
    public final long m1603getDirectionUpEK5gGoQ() {
        return DirectionUp;
    }

    /* JADX INFO: renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
    public final long m1600getDirectionDownEK5gGoQ() {
        return DirectionDown;
    }

    /* JADX INFO: renamed from: getDirectionCenter-EK5gGoQ, reason: not valid java name */
    public final long m1599getDirectionCenterEK5gGoQ() {
        return DirectionCenter;
    }

    /* JADX INFO: renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
    public final long m1611getPageUpEK5gGoQ() {
        return PageUp;
    }

    /* JADX INFO: renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
    public final long m1610getPageDownEK5gGoQ() {
        return PageDown;
    }

    /* JADX INFO: renamed from: getMoveHome-EK5gGoQ, reason: not valid java name */
    public final long m1608getMoveHomeEK5gGoQ() {
        return MoveHome;
    }

    /* JADX INFO: renamed from: getMoveEnd-EK5gGoQ, reason: not valid java name */
    public final long m1607getMoveEndEK5gGoQ() {
        return MoveEnd;
    }

    /* JADX INFO: renamed from: getInsert-EK5gGoQ, reason: not valid java name */
    public final long m1606getInsertEK5gGoQ() {
        return Insert;
    }

    /* JADX INFO: renamed from: getEnter-EK5gGoQ, reason: not valid java name */
    public final long m1604getEnterEK5gGoQ() {
        return Enter;
    }

    /* JADX INFO: renamed from: getNumPadEnter-EK5gGoQ, reason: not valid java name */
    public final long m1609getNumPadEnterEK5gGoQ() {
        return NumPadEnter;
    }

    /* JADX INFO: renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
    public final long m1594getBackspaceEK5gGoQ() {
        return Backspace;
    }

    /* JADX INFO: renamed from: getDelete-EK5gGoQ, reason: not valid java name */
    public final long m1598getDeleteEK5gGoQ() {
        return Delete;
    }

    /* JADX INFO: renamed from: getPaste-EK5gGoQ, reason: not valid java name */
    public final long m1612getPasteEK5gGoQ() {
        return Paste;
    }

    /* JADX INFO: renamed from: getCut-EK5gGoQ, reason: not valid java name */
    public final long m1597getCutEK5gGoQ() {
        return Cut;
    }

    /* JADX INFO: renamed from: getCopy-EK5gGoQ, reason: not valid java name */
    public final long m1596getCopyEK5gGoQ() {
        return Copy;
    }

    /* JADX INFO: renamed from: getTab-EK5gGoQ, reason: not valid java name */
    public final long m1613getTabEK5gGoQ() {
        return Tab;
    }
}
