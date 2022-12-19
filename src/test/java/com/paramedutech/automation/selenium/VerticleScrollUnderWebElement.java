package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerticleScrollUnderWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@data-dismiss='modal']//img[@alt='close'])[1]")).click();
	    driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
		Thread.sleep(2000);
	    WebElement elm=driver.findElement(By.xpath("//li[@id='gb-tile']//img[@src='/content/dam/airvistara/global/common/images/flag/uk.png']"));
	    
	    Actions actions=new Actions(driver);
	    actions.scrollToElement(elm).perform();
		Thread.sleep(3000);
	    elm.click();
	   
	

}
}