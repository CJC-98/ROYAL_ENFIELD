package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.BikeSaleForUser;



public interface BikeSaleForUserIDaoI extends CrudRepository<BikeSaleForUser, String>{
	//public BikeSaleForUser findAllCartByBikeSaleForUserId( String id);
	 

}
