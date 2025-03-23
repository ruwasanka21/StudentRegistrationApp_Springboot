package com.studentRegister.registerStudent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendRegistrationEmail(String toEmail, String studentName) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Student Registration Successful");
        message.setText("Hello " + studentName + ",\n\n" +
                "You have successfully registered. Welcome to the system!\n\n" +
                "Best regards,\n" +
                "Student Registration Team");
        message.setFrom("tharinduruwasanka@gmail.com");
        mailSender.send(message);
    }
}
