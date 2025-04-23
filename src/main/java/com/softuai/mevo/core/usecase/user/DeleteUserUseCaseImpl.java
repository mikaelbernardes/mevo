package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.exception.UserNotFoundException;
import com.softuai.mevo.core.gateway.UserGateway;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserGateway userGateway;

    public DeleteUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long id) {

        if (!userGateway.existsById(id)) {
            throw new UserNotFoundException();
        }

        userGateway.DeleteUserUseCase(id);
    }

}
