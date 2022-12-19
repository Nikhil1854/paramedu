package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStratergyClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		driver.findElements(By.tagName("input")).get(2).sendKeys("Nikhil");
		
		driver.findElement(By.linkText("Laptops & Notebooks")).click();
	//	driver.findElement(By.partialLinkText("Notebooks")).click();
		
		driver.findElement(By.id("wishlist-total")).click();  
		
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.cssSelector("a#wishlist-total")).click();
		driver.findElement(By.xpath("//*[@name='email' and @class='form-control']")).sendKeys("niks8217@gmail.com");
		
		
	}

}
