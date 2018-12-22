package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Cart;
import com.app.extremity.model.Registration;


public interface CartIDaoi extends CrudRepository<Cart, Integer> {
	
public List<Cart> findAllByRegistration(Registration reg);
}

