package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticleHorizontalMove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		//driver.findElement(By.xpath("(//span[@class='feed-scrollbar'])[1]"))
//		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
//		javascriptexecutor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[contains(@href,'on.jo')]")));
//		
//		javascriptexecutor.executeScript("window.scrollBy(0,500)","");
//		Thread.sleep(5000);
//		javascriptexecutor.executeScript("window.scrollBy(0,-400)","");
//		
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("(//span[@class='feed-scrollbar'])[1]")));
		Thread.sleep(3000);
		javascriptexecutor.executeScript("window.scrollBy(500,0)","");
//		Thread.sleep(3000);
//		javascriptexecutor.executeScript("window.scrollBy(-500,0)","");
	}
	

}
