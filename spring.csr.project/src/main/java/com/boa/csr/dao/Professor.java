/**
 * 
 */
package com.boa.csr.dao;

import org.springframework.stereotype.Service;

/**
 * @author Admin
 *
 */
@Service
public interface Professor {
	
	public String addGrade(int studentId ,String courseName , char grade);
	public void viewEnrolledStudents(int professorId);
}
