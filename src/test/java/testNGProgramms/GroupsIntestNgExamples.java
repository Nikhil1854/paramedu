package testNGProgramms;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.paramedutech.automation.ListenersUse;
//@Listeners(ListenersUse.class)
public class GroupsIntestNgExamples {

	@Test(groups = {"smoke"})
	public void method1()
	{
		System.out.println("method of smoke is executed");
	}
	
	@Test(groups = {"sanity"})
	public void method2()
	{
		System.out.println("method of sanity is executed");
	
	}
	
	@Test(groups = {"smoke","regression"})
	public void method3()
	{
		System.out.println("method of smoke and regression is executed");
	
		assertTrue(true);  // here we intentionaly failed the test cast to cheque listeners log reports
		
		Reporter.log("Test case is passed--------" );
	}
	
	@Test(groups = {"smoke"})
	public void method4()
	{
		System.out.println("method of smoke is executed");
		Reporter.log("passed----------");
	}
	
	@Test(groups = {"smoke"})
	public void method5()
	{
		System.out.println("method of smoke is executed");
	}
	
	
	@Test(groups = {"sanity"})
	public void method6()
	{
		System.out.println("method of sanity is executed");
	}
	
}
