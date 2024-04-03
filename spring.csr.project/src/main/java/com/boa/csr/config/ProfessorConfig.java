/**
 * 
 */
package com.boa.csr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.boa.csr.dao.Professor;
import com.boa.csr.daoimpl.ProfessorImpl;

/**
 * @author Admin
 *
 */
@Configuration
@ComponentScan({"com.boa.csr.repo"})
public class ProfessorConfig {
	
	@Bean
	public Professor getProfessor() {
		return new ProfessorImpl();
	}

}
