package com.app.extremity.serviceimpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.idao.BikeOfferIDao;
import com.app.extremity.idao.BikeSaleDaoIForDeadStockAccessories;
import com.app.extremity.idao.BikeSaleForUserdaoI;
import com.app.extremity.idao.BikeSaleIDao;
import com.app.extremity.idao.BikeSaleIDaoAccessoriesSaleForUser;
import com.app.extremity.idao.BikeSaleIDaoAddAccessories;
import com.app.extremity.idao.BikeSaleIDaoBikeDeadStock;
import com.app.extremity.idao.BikeSaleIDaoColor;
import com.app.extremity.idao.BikeSaleIDaoCompanyOrderForAccessories;
import com.app.extremity.idao.BikeSaleIDaoEngineCapacity;
import com.app.extremity.idao.BikeSaleIDaoOldBikeStock;
import com.app.extremity.idao.BikeSaleIDaoOrderToCompanyForBike;
import com.app.extremity.idao.BikeSaleIDaoSoldAccessories;
import com.app.extremity.idao.BikeSaleIDaoSoldNewBike;
import com.app.extremity.idao.BikeSaleIDaoViewSoldOldBikeStock;
import com.app.extremity.iservice.BikeSaleServiceI;
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

@Service
public class BikeSaleServiceImpl implements BikeSaleServiceI {
	// for bike model
	@Autowired
	BikeSaleIDaoSoldAccessories bikeSaleIDaoSoldAccessories;
	@Autowired
	BikeSaleIDaoSoldNewBike bikeSaleIDaoSoldNewBike;
	@Autowired
	BikeSaleIDaoAccessoriesSaleForUser bikeSaleIDaoAccessoriesSaleForUser;
	@Autowired
	BikeSaleIDaoCompanyOrderForAccessories ordersAccessories;
	
	@Autowired
	BikeSaleIDaoOrderToCompanyForBike orderBike;
	@Autowired
	BikeSaleIDao bikeSaleIDao;
	@Autowired
	BikeSaleIDaoViewSoldOldBikeStock sold;
	@Autowired
	BikeSaleIDaoOldBikeStock old;
	// for add accessories in list...
	@Autowired
	BikeSaleIDaoAddAccessories bikeSaleIDaoAddAccessories;
	// for engine capacity
	@Autowired
	BikeSaleIDaoEngineCapacity bkEngCap;
	
	// for color
	@Autowired
	BikeSaleIDaoColor bkClr;
	@Autowired
	BikeSaleForUserdaoI bikeSaleForUserdaoI;
	@Autowired
	BikeSaleDaoIForDeadStockAccessories bikeSaleDaoIForDeadStockAccessories;
	@Autowired
	BikeSaleIDaoBikeDeadStock bikeDead;
	@Autowired
	BikeOfferIDao bikeofferidao;

	static Logger logger = LogManager.getLogger(BikeSaleServiceImpl.class);

	/* this is path where profile picture will be stored */
	private String UPLOADED_FOLDER = "H:\\Upload\\";

	@Override
	public void addNewBikeModel(BikeModel bikeModel, EngineCapacity engineCap, Color color, MultipartFile profilePic) {
		// TODO Auto-generated method stub
		logger.info("In AdminServiceImplementation  save method");
		try {
			byte[] bytes = profilePic.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + profilePic.getOriginalFilename());
			Files.write(path, bytes);
			bikeModel.setImage(UPLOADED_FOLDER + profilePic.getOriginalFilename());
		} catch (IOException e) {
			logger.error("while saving profile picture", e);
			e.printStackTrace();
		}
		bikeSaleIDao.save(bikeModel);
		bkEngCap.save(engineCap);
		logger.info("Bike Saved");

	}

	@Override
	public int getBikeModelCount() {
		// TODO Auto-generated method stub
		logger.info("In Bike Model Count...Start.");
		int result = bikeSaleIDao.getBikeModelCount();
		logger.info("In Bike Model Count...End.");
		return result;
	}

	// logic for autoIncrement of String ID
	@Override
	public String getAddAccessoriesId() {
		// TODO Auto-generated method stub
		long result = bikeSaleIDaoAddAccessories.count();
		String prefix = "BACCID";

		return prefix + (result + 1);
	}

	// to save for accessories in addAccessories table
	@Override
	public void addAccessories(AddAccessories addAccessories) {
		// TODO Auto-generated method stub
		bikeSaleIDaoAddAccessories.save(addAccessories);

	}

	@Override
	public int getEngineCapacityCount() {
		// TODO Auto-generated method stub
		logger.info("In engine cap Count...Start.");
		int result = bkEngCap.getEngineCapcityCount();
		logger.info("In engine cap Count...End.");
		return result;
	}

	@Override
	public long getColorCount() {
		// TODO Auto-generated method stub
		System.out.println("In color...");
		return bkClr.count();
	}

	@Override
	public String getBikeColor() {
		// TODO Auto-generated method stub
		long clrCnt = getColorCount();
		return "BCLRID00" + (clrCnt);
	}

	@Override
	public void addNewBikeModel(BikeModel bikeModel, Color color, EngineCapacity engineCap, MultipartFile profilePic) {
		// TODO Auto-generated method stub

		logger.info("In AdminServiceImplementation  save method");
		try {

			byte[] bytes = profilePic.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + profilePic.getOriginalFilename());
			Files.write(path, bytes);
			bikeModel.setImage(UPLOADED_FOLDER + profilePic.getOriginalFilename());
		} catch (IOException e) {
			logger.error("while saving profile picture", e);
			e.printStackTrace();
		}

		bikeSaleIDao.save(bikeModel);
		bkEngCap.save(engineCap);
		logger.info("Bike Saved");

	}
	
	@Override
	public BikeOffer SaveOffer(BikeOffer bikeoffer) {
		System.out.println("In the bike offer serviceimpl");
		return bikeofferidao.save(bikeoffer);
	}

	@Override
	public List<BikeOffer> displayAll(BikeOffer bikeoffer) {

		return (List<BikeOffer>) bikeofferidao.findAll();
	}

	@Override
	public AddAccessories SaveAddAccessories(AddAccessories addAccessories) {
		// TODO Auto-generated method stub
		String id = getAddAccessoriesId();
		return bikeSaleIDaoAddAccessories.save(addAccessories);
	}

	public List<BikeModel> getAllBike() {
		return (List<BikeModel>) bikeSaleIDao.findAll();
	}

	public BikeModel getOneBikeData(String bid) {
		System.out.println("one bike data");
		return bikeSaleIDao.findOne(bid);

	}

	@Override
	public String getCompanyOrderForBike() {
		// TODO Auto-generated method stub
		long result = orderBike.count();
		String prefix = "COFBID";
		return prefix + (result + 1);

	}

	
	

	@Override
	public List<CompanyOrderForBike> getOrderBike(CompanyOrderForBike companyOrderForBike) {
		// TODO Auto-generated method stub
		return (List<CompanyOrderForBike>) orderBike.findAll();

	}

	@Override
	public List<CompanyOrderForAccessories> getOrderBike(CompanyOrderForAccessories companyOrderForAccessories) {
		// TODO Auto-generated method stub
		return (List<CompanyOrderForAccessories>) ordersAccessories.findAll();
	}

	@Override
	public List<SoldOldBikeStock> getOldSoldBike(SoldOldBikeStock soldOldBikeStock) {
		// TODO Auto-generated method stub
		return (List<SoldOldBikeStock>) sold.findAll();
	}

	@Override
	public List<OldBikeStock> getOldBikeStock(OldBikeStock oldBikeStock) {
		// TODO Auto-generated method stub
		return (List<OldBikeStock>) old.findAll();
	}

	@Override
	public List<AccessoriesSaleForUser> displayAllAccessoriesSaleForUser(
			AccessoriesSaleForUser accessoriesSaleForUser) {

		return (List<AccessoriesSaleForUser>) bikeSaleIDaoAccessoriesSaleForUser.findAll();
	}

	@Override
	public List<SoldAccessories> displayAllSoldAccessories(SoldAccessories soldAccessories) {

		return (List<SoldAccessories>) bikeSaleIDaoSoldAccessories.findAll();
	}

	@Override
	public List<SoldBikeStock> displayAllSoldBikeStock(SoldBikeStock soldBikeStock) {
		// TODO Auto-generated method stub
		return (List<SoldBikeStock>) bikeSaleIDaoSoldNewBike.findAll();
	}

	@Override
	public List<BikeSaleForUser> getAllBikeSaleForUser() {
		// TODO Auto-generated method stub
		return (List<BikeSaleForUser>) bikeSaleForUserdaoI.findAll();
	}

	@Override
	public List<AccessoriesDeadStock> getAllDeadStockAccessories() {
		// TODO Auto-generated method stub
		return (List<AccessoriesDeadStock>) bikeSaleDaoIForDeadStockAccessories.findAll();
	}

	/*@Override
	public String getAccessoriesSaleForUserID() {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public long getAllBikeSaleForUserCount() {
		// TODO Auto-generated method stub
		System.out.println("count");
		return bikeSaleForUserdaoI.count();
	}

	@Override
	public long getAllOldBikeStockCount() {
		// TODO Auto-generated method stub
		return old.count();
	}

	@Override
	public long getAllDeadStockCount() {
		// TODO Auto-generated method stub
		return bikeDead.count();
	}
	@Override
	public long getAllSoldBikeSaleForUSerCount() {
		// TODO Auto-generated method stub
		return bikeSaleIDaoSoldNewBike.count();
	}
	@Override
	public long getAllSoldOldBikeCount() {
		// TODO Auto-generated method stub
		return sold.count();
	}
	@Override
	public long getAllCompanyOrderBikeCount() {
		// TODO Auto-generated method stub
		return orderBike.count();
	}

	
	public CompanyOrderForBike saveOrderToCompanyBike(CompanyOrderForBike companyOrderForBike) {
		// TODO Auto-generated method stub
		System.out.println("order id");
		
		return orderBike.save(companyOrderForBike);
	}
	
	
	
	public AddAccessories getBikeName(String id)
	{
		return bikeSaleIDaoAddAccessories.findOne(id);
	}
	
	
	public String getCompanyOrderForAccessoriesId() {
		// TODO Auto-generated method stub
		long result = ordersAccessories.count();
		String prefix = "COFAID";
		return prefix + (result + 1);

	}
	
	
	public CompanyOrderForAccessories saveAccessoriesOrder(CompanyOrderForAccessories cmpnya)
	{
		
		System.out.println("in company order accessories");
		return ordersAccessories.save(cmpnya);
	}

	public List<AddAccessories> getAllAccessoriesData()
	{
		
		System.out.println("in accessories");
		return (List<AddAccessories>) bikeSaleIDaoAddAccessories.findAll();
	}
	
	
	public AddAccessories getOneAccessories(String Accid)
	{
		
		System.out.println("singleAccssories");
		return bikeSaleIDaoAddAccessories.findOne(Accid);
		
	}
	
	
	//Bike sale for User
	
	public BikeSaleForUser SaveBikeSale(BikeSaleForUser bikesaleuser,MultipartFile profilePic)
	{
		
		logger.info("In AdminServiceImplementation  save method");
		try {
			byte[] bytes = profilePic.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + profilePic.getOriginalFilename());
			Files.write(path, bytes);
			bikesaleuser.setImage(UPLOADED_FOLDER + profilePic.getOriginalFilename());
		} catch (IOException e) {
			logger.error("while saving profile picture", e);
			e.printStackTrace();
		}
		return bikeSaleForUserdaoI.save(bikesaleuser);
		

	}

	@Override
	public String getBikeSaleForUserID() {
		// TODO Auto-generated method stub
		long result = bikeSaleForUserdaoI.count();
		String prefix = "BSFUID";
		return prefix + (result + 1);
	
	}
	
	
	public AccessoriesSaleForUser SaveAccessoriesSale(AccessoriesSaleForUser accessoriesSaleForUser,MultipartFile profilePic)
	{
		
		logger.info("In AdminServiceImplementation  save method");
		try {
			byte[] bytes = profilePic.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + profilePic.getOriginalFilename());
			Files.write(path, bytes);
			accessoriesSaleForUser.setImage(UPLOADED_FOLDER + profilePic.getOriginalFilename());
		} catch (IOException e) {
			logger.error("while saving profile picture", e);
			e.printStackTrace();
		}
		return bikeSaleIDaoAccessoriesSaleForUser.save(accessoriesSaleForUser);
		
	}

	//to get count of accesories sale for user 
	@Override
	public String getAccessoriesSaleForUserID() {
		// TODO Auto-generated method stub
		long result = bikeSaleIDaoAccessoriesSaleForUser.count();
		String prefix = "ASFUID";
		return prefix + (result + 1);
	
	}

	public Object getAccessoriesSaleForUserById(String accessoriesSaleForUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}