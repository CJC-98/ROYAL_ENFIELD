package com.app.extremity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.CityIdao;
import com.app.extremity.idao.CountryIdao;
import com.app.extremity.idao.LoginIdao;
import com.app.extremity.idao.RegistrationIdao;
import com.app.extremity.idao.StateIdao;
import com.app.extremity.iservice.IDealerService;
import com.app.extremity.model.City;
import com.app.extremity.model.Country;
import com.app.extremity.model.Login;
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
LoginIdao loginIdao;

//this method to save user/dealer
//@Author Akshata Yevatkar 
@Override
public Registration saveData(Registration register) {
	// TODO Auto-generated method stub
	return registrationIdao.save(register);
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
public Login findEmail(String email) {
	System.out.println("in service impl Find email method");
	//return daologin.findAllByEmail(email);
	Login lg=loginIdao.findAllByEmail(email);
	System.out.println("in serviceimpl find email method"+lg);
	return lg;
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
public Login getLogin(Login login) {
	// TODO Auto-generated method stub
	return null;
}




}

