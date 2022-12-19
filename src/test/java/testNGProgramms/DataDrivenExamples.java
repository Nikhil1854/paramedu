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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paramedutech.automation.Utility;

public class DataDrivenExamples {

WebDriver driver;
	
	@BeforeMethod
	public void getWebDriver()
		{
			driver=Utility.getDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.get("https://demo.guru99.com/test/newtours/");
		}
	
	@Test(dataProvider = "loginDP")
	public void verifyValidLogin(String userId , String password)
		{
			
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userId);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			WebElement loginsuccefullymsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
			
			Assert.assertEquals(loginsuccefullymsg.getText(),"Login Successfully"); 
			
		}
	@DataProvider(name="loginDP")
	public String[][] dataProvider() // here 2D string type array is return
	{
		
		String array [][] = {{"admin1","password1"},{"admin2","password2"},{"admin3","password3"}};// 3*2 dimensional array
		
		return array;
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
