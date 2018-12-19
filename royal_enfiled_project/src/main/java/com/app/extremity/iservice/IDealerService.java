package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Cart;
import com.app.extremity.model.City;
import com.app.extremity.model.Country;
import com.app.extremity.model.Login;
import com.app.extremity.model.Registration;
import com.app.extremity.model.State;



public interface IDealerService {
public Registration saveData(Registration register);

public Login findEmail(String email);

public List<Country> getAllcountry();

public List<State> findAllState(int a);

public List<City>getAllcitiesByState(String b );
public int getUserCount();
public int getDealerCount();
public Login getLogin(String email, String password);

public List<BikeSaleForUser> getBikeId();
public BikeModel saveBikes(BikeModel bike); 
public String getModelCount();
public List<BikeModel> getAllBikes();
public List<BikeSaleForUser> getBikeIdWiseAllSpecification();
public Cart saveCart(Cart cart);
public List<Cart> getAllCart();
void deleteCart(int productId);

}
