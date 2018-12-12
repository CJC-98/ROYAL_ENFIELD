package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.BikeOffer;

public interface BikeSaleOfferIDao  extends CrudRepository<BikeOffer, Integer> {

}
