package Login_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.utilities.TestBase;

import Pom_login_pageElements.Intract_toolTip;
import Pom_login_pageElements.PageElement;
import Pom_login_pageElements.pageElement_calc;

public class toolTip_test extends TestBase{
        PageElement login;
	
        Intract_toolTip tool_tip;
	
	@BeforeTest
	public void Settings()
	{
		error_msg="";
		//class_name_screenshot=log.getClass().getSimpleName();
		//driver.get("https://qa-tekarch.firebaseapp.com/");
		//browserUtility.lauchBrowser("ch");
		driver.get(cons.getAppUrl());
		login=new PageElement(driver);
		tool_tip=new Intract_toolTip(driver);
				
	}
	
	@Test(priority=1)
	public void Tool_tip_test() throws Exception
	{
		//login.loginToPortal();
		tool_tip.act_on_toolTip();
		
		System.out.println("Test Pass");
	}
	

}
