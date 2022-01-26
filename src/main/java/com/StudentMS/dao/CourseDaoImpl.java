/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.dao;

import com.StudentMS.models.Course;
import com.StudentMS.models.Student;
import com.StudentMS.models.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ssalar
 */
public class CourseDaoImpl implements CourseDao{
    
        private List<Course> courses = new ArrayList<>();
        
    @Override
    public Course getCourseById(int id) {
        
        for (Course course : courses){
            if (course.getId() == id){
                return course;
            }
        }
        
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public Course addCourse(Course course) {
        Course newCourse = new Course(course.getId(), course.getName(), course.getDescription(), course.getTeacher(), course.getStudents());
        courses.add(newCourse);
        
        return newCourse;
    }

    @Override
    public void updateCourse(Course course) {
        
        getCourseById()
        
    }

    @Override
    public void deleteCourseById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Course> getCoursesForTeacher(Teacher teacher) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Course> getCoursesForStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
