package com.softuai.mevo.infrastructure.gateway;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.gateway.UserGateway;

import java.util.Map;

public class UserJpaGateway implements UserGateway {

    @Override
    public String AuthenticationUserUseCase(String email, String password) {
        return "";
    }

    @Override
    public void ChangeEmailUseCase(Long userId, String newEmail, String currentPassword) {

    }

    @Override
    public void ChangePasswordUseCase(Long userId, String currentPassword, String newPassword) {

    }

    @Override
    public User CreateUserUseCase(User user) {
        return null;
    }

    @Override
    public void DeleteUserUseCase(Long id) {

    }

    @Override
    public void LogoutUserUseCase(Long userId) {

    }

    @Override
    public User PatchUserUseCase(Long id, Map<String, Object> updates) {
        return null;
    }

    @Override
    public void RequestPasswordResetUseCase(String email) {

    }

    @Override
    public void ResendVerificationEmailUseCase(String email) {

    }

    @Override
    public void ResetPasswordUseCase(String token, String newPassword) {

    }

    @Override
    public User UpdateUserUseCase(Long id, User user) {
        return null;
    }

    @Override
    public void VerifyEmailUseCase(String token) {

    }

}
