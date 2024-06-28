package com.explore.rest.resource;

import com.explore.rest.dto.CourseRequestDTO;
import com.explore.rest.dto.CourseResponseDTO;
import com.explore.rest.dto.ServiceResponse;
import com.explore.rest.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
//@Controller
//@Component
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

//here dependency is mandatory to be injected. Recommended to use constructor injection here.

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


   /* public ServiceResponse<CourseResponseDTO> addCourse(@RequestBody @Valid CourseRequestDTO courseRequestDTO) {
        ServiceResponse<CourseResponseDTO> serviceResponse = null;
        serviceResponse = new ServiceResponse<>();
        CourseRequestDTO newCourse = courseService.onboardNewCourse(courseRequestDTO);
        serviceResponse.setHttpStatus(HttpStatus.OK);
        serviceResponse.setResponse(newCourse);

        return  serviceResponse;


    }*/
    /*@GetMapping("search/path/{courseId}") //get using pathvariables
    public  ServiceResponse<CourseResponseDTO> findCourse(@PathVariable Integer courseId){
        CourseResponseDTO responseDTO=courseService.findByCourseId(courseId);

        //return  new ResponseEntity<>(courseService.findCourseById(courseId),HttpStatus.OK);
        return null;
    }
*/
/*
    @PostMapping()
    public ResponseEntity<?> addCourse(@RequestBody Course course){
        Course newCourse=courseService.onboardNewCourse(course);
        return  new ResponseEntity<>(newCourse, HttpStatus.CREATED); // 201 status code
    }

    @GetMapping
    public ResponseEntity<?> findAllCourse(){
        return  new ResponseEntity<>(courseService.viewAllCourses(),HttpStatus.OK);
    }

    @GetMapping("search/path/{courseId}") //get using pathvariables
    public  ResponseEntity<?> findCourse(@PathVariable Integer courseId){
        return  new ResponseEntity<>(courseService.findCourseById(courseId),HttpStatus.OK);
    }

    @GetMapping ("search/request/{courseId}") //get using req params
    public  ResponseEntity<?> findCourseUsingRequestParam(@PathVariable(required = false) Integer courseId){
        return  new ResponseEntity<>(courseService.findCourseById(courseId),HttpStatus.OK);
    }

    @DeleteMapping("/{courseId}")  //delete course
    public  ResponseEntity<?> deleteCourse(@PathVariable Integer courseId){
        courseService.deleteCourse(courseId);
        return  new ResponseEntity<>("deleted successfully", HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<?> updateCourse(@PathVariable int courseId, @RequestBody Course course){
        Course updatedCourse = courseService.updateCourse(courseId, course);
        return new ResponseEntity<>(updatedCourse, HttpStatus.OK);

    }*/

}
