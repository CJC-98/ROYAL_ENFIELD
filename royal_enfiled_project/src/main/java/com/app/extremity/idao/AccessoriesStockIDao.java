package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.AccessoriesStock;

public interface AccessoriesStockIDao extends CrudRepository<AccessoriesStock, String> {

	List<AccessoriesStock> findAllByPartId(String id);
	//public AccessoriesStock findAllById(String partId);

}
