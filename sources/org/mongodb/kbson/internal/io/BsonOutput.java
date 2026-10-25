package org.mongodb.kbson.internal.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.mongodb.kbson.BsonObjectId;
import org.mongodb.kbson.internal.Closeable;

/* JADX INFO: compiled from: BsonOutput.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\u001d"}, d2 = {"Lorg/mongodb/kbson/internal/io/BsonOutput;", "Lorg/mongodb/kbson/internal/Closeable;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "size", "getSize", "writeByte", "", "value", "", "writeBytes", "bytes", "", TypedValues.CycleType.S_WAVE_OFFSET, "length", "writeCString", "", "writeDouble", "", "writeInt32", "writeInt64", "", "writeObjectId", "Lorg/mongodb/kbson/BsonObjectId;", "writeString", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface BsonOutput extends Closeable {
    int getPosition();

    int getSize();

    void setPosition(int i);

    void writeByte(byte value);

    void writeBytes(byte[] bytes);

    void writeBytes(byte[] bytes, int offset, int length);

    void writeCString(String value);

    void writeDouble(double value);

    void writeInt32(int value);

    void writeInt32(int position, int value);

    void writeInt64(long value);

    void writeObjectId(BsonObjectId value);

    void writeString(String value);
}
