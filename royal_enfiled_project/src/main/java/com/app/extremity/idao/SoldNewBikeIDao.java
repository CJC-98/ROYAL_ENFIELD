package com.app.extremity.idao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.repository.CrudRepository;


import com.app.extremity.model.SoldBikeStock;

public interface SoldNewBikeIDao extends CrudRepository<SoldBikeStock, String> 
{
// public List<SoldBikeStock> findAllByDate(String string);
	

	public List<SoldBikeStock> findAllBySoldbikedate(Date date);
}
