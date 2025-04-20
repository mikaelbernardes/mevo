package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class ChangeEmailUseCaseImpl implements ChangeEmailUseCase {

    private final UserGateway userGateway;

    public ChangeEmailUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long userId, String newEmail, String currentPassword) {
        userGateway.ChangeEmailUseCase(userId, newEmail, currentPassword);
    }

}
