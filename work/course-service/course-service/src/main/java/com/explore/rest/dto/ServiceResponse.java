package com.explore.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceResponse<T> {
    private HttpStatus httpStatus;
    private T response;
    private List<ErrorDTO> error;

    public ServiceResponse(HttpStatus httpStatus, T response) {
        this.httpStatus = httpStatus;
        this.response = response;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public void setResponse(CourseRequestDTO newCourse) {
    }
}
