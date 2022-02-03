/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.dao;

import com.StudentMS.models.Course;
import com.StudentMS.models.Student;
import com.StudentMS.models.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;/*
import java.util.List;
import java.util.ArrayList;*/

/*
 *
 * @author sindhu/valli
 */
@Repository
public class TeacherDaoImpl implements TeacherDao {
//    private List<Teacher> teachers = new ArrayList<>();
    @Autowired
    JdbcTemplate jdbc;
    @Override
    public Teacher getTeacherById(int id) {
    	 String GET_TEACHER_BY_ID="SELECT * FROM teacher WHERE id=?";
    	 
    	 Teacher teacher=jdbc.queryForObject(GET_TEACHER_BY_ID, new TeacherMapper(),id);
          	 
    	 
    	
       /* for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }*/
        return teacher;
    }

    @Override
    public List<Teacher> getAllTeachers() {
    	String GET_ALL_TEACHERS="SELECT * FROM teacher";
    	
    	List<Teacher> teacher_list =jdbc.query(GET_ALL_TEACHERS, new TeacherMapper());
    	
    	
                                 
    	
        return teacher_list;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {

        String ADD_TEACHER="INSERT INTO teacher(id,firstname,lastname,speciality) VALUES (?,?,?,?)";
        
         jdbc.update(ADD_TEACHER,teacher.getId(),teacher.getFirstname(),teacher.getLastname(),teacher.getSpeciality());
        
        return teacher;
  
    	
    	/*        Teacher newTeacher = new Teacher(teacher.getId(), teacher.getFirstname(), teacher.getLastname(), teacher.getSpeciality());
        teachers.add(newTeacher);
        return newTeacher;*/

    }

    @Override
    public Teacher updateTeacher(Teacher teacher, int id) {
/*        for (Teacher currTeacher : teachers) {
            if (currTeacher.getId() == id) {
                currTeacher.setFirstname(teacher.getFirstname());
                currTeacher.setLastname(teacher.getLastname());
                currTeacher.setSpeciality(teacher.getSpeciality());
                return currTeacher;
            }
        }*/
        return null;
    }

    @Override
    @Transactional
    public int deleteTeacherById(int id) {
    	
    	String DELETE_TEACHER_COURSE="DELETE FROM course where teacherId=?";
    	String DELETE_TEACHER="DELETE FROM teacher WHERE id=? ";
    	jdbc.update(DELETE_TEACHER_COURSE, id);
    	int status=jdbc.update(DELETE_TEACHER, id);
        
    	return status; 
    	
/*        for(Teacher teacher : teachers){
            if(teacher.getId() == id) {
                teachers.remove(teacher);
                return 1;
            }
        }*/
       
    }
    
    public class TeacherMapper implements RowMapper<Teacher> {
        public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
            Teacher teacher = new Teacher();
            teacher.setId(rs.getInt("id"));
            teacher.setFirstname(rs.getString("firstName"));
            teacher.setLastname(rs.getString("lastName"));
            teacher.setSpeciality(rs.getString("speciality"));

            return teacher;
        }
    }
}
