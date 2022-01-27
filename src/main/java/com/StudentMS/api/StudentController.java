package com.StudentMS.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMS.models.Student;
import com.StudentMS.service.StudentService;

@RestController
public class StudentController {
	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@PostMapping
	public void addStudent(Student student) {
		studentService.insertStudent(student);
	}
	
}
