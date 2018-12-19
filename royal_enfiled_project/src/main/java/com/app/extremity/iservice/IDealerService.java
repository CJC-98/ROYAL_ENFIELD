package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.City;
import com.app.extremity.model.Country;
import com.app.extremity.model.Login;
import com.app.extremity.model.OldBikeStock;
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
public Login getLogin(Login login);
public String getModelCount();
public OldBikeStock saveoldbike(OldBikeStock oldBk);

}
