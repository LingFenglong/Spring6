package com.lingfenglong.spring6.cannotblank;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CannotBlankValidator implements ConstraintValidator<CannotBlank, String> {
    @Override
    public void initialize(CannotBlank constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null && value.contains(" ")) {
            String defaultConstraintMessageTemplate = context.getDefaultConstraintMessageTemplate();
            System.out.println(defaultConstraintMessageTemplate);

            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("can't contains blank").addConstraintViolation();
            return false;
        }
        return true;
    }
}
