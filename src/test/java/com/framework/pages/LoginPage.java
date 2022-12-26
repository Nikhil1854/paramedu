package com.framework.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paramedutech.automation.Utility;

public class LoginPage extends BasePage{
	WebDriver driver;
    WebElement userNameTextBox;
    WebElement passwordTextBox;
    WebElement loginButton;
    
    
	public LoginPage(WebDriver driver) {
		super(driver);
	    this.driver = driver;
	}
	public WebElement getUserNameTextBox() {
		setUserNameTextBox();
		return userNameTextBox;
	}
	public void setUserNameTextBox() {
		userNameTextBox =driver.findElement(By.xpath("//input[@id='input-email']"));
	}
	public WebElement getPasswordTextBox() {
		setPasswordTextBox();
		return passwordTextBox;
	}
	public void setPasswordTextBox() {
		passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
	}
	public WebElement getLoginButton() {
		setLoginButton();
		return loginButton;
	}
	public void setLoginButton() {
		  loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
	}
	
	public void loginToApplication() throws IOException {
		
		clickOnLoginLink();
		getUserNameTextBox().sendKeys(Utility.getProperty("userId"));
		getPasswordTextBox().sendKeys(Utility.getProperty("password"));
		getLoginButton().click();
	}
}
