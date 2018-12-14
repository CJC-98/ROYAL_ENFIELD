package com.app.extremity.iservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
import com.app.extremity.model.DeadStock;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.EngineCapacity;
import com.app.extremity.model.FreeServicingCount;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.Quotation;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;
import com.app.extremity.model.SoldBikeStock;
import com.app.extremity.model.SoldOldBikeStock;
import com.app.extremity.model.State;
import com.app.extremity.model.TestDriveCustomer;

public interface IAdminService {

	void saveEmployee(EmployeeDetails employeeDetails, MultipartFile profilePic);

	void sendEmail(EmailMessage emailmessage, MultipartFile file);

	public List<Color> getcolor();

	public List<AvailableServicing> getAvailableServicing();

	public List<BikeServicing> getBikeServicing();

	public List<NewBikeStock> getNewBikeStock();

	public List<BikeModel> getBikeModel();

	public List<BikeOffer> getBikeOffer();

	public List<TestDriveCustomer> getTestDriveCustomer();

	public List<SoldOldBikeStock> getSoldOldBikeStock();

	public List<ServicingInvoice> getServicingInvoice();

	public List<ServicingChart> getServicingChart();

	public List<ServcingBikeInfo> getServcingBikeInfo();

	public List<Quotation> getQuotation();

	public List<Notfication> getNotfication();

	public List<State> getState();

	public List<FreeServicingCount> getFreeServicing();

	public List<EngineCapacity> getEngineCapacity();

	public List<AccessoriesStock> getAccessoriesStock();

	public List<DeadStock> getDeadStock();

	


}
