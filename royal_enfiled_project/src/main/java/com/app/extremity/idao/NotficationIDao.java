package com.app.extremity.idao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.Notfication;

@Repository
public interface NotficationIDao extends CrudRepository<Notfication, Integer>{

	public List<Notfication> findAllByReciverName(String reciverName);
	public List<Notfication> findAllBySenderName(String senderName);
	public Notfication findAllByNotficationId(int id);
}
