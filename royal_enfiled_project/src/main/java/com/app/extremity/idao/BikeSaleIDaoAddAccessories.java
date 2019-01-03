package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.AddAccessories;

public interface BikeSaleIDaoAddAccessories extends CrudRepository<AddAccessories, String>
{


	AddAccessories findOne(String accid);


}
