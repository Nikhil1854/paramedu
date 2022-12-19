package com.paramedutech.automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAndMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='course']"));
		Select courses=new Select(dropdown);

           List<WebElement> element1=courses.getOptions();
		for(WebElement e1:element1)
		{
			System.out.println(e1.getText());
		}
		System.out.println(courses.isMultiple());
		courses.selectByIndex(1);
		Thread.sleep(2000);
		//courses.deselectByIndex(1); // deselect method not support single select dropdown
		courses.selectByVisibleText("Python");
		Thread.sleep(2000);
		courses.selectByValue("net");
		courses.selectByIndex(0);
		System.out.println(courses.getFirstSelectedOption().getText());
		List<WebElement> element2=courses.getAllSelectedOptions();
		for(WebElement e2:element2)
		{
				System.out.println(e2.getText());
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		WebElement multiselectdropdown = driver.findElement(By.xpath("//select[@id='ide']"));
		Select ideNames =new Select(multiselectdropdown);
		
		System.out.println(ideNames.isMultiple());
	
		ideNames.selectByIndex(1);
		Thread.sleep(2000);
		ideNames.selectByVisibleText("NetBeans");
		Thread.sleep(2000);
		ideNames.selectByValue("vs");
		Thread.sleep(2000);
		
	//	ideNames.deselectByVisibleText("Visual Studio");
		ideNames.deselectAll();
		
		List<WebElement> deselected=ideNames.getAllSelectedOptions();
		for(WebElement d1:deselected)
		{
			System.out.println(d1.getText()+" ");
		}
		
		
				


	}

}
