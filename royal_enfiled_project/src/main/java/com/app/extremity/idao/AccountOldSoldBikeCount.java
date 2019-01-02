package com.app.extremity.idao;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.SoldOldBikeStock;

public interface AccountOldSoldBikeCount extends CrudRepository<SoldOldBikeStock, Integer>{
	
	public Long countBySoldbikedateBetween(Date fds, Date lds);
	
}
