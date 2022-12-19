package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScroollToViewWithoutJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://maven.apache.org/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Plugins']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@title='Plugins']"))).perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.album.alexflueras.ro/");
		Thread.sleep(3000);
		actions.scrollByAmount(600, 0).perform();
		Thread.sleep(3000);
		actions.scrollByAmount(-600, 0).perform();
		
	    Thread.sleep(5000);
	    driver.close();

	}

}
