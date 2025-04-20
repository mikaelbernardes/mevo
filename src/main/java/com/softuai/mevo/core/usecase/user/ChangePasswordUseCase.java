package com.softuai.mevo.core.usecase.user;

public interface ChangePasswordUseCase {

    void execute(Long userId, String currentPassword, String newPassword);

}
