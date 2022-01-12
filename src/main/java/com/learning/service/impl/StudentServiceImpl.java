package com.learning.service.impl;

import com.learning.model.Student;
import com.learning.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> getStudents() {
        Student student1 = new Student(123l, "Raghavendra", "raghav@gmail.com");
        Student student2 = new Student(124l, "Keshav", "keshav@gmail.com");
        Student student3 = new Student(125l, "Thilak", "thilak@gmail.com");

        List<Student> students = Arrays.asList(student1, student2, student3);
        return students;
    }
}
