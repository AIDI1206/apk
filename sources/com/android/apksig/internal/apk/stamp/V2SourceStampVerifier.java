package com.android.apksig.internal.apk.stamp;

import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureNotFoundException;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipSections;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V2SourceStampVerifier {
    private V2SourceStampVerifier() {
    }

    public static ApkSigResult verify(DataSource apk, ZipSections zipSections, byte[] sourceStampCertificateDigest, Map<Integer, Map<ContentDigestAlgorithm, byte[]>> signatureSchemeApkContentDigests, int minSdkVersion, int maxSdkVersion) throws SignatureNotFoundException, NoSuchAlgorithmException, IOException {
        ApkSigResult apkSigResult = new ApkSigResult(0);
        verify(ApkSigningBlockUtilsLite.findSignature(apk, zipSections, 1845461005).signatureBlock, sourceStampCertificateDigest, signatureSchemeApkContentDigests, minSdkVersion, maxSdkVersion, apkSigResult);
        return apkSigResult;
    }

    private static void verify(ByteBuffer sourceStampBlock, byte[] sourceStampCertificateDigest, Map<Integer, Map<ContentDigestAlgorithm, byte[]>> signatureSchemeApkContentDigests, int minSdkVersion, int maxSdkVersion, ApkSigResult result) throws NoSuchAlgorithmException {
        ApkSignerInfo apkSignerInfo = new ApkSignerInfo();
        result.mSigners.add(apkSignerInfo);
        try {
            SourceStampVerifier.verifyV2SourceStamp(ApkSigningBlockUtilsLite.getLengthPrefixedSlice(sourceStampBlock), CertificateFactory.getInstance("X.509"), apkSignerInfo, getSignatureSchemeDigests(signatureSchemeApkContentDigests), sourceStampCertificateDigest, minSdkVersion, maxSdkVersion);
            result.verified = (result.containsErrors() || result.containsWarnings()) ? false : true;
        } catch (ApkFormatException | BufferUnderflowException unused) {
            apkSignerInfo.addWarning(20, new Object[0]);
        } catch (CertificateException e) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e);
        }
    }

    private static Map<Integer, byte[]> getSignatureSchemeDigests(Map<Integer, Map<ContentDigestAlgorithm, byte[]>> signatureSchemeApkContentDigests) {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, Map<ContentDigestAlgorithm, byte[]>> entry : signatureSchemeApkContentDigests.entrySet()) {
            map.put(entry.getKey(), ApkSigningBlockUtilsLite.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(getApkDigests(entry.getValue())));
        }
        return map;
    }

    private static List<Pair<Integer, byte[]>> getApkDigests(Map<ContentDigestAlgorithm, byte[]> apkContentDigests) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ContentDigestAlgorithm, byte[]> entry : apkContentDigests.entrySet()) {
            arrayList.add(Pair.of(Integer.valueOf(entry.getKey().getId()), entry.getValue()));
        }
        Collections.sort(arrayList, new Comparator<Pair<Integer, byte[]>>() { // from class: com.android.apksig.internal.apk.stamp.V2SourceStampVerifier.1
            @Override // java.util.Comparator
            public int compare(Pair<Integer, byte[]> pair1, Pair<Integer, byte[]> pair2) {
                return pair1.getFirst().intValue() - pair2.getFirst().intValue();
            }
        });
        return arrayList;
    }
}
