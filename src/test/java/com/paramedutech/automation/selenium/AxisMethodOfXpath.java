package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisMethodOfXpath {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[text()='iPhone']")).click();
			driver.findElement(By.xpath("//button[contains(@class,'g btn' )]")).click();
			driver.findElement(By.xpath("(//a)[2]")).click();
			
			

	}

}
