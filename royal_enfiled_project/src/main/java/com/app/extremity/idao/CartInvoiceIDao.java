package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.CartInvoice;

public interface CartInvoiceIDao extends CrudRepository<CartInvoice, Integer> {

}
