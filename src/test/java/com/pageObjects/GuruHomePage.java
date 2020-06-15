package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruHomePage {
	
public WebDriver driver;
//--Guru99 Bank
@FindBy(linkText="Guru99 Bank");
WebElement title;

}
