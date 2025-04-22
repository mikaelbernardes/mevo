package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.exception.EmailAlreadyExistsException;
import com.softuai.mevo.core.exception.PhoneNumberAlreadyExists;
import com.softuai.mevo.core.gateway.UserGateway;
import com.softuai.mevo.core.validation.UserValidator;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserGateway userGateway;
    private final UserValidator userValidator;

    public CreateUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
        this.userValidator = new UserValidator();
    }

    @Override
    public User execute(User user) {

        userValidator.validate(user);

        if (userGateway.existsByEmail(user.email())) {
            throw new EmailAlreadyExistsException();
        }

        if (userGateway.existsByPhoneNumber(user.phoneNumber())) {
            throw new PhoneNumberAlreadyExists();
        }

        return userGateway.CreateUserUseCase(user);
    }

}
