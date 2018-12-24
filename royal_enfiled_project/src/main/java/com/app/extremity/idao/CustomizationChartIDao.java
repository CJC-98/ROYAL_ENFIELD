package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.CustomizationChart;

@Repository
public interface CustomizationChartIDao extends CrudRepository<CustomizationChart, Integer>{

	public CustomizationChart findByCustomizationChartId(int id);
	
}
