package com.softuai.mevo.infrastructure.configuration;

import com.softuai.mevo.core.gateway.UserGateway;
import com.softuai.mevo.core.usecase.user.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBeanConfiguration {
    
    @Bean
    public AuthenticationUserUseCase authenticationUserUseCase(UserGateway userGateway) {
        return new AuthenticationUserUseCaseImpl(userGateway);
    }

    @Bean
    public ChangeEmailUseCase changeEmailUseCase(UserGateway userGateway) {
        return new ChangeEmailUseCaseImpl(userGateway);
    }

    @Bean
    public ChangePasswordUseCase changePasswordUseCase(UserGateway userGateway) {
        return new ChangePasswordUseCaseImpl(userGateway);
    }

    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway) {
        return new CreateUserUseCaseImpl(userGateway);
    }

    @Bean
    public DeleteUserUseCase deleteUserUseCase(UserGateway userGateway) {
        return new DeleteUserUseCaseImpl(userGateway);
    }

    @Bean
    public LogoutUserUseCase logoutUserUseCase(UserGateway userGateway) {
        return new LogoutUserUseCaseImpl(userGateway);
    }

    @Bean
    public PatchUserUseCase patchUserUseCase(UserGateway userGateway) {
        return new PatchUserUseCaseImpl(userGateway);
    }

    @Bean
    public RequestPasswordResetUseCase requestPasswordResetUseCase(UserGateway userGateway) {
        return new RequestPasswordResetUseCaseImpl(userGateway);
    }

    @Bean
    public ResendVerificationEmailUseCase resendVerificationEmailUseCase(UserGateway userGateway) {
        return new ResendVerificationEmailUseCaseImpl(userGateway);
    }

    @Bean
    public ResetPasswordUseCase resetPasswordUseCase(UserGateway userGateway) {
        return new ResetPasswordUseCaseImpl(userGateway);
    }

    @Bean
    public UpdateUserUseCase updateUserUseCase(UserGateway userGateway) {
        return new UpdateUserUseCaseImpl(userGateway);
    }

    @Bean
    public VerifyEmailUseCase verifyEmailUseCase(UserGateway userGateway) {
        return new VerifyEmailUseCaseImpl(userGateway);
    }

}
