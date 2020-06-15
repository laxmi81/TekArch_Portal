package com.framework.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class browserUtility {
	
	static Logger log=LogManager.getLogger(browserUtility.class);
	
	
	//public static WebDriver driver=null;
	public static  void lauchBrowser(String browser)
	{
	    log.info("Browser Launching");
		if(browser.toLowerCase().startsWith("ch"))
		{
		WebDriverManager.chromedriver().setup();
		TestBase.driver=new ChromeDriver();
		
		}
		else if(browser.toLowerCase().startsWith("fi"))
		{
			WebDriverManager.firefoxdriver().setup();
			TestBase.driver=new FirefoxDriver();
			
		}
		else if(browser.startsWith("ie"))
		{
			WebDriverManager.iedriver().setup();
			TestBase.driver=new InternetExplorerDriver();
			
		}
		else
		{
			System.out.println("browsernot correct");
		}
		TestBase.driver.manage().window().maximize();
		TestBase.driver.manage().deleteAllCookies();
		//driver.get("http://qa-tekarch.firebaseapp.com/");
		}
		
	public static void waitElement(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(TestBase.driver,50);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void Input_sendkeys(WebElement ele,String KeysToSend)
	{
		ele.sendKeys(KeysToSend);
	}
	public void bt_click(WebElement ele)
	{
		ele.click();
	}
	public static void teardown_driver()
	{
		TestBase.driver.quit();
	}

}
