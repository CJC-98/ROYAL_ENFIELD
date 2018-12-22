package com.app.extremity.iservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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



public interface IDealerService {
public Registration saveData(Registration register, HttpServletRequest request);

public Registration findEmail(String email);

public List<Country> getAllcountry();

public List<State> findAllState(int a);

public List<City>getAllcitiesByState(String b );
public int getUserCount();
public int getDealerCount();
public int getLogin(String email, String password,HttpServletRequest request);

public List<BikeSaleForUser> getBikeId();
public BikeModel saveBikes(BikeModel bike); 
public String getModelCount();
public List<BikeModel> getAllBikes();
public List<BikeSaleForUser> getBikeIdWiseAllSpecification();
public Cart saveCart(Cart cart);
public List<Cart> getAllCart();
void deleteCart(int productId);
public List<Registration> getAllRegistrationDetails();

public List<Cart> getAllCartById(Registration reg);

public List<AccessoriesStock> getAllAccessories();
public AccessoriesStock saveAccessories(AccessoriesStock Accessories);
public List<AccessoriesStock> getAccessoriesId();
public String getAccCount();

public String getOldBikeCount();
public OldBikeStock saveOldBike(OldBikeStock oldbike) ;
public List<OldBikeStock> getAllOldBike() ;
public List<OldBikeStock> getOldBikeId();
public List<BikeModelName>getModelname();

 public List<OldBikeStock> getAllBikeByOldbikemodelname(String oldBikeModelName);


}
