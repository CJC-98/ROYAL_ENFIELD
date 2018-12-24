package com.app.extremity.iservice;

import java.util.List;





import org.springframework.web.multipart.MultipartFile;
import com.app.extremity.model.AccessoriesDeadStock;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationInvoice;
import com.app.extremity.model.DeadStock;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.SoldAccessories;
import com.app.extremity.model.SoldBikeStock;
import com.app.extremity.model.SoldOldBikeStock;
import com.app.extremity.model.TestDriveCustomer;

public interface IAdminService {

	void saveEmployee(EmployeeDetails employeeDetails, MultipartFile profilePic);

	void sendEmail(EmailMessage emailmessage, MultipartFile file, String designation);

	EmployeeDetails getEmployeeDetailsByName(String employeeName);

	List<AccessoriesStock> getAccessoriesStock();

	List<NewBikeStock> getNewBikeStock();

	List<OldBikeStock> getOldBikeStock();

	List<DeadStock> getDeadStock();

	List<AccessoriesDeadStock> getAccessoriesDeadStock();

	List<EmployeeDetails> getEmployeelist();

	List<BikeOffer> getBikeOffer();

	List<CustomizationInvoice> getCustomizationInvoice();

	List<ServcingBikeInfo> getServcingBikeInfo();

	List<TestDriveCustomer> getTestDriveCustomer();


	List<AvailableServicing> getavaliableServicing();

	List<BikeServicing> getBikeServicing();

	List<BikeCustomization> getbikeCustomization();
	
	List<SoldOldBikeStock> getSoldOldBike();

	List<SoldBikeStock> getSoldBikeStockInfo();

	List<SoldAccessories> getSoldAccessoriesInfo();

	void updateEmployee(EmployeeDetails employee);







	




}
