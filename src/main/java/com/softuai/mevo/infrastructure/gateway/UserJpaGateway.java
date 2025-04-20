package com.softuai.mevo.infrastructure.gateway;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.gateway.UserGateway;
import com.softuai.mevo.infrastructure.mapper.UserCoreMapper;
import com.softuai.mevo.infrastructure.persistence.entity.UserEntity;
import com.softuai.mevo.infrastructure.persistence.repository.UserRepository;
import com.softuai.mevo.infrastructure.util.HasherUtil;

import java.time.LocalDateTime;
import java.util.Map;

public class UserJpaGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserCoreMapper userCoreMapper;
    private final HasherUtil hasherUtil;

    public UserJpaGateway(UserRepository userRepository, UserCoreMapper userCoreMapper, HasherUtil hasherUtil) {
        this.userRepository = userRepository;
        this.userCoreMapper = userCoreMapper;
        this.hasherUtil = hasherUtil;
    }

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
        UserEntity entity = userCoreMapper.toEntity(user);
        entity.setPassword(hasherUtil.hash(entity.getPassword()));
        entity.setCreatedAt(LocalDateTime.now());
        entity.setPhoneNumber(hasherUtil.hash(entity.getPhoneNumber()));
        UserEntity savedEntity = userRepository.save(entity);
        return userCoreMapper.toCore(savedEntity);
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
