package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.ServicingInvoice;

@Repository
public interface ServiceInvoiceIDao extends CrudRepository<ServicingInvoice, Integer>{

	public ServicingInvoice findById(int id);
}
