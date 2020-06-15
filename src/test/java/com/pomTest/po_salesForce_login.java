package com.pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.utilities.TestBase;

public class po_salesForce_login extends TestBase{
	private static String PAGE_URL="https://login.salesforce.com/";
	public po_salesForce_login(WebDriver driver)
	{
		driver.get(PAGE_URL);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user_name;
	
	public void  setUser_Name(String userName){
		user_name.clear();
		user_name.sendKeys(userName);
	   }
	
	

}
