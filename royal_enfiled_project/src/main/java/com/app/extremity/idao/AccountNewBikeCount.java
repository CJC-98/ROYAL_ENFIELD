package com.app.extremity.idao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.app.extremity.model.NewBikeStock;

public interface AccountNewBikeCount extends CrudRepository<NewBikeStock, Integer> {

	
	public Long countByArrivalDateBetween(Date fd, Date ld);
	
	
}
