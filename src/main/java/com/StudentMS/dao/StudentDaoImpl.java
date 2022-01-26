package com.StudentMS.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.StudentMS.models.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	List<Student> students = new ArrayList<>();

	@Override
	public Student addStudent(Student student) {
		Student newstudent = new Student(student.getId(),student.getFirstName(),student.getLastName());
		students.add(newstudent);
		return newstudent;
	}

	@Override
	public Student getStudentById(int id) {
		for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        
        return null;
	}

	@Override
	public List<Student> listStudents() {
		
		return students;
	}

	@Override
	public int updateStudentById() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudentById() {
		// TODO Auto-generated method stub
		return 0;
	}

}

