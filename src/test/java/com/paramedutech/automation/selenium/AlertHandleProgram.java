package com.paramedutech.automation.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("8217");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		Thread.sleep(3000);

		alert.dismiss();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).clear();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1122");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		
		alert1.accept();
		Thread.sleep(3000);
		
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(3000);
		
		//alert.dismiss();
		alert2.accept();

	}

}
