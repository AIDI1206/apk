package com.android.apksig;

import androidx.collection.SieveCacheKt;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Hints {
    public static final String PIN_BYTE_RANGE_ZIP_ENTRY_NAME = "pinlist.meta";
    public static final String PIN_HINT_ASSET_ZIP_ENTRY_NAME = "assets/com.android.hints.pins.txt";

    private static int clampToInt(long value) {
        return (int) Math.max(0L, Math.min(value, SieveCacheKt.NodeLinkMask));
    }

    public static final class ByteRange {
        final long end;
        final long start;

        public ByteRange(long start, long end) {
            this.start = start;
            this.end = end;
        }
    }

    public static final class PatternWithRange {
        final long offset;
        final Pattern pattern;
        final long size;

        public PatternWithRange(String pattern) {
            this.pattern = Pattern.compile(pattern);
            this.offset = 0L;
            this.size = Long.MAX_VALUE;
        }

        public PatternWithRange(String pattern, long offset, long size) {
            this.pattern = Pattern.compile(pattern);
            this.offset = offset;
            this.size = size;
        }

        public Matcher matcher(CharSequence input) {
            return this.pattern.matcher(input);
        }

        public ByteRange ClampToAbsoluteByteRange(ByteRange rangeIn) {
            if (rangeIn.end - rangeIn.start < this.offset) {
                return null;
            }
            long j = rangeIn.start + this.offset;
            return new ByteRange(j, Math.min(rangeIn.end - j, this.size) + j);
        }
    }

    public static byte[] encodeByteRangeList(List<ByteRange> pinByteRanges) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(pinByteRanges.size() * 8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            for (ByteRange byteRange : pinByteRanges) {
                dataOutputStream.writeInt(clampToInt(byteRange.start));
                dataOutputStream.writeInt(clampToInt(byteRange.end - byteRange.start));
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError("impossible", e);
        }
    }

    public static ArrayList<PatternWithRange> parsePinPatterns(byte[] patternBlob) {
        ArrayList<PatternWithRange> arrayList = new ArrayList<>();
        try {
            for (String str : new String(patternBlob, "UTF-8").split(IOUtils.LINE_SEPARATOR_UNIX)) {
                String strReplaceFirst = str.replaceFirst("#.*", "");
                String[] strArrSplit = strReplaceFirst.split(" ");
                if (strArrSplit.length == 1) {
                    arrayList.add(new PatternWithRange(strArrSplit[0]));
                } else if (strArrSplit.length == 3) {
                    long j = Long.parseLong(strArrSplit[1]);
                    arrayList.add(new PatternWithRange(strArrSplit[0], j, Long.parseLong(strArrSplit[2]) - j));
                } else {
                    throw new AssertionError("bad pin pattern line " + strReplaceFirst);
                }
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 must be supported", e);
        }
    }
}
