package com.app.extremity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.Account_Invoice_DaoInterface;
import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.model.Demo;

@Service
public class Account_ServiceImpl implements Account_ServiceInterface {

	@Autowired
	Account_Invoice_DaoInterface dao;
	
	@Override
	public List<Demo> getAllDemo() {
		
		List<Demo> list = (List<Demo>)dao.findAll();
		return list;
	}

	

}
