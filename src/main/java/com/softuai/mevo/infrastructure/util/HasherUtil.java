package com.softuai.mevo.infrastructure.util;

import com.password4j.Hash;
import com.password4j.Password;
import org.springframework.stereotype.Component;

@Component
public class HasherUtil {

    public String hash(String plainPassword) {
        Hash hash = Password.hash(plainPassword)
                .addRandomSalt()
                .withArgon2();
        return hash.getResult();
    }

    public boolean verify(String plainPassword, String hashedPassword) {
        return Password.check(plainPassword, hashedPassword)
                .withArgon2();
    }
}
