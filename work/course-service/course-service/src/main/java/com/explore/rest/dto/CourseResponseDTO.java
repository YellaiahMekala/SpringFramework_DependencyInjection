package com.explore.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponseDTO {
    private int courseId;

    private String name;
    private String trainerName;
    private String Duration;//days

    @JsonFormat(shape =JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date startDate;
    private String courseType;//live or recording
    private double fees;
    private boolean isCertificateAvailable;
    private String courseUniqueCode;

//    private String emailId;
//    private  String contact;
}
