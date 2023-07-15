package com.lingfenglong.javai18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoI18n {
    @Test
    public void demoI18n() {
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("javai18n",
                new Locale.Builder().setLanguage("zh").setRegion("CN").build());
        System.out.println("zh CN: " + resourceBundle1.getString("welcome"));

        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("javai18n",
                new Locale.Builder().setLanguage("en").setRegion("GB").build());
        System.out.println("en GB: " + resourceBundle2.getString("welcome"));
    }
}

