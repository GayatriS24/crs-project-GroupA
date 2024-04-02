package com.boa.crs.dao;

import java.util.List;

public class CourseCatalog {
	
	private String courseName;
	private int courseId;
	private String department;
	private int fees;
	private int professorId;
	private List<String> prerequisite;
	private int noOfStudentsEnrolled;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	public List<String> getPrerequisite() {
		return prerequisite;
	}
	public void setPrerequisite(List<String> prerequisite) {
		this.prerequisite = prerequisite;
	}
	public int getNoOfStudentsEnrolled() {
		return noOfStudentsEnrolled;
	}
	public void setNoOfStudentsEnrolled(int noOfStudentsEnrolled) {
		this.noOfStudentsEnrolled = noOfStudentsEnrolled;
	}
	
}
