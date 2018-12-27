package com.app.extremity.GlobalExceptionHandlerController;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.app.extremity.exceptionHandling.CustomException;

@ControllerAdvice
public class GlobalException 
{
	@ExceptionHandler(IOException.class)
	public ModelAndView  processIOException(IOException ioe)
	{
		ModelAndView mav = new ModelAndView("exceptionPage");
		 mav.addObject("name", ioe.getClass().getSimpleName());
	     mav.addObject("message", ioe.getMessage());
	 
	     return mav;
	}
	@ExceptionHandler(CustomException.class)
	public ModelAndView  processCustomException(CustomException cd)
	{
		ModelAndView mav = new ModelAndView("exceptionPage");
		 mav.addObject("name", cd.getName());
	     mav.addObject("message", cd.getMessage());
	 
	     return mav;
	}	
}