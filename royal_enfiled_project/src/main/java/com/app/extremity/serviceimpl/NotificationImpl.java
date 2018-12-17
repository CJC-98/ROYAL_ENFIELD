package com.app.extremity.serviceimpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.NotficationIDao;

import com.app.extremity.iservice.NotificationInterface;

import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Notfication;



@Service
public class NotificationImpl implements NotificationInterface{

	
	@Autowired
	NotficationIDao notficationIDao;


	@Override
	public Notfication saveNotfication(Notfication notfication) {
		return notficationIDao.save(notfication);
	}
   
	@Override
	public List<Notfication> getMyOutboxNotfication(String senderName) {
		return notficationIDao.findAllBySenderName(senderName);
	}

	@Override
	public List<Notfication> getMyInboxNotfication(String reciverName) {
		System.out.println(reciverName);
		return notficationIDao.findAllByReciverName(reciverName);
	}

	@Override
	public Notfication getNotficationById(int id) {
		return notficationIDao.findAllByNotficationId(id);
	}

	@Override
	public boolean markAsRead(Notfication notify) {	
		notify.setMarkAsRead(true);
		notficationIDao.save(notify);
		return true;
	}


	@Override
	public long getInboxCount(String reciverName, boolean markAsRead) {
		return notficationIDao.countByReciverNameAndMarkAsRead(reciverName, markAsRead);
	}

	@Override
	public List<Notfication> getMyNotReadedInboxNotfication(String reciverName, boolean markAsRead) {
		return notficationIDao.findAllByReciverNameAndMarkAsRead(reciverName, markAsRead);
	}



	 


	

}
