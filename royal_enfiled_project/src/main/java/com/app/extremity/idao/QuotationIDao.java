package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Quotation;

public interface QuotationIDao extends CrudRepository<Quotation, Integer> {

}
