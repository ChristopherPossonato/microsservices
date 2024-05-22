package com.ms.evento.aplication.core.exception.validacao;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class NotPastDateValidator implements ConstraintValidator<NotPastDate, LocalDate> {

    @Override
    public void initialize(NotPastDate constraintAnnotation) {
    }

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext context) {
        if (date == null) {
            return true; // @NotNull will handle null check
        }
        return !date.isBefore(LocalDate.now());
    }
}
