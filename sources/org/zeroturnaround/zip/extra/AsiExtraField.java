package org.zeroturnaround.zip.extra;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes7.dex */
public class AsiExtraField implements ZipExtraField, Cloneable {
    private static final ZipShort HEADER_ID = new ZipShort(30062);
    private static final int WORD = 4;
    final int PERM_MASK = 4095;
    final int LINK_FLAG = 40960;
    final int FILE_FLAG = 32768;
    final int DIR_FLAG = 16384;
    final int DEFAULT_LINK_PERM = 511;
    final int DEFAULT_DIR_PERM = 493;
    final int DEFAULT_FILE_PERM = TypedValues.CycleType.TYPE_EASING;
    private int mode = 0;
    private int uid = 0;
    private int gid = 0;
    private String link = "";
    private boolean dirFlag = false;
    private CRC32 crc = new CRC32();

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(getLinkedFile().getBytes().length + 14);
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public byte[] getLocalFileDataData() {
        int value = getLocalFileDataLength().getValue();
        int i = value - 4;
        byte[] bArr = new byte[i];
        System.arraycopy(ZipShort.getBytes(getMode()), 0, bArr, 0, 2);
        byte[] bytes = getLinkedFile().getBytes();
        System.arraycopy(ZipLong.getBytes(bytes.length), 0, bArr, 2, 4);
        System.arraycopy(ZipShort.getBytes(getUserId()), 0, bArr, 6, 2);
        System.arraycopy(ZipShort.getBytes(getGroupId()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.crc.reset();
        this.crc.update(bArr);
        byte[] bArr2 = new byte[value];
        System.arraycopy(ZipLong.getBytes(this.crc.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, i);
        return bArr2;
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    public void setUserId(int i) {
        this.uid = i;
    }

    public int getUserId() {
        return this.uid;
    }

    public void setGroupId(int i) {
        this.gid = i;
    }

    public int getGroupId() {
        return this.gid;
    }

    public void setLinkedFile(String str) {
        this.link = str;
        this.mode = getMode(this.mode);
    }

    public String getLinkedFile() {
        return this.link;
    }

    public boolean isLink() {
        return getLinkedFile().length() != 0;
    }

    public void setMode(int i) {
        this.mode = getMode(i);
    }

    public int getMode() {
        return this.mode;
    }

    public void setDirectory(boolean z) {
        this.dirFlag = z;
        this.mode = getMode(this.mode);
    }

    public boolean isDirectory() {
        return this.dirFlag && !isLink();
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        long value = ZipLong.getValue(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.crc.reset();
        this.crc.update(bArr2);
        long value2 = this.crc.getValue();
        if (value != value2) {
            throw new ZipException("bad CRC checksum " + Long.toHexString(value) + " instead of " + Long.toHexString(value2));
        }
        int value3 = ZipShort.getValue(bArr2, 0);
        int value4 = (int) ZipLong.getValue(bArr2, 2);
        byte[] bArr3 = new byte[value4];
        this.uid = ZipShort.getValue(bArr2, 6);
        this.gid = ZipShort.getValue(bArr2, 8);
        if (value4 == 0) {
            this.link = "";
        } else {
            System.arraycopy(bArr2, 10, bArr3, 0, value4);
            this.link = new String(bArr3);
        }
        setDirectory((value3 & 16384) != 0);
        setMode(value3);
    }

    protected int getMode(int i) {
        int i2;
        if (isLink()) {
            i2 = 40960;
        } else {
            i2 = isDirectory() ? 16384 : 32768;
        }
        return (i & 4095) | i2;
    }

    public Object clone() {
        try {
            AsiExtraField asiExtraField = (AsiExtraField) super.clone();
            asiExtraField.crc = new CRC32();
            return asiExtraField;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
