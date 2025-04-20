package com.softuai.mevo.core.usecase.user;

import com.softuai.mevo.core.entity.User;

import java.util.Map;

public interface PatchUserUseCase {

    User execute(Long id, Map<String, Object> updates);

}
