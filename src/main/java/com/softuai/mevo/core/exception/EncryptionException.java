package com.softuai.mevo.core.exception;

public class EncryptionException extends RuntimeException {

    public EncryptionException() {
        super("Erro ao criptografar ou descriptografar informação");
    }

}
