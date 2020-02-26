package com.house;
import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class mainhouse{
private static Logger logger = LogManager.getLogger(mainhouse.class);

public static void main(String[] args)throws IOException {
	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
	logger.info("Enter the area of material for standard material,above standard material,high standard material");
	int stdmat = Integer.parseInt(inp.readLine());
	try
	 { 
        if(stdmat<0) 
        throw new MyException(stdmat); 
    } 
    catch (MyException ex) 
    { 
        logger.debug("Caught");  
        ex.getmessage(); 
        logger.info("once again enter the area of material");
        stdmat= Integer.parseInt(inp.readLine());
    } 
	int abovestdmat= Integer.parseInt(inp.readLine());
	try
	 { 
       if(abovestdmat<0) 
       throw new MyException(abovestdmat); 
   } 
   catch (MyException ex) 
   { 
       logger.debug("Caught");  
       ex.getmessage(); 
       logger.info("once again enter the area of material");
       abovestdmat= Integer.parseInt(inp.readLine());
   } 
	int highstdmat = Integer.parseInt(inp.readLine());
	try
	 { 
       if(highstdmat<0) 
       throw new MyException(highstdmat); 
   } 
   catch (MyException ex) 
   { 
       logger.debug("Caught");  
       ex.getmessage(); 
       logger.info("once again enter the area of material");
       highstdmat= Integer.parseInt(inp.readLine());
   } 
	logger.info("enter yes if you want fully automated home or no if you don't");
	String str = inp.readLine();
	house h = new HighStandard(stdmat,abovestdmat,highstdmat,str.equals("yes"));
	logger.info("Total cost of the house is:"+h.totalCost());
	logger.info("Enter Principle, rate and time:");
	float principle = Float.parseFloat(inp.readLine());
	try
	 { 
         if(principle<0) 
         throw new MyException(principle); 
     } 
     catch (MyException ex) 
     { 
         logger.debug("Caught");  
         ex.getmessage(); 
         logger.info("once again enter the principle");
         principle= Float.parseFloat(inp.readLine());
     } 
	
	float rate = Float.parseFloat(inp.readLine());
	try
	 { 
        if(rate<0) 
        throw new MyException(principle); 
    } 
    catch (MyException ex) 
    { 
        logger.debug("Caught");  
        ex.getmessage(); 
        logger.info("once again enter the rate");
        rate= Float.parseFloat(inp.readLine());
    } 
	float time = Float.parseFloat(inp.readLine());
	try
	 { 
       if(time<0) 
       throw new MyException(principle); 
   } 
   catch (MyException ex) 
   { 
       logger.debug("Caught");  
       ex.getmessage(); 
       logger.info("once again enter the rate");
       time= Float.parseFloat(inp.readLine());
   } 
	interest o = new interest(principle,rate,time);
	logger.info("Simple Interest:"+o.simpleInterest());
	logger.info("Compound Interest:"+o.compoundInterest());
}
}
