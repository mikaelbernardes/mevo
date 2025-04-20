package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class AuthenticationUserUseCaseImpl implements AuthenticationUserUseCase {

    private final UserGateway userGateway;

    public AuthenticationUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public String execute(String email, String password) {
        return userGateway.AuthenticationUserUseCase(email, password);
    }

}
