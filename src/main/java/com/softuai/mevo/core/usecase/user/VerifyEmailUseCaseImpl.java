package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class VerifyEmailUseCaseImpl implements VerifyEmailUseCase {

    private final UserGateway userGateway;

    public VerifyEmailUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(String token) {
        userGateway.VerifyEmailUseCase(token);
    }

}
