package com.softuai.mevo.core.usecase.user;

public interface ResetPasswordUseCase {

    void execute(String token, String newPassword);

}
