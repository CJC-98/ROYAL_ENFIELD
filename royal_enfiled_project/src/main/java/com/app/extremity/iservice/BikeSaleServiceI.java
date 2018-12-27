package com.app.extremity.iservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.AccessoriesDeadStock;
import com.app.extremity.model.AccessoriesSaleForUser;
import com.app.extremity.model.AddAccessories;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Color;
import com.app.extremity.model.CompanyOrderForAccessories;
import com.app.extremity.model.CompanyOrderForBike;
import com.app.extremity.model.EngineCapacity;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.SoldAccessories;
import com.app.extremity.model.SoldBikeStock;
import com.app.extremity.model.SoldOldBikeStock;

public interface BikeSaleServiceI {

	public void addNewBikeModel(BikeModel bikeModel, Color color, EngineCapacity engineCap, MultipartFile profilePic);

	BikeOffer SaveOffer(BikeOffer bikeoffer);

	public List<CompanyOrderForBike> getOrderBike(CompanyOrderForBike companyOrderForBike);

	public List<CompanyOrderForAccessories> getOrderBike(CompanyOrderForAccessories companyOrderForAccessories);
	public AddAccessories getBikeName(String id);
	public int getBikeModelCount();

	public BikeModel getOneBikeData(String bid);

	public int getEngineCapacityCount();

	public List<BikeModel> getAllBike();

	public long getColorCount();

	public String getBikeColor();

	public String getCompanyOrderForBike();

	public String getAddAccessoriesId();

	void addNewBikeModel(BikeModel bikeModel, EngineCapacity engineCap, Color color, MultipartFile profilePic);

	public List<BikeOffer> displayAll(BikeOffer bikeoffer);

	public AddAccessories SaveAddAccessories(AddAccessories addAccessories);

	//public CompanyOrderForBike saveOrderToCompanyBike(CompanyOrderForBike companyOrderForBike);

	void addAccessories(AddAccessories addAccessories);

	public List<SoldOldBikeStock> getOldSoldBike(SoldOldBikeStock soldOldBikeStock);

	public List<OldBikeStock> getOldBikeStock(OldBikeStock oldBikeStock);

	public List<com.app.extremity.model.AccessoriesSaleForUser> displayAllAccessoriesSaleForUser(
			com.app.extremity.model.AccessoriesSaleForUser accessoriesSaleForUser);

	public List<SoldAccessories> displayAllSoldAccessories(SoldAccessories soldAccessories);

	public List<SoldBikeStock> displayAllSoldBikeStock(SoldBikeStock soldBikeStock);

	public List<BikeSaleForUser> getAllBikeSaleForUser();

	public List<AccessoriesDeadStock> getAllDeadStockAccessories();

	public String getAccessoriesSaleForUserID();

	public long getAllBikeSaleForUserCount();

	public long getAllOldBikeStockCount();

	public long getAllDeadStockCount();

	public long getAllSoldBikeSaleForUSerCount();

	public long getAllSoldOldBikeCount();

	public long getAllCompanyOrderBikeCount();

	public CompanyOrderForAccessories saveAccessoriesOrder(CompanyOrderForAccessories cmpnya);
	public String getCompanyOrderForAccessoriesId();
	
	
	//for getting all accessories data
	public List<AddAccessories> getAllAccessoriesData();
	
	//get one accessory
	public AddAccessories getOneAccessories(String Accid);
	
	public CompanyOrderForBike saveOrderToCompanyBike(CompanyOrderForBike companyOrderForBike);

	public String getBikeSaleForUserID();

	public BikeSaleForUser SaveBikeSale(BikeSaleForUser bikesaletouser, MultipartFile profilePic);

	public AccessoriesSaleForUser SaveAccessoriesSale(AccessoriesSaleForUser accSaleForUser, MultipartFile profilePic);

	
}