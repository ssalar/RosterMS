/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.StudentMS.dao;

import com.StudentMS.models.Student;
import java.util.List;

/**
 *
 * @author ssalar
 */
public interface StudentDao {
    
    //Crud
    //Create
    Student addStudent();
    
    //Read
    Student getStudentById(int id);
    
    //Read
    List<Student> listStudents();
    
    //Update
    int updateStudent(Student student);
    
    //Delete
    int deleteStudentById(int id);
    
}
