package com.app.extremity.idao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.Registration;
@Repository
public interface RegistrationIdao extends CrudRepository<Registration, String>
{
	//@author=akshata
		@Query("select COUNT(ra) from Registration ra where ra.role='1'")
		public int getUserCount();
		//@author=akshata
		@Query("select COUNT(ra) from Registration ra where ra.role='2'")
		public int getDealerCount();
		
		public Registration findAllByEmail(String email);
		public Registration findAllByEmailAndPassword(String email, String password);

		
}




