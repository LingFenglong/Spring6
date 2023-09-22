package com.software.entity;

public class School {
    private String name;
    private String location;
    private String phoneNumber;
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
