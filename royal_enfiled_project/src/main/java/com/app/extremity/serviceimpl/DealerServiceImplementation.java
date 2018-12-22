package com.app.extremity.serviceimpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.AccessoriesStockIDao;
import com.app.extremity.idao.BikeModelIDao;
import com.app.extremity.idao.BikeModelNameIDao;
import com.app.extremity.idao.BikeSaleForUserIDaoI;
import com.app.extremity.idao.CartIDaoi;
import com.app.extremity.idao.CityIdao;
import com.app.extremity.idao.CountryIdao;
import com.app.extremity.idao.OldBikeStockIDao;
import com.app.extremity.idao.RegistrationIdao;
import com.app.extremity.idao.StateIdao;
import com.app.extremity.iservice.IDealerService;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeModelName;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Cart;
import com.app.extremity.model.City;
import com.app.extremity.model.Country;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.Registration;
import com.app.extremity.model.State;


@Service
public class DealerServiceImplementation implements IDealerService{
@Autowired
RegistrationIdao registrationIdao;
@Autowired
CityIdao cityIdao;
@Autowired
CountryIdao countryIdao;
@Autowired 
StateIdao statedaoi; 


@Autowired
BikeModelIDao bikeModelIdao;
@Autowired
BikeSaleForUserIDaoI bikeSaleForUserIdao;
@Autowired
CartIDaoi cartIdaoi;
@Autowired
AccessoriesStockIDao accessoriesStockIdao;
@Autowired
OldBikeStockIDao oldBikeStockIdao;
@Autowired
 BikeModelNameIDao bikeModelNameIdao;

//this method to save user/dealer
//@Author Akshata Yevatkar 
@Override
public Registration saveData(Registration register,HttpServletRequest request) {
	// TODO Auto-generated method stub
	HttpSession session = request.getSession();
	Registration reg=registrationIdao.save(register);
	session.setAttribute("reg", reg);
	
	return reg;
}

	

/* //@Author Akshata Yevatkar
//this method to get count for registered users
@Override
public int getIdCount(String id) {
	// TODO Auto-generated method stub
	int result=(int) registrationIdao.count();
	System.out.println("In getIdCount().....result---"+result);
	return result;
}*/


//@Author Shital Belokar
//this method to validate email
@Override
public Registration findEmail(String email) {
	System.out.println("in service impl Find email method");
	//return daologin.findAllByEmail(email);
	Registration rg=registrationIdao.findAllByEmail(email);
	System.out.println("in serviceimpl find email method"+rg);
	return rg;
}
  
//@Author Sonika Takalkar
//this method to get  list of countries 
@Override
public List<Country> getAllcountry() {
	System.out.println("in Getallcountry service...");
	 List<Country>list= (List<Country>) countryIdao.findAll();
	 System.out.println("serviceImpl"+list);
	 return list;
}

//@Author Sonika Takalkar
//this method to get states from a country
@Override
public List<State> findAllState(int a) {
	System.out.println("in serviceimpl"+a);
	   Country country=  countryIdao.findOne(a);
	    List<State>list= statedaoi.findAllByCountry(country);
		System.out.println("serviceimple="+list);
	    return list;

}

//@Author Sonika Takalkar
//this method to get cities from states
@Override
public List<City> getAllcitiesByState(String b) {
	// TODO Auto-generated method stub
	System.out.println("in service cities...");
	State sname= statedaoi.findOneBySname(b);
	List<City>list= cityIdao.findAllCityByState(sname);
	return list;
}


//@Author Akshata Yevatkar
//to get user count
@Override
public int getUserCount() {
	// TODO Auto-generated method stub
	System.out.println("In getRoleCount");
	int result=registrationIdao.getUserCount();
	System.out.println("After fetching role count---"+result);
	return result;

}

//@Author Akshata Yevatkar
//this method is to get only DealerCount from db
@Override
public int getDealerCount() {
	// TODO Auto-generated method stub
	System.out.println("In getDealerCount() of serviceImpl ");
	return registrationIdao.getDealerCount();

}


@Override
public int getLogin(String email, String password,HttpServletRequest request) {
	System.out.println("in serviceimpl login...");
	HttpSession session = request.getSession();
	Registration login1= registrationIdao.findAllByEmailAndPassword(email,password);
		System.out.println("email serviceimpl"+login1.getEmail());
		if(login1!=null){
			session.setAttribute("reg", login1);
			session.setAttribute("id", login1.getRegistrationId());
			session.setAttribute("email", login1.getEmail());
			session.setAttribute("password", login1.getPassword());
			System.out.println(email+" "+password);
			if(email.equals(login1.getEmail()) && password.equals(login1.getPassword()))
			{
				return 1;
			}
		
		}
		return 0;
}	

@Override
	public BikeModel saveBikes(BikeModel bike) {
		bike.setModelId(getModelCount());
		return bikeModelIdao.save(bike);
	
	}

	

	@Override
	public List<BikeModel> getAllBikes() {
		List<BikeModel> list= (List<BikeModel>) bikeModelIdao.findAll();
		return list;
	}



	@Override
	public String getModelCount() {
		// TODO Auto-generated method stub
		System.out.println("in modelcount method");
		int bm=(int)  bikeModelIdao.count();
		String model="BKMID00";
		bm++;
		model=model+Integer.toString(bm);
		
		return model;
	}




	@Override
	public List<BikeSaleForUser> getBikeIdWiseAllSpecification() {
		// TODO Auto-generated method stub
		List<BikeSaleForUser> bs= (List<BikeSaleForUser>) bikeSaleForUserIdao.findAll();
		System.out.println("serviceimpl quickview"+bs);
		return bs;
	}

	
	
	@Override
	public List<BikeSaleForUser> getBikeId() {
		// TODO Auto-generated method stub
		List<BikeSaleForUser> bs= (List<BikeSaleForUser>) bikeSaleForUserIdao.findAll();
		System.out.println("serviceimpl quickview"+bs);
		return bs;
	}


	
	@Override
	public Cart saveCart(Cart cart) {
		// TODO Auto-generated method stub
		System.out.println("in serviceimpl save cart");
		Cart c=cartIdaoi.save(cart);
		return c;
	}

	@Override
	public List<Cart> getAllCartById(Registration reg) {
		// TODO Auto-generated method stub
		System.out.println("in getallbycartid");
		Registration regi=registrationIdao.findOne(reg.getRegistrationId());
		List<Cart> allcartlist=(List<Cart>) cartIdaoi.findAllByRegistration(regi);
		System.out.println("in serviceimpl get cartid"+allcartlist);
		return allcartlist;
	}

	@Override
	public void deleteCart(int productId) {
		// TODO Auto-generated method stub
		System.out.println("in delete cart method");
		cartIdaoi.delete(productId);
	}



	@Override
	public List<Registration> getAllRegistrationDetails() {
		System.out.println("in getallregistration details");
		List<Registration> regi=(List<Registration>) registrationIdao.findAll();
		return regi;
	}



	@Override
	public List<Cart> getAllCart() {
		System.out.println("in serviceimpl get all cart");
		List<Cart> cartlist=(List<Cart>) cartIdaoi.findAll();
		return cartlist;
	}

	@Override
	public String getAccCount() {
		System.out.println("in modelcount method");
		int AS=(int)  accessoriesStockIdao.count();
		String modeln="ACC00";
		AS++;
		modeln=modeln+Integer.toString(AS);
		
		return modeln;
		
		
		
	}



	@Override
	public List<AccessoriesStock> getAllAccessories() {
		
		List<AccessoriesStock> list= (List<AccessoriesStock>) accessoriesStockIdao.findAll();
		return list;
	}



	@Override
	public List<AccessoriesStock> getAccessoriesId() {
		// TODO Auto-generated method stub
				List<AccessoriesStock> accs=(List<AccessoriesStock>) accessoriesStockIdao.findAll();
				System.out.println("serviceimpl quickview"+accs);
				return accs;
	}
@Override
	public AccessoriesStock saveAccessories(AccessoriesStock Accessories) {
		// TODO Auto-generated method stub
		Accessories.setPartId(getAccCount());
		return accessoriesStockIdao.save(Accessories);
		
	}

@Override
public String getOldBikeCount() {
	int i=(int) oldBikeStockIdao.count();
	String oldbike="OBID00";
	i++;
	oldbike=oldbike+Integer.toString(i);
	System.out.println("generated registration id"+oldbike);
	
	return oldbike;

}



@Override
public OldBikeStock saveOldBike(OldBikeStock oldbike) {
	// TODO Auto-generated method stub
	return oldBikeStockIdao.save(oldbike);
}



@Override
public List<OldBikeStock> getAllOldBike() {

	return (List<OldBikeStock>) oldBikeStockIdao.findAll();
	
	
}



@Override
public List<BikeModelName> getModelname() {
	// TODO Auto-generated method stub

	List<BikeModelName> list=(List<BikeModelName>)bikeModelNameIdao.findAll();
	return list;
}



@Override
public List<OldBikeStock> getAllBikeByOldbikemodelname(String oldBikeModelName) {
	System.out.println("in serviceimpl..."+oldBikeModelName);
	List<OldBikeStock>list= oldBikeStockIdao.findAllBikeByOldBikeModelName(oldBikeModelName);//(oldBikeModelName);
	System.out.println("list"+list);
	return list;
}



@Override
public List<OldBikeStock> getOldBikeId() {
	List<OldBikeStock> ob=(List<OldBikeStock>) oldBikeStockIdao.findAll();
	System.out.println("serviceimpl quickview"+ob);
	return ob;
}


}

