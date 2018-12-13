package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.ServcingBikeInfo;

@Repository
public interface ServcingBikeInfoIDao extends CrudRepository<ServcingBikeInfo, Integer>{

	
}
