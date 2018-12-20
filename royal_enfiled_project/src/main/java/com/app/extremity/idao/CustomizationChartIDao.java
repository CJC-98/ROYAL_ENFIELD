package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.ServicingChart;

@Repository
public interface CustomizationChartIDao extends CrudRepository<CustomizationChart, Integer>{

	public CustomizationChart findById(int id);
	
}
