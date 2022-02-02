package com.StudentMS.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMS.dao.StudentDao;
import com.StudentMS.dao.StudentDaoImpl;
import com.StudentMS.models.Student;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    
    private  StudentDao studentDao;
	
        @Autowired
	public StudentController(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	@PostMapping
	public int insertStudent(@RequestBody Student student) {
		return studentDao.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getStudents() {
		return studentDao.listStudents();
		
	}
	@GetMapping(path = "{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		
		return studentDao.getStudentById(id);
		
		
	}
	@DeleteMapping(path = "{id}")
	public int deleteStudentById(@PathVariable("id") int id) {
		return studentDao.deleteStudentById(id);
		
	}
	@PutMapping(path = "{id}")
	public int updateStudents(@PathVariable("id") int id, @RequestBody Student student) {
		return studentDao.updateStudent(student);
	}
}


