package com.softuai.mevo.core.entity;

import com.softuai.mevo.core.enumeration.ActivityLevel;
import com.softuai.mevo.core.enumeration.AlcoholConsumption;
import com.softuai.mevo.core.enumeration.GoalType;
import com.softuai.mevo.core.enumeration.TrainingExperience;

import java.time.LocalDateTime;

public record User(
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
        LocalDateTime birthDate,
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
}
