/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.StudentMS.dao;

import com.StudentMS.models.Course;
import com.StudentMS.models.Student;
import com.StudentMS.models.Teacher;
import java.util.List;

/**
 *
 * @author sindhu
 */
public interface TeacherDao {
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    Teacher addTeacher(Teacher teacher);
    Teacher updateTeacher(Teacher teacher, int id);
    int deleteTeacherById(int id);
}
