package com.app.extremity.iservice;

import java.util.List;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	public String getNextBikeServicingId();
	
	public long getAllServiceCount();
	public long getAllServiceCountByServiceStatus();
	
		
}
