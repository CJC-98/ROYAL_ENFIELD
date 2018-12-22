package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.OldBikeStock;

public interface OldBikeStockIDao extends CrudRepository<OldBikeStock, String> {
	
	public List<OldBikeStock> findAllBikeByOldBikeModelName(String oldBikeModelName);
}
