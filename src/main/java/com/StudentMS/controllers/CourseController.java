/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.controllers;

import com.StudentMS.dao.CourseDao;
import com.StudentMS.models.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ssalar
 */
@RestController
@RequestMapping("api/v1/course")
public class CourseController {
    
   
    CourseDao coursedao;
    
    @Autowired
    public CourseController(CourseDao coursedao){
        this.coursedao = coursedao;
    }
    
    @PostMapping
    public void addCourse(@RequestBody Course course){
        coursedao.addCourse(course);
    }
    
    @GetMapping
    public List<Course> listCourses(){
        return coursedao.getAllCourses();
    }
    
    @GetMapping(path = "{id}")
    public Course getCourseById(@PathVariable("id") int id){
        return coursedao.getCourseById(id);
    }
    
    @DeleteMapping(path = "{id}")
    public void deleteCourseById(@PathVariable("id") int id){
        coursedao.deleteCourseById(id);
    }
    
    @PutMapping(path = "{id}")
    public void updateCourse(@PathVariable("id") int id, @RequestBody Course course){
        coursedao.updateCourse(course, id);
    }
    
}
