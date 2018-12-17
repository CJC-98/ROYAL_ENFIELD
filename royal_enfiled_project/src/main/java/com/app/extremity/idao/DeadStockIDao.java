package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.DeadStock;

public interface DeadStockIDao extends CrudRepository<DeadStock, Integer> {

}
