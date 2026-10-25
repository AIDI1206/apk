package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.google.android.exoplayer2.metadata.id3.Id3Decoder$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
        }
    };
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    static /* synthetic */ boolean lambda$static$0(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata decode(byte[] bArr, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i2, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i2, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z, i2, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i);
                synchSafeInt -= i + 4;
            }
        } else {
            if (unsignedByte != 4) {
                Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new Id3Header(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[PHI: r3
  0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i3;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.bytesLeft() < i2) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (unsignedInt25 < i3) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() >= unsignedInt25) {
                    parsableByteArray.skipBytes((int) unsignedInt25);
                } else {
                    parsableByteArray.setPosition(position);
                    return false;
                }
            } catch (Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:163:0x0201  */
    /* JADX WARN: Code duplicated, block: B:165:0x0207  */
    /* JADX WARN: Code duplicated, block: B:171:0x0216 A[Catch: UnsupportedEncodingException -> 0x0242, all -> 0x024b, TryCatch #0 {UnsupportedEncodingException -> 0x0242, blocks: (B:173:0x0220, B:162:0x01fc, B:170:0x0211, B:171:0x0216), top: B:185:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0220 A[Catch: UnsupportedEncodingException -> 0x0242, all -> 0x024b, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0242, blocks: (B:173:0x0220, B:162:0x01fc, B:170:0x0211, B:171:0x0216), top: B:185:0x0110 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v10, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static Id3Frame decodeFrame(int i, ParsableByteArray parsableByteArray, boolean z, int i2, FramePredicate framePredicate) throws Throwable {
        int unsignedInt24;
        ?? r1;
        boolean z2;
        boolean z3;
        ?? r16;
        boolean z4;
        int i3;
        int i4;
        ?? r10;
        int i5;
        ParsableByteArray parsableByteArray2;
        Id3Frame id3FrameDecodeBinaryFrame;
        ?? r11;
        int i6 = i;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedByte3 = parsableByteArray.readUnsignedByte();
        boolean z5 = false;
        int unsignedByte4 = i6 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i6 == 4) {
            unsignedInt24 = parsableByteArray.readUnsignedIntToInt();
            if (!z) {
                unsignedInt24 = (((unsignedInt24 >> 24) & 255) << 21) | (unsignedInt24 & 255) | (((unsignedInt24 >> 8) & 255) << 7) | (((unsignedInt24 >> 16) & 255) << 14);
            }
        } else if (i6 == 3) {
            unsignedInt24 = parsableByteArray.readUnsignedIntToInt();
        } else {
            unsignedInt24 = parsableByteArray.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedInt24;
        int unsignedShort = i6 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray.limit()) {
            Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            r1 = unsignedByte2;
            if (!framePredicate.evaluate(i6, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4)) {
                i6 = i6;
                parsableByteArray.setPosition(position);
                return null;
            }
        } else {
            r1 = unsignedByte2;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (unsignedShort & 128) != 0;
            boolean z6 = (unsignedShort & 64) != 0;
            z4 = false;
            z5 = z2;
            z3 = (unsignedShort & 32) != 0;
            r16 = z6;
        } else if (i6 == 4) {
            boolean z7 = (unsignedShort & 64) != 0;
            boolean z8 = (unsignedShort & 8) != 0;
            boolean z9 = (unsignedShort & 4) != 0;
            boolean z10 = (unsignedShort & 2) != 0;
            z5 = (unsignedShort & 1) != 0;
            z3 = z7;
            z2 = z5;
            z5 = z8;
            r16 = z9;
            z4 = z10;
        } else {
            z2 = false;
            z3 = false;
            r16 = 0;
            z4 = false;
        }
        if (z5 || r16 != 0) {
            Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(position);
            return null;
        }
        if (z3) {
            iRemoveUnsynchronization--;
            parsableByteArray.skipBytes(1);
        }
        if (z2) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z4) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, iRemoveUnsynchronization);
        }
        try {
            try {
                try {
                    try {
                        if (unsignedByte == 84 && r1 == 88 && unsignedByte3 == 88 && (i6 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray, iRemoveUnsynchronization);
                        } else if (unsignedByte == 84) {
                            id3FrameDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i6, unsignedByte, r1, unsignedByte3, unsignedByte4));
                        } else if (unsignedByte == 87 && r1 == 88 && unsignedByte3 == 88 && (i6 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray, iRemoveUnsynchronization);
                        } else if (unsignedByte == 87) {
                            id3FrameDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i6, unsignedByte, r1, unsignedByte3, unsignedByte4));
                        } else {
                            if (unsignedByte == 80 && r1 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
                                id3FrameDecodeBinaryFrame = decodePrivFrame(parsableByteArray, iRemoveUnsynchronization);
                            } else {
                                r16 = 0;
                                try {
                                    if (unsignedByte == 71 && r1 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i6 == 2)) {
                                        id3FrameDecodeBinaryFrame = decodeGeobFrame(parsableByteArray, iRemoveUnsynchronization);
                                    } else if (i6 == 2) {
                                        if (unsignedByte == 80 && r1 == 73 && unsignedByte3 == 67) {
                                            id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i6);
                                        } else if (unsignedByte != 67 && r1 == 79 && unsignedByte3 == 77 && (unsignedByte4 == 77 || i6 == 2)) {
                                            id3FrameDecodeBinaryFrame = decodeCommentFrame(parsableByteArray, iRemoveUnsynchronization);
                                        } else if (unsignedByte != 67 && r1 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                                            int i7 = iRemoveUnsynchronization;
                                            i3 = unsignedByte3;
                                            i4 = i7;
                                            r11 = r1;
                                            i5 = unsignedByte4;
                                            try {
                                                id3FrameDecodeBinaryFrame = decodeChapterFrame(parsableByteArray, i4, i6, z, i2, framePredicate);
                                                i6 = i;
                                                r1 = parsableByteArray;
                                                r16 = r16;
                                            } catch (UnsupportedEncodingException unused) {
                                                r1 = parsableByteArray;
                                                Log.w(TAG, "Unsupported character encoding");
                                                r1.setPosition(position);
                                                return r16;
                                            } catch (Throwable th) {
                                                th = th;
                                                r1 = parsableByteArray;
                                                r1.setPosition(position);
                                                throw th;
                                            }
                                        } else {
                                            int i8 = iRemoveUnsynchronization;
                                            i3 = unsignedByte3;
                                            i4 = i8;
                                            r10 = r1;
                                            i5 = unsignedByte4;
                                            if (unsignedByte != 67 && r10 == 84 && i3 == 79 && i5 == 67) {
                                                i6 = i;
                                                ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                id3FrameDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray3, i4, i6, z, i2, framePredicate);
                                                r1 = parsableByteArray3;
                                                r11 = r10;
                                                r16 = r16;
                                            } else {
                                                i6 = i;
                                                parsableByteArray2 = parsableByteArray;
                                                if (unsignedByte != 77 && r10 == 76 && i3 == 76 && i5 == 84) {
                                                    id3FrameDecodeBinaryFrame = decodeMlltFrame(parsableByteArray2, i4);
                                                } else {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                }
                                            }
                                        }
                                    } else if (unsignedByte == 65 && r1 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67) {
                                        id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i6);
                                    } else {
                                        if (unsignedByte != 67) {
                                        }
                                        if (unsignedByte != 67) {
                                            int i9 = iRemoveUnsynchronization;
                                            i3 = unsignedByte3;
                                            i4 = i9;
                                            r10 = r1;
                                            i5 = unsignedByte4;
                                            if (unsignedByte != 67) {
                                                i6 = i;
                                                parsableByteArray2 = parsableByteArray;
                                                if (unsignedByte != 77) {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                } else {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                }
                                            } else {
                                                i6 = i;
                                                parsableByteArray2 = parsableByteArray;
                                                if (unsignedByte != 77) {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                } else {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                }
                                            }
                                        } else {
                                            int i10 = iRemoveUnsynchronization;
                                            i3 = unsignedByte3;
                                            i4 = i10;
                                            r10 = r1;
                                            i5 = unsignedByte4;
                                            if (unsignedByte != 67) {
                                                i6 = i;
                                                parsableByteArray2 = parsableByteArray;
                                                if (unsignedByte != 77) {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                } else {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                }
                                            } else {
                                                i6 = i;
                                                parsableByteArray2 = parsableByteArray;
                                                if (unsignedByte != 77) {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                } else {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, i4, getFrameId(i6, unsignedByte, r10 == true ? 1 : 0, i3, i5));
                                                    r1 = parsableByteArray2;
                                                    r11 = r10;
                                                    r16 = r16;
                                                }
                                            }
                                        }
                                    }
                                    int i11 = iRemoveUnsynchronization;
                                    i3 = unsignedByte3;
                                    i4 = i11;
                                    r11 = r1;
                                    i5 = unsignedByte4;
                                    r1 = parsableByteArray;
                                    r16 = r16;
                                } catch (UnsupportedEncodingException unused2) {
                                    r1 = parsableByteArray;
                                }
                            }
                            if (id3FrameDecodeBinaryFrame == null) {
                                r1 = parsableByteArray2;
                                r11 = r10;
                                r16 = r16;
                                Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i6, unsignedByte, r11, i3, i5) + ", frameSize=" + i4);
                            }
                            r1 = parsableByteArray2;
                            r11 = r10;
                            r16 = r16;
                            r1.setPosition(position);
                            return id3FrameDecodeBinaryFrame;
                        }
                        int i12 = iRemoveUnsynchronization;
                        i3 = unsignedByte3;
                        i4 = i12;
                        r11 = r1;
                        i5 = unsignedByte4;
                        r1 = parsableByteArray;
                        r16 = 0;
                        if (id3FrameDecodeBinaryFrame == null) {
                            r1 = parsableByteArray2;
                            r11 = r10;
                            r16 = r16;
                            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i6, unsignedByte, r11, i3, i5) + ", frameSize=" + i4);
                        }
                        r1 = parsableByteArray2;
                        r11 = r10;
                        r16 = r16;
                        r1.setPosition(position);
                        return id3FrameDecodeBinaryFrame;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (UnsupportedEncodingException unused3) {
                    r1 = parsableByteArray;
                    r16 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                r1 = parsableByteArray;
            }
        } catch (UnsupportedEncodingException unused4) {
        }
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfEos(bArr, iDelimiterLength, unsignedByte), charsetName));
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, indexOfEos(bArr, 0, unsignedByte), charsetName));
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), C.ISO88591_NAME));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), C.ISO88591_NAME));
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, C.ISO88591_NAME), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i));
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, iIndexOfZeroByte, C.ISO88591_NAME);
        int i3 = iIndexOfZeroByte + 1;
        int iIndexOfEos = indexOfEos(bArr, i3, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i3, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        int iIndexOfEos2 = indexOfEos(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(str, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfEos2, charsetName), copyOfRangeIfValid(bArr, iIndexOfEos2 + delimiterLength(unsignedByte), i2));
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i, int i2) throws UnsupportedEncodingException {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Util.toLowerInvariant(new String(bArr, 0, 3, C.ISO88591_NAME));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerInvariant = Util.toLowerInvariant(new String(bArr, 0, iIndexOfZeroByte, C.ISO88591_NAME));
            str = lowerInvariant.indexOf(47) == -1 ? "image/" + lowerInvariant : lowerInvariant;
        }
        int i4 = bArr[iIndexOfZeroByte + 1] & 255;
        int i5 = iIndexOfZeroByte + 2;
        int iIndexOfEos = indexOfEos(bArr, i5, unsignedByte);
        return new ApicFrame(str, new String(bArr, i5, iIndexOfEos - i5, charsetName), i4, copyOfRangeIfValid(bArr, iIndexOfEos + delimiterLength(unsignedByte), i3));
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int iIndexOfEos = indexOfEos(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfEos(bArr2, iDelimiterLength, unsignedByte), charsetName));
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, C.ISO88591_NAME);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i4 = parsableByteArray.readInt();
        int i5 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i6 = position + i;
        while (parsableByteArray.getPosition() < i6) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i4, i5, unsignedInt, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, C.ISO88591_NAME);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = (unsignedByte & 2) != 0;
        boolean z3 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i4 = 0; i4 < unsignedByte2; i4++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i4] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, C.ISO88591_NAME);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt25 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i2 = ((i - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i3] = bits;
            iArr2[i3] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= position + i) {
                return i;
            }
            if ((data[i2] & 255) == 255 && data[i3] == 0) {
                System.arraycopy(data, i2 + 2, data, i3, (i - (i2 - position)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String getCharsetName(int i) {
        if (i == 1) {
            return C.UTF16_NAME;
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i == 3) {
            return "UTF-8";
        }
        return C.ISO88591_NAME;
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int indexOfEos(byte[] bArr, int i, int i2) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if (iIndexOfZeroByte % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return Util.EMPTY_BYTE_ARRAY;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, str);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }
}
