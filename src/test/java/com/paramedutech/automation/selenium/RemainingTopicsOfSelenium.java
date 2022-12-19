package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.paramedutech.automation.Utility;

public class RemainingTopicsOfSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
//		
//		// browse file
//		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\nikhil java program\\com.paramedutech.automation\\src\\test\\resources\\Book1.xls");
//		
//		//double click
//		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
//		
//		Actions actions =new Actions(driver);
//		actions.scrollToElement(doubleclickbutton).perform();
//		Thread.sleep(3000);
//		actions.doubleClick(doubleclickbutton).perform();
//		
//		// handle table tada
//		
		System.out.println(Utility.getValueFromTable(driver,"table1","1","3"));
		//System.out.println(Utility.getValueFromTable(driver, "table1", "1", "2"));
		
		
		
		

	}

}
