package com.app.extremity.model;

import java.util.Date;

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
	
	private String senderName;
	
	private String senderImg;
	
	private String senderPost;
	
	private String reciverName;
	
	private String reciverImg;
	
	private String reciverPost;
	
	private String message;
	
	private String sendDate;
	
	private String sendTime;
	
	private boolean markAsRead = false;  //OR true

	public int getNotficationId() {
		return notficationId;
	}

	public void setNotficationId(int notficationId) {
		this.notficationId = notficationId;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderImg() {
		return senderImg;
	}

	public void setSenderImg(String senderImg) {
		this.senderImg = senderImg;
	}

	public String getSenderPost() {
		return senderPost;
	}

	public void setSenderPost(String senderPost) {
		this.senderPost = senderPost;
	}

	public String getReciverName() {
		return reciverName;
	}

	public void setReciverName(String reciverName) {
		this.reciverName = reciverName;
	}

	public String getReciverImg() {
		return reciverImg;
	}

	public void setReciverImg(String reciverImg) {
		this.reciverImg = reciverImg;
	}

	public String getReciverPost() {
		return reciverPost;
	}

	public void setReciverPost(String reciverPost) {
		this.reciverPost = reciverPost;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public boolean isMarkAsRead() {
		return markAsRead;
	}

	public void setMarkAsRead(boolean markAsRead) {
		this.markAsRead = markAsRead;
	}

	

	
	
	
	
	
	
	
	
}
