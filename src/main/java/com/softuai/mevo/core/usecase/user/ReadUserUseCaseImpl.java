package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.exception.UserNotFoundException;
import com.softuai.mevo.core.gateway.UserGateway;

public class ReadUserUseCaseImpl implements ReadUserUseCase {

    private final UserGateway userGateway;

    public ReadUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(Long id) {

        if (!userGateway.existsById(id)) {
            throw new UserNotFoundException();
        }

        return userGateway.ReadUserUseCase(id);
    }

}
