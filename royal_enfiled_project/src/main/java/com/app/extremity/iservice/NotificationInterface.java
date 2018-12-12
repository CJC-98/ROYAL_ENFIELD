package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.Notfication;



public interface NotificationInterface {
	
	public Notfication saveNotfication(Notfication notfication);
	public List<Notfication> getMyOutboxNotfication(String senderName);
	public List<Notfication> getMyInboxNotfication(String reciverName);
	
	
	
}
