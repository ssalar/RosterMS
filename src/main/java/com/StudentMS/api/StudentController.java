package com.StudentMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMS.dao.StudentDao;
import com.StudentMS.dao.StudentDaoImpl;
import com.StudentMS.models.Student;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	private  StudentDaoImpl studentDaoImpl;
	@Autowired
	public StudentController(StudentDaoImpl studentDaoImpl) {
		super();
		this.studentDaoImpl = studentDaoImpl;
	}
	
	@PostMapping
	public Student insertStudent(@RequestBody Student student) {
		return studentDaoImpl.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getStudents() {
		return studentDaoImpl.listStudents();
		
	}
	@GetMapping(path = "{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		
		return studentDaoImpl.getStudentById(id);
		
		
	}
	@DeleteMapping(path = "{id}")
	public int deleteStudentById(@PathVariable("id") int id) {
		return studentDaoImpl.deleteStudentById(id);
		
	}
	@PutMapping
	public int updateStudents(@RequestBody Student student) {
		return studentDaoImpl.updateStudent(student);
	}

}
