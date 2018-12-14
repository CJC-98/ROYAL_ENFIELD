package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.AvailableServicing;



public interface ServiceManagerInterface {

public List<AvailableServicing> getAllServices();
	public void saveNewServices(AvailableServicing saveService);
}
