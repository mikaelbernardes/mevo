package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.exception.UserNotFoundException;
import com.softuai.mevo.core.gateway.UserGateway;
import com.softuai.mevo.core.validation.UserValidator;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserGateway userGateway;
    private final UserValidator userValidator;

    public UpdateUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
        this.userValidator = new UserValidator();
    }

    @Override
    public User execute(Long id, User user) {

        if (userGateway.existsById(id)) {
            throw new UserNotFoundException();
        }

        userValidator.validate(user);

        return userGateway.UpdateUserUseCase(id, user);
    }

}
