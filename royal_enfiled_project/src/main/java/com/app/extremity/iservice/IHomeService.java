package com.app.extremity.iservice;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public interface IHomeService {

	int checkLoginCredentials(String email, String password, HttpServletRequest request);

}
