package com.softuai.mevo.infrastructure.persistence.entity;

import com.softuai.mevo.core.enumeration.ActivityLevel;
import com.softuai.mevo.core.enumeration.AlcoholConsumption;
import com.softuai.mevo.core.enumeration.GoalType;
import com.softuai.mevo.core.enumeration.TrainingExperience;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "email", nullable = false, length = 250, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "sex", nullable = false, length = 1)
    private char sex;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "bio", nullable = false, length = 255)
    private String bio;

    @Column(name = "dietary_restrictions")
    private String dietaryRestrictions;

    @Column(name = "food_preferences")
    private String foodPreferences;

    @Column(name = "health_issues")
    private String healthIssues;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "height", nullable = false)
    private double height;

    @Column(name = "weight", nullable = false)
    private double weight;

    @Column(name = "activity_level", nullable = false)
    private ActivityLevel activityLevel;

    @Column(name = "goal_type", nullable = false)
    private GoalType goalType;

    @Column(name = "email_verified", nullable = false)
    private boolean emailVerified;

    @Column(name = "verification_token")
    private String verificationToken;

    @Column(name = "password_reset_token")
    private String passwordResetToken;

    @Column(name = "password_reset_expires_at")
    private LocalDateTime passwordResetExpiresAt;

    @Column(name = "failed_login_attempts")
    private int failedLoginAttempts;

    @Column(name = "last_failed_login_at")
    private LocalDateTime lastFailedLoginAt;

    @Column(name = "account_locked", nullable = false)
    private boolean accountLocked;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @Column(name = "time_zone", length = 50)
    private String timezone;

    @Column(name = "daily_calories_goal")
    private int dailyCaloriesGoal;

    @Enumerated(EnumType.STRING)
    @Column(name = "training_experience", nullable = false)
    private TrainingExperience trainingExperience;

    @Column(name = "smoker", nullable = false)
    private boolean smoker;

    @Enumerated(EnumType.STRING)
    @Column(name = "alcohol_consumption", nullable = false)
    private AlcoholConsumption alcoholConsumption;

    @Column(name = "sleep_hours", nullable = false)
    private double sleepHours;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public UserEntity() {
    }

    public UserEntity(
            Long id,
            String firstName,
            String lastName,
            String email,
            String password,
            char sex,
            String profileImage,
            String bio,
            String dietaryRestrictions,
            String foodPreferences,
            String healthIssues,
            LocalDate birthDate,
            double height,
            double weight,
            ActivityLevel activityLevel,
            GoalType goalType,
            boolean emailVerified,
            String verificationToken,
            String passwordResetToken,
            LocalDateTime passwordResetExpiresAt,
            int failedLoginAttempts,
            LocalDateTime lastFailedLoginAt,
            boolean accountLocked,
            String phoneNumber,
            String timezone,
            int dailyCaloriesGoal,
            TrainingExperience trainingExperience,
            boolean smoker,
            AlcoholConsumption alcoholConsumption,
            double sleepHours,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.profileImage = profileImage;
        this.bio = bio;
        this.dietaryRestrictions = dietaryRestrictions;
        this.foodPreferences = foodPreferences;
        this.healthIssues = healthIssues;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.activityLevel = activityLevel;
        this.goalType = goalType;
        this.emailVerified = emailVerified;
        this.verificationToken = verificationToken;
        this.passwordResetToken = passwordResetToken;
        this.passwordResetExpiresAt = passwordResetExpiresAt;
        this.failedLoginAttempts = failedLoginAttempts;
        this.lastFailedLoginAt = lastFailedLoginAt;
        this.accountLocked = accountLocked;
        this.phoneNumber = phoneNumber;
        this.timezone = timezone;
        this.dailyCaloriesGoal = dailyCaloriesGoal;
        this.trainingExperience = trainingExperience;
        this.smoker = smoker;
        this.alcoholConsumption = alcoholConsumption;
        this.sleepHours = sleepHours;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public String getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(String foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public String getHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(String healthIssues) {
        this.healthIssues = healthIssues;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }

    public GoalType getGoalType() {
        return goalType;
    }

    public void setGoalType(GoalType goalType) {
        this.goalType = goalType;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    public String getPasswordResetToken() {
        return passwordResetToken;
    }

    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken;
    }

    public LocalDateTime getPasswordResetExpiresAt() {
        return passwordResetExpiresAt;
    }

    public void setPasswordResetExpiresAt(LocalDateTime passwordResetExpiresAt) {
        this.passwordResetExpiresAt = passwordResetExpiresAt;
    }

    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(int failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public LocalDateTime getLastFailedLoginAt() {
        return lastFailedLoginAt;
    }

    public void setLastFailedLoginAt(LocalDateTime lastFailedLoginAt) {
        this.lastFailedLoginAt = lastFailedLoginAt;
    }

    public boolean isAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getDailyCaloriesGoal() {
        return dailyCaloriesGoal;
    }

    public void setDailyCaloriesGoal(int dailyCaloriesGoal) {
        this.dailyCaloriesGoal = dailyCaloriesGoal;
    }

    public TrainingExperience getTrainingExperience() {
        return trainingExperience;
    }

    public void setTrainingExperience(TrainingExperience trainingExperience) {
        this.trainingExperience = trainingExperience;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public AlcoholConsumption getAlcoholConsumption() {
        return alcoholConsumption;
    }

    public void setAlcoholConsumption(AlcoholConsumption alcoholConsumption) {
        this.alcoholConsumption = alcoholConsumption;
    }

    public double getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(double sleepHours) {
        this.sleepHours = sleepHours;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
