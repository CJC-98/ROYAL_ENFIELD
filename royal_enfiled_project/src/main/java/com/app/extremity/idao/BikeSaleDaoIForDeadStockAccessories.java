package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.AccessoriesDeadStock;

public interface BikeSaleDaoIForDeadStockAccessories extends CrudRepository<AccessoriesDeadStock, String>{

}
