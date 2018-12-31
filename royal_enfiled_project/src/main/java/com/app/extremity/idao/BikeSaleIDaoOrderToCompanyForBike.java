package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.CompanyOrderForBike;

public interface BikeSaleIDaoOrderToCompanyForBike extends CrudRepository<CompanyOrderForBike, String>{

}
