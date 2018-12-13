package com.app.extremity.main;

<<<<<<< HEAD
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
=======
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
>>>>>>> branch 'SaleManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com.app.extremity.model")
<<<<<<< HEAD
@EnableJpaRepositories("com.app.extremity.idao") 
            
public class Test
{    
	static Logger logger=LogManager.getLogger(Test.class);
=======

@EnableJpaRepositories("com.app.extremity.idao")

public class Test {

	static Logger logger = LogManager.getLogger(Test.class);

>>>>>>> branch 'SaleManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	public static void main(String[] args) {
<<<<<<< HEAD
		//System.out.println("in main");
		logger.info("In main.....");
=======

>>>>>>> branch 'SaleManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
		SpringApplication.run(Test.class);
<<<<<<< HEAD
		logger.info("In main...end....");
		//System.out.println("application started............");
=======
		logger.warn("application started............");
		System.out.println("application started...........");

>>>>>>> branch 'SaleManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	}
}