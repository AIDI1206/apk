package com.android.apksig;

import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface ApkSignerEngine extends Closeable {

    public interface InspectJarEntryRequest {
        void done();

        DataSink getDataSink();

        String getEntryName();
    }

    @Deprecated
    public interface OutputApkSigningBlockRequest {
        void done();

        byte[] getApkSigningBlock();
    }

    public interface OutputApkSigningBlockRequest2 {
        void done();

        byte[] getApkSigningBlock();

        int getPaddingSizeBeforeApkSigningBlock();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void inputApkSigningBlock(DataSource apkSigningBlock) throws IllegalStateException, IOException, ApkFormatException;

    InputJarEntryInstructions inputJarEntry(String entryName) throws IllegalStateException;

    InputJarEntryInstructions.OutputPolicy inputJarEntryRemoved(String entryName) throws IllegalStateException;

    default boolean isEligibleForSourceStamp() {
        return false;
    }

    void outputDone() throws IllegalStateException;

    OutputJarSignatureRequest outputJarEntries() throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, ApkFormatException;

    InspectJarEntryRequest outputJarEntry(String entryName) throws IllegalStateException;

    void outputJarEntryRemoved(String entryName) throws IllegalStateException;

    @Deprecated
    OutputApkSigningBlockRequest outputZipSections(DataSource zipEntries, DataSource zipCentralDirectory, DataSource zipEocd) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, ApkFormatException;

    OutputApkSigningBlockRequest2 outputZipSections2(DataSource zipEntries, DataSource zipCentralDirectory, DataSource zipEocd) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, ApkFormatException;

    void signV4(DataSource data, File outputFile, boolean ignoreFailures) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, IOException;

    default void setExecutor(RunnablesExecutor executor) {
        throw new UnsupportedOperationException("setExecutor method is not implemented");
    }

    default Set<String> initWith(byte[] manifestBytes, Set<String> entryNames) {
        throw new UnsupportedOperationException("initWith method is not implemented");
    }

    default byte[] generateSourceStampCertificateDigest() throws SignatureException {
        return new byte[0];
    }

    public static class InputJarEntryInstructions {
        private final InspectJarEntryRequest mInspectJarEntryRequest;
        private final OutputPolicy mOutputPolicy;

        public enum OutputPolicy {
            SKIP,
            OUTPUT,
            OUTPUT_BY_ENGINE
        }

        public InputJarEntryInstructions(OutputPolicy outputPolicy) {
            this(outputPolicy, null);
        }

        public InputJarEntryInstructions(OutputPolicy outputPolicy, InspectJarEntryRequest inspectJarEntryRequest) {
            this.mOutputPolicy = outputPolicy;
            this.mInspectJarEntryRequest = inspectJarEntryRequest;
        }

        public OutputPolicy getOutputPolicy() {
            return this.mOutputPolicy;
        }

        public InspectJarEntryRequest getInspectJarEntryRequest() {
            return this.mInspectJarEntryRequest;
        }
    }

    public interface OutputJarSignatureRequest {
        void done();

        List<JarEntry> getAdditionalJarEntries();

        public static class JarEntry {
            private final byte[] mData;
            private final String mName;

            public JarEntry(String name, byte[] data) {
                this.mName = name;
                this.mData = (byte[]) data.clone();
            }

            public String getName() {
                return this.mName;
            }

            public byte[] getData() {
                return (byte[]) this.mData.clone();
            }
        }
    }
}
