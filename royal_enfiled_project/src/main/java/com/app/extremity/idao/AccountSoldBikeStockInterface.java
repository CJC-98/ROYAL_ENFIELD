package com.app.extremity.idao;

import java.util.Date;
import org.springframework.data.repository.CrudRepository;
import com.app.extremity.model.SoldBikeStock;

public interface AccountSoldBikeStockInterface extends CrudRepository<SoldBikeStock, Integer> {

	public Long countBysoldbikedateBetween(Date fds, Date lds);
	
}
