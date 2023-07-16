package com.lingfenglong.spring6.beanvalidator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class JavaValidation {
    private Validator validator;

    @Autowired
    public JavaValidation(Validator validator) {
        this.validator = validator;
    }

    public boolean userValidator(User user) {
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();
    }
}
