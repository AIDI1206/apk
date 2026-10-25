package org.zeroturnaround.zip.extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes7.dex */
public class ExtraFieldUtils {
    private static final int WORD = 4;
    private static final Map<ZipShort, Class<?>> implementations = new ConcurrentHashMap();

    static {
        register(AsiExtraField.class);
    }

    public static void register(Class<?> cls) {
        try {
            implementations.put(((ZipExtraField) cls.newInstance()).getHeaderId(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            throw new RuntimeException(cls + " is not a concrete class");
        }
    }

    public static ZipExtraField createExtraField(ZipShort zipShort) throws IllegalAccessException, InstantiationException {
        Class<?> cls = implementations.get(zipShort);
        if (cls != null) {
            return (ZipExtraField) cls.newInstance();
        }
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        unrecognizedExtraField.setHeaderId(zipShort);
        return unrecognizedExtraField;
    }

    public static ZipExtraField[] parseA(byte[] bArr) throws ZipException {
        List<ZipExtraField> list = parse(bArr);
        return (ZipExtraField[]) list.toArray(new ZipExtraField[list.size()]);
    }

    public static List<ZipExtraField> parse(byte[] bArr) throws ZipException {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            int i = 0;
            while (i <= bArr.length - 4) {
                ZipShort zipShort = new ZipShort(bArr, i);
                int value = new ZipShort(bArr, i + 2).getValue();
                int i2 = i + 4;
                if (i2 + value > bArr.length) {
                    throw new ZipException("bad extra field starting at " + i + ".  Block length of " + value + " bytes exceeds remaining data of " + ((bArr.length - i) - 4) + " bytes.");
                }
                try {
                    ZipExtraField zipExtraFieldCreateExtraField = createExtraField(zipShort);
                    zipExtraFieldCreateExtraField.parseFromLocalFileData(bArr, i2, value);
                    arrayList.add(zipExtraFieldCreateExtraField);
                    i += value + 4;
                } catch (IllegalAccessException e) {
                    throw new ZipException(e.getMessage());
                } catch (InstantiationException e2) {
                    throw new ZipException(e2.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static byte[] mergeLocalFileDataData(List<ZipExtraField> list) {
        int size = list.size() * 4;
        Iterator<ZipExtraField> it = list.iterator();
        while (it.hasNext()) {
            size += it.next().getLocalFileDataLength().getValue();
        }
        byte[] bArr = new byte[size];
        int length = 0;
        for (ZipExtraField zipExtraField : list) {
            System.arraycopy(zipExtraField.getHeaderId().getBytes(), 0, bArr, length, 2);
            System.arraycopy(zipExtraField.getLocalFileDataLength().getBytes(), 0, bArr, length + 2, 2);
            byte[] localFileDataData = zipExtraField.getLocalFileDataData();
            System.arraycopy(localFileDataData, 0, bArr, length + 4, localFileDataData.length);
            length += localFileDataData.length + 4;
        }
        return bArr;
    }
}
