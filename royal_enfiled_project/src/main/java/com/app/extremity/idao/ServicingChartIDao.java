package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.ServicingChart;

@Repository
public interface ServicingChartIDao extends CrudRepository<ServicingChart, Integer>{

	/*public ServicingChart findById(int id);
	*/
}
