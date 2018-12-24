package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Login;

public interface LoginIDao extends CrudRepository<Login, String> {

	Login findOneByEmailAndPassword(String email, String password);

}
