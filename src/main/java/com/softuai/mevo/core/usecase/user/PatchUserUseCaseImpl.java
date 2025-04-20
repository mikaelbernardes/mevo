package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.gateway.UserGateway;

import java.util.Map;

public class PatchUserUseCaseImpl implements PatchUserUseCase {

    private final UserGateway userGateway;

    public PatchUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(Long id, Map<String, Object> updates) {
        return userGateway.PatchUserUseCase(id, updates);
    }

}
