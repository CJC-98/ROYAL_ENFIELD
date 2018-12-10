package com.app.extremity.idao;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.Notfication;

@Repository
public interface NotficationIDao extends CrudRepository<Notfication, Integer>{

	
}
