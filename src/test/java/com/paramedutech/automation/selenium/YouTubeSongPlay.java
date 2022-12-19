package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSongPlay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@autocapitalize='none']")).sendKeys("i am unstoppable");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']//ancestor::button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		WebElement play=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and text()='Sia - Unstoppable (Official Video - Live from the Nostalgic For The Present Tour)']"));
		play.click();
		
		

	}

}
