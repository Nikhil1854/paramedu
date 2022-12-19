package com.paramedutech.automation.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/	");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.open('https://www.flipkart.com/','_blank');");
		
		System.out.println(driver.getTitle());
		
		String parentwindowhandle =driver.getWindowHandle(); // it will return current window handle
		
		Set<String> allWindowHandle =driver.getWindowHandles(); // it will returns set of strings cos all handles are unique
		
		for(String handle:allWindowHandle)
		{
			if(!handle.equals(parentwindowhandle))
			{
				driver.switchTo().window(handle);
			}
		}
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("badminton");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("niks8217@gmail.com");
		Thread.sleep(6000);
		
		driver.close();
		
		driver.switchTo().window(parentwindowhandle);
		WebElement amazoneWindow= driver.findElement(By.xpath("//input[@type='text']"));
		amazoneWindow.sendKeys("Badminton");
		Thread.sleep(6000);
		amazoneWindow.clear();
		Thread.sleep(6000);

		driver.quit();

	}

}
