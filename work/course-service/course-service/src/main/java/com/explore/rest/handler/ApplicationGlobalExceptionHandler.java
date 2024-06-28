package com.explore.rest.handler;

import com.explore.rest.dto.ErrorDTO;
import com.explore.rest.dto.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
@ControllerAdvice
public class ApplicationGlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ServiceResponse<?> handleMethodArgumentException(MethodArgumentNotValidException exception) {
        ServiceResponse<?> serviceResponse = new ServiceResponse<>();
        List<ErrorDTO> errorDTOList = new ArrayList<>();
        exception.getBindingResult().getFieldErrors()
                //here from exception object will get list of all errors and we are iterating over the list ..we are creating new error dto object with message;

                .forEach(error -> {
                    ErrorDTO errorDTO = new ErrorDTO(error.getDefaultMessage());
                    errorDTOList.add(errorDTO);
                });
        serviceResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        serviceResponse.setError(errorDTOList);
        return serviceResponse;
    }

}
