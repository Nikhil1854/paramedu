package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xxxxxxxxxxx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul[starts-with(@class,'drop')]//li//a[contains(@href,'login')]")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("niks@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("wadikar");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement elemnet=driver.findElement(By.xpath("//a[text()='Newsletter']//following-sibling::a"));
		System.out.println(elemnet.getText());
		
		
}
}