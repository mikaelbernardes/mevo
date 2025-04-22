package com.softuai.mevo.infrastructure.util;

import com.softuai.mevo.core.exception.EncryptionException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

@Component
public class CryptoUtil {

    private final String algorithm;
    private final String secretKey;

    public CryptoUtil(
            @Value("${crypto.secret.key}") String secretKey,
            @Value("${crypto.secret.algorithm}") String algorithm
    ) {
        this.secretKey = secretKey;
        this.algorithm = algorithm;
    }

    public String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(algorithm);
            SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encrypted = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            throw new EncryptionException();
        }
    }

    public String decrypt(String encryptedData) {
        try {
            Cipher cipher = Cipher.getInstance(algorithm);
            SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), algorithm);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            return new String(decrypted);
        } catch (Exception e) {
            throw new EncryptionException();
        }
    }
}
