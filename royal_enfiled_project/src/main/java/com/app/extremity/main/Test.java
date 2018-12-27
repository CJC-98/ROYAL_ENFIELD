 package com.app.extremity.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
=======
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git

<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com.app.extremity.model")

@EnableJpaRepositories("com.app.extremity.idao")

<<<<<<< HEAD
public class Test {
=======


public class Test {   
 
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git

	static Logger logger = LogManager.getLogger(Test.class);
<<<<<<< HEAD

=======
 
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	public static void main(String[] args) {
<<<<<<< HEAD

		SpringApplication.run(Test.class);
		logger.warn("application started............");
		System.out.println("application started...........");

=======
		SpringApplication.run(Test.class);
		logger.warn("application started............!!!");
		System.out.println("application started...........!!!!!");
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	}
<<<<<<< HEAD
}
=======
} 
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
