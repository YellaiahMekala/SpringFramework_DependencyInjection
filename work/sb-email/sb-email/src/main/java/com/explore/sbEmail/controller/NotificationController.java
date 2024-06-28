package com.explore.sbEmail.controller;

import com.explore.sbEmail.dto.EmailRequest;
import com.explore.sbEmail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class NotificationController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    private String sendTextEmail(@RequestBody EmailRequest request){
        return emailService.sendSimpleEmail(request);

//        return "email sent successfully to :"+request.getEmail();
    }

    @PostMapping("/sendAttachment")
    private String sendEmailWithAttachmenet(@RequestBody EmailRequest request) throws MessagingException {
        return emailService.sendEmailWithAttachment(request);

//        return "email sent successfully to :"+request.getEmail();
    }

}
