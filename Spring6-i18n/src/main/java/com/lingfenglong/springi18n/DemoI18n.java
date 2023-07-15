package com.lingfenglong.springi18n;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.MessageSourceResourceBundle;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class DemoI18n {
    @Test
    public void demoI18n() {
        ApplicationContext context = new ClassPathXmlApplicationContext("i18n.xml");
        System.out.println(context.getMessage("welcome",
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

