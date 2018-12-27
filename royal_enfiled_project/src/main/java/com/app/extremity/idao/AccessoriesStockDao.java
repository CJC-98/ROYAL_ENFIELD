package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.AccessoriesStock;

public interface AccessoriesStockDao extends CrudRepository<AccessoriesStock, Integer>{

	List<AccessoriesStock> findAllByPartId(int id);


	

}
