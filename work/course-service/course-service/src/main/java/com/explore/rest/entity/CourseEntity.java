package com.explore.rest.entity;

import com.explore.rest.annotation.CourseTypeValidation;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COURSE_TBL")
@Data //includes getters, setters and constructors
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String name;
    private String trainerName;
    private String Duration;//days
    @JsonFormat(shape =JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date startDate;
    @CourseTypeValidation
    private String courseType;//live or recording
    private double fees;
    private boolean isCertificateAvailable;
    private  String description;

}
