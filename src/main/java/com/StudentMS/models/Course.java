/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author ssalar
 */
public class Course {
    private int id;
    private String name;
    private String description;
    private Teacher teacher;
    private List<Student> students;
    
    public Course(){
        
    }

    public Course(@JsonProperty("id") int id, 
                  @JsonProperty("name") String name, 
                  @JsonProperty("description") String description, 
                  @JsonProperty("teacher") Teacher teacher, 
                  @JsonProperty("students") List<Student> students) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    
    
    
    
    
}
