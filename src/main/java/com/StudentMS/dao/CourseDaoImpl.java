/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.dao;

import com.StudentMS.models.Course;
import com.StudentMS.models.Student;
import com.StudentMS.models.Teacher;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



/**
 *
 * @author ssalar
 */
@Repository
public class CourseDaoImpl implements CourseDao{
    
    //private List<Course> courses = new ArrayList<>();
    @Autowired
    JdbcTemplate jdbc;
        
    @Override
    public Course getCourseById(int id) {
        
        String GET_COURSE_BY_ID = "SELECT * FROM Course WHERE id = ?";
        
        Course course = jdbc.queryForObject(GET_COURSE_BY_ID, new CourseMapper(), id);
        
        course.setTeacher(teacher);
        course.setStudents(students);
        
//        for (Course course : courses){
//            if (course.getId() == id){
//                return course;
//            }
//        }
//        
      return course;
    }
    
    public Teacher getTeacherByID(int id){
        String GET_TEACHER = "SELECT * FROM Teacher WHERE id = ?";
        
        Teacher teacher = jdbc.queryForObject(GET_TEACHER, teacherMapper, id);
        
        return teacher;
    }
    
    public List<Student> getAllStudents(){
        String GET_ALL_STUDENTS = "";
    }

    @Override
    public List<Course> getAllCourses() {
        //String GET_ALL_COURSES = "SELCTE * FROM Course";
//        List<Course> courses = jdbc.queryForList(GET_ALL_COURSES);
        
//        return courses;
        
    }

    @Override
    public Course addCourse(Course course) {
        Course newCourse = new Course(course.getId(), course.getName(), course.getDescription(), course.getTeacher(), course.getStudents());
        courses.add(newCourse);

        return newCourse;
    }

    @Override
    public void updateCourse(Course course, int id) {

        for (Course curr : courses) {
            if (curr.getId() == id) {
                curr.setName(course.getName());
                curr.setDescription(course.getDescription());
            }
        }
    }

    @Override
    public void deleteCourseById(int id) {
        Course delete = getCourseById(id);
        courses.remove(delete);
    }

    @Override
    public List<Course> getCoursesForTeacher(Teacher teacher) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Course> getCoursesForStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class CourseMapper implements RowMapper<Course> {
        public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
            Course course = new Course();
            course.setId(rs.getInt("id"));
            course.setName(rs.getString("name"));
            course.setDescription(rs.getString("description"));
            return course;
        }
    }

    public class StudentMapper implements RowMapper<Student> {
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setFirstName(rs.getString("firstName"));
            student.setLastName(rs.getString("lastName"));
            return student;


        }
    }

    public class TeacherMapper implements RowMapper<Teacher> {
        public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
            Teacher teacher = new Teacher();
            teacher.setId(rs.getInt("id"));
            teacher.setFirstname(rs.getString("firstName"));
            teacher.setLastname(rs.getString("lastName"));
            teacher.setSpeciality(rs.getString("speciality"));

            return teacher;
        }
    }

}
