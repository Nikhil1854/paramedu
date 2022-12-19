package com.paramedutech.automation.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.paramedutech.automation.Utility;

public class ExcelTestDataUsageInTestCases {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", Utility.getProperty("chromeDriverPath")); // here we use .property
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(String.valueOf(Utility.readExcel().get(0)));
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(String.valueOf(Utility.readExcel().get(1)));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println(Utility.readExcel());
		
	}

}
