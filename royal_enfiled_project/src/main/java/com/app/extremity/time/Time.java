package com.app.extremity.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;

public class Time {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		System.out.println("in time..");
		LocalTime time = LocalTime.now();
		System.out.println("time is = " + time);
		
		LocalDate date = LocalDate.now();
		System.out.println("date.." + date);
		
	    
		 
	}

}
