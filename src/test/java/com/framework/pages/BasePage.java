package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paramedutech.automation.Utility;

public class BasePage {
	
	WebDriver driver;
	WebElement shoppingCartLink;
	WebElement chechOutLink;
	WebElement myAccountLink;
	WebElement loginLink; 
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getShoppingCart() {
		setShoppingCart();
		return shoppingCartLink;
	}

	public void setShoppingCart() {
		shoppingCartLink =driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
	}

	public WebElement getChechOutLink() {
		setChechOutLink();
		return chechOutLink;
	}

	public void setChechOutLink() {
		chechOutLink =driver.findElement(By.xpath("//span[text()='Checkout']"));
	}
	
	public WebElement getMyAccountLink() {
		setMyAccountLink();
		return myAccountLink;
	}

	public void setMyAccountLink() {
		myAccountLink = driver.findElement(By.xpath("//span[text()='My Account']"));
	}

	public WebElement getLoginLink() {
		setLoginLink();
		return loginLink;
	}

	public void setLoginLink() {
		loginLink = driver.findElement(By.xpath("//ul[starts-with(@class,'drop')]//li//a[contains(@href,'login')]"));
	}

	public void clickOnShoppingCart() {
		getShoppingCart().click() ;  // when we have to use shoping cart repetedly we write click method in this page
		 
	}
	
	public void clickOnLoginLink() {
		
		getMyAccountLink().click();
		Utility.waitForElementToBeClickable(getLoginLink(), driver,3);
		getLoginLink().click();
	}
	
}
