package com.softuai.mevo.core.gateway;

import com.softuai.mevo.core.entity.User;

import java.util.Map;

public interface UserGateway {

    String AuthenticationUserUseCase(String email, String password);
    void ChangeEmailUseCase(Long userId, String newEmail, String currentPassword);
    void ChangePasswordUseCase(Long userId, String currentPassword, String newPassword);
    User CreateUserUseCase(User user);
    void DeleteUserUseCase(Long id);
    void LogoutUserUseCase(Long userId);
    User PatchUserUseCase(Long id, Map<String, Object> updates);
    User ReadUserUseCase(Long id);
    void RequestPasswordResetUseCase(String email);
    void ResendVerificationEmailUseCase(String email);
    void ResetPasswordUseCase(String token, String newPassword);
    User UpdateUserUseCase(Long id, User user);
    void VerifyEmailUseCase(String token);
    boolean existsById(Long id);
    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(String phoneNumber);


}
