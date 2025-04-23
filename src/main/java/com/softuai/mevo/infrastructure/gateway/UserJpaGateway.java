package com.softuai.mevo.infrastructure.gateway;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.exception.UserNotFoundException;
import com.softuai.mevo.core.gateway.UserGateway;
import com.softuai.mevo.infrastructure.mapper.UserCoreMapper;
import com.softuai.mevo.infrastructure.persistence.entity.UserEntity;
import com.softuai.mevo.infrastructure.persistence.repository.UserRepository;
import com.softuai.mevo.infrastructure.util.CryptoUtil;
import com.softuai.mevo.infrastructure.util.HasherUtil;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Map;

@Component
public class UserJpaGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserCoreMapper userCoreMapper;
    private final HasherUtil hasherUtil;
    private final CryptoUtil cryptoUtil;

    public UserJpaGateway(
            UserRepository userRepository, 
            UserCoreMapper userCoreMapper, 
            HasherUtil hasherUtil,
            CryptoUtil cryptoUtil
    ) {
        this.userRepository = userRepository;
        this.userCoreMapper = userCoreMapper;
        this.hasherUtil = hasherUtil;
        this.cryptoUtil = cryptoUtil;
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
        entity.setPhoneNumber(cryptoUtil.encrypt(entity.getPhoneNumber()));
        UserEntity savedEntity = userRepository.save(entity);
        return userCoreMapper.toCore(savedEntity);
    }

    @Override
    public void DeleteUserUseCase(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void LogoutUserUseCase(Long userId) {

    }

    @Override
    public User PatchUserUseCase(Long id, Map<String, Object> updates) {
        return null;
    }

    @Override
    public User ReadUserUseCase(Long id) {
        UserEntity entity = userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        entity.setPhoneNumber(cryptoUtil.decrypt(entity.getPhoneNumber()));
        return userCoreMapper.toCore(entity);
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
        UserEntity entity = userRepository.findById(id).orElseThrow(UserNotFoundException::new);

        entity.setFirstName(user.firstName());
        entity.setLastName(user.lastName());
        entity.setSex(user.sex());
        entity.setProfileImage(entity.getProfileImage());
        entity.setBio(user.bio());
        entity.setDietaryRestrictions(user.dietaryRestrictions());
        entity.setFoodPreferences(user.foodPreferences());
        entity.setHealthIssues(user.healthIssues());
        entity.setBirthDate(user.birthDate());
        entity.setHeight(user.height());
        entity.setWeight(user.weight());
        entity.setActivityLevel(user.activityLevel());
        entity.setGoalType(user.goalType());
        entity.setPhoneNumber(cryptoUtil.encrypt(entity.getPhoneNumber()));
        entity.setTimezone(user.timezone());
        entity.setDailyCaloriesGoal(user.dailyCaloriesGoal());
        entity.setTrainingExperience(user.trainingExperience());
        entity.setSmoker(user.smoker());
        entity.setAlcoholConsumption(user.alcoholConsumption());
        entity.setSleepHours(user.sleepHours());
        entity.setUpdatedAt(LocalDateTime.now());

        return userCoreMapper.toCore(entity);
    }

    @Override
    public void VerifyEmailUseCase(String token) {

    }

    @Override
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public boolean existsByPhoneNumber(String phoneNumber) {
        return userRepository.existsByPhoneNumber(cryptoUtil.encrypt(phoneNumber));
    }
}
