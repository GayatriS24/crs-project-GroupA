package com.boa.csr.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import com.boa.csr.config.DBConfig;
import com.boa.csr.config.ProfessorConfig;
import com.boa.csr.dao.Professor;
import com.boa.csr.dao.User;
import com.boa.csr.daoimpl.ProfessorImpl;

@SpringBootApplication
@Import({ProfessorConfig.class,DBConfig.class})
public class Application {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	
	public static void main(String[] args) {
		//SpringApplication.run(AppConfig.class, args);
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Application application = (Application) ctx.getBean(Application.class);
		
		
		User user = application.login("Umar",ctx);
		if(user != null && user instanceof ProfessorImpl) {
		user.addGrade(2, "Python",'B');
		user.viewEnrolledStudents(1);
		}
		else {
			System.out.println("user might be null or Except Professor others cannot view enrolled students");
		}
	}
	
	public User login(String userName , ApplicationContext ctx) {
		int roleId = (int)jdbcTemplate.queryForObject("SELECT ROLE_ID from USER where USER_NAME = '"+userName+"'", Integer.class);
		System.out.println("Role Id : " + roleId);
		String roleName = (String)jdbcTemplate.queryForObject("SELECT ROLE_NAME from ROLE where ROLE_ID ="+roleId, String.class);
		System.out.println("Role Name : " + roleName);
		if(roleName.equalsIgnoreCase("Professor")) {
			System.out.println("Entered Professor");
		User user = (Professor) ctx.getBean(Professor.class);
		System.out.println("Professor Bean Created");
		return user;
		}
		return null;
	}
	
}
