package testNGProgramms;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.paramedutech.automation.Utility;

public class SoftAssertExamples {

	WebDriver driver;
	SoftAssert softassert;
	
	@BeforeMethod
	public void getWebDriver()
		{
			driver=Utility.getDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/newtours/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			softassert = new SoftAssert();  // we need reference variable before every test case run thats why we declalire here
		}
	
	@Test(priority = 0) // here we set priority to execute first
	public void verifyValidLogin()
		{
			
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			WebElement loginsuccefullymsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
			
			 
			softassert.assertEquals(loginsuccefullymsg.getText(),"Login Successfull");// here TS failed thts why further code is not executed in hard Assert
			System.out.println("verification 1 done");
			softassert.assertNotEquals(loginsuccefullymsg.getText(), "Login Successfull", "Verification failed...."); // if condition is not equal then test case is passed
			System.out.println("verification 2done");
			softassert.assertAll();
		}
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}

	
}
