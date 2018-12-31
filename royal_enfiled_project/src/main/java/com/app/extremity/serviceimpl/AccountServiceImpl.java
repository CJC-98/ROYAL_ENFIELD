package com.app.extremity.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.AccountGetCartIDao;
import com.app.extremity.idao.AccountNewBikeCount;
import com.app.extremity.idao.AccountOldBikeCount;
import com.app.extremity.idao.AccountOldSoldBikeCount;
import com.app.extremity.idao.AccountSoldBikeStockInterface;
import com.app.extremity.idao.Account_Invoice_DaoInterface;
import com.app.extremity.idao.CartInvoiceIDao;
import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.model.Cart;
import com.app.extremity.model.CartInvoice;
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
	AccountOldBikeCount oldBikeCountDao;
	@Autowired
	AccountSoldBikeStockInterface soldBikeDao;
	@Autowired
	AccountOldSoldBikeCount oldSoldBikeCountDao;
	@Autowired
	AccountGetCartIDao cartDao;
	@Autowired
	CartInvoiceIDao cartInvoicDao;
	
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
		return list;
	}

	@Override
	public List<Cart> getAllCart() {
		System.out.println("in serviceimpl.. getAllCart..");
		List<Cart> list = (List<Cart>)cartDao.findAll();
		return list;
	}


	@Override
	public List<Cart> getCartByRegistrationAndPurchaseStatus(Registration reg, String purchaseStatus) {
		System.out.println("In getCartByRegistrationAndPurchaseStatus..");
		List<Cart> cart = (List<Cart>)cartDao.findAllByRegistrationAndPurchaseStatus(reg, purchaseStatus);		
		return cart;
	}

	@Override
	public Cart UpdatePurchaseStatus(Cart cart) {
		Cart c = cartDao.save(cart);
		return c;
	}

	@Override
	public CartInvoice SaveCartInvoice(CartInvoice cartInvoice) {
		CartInvoice ci = cartInvoicDao.save(cartInvoice);
		return ci;
	}

	@Override
	public Long OldBikeCount(Date fd, Date ld) {
		long cnt = oldBikeCountDao.countByArrivalDateBetween(fd, ld);
		return cnt;
	}

	@Override
	public Long OldSoldBikeCount(Date fds, Date lds) {
		long cnt = oldSoldBikeCountDao.countBySoldbikedateBetween(fds, lds);
		return cnt;
	}


	
	
}
