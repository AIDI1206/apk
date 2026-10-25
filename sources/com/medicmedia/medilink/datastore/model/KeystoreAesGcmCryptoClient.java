package com.medicmedia.medilink.datastore.model;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: KeystoreEncrypted.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/KeystoreAesGcmCryptoClient;", "Lcom/medicmedia/medilink/datastore/model/CryptoClient;", "keyAlias", "", "<init>", "(Ljava/lang/String;)V", "encrypt", "plaintext", "", "decrypt", "payload", "getOrCreateSecretKey", "Ljavax/crypto/SecretKey;", "Companion", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class KeystoreAesGcmCryptoClient implements CryptoClient {
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final Companion Companion = new Companion(null);
    private static final String DEFAULT_KEY_ALIAS = "secure_prefs_aes_key";
    private static final int GCM_TAG_LENGTH_BITS = 128;
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";
    private final String keyAlias;

    public KeystoreAesGcmCryptoClient() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public KeystoreAesGcmCryptoClient(String keyAlias) {
        Intrinsics.checkNotNullParameter(keyAlias, "keyAlias");
        this.keyAlias = keyAlias;
    }

    public /* synthetic */ KeystoreAesGcmCryptoClient(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_KEY_ALIAS : str);
    }

    /* JADX INFO: compiled from: KeystoreEncrypted.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/KeystoreAesGcmCryptoClient$Companion;", "", "<init>", "()V", "ANDROID_KEYSTORE", "", "TRANSFORMATION", "GCM_TAG_LENGTH_BITS", "", "DEFAULT_KEY_ALIAS", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.medicmedia.medilink.datastore.model.CryptoClient
    public String encrypt(byte[] plaintext) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, getOrCreateSecretKey());
        byte[] iv = cipher.getIV();
        byte[] bArrDoFinal = cipher.doFinal(plaintext);
        return Base64.encodeToString(iv, 2) + ":" + Base64.encodeToString(bArrDoFinal, 2);
    }

    @Override // com.medicmedia.medilink.datastore.model.CryptoClient
    public byte[] decrypt(String payload) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        List listSplit$default = StringsKt.split$default((CharSequence) payload, new char[]{AbstractJsonLexerKt.COLON}, false, 2, 2, (Object) null);
        if (listSplit$default.size() != 2) {
            throw new IllegalArgumentException("Invalid payload".toString());
        }
        byte[] bArrDecode = Base64.decode((String) listSplit$default.get(0), 2);
        byte[] bArrDecode2 = Base64.decode((String) listSplit$default.get(1), 2);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(2, getOrCreateSecretKey(), new GCMParameterSpec(128, bArrDecode));
        byte[] bArrDoFinal = cipher.doFinal(bArrDecode2);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    private final SecretKey getOrCreateSecretKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(this.keyAlias, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        SecretKey secretKey = secretKeyEntry != null ? secretKeyEntry.getSecretKey() : null;
        if (secretKey != null) {
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", ANDROID_KEYSTORE);
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(this.keyAlias, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generateKey(...)");
        return secretKeyGenerateKey;
    }
}
