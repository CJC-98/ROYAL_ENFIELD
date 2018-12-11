package com.app.extremity.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 

@SpringBootApplication(scanBasePackages="com")
@EntityScan("com.app.extremity.model")
<<<<<<< HEAD
@EnableJpaRepositories("com.app.extremity.idao") 
            
=======
@EnableJpaRepositories("com.app.extremity.idao")
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
public class Test {    
	
	static Logger logger = LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("in main");
		SpringApplication.run(Test.class);
		System.out.println("application started............");
=======
		SpringApplication.run(Test.class);    
		logger.warn("application started............");
		System.out.println("application started..........."); 
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	}
} 