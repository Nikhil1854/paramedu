package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//before switching to frame we getting text
		WebElement elm1=driver.findElement(By.xpath("//h1[@class]"));
		System.out.println(elm1.getText());
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		//driver.switchTo().frame(frame); // used to switch from web page to frame
	
		driver.findElement(By.xpath("//a[text()='Create Blog']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//driver.findElement(By.xpath("//a[text()='Create Blog']")).click();
		WebElement elm2=driver.findElement(By.xpath("//h1[@class]"));
		System.out.println(elm2.getText());
		
//		
//		driver.switchTo().defaultContent(); // used to switch from frame to web page
//		WebElement elm2=driver.findElement(By.xpath("//h1[@class]"));
//		System.out.println(elm2.getText());
//		driver.findElement(By.xpath("//a[text()='Create Blog']")).click();

		


	}

}
