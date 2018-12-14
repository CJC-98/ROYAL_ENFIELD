package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Notfication;



public interface NotificationInterface {
	
	
	//public EmployeeDetails getMyDetails();
	public Notfication saveNotfication(Notfication notfication);
	public List<Notfication> getMyOutboxNotfication(String senderName);
	public List<Notfication> getMyInboxNotfication(String reciverName);
	public Notfication getNotficationById(int id);
	public boolean markAsRead(Notfication notify);
	
	
	
}
