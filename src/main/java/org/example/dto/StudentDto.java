package org.example.dto;

import java.util.List;

public class StudentDto {
    private Integer id;
    private String name;
    private List<CourseDto> courseList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDto> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<CourseDto> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
