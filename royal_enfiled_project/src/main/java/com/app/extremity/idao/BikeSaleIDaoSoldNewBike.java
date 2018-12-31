package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.SoldBikeStock;

public interface BikeSaleIDaoSoldNewBike extends CrudRepository<SoldBikeStock, String> {

}
