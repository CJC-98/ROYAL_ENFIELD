package com.app.extremity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.AvailableServicingIDao;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.AvailableServicing;


@Service
public class ServiceManagerImpl implements ServiceManagerInterface{

	
	@Autowired
	AvailableServicingIDao daoInterface;
	@Override
	public List<AvailableServicing> getAllServices() {
		
		System.out.println("in serviceManagerImpl");
		return (List<AvailableServicing>) daoInterface.findAll();
	}
	@Override
	public void saveNewServices(AvailableServicing saveService) {
		
		daoInterface.save(saveService);
		
	}


	

}
