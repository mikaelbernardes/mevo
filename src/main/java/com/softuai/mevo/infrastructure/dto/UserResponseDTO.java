package com.softuai.mevo.infrastructure.dto;

import com.softuai.mevo.core.enumeration.ActivityLevel;
import com.softuai.mevo.core.enumeration.AlcoholConsumption;
import com.softuai.mevo.core.enumeration.GoalType;
import com.softuai.mevo.core.enumeration.TrainingExperience;

import java.time.LocalDate;

public record UserResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
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
        String phoneNumber,
        String timezone,
        int dailyCaloriesGoal,
        TrainingExperience trainingExperience,
        boolean smoker,
        AlcoholConsumption alcoholConsumption,
        double sleepHours
) {
}
