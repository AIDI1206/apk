package io.realm.kotlin.internal.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: compiled from: Validation.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J(\u0010\b\u001a\u0002H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0086\b¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\t\u0018\u0001*\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0086\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\u0010\u0001(\u0000J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\u0014\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018ò\u0001\u0004\n\u00028\u0000¨\u0006\u0019"}, d2 = {"Lio/realm/kotlin/internal/util/Validation;", "", "<init>", "()V", "illegalArgument", "", "message", "", "checkType", ExifInterface.GPS_DIRECTION_TRUE, "value", "name", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "isType", "", HelpFormatter.DEFAULT_ARG_NAME, "errorMessage", "isEmptyString", "", "str", "checkEmpty", "sdkError", "require", "lazyMessage", "Lkotlin/Function0;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Validation {
    public static final Validation INSTANCE = new Validation();

    private Validation() {
    }

    public final Void illegalArgument(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> T checkType(Object value, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (value instanceof Object) {
            return value;
        }
        StringBuilder sbAppend = new StringBuilder("Argument '").append(name).append("' must be of type ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        illegalArgument(sbAppend.append(Reflection.getOrCreateKotlinClass(Object.class).getSimpleName()).toString());
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void isType$default(Validation validation, Object obj, String errorMessage, int i, Object obj2) {
        if ((i & 2) != 0) {
            StringBuilder sbAppend = new StringBuilder("Object '").append(obj).append("' is not of type ");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            errorMessage = sbAppend.append(Reflection.getOrCreateKotlinClass(Object.class).getQualifiedName()).toString();
        }
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (!(obj instanceof Object)) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public final /* synthetic */ <T> void isType(Object arg, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (!(arg instanceof Object)) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public final boolean isEmptyString(String str) {
        return str == null || str.length() == 0;
    }

    public final String checkEmpty(String value, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isEmptyString(value)) {
            illegalArgument("Argument '" + name + "' must be non-empty.");
            throw new KotlinNothingValueException();
        }
        Intrinsics.checkNotNull(value);
        return value;
    }

    public final Void sdkError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new RuntimeException(message);
    }

    public final void require(boolean value, Function0<String> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!value) {
            throw new IllegalArgumentException(lazyMessage.invoke());
        }
    }
}
