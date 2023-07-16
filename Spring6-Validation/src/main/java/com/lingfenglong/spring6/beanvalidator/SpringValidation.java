package com.lingfenglong.spring6.beanvalidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

@Component
public class SpringValidation {

    private Validator validator;

    @Autowired
    public SpringValidation(Validator validator) {
        this.validator = validator;
    }

    public boolean userValidator(User user) {
        BindException bindException = new BindException(user, user.getName());
        validator.validate(user, bindException);
        return bindException.hasErrors();
    }
}
