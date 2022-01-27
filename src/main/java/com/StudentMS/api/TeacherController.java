package com.StudentMS.api;
import com.StudentMS.models.Teacher;
import com.StudentMS.dao.TeacherDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/person")
@RestController
public class TeacherController {

    private TeacherDaoImpl teacherDoaImpl;

    @Autowired
    public TeacherController(TeacherDaoImpl teacherDaoImpl) {
        this.teacherDoaImpl = teacherDaoImpl;
    }

    @GetMapping
    public void getTeacherById(@RequestBody int id){
        teacherDoaImpl.getTeacherById(id);
    }

    @GetMapping
    public void getAllTeachers(){
        teacherDoaImpl.getAllTeachers();
    }

    @PostMapping
    public void addTeacher(@RequestBody Teacher teacher){
        teacherDoaImpl.addTeacher(teacher);
    }

    @PutMapping
    public void updateTeacher(@RequestBody Teacher teacher, int id){
        teacherDoaImpl.updateTeacher(teacher, id);
    }

    @DeleteMapping
    public void deleteTeacherById(@RequestBody int id){
        teacherDoaImpl.deleteTeacherById(id);
    }
}
