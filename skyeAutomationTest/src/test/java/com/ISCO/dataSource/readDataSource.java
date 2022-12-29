package com.ISCO.dataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.*; 

import org.apache.poi.hpsf.CustomProperties;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.internal.PropertiesFile;
import org.apache.poi.ss.usermodel.Sheet;

public class readDataSource 
{
	public static   List<String> validDataHeader=new ArrayList<String>();
	public static   List<String> validDataValue=new ArrayList<String>();
	public static   List<String> invalidDataHeader=new ArrayList<String>();
	public static   List<String> invalidDataValue=new ArrayList<String>();
	
	public static   List<String> testcasevalidDataHeader=new ArrayList<String>();
	public static   List<String> testcasevalidDataValue=new ArrayList<String>();
	public static   List<String> testcaseinvalidDataHeader=new ArrayList<String>();
	public static   List<String> testcaseinvalidDataValue=new ArrayList<String>();
	public static 	XSSFWorkbook workbook;
	
	public String username;
	public String password;

	//public static HashMap<String,String> validData=new HashMap<String,String>();
	//public static HashMap<String,String> invalidData=new HashMap<String,String>();
	//public static HashMap<String,String> testCase_validData=new HashMap<String,String>();
	//public static HashMap<String,String> testCase_invalidData=new HashMap<String,String>();
	
    public void readDataFormExcel() {
    	try {
	        FileInputStream file;
			//file = new 	FileInputStream(new File("C:\\Users\\JudeKumar\\Documents\\GitHub\\Skye_AutomationQA_Regression8.6.0\\skyeAutomationTest\\src\\test\\resources\\TestData\\TestDataSource.xlsx"));
	        file = new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\TestDataSource.xlsx"));
	        workbook = new XSSFWorkbook(file);
	        XSSFSheet vSheet= workbook.getSheet("Valid");
	        DataFormatter dataFormatter = new DataFormatter();
	        int vSheet_Tot_Row_Count = vSheet.getLastRowNum();
	        int vSheet_Tot_Cell_Count = vSheet.getRow(0).getLastCellNum();
	        Double cellDblData;
	        int cellIntData ;
	        String cellDataString = null;
	        for (int lc_row=1; lc_row<=vSheet_Tot_Row_Count;lc_row++) {
	        	String testCaseId= vSheet.getRow(lc_row).getCell(0).getStringCellValue();
	        	for (int lc_col=1; lc_col<vSheet_Tot_Cell_Count;lc_col++) {
	        		String dataName= vSheet.getRow(0).getCell(lc_col).getStringCellValue();
	        		CellType type = vSheet.getRow(lc_row).getCell(lc_col).getCellType();
	        		if (type.name().equals("NUMERIC")) {
	        			cellDblData=vSheet.getRow(lc_row).getCell(lc_col).getNumericCellValue();
	        			if (cellDblData.toString().endsWith(".0")){
	        				 cellIntData=Integer.parseInt(cellDblData.toString().replace(".0", ""));
	        				 validDataValue.add(String.valueOf(cellIntData));
	        			}else{
	        				validDataValue.add(cellDblData.toString());
	        			}
	        			validDataHeader.add(testCaseId+"_"+dataName);
	        			
	        			//validData.put(testCaseId+"_"+dataName, cellData.toString());
	        		}
	        		if (type.name().equals("STRING")) {
	        			cellDataString=vSheet.getRow(lc_row).getCell(lc_col).getStringCellValue();
	        			validDataHeader.add(testCaseId+"_"+dataName);
	        			validDataValue.add(cellDataString);
	        			//validData.put(testCaseId+"_"+dataName, cellDataString);
	        		}
	        		if (type.name().equals("BLANK")) {
	        			cellDataString=vSheet.getRow(lc_row).getCell(lc_col).getStringCellValue();
	        			validDataHeader.add(testCaseId+"_"+dataName);
	        			validDataValue.add(cellDataString);
	        			//validData.put(testCaseId+"_"+dataName, cellDataString);
	        		}
	        		if (type.name().equals("BOOLEAN")) {
                        Boolean celleDataBoolean = vSheet.getRow(lc_row).getCell(lc_col).getBooleanCellValue();
                        //cellDataString=
                        validDataHeader.add(testCaseId+"_"+dataName);
                        validDataValue.add(celleDataBoolean.toString());
                        //validData.put(testCaseId+"_"+dataName, cellDataString);
                    }
		        }
	        }
	        //Invalid
	        Sheet ivSheet= workbook.getSheet("Invalid");
	        int ivSheet_Tot_Row_Count = ivSheet.getLastRowNum();
	        int ivSheet_Tot_Cell_Count = ivSheet.getRow(0).getLastCellNum();
	        for (int lc_row=1; lc_row<=ivSheet_Tot_Row_Count;lc_row++) {
	        	String testCaseId= ivSheet.getRow(lc_row).getCell(0).getStringCellValue();
	        	for (int lc_col=1; lc_col<ivSheet_Tot_Cell_Count;lc_col++) {
	        		String dataName= ivSheet.getRow(0).getCell(lc_col).getStringCellValue();
	        		CellType type = ivSheet.getRow(lc_row).getCell(lc_col).getCellType();
	        		if (type.name().equals("NUMERIC")) {
	        			cellDblData=ivSheet.getRow(lc_row).getCell(lc_col).getNumericCellValue();
	        			if (cellDblData.toString().endsWith(".0")){
	        				 cellIntData=Integer.parseInt(cellDblData.toString().replace(".0", ""));
	        				 invalidDataValue.add(String.valueOf(cellIntData));
	        			}else{
	        				invalidDataValue.add(cellDblData.toString());
	        			}
	        			invalidDataHeader.add(testCaseId+"_"+dataName);
	        		}
	        		if (type.name().equals("STRING")) {
	        			cellDataString=ivSheet.getRow(lc_row).getCell(lc_col).getStringCellValue();
	        			invalidDataHeader.add(testCaseId+"_"+dataName);
	        			invalidDataValue.add(cellDataString);
	        			//invalidData.put(testCaseId+"_"+dataName, cellDataString);
	        		}
		        }
	        }
	        workbook.close();
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static void readSpecificTestCaseData(String TestCaseID) {
    	testcasevalidDataHeader.clear();
    	testcasevalidDataValue.clear();
    	testcaseinvalidDataHeader.clear();
    	testcaseinvalidDataValue.clear();
    	for (int i=0;i<validDataHeader.size();i++) {
    		if (validDataHeader.get(i).startsWith(TestCaseID)) {
    			testcasevalidDataHeader.add(validDataHeader.get(i));
    			testcasevalidDataValue.add(validDataValue.get(i));
    		}
    	}
    	for (int i=0;i<invalidDataHeader.size();i++) {
    		if (invalidDataHeader.get(i).startsWith(TestCaseID)) {
    			testcaseinvalidDataHeader.add(invalidDataHeader.get(i));
    			testcaseinvalidDataValue.add(invalidDataValue.get(i));
    		}
    	}
    }
    
    public static String readSpecificData(String TestCaseId, String DataType, String DataId) {
    	String returnData = null;
    	if (DataType.equalsIgnoreCase("valid")) {
    		for (int i=0;i<testcasevalidDataHeader.size();i++) {
        		if (testcasevalidDataHeader.get(i).equalsIgnoreCase(TestCaseId+"_"+DataId)) {
        			returnData= testcasevalidDataValue.get(i);
        		}
        	}
    	}else {
    		for (int i=0;i<testcaseinvalidDataHeader.size();i++) {
        		if (testcaseinvalidDataHeader.get(i).equalsIgnoreCase(TestCaseId+"_"+DataId)) {
        			returnData= testcaseinvalidDataValue.get(i);
        		}
        	}
    	}
    	return returnData;
	}
    
    public void readFromProperties() {
    	try {
			FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties"));
			try {
				Properties prop = new Properties();
				prop.load(file);
				username = prop.getProperty("username");
				password = prop.getProperty("password");
				}catch (IOException e) {
					e.printStackTrace();
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
