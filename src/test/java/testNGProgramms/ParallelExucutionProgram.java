package testNGProgramms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExucutionProgram {
	WebDriver driver;
	@BeforeMethod
	
	public void getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void amazoneSite()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void zerodaSite()
	{
		driver.get("https://kite.zerodha.com/");
	}
	
	@Test
	public void mavenSite()
	{
		driver.get("https://maven.apache.org/");
	}
	
	@Test
	public void testngSite()
	{
		driver.get("https://testng.org/doc/");
	}
	

	
}
