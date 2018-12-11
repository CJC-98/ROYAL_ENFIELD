package com.app.extremity.idao;



import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Address;



public interface AddressIdao extends CrudRepository<Address, String>{

}
