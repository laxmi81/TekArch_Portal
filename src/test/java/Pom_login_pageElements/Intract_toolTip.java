package Pom_login_pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.utilities.TestBase;
import com.framework.utilities.browserUtility;

public class Intract_toolTip extends TestBase{

	public Intract_toolTip(WebDriver driver)
	{
		TestBase.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	//WebElement inte=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
	@FindBy(xpath="//button[contains(text(),'Intractions')]")
	WebElement ele_intract;
	
	//WebElement tool_1=driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]"));
	@FindBy(xpath="//a[contains(text(),'Tool Tip')]")
	WebElement ele_tool;
	
	//WebElement right_1=driver.findElement(By.xpath("//div[@class='tooltipr']"));
	@FindBy(xpath="//div[@class='tooltipr']")
	WebElement ele_right;
	
	//left----//div[@class='tooltipl']
	@FindBy(xpath="//div[@class='tooltipl']")
	WebElement ele_left;
	
	//WebElement top_1=driver.findElement(By.xpath("//div[@class='tooltipt']"));
	@FindBy(xpath="//div[@class='tooltipt']")
	WebElement ele_top;
	
	//bottom--//div[@class='tooltipb']
	@FindBy(xpath="//div[@class='tooltipb']")
	WebElement ele_bottom;
	
	public void act_on_toolTip() throws Exception
	{
		Thread.sleep(1000);
		browserUtility.waitElement(ele_intract);
		browser.bt_click(ele_intract);
		
		browserUtility.waitElement(ele_tool);
		browser.bt_click(ele_tool);
		
		browserUtility.waitElement(ele_right);
		Actions act=new Actions(driver);
		act.moveToElement(ele_right);
		Thread.sleep(1000);
		act.moveToElement(ele_left);
		Thread.sleep(1000);
		act.moveToElement(ele_top);
		Thread.sleep(1000);
		act.moveToElement(ele_bottom);
		Thread.sleep(1000);
	}
}
