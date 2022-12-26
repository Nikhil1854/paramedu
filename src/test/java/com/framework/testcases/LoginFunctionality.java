package com.framework.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.pages.Accountpage;
import com.framework.pages.LoginPage;
import com.paramedutech.automation.Utility;

public class LoginFunctionality {
	
	WebDriver driver;
	LoginPage loginPage;
	Accountpage accountPage;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		driver=Utility.getDriver();
		loginPage=new LoginPage(driver);
		accountPage=new Accountpage(driver); 
		driver.manage().window().maximize();
		driver.get(Utility.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	
	@Test
	public void verifyValidLogin() throws IOException, InterruptedException
	{
		Reporter.log("Before launched Application");
		loginPage.loginToApplication();
		Reporter.log("Application launched succesfully");
		Utility.scrollIntoView(driver, accountPage.getLogoutLink());
		
	     assertEquals(accountPage.getWebElementText(accountPage.getLogoutLink()),"Logout");
	}
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE) {
			Utility.takesScreenShot(driver,result.getName()+" "+System.currentTimeMillis());
		}
	}
	
}
