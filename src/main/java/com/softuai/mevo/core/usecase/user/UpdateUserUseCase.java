package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;

public interface UpdateUserUseCase {

    User execute(Long id, User user);

}
