package com.boa.csr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.csr.dao.User;
import com.boa.csr.daoimpl.ProfessorImpl;

@Configuration
public class UserConfig {
	
	@Bean
	public User getUser() {
		return new ProfessorImpl();
	}

}
