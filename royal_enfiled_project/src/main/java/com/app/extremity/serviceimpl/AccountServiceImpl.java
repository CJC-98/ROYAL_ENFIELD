package com.app.extremity.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.AccountGetCartIDao;
import com.app.extremity.idao.AccountNewBikeCount;
import com.app.extremity.idao.AccountSoldBikeStockInterface;
import com.app.extremity.idao.Account_Invoice_DaoInterface;
import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.model.Cart;
import com.app.extremity.model.Demo;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Registration;

@Service
public class AccountServiceImpl implements Account_ServiceInterface {

	@Autowired
	Account_Invoice_DaoInterface invoiceDao;
	@Autowired
	AccountNewBikeCount newBikeCountDao;
	@Autowired
	AccountSoldBikeStockInterface soldBikeDao;
	@Autowired
	AccountGetCartIDao cartDao;
	
	@Override
	public List<Demo> getAllDemo() {
		List<Demo> list = (List<Demo>)invoiceDao.findAll();
		return list;
	}

	@Override
	public Long NewBikeCount(Date fd, Date ld) {
		long cnt = newBikeCountDao.countByArrivalDateBetween(fd, ld);
		System.out.println("New Bike ServiceImpl...  " + cnt);
		return cnt;
	}

	@Override
	public Long SoldBikeCount(Date fds, Date lds) {
		long cnt = soldBikeDao.countBysoldbikedateBetween(fds, lds);
		System.out.println("Sold Bike ServiceImpl.. " + cnt);
		return cnt;
	}

	@Override
	public List<NewBikeStock> getAllNewBikeStock() {
		List<NewBikeStock> list = (List<NewBikeStock>)newBikeCountDao.findAll();
		System.out.println("List of new bike.." + list);
		for(NewBikeStock n : list) {
			System.out.println("BikeId.." + n.getBikeId() +" "+ "mfgDate" + n.getBikeMfgDate() );
		}
		return list;
	}

	@Override
	public List<Cart> getAllCart() {
		System.out.println("in serviceimpl.. getAllCart..");
		List<Cart> list = (List<Cart>)cartDao.findAll();
		return list;
	}

	@Override
	public List<Cart> getCartByRegistrationId(Registration reg) {
		System.out.println("in getCartBy Reg Id..");
		List<Cart> cart = (List<Cart>)cartDao.findAllByRegistration(reg);
		return cart;
	}


	
	
}
