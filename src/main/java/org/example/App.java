package org.example;

import org.example.dto.CourseDto;
import org.example.dto.StudentDto;
import org.example.mapper.DataObjectMapper;
import org.example.vo.Course;
import org.example.vo.Student;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setCourseName("c1");
        c1.setId(10);

        Course c2 = new Course();
        c2.setCourseName("c2");
        c2.setId(20);

        Student s = new Student();
        s.setCourseList(Arrays.asList(c1, c2));
        s.setId("10");
        s.setName("rabindra");

        StudentDto studentDto = DataObjectMapper.INSTANCE.toDto(s);
        System.out.println(studentDto);
        System.out.println("Hello World!");
        s = null;
        s = DataObjectMapper.INSTANCE.toBo(studentDto);
        studentDto = null;
        studentDto = DataObjectMapper.INSTANCE.toDto(s);
        System.out.println(studentDto);
        List<CourseDto> courseDtoList = DataObjectMapper.INSTANCE.toDto(s.getCourseList());
        System.out.println(courseDtoList);
    }
}
