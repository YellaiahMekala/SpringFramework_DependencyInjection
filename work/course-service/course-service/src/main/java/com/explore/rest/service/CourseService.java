package com.explore.rest.service;

import com.explore.rest.dao.CourseDao;
import com.explore.rest.dto.CourseRequestDTO;
import com.explore.rest.dto.CourseResponseDTO;
import com.explore.rest.entity.CourseEntity;
import com.explore.rest.utils.AppUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CourseService {

//H2, DERBY, AeroSpike--> In memory DB

    //injected as constructor injection using lombok annot
    private CourseDao courseDao;

    //create  course obj in  DB --> POST
    public CourseResponseDTO onboardNewCourse(CourseRequestDTO courseRequestDTO) {
        //convert Request dto to entity
        CourseEntity courseEntity = AppUtils.mapDTOToEntity(courseRequestDTO);
        CourseEntity entity = courseDao.save(courseEntity);//saved obj in DB --> Entity
        //convert Entity to Response dto
        CourseResponseDTO courseResponseDTO = AppUtils.mapEntityToDTO(entity);// here entity which is saved in db
        courseResponseDTO.setCourseUniqueCode(UUID.randomUUID().toString().split("-")[0]);
        // to uniquely distinguish generate a random string  using UUID and splitting based on -
        //recommended to return response using response dto which contains only user specific info
        return courseResponseDTO;
    }


    //load all the courses -- GET
    public List<CourseResponseDTO> viewAllCourses() {
        Iterable<CourseEntity> courseEntities = courseDao.findAll();// here findAll() method returns list of iterables, we need to convert from Iterable to String

        

        return null;
    }

    public CourseResponseDTO findByCourseId(Integer courseId) {

        return null;
    }


    /*
    //list of all the courses -- GET
    public List<Course> viewAllCourses() {
        return courseDatabase;
    }

    //find or filter a course by course id-- GET
    public Course findCourseById(Integer courseId) {
        return courseDatabase.stream().filter(course -> course.getCourseId() == courseId).findFirst().orElse(null);
    }

    //delete course from db ---DELETE

    public void deleteCourse(Integer courseId) {
        Course course = findCourseById(courseId);
        courseDatabase.remove(course);
    }
    //update course in db ---PUT
    public  Course updateCourse(int courseId,Course course){
        Course existingCourse = findCourseById(courseId);
        courseDatabase.set(courseDatabase.indexOf(existingCourse), course);
        return  course;
    } */

}
