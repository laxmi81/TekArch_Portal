package Login_Test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.utilities.TestBase;
import com.framework.utilities.browserUtility;

import Pom_login_pageElements.PageElement;
import Pom_login_pageElements.pageElement_calc;
@Listeners(com.report.listener.Listener.class)

public class Login_to_portal extends TestBase {

	PageElement login;
	//pageElement_calc calc;
	private static Logger log=LogManager.getLogger(Login_to_portal.class);
	
	@BeforeTest
	public void Settings()
	{
		error_msg="";
		class_name_screenshot=log.getClass().getSimpleName();
		//driver.get("https://qa-tekarch.firebaseapp.com/");
		//browserUtility.lauchBrowser("ch");
		driver.get(cons.getAppUrl());
		login=new PageElement(driver);
		//calc=new pageElement_calc(driver);
		//login.loginToPortal();

		
	}
	@AfterMethod
	public void setUrl()
	{
		driver.get(cons.getAppUrl());
	}
	@Test(priority=2)
	public void valid_login() throws Exception
	{
		System.out.println("valid user should enter to portal");
		login.loginToPortal();
		Thread.sleep(2000);
		//login.logout_from_portal();
	}
	@Test(priority=1)
	public void invalid_login() throws Exception
	{
		
		login.invalid_user();
		System.out.println("invalid user should not enter to portal");
	}
	
	
}
