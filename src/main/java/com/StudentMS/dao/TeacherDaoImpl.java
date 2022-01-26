/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.dao;

import com.StudentMS.models.Course;
import com.StudentMS.models.Student;
import com.StudentMS.models.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sindhu
 */
@Repository
public class TeacherDaoImpl implements TeacherDao{
private List<Teacher> teachers = new ArrayList<>();
    @Override
    public Teacher getTeacherById(int id) {
        for(Teacher teacher : teachers){
            if(teacher.getId() == id){
                return teacher;
            }
        }
        return null;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
       Teacher newTeacher = new Teacher(teacher.getId(), teacher.getFirstName(), teacher.getLastName(), teacher.getSpeciality());
       teachers.add(newTeacher);
       return newTeacher;
    }

    @Override
    public void updateTeacher(Teacher teacher, int id) {
        for(Teacher currentTeacher : teachers) {
            if(currentTeacher.getId() == id){
                currentTeacher.setFirstName(teacher.getFirstName());
                currentTeacher.setLastName(teacher.getLastName());
                currentTeacher.setSpeciality(teacher.getSpeciality());
            }
        }
    }

    @Override
    public void deleteTeacherById(int id) {
        for(Teacher teacher : teachers){
            if(teacher.getId() == id) {
                teachers.remove(teacher);
            }
        }
    }

}
