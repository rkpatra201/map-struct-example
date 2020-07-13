package org.example.mapper;

import org.example.dto.CourseDto;
import org.example.dto.StudentDto;
import org.example.vo.Course;
import org.example.vo.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper()
public interface DataObjectMapper {

    DataObjectMapper INSTANCE = Mappers.getMapper(DataObjectMapper.class);

    StudentDto toDto(Student s);
    Student toBo(StudentDto s);
    List<CourseDto> toDto(List<Course> courses);
}
