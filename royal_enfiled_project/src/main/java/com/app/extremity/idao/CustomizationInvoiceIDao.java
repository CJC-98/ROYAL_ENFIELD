package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.CustomizationInvoice;

@Repository
public interface CustomizationInvoiceIDao extends CrudRepository<CustomizationInvoice, Integer>{

	
}
