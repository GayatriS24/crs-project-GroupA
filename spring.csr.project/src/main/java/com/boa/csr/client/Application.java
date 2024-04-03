package com.boa.csr.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.boa.csr.config.AppConfig;
import com.boa.csr.config.DBConfig;
import com.boa.csr.config.ProfessorConfig;
import com.boa.csr.dao.Professor;

@SpringBootApplication
@Import({ProfessorConfig.class,DBConfig.class})
public class Application {
	
	public static void main(String[] args) {
		//SpringApplication.run(AppConfig.class, args);
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Professor professor = (Professor) ctx.getBean(Professor.class);
		//professor.addGrade(2, "Python",'A');
		professor.viewEnrolledStudents(1);
	}
	
}
