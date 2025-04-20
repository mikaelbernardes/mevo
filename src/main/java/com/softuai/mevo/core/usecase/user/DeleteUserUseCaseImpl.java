package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.gateway.UserGateway;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserGateway userGateway;

    public DeleteUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long id) {
        userGateway.DeleteUserUseCase(id);
    }

}
