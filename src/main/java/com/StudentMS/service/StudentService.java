package com.StudentMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.StudentMS.dao.StudentDao;
import com.StudentMS.models.Student;

@Service
public class StudentService {
	
	private StudentDao studentDao;
	
	@Autowired
	public StudentService(@Qualifier("studentDAo")StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public Student insertStudent(Student student) {
		return studentDao.addStudent(student);
		
	}
	public List<Student>getAllStudents(){
		
		return studentDao.listStudents();
		
	}
	public Student selectStudentById(int id) {
		
		return studentDao.getStudentById(id);
		
	}
	public int updateStudentById(Student student) {
		
		return studentDao.updateStudent(student);
	}
	public int deleteStudent(int id) {
		return studentDao.deleteStudentById(id);
	}

}
