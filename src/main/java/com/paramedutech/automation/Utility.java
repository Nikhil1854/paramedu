package com.paramedutech.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	public static void takesScreenShot(WebDriver driver, String filename)// here we pass the webdriver and file name
	{
		TakesScreenshot takesScreenShots = (TakesScreenshot) driver; // here we type cast diver bcos we cant create	// object of Interface(TakesScreenshot)// here ss is created in the file format and file
		File file = takesScreenShots.getScreenshotAs(OutputType.FILE); 
																		
		

		try {
			FileUtils.copyFile(file, new File("src/test/resources/ScreenShots" + filename + ".png")); // for copy file// copy paste in to another location we create // folder in src/test/resources bcos we dont
		

			
																																																	// class and
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}			
	
	
	public static String getProperty(String key) throws IOException {
		File file = new File("src/test/resources/Test.Properties"); // here we represent file and pass the path of
																	// Test.Properties

		FileInputStream fileinputstream = new FileInputStream(file); // here we connect file to input stream for reading

		Properties properties = new Properties();

		properties.load(fileinputstream); // load(input stream in strem)file load into properties class

		return properties.getProperty(key); // getproperty(String key) here key returmn value (url or chrome driver
											// path) thats why we use return keyword and replace void with String

	}	

	
	// if your excel is type xlsx you have replace HSSF with XSSF
	
	public static List<Object> readExcel() throws IOException { 
		List<Object> list = new ArrayList<Object>();
		File file = new File("src/test/resources/Book1.xls");
		FileInputStream fileInputStream = new FileInputStream(file);
		

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);

		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

		int lastRowNum = hssfSheet.getLastRowNum();

		for (int i = 1; i <= lastRowNum; i++)
		{
			HSSFRow row = hssfSheet.getRow(i);
			int lastCellNum = row.getLastCellNum();
			for (int j = 0; j < lastCellNum; j++) {
				if (row.getCell(j).getCellType().equals(CellType.STRING)) {
					list.add(row.getCell(j).getStringCellValue());
				}

				if (row.getCell(j).getCellType().equals(CellType.NUMERIC)) {
					list.add((int) row.getCell(j).getNumericCellValue());
				}
			}
		}
		hssfWorkbook.close();
		return list;
	}

//		public static List<Object> readExel() throws IOException
//		{
//			List<Object> list =new ArrayList();
//			
//			
//			File file= new File("src/test/resources/Book1.xls");
//			FileInputStream fileInputStream = new FileInputStream(file);
//			HSSFWorkbook hssfWorkBook = new HSSFWorkbook(fileInputStream); // we take cinput stream constuctor
//			HSSFSheet hssfSheet = hssfWorkBook.getSheetAt(0);
//			
//			int rows = hssfSheet.getLastRowNum();
//			int cols = hssfSheet.getRow(1).getLastCellNum();
//			
//			for(int i=1;i<=rows;i++)
//			{
//				HSSFRow row = hssfSheet.getRow(i);
//				
//				for(int j=0;j<cols;j++)
//				{
//					HSSFCell cell = row.getCell(j);
//					
//					switch(cell.getCellType())
//					{
//					 case STRING : list.add((cell.getStringCellValue())); break;
//					 case NUMERIC: list.add(((int)cell.getNumericCellValue()));break;
//					 default:
//					 break;
//					}
//				}
//				
//			} 
//			
//			hssfWorkBook.close();
//			return list;
	
	public static String getValueFromTable(WebDriver driver, String id, String rowIndex, String tdIndex) {
		return driver.findElement(By.xpath("//table[@id='"+id+"']//tbody//tr["+rowIndex+"]/td["+tdIndex+"]"))
				.getText();
	}	
	
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void waitForElementToBeClickable(WebElement element ,WebDriver driver ,long time) {
		 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	}

