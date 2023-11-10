package com.parkauto.parkauto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Async
    public void sendEmail(String toEmail, String subject, String message){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        mailMessage.setFrom("marcelosolanosev@gmail.com");
        javaMailSender.send(mailMessage);
    }

    public void sendConfirmRegister(String email, String firstName, String password){
        String subject = "vous venez de creer votre compte sur Blabla  inscription (test)";
        String message = "Salut "+firstName+", \n\nVoici votre mot de pqsse : "+password+" ";
        sendEmail(email, subject, message);
    }
}
