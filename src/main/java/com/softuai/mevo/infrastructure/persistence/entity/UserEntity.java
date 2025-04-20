package com.softuai.mevo.infrastructure.persistence.entity;

import com.softuai.mevo.core.enumeration.ActivityLevel;
import com.softuai.mevo.core.enumeration.AlcoholConsumption;
import com.softuai.mevo.core.enumeration.GoalType;
import com.softuai.mevo.core.enumeration.TrainingExperience;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @Column(name = "dietaryRestrictions")
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

    @Column(name = "phone_number", unique = true, length = 20)
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

}


