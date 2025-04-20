package com.softuai.mevo.core.usecase.user;

public interface ChangeEmailUseCase {

    void execute(Long userId, String newEmail, String currentPassword);

}
