package com.house;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(mainhouse.class);
	float num1;
	int num2;
	 public MyException(float s) 
	    { 
	        num1=s;
	    } 
	 public MyException(int s) 
	    { 
	        num2=s;
	    } 
	 public void getmessage() {
		 logger.error("input has to be positive");
	 }

}
