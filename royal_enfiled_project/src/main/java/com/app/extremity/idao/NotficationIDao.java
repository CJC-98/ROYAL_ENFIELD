package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Notfication;

public interface NotficationIDao extends CrudRepository<Notfication, Integer> {

	List<Notfication> findAllBySenderName(String senderName);

	List<Notfication> findAllByReciverName(String reciverName);

	Notfication findAllByNotficationId(int id);

	long countByReciverNameAndMarkAsRead(String reciverName, boolean markAsRead);

	List<Notfication> findAllByReciverNameAndMarkAsRead(String reciverName, boolean markAsRead);

}
