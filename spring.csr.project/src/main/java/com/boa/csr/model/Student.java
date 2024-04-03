/**
 * 
 */
package com.boa.csr.model;

import org.springframework.stereotype.Component;

/**
 * @author Admin
 *
 */
@Component
public class Student {
	
	private int studentId;
	private String studentName;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
