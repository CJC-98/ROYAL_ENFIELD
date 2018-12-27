package com.app.extremity.idao;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.Notfication;

@Repository
public interface NotificationIDao extends CrudRepository<Notfication, Integer>{

	public List<Notfication> findAllByReciverName(String reciverName);
	public List<Notfication> findAllByReciverNameAndMarkAsRead(String reciverName, boolean markAsRead);
	public List<Notfication> findAllBySenderName(String senderName);
	public Notfication findAllByNotficationId(int id);
	public long countByReciverNameAndMarkAsRead(String reciverName, boolean markAsRead);
	
	

}
