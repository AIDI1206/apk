package com.android.apksig.internal.apk.stamp;

import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.util.Pair;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V1SourceStampSigner {
    public static final int V1_SOURCE_STAMP_BLOCK_ID = 722016414;

    private V1SourceStampSigner() {
    }

    public static Pair<byte[], Integer> generateSourceStampBlock(ApkSigningBlockUtils.SignerConfig sourceStampSignerConfig, Map<ContentDigestAlgorithm, byte[]> digestInfo) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
        if (sourceStampSignerConfig.certificates.isEmpty()) {
            throw new SignatureException("No certificates configured for signer");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ContentDigestAlgorithm, byte[]> entry : digestInfo.entrySet()) {
            arrayList.add(Pair.of(Integer.valueOf(entry.getKey().getId()), entry.getValue()));
        }
        Collections.sort(arrayList, Comparator.comparing(new V1SourceStampSigner$$ExternalSyntheticLambda0()));
        SourceStampBlock sourceStampBlock = new SourceStampBlock();
        try {
            sourceStampBlock.stampCertificate = sourceStampSignerConfig.certificates.get(0).getEncoded();
            sourceStampBlock.signedDigests = ApkSigningBlockUtils.generateSignaturesOverData(sourceStampSignerConfig, ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(arrayList));
            return Pair.of(ApkSigningBlockUtils.encodeAsLengthPrefixedElement(ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedElements(new byte[][]{sourceStampBlock.stampCertificate, ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(sourceStampBlock.signedDigests)})), 722016414);
        } catch (CertificateEncodingException e) {
            throw new SignatureException("Retrieving the encoded form of the stamp certificate failed", e);
        }
    }

    private static final class SourceStampBlock {
        public List<Pair<Integer, byte[]>> signedDigests;
        public byte[] stampCertificate;

        private SourceStampBlock() {
        }
    }
}
