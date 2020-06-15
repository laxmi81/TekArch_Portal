package com.Testscript;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pageObjects.Guru99Login;

public class TestGuru99Login {
	WebDriver driver;
	Guru99Login gl;
	@BeforeSuite
	   public void setup(){
	       //use FF Driver
	       driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       gl=new Guru99Login(driver);
	   }
	@Test
	public void checkTextGuruBank()
	{
		
		String title1=gl.getTitle();
		assertEquals(title1, "Guru99 Bankaaa");
		
	}
	@AfterSuite
	public void DriverClose()
	{
		driver.close();
	}
}
