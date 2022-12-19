package com.paramedutech.automation.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paramedutech.automation.Utility;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", Utility.getProperty("chromeDriverPath"));
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		
		Utility.takesScreenShot(driver, "google_home_Page"+System.currentTimeMillis()); // it returns screenshot timing to differentiate
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tv");
		Thread.sleep(2000);
		
		Utility.takesScreenShot(driver,"search_result"+System.currentTimeMillis());
		List<WebElement> list=driver.findElements(By.xpath("//ul//div[@class='wM6W7d']/span"));
		
		System.out.println("Search result="+list.size());
		
		for(WebElement elm:list)
		{
			System.out.println(elm.getText());
		}

	}


	}


