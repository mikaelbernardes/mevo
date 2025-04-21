package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;

public interface ReadUserUseCase {

    User execute(Long id);

}
