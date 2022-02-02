package com.StudentMS.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.StudentMS.dao.CourseDaoImpl.StudentMapper;
import com.StudentMS.models.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	//List<Student> students = new ArrayList<>();
	@Autowired
	JdbcTemplate jdbc;
        public int addStudent(Student student) {
		
		String 	ADD_STUDENT = "INSERT INTO student(id,firstName,lastName) VALUES(?,?,?)";
		
	    return jdbc.update(ADD_STUDENT,student.getId(),student.getFirstName(),student.getLastName());
		
		
	}

	

	@Override
       public Student getStudentById(int id) {
		
		String GET_STUDENT_BY_ID = "SELECT * FROM student WHERE id =?";
		
		Student student = jdbc.queryForObject(GET_STUDENT_BY_ID, new StudentMapper(),id);
		
		
		return student;
        }
//	public Student getStudentById(int id) {
//		
//		for (Student student : students){
//            if (student.getId() == id){
//                return student;
//            }
//        }
//        
//        return null;
//	}

	@Override
public List<Student> listStudents() {
		
		String GET_ALL_STUDENTS = "SELECT * FROM student";
		
		List<Student> student_list = jdbc.query(GET_ALL_STUDENTS,new StudentMapper());
		
		
		return student_list;
	}

	@Override
	public int updateStudent(Student student) {
		
      String UPDATE_STUDENT = "UPDATE student SET firstName = ? where id = ?";
		
		int status = jdbc.update(UPDATE_STUDENT,student.getFirstName(),student.getId());
//		
//		for(Student updstudent: students) {
//			if(updstudent.getId()== student.getId()) {
//				
//				updstudent.setFirstName(student.getFirstName());
//				updstudent.setLastName(student.getLastName());
		return status;
//				
			}
			
		
		
		
	

	@Override
	public int deleteStudentById(int id) {
String DELETE_STUDENT = "DELETE from student where id =? ";
		
		int status = jdbc.update(DELETE_STUDENT, id);
//		// TODO Auto-generated method stub
//		
//		Student delStudent = getStudentById(id);
//		students.remove(delStudent);
//		
		return status;
  }
  
	 public class StudentMapper implements RowMapper<Student> {
	        public Student mapRow(ResultSet rs, int rowNum) throws SQLException { 
	            Student student = new Student();
	            student.setId(rs.getInt("id"));
	            student.setFirstName(rs.getString("firstName"));
	            student.setLastName(rs.getString("lastName"));
	            return student;

}
	 }
	 }
