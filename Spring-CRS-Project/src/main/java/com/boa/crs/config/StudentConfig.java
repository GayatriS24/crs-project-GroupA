/**
 * 
 */
package com.boa.crs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.crs.dao.Student;

/**
 * @author Admin
 *
 */
@Configuration
public class StudentConfig {
	
	@Bean
	public Student getStudent() {
		return new Student();
	}

}
