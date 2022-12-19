package com.paramedutech.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.paramedutech.automation.Utility;

public class TestNgAnnotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite is excecute");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test is excecute");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class is excecute");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method is excecute");
	}
	
	
	WebDriver driver;
	@Test
	public void verifyLogin()
	{
		driver=Utility.getDriver();
		driver.get("http://omayo.blogspot.com/");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method is excecute");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class is excecute");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test is excecute");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite is excecute");
	}


}
