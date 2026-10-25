package org.mongodb.kbson.internal.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.mongodb.kbson.BsonObjectId;

/* JADX INFO: compiled from: BsonInput.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u000eH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0018H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001b"}, d2 = {"Lorg/mongodb/kbson/internal/io/BsonInput;", "", "position", "", "getPosition", "()I", "readByte", "", "readBytes", "", "bytes", TypedValues.CycleType.S_WAVE_OFFSET, "length", "readCString", "", "readDouble", "", "readInt32", "readInt64", "", "readObjectId", "Lorg/mongodb/kbson/BsonObjectId;", "readString", "skip", "", "numBytes", "skipCString", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface BsonInput {
    int getPosition();

    byte readByte();

    byte[] readBytes(byte[] bytes);

    byte[] readBytes(byte[] bytes, int offset, int length);

    String readCString();

    double readDouble();

    int readInt32();

    long readInt64();

    BsonObjectId readObjectId();

    String readString();

    void skip(int numBytes);

    void skipCString();
}
