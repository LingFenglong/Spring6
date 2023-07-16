package com.lingfenglong.spring6.validatorimpl;

import org.junit.jupiter.api.Test;
import org.springframework.validation.DataBinder;

public class TestPerson {
    @Test
    public void testPerson() {
        Person person = new Person("Lucy", 19);

        DataBinder dataBinder = new DataBinder(person);

        dataBinder.setValidator(new PersonValidator());

        dataBinder.validate();

        System.out.println(dataBinder.getBindingResult().getAllErrors());
    }
}
