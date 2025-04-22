package com.softuai.mevo.core.validation;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.exception.InvalidFieldException;

import java.time.LocalDate;
import java.time.Period;

public class UserValidator {

    public void validate(User user) {

        LocalDate birthDate = user.birthDate();
        int age = Period.between(birthDate, LocalDate.now()).getYears();

        if (user.firstName() == null || user.firstName().trim().isEmpty()) {
            throw new InvalidFieldException("O campo nome é obrigatório");
        }

        if (user.lastName() == null || user.lastName().trim().isEmpty()) {
            throw new InvalidFieldException("O campo sobrenome é obrigatório");
        }

        if (user.email() == null || user.email().trim().isEmpty()) {
            throw new InvalidFieldException("O campo e-mail é obrigatório");
        }

        if (user.password() == null || user.password().trim().isEmpty()) {
            throw new InvalidFieldException("O campo senha é obrigatório");
        }

        if (user.sex() != 'F' && user.sex() != 'M') {
            throw new InvalidFieldException("O campo sexo é obrigatório");
        }

        if (age < 18 || age > 120) {
            throw new InvalidFieldException("A data de nascimento esta inválida");
        }

        if (birthDate.isAfter(LocalDate.now())) {
            throw new InvalidFieldException("A data de nascimento não pode estar no futuro.");
        }

        if (user.height() <= 0) {
            throw new InvalidFieldException("O campo altura é obrigatório");
        }

        if (user.weight() <= 0) {
            throw new InvalidFieldException("O campo peso é obrigatório");
        }

        if (user.activityLevel() == null) {
            throw new InvalidFieldException("o campo nível de atividade é obrigatório.");
        }

        if (user.goalType() == null) {
            throw new InvalidFieldException("o campo tipo de meta é obrigatório.");
        }

        if (user.trainingExperience() == null) {
            throw new InvalidFieldException("o campo experiência em atividade física é obrigatório.");
        }

        if (user.alcoholConsumption() == null) {
            throw new InvalidFieldException("o campo consumo de álcool é obrigatório.");
        }

        if (user.sleepHours() <= 0) {
            throw new InvalidFieldException("o campo horas de sono é obrigatório.");
        }

    }

}
