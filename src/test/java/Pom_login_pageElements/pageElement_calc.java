package Pom_login_pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.utilities.TestBase;
import com.framework.utilities.browserUtility;

public class pageElement_calc extends TestBase{


	//---//a[contains(text(),'Calculator')]
	//url--https://qa-tekarch.firebaseapp.com/
	//--4---//body//input[6]
	//--5--//body//input[7]
	//--*--//*[@id="container"]/form/input[13]
	//--=--//*[@id="container"]/form/input[16]
	//--screen---//input[@id='display']
	public pageElement_calc(WebDriver driver)
	{
		TestBase.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath="//a[contains(text(),'Calculator')]")
	WebElement ele_calc_page;
	
	@FindBy(xpath="//body//input[6]")
	WebElement ele_4digit;
	
	@FindBy(xpath="//body//input[7]")
	WebElement ele_5digit;
	
	@FindBy(xpath="//*[@id=\"container\"]/form/input[13]")
	WebElement ele_multi;
	
	@FindBy(xpath="//*[@id=\"container\"]/form/input[16]")
	WebElement ele_equal;
	
	@FindBy(xpath="//input[@id='display']")
	WebElement ele_output;
	
	public String Into_calculator() throws Exception
	{
		//driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(2000);
		//System.out.println("Current Url"+driver.);
		browserUtility.waitElement(ele_calc_page);
		browser.bt_click(ele_calc_page);
		
		
		browserUtility.waitElement(ele_4digit);
		browser.bt_click(ele_4digit);
		browser.bt_click(ele_5digit);
		browser.bt_click(ele_multi);
		browser.bt_click(ele_5digit);
		browser.bt_click(ele_equal);
		Thread.sleep(2000);
		browserUtility.waitElement(ele_output);
		String result=ele_output.getText();
		//System.out.println("Result="+ele_output.);
		return result;
		
	}

	
}

