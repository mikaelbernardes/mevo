package com.softuai.mevo.core.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("Usuário não cadastrado");
    }

}
