package com.software.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Value("CC")
    private String name;

    @Value("LFL")
    private String location;

    @Value("8848")
    private String phoneNumber;

    @Value("true")
    private boolean isOpening;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isOpening=" + isOpening +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOpening(boolean opening) {
        isOpening = opening;
    }

    public boolean isOpening() {
        return isOpening;
    }
}
