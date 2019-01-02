package com.app.extremity.idao;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.OldBikeStock;

public interface AccountOldBikeCount extends CrudRepository<OldBikeStock, Integer> {
	public Long countByArrivalDateBetween(Date fd, Date ld);
}
