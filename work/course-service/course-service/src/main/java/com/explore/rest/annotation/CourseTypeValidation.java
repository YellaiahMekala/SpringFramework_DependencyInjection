package com.explore.rest.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CourseTypeValidator.class)
public @interface CourseTypeValidation {
    String message() default "{COURSE TYPE SHOULD BE EITHER LIVE OR RECORDING}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
