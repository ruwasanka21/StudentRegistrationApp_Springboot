package com.studentRegister.registerStudent.controller;

import com.studentRegister.registerStudent.entity.Student;
import com.studentRegister.registerStudent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String register(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "Register";
    }
    @PostMapping("/registerStudent")
    public String registerStudent(@ModelAttribute("student") Student student) {
        System.out.println("Registering student");
        userService.registerStudent(student);
        return "success";
    }



}
