package com.rocs.porms.repository.student;


import com.rocs.porms.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
