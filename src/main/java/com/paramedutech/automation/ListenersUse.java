package com.paramedutech.automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersUse implements ITestListener{
	

    		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

  		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

  		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	Reporter.log("test case is failed " +"-"+arg0.getName());
        		
    }		

    		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

  		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

  		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	Reporter.log("Test case is passed" +"-" +arg0.getName());
        		
    }
}


