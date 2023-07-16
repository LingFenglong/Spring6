package com.lingfenglong.springi18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

@SpringJUnitConfig(classes = SpringI18nConfig.class)
//@SpringJUnitConfig(locations = "classpath:i18n.xml")
public class DemoI18n {

    @Autowired
    private ApplicationContext context;

    @Test
    public void demoI18n() {
        System.out.println(context.getMessage(
                "welcome",
                new Object[] {
                        "LingFenglong",
                        LocalDateTime.now(ZoneId.of("+8"))
                                .format(DateTimeFormatter
                                .ofLocalizedDateTime(FormatStyle.SHORT))
                },
                Locale.CHINA));
        System.out.println(context.getMessage("welcome", null, Locale.UK));
    }
}

