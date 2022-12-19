package com.paramedutech.automation.selenium;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNewWindowMethodMultipleWindoeOpen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/	");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB); // OPEN WINDOW IN NEW TAB
		
		 driver.get("https://kite.zerodha.com/");
		 System.out.println(driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.TAB); // OPEN WINDOW IN NEW TAB
		
		driver.get("https://maven.apache.org/");
		System.out.println(driver.getTitle());
		
		
		Set <String> set=  driver.getWindowHandles();
		
		Iterator<String> iterator=set.iterator();
		
		
		String s1=iterator.next();
		String s2=iterator.next();
		String s3=iterator.next();
		
		driver.close();
		driver.switchTo().window(s2);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(s1);
		System.out.println(driver.getTitle());
		
		
		

		
		
		
		
	   
//		driver.navigate().to("https://maven.apache.org/"); // OPEN WINDOW WITHIN A SAME TAB
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);  //OPEN WINDOW IN ANOTHER BROWSER
//		
//		driver.get("https://testng.org/doc/");
//		System.out.println(driver.getTitle());

	}

}
