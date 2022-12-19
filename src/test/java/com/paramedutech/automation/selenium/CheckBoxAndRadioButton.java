package com.paramedutech.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='radio1']"));
		System.out.println(maleRadioButton.isDisplayed());
		maleRadioButton.click();
		System.out.println(maleRadioButton.isEnabled());
		
		System.out.println(maleRadioButton.isSelected());
		
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='radio2']"));
		System.out.println(femaleRadioButton.isDisplayed());
		System.out.println(femaleRadioButton.isEnabled());
		//femaleRadioButton.click();
		System.out.println(femaleRadioButton.isSelected());
		
		
		WebElement orangeCheckBox=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		orangeCheckBox.click();
		System.out.println(orangeCheckBox.isDisplayed());
		System.out.println(orangeCheckBox.isEnabled());
		System.out.println(orangeCheckBox.isSelected());
		
		WebElement blueCheckBox=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		System.out.println(blueCheckBox.isDisplayed());
		System.out.println(blueCheckBox.isEnabled());
		blueCheckBox.click();
		System.out.println(blueCheckBox.isSelected());
	
		
		WebElement disabledButton=driver.findElement(By.xpath("//button[@id='but1']"));
		System.out.println(disabledButton.isDisplayed());
		System.out.println(disabledButton.isEnabled());
		System.out.println(disabledButton.isSelected());		

	}

}
