package com.app.extremity.serviceimpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.NotficationIDao;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.model.Notfication;



@Service
public class NotificationImpl implements NotificationInterface{

	
	@Autowired
	NotficationIDao notficationIDao;


	@Override
	public Notfication saveNotfication(Notfication notfication) {
		
		
		//mock data
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
		
		Notfication notify = new Notfication();
		
		notify.setSenderName("pranay kohad");  //get data from DB.employee table
		notify.setSenderPost("service manager");              //get data from DB.employee table  
		
		notify.setReciverName("manoj");   //get data from DB.employee table
		notify.setReciverPost("sales manager");//get data from DB
		
		notify.setMessage("project is ready for sales");
		notify.setSendDate(LocalDateTime.now().format(dateFormat));
		notify.setSendTime(LocalDateTime.now().format(timeFormat));
		
		System.out.println("data saved");
		
		return notficationIDao.save(notify);
	}
   
	@Override
	public List<Notfication> getMyOutboxNotfication(String senderName) {
		return notficationIDao.findAllBySenderName(senderName);
	}

	@Override
	public List<Notfication> getMyInboxNotfication(String reciverName) {
		return notficationIDao.findAllByReciverName(reciverName);
	}
	 


	

}
