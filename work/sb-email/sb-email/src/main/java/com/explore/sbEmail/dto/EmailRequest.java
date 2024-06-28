package com.explore.sbEmail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest {
    private String email;
    private String subject;
    private String messageBody;
    private String attachment;
    private String[] toEmails;



}
