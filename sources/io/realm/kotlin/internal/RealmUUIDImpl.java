package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import io.realm.kotlin.internal.platform.SecureRandom;
import io.realm.kotlin.internal.util.HexadecimalKt;
import io.realm.kotlin.types.RealmUUID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okio.Utf8;

/* JADX INFO: compiled from: RealmUUIDImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lio/realm/kotlin/internal/RealmUUIDImpl;", "Lio/realm/kotlin/types/RealmUUID;", "<init>", "()V", "uuidString", "", "(Ljava/lang/String;)V", "byteArray", "", "([B)V", "bytes", "getBytes", "()[B", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmUUIDImpl implements RealmUUID {
    private static final int UUID_BYTE_SIZE = 16;
    private final byte[] bytes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Regex> UUID_REGEX$delegate = LazyKt.lazy(new Function0() { // from class: io.realm.kotlin.internal.RealmUUIDImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RealmUUIDImpl.UUID_REGEX_delegate$lambda$1();
        }
    });

    @Override // io.realm.kotlin.types.RealmUUID
    public byte[] getBytes() {
        return this.bytes;
    }

    public RealmUUIDImpl() {
        byte[] bArrNextBytes = SecureRandom.INSTANCE.nextBytes(16);
        byte b = (byte) (bArrNextBytes[6] & Ascii.SI);
        bArrNextBytes[6] = b;
        bArrNextBytes[6] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
        byte b2 = (byte) (bArrNextBytes[8] & Utf8.REPLACEMENT_BYTE);
        bArrNextBytes[8] = b2;
        bArrNextBytes[8] = (byte) (b2 | (-128));
        this.bytes = bArrNextBytes;
    }

    public RealmUUIDImpl(String uuidString) {
        Intrinsics.checkNotNullParameter(uuidString, "uuidString");
        this.bytes = INSTANCE.parseUUIDString(uuidString);
    }

    public RealmUUIDImpl(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length != 16) {
            throw new IllegalArgumentException("Invalid 'bytes' size " + byteArray.length + ", byte array size must be 16");
        }
        this.bytes = byteArray;
    }

    @Override // io.realm.kotlin.types.RealmUUID
    public boolean equals(Object other) {
        if (other != null && (other instanceof RealmUUID)) {
            return Arrays.equals(((RealmUUID) other).getBytes(), getBytes());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(getBytes());
    }

    @Override // io.realm.kotlin.types.RealmUUID
    public String toString() {
        return HexadecimalKt.toHexString(getBytes(), 0, 4) + '-' + HexadecimalKt.toHexString(getBytes(), 4, 6) + '-' + HexadecimalKt.toHexString(getBytes(), 6, 8) + '-' + HexadecimalKt.toHexString(getBytes(), 8, 10) + '-' + HexadecimalKt.toHexString(getBytes(), 10, 16);
    }

    /* JADX INFO: compiled from: RealmUUIDImpl.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lio/realm/kotlin/internal/RealmUUIDImpl$Companion;", "", "<init>", "()V", "UUID_BYTE_SIZE", "", "UUID_REGEX", "Lkotlin/text/Regex;", "getUUID_REGEX", "()Lkotlin/text/Regex;", "UUID_REGEX$delegate", "Lkotlin/Lazy;", "parseUUIDString", "", "uuidString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final Regex getUUID_REGEX() {
            return (Regex) RealmUUIDImpl.UUID_REGEX$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] parseUUIDString(String uuidString) {
            MatchResult matchResultMatchEntire = getUUID_REGEX().matchEntire(uuidString);
            if (matchResultMatchEntire == null) {
                throw new IllegalArgumentException("Invalid string representation of an UUID: '" + uuidString + '\'');
            }
            IntRange intRange = new IntRange(1, 5);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(((IntIterator) it).nextInt());
                Intrinsics.checkNotNull(matchGroup);
                arrayList.add(HexadecimalKt.parseHex(matchGroup.getValue()));
            }
            ArrayList arrayList2 = arrayList;
            return ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus((byte[]) arrayList2.get(0), (byte[]) arrayList2.get(1)), (byte[]) arrayList2.get(2)), (byte[]) arrayList2.get(3)), (byte[]) arrayList2.get(4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex UUID_REGEX_delegate$lambda$1() {
        return new Regex("([0-9a-fA-F]{8})-([0-9a-fA-F]{4})-([0-9a-fA-F]{4})-([0-9a-fA-F]{4})-([0-9a-fA-F]{12})");
    }
}
