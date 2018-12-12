package com.app.extremity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.BikeSaleOfferIDao;
import com.app.extremity.iservice.BikeSaleServiceI;
import com.app.extremity.model.BikeOffer;
@Service
public class BikeSaleServiceImpl implements BikeSaleServiceI  {
    @Autowired
	BikeSaleOfferIDao bikesaleofferidao;
	
	@Override
	public BikeOffer SaveOffer(BikeOffer bikeoffer) {
	System.out.println("In the bike offer serviceimpl");
		return bikesaleofferidao.save(bikeoffer);
	}

}
