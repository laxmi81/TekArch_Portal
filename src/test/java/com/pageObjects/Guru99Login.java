package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login {
	
	private static String PAGE_URL="http://demo.guru99.com/V4/";
	public Guru99Login(WebDriver driver)
	{
		driver.get(PAGE_URL);
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//h2[@class='barone']")
private WebElement title;

public String getTitle()
{
	String t=title.getText();
	return t;
}
}
