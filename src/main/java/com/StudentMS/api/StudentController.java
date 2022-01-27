package com.StudentMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMS.dao.StudentDao;
import com.StudentMS.models.Student;

@RestController
@RequestMapping("api/Student")
public class StudentController {
	private final StudentDao studentDao;
	
	@Autowired
	public StudentController (StudentDao studentdao) {
		this.studentDao = studentdao;
		
	}
	@PostMapping	
		public void addStudent(Student student) {
			studentDao.addStudent(student);
			
		}
//	@GetMapping	
//		public void getStudentById(int id) {
//			studentDao.getStudentById(id);
//			
//			
//		}
//	@GetMapping
//		public void List() {
//			
//		}
	}


