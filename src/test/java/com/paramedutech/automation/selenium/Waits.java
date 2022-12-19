package com.paramedutech.automation.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@onclick='setTimeout(myFunction,3000)']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='myDropdown']/a"));
		System.out.println("size="+list.size());
		
	}

}
