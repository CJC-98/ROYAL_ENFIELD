package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.AccessoriesStock;

public interface AccessoriesStockIDao extends CrudRepository<AccessoriesStock, String> {
	//public AccessoriesStock findAllById(String partId);

}
