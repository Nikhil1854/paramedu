package com.framework.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.paramedutech.automation.Utility;

public class LoginFunctionality {

	LoginPage loginpage;
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=Utility.getDriver();
		loginpage=new LoginPage(driver);
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test
	public void verifyValidLogin()
	{
		loginpage.loginToApplication();
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	
}
