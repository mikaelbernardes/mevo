package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class ResendVerificationEmailUseCaseImpl implements ResendVerificationEmailUseCase {

    private final UserGateway userGateway;

    public ResendVerificationEmailUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(String email) {
        userGateway.ResendVerificationEmailUseCase(email);
    }

}
