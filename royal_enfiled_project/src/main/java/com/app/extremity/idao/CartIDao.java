package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.Cart;


@Repository
public interface CartIDao extends CrudRepository<Cart, Integer>{


	
}
