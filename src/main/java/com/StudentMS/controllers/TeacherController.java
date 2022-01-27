package com.StudentMS.controllers;
import com.StudentMS.models.Teacher;
import com.StudentMS.dao.TeacherDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/teacher")
@RestController
public class TeacherController {

    private TeacherDaoImpl teacherDoaImpl;

    @Autowired
    public TeacherController(TeacherDaoImpl teacherDaoImpl) {
        this.teacherDoaImpl = teacherDaoImpl;
    }

    @GetMapping(path = "{id}")
    public Teacher getTeacherById(@PathVariable("id") int id) {
        return teacherDoaImpl.getTeacherById(id);
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherDoaImpl.getAllTeachers();
    }

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherDoaImpl.addTeacher(teacher);
    }

    @PutMapping(path = "{id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher, @PathVariable("id") int id) {
        return teacherDoaImpl.updateTeacher(teacher, id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteTeacherById(@PathVariable("id") int id){
        teacherDoaImpl.deleteTeacherById(id);
    }
}
