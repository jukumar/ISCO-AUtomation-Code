package com.ISCO.utilities;

import com.ISCO.base.BaseClass;

public class puttyLogCollector extends BaseClass{
	
	//static Logger logger = LogManager.getLogger(puttyLogCollector.class); // Logger Object
//	To create Putty server logs
//	Accessing SSH using pageant and PPK
	static String pageantPath = System.getProperty("user.dir")+"\\src\\test\\resources\\putty\\pageant.exe";
	static String pageantPPK = System.getProperty("user.dir")+"\\src\\test\\resources\\putty\\Automation.Privatekey.ppk";
	
//	Accessing necessary params
	static String puttyPath = System.getProperty("user.dir")+"\\src\\test\\resources\\putty\\putty.exe";
	static String logFilePath = System.getProperty("user.dir")+"\\putty-logs\\";
	static String commandFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\putty\\Command.txt";
	
	/**
	 * @param puttyUserID
	 * @param serverUrl
	 * @param testCase
	 */
	public static void puttyLog(String puttyUserID, String serverUrl, String testCase)
    {
		try
        {         	
//        	Accessing necessary params based on argu's
        	String sessionLogin = puttyUserID+"@"+serverUrl;        	
        	String logFileName = testCase+"-log-&h-&y&m&d-&t.txt";
        	
        	
//        	String path = "\""+puttyPath+"\" -ssh "+sessionLogin+" -sessionlog \""+logFilePath+logFileName+"\" -m \""+commandFilePath+"\"";

//        	Launching Pageant with PPK
        	Runtime.getRuntime().exec("\""+pageantPath+"\" \""+pageantPPK+"\"");
        	Thread.sleep(3000);
//        	Launching Putty with Command.txt
        	Runtime.getRuntime().exec("\""+puttyPath+"\" -ssh "+sessionLogin+" -sessionlog \""+logFilePath+logFileName+"\" -m \""+commandFilePath+"\"");
        	logger.info("Putty session opened...");
        	logger.info("Putty server logs captured here: "+System.getProperty("user.dir")+"\\putty-logs\\"+testCase+"-log-xxx.txt");
        	Thread.sleep(10000);
//        	Killing Putty
        	Runtime.getRuntime().exec("taskkill /f /im putty.exe");
        	logger.info("Putty session closed...");
       
        }
        catch (Exception e)
        {
                        e.printStackTrace();
        }
    }
//	@Test
//	public static void testRun()
//	{
//		puttyLog("innkare","skyeqa1.dev.innoveo.cloud", "TSDCD001");
//	}
		
}