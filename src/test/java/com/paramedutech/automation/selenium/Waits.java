package com.paramedutech.automation.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tv");
		
		
// IMPLICIT WAIT---------------250 mili seconds
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//EXPLICITE WAIT---------------500 mili seconds
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(21));
//	    wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul//div[@class='wM6W7d']/span"))));
// FLUENT WAIT---------------------------	
	FluentWait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver);
	    fluentwait.withTimeout(Duration.ofSeconds(2));
		fluentwait.pollingEvery(Duration.ofMillis(2));
	//	fluentwait.ignoring(TimeoutException.class);
     	fluentwait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul//div[@class='wM6W7d']/span"))));
		
		
		List<WebElement> list= driver.findElements(By.xpath("//ul//div[@class='wM6W7d']/span"));
		

		System.out.println("Search result= "+list.size());
		
		for(WebElement elm:list)
		{
			System.out.println(elm.getText());
		}

	}


}
