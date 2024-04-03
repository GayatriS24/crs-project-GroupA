/**
 * 
 */
package com.boa.csr.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Admin
 *
 */
@Repository
public class ProfessorRepo {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public String addGrade(int studentId, String courseName , char grade) {
		// TODO Auto-generated method stub
		int courseId = getCourseIdByCourseName(courseName);
		System.out.println("courseId : " +courseId);
		jdbcTemplate.update("update REPORT set grade = '"+grade+"' where COURSE_ID = "+courseId+" and STUDENT_ID = "+studentId);
		System.out.println("Updated Grade");
		return "Updated Grade";
	}

	private int getCourseIdByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return (int)jdbcTemplate.queryForObject("select course_id from COURSE where COURSE_NAME = '"+courseName+"'",Integer.class);
	}

	public void viewEnrolledStudents(int professorId) {
		// TODO Auto-generated method stub
		List<Integer> studentIdList = jdbcTemplate.queryForList("SELECT STUDENT_ID FROM REPORT WHERE PROFESSOR_ID = "+professorId,Integer.class);
		//jdbcTemplate.queryForObject("select STUDENT_NAME from STUDENT where StUDENT_ID = "+
		studentIdList.forEach(studentId -> {
			String stuId = (String)jdbcTemplate.queryForObject("select STUDENT_NAME from STUDENT where STUDENT_ID = "+studentId,String.class);
			System.out.println("Student Name : "+stuId);
		});
	}

	
}
