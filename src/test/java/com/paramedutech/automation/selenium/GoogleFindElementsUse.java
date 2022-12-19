package com.paramedutech.automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFindElementsUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tv");
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul//div[@class='wM6W7d']/span"));
		
		System.out.println("Search result="+list.size());
		
		for(WebElement elm:list)
		{
			System.out.println(elm.getText());
		}

	}

}
