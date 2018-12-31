package com.app.extremity.iservice;

import java.util.List;
import com.app.extremity.model.Notfication;



public interface NotificationInterface {
	
	 
	//public EmployeeDetails getMyDetails();
	public Notfication saveNotfication(Notfication notfication);
	public List<Notfication> getMyOutboxNotfication(String senderName);
	public List<Notfication> getMyInboxNotfication(String reciverName);
	public List<Notfication> getMyNotReadedInboxNotfication(String reciverName, boolean markAsRead);
	public Notfication getNotficationById(int id);
	public boolean markAsRead(Notfication notify);
	public long getInboxCount(String reciverName,boolean markAsRead);

	
	
	
}