package com.lingfenglong.spring6.validatorimpl;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // name不能为空
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty", "name is null");

        // age 不能小于0 且不能大于200
        Person p = (Person) target;
        if (p.getAge() < 0 || p.getAge() > 200) {
            errors.rejectValue("age", "age.value.error", "age must between 0 and 200");
        }

    }
}
