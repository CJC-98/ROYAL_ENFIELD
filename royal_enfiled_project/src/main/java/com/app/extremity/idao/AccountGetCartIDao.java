package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Cart;
import com.app.extremity.model.Registration;

public interface AccountGetCartIDao extends CrudRepository<Cart, Integer> {

//	public List<UserCart> findAllByPurchaseStatusAndRegistration(String purchaseStatus, String registrationid);
//	
    public List<Cart> findAllByRegistration(Registration reg);
	
}
