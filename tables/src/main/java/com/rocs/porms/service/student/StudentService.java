package com.rocs.porms.service.student;

import com.rocs.porms.domain.student.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudent();
    Optional<Student> getStudentById(Long id);
}
