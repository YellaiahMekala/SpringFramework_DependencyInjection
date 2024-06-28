package com.explore.sbEmail.service;

import com.explore.sbEmail.dto.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    /*@Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }*/

    @Value("${spring.mail.username}")
    private  String sender;

    public String sendSimpleEmail(EmailRequest request) {
        SimpleMailMessage mailMessage=new SimpleMailMessage();
//        mailMessage.setFrom("myellaiah614@gmail.com");
        mailMessage.setFrom(sender);
        mailMessage.setTo(request.getEmail());
        mailMessage.setSubject(request.getSubject());
        mailMessage.setText(request.getMessageBody());
        javaMailSender.send(mailMessage);
        return "mailMessage:email successfully sent to "+request.getEmail();
    }

    public String sendEmailWithAttachment(EmailRequest request) throws MessagingException {
        MimeMessage mimeMessage=javaMailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
        helper.setFrom(sender);
        helper.setTo(request.getToEmails());
//        helper.setTo(new String[]{"myellaiah416@gmail.com", "myellaiah614@gmail.com", "mekalayell@gmail.com"});
        helper.setSubject(request.getSubject());
        helper.setText(request.getMessageBody());
        FileSystemResource file=new FileSystemResource(new File(request.getAttachment()));
        helper.addAttachment(file.getFilename(), file);
        javaMailSender.send(mimeMessage);
        return "email sent successfully with the attachment:"+file.getFilename();
    }


}
