package com.boa.csr.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.csr.dao.Professor;
import com.boa.csr.dao.User;
import com.boa.csr.repo.ProfessorRepo;

@Service
public class ProfessorImpl implements Professor,User{

	@Autowired
	public ProfessorRepo professorRepo;
	
	@Override
	public String addGrade(int studentId, String courseName , char grade) {
		// TODO Auto-generated method stub
		return professorRepo.addGrade(studentId, courseName, grade);
		
	}

	@Override
	public void viewEnrolledStudents(int professorId) {
		// TODO Auto-generated method stub
		professorRepo.viewEnrolledStudents(professorId);
	}

}
