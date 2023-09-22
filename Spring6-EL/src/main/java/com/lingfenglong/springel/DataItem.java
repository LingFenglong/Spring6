package com.lingfenglong.springel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private Integer stuId;
    private String name;
}

@Data
@Component
public class DataItem {
    private List<Student> students;
    public DataItem() {
        this.students = new ArrayList<>();
        students.add(new Student(1, "a"));
        students.add(new Student(2, "b"));
        students.add(new Student(3, "c"));
        students.add(new Student(4, "d"));
    }
}
