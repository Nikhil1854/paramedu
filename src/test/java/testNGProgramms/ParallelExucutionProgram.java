package testNGProgramms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.Implementation;

public class ParallelExucutionProgram {
	WebDriver driver;
	@BeforeMethod
	
	public void getDriver()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	
	@Test
	public void amazoneSite()
	{
		driver.get("https://demoqa.com/alerts");
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
