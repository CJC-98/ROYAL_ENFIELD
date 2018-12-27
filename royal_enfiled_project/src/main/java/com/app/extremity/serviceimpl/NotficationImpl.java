package com.app.extremity.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.extremity.idao.NotificationIDao;
import com.app.extremity.iservice.NotificationInterface;

import com.app.extremity.model.Notfication;

@Service
public class NotficationImpl implements NotificationInterface{

	@Autowired
	NotificationIDao notficationIDao;
	@Override
	public Notfication saveNotfication(Notfication notification) {
		return notficationIDao.save(notification);
	}
   
	@Override
	public List<Notfication> getMyOutboxNotfication(String senderName) {
		return notficationIDao.findAllBySenderName(senderName);
	}

	@Override
	public List<Notfication> getMyInboxNotfication(String reciverName) {
		System.out.println("in notification IDAO imple....");
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
		System.out.println("in notification IDAO imple....");
		return notficationIDao.countByReciverNameAndMarkAsRead(reciverName, markAsRead);
	}

	@Override
	public List<Notfication> getMyNotReadedInboxNotfication(String reciverName, boolean markAsRead) {
		return notficationIDao.findAllByReciverNameAndMarkAsRead(reciverName,markAsRead).subList(0, 0);
	}



	 
}
