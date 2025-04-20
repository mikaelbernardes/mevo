package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class RequestPasswordResetUseCaseImpl implements RequestPasswordResetUseCase {

    private final UserGateway userGateway;

    public RequestPasswordResetUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(String email) {
        userGateway.RequestPasswordResetUseCase(email);
    }

}
