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
public class Course {
	
	private int courseId;
	private String courseName;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
