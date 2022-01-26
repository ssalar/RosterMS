package com.StudentMS.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.StudentMS.models.Student;


@Repository
public class StudentDaoImpl implements StudentDao{
	
	private List<Student> students = new ArrayList();

	@Override
	public Student addStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		for(Student updstudent: students) {
			if(updstudent.getId()== student.getId()) {
				
				updstudent.setFirstName(student.getFirstName());
				updstudent.setLastName(student.getLastName());
				
			}
			
		}
		
		
		return 0;
	}

	@Override
	public int deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
		Student delStudent = getStudentById(id);
		students.remove(delStudent);
		
		return 0;
  }
