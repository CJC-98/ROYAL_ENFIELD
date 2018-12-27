package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.BikeSaleForUser;

public interface BikeSaleForUserdaoI extends CrudRepository<BikeSaleForUser, String> {

	List<BikeSaleForUser> findAll();

}
