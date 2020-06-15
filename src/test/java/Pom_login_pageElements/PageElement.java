package Pom_login_pageElements;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.utilities.TestBase;
import com.framework.utilities.browserUtility;

public class PageElement extends TestBase {

	private static Logger log=LogManager.getLogger(PageElement.class);
	
	public PageElement(WebDriver driver) {
		TestBase.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(id="email_field")
	WebElement ele_email;
	
	@FindBy(id="password_field")
	WebElement ele_password;
	
	@FindBy(xpath="//*[@id=\"login_div\"]/button")
	WebElement ele_loginButton;
	
	//-//h1[contains(text(),'Student Registration Form')]
	@FindBy(xpath="//h1[contains(text(),'Student Registration Form')]")
	WebElement ele_reg;
	
	
	
	public void loginToPortal()
	{
		browserUtility.waitElement(ele_email);
		browserUtility.Input_sendkeys(ele_email, System.getProperty("validuser"));
		browserUtility.Input_sendkeys(ele_password,System.getProperty("validpassword"));
		browser.bt_click(ele_loginButton);
		browserUtility.waitElement(ele_reg);
		if(ele_reg.isDisplayed())
		{
			System.out.println("login pass");
		}
		else
		{
			System.out.println("login fail");
		}
		
	}
	public void invalid_user() throws Exception
	{
		browserUtility.waitElement(ele_email);
		browserUtility.Input_sendkeys(ele_email, System.getProperty("invaliduser"));
		browserUtility.Input_sendkeys(ele_password,System.getProperty("invalidpassword"));
		browser.bt_click(ele_loginButton);
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		al.accept();
		System.out.println("invalid user credentials");
	}
	//--//a[contains(text(),'Logout')]
		@FindBy(xpath="//a[contains(text(),'Logout')]")
		WebElement ele_logout;
		
	public void logout_from_portal()
	{
		browserUtility.waitElement(ele_logout);
		if(ele_logout.isDisplayed())
		{
		browser.bt_click(ele_logout);
		}
		
	}
}
