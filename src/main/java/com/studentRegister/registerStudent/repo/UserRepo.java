package com.studentRegister.registerStudent.repo;

import com.studentRegister.registerStudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<Student, Long> {

}
