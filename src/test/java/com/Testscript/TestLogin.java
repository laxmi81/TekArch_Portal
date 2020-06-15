package com.Testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.utilities.TestBase;
import com.pomTest.po_salesForce_login;
@Listeners(com.report.listener.Listener.class)
public class TestLogin {
	
	WebDriver driver;
	
	@BeforeSuite
	   public void setup(){
	       //use FF Driver
	       driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	
	 @Test
	   public void applyAsDeveloper() {
		 po_salesForce_login objLoginPage=new po_salesForce_login(driver);
		 objLoginPage.setUser_Name("laxmirajout");
	 }
	 
	 @AfterSuite
	 public void tearDown(){
		 driver.close();
	 }
	 }
	 
	 

