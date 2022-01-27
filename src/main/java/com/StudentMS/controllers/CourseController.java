/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.controllers;

import com.StudentMS.dao.CourseDao;
import com.StudentMS.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @Autowired
    private CourseDao coursedao;
    
    @PostMapping
    public void addCourse(@RequestBody Course course){
        coursedao.addCourse(course);
    }
}
