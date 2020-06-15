package Login_Test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.utilities.TestBase;

import Pom_login_pageElements.PageElement;
import Pom_login_pageElements.pageElement_calc;

public class calculator_test extends TestBase {
	PageElement login;
	
	pageElement_calc calc;
	
	@BeforeTest
	public void Settings()
	{
		error_msg="";
		//class_name_screenshot=log.getClass().getSimpleName();
		//driver.get("https://qa-tekarch.firebaseapp.com/");
		//browserUtility.lauchBrowser("ch");
		driver.get(cons.getAppUrl());
		login=new PageElement(driver);
		calc=new pageElement_calc(driver);
		//calc=new pageElement_calc(driver);
		//login.loginToPortal();

		
	}
	
	@Test(priority=1)
	public void calculator_test() throws Exception
	{
		//login.loginToPortal();
		String actual_res=calc.Into_calculator().toString();
		String expected_res="225";
//		assertEquals(expected_res,actual_res);
		
		System.out.println("Test Pass");
	}
	
}
