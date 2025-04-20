package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class LogoutUserUseCaseImpl implements LogoutUserUseCase {

    private final UserGateway userGateway;

    public LogoutUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long userId) {
        userGateway.LogoutUserUseCase(userId);
    }

}
