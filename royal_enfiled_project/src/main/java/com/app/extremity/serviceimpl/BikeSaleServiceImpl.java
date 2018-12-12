package com.app.extremity.serviceimpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.idao.BikeSaleIDao;
import com.app.extremity.idao.BikeSaleIDaoColor;
import com.app.extremity.idao.BikeSaleIDaoEngineCapacity;
import com.app.extremity.iservice.BikeSaleServiceI;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.Color;
import com.app.extremity.model.EngineCapacity;

@Service
public class BikeSaleServiceImpl implements BikeSaleServiceI
{
	//for bike model
	@Autowired
	BikeSaleIDao bikeSaleIDao;
	
	//for engine capacity
	@Autowired
	BikeSaleIDaoEngineCapacity bkEngCap;
	
	//for color
	@Autowired
	BikeSaleIDaoColor bkClr;
	
	
	static Logger logger=LogManager.getLogger(BikeSaleServiceImpl.class);

	/* this is path where profile picture will be stored */
	private String UPLOADED_FOLDER = "H:\\Upload\\";
	
	/*@Override
	public void addNewBikeModel(BikeModel bikeModel,EngineCapacity engineCap,Color color, MultipartFile profilePic) {
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
	
		
	}*/

	@Override
	public int getBikeModelCount() 
	{
		// TODO Auto-generated method stub
		logger.info("In Bike Model Count...Start.");
		int result=bikeSaleIDao.getBikeModelCount();
		logger.info("In Bike Model Count...End.");
		return result;
	}

	@Override
	public int getEngineCapacityCount() {
		// TODO Auto-generated method stub
		logger.info("In engine cap Count...Start.");
		int result=bkEngCap.getEngineCapcityCount();
		logger.info("In engine cap Count...End.");
		return result;
		}

	@Override
	public long getColorCount() 
	{
		// TODO Auto-generated method stub
		System.out.println("In color...");
		return bkClr.count();
	}

	@Override
	public String getBikeColor() {
		// TODO Auto-generated method stub
		long clrCnt=getColorCount();
		return "BCLRID00"+(clrCnt);
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

	
	

}
