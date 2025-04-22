package com.softuai.mevo.core.exception;

public class PhoneNumberAlreadyExists extends RuntimeException {
    public PhoneNumberAlreadyExists() {
        super("O número de celular já esta cadastrado");
    }
}
