/**
 * 
 */
package com.boa.csr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Admin
 *
 */
@Configuration
@Import({ProfessorConfig.class,DBConfig.class})
public class AppConfig {

	
}
