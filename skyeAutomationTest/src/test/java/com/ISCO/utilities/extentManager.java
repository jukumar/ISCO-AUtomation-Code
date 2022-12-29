package com.ISCO.utilities;

import java.io.File;
import java.text.SimpleDateFormat;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import java.util.Date;

public class extentManager {

	public extentManager() {
		// TODO Auto-generated constructor stub
	}
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent==null) {
			
			//SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
			 	//Date date = new Date(); 
		       //String str = formatter.format(date);
		       String str = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
		       extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\extent"+str+".html",true,DisplayOrder.OLDEST_FIRST);			
		       extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\extentReportsConfig\\extent-config.xml"));
			
			
		}
		return extent;
		
	}

}
