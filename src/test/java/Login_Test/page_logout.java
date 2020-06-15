package Login_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.utilities.TestBase;

import Pom_login_pageElements.PageElement;
import Pom_login_pageElements.pageElement_calc;

public class page_logout extends TestBase {
	PageElement login;
	@BeforeTest
	public void Settings()
	{
		error_msg="";
		//class_name_screenshot=log.getClass().getSimpleName();
		//driver.get("https://qa-tekarch.firebaseapp.com/");
		//browserUtility.lauchBrowser("ch");
		driver.get(cons.getAppUrl());
		login=new PageElement(driver);
			}
	
	@Test(priority=1)
	public void logout_test() throws Exception
	{
		//login.loginToPortal();
		Thread.sleep(1000);
		login.logout_from_portal();
	}
}
