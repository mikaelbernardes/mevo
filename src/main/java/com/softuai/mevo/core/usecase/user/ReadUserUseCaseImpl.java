package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.gateway.UserGateway;

public class ReadUserUseCaseImpl implements ReadUserUseCase {

    private final UserGateway userGateway;

    public ReadUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(Long id) {
        return userGateway.ReadUserUseCase(id);
    }

}
