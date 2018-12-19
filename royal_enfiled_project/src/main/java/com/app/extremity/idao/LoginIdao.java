package com.app.extremity.idao;





import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Login;



public interface LoginIdao extends CrudRepository<Login, Integer>
{
	public Login findAllByEmail(String email);
	public Login findAllByEmailAndPassword(String email, String password);

}
