package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountpage extends BasePage{

	WebDriver driver ;
	WebElement logoutLink;
	
	public Accountpage(WebDriver driver) {
		super(driver);
		this.driver =driver;
	}

	public WebElement getLogoutLink() {
		
		setLogoutLink();
		return logoutLink;
	}

	public void setLogoutLink() {
	    this.logoutLink = driver.findElement(By.xpath("//a[text()='Newsletter']//following-sibling::a"));
	}
	
	
}
