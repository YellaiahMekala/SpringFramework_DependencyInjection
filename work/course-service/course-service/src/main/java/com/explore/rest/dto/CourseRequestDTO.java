package com.explore.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDTO {
    //    @NotNull
//    @NotEmpty
    @NotBlank(message = "course name should not be null or empty")
    @Min(1)
    private String name;

    @NotEmpty(message = "trainer name should be defined")
    private String trainerName;

    @NotNull(message = "duration must specify")
    private String Duration;//days

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Past(message = "start date can not be before date from current date")
    private Date startDate;

    private String courseType;//live or recording
    @Min(value = 1500, message = "course price can not be lessa than specified")
    @Max(value = 5000, message = "can not be more than 5000")
    private double fees;
    private boolean isCertificateAvailable;

    /*
    @Email(message = "should be a valid email")
    private String emailId;

    @Pattern(regexp = "^[0-9]{10}$")
    private String contact;
*/

    public void setCourseId(int i) {
    }
}
