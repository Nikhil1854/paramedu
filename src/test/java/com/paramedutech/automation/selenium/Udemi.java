package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Udemi {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/course/selenium-automation-architect-tutorials/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ud-heading-sm udlite-heading-sm' and text()='Software Testing']")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//span[text()='Topic']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//label[text()='API Testing']")).click();
				
		
//		WebElement element=driver.findElement(By.xpath("//span[text()='Topic']"));
//		
//		Select topic=new Select(element); 
//		System.out.println(topic.isMultiple());
//		topic.selectByVisibleText("//label[text()='API Testing']");
//		
//		

	}

}
