package com.paramedutech.automation.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
// EXPLISIT WAIT-------------	
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
		
// FLUENT WAIT---------------
		
		FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver);
		
		fluentwait.withTimeout(Duration.ofSeconds(4));
		fluentwait.pollingEvery(Duration.ofMillis(5));
		//fluentwait.ignoring(TimeoutException.class);
		fluentwait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alert = driver.switchTo().alert();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		alert.accept();
	}

}
