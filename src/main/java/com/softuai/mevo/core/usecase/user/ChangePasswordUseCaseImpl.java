package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class ChangePasswordUseCaseImpl implements ChangePasswordUseCase {

    private final UserGateway userGateway;

    public ChangePasswordUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long userId, String currentPassword, String newPassword) {
        userGateway.ChangePasswordUseCase(userId, currentPassword, newPassword);
    }

}
