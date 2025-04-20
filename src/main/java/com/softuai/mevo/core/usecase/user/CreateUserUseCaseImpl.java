package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.gateway.UserGateway;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserGateway userGateway;

    public CreateUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User user) {
        return userGateway.CreateUserUseCase(user);
    }

}
