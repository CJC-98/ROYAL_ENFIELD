package com.app.extremity.main;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com.app.extremity.model")

@EnableJpaRepositories("com.app.extremity.idao") 
            

            
public class Test {    


	static Logger logger = LogManager.getLogger(Test.class);




	public static void main(String[] args) {

		//System.out.println("in main");
		logger.info("In main.....");


		SpringApplication.run(Test.class);

		logger.info("In main...end....");
		//System.out.println("application started............");

		logger.warn("application started............");
		System.out.println("application started...........");

	}
}