package com.lingfenglong.iocxml.dimap;

import lombok.Data;

import java.util.List;
import java.util.Map;

// Student
@Data
public class Stu {
    private Long id;
    private String name;
    private Map<String, Tea> teaMap;
    private List<Lesson> lessonList;
}
