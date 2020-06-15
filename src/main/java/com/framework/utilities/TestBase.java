package com.framework.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.report.listener.ExtentReport;
//@Listeners(com.report.listener.Listener.class)
public class TestBase {
	
	public static commonUtilities common=new commonUtilities();
	public static browserUtility browser=new browserUtility();
	public static ExtentReport repo=new ExtentReport();

	public static Constants cons=new Constants();
	
	public static WebDriver driver;
	public static String S_screenShotName;
	public static String user;
	public static String class_name_screenshot;
	public static String error_msg="";
	private static Logger log=LogManager.getLogger(TestBase.class);
	
	@BeforeSuite
	public void getDependency() throws Exception
	{
		common.Load_Pro_File(System.getProperty("user.dir") + "./Input_Data.properties");
		common.Load_logFile(System.getProperty("user.dir")+"./log4j2.properties");
		//common.deleteScreenShots();
		if(System.getProperty("environment").equalsIgnoreCase("qa") )
		{
			log.info(System.getProperty("environment"));
		}
		browserUtility.lauchBrowser("ch");
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
