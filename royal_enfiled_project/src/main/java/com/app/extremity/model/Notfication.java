package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NotficationTable")
public class Notfication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int notficationId;
	
	private String fromId;
	
	private String toId;
	
	private String message;
	
	private String sendDate;

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	private boolean markAsRead = false;  //OR true
	
	
	
	

	public boolean isMarkAsRead() {
		return markAsRead;
	}

	public void setMarkAsRead(boolean markAsRead) {
		this.markAsRead = markAsRead;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNotficationId() {
		return notficationId;
	}

	public void setNotficationId(int notficationId) {
		this.notficationId = notficationId;
	}

	public String getFromId() {
		return fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String getToId() {
		return toId;
	}

	public void setToId(String toId) {
		this.toId = toId;
	}
	

	
	

	
	
}
