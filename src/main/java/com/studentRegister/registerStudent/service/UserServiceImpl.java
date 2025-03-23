package com.studentRegister.registerStudent.service;

import com.studentRegister.registerStudent.entity.Student;
import com.studentRegister.registerStudent.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo repo;

    @Autowired
    private EmailService emailService;


    @Override
    public void registerStudent(Student student){
        System.out.println("Registering student");
        repo.save(student);

        emailService.sendRegistrationEmail(student.getEmail(), student.getName());

    }

}
