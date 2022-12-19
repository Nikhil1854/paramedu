package com.paramedutech.automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUnderNotSelectTag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airvistara.com/in/en");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='modal-title close close-visiblity col-xs-2 domain-close']//img[contains(@src,'close-icon-grey.png')]")).click();
	
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		
		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow-purple.png')]")).click();
		
		List <WebElement> counties=driver.findElements(By.xpath("//ul[@id='country-scroll']//li//img"));
		
		
		System.out.println(counties.size());
		for(WebElement elm:counties)
		{
			if(elm.getAttribute("src").contains("uk"))
			{
				elm.click();
				break;
			}
		}
		
		
	}

}
