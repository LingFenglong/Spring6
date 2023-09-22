package com.software.entity;

import java.time.LocalTime;

public class Library {
    private Long bookNumber;
    private LocalTime startTime;
    private LocalTime endTime;
    private School school;

    @Override
    public String toString() {
        return "Library{" +
                "bookNumber=" + bookNumber +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", school=" + school +
                '}';
    }

    public void borrowBook() {
        LocalTime now = LocalTime.now();
        if (school.isOpening() && now.isAfter(startTime) && now.isBefore(endTime)) {
            System.out.println("借了一本书");
        } else {
            System.out.println("学校未开学，不能借书");
        }
    }

    public Long getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Long bookNumber) {
        this.bookNumber = bookNumber;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
