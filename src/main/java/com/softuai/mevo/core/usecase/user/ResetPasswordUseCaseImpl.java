package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class ResetPasswordUseCaseImpl implements ResetPasswordUseCase {

    private final UserGateway userGateway;

    public ResetPasswordUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(String token, String newPassword) {
        userGateway.ResetPasswordUseCase(token, newPassword);
    }

}
