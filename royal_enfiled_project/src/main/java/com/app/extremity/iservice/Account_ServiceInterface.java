package com.app.extremity.iservice;

import java.util.Date;
import java.util.List;

import com.app.extremity.model.Demo;

public interface Account_ServiceInterface {

	public List<Demo> getAllDemo();
	
	public Long NewBikeCount(Date fd, Date ld);
	
	public Long SoldBikeCount(Date fds, Date lds);
}
