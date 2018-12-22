package com.app.extremity.serviceimpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.AccountNewBikeCount;
import com.app.extremity.idao.AccountSoldBikeStockInterface;
import com.app.extremity.idao.Account_Invoice_DaoInterface;
import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.model.Demo;
import com.app.extremity.model.NewBikeStock;

@Service
public class Account_ServiceImpl implements Account_ServiceInterface {

	@Autowired
	Account_Invoice_DaoInterface dao;
	@Autowired
	AccountNewBikeCount adao;
	@Autowired
	AccountSoldBikeStockInterface asdao;
	
	@Override
	public List<Demo> getAllDemo() {
		
		List<Demo> list = (List<Demo>)dao.findAll();
		return list;
	}

	
	
	@Override
	public Long NewBikeCount(Date fd, Date ld) {
		long cnt = adao.countByArrivalDateBetween(fd, ld);
		System.out.println("New Bike ServiceImpl...  " + cnt);
		return cnt;
	}



	@Override
	public Long SoldBikeCount(Date fds, Date lds) {
		long cnt = asdao.countBysoldbikedateBetween(fds, lds);
		System.out.println("Sold Bike ServiceImpl.. " + cnt);
		return cnt;
	}



	@Override
	public List<NewBikeStock> getAllNewBikeStock() {
		List<NewBikeStock> list = (List<NewBikeStock>)adao.findAll();
		System.out.println("List of new bike.." + list);
		for(NewBikeStock n : list) {
			System.out.println("BikeId.." + n.getBikeId() +" "+ "mfgDate" + n.getBikeMfgDate() );
		}
		return list;
	}


	

}
