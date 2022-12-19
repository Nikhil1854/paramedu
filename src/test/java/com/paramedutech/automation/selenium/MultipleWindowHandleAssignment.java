package com.paramedutech.automation.selenium;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/	");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/G/31/IMG20/Furniture/furniture_node_1/372_232_03_low._SY116_CB605507312_.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/713VTIhCfOL._AC_UL320_.jpg']")).click();
		System.out.println(driver.getTitle());
		
		Set<String> tittle=driver.getWindowHandles();
		
		Iterator<String> iterator=tittle.iterator();
		
		String s1=iterator.next();
		String s2=iterator.next();
		
		driver.switchTo().window(s2);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(s1);
		System.out.println(driver.getTitle());
		
		
		
	

	}

}
